import java.util.*;
public class LeapYear {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the year");
        int n=sc.nextInt();
        if(n%4==0 &&(n%100!=0 ||(n%100==0 && n%400==0))){
            System.out.println("its a leap year");
        }
        else{
            System.out.println("its not a leap year");
        }
    }
    
}
