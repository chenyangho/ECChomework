//*********************************
//  �ۑ薼: Kad05_3
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/13
//*********************************

import java.util.*;

class Kad05_3{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Account account = new Account("ECC","qwe123");
		boolean check = false;
		String name,pass;
		
		while(check != true){
			
			System.out.print("�������[�U�[������͂��Ă��������F");
			name = sc.next();
			System.out.print("�����p�X���[�h����͂��Ă��������F");
			pass = sc.next(); 
			check = account.certify(name,pass);
			
			if(check == true){
				System.out.println("�F�ؐ���\n");
			}else{
				System.out.println("�F�؎��s\n");
			}
		}
		
		System.out.println("\n*** �A�J�E���g�o�^ ***");
		System.out.print("�V�������[�U�[������͂��Ă��������F");
		account.setName(sc.next());
		System.out.print("�V�����p�X���[�h����͂��Ă��������F");
		account.setPass(sc.next());
		
		System.out.println("\n*** �ĔF�� ***");
		check = false;
		
		while(check != true){
			
			System.out.print("���[�U�[������͂��Ă��������F");
			name = sc.next();
			System.out.print("�p�X���[�h����͂��Ă��������F");
			pass = sc.next(); 
			check = account.certify(name,pass);
			
			if(check == true){
				System.out.println("�F�ؐ���\n");
			}else{
				System.out.println("�F�؎��s\n");
			}
		}
		
	}
}