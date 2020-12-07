//*********************************
//  課題名: Kad10_1
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/29
//*********************************

class Kad10_1{
	public static void main(String[] args){
		Radio radio = new Radio();
		System.out.print("ラジオの電源を確認します。\n電源:");
		if(radio.isPower() == true){
			System.out.println("ON");
		}else{
			System.out.println("OFF");
		}
	}
}