package Week2;

import java.util.*;
public class Task7 {
    public static String findDays(int year, int month, int day){
        Calendar cal=Calendar.getInstance();
        cal.set(year,month-1,day);

        int dayOfWeek= cal.get(Calendar.DAY_OF_WEEK);
        String[] days={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        return days[dayOfWeek-1];
    }

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int year=sc.nextInt();
    int month=sc.nextInt();
    int day=sc.nextInt();

    String res=findDays(year,month,day);
    System.out.println(res);
    sc.close();
  }

}
