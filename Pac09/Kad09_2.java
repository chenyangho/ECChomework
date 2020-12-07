//*********************************
//  課題名: Kad09_2
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/27
//*********************************

import java.util.*;

class Kad09_2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("正方形と正三角形の面積を求めます。");
		System.out.print("一辺の長さを入力してください[m]：");
		try{
			double side = sc.nextDouble();
			Square square = new Square(side);
			Triangle triangle = new Triangle(side);
			System.out.println("正方形の面積：" + square.getArea() + "㎡");
			System.out.println("正三角形の面積：" + triangle.getArea() + "㎡");
		}catch(InputMismatchException e){
			System.out.println("入力値が不正です。");
		}
	}
}