//*********************************
//  �ۑ薼: Kad06_1
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/15
//*********************************

class Dog extends Animal{
		private String type = "Dog";
		
		Dog(){
		}
		
		Dog(String type, int height, int weight){
			super(height,weight);
			this.type = type;
		}
		
		public void type(){
			System.out.println("***** " + this.type + " *****");
		}
		
		public void cry(){
			System.out.println("���F���������I");
		}
}