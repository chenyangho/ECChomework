//*********************************
//  課題名: Kad12_2
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/11/10
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
		System.out.println("＜実行結果＞\nHashMap で英和辞典を作ります。");
		
		while(input != 0){
			try{
				System.out.print("終了=0 追加=1 表示=2 検索=3 削除=4 全件削除=5 --->");
				input = sc.nextInt();
				if(input >= 0 && input <= 5){
					switch(input){
						case 1:
							System.out.print("追加する英単語：");
							English = sc.next();
							System.out.print("英単語の和訳：");
							Japanese = sc.next();
							dictionary.put(English,Japanese);
							break;
						case 2:
							Iterator<String> dicIter = dictionary.keySet().iterator(); 
							while(dicIter.hasNext()){
								String getKey = dicIter.next(); //dicIter から次のキーを取得
								String getValue = dictionary.get(getKey); //キーから値を取得
								System.out.println(getKey + " : " + getValue); //キー:値を表示
							}
							break;
						case 3:
							System.out.print("検索する英単語：");
							String index = sc.next();
							String getValue = dictionary.get(index); //キーから値を取得
							System.out.println("英単語の和訳：" + getValue); //キー:値を表示
							break;
						case 4:
							System.out.print("削除する英単語：");
							String del_num = sc.next();
							dictionary.remove(del_num);
							System.out.print("削除成功\n");
							break;
						case 5:
							dictionary.clear();
							System.out.println("全件削除しました。");
							break;
					}
					System.out.print("\n");
				}else{
					System.out.println("1~5を入力してください\n");
				}
			}catch(InputMismatchException e){
				System.out.println("入力値が不正です。\n");
				sc.next();
			}
		}
		System.out.println("終了します。");
	}
}