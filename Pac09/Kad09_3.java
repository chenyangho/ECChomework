//*********************************
//  課題名: Kad09_3
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/27
//*********************************

import java.util.*;

class Kad09_3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("円の面積と円周を求めます。");
		System.out.print("半径の長さを入力してください[m]：");
		try{
			double side = sc.nextDouble();
			Circle circle = new Circle(side);
			System.out.println("円の面積：" + circle.getArea() + "�u");
			System.out.println("円の円周：" + circle.getRound() + "ｍ");
		}catch(InputMismatchException e){
			System.out.println("入力値が不正です。");
		}
	}
}