//*********************************
//  �ۑ薼: Kad13_2
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/11/12
//*********************************
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.io.FileOutputStream;

class Kad13_2{
	public static void main(String[] args){
		
		InputStream is = null;  //�ǂݎ��p�X�g���[��
		OutputStream os = null; //�������ݗp�X�g���[��
		final String READFILENAME = "ECCcompURL.txt";    //�ǂݎ��t�@�C����
		final String WRITEFILENAME = "ECCcompHTML.html"; //�������ރt�@�C����
		try{
			//�y�t�@�C���ǂݎ�菈���z
			is = new FileInputStream(READFILENAME); 
			int data; 				 					 //�����i�[�p
			String urlText = ""; 	  					 //URL �i�[�p
			while((data = is.read()) != -1){
				urlText += (char)data;			 //char �^�փL���X�g���A������
			}
 			System.out.println("�ڑ���:" + urlText);
			
			//�yURL �ڑ������z
			URL url = new URL(urlText);
 			is = url.openStream();
			
			//�y�t�@�C���������ݏ����z
			os = new FileOutputStream(WRITEFILENAME);
			int len;
			byte[] b = new byte[1024];
			while((len = is.read(b)) != -1){
				os.write(b, 0, len); //b �z��� 0~len �o�C�g���� os �X�g���[���ɏ�������
			}

		}catch(IOException ioe){ 						 //IOException �̃C���|�[�g���s������
			System.out.println(ioe);
			System.out.println("�쐬���s���܂����B");
		}finally{
			//InputStream �N���[�Y
			//OutputStream  && InputStream �N���[�Y
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