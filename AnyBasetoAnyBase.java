import java.util.*;
public class AnyBasetoAnyBase
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int b1=s.nextInt();
        int b2=s.nextInt();
        int d=anybasetoanybase(n,b1,b2);
        System.out.println(d);
    }
    public static int anybasetoanybase(int n,int b1,int b2)
    {
        int anybasetodeci=anybasetodecimal(n,b1);
        int decitoanybase=decimaltoanybase(anybasetodeci,b2);
        return decitoanybase;
    }
    public static int decimaltoanybase(int n,int b){
        int rv=0;
        int power=1;
        while(n>0){
            int dig=n%b;
            n=n/b;
            rv+=dig*power;
            power=power*10;
        }
        return  rv;
    }
    public static int anybasetodecimal(int n,int b)
    {
        int rv=0;
        int power=1;
        while(n>0)
        {
            int dig=n%10;
            n=n/10;
            rv+=dig*power;
            power=power*b;
        }
        return rv;
    }
}
