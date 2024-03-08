public class Q04_DaysInYear {
    public static int numberOfDaysInAYear(int year){
        if(year%4==0 && (year%400==0 || year%100 != 0))
            return 366;
        else
            return 365;
        }
    public static void main(String[] args) {
        for (int i=2000; i<=2020; i++){
            System.out.println("Number of days in the year " + i + " is: " + numberOfDaysInAYear(i));
        }
    }
}
