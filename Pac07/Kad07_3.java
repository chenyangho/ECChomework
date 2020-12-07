//*********************************
//  課題名: Kad07_3
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/20
//*********************************

import java.util.*;

class Kad07_3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		GoldCard goldcard = new GoldCard("孫悟空",47);
		goldcard.showInfo();
		System.out.print("\n購入金額：");
		try{
			goldcard.addPoint(goldcard.ascValue(goldcard.discount(sc.nextInt())));
			goldcard.showInfo();
		}catch(InputMismatchException e){
			System.out.println("入力値が不正です。");
		}
		
	}
}