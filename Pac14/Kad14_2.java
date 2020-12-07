//*********************************
//  ‰Û‘è–¼: Kad14_2
//  ƒNƒ‰ƒX: SE1A
//  ì¬Ò: ’Âö˜a 
//  ì¬“ú: 2020/11/17
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