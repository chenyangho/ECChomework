//*********************************
//  課題名: Kad09_3
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/27
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