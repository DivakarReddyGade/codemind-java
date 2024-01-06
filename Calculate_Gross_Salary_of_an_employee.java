import java.util.Scanner;
public class File
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double pf=0.12*a;
        double gs=a+b+c+pf;
        System.out.printf("%.2f
%.2f",pf,gs);
    }
}