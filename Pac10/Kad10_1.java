//*********************************
//  �ۑ薼: Kad10_1
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/29
//*********************************

class Kad10_1{
	public static void main(String[] args){
		Radio radio = new Radio();
		System.out.print("���W�I�̓d�����m�F���܂��B\n�d��:");
		if(radio.isPower() == true){
			System.out.println("ON");
		}else{
			System.out.println("OFF");
		}
	}
}