//*********************************
//  �ۑ薼: Kad09_1
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/27
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