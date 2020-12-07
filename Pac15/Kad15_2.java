//*********************************
//  課題名: Kad15_2
//  クラス: SE1A
//  作成者: 陳暘和 
//  作成日: 2020/11/17
//*********************************
import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;

class Kad15_2{
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy 年 MM 月");
		Scanner sc = new Scanner(System.in);
		
		String week[] = {"日", "月", "火", "水", "木", "金", "土"};
		int year = cal.get(Calendar.YEAR);
		int last_day = cal.getActualMaximum(Calendar.DATE); 
		System.out.print("今年のカレンダーを表示します。\n月を入力してください(1~12)：");
		
		try{
			int month =  sc.nextInt();
			if(month > 12 || month < 1){
				System.out.println("入力値が範囲外です。");
			}else{
				cal.set(year, month - 1, 1); 
				int youbi = cal.get(Calendar.DAY_OF_WEEK); 
				System.out.printf("\n	%2s\n", sdf.format(cal.getTime()));
				
				//曜日
				for(String w : week){
					System.out.printf("%2s ", w);
				}
				System.out.println("\n----------------------------");
				
				//空白処理
				for(int k = 1; k < youbi; k++){
					System.out.printf("%4s", " ");
				}
				
				//何日
				for(int j = 1; j <= last_day; j++){
					System.out.printf(" %2d ", j);
					if(youbi == 7){
						System.out.print("\n");
						youbi = 0;
					}
					youbi++;
				}
				System.out.print("\n");
			}
		}catch(InputMismatchException e){
			System.out.println("入力値が不正です。");
		}
	}
}
