//*********************************
//  ‰Û‘è–¼: Kad04_1
//  ƒNƒ‰ƒX: SE1A
//  ì¬Ò: ’Âö˜a 
//  ì¬“ú: 2020/10/13
//*********************************

class Account{
	private String name;
	private String pass;
	
	Account(String name, String pass){
		this.name = name;
		this.pass = pass;
	}
	
	public String getName(){
		return name;
	}
	
	public String getPass(){
		return pass;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setPass(String pass){
		this.pass = pass;
	}
	
	public boolean certify(String name, String pass){
		String checkname = name;
		String checkpass = pass;
		if(this.name.equals(checkname) && this.pass.equals(checkpass)){
			return true;
		}
		return false;
		
	}
}