//*********************************
//  課題名: Kad08_2
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/22
//*********************************

import java.util.*;

class Kad08_2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Calculate calc = new Calculate();
		double[] db = new double[3]; 
		try{
			for(int i = 0; i < 3; i++){
				System.out.print("実数" + ( i + 1 ) + " を入力：");
				db[i] =  Double.parseDouble(sc.next());
			}
			System.out.println("\n実数 1+2 の平均値：" + calc.getAverage(db[0],db[1]));
			System.out.println("実数 1+2+3 の平均値：" + calc.getAverage(db[0],db[1],db[2]));
		}catch(NumberFormatException e){
			System.out.println("入力値が不正です。");
		}
		
	}
}