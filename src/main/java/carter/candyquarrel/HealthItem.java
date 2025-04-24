package carter.candyquarrel;

public class HealthItem extends Item implements IUsable{
    private String name;
    private int healing;

    public HealthItem(String name, int amountHealed){
        this.name = name;
        this.healing = amountHealed;
    }

    public String getName(){return name;}

    public int getHealing(){
        return healing;
    }
}
