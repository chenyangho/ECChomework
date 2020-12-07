//*********************************
//  課題名: Kad11_3
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/11/05
//*********************************


class Kad11_3{
	public static void main(String[] args){
		Input input = new Input();
		String name;
		int age;
		try{
			System.out.print("名前を入力してください：");
			name = input.getLetterString();
			System.out.print("年齢を入力してください：");
			age = input.getPositiveInt();
			System.out.println("名前：" + name + "\n年齢：" + age);
		}catch(NumberFormatException | NegativeException | NotLetterException e){
			System.out.println(e + "\n入力値が不正です。");
		}
	}
}