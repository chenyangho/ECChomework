//*********************************
//  �ۑ薼: Kad05_2
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/10/13
//*********************************

import java.util.*;

class Kad05_2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Account account = new Account("ECC","qwe123");
		
		System.out.println("�������[�U�[���F" + account.getName());
		System.out.println("�����p�X���[�h�F" + account.getPass());
		
		System.out.println("\n*** �A�J�E���g�o�^ ***");
		System.out.print("�V�������[�U�[������͂��Ă��������F");
		account.setName(sc.next());
		System.out.print("�V�����p�X���[�h����͂��Ă��������F");
		account.setPass(sc.next());
		
		System.out.println("\n*** �A�J�E���g��� ***");
		System.out.println("���[�U�[���F" + account.getName());
		System.out.println("�p�X���[�h�F" + account.getPass());
	}
}