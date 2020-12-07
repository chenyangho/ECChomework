//*********************************
//  課題名: Kad07_1
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/20
//*********************************

import java.util.*;

class Kad07_1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Card card = new Card("孫悟天",17,"ノーマル");
		card.showInfo();
		System.out.print("\n購入金額：");
		try{
			int point = card.ascValue(sc.nextInt());
			card.addPoint(point);
			card.showInfo();
		}catch(InputMismatchException e){
			System.out.println("入力値が不正です。");
		}
		
	}
}