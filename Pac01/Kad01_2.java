//*********************************
//  �ۑ薼: Kad01_2
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/09/29
//*********************************

class Kad01_2{
	public static void main(String[] args){
		
		final int SUM = 1333;
		for(int i = 0;i < 10; i++){
			for(int j = 0;j < 10; j++){
				for(int k = 0;k < 10; k++){
					if((i * 101) + (j * 20) + (k *101) == SUM){
						System.out.println("" + i + j + k + " + " + k + j + i + " = " + SUM);
					}
				}
			}
		}
		
	}
	
}