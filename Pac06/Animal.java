//*********************************
//  �ۑ薼: Kad06_1
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/15
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
		System.out.println("�Q��F�X���X��...zzz");	
	}
	
	public int getHeight(){
		return height;
	}
	public int getWeight(){
		return weight;
	}
}