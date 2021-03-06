//*********************************
//  課題名: Kad07_2
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/20
//*********************************

class GoldCard extends Card{
	private int border = 3000;
	private int bounsPoint = 200;
	
	GoldCard(String name, int age){
		super(name,age,"ゴールド");
	}
	
	public int discount(int money){
		return (int)(money * 0.9);
	}
	
	@Override
	public int ascValue(int money){
		if(money >= border){
			super.addPoint(bounsPoint);
		}
		return (int)(money * 0.2);
	}
}