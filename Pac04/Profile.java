//*********************************
//  課題名: Kad03_1
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/08
//*********************************
class Profile{
	String name;
	int age;
	String from;
	String job;
	
	Profile(){
		job = "スポーツ選手";
	}
	
	Profile(String name,int age,String from){
		this();         //add this call first.
		this.name = name;
		this.age = age;
		this.from = from;
	}
	
	void show(){
		System.out.println("氏名：" + name + "\n年齢：" + age + "\n出身：" + from);
		System.out.println("職業：" + job);
	}
}