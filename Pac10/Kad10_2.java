//*********************************
//  �ۑ薼: Kad10_2
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/29
//*********************************

import java.util.*;

class Kad10_2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Radio radio = new Radio();
		System.out.println("���W�I�𑀍삵�܂��B");
		int input = -1;
		boolean check;
		while(input != 0){
			try{
				check = radio.isPower();
				System.out.print("�I��=0 �d�� ON/OFF=1�F");
				input = sc.nextInt();
				if(input == 1 && check == true){
					radio.powerOff();
					System.out.println("�d��OFF");
				}else if(input == 1 && check == false){
					radio.powerOn();
					System.out.println("�d��ON");
				}
			}catch(InputMismatchException e){
				System.out.println("���͒l���s���ł��B");
				sc.next();
			}
		}
		System.out.println("�I�����܂��B");
	}
}