//*********************************
//  課題名: Kad03_3
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/05
//*********************************
import java.util.*;
class Kad03_3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		int select = -1;
		int money;
		System.out.println("*** ECC 銀行 ***\n");
		while(select != 3){
			try{
				System.out.println("--- MENU ---");
				System.out.println("1:預入れ\n2:引出し\n3:終了");
				select = sc.nextInt();
				switch(select){
					
					case 1:
						System.out.print("何円預入れますか？：");
						bank.deposit(sc.nextInt());
						bank.showBalance();
						break;
						
					case 2:
						System.out.print("何円引出しますか？：");
						money = sc.nextInt();
						if(bank.checkBalance(money) == true){
							bank.drawer(money);
							bank.showBalance();
						}else{
							System.out.println("残高が足りません。");
							bank.showBalance();
						}
						break;
						
					case 3:
						System.out.println("終了します。\n");
						break;
						
					default:
						System.out.println("その番号は存在しません。\n");
						break;
				}
			}catch(InputMismatchException e){
				System.out.println("入力値が不正です。\n");
				sc.next();
			}
		}
	}
}