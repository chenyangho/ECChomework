//*********************************
//  課題名: Kad01_3
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/09/29
//*********************************

import java.util.*;

class Kad01_3{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//問題配列
		final String[] QUIZ = {"ループを抜ける文は？",
							   "配列の長さを取得する文は？",
							   "例外処理の構文は try-何？"};
		//選択肢配列
		final String[][] CHOICE = {{"continue", "return", "break"},
								   {".length", ".height", ".count"},
								   {"get", "catch", "exception"}};
		//各問題の解答番号
		final int[] ANSWER = {3,1,2};
		final int LENGTH = QUIZ.length;
		int index = 0;
		int player;
		int currect = 0;
		
		System.out.println("Java クイズ！");
			
		while(index < LENGTH){
			
			try{
				System.out.println("第 " + (index + 1) + " 問： " + QUIZ[index]);
				
				for(int i = 0; i < CHOICE[index].length; i++){
					
					System.out.println((i + 1) + " : " + CHOICE[index][i]);
					
				}
				player = sc.nextInt();
				if(player == ANSWER[index]){
					
					System.out.println("正解！\n");
					index++;
					currect++;
					
				}else if(player < 1 || player > LENGTH){
					
					System.out.println("その選択肢は存在しません。\n");
					
				}else if(player != ANSWER[index]){
					
					System.out.println("不正解！答えは " + ANSWER[index] + " です。\n");
					index++;
					
				}
			}catch(InputMismatchException e){
				System.out.println("入力値が不正です。\n");
				sc.next();
			}
		}
		
		System.out.println("終了！3 問中、" + currect + " 問正解でした。");
		
	}
}