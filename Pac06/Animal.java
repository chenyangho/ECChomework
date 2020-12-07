//*********************************
//  課題名: Kad06_1
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/15
//*********************************

class Animal{
	private int height,weight;
	
	Animal(){
	}
	
	Animal(int height, int weight){
		this.height = height;
		this.weight = weight;
	}
	
	public void sleep(){
		System.out.println("寝る：スヤスヤ...zzz");	
	}
	
	public int getHeight(){
		return height;
	}
	public int getWeight(){
		return weight;
	}
}