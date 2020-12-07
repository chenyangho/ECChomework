//*********************************
//  課題名: Kad13_2
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/11/12
//*********************************
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.io.FileOutputStream;

class Kad13_2{
	public static void main(String[] args){
		
		InputStream is = null;  //読み取り用ストリーム
		OutputStream os = null; //書き込み用ストリーム
		final String READFILENAME = "ECCcompURL.txt";    //読み取るファイル名
		final String WRITEFILENAME = "ECCcompHTML.html"; //書き込むファイル名
		try{
			//【ファイル読み取り処理】
			is = new FileInputStream(READFILENAME); 
			int data; 				 					 //文字格納用
			String urlText = ""; 	  					 //URL 格納用
			while((data = is.read()) != -1){
				urlText += (char)data;			 //char 型へキャストし連結する
			}
 			System.out.println("接続先:" + urlText);
			
			//【URL 接続処理】
			URL url = new URL(urlText);
 			is = url.openStream();
			
			//【ファイル書き込み処理】
			os = new FileOutputStream(WRITEFILENAME);
			int len;
			byte[] b = new byte[1024];
			while((len = is.read(b)) != -1){
				os.write(b, 0, len); //b 配列の 0~len バイト数を os ストリームに書き込む
			}

		}catch(IOException ioe){ 						 //IOException のインポートも行うこと
			System.out.println(ioe);
			System.out.println("作成失敗しました。");
		}finally{
			//InputStream クローズ
			//OutputStream  && InputStream クローズ
			if(is != null && os != null){
				try{
					is.close();
					os.close();
				}catch(IOException ioe){
					System.out.println(ioe);
				}
			}
		}

	}
}