//*********************************
//  課題名: Kad02_3
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/01
//*********************************

class Kad02_3{
	public static void main(String[] args){
		
		final String[] TYPS = {"軽自動車", "スポーツカー"};
		final double[] GASS = {25.0, 70.0};
		final int[] SPEEDS = {100, 300};
		
		Car lightCar = new Car();
		Car sportsCar = new Car();
		Car[] cars = {lightCar, sportsCar};
		
		for(int i = 0; i < cars.length; i++){
			cars[i].type = TYPS[i];
			cars[i].gasoline = GASS[i];
			cars[i].maxSpeed = SPEEDS[i];
		}
		
		for(Car car:cars){  //重要!!!
			System.out.println("分類：" + car.type);
			System.out.println("ガソリン(L)：" + car.gasoline);
			System.out.println("最高速度(km)：" + car.maxSpeed + "\n");
		}
	}
}