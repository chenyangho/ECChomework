//*********************************
//  �ۑ薼: Kad07_3
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/20
//*********************************

import java.util.*;

class Kad07_3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		GoldCard goldcard = new GoldCard("�����",47);
		goldcard.showInfo();
		System.out.print("\n�w�����z�F");
		try{
			goldcard.addPoint(goldcard.ascValue(goldcard.discount(sc.nextInt())));
			goldcard.showInfo();
		}catch(InputMismatchException e){
			System.out.println("���͒l���s���ł��B");
		}
		
	}
}