//*********************************
//  課題名: Kad12_1
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/11/10
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
		System.out.println("＜実行結果＞\nArrayList で国名リストを作ります。");
		
		while(input != 0){
			try{
				System.out.print("終了=0 追加=1 表示=2 並び替え=3 削除=4 全件削除=5 --->");
				input = sc.nextInt();
				if(input >= 0 && input <= 5){
					switch(input){
						case 1:
							System.out.print("追加する国名：");
							countryList.add(sc.next());
							break;
						case 2:
							for(String a : countryList){
								System.out.println(a);
							}
							break;
						case 3:
							System.out.println("昇順に並び替えました。");
							Collections.sort(countryList);
							break;
						case 4:
							System.out.print("削除する国名：");
							countryList.remove(sc.next());
							System.out.print("削除成功\n");
							break;
						case 5:
							System.out.println("全件削除しました。");
							countryList.removeAll(countryList);
							break;
					}
				}else{
					System.out.println("1~5を入力してください");
				}
			}catch(InputMismatchException e){
				System.out.println("入力値が不正です。");
				sc.next();
			}
		}
		System.out.println("終了します。");
	}
}