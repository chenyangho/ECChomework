//*********************************
//  �ۑ薼: Kad14_2
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/11/17
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