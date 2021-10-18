/*Create class Number with only one private instance variable as a int primitive type.
 Initialize it with parameterised constructor and include the following methods  isZero( ),
  isPositive(), isNegative( ), isOdd( ), isEven( ), isPrime(), isAmstrong()
        the above methods return boolean primitive type value.
        getFactorial(), getSqrt(), getSqr(), sumDigits()  these methods return int primitive type value.
        dispBinary(), dispOctal(), displayhexa() these method return string */



import java.util.Scanner;
public class Demo1 {
    private int a;

    public int getA()
    {
        return a;
    }

    Demo1(int a)

    {
        this.a=a;
    }
    public boolean isZero(int a)
    {
        if(a==0)
            return true;
        else
            return false;
    }

    public boolean isPositive(int a)
    {
        if(a>0)
            return true;
        else
            return false;

    }
    public boolean isNegative(int a)
    {
        if(a<0)
            return true;
        else
            return false;
    }
    public boolean isEven(int a)
    {
        if(a%2==0)
            return true;
        else
            return false;

    }
    public boolean isOdd(int a)
    {
        if(a%2==1)
            return true;
        else
            return false;
    }
    public boolean isPrime(int a)
    {
        int c=0;
        for(int i=2;i<a;i++)
        {
            if(a%i!=0)
                c=c+1;
            else
                break;
        }
        if(c==(a-2))
            return true;
        else
            return false;

    }
    public boolean isArmstrong(int a)
    {
        int n,d=0,o;
        o=a;
        int c=Integer.toString(a).length();
        for(int i=1;i<=c;i++)
        {

                n=a%10;
                d=d+(int)Math.pow(n,c);
                a=a/10;



        }
        if(o==d)
            return true;
        else
            return false;

    }
    public int getSqrt(int a)

    {
        return (int) Math.pow(a, 0.5);
    }
    public int getSqr(int a)
    {
        return (int) Math.pow(a, 2);
    }

    public String getFactorial(int a)
    {
        String s=" ";
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
                s=Integer.toString(i)+ " , ";

        }
        return s;
    }
    public int sumDigits(int a)
    {
        int d,e=0;
        int c=Integer.toString(a).length();
        for(int i=1;i<=c;i++)
        {
            d=a%10;
            e=e+d;
            a=a/10;
        }
        return e;

    }
    public String dispBinary(int a)
    {
        return Integer.toBinaryString(a);
    }
    public String dispOctal(int a)
    {
        return Integer.toOctalString(a);
    }
    public String displayHexa(int a)
    {
        return Integer.toHexString(a);
    }
}

class Kick{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int b=s.nextInt();
        Demo1 obj =new Demo1(b);
        boolean z=obj.isZero(b);
        boolean c=obj.isPositive(b);
        boolean d=obj.isNegative(b);
        boolean e=obj.isEven(b);
        boolean f=obj.isOdd(b);
        boolean g=obj.isPrime(b);
        boolean h=obj.isArmstrong(b);
        String u=obj.getFactorial(b);
        int i=obj.getSqrt(b);
        int j=obj.getSqr(b);
        int k=obj.sumDigits(b);
        String l=obj.dispBinary(b);
        String m=obj.dispOctal(b);
        String n=obj.displayHexa(b);


        System.out.println(z);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(u);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
    }
}