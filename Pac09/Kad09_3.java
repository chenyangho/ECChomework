//*********************************
//  �ۑ薼: Kad09_3
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/27
//*********************************

import java.util.*;

class Kad09_3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�~�̖ʐςƉ~�������߂܂��B");
		System.out.print("���a�̒�������͂��Ă�������[m]�F");
		try{
			double side = sc.nextDouble();
			Circle circle = new Circle(side);
			System.out.println("�~�̖ʐρF" + circle.getArea() + "�u");
			System.out.println("�~�̉~���F" + circle.getRound() + "��");
		}catch(InputMismatchException e){
			System.out.println("���͒l���s���ł��B");
		}
	}
}