//*********************************
//  �ۑ薼: Kad02_2
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/01
//*********************************

class Kad02_2{
	public static void main(String[] args){
		Car car = new Car();
		car.type = "��^������";
		car.gasoline = 350.0;
		car.maxSpeed = 60;
		System.out.println("���ށF" + car.type);
		System.out.println("�K�\����(L)�F" + car.gasoline);
		System.out.println("�ō����x(km)�F" + car.maxSpeed);
	}
}