//*********************************
//  �ۑ薼: Kad14_1
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/11/17
//*********************************

class Kad14_1{
	public static void main(String[] args){
		Thread threadA = new ThreadA();
		Runnable r = new ThreadB();
		Thread threadB = new Thread(r);
		threadA.start();
		threadB.start();
	}
}