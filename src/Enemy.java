public class Enemy extends Character {

    public Enemy(String name) {
        super(name);
    }

    public void move()    
    {
        System.out.println( name + " is vanishing");
    }

    public void move(int step) {
        System.out.println(name + " is moving " + step + " steps");
    }


}
