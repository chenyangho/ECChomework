//*********************************
//  ‰Û‘è–¼: Kad03_1
//  ƒNƒ‰ƒX: SE1A
//  ì¬Ò: ’Âö˜a 
//  ì¬“ú: 2020/10/08
//*********************************

class Kad04_3{
	public static void main(String[] args){
		
		Profile[] pf = new Profile[3];
		String[] name = {"—é–Øˆê˜N","–{“cŒ\—C","–k“‡N‰î"};
		int[] age = {46,33,37};
		String[] from = {"ˆ¤’mŒ§","‘åã•{","“Œ‹“s"};
		
		for(int i = 0; i < pf.length; i++){
			pf[i] = new Profile(name[i],age[i],from[i]);
			pf[i].show();
			System.out.print("\n");
		}
	}
}