//*********************************
//  �ۑ薼: Kad12_1
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/11/10
//*********************************

//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.Collections;
import java.util.*;

class Kad12_1{
	public static void main(String[] args){
		
		Scanner sc =  new Scanner(System.in);
		ArrayList<String> countryList = new ArrayList<String>(); 
		int input = -1;
		System.out.println("�����s���ʁ�\nArrayList �ō������X�g�����܂��B");
		
		while(input != 0){
			try{
				System.out.print("�I��=0 �ǉ�=1 �\��=2 ���ёւ�=3 �폜=4 �S���폜=5 --->");
				input = sc.nextInt();
				if(input >= 0 && input <= 5){
					switch(input){
						case 1:
							System.out.print("�ǉ����鍑���F");
							countryList.add(sc.next());
							break;
						case 2:
							for(String a : countryList){
								System.out.println(a);
							}
							break;
						case 3:
							System.out.println("�����ɕ��ёւ��܂����B");
							Collections.sort(countryList);
							break;
						case 4:
							System.out.print("�폜���鍑���F");
							countryList.remove(sc.next());
							System.out.print("�폜����\n");
							break;
						case 5:
							System.out.println("�S���폜���܂����B");
							countryList.removeAll(countryList);
							break;
					}
				}else{
					System.out.println("1~5����͂��Ă�������");
				}
			}catch(InputMismatchException e){
				System.out.println("���͒l���s���ł��B");
				sc.next();
			}
		}
		System.out.println("�I�����܂��B");
	}
}