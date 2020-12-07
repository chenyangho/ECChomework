//*********************************
//  �ۑ薼: Kad15_2
//  �N���X: SE1A
//  �쐬��: ���a 
//  �쐬��: 2020/11/17
//*********************************
import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;

class Kad15_2{
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy �N MM ��");
		Scanner sc = new Scanner(System.in);
		
		String week[] = {"��", "��", "��", "��", "��", "��", "�y"};
		int year = cal.get(Calendar.YEAR);
		int last_day = cal.getActualMaximum(Calendar.DATE); 
		System.out.print("���N�̃J�����_�[��\�����܂��B\n������͂��Ă�������(1~12)�F");
		
		try{
			int month =  sc.nextInt();
			if(month > 12 || month < 1){
				System.out.println("���͒l���͈͊O�ł��B");
			}else{
				cal.set(year, month - 1, 1); 
				int youbi = cal.get(Calendar.DAY_OF_WEEK); 
				System.out.printf("\n	%2s\n", sdf.format(cal.getTime()));
				
				//�j��
				for(String w : week){
					System.out.printf("%2s ", w);
				}
				System.out.println("\n----------------------------");
				
				//�󔒏���
				for(int k = 1; k < youbi; k++){
					System.out.printf("%4s", " ");
				}
				
				//����
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
			System.out.println("���͒l���s���ł��B");
		}
	}
}
