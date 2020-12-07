//*********************************
//  課題名: Kad01_1
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/09/29
//*********************************

class Kad01_1{
	public static void main(String[] args){
		
		final int ARANK = 90;
		final int BRANK = 80;
		final int CRANK = 70;
		final int DRANK = 60;
		
		for(int i = 0; i <= 100; i += 10){
			System.out.print(i + "点 : ");
			if(i < DRANK){
				System.out.println("Fランク");
			}else if(i < CRANK){
				System.out.println("Dランク");
			}else if(i < BRANK){
				System.out.println("Cランク");
			}else if(i < ARANK){
				System.out.println("Bランク");
			}else{
				System.out.println("Aランク");
			}
		}
		
	}
	
}