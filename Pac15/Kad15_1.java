//*********************************
//  課題名: Kad15_1
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/11/17
//*********************************
import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;

class Kad15_1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("現在の日付は" + sdf.format(cal.getTime()) + "です");
		System.out.print("何日進めますか？：");
		try{
			int addDay =  sc.nextInt();
			cal.add(Calendar.DATE, addDay);
			System.out.println(addDay + "日後の日付は" + sdf.format(cal.getTime()) + "です");
		}catch(InputMismatchException e){
			System.out.println("入力値が不正です。");
		}
	}
}