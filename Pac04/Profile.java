//*********************************
//  �ۑ薼: Kad03_1
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/08
//*********************************
class Profile{
	String name;
	int age;
	String from;
	String job;
	
	Profile(){
		job = "�X�|�[�c�I��";
	}
	
	Profile(String name,int age,String from){
		this();         //add this call first.
		this.name = name;
		this.age = age;
		this.from = from;
	}
	
	void show(){
		System.out.println("�����F" + name + "\n�N��F" + age + "\n�o�g�F" + from);
		System.out.println("�E�ƁF" + job);
	}
}