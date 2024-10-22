import java.util.Scanner;
public class convertLU 
{
    public static void main(String[] args)
    {
        
        char i;
        Scanner clu= new Scanner(System.in);
        System.out.println("Enter the character-");
        i=clu.next().charAt(0);
        if(i>='a'&& i<='z'){
            i=(char)(i-32);
            System.out.println("Converted upper case letter=\n"+i);
        }
        else if(i>='A'&& i<='Z'){
            i=(char)(i+32);
            System.out.println("Coverted lower case letter=\n"+i);
        }
        clu.close();
    }
}
