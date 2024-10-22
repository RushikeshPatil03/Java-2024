import java.util.Scanner;
public class GcdLcm {
    public static void main(String[] args)
    {
        int n1,n2,a,b,Lcm;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first value for n1:");
        n1=obj.nextInt();
        System.out.println("Enter the second value for n2:");
        n2=obj.nextInt();
        a=n1;
        b=n2;
        while(n1!=n2)
        {
            if(n1>n2){
                n1=n1-n2;
            }
            else{
                n2=n2-n1;
            }
           
        }
        System.out.println("The GCD of the given numbers is :"+n1);
        Lcm=((a*b)/n1);
        System.out.println("The LCM of the given numbers is:"+Lcm);
        obj.close();
    }
    
}
