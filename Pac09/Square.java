//*********************************
//  課題名: Kad09_1
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/27
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