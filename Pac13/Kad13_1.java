//*********************************
//  課題名: Kad13_1
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/11/17
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
				System.out.println(FILENAME + "を作成しました。");
				file.createNewFile();
				
				//write
				FileWriter fw = new FileWriter(FILENAME);
				System.out.print("kadai.txt に書き込む文字を入力：");
				fw.write(sc.next());
				fw.close(); 
				
				//read
				FileReader fr = new FileReader(FILENAME);
				System.out.print("kadai.txt から読み取った文字を出力：");
				while((data = fr.read()) != -1){
					System.out.print((char)data); //文字型にキャストして表示する
				}
				System.out.print("\n");
				fr.close();
			}else{
		 		System.out.println("kadai.txt は既に存在しています。 ");
			}
		}catch(IOException ioe){ 
			System.out.println(ioe);
		}

	}
}