//*********************************
//  �ۑ薼: Kad11_3
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/11/05
//*********************************


class Kad11_3{
	public static void main(String[] args){
		Input input = new Input();
		String name;
		int age;
		try{
			System.out.print("���O����͂��Ă��������F");
			name = input.getLetterString();
			System.out.print("�N�����͂��Ă��������F");
			age = input.getPositiveInt();
			System.out.println("���O�F" + name + "\n�N��F" + age);
		}catch(NumberFormatException | NegativeException | NotLetterException e){
			System.out.println(e + "\n���͒l���s���ł��B");
		}
	}
}