package Fishing;

public class Fisher {

    public String Name;
    private int Basket=0;
    private float Probability=0.5f;
    ExpLevels a;

    public Fisher(String a,ExpLevels c){

        this.Name=a;
        this.a=c;
        this.calc_probability(c);

    }
    void calc_probability(ExpLevels b){
        switch(b){

            case NOVICE:
                this.Probability=this.Probability-0.0f;
                break;
            case FRESHMEN:
                this.Probability=this.Probability-0.5f;
                break;
            case SOPHOMORE:
                this.Probability=this.Probability-0.1f;
            case SENIOR:
                this.Probability=this.Probability-0.15f;
                break;
        }


    }
    void setBasket(int a){

        this.Basket=a;

    }
    public int getBasket(){

        return this.Basket;
    }
    public float getProbability(){

        return this.Probability;

    }
    public void setProbability(float a){

        this.Probability=a;

    }


}
