//*********************************
//  課題名: Kad09_1
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/27
//*********************************

import java.util.*;

class Kad09_1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("正方形の面積を求めます。");
		System.out.print("一辺の長さを入力してください[m]：");
		try{
			Square square = new Square(sc.nextDouble());
			System.out.println("正方形の面積：" + square.getArea() + "㎡");
		}catch(InputMismatchException e){
			System.out.println("入力値が不正です。");
		}
	}
}