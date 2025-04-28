package carter.candyquarrel;

public class HealthItem extends Item implements IUsable{
    private String name;
    private int healing;
    private double x, y;

    public HealthItem(String name, int amountHealed, double x, double y){
        this.name = name;
        this.healing = amountHealed;
        this.x = x;
        this.y = y;
    }

    public String getName(){return name;}

    public int getHealing(){
        return healing;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }
}
