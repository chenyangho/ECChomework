//*********************************
//  �ۑ薼: Kad08_2
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/22
//*********************************

import java.util.*;

class Kad08_2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Calculate calc = new Calculate();
		double[] db = new double[3]; 
		try{
			for(int i = 0; i < 3; i++){
				System.out.print("����" + ( i + 1 ) + " ����́F");
				db[i] =  Double.parseDouble(sc.next());
			}
			System.out.println("\n���� 1+2 �̕��ϒl�F" + calc.getAverage(db[0],db[1]));
			System.out.println("���� 1+2+3 �̕��ϒl�F" + calc.getAverage(db[0],db[1],db[2]));
		}catch(NumberFormatException e){
			System.out.println("���͒l���s���ł��B");
		}
		
	}
}