//*********************************
//  ‰Û‘è–¼: Kad14_2
//  ƒNƒ‰ƒX: SE1A
//  ì¬Ò: ’Âö˜a 
//  ì¬“ú: 2020/11/17
//*********************************

class Savings{
	private int savings = 0;
	
	public synchronized void saveMoney(int money, String name){
		this.savings += money;
		System.out.println(name + "‚ª’™‹à‚µ‚Ü‚µ‚½B’™‹àŠzF" + getSavings() + "‰~");
	}
	
	public int getSavings(){
		return this.savings;
	}
}