//*********************************
//  課題名: Kad08_3
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/22
//*********************************

import java.util.*;

class Kad08_3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Calculate calc = new Calculate();
		Random rd = new Random();
		
		int inCount = rd.nextInt(3) + 2;
		int[] inNums = new int[inCount];
		System.out.println( inCount + " 回整数を入力して積を求めます。");
		try{
			for(int i = 0; i < inCount; i++){
				System.out.print("整数" + (i + 1) + "を入力：");
				inNums[i] = sc.nextInt();
			}
			switch(inCount){
				case 2:
					System.out.println("積：" + calc.mul(inNums[0],inNums[1]));
					break;
				case 3:
					System.out.println("積：" + calc.mul(inNums[0],inNums[1],inNums[2]));
					break;
				case 4:
					System.out.println("積：" + calc.mul(inNums[0],inNums[1],inNums[2],inNums[3]));
					break;
			}
		}catch(InputMismatchException e){
			System.out.println("入力値が不正です。");
		}
	}
}
