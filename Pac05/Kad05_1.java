//*********************************
//  課題名: Kad05_1
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/13
//*********************************

class Kad05_1{
	public static void main(String[] args){
		Account account = new Account("ECC","qwe123");
		System.out.println("初期ユーザー名：" + account.getName());
		System.out.println("初期パスワード：" + account.getPass());
	}
}