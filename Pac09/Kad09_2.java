//*********************************
//  �ۑ薼: Kad09_2
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/27
//*********************************

import java.util.*;

class Kad09_2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�����`�Ɛ��O�p�`�̖ʐς����߂܂��B");
		System.out.print("��ӂ̒�������͂��Ă�������[m]�F");
		try{
			double side = sc.nextDouble();
			Square square = new Square(side);
			Triangle triangle = new Triangle(side);
			System.out.println("�����`�̖ʐρF" + square.getArea() + "�u");
			System.out.println("���O�p�`�̖ʐρF" + triangle.getArea() + "�u");
		}catch(InputMismatchException e){
			System.out.println("���͒l���s���ł��B");
		}
	}
}