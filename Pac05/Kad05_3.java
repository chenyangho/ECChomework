//*********************************
//  課題名: Kad05_3
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/13
//*********************************

import java.util.*;

class Kad05_3{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Account account = new Account("ECC","qwe123");
		boolean check = false;
		String name,pass;
		
		while(check != true){
			
			System.out.print("初期ユーザー名を入力してください：");
			name = sc.next();
			System.out.print("初期パスワードを入力してください：");
			pass = sc.next(); 
			check = account.certify(name,pass);
			
			if(check == true){
				System.out.println("認証成功\n");
			}else{
				System.out.println("認証失敗\n");
			}
		}
		
		System.out.println("\n*** アカウント登録 ***");
		System.out.print("新しいユーザー名を入力してください：");
		account.setName(sc.next());
		System.out.print("新しいパスワードを入力してください：");
		account.setPass(sc.next());
		
		System.out.println("\n*** 再認証 ***");
		check = false;
		
		while(check != true){
			
			System.out.print("ユーザー名を入力してください：");
			name = sc.next();
			System.out.print("パスワードを入力してください：");
			pass = sc.next(); 
			check = account.certify(name,pass);
			
			if(check == true){
				System.out.println("認証成功\n");
			}else{
				System.out.println("認証失敗\n");
			}
		}
		
	}
}