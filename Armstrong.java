import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        int num;
        int org;
        int sum=0;
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the number:");
        org=obj.nextInt();
        num = org;
        int digits=String.valueOf(num).length();
        while (num>0) {
            int R=num%10;
            sum+=Math.pow(R,digits);
            num/=10;
        }
        if(sum == org)
        {
            System.out.println(org +" is an armstrong number");
        }
        else
        {
            System.out.println(org +" Is not an armastrong number");
        }

        obj.close();
        
    }
    
}

