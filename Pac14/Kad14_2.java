//*********************************
//  課題名: Kad14_2
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/11/17
//*********************************

class Kad14_2{
	public static void main(String[] args){
		Savings saving = new Savings();
		BrotherThread olderThread = new BrotherThread(saving, 0);
		BrotherThread youngerThread = new BrotherThread(saving, 1);
		olderThread.start();
		youngerThread.start();
	}
}