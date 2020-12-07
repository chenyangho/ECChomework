//*********************************
//  課題名: Kad11_2
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/11/05
//*********************************


class Kad11_2{
	public static void main(String[] args){
		Input input = new Input();
		System.out.print("正の整数を入力してください：");
		try{
			System.out.println("入力値：" + input.getPositiveInt());
		}catch(NumberFormatException | NegativeException e){
			System.out.println(e + "\n入力値が不正です。");
		}
	}
}