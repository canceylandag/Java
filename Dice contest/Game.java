package hw3;

public class Game {

    public static void main(String[]args){
        String Winner=null;
        Student Player1=new Student();
        Student Player2=new Student();
        Dice d=new Dice();

        Player1.Name="Can";
        Player2.Name="Taylan";

        System.out.println("Welcome to the dice game.");
        while(Winner==null){
        d.roll(Player1);
        d.roll(Player2);

        if(Player1.Number>Player2.Number){

            Winner=Player1.Name;
            System.out.println("Winner is "+ Player1.Name+".");

        }else if(Player2.Number>Player1.Number){


            Winner=Player2.Name;
            System.out.println("Winner is "+ Player2.Name+".");
        }else{

            Winner=null;
            System.out.println("There is no winner so re rolling.");

        }
        }

    }


}
