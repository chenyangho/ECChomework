//*********************************
//  �ۑ薼: Kad03_2
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/05
//*********************************
import java.util.*;
class Kad03_2{
	public static void main(String[] args){
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		int money;
		System.out.println("*** ECC ��s ***\n");
		try{
			System.out.print("���~�a����܂����H�F");
			bank.deposit(sc.nextInt());
			bank.showBalance();
			
			System.out.print("���~���o���܂����H�F");
			money = sc.nextInt();
			if(bank.checkBalance(money) == true){
				bank.drawer(money);
			}else{
				System.out.println("�c��������܂���B");
			}
			bank.showBalance();
			
		}catch(InputMismatchException e){
			System.out.println("���͒l���s���ł��B");
		}
	}
}