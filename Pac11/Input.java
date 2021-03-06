//*********************************
//  課題名: Kad11_1
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/11/05
//*********************************

import java.util.*;

class Input{
	Scanner sc = new Scanner(System.in);
	public int getNegativeInt(){
		int negative = Integer.parseInt(sc.next());
		if(negative >= 0){
			throw new NumberFormatException();
		}
		return negative;
	}
	
	public int getPositiveInt() throws NegativeException{
		int positive = Integer.parseInt(sc.next());
		if(positive < 0){
			throw new NegativeException();
		}
		return positive;
	}
	
	public String getLetterString() throws NotLetterException{
		String letter = sc.next();
		boolean check;
		for(int i = 0;i < letter.length(); i++){
			check = Character.isLetter(letter.charAt(i));
			if(check == false){
				throw new NotLetterException();
			}
		}
		return letter;
	}
}