import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;

public class FindingDayofWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		//String month = in.next();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Month");
		int mm = in.nextInt();
		//String day = in.next();
		System.out.println("Enter day");
		int dd = in.nextInt();
		//String year = in.next();
		System.out.println("Enter year");
		int yy = in.nextInt();
		in.close();
		
		LocalDate dt = LocalDate.of(yy, mm, dd);
		DayOfWeek  dat= dt.getDayOfWeek();
		
		LocalDate dt1 = LocalDate.now();
		Month mnth =dt1.getMonth();
	
		System.out.println(mnth);
		
		
		String ss = String.valueOf(dat);
		System.out.print(dt.getDayOfWeek());
		
		
		Date d = new Date();
		d.get
		
	}

}
