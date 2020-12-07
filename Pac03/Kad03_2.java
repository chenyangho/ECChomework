//*********************************
//  課題名: Kad03_2
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/05
//*********************************
import java.util.*;
class Kad03_2{
	public static void main(String[] args){
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		int money;
		System.out.println("*** ECC 銀行 ***\n");
		try{
			System.out.print("何円預入れますか？：");
			bank.deposit(sc.nextInt());
			bank.showBalance();
			
			System.out.print("何円引出しますか？：");
			money = sc.nextInt();
			if(bank.checkBalance(money) == true){
				bank.drawer(money);
			}else{
				System.out.println("残高が足りません。");
			}
			bank.showBalance();
			
		}catch(InputMismatchException e){
			System.out.println("入力値が不正です。");
		}
	}
}