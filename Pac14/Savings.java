//*********************************
//  �ۑ薼: Kad14_2
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/11/17
//*********************************

class Savings{
	private int savings = 0;
	
	public synchronized void saveMoney(int money, String name){
		this.savings += money;
		System.out.println(name + "���������܂����B�����z�F" + getSavings() + "�~");
	}
	
	public int getSavings(){
		return this.savings;
	}
}