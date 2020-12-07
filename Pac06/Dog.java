//*********************************
//  課題名: Kad06_1
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/15
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
			System.out.println("鳴く：ワンワン！");
		}
}