//*********************************
//  課題名: Kad09_2
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/27
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