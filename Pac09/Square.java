//*********************************
//  ‰Û‘è–¼: Kad09_1
//  ƒNƒ‰ƒX: SE1A
//  ì¬Ò: ’Âö˜a 
//  ì¬“ú: 2020/10/27
//*********************************

class Square extends Shape{
	private double side;
	
	Square(double side){
		this.side = side;
	}
	@Override
	public double getArea(){
		return side * side;
	}
}