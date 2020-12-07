//*********************************
//  課題名: Kad07_2
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/20
//*********************************

import java.util.*;

class Kad07_2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		SilverCard silvercard = new SilverCard("孫悟飯",27);
		silvercard.showInfo();
		System.out.print("\n購入金額：");
		try{
			silvercard.addPoint(silvercard.ascValue(sc.nextInt()));
			silvercard.showInfo();
		}catch(InputMismatchException e){
			System.out.println("入力値が不正です。");
		}
		
	}
}