//*********************************
//  �ۑ薼: Kad13_1
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/11/17
//*********************************
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

class Kad13_1{
	public static void main(String[] args){
		
		final String FILENAME = "kadai.txt";
		int data; 
		
		Scanner sc = new Scanner(System.in);
		File file = new File(FILENAME);
		
		try{
			if(file.createNewFile() == true){
				
				//creat
				System.out.println(FILENAME + "���쐬���܂����B");
				file.createNewFile();
				
				//write
				FileWriter fw = new FileWriter(FILENAME);
				System.out.print("kadai.txt �ɏ������ޕ�������́F");
				fw.write(sc.next());
				fw.close(); 
				
				//read
				FileReader fr = new FileReader(FILENAME);
				System.out.print("kadai.txt ����ǂݎ�����������o�́F");
				while((data = fr.read()) != -1){
					System.out.print((char)data); //�����^�ɃL���X�g���ĕ\������
				}
				System.out.print("\n");
				fr.close();
			}else{
		 		System.out.println("kadai.txt �͊��ɑ��݂��Ă��܂��B ");
			}
		}catch(IOException ioe){ 
			System.out.println(ioe);
		}

	}
}