//*********************************
//  課題名: Kad14_1
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/11/17
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