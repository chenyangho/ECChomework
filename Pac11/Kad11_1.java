//*********************************
//  �ۑ薼: Kad11_1
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/11/05
//*********************************


class Kad11_1{
	public static void main(String[] args){
		Input input = new Input();
		System.out.print("���̐�������͂��Ă��������F");
		try{
			System.out.println("���͒l�F" + input.getNegativeInt());
		}catch(NumberFormatException e){
			System.out.println(e + "\n���͒l���s���ł��B");
		}
	}
}