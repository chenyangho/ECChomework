//*********************************
//  �ۑ薼: Kad15_1
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/11/17
//*********************************
import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;

class Kad15_1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�NMM��dd��");
		System.out.println("���݂̓��t��" + sdf.format(cal.getTime()) + "�ł�");
		System.out.print("�����i�߂܂����H�F");
		try{
			int addDay =  sc.nextInt();
			cal.add(Calendar.DATE, addDay);
			System.out.println(addDay + "����̓��t��" + sdf.format(cal.getTime()) + "�ł�");
		}catch(InputMismatchException e){
			System.out.println("���͒l���s���ł��B");
		}
	}
}