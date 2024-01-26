import java.util.*;
public class File
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double d,h;
        if(a<=10000)
        {
            d=0.80*a;
            h=0.20*a;
        }
        else if(a>10000 && a<=20000)
        {
            d=0.9*a;
            h=0.25*a;
        }
        else
        {
            d=0.95*a;
            h=0.30*a;
        }
        System.out.printf("%.2f",a+d+h);
    }
}