//*********************************
//  �ۑ薼: Kad03_1
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/08
//*********************************

class Kad04_3{
	public static void main(String[] args){
		
		Profile[] pf = new Profile[3];
		String[] name = {"��؈�N","�{�c�\�C","�k���N��"};
		int[] age = {46,33,37};
		String[] from = {"���m��","���{","�����s"};
		
		for(int i = 0; i < pf.length; i++){
			pf[i] = new Profile(name[i],age[i],from[i]);
			pf[i].show();
			System.out.print("\n");
		}
	}
}