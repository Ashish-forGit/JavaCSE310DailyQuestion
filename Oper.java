public class Oper {
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        int c=0;

        c=a+b;
        System.out.println("c=a+b ="+ c );

        c +=a;
        System.out.println("c += a = "+ c );

        c -= a;
        System.out.println("c -= a= "+ c);
        c= c * a;
        System.out.println("c= c* a= "+ c);

        a=10;
        b=15;
        c /=a;
        System.out.println("c /=a= "+ c);

        a=10;
        b=15;
        c %= a;
        System.out.println("c % =a = "+ c);

    }
}