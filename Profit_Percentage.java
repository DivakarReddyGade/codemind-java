import java.util.*;
public class File
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextInt();
        float b=sc.nextInt();
        System.out.printf("%.2f",((b-a)/a)*100);
    }
}