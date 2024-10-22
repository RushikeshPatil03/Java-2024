import java.util.Scanner;
public class factorial {
    int num;
    void setDim(int n)
    {
        num=n;
    }
    int factMethod()
    {
        int i,fact=1;
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return(fact);
    }
    public static void main(String[] args)
    {
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        n=obj.nextInt();
        factorial f1=new factorial();
        f1.setDim(n);
        System.out.println("Factorial of a number is:"+f1.factMethod());
        obj.close();
    }
}
