//*********************************
//  �ۑ薼: Kad07_2
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/20
//*********************************

import java.util.*;

class Kad07_2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		SilverCard silvercard = new SilverCard("�����",27);
		silvercard.showInfo();
		System.out.print("\n�w�����z�F");
		try{
			silvercard.addPoint(silvercard.ascValue(sc.nextInt()));
			silvercard.showInfo();
		}catch(InputMismatchException e){
			System.out.println("���͒l���s���ł��B");
		}
		
	}
}