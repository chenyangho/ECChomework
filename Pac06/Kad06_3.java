//*********************************
//  課題名: Kad06_3
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/15
//*********************************

class Kad06_3{
	public static void main(String[] args){
		Dog dog1 = new Dog("柴犬",35,8);
		Dog dog2 = new Dog("チワワ",23,3);
		Dog dog3 = new Dog("ブルドッグ ",40,25);
		
		Dog[] dogs = {dog1,dog2,dog3};
		
		//for(int i = 0; i < dogs.length; i++){
		//	dogs[i].type();
		//	dogs[i].cry();
		//	dogs[i].sleep();
		//	System.out.println("体高：" + dogs[i].getHeight() + "cm\n体重：" + dogs[i].getWeight() + "kg\n");
		//}
		
		for(Dog i:dogs){
			i.type();
			i.cry();
			i.sleep();
			System.out.println("体高：" + i.getHeight() + "cm\n体重：" + i.getWeight() + "kg\n");
		
		}
		
	}
}