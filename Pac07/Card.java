//*********************************
//  課題名: Kad07_1
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/20
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
		System.out.println("\n*** カード情報 ***");
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
		System.out.println("階級：" + rank);
		System.out.println("Point：" + point);
	}
	
	public int ascValue(int money){
		return (int)(money * 0.05);
	}
	
	public void addPoint(int point){
		this.point += point;
	}
}
