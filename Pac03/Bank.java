//*********************************
//  �ۑ薼: Kad03_1
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/05
//*********************************

class Bank{
	
	int balance = 1000;
	void showBalance(){
		System.out.println("�c���F" + balance + " �~\n");
	}
	
	void deposit(int money){
		balance += money;
	}
	
	void drawer(int money){
		balance -= money;
	}
	
	boolean checkBalance(int money){
		if(money <= balance){
			return true;
		}
		return false;
	}
}