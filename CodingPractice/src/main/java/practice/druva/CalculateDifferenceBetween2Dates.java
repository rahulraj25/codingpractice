package practice.druva;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Better approach is take a reference date and calculate days till the new Date
//and divide the number of days
public class CalculateDifferenceBetween2Dates {

    public static void main(String[] args) {

        String date1 = new String("01-01-2022");
        String date2 = new String("01-06-2022");

        List<String> collect = Arrays.stream(date1.split("-")).collect(Collectors.toList());
        List<String> collect2 = Arrays.stream(date2.split("-")).collect(Collectors.toList());

        int day1 = Integer.parseInt(collect.get(0));
        int month1 = Integer.parseInt(collect.get(1));
        int year1 = Integer.parseInt(collect.get(2));
        int day2 = Integer.parseInt(collect2.get(0));
        int month2 = Integer.parseInt(collect2.get(1));
        int year2 = Integer.parseInt(collect2.get(2));

        int yearDays=0 , monthdays=0, dayDays =0;
        if(year2 > year1){
            yearDays = (year2 - year1 ) * 365;
            month1 = getMonthDays(month1 ,year1);
            month2 = getMonthDays(month2 ,year2);
            if(month2 >= month1){
                monthdays = (month2 - month1) * 30;
                if(day2 >= day1){
                    dayDays = day2 - day1;
                }else{
                    dayDays = day1 - day2;
                }
            }else{
                monthdays = (month1 - month2) * 30;
            }
        }else{
            yearDays = (year1 - year2) * 365;
        }

        System.out.println(yearDays+monthdays+dayDays);

    }

    public static  int getMonthDays(int month, int year){
        int a =0 ;

        switch (month){
            case 2:
                if(year% 4== 0 && year%400 ==0)
                    a =  29;
                else
                    a = 28;
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                a = 31;
            break;
            default:
                a = 30;
                break;
        }

        return  a;
    }
}
