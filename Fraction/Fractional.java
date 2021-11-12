package hw5;

public class Fractional {

    public int Numerator;
    public int Denumerator;

    public int gcd(int a,int b){

        while (a != b){
            if (a > b) {
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return a;

    }

    public void calculation(int c,int d){

        int common=gcd(c,d);

        if(common==1){

            System.out.println(c);
            System.out.println(d);

        }else{

            c=c/common;
            d=d/common;
            System.out.println(c);
            System.out.println("--");
            System.out.println(d);
        }

    }



}
