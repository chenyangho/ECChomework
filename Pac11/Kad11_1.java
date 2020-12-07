//*********************************
//  課題名: Kad11_1
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/11/05
//*********************************


class Kad11_1{
	public static void main(String[] args){
		Input input = new Input();
		System.out.print("負の整数を入力してください：");
		try{
			System.out.println("入力値：" + input.getNegativeInt());
		}catch(NumberFormatException e){
			System.out.println(e + "\n入力値が不正です。");
		}
	}
}