//*********************************
//  �ۑ薼: Kad01_1
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/09/29
//*********************************

class Kad01_1{
	public static void main(String[] args){
		
		final int ARANK = 90;
		final int BRANK = 80;
		final int CRANK = 70;
		final int DRANK = 60;
		
		for(int i = 0; i <= 100; i += 10){
			System.out.print(i + "�_ : ");
			if(i < DRANK){
				System.out.println("F�����N");
			}else if(i < CRANK){
				System.out.println("D�����N");
			}else if(i < BRANK){
				System.out.println("C�����N");
			}else if(i < ARANK){
				System.out.println("B�����N");
			}else{
				System.out.println("A�����N");
			}
		}
		
	}
	
}