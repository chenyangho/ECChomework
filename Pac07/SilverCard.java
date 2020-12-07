//*********************************
//  課題名: Kad07_2
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/20
//*********************************
class SilverCard extends Card{
	
	SilverCard(String name, int age){
		super(name,age,"シルバー");
	}
	
	@Override
	public int ascValue(int money){
		return (int)(money * 0.1);
	}
}