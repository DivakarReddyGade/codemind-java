import java.util.*;
public class File
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=1;
        for(int i=2;i<=a;i++)
        {
            if(a%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.printf("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}