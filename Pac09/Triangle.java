//*********************************
//  �ۑ薼: Kad09_2
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/27
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