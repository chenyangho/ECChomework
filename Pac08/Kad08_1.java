//*********************************
//  �ۑ薼: Kad08_1
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/22
//*********************************

import java.util.*;

class Kad08_1{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Calculate calc = new Calculate();
		
		System.out.println("�����s���ʁ�");
		
		try{
			System.out.print("���� 1 ����́F");
			int num1 = Integer.parseInt(sc.next());
			System.out.print("���� 2 ����́F");
			int num2 = Integer.parseInt(sc.next());
			System.out.println("���ʁF" + calc.add(num1,num2));
		}catch(NumberFormatException e){
			System.out.println("���͒l���s���ł��B");
		}
		
		System.out.print("\n������ 1 ����́F");
		String str1 = sc.next();
		System.out.print("������ 2 ����́F");
		String str2 = sc.next();
		System.out.println("���ʁF" + calc.add(str1,str2));
		
	}
}