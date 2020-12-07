//*********************************
//  課題名: Kad14_1
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/11/17
//*********************************

class ThreadA extends Thread{
	@Override	
	public void run(){
		for(int i = 1; i <= 10; i++){
			System.out.println("スレッド A：" + i);
			try{
				Thread.sleep(500); //引数は停止するミリ秒
			}catch(InterruptedException ie){
				System.out.println(ie);
			}
		}
		System.out.println("スレッド A:終了");
	}
}