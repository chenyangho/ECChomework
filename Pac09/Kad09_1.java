//*********************************
//  �ۑ薼: Kad09_1
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/27
//*********************************

import java.util.*;

class Kad09_1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�����`�̖ʐς����߂܂��B");
		System.out.print("��ӂ̒�������͂��Ă�������[m]�F");
		try{
			Square square = new Square(sc.nextDouble());
			System.out.println("�����`�̖ʐρF" + square.getArea() + "�u");
		}catch(InputMismatchException e){
			System.out.println("���͒l���s���ł��B");
		}
	}
}