//*********************************
//  �ۑ薼: Kad07_2
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/20
//*********************************
class SilverCard extends Card{
	
	SilverCard(String name, int age){
		super(name,age,"�V���o�[");
	}
	
	@Override
	public int ascValue(int money){
		return (int)(money * 0.1);
	}
}