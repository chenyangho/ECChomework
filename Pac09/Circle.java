//*********************************
//  �ۑ薼: Kad09_3
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/27
//*********************************

import java.lang.*;

class Circle extends Shape{
	private double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	@Override
	public double getArea(){
		return Math.PI * radius * radius;
	}
	@Override
	public double getRound(){
		return Math.PI * 2 * radius;
	}
}