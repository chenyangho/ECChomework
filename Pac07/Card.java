//*********************************
//  �ۑ薼: Kad07_1
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/20
//*********************************

class Card{
	private String name,rank;
	private int age;
	private int point = 100;
	
	Card(String name,int age,String rank){
		this.name = name;
		this.age = age;
		this.rank = rank;
	}
	
	public void showInfo(){
		System.out.println("\n*** �J�[�h��� ***");
		System.out.println("���O�F" + name);
		System.out.println("�N��F" + age);
		System.out.println("�K���F" + rank);
		System.out.println("Point�F" + point);
	}
	
	public int ascValue(int money){
		return (int)(money * 0.05);
	}
	
	public void addPoint(int point){
		this.point += point;
	}
}
