//*********************************
//  ‰Û‘è–¼: Kad14_1
//  ƒNƒ‰ƒX: SE1A
//  ì¬Ò: ’Âö˜a 
//  ì¬“ú: 2020/11/17
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