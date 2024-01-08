import java.util.Scanner;
public class File
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        System.out.printf("%.2f",Math.sqrt((a*a)+(b*b)));
    }
}