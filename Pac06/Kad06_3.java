//*********************************
//  �ۑ薼: Kad06_3
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/15
//*********************************

class Kad06_3{
	public static void main(String[] args){
		Dog dog1 = new Dog("�Č�",35,8);
		Dog dog2 = new Dog("�`����",23,3);
		Dog dog3 = new Dog("�u���h�b�O ",40,25);
		
		Dog[] dogs = {dog1,dog2,dog3};
		
		//for(int i = 0; i < dogs.length; i++){
		//	dogs[i].type();
		//	dogs[i].cry();
		//	dogs[i].sleep();
		//	System.out.println("�̍��F" + dogs[i].getHeight() + "cm\n�̏d�F" + dogs[i].getWeight() + "kg\n");
		//}
		
		for(Dog i:dogs){
			i.type();
			i.cry();
			i.sleep();
			System.out.println("�̍��F" + i.getHeight() + "cm\n�̏d�F" + i.getWeight() + "kg\n");
		
		}
		
	}
}