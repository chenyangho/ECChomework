//*********************************
//  課題名: Kad06_2
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/15
//*********************************

class Bird extends Animal{
		private String type = "Bird";
		
		public void type(){
			System.out.println("***** " + this.type + " *****");
		}
		
		public void cry(){
			System.out.println("鳴く：チュンチュン！");
		}
}