import java.util.Scanner;
public class File
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextInt();
        double v=1.333333*3.14*a*a*a;
        System.out.printf("%.2f",v);
    }
}