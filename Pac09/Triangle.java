//*********************************
//  ‰Û‘è–¼: Kad09_2
//  ƒNƒ‰ƒX: SE1A
//  ì¬Ò: ’Âö˜a 
//  ì¬“ú: 2020/10/27
//*********************************

class Triangle extends Shape{
	private double side;
	
	Triangle(double side){
		this.side = side;
	}
	@Override
	public double getArea(){
		return side * side * Math.sqrt(3) / 4;
	}
}