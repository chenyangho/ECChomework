//*********************************
//  �ۑ薼: Kad01_3
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/09/29
//*********************************

import java.util.*;

class Kad01_3{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//���z��
		final String[] QUIZ = {"���[�v�𔲂��镶�́H",
							   "�z��̒������擾���镶�́H",
							   "��O�����̍\���� try-���H"};
		//�I�����z��
		final String[][] CHOICE = {{"continue", "return", "break"},
								   {".length", ".height", ".count"},
								   {"get", "catch", "exception"}};
		//�e���̉𓚔ԍ�
		final int[] ANSWER = {3,1,2};
		final int LENGTH = QUIZ.length;
		int index = 0;
		int player;
		int currect = 0;
		
		System.out.println("Java �N�C�Y�I");
			
		while(index < LENGTH){
			
			try{
				System.out.println("�� " + (index + 1) + " ��F " + QUIZ[index]);
				
				for(int i = 0; i < CHOICE[index].length; i++){
					
					System.out.println((i + 1) + " : " + CHOICE[index][i]);
					
				}
				player = sc.nextInt();
				if(player == ANSWER[index]){
					
					System.out.println("�����I\n");
					index++;
					currect++;
					
				}else if(player < 1 || player > LENGTH){
					
					System.out.println("���̑I�����͑��݂��܂���B\n");
					
				}else if(player != ANSWER[index]){
					
					System.out.println("�s�����I������ " + ANSWER[index] + " �ł��B\n");
					index++;
					
				}
			}catch(InputMismatchException e){
				System.out.println("���͒l���s���ł��B\n");
				sc.next();
			}
		}
		
		System.out.println("�I���I3 �⒆�A" + currect + " �␳���ł����B");
		
	}
}