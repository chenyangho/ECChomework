//*********************************
//  ‰Û‘è–¼: Kad09_3
//  ƒNƒ‰ƒX: SE1A
//  ì¬Ò: ’Âö˜a 
//  ì¬“ú: 2020/10/27
//*********************************

import java.util.*;

class Kad09_3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("‰~‚Ì–ÊÏ‚Æ‰~ü‚ğ‹‚ß‚Ü‚·B");
		System.out.print("”¼Œa‚Ì’·‚³‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢[m]F");
		try{
			double side = sc.nextDouble();
			Circle circle = new Circle(side);
			System.out.println("‰~‚Ì–ÊÏF" + circle.getArea() + "‡u");
			System.out.println("‰~‚Ì‰~üF" + circle.getRound() + "‚");
		}catch(InputMismatchException e){
			System.out.println("“ü—Í’l‚ª•s³‚Å‚·B");
		}
	}
}