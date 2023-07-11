package api.time;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test07 {
	public static void main(String[] args) {

		//입력
		int year = 2020;
		int month = 2;

		//계산
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);
		int week = c.get(Calendar.DAY_OF_WEEK);

		c.add(Calendar.DATE, -(week-1));

		//출력 - 42번
		int count = 0;

		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=0; i < 42; i++) {
			Date d = c.getTime();
			SimpleDateFormat fmt = new SimpleDateFormat("d");
			System.out.print(fmt.format(d));
			System.out.print("\t");

			c.add(Calendar.DATE, 1);
			count++;
			if(count % 7 == 0) {
				System.out.println();
			}
		}


	}
}
