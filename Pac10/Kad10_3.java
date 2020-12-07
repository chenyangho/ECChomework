//*********************************
//  課題名: Kad10_2
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/10/29
//*********************************

import java.util.*;

class Kad10_3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Radio radio = new Radio();
		System.out.println("ラジオを操作します。");
		int input = -1;
		boolean check;
		while(input != 0){
			try{
				check = radio.isPower();
				System.out.print("終了=0 電源 ON/OFF=1 音量 UP=2 音量 DOWN=3:");
				input = sc.nextInt();
				if(input == 1 && check == true){
					radio.powerOff();
					System.out.println("電源OFF");
				}else if(input == 1 && check == false){
					radio.powerOn();
					System.out.println("電源ON");
				}else if(input == 2 && check == true){
					radio.upVolume();
					System.out.println("音量:" + radio.getVolume());
				}else if(input == 3 && check == true){
					radio.downVolume();
					System.out.println("音量:" + radio.getVolume());
				}
				System.out.print("\n");
			}catch(InputMismatchException e){
				System.out.println("入力値が不正です。");
				sc.next();
			}
		}
		System.out.println("終了します。");
	}
}