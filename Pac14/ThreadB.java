//*********************************
//  �ۑ薼: Kad14_1
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/11/17
//*********************************

class ThreadB extends Thread implements Runnable{
	@Override
	public void run(){
		for(int i = 1; i <= 10; i++){
			System.out.println("�X���b�h B�F" + i);
			try{
				Thread.sleep(500); //�����͒�~����~���b
			}catch(InterruptedException ie){
				System.out.println(ie);
			}
		}
		System.out.println("�X���b�h B:�I��");
	}
}