package carter.candyquarrel;

public class Note extends Item implements IUsable{
    private String name;
    private String message;

    public Note(String name,String message){
        this.name = name;
        this.message = message;
    }
}
