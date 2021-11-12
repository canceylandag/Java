package hw3;

import java.util.Random;

public class Dice {

    public int number=6;

    public void roll(Student std){

        Random rand=new Random();
        //Actually This dice has 6 face but when I put 6 in nextInt function it gives 0 to 5 as output.
        // So I add 1 to dice number in nextInt function.
        int rolled=rand.nextInt(number+1);
        while (rolled==0){

            rolled=rand.nextInt(number+1);

        }
        System.out.println("Player "+std.Name+" rolled "+rolled+".");
        std.Number=rolled;

    }

}
