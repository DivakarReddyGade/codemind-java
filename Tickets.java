import java.util.Scanner;
public class File
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a*4<=1000)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}