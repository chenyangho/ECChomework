//*********************************
//  �ۑ薼: Kad07_1
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/20
//*********************************

import java.util.*;

class Kad07_1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Card card = new Card("����V",17,"�m�[�}��");
		card.showInfo();
		System.out.print("\n�w�����z�F");
		try{
			int point = card.ascValue(sc.nextInt());
			card.addPoint(point);
			card.showInfo();
		}catch(InputMismatchException e){
			System.out.println("���͒l���s���ł��B");
		}
		
	}
}