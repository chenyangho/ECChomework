//*********************************
//  課題名: Kad02_2
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/01
//*********************************

class Kad02_2{
	public static void main(String[] args){
		Car car = new Car();
		car.type = "大型自動車";
		car.gasoline = 350.0;
		car.maxSpeed = 60;
		System.out.println("分類：" + car.type);
		System.out.println("ガソリン(L)：" + car.gasoline);
		System.out.println("最高速度(km)：" + car.maxSpeed);
	}
}