//*********************************
//  �ۑ薼: Kad08_3
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/22
//*********************************

import java.util.*;

class Kad08_3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Calculate calc = new Calculate();
		Random rd = new Random();
		
		int inCount = rd.nextInt(3) + 2;
		int[] inNums = new int[inCount];
		System.out.println( inCount + " �񐮐�����͂��Đς����߂܂��B");
		try{
			for(int i = 0; i < inCount; i++){
				System.out.print("����" + (i + 1) + "����́F");
				inNums[i] = sc.nextInt();
			}
			switch(inCount){
				case 2:
					System.out.println("�ρF" + calc.mul(inNums[0],inNums[1]));
					break;
				case 3:
					System.out.println("�ρF" + calc.mul(inNums[0],inNums[1],inNums[2]));
					break;
				case 4:
					System.out.println("�ρF" + calc.mul(inNums[0],inNums[1],inNums[2],inNums[3]));
					break;
			}
		}catch(InputMismatchException e){
			System.out.println("���͒l���s���ł��B");
		}
	}
}
