import java.util.Scanner;
public class Electricitybill {
    public static void main(String[] args) {
        int units;
        float bill;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Number of units consumed:");
        units=obj.nextInt();
        if (units<200)
            bill=units*2;
        else if(units<=300)
            bill=400+(units-200)*5;
        else
            bill=900+(units-300)*7;
        System.out.println("Electricity bill="+bill);
    }
    
}