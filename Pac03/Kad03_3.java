//*********************************
//  �ۑ薼: Kad03_3
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/05
//*********************************
import java.util.*;
class Kad03_3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		int select = -1;
		int money;
		System.out.println("*** ECC ��s ***\n");
		while(select != 3){
			try{
				System.out.println("--- MENU ---");
				System.out.println("1:�a����\n2:���o��\n3:�I��");
				select = sc.nextInt();
				switch(select){
					
					case 1:
						System.out.print("���~�a����܂����H�F");
						bank.deposit(sc.nextInt());
						bank.showBalance();
						break;
						
					case 2:
						System.out.print("���~���o���܂����H�F");
						money = sc.nextInt();
						if(bank.checkBalance(money) == true){
							bank.drawer(money);
							bank.showBalance();
						}else{
							System.out.println("�c��������܂���B");
							bank.showBalance();
						}
						break;
						
					case 3:
						System.out.println("�I�����܂��B\n");
						break;
						
					default:
						System.out.println("���̔ԍ��͑��݂��܂���B\n");
						break;
				}
			}catch(InputMismatchException e){
				System.out.println("���͒l���s���ł��B\n");
				sc.next();
			}
		}
	}
}