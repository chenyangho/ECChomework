//*********************************
//  ‰Û‘è–¼: Kad10_1
//  ƒNƒ‰ƒX: SE1A
//  ì¬Ò: ’Âö˜a 
//  ì¬“ú: 2020/10/29
//*********************************

class Radio implements Power,Volume{
	
	private boolean power;
	private int volume;
	private int MINVOLUME = 0;
	private int MAXVOLUME = 5;
	
	Radio(){
		power = false;
	}
	@Override
	public boolean isPower(){
		return power;
	}
	@Override
	public void powerOn(){
		this.volume = 3;
		power = true;
	}
	@Override
	public void powerOff(){
		power = false;
	}
	@Override
	public int getVolume(){
		return volume;
	}
	@Override
	public void upVolume(){
		if(volume < MAXVOLUME){
			volume++;
		}
	}
	@Override
	public void downVolume(){
		if(volume > MINVOLUME){
			volume--;
		}
	}
}