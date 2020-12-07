//*********************************
//  課題名: Kad05_2
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/13
//*********************************

import java.util.*;

class Kad05_2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Account account = new Account("ECC","qwe123");
		
		System.out.println("初期ユーザー名：" + account.getName());
		System.out.println("初期パスワード：" + account.getPass());
		
		System.out.println("\n*** アカウント登録 ***");
		System.out.print("新しいユーザー名を入力してください：");
		account.setName(sc.next());
		System.out.print("新しいパスワードを入力してください：");
		account.setPass(sc.next());
		
		System.out.println("\n*** アカウント情報 ***");
		System.out.println("ユーザー名：" + account.getName());
		System.out.println("パスワード：" + account.getPass());
	}
}