package Fishing;


import java.util.Random;

public class Contest {
    private String Winner;
    Random r=new Random();
    Fisher a,b,c,d;

    public Contest(Fisher f1,Fisher f2,Fisher f3, Fisher f4){

        this.a=f1;
        this.b=f2;
        this.c=f3;
        this.d=f4;


    }
   public void doContest(){
        for(int i=0;i<10;i++){

            Calaculate(this.a);
            Calaculate(this.b);
            Calaculate(this.c);
            Calaculate(this.d);



        }
        Compare(a,b,c,d);
        System.out.println("Winner is "+ this.Winner+".");
    }
   public void Calaculate(Fisher mo){
    float luck=r.nextFloat();

    if(luck<mo.getProbability()){

        mo.setBasket(0);

    }else{

        int bb=r.nextInt(7);
        bb=bb+mo.getBasket();
        mo.setBasket(bb);

    }



   }

   public void Compare(Fisher a1,Fisher a2,Fisher a3,Fisher a4){

        if((a1.getBasket()> a2.getBasket())&&(a1.getBasket()> a3.getBasket())&&(a1.getBasket()> a4.getBasket())){

            this.Winner=a1.Name;


        }else if((a2.getBasket()> a1.getBasket())&&(a2.getBasket()> a3.getBasket())&&(a2.getBasket()> a4.getBasket())){

            this.Winner=a2.Name;

        }else if((a3.getBasket()> a1.getBasket())&&(a3.getBasket()> a2.getBasket())&&(a3.getBasket()> a4.getBasket())){

            this.Winner=a3.Name;

        }else if((a4.getBasket()> a1.getBasket())&&(a4.getBasket()> a2.getBasket())&&(a4.getBasket()> a3.getBasket())){

            this.Winner=a4.Name;

        }else{

            this.Winner="No winner";

        }



   }

}
