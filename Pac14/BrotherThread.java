//*********************************
//  課題名: Kad14_2
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/11/17
//*********************************

class BrotherThread extends Thread{
	private Saving sav;
	private int brotherIndex;
	
	BrotherThread(Saving savings, int brotherIndex){
		sav = savings;
		this.brotherIndex = brotherIndex;
	}
	
	@Override
	public void run(){
		final int TARGET = 30000;
		final int[] MONEYS = {4000, 2000};
		final String[] NAMES = {"兄", "弟"};
		System.out.println(NAMES[brotherIndex] + "「Switch 買う為に" + MONEYS[brotherIndex] + "円貯金するぞ！」");
		while(true){
			try{
				if(sav.getSavings() >= TARGET){
					System.out.println(NAMES[brotherIndex] + "「目標達成だ！」");
					break;
				}
				sav.saveMoney(MONEYS[brotherIndex], NAMES[brotherIndex]);
				sleep(100);
			}catch(InterruptedException ie){
				System.out.println(ie);
			}
		}
	}
}