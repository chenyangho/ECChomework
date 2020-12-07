//*********************************
//  �ۑ薼: Kad12_2
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/11/10
//*********************************

//import java.util.HashMap;
//import java.util.Scanner;
//import java.util.Iterator;
import java.util.*;

class Kad12_2{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		HashMap<String,String> dictionary = new HashMap<>();
		
		int input = -1;
		String English,Japanese;
		System.out.println("�����s���ʁ�\nHashMap �ŉp�a���T�����܂��B");
		
		while(input != 0){
			try{
				System.out.print("�I��=0 �ǉ�=1 �\��=2 ����=3 �폜=4 �S���폜=5 --->");
				input = sc.nextInt();
				if(input >= 0 && input <= 5){
					switch(input){
						case 1:
							System.out.print("�ǉ�����p�P��F");
							English = sc.next();
							System.out.print("�p�P��̘a��F");
							Japanese = sc.next();
							dictionary.put(English,Japanese);
							break;
						case 2:
							Iterator<String> dicIter = dictionary.keySet().iterator(); 
							while(dicIter.hasNext()){
								String getKey = dicIter.next(); //dicIter ���玟�̃L�[���擾
								String getValue = dictionary.get(getKey); //�L�[����l���擾
								System.out.println(getKey + " : " + getValue); //�L�[:�l��\��
							}
							break;
						case 3:
							System.out.print("��������p�P��F");
							String index = sc.next();
							String getValue = dictionary.get(index); //�L�[����l���擾
							System.out.println("�p�P��̘a��F" + getValue); //�L�[:�l��\��
							break;
						case 4:
							System.out.print("�폜����p�P��F");
							String del_num = sc.next();
							dictionary.remove(del_num);
							System.out.print("�폜����\n");
							break;
						case 5:
							dictionary.clear();
							System.out.println("�S���폜���܂����B");
							break;
					}
					System.out.print("\n");
				}else{
					System.out.println("1~5����͂��Ă�������\n");
				}
			}catch(InputMismatchException e){
				System.out.println("���͒l���s���ł��B\n");
				sc.next();
			}
		}
		System.out.println("�I�����܂��B");
	}
}