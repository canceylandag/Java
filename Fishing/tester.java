package Fishing;

public class tester {

    public static void main(String[]args){

        Fisher f1=new Fisher("Osman",ExpLevels.FRESHMEN);
        Fisher f2=new Fisher("Ali",ExpLevels.NOVICE);
        Fisher f3=new Fisher("Ahmet",ExpLevels.SOPHOMORE);
        Fisher f4=new Fisher("Zeki",ExpLevels.SENIOR);

        Contest co=new Contest(f1,f2,f3,f4);

        co.doContest();

    }

}
