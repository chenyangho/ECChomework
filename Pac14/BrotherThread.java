//*********************************
//  �ۑ薼: Kad14_2
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/11/17
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
		final String[] NAMES = {"�Z", "��"};
		System.out.println(NAMES[brotherIndex] + "�uSwitch �����ׂ�" + MONEYS[brotherIndex] + "�~�������邼�I�v");
		while(true){
			try{
				if(sav.getSavings() >= TARGET){
					System.out.println(NAMES[brotherIndex] + "�u�ڕW�B�����I�v");
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