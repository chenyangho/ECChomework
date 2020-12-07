//*********************************
//  課題名: Kad03_1
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/05
//*********************************

class Bank{
	
	int balance = 1000;
	void showBalance(){
		System.out.println("残高：" + balance + " 円\n");
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