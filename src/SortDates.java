import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class SortDates {

	public static void main(String[] args) {

     LocalDate dates[] = {
    		  LocalDate.of(2018, 1, 1),
    		  LocalDate.of(2011, 1, 11),
    		  LocalDate.of(2015, 11, 30),
    		  LocalDate.of(2017, 7, 30),
    		  LocalDate.of(2011, 2, 11)
     };
     
     
//     Scanner s = new Scanner(System.in);
//     for(int i = 0; i < 5; i++ )
//     {
//    	 System.out.print("Enter date [yyyy-MM-dd] :");
//    	 dates[i] = LocalDate.parse(s.nextLine());
//     }
     
     Arrays.sort(dates);
     
     
     for(int i = 0; i < dates.length; i++ )
     {
    	 System.out.println( dates[i].format( DateTimeFormatter.ofPattern("yyyy-MM-dd")));
     }

	}

}
