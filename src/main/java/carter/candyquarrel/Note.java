package carter.candyquarrel;

public class Note extends Item implements IUsable{
    private String name;
    private String message;
    private double x, y;

    public Note(String name,String message, double x, double y){
        this.name = name;
        this.message = message;
        this.x = x;
        this.y = y;
    }

    public String getMessage(){
        return message;
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
