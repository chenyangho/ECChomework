//*********************************
//  課題名: Kad08_1
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/22
//*********************************

import java.util.*;

class Kad08_1{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Calculate calc = new Calculate();
		
		System.out.println("＜実行結果＞");
		
		try{
			System.out.print("整数 1 を入力：");
			int num1 = Integer.parseInt(sc.next());
			System.out.print("整数 2 を入力：");
			int num2 = Integer.parseInt(sc.next());
			System.out.println("結果：" + calc.add(num1,num2));
		}catch(NumberFormatException e){
			System.out.println("入力値が不正です。");
		}
		
		System.out.print("\n文字列 1 を入力：");
		String str1 = sc.next();
		System.out.print("文字列 2 を入力：");
		String str2 = sc.next();
		System.out.println("結果：" + calc.add(str1,str2));
		
	}
}