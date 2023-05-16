public class Witch extends Enemy {

    public Witch(String name) {
        super(name);
    }

    public void move() {
        System.out.println(name + " is teleporting with her broom.");
    }

    public void move(int step) {
        System.out.println(name + " is teleporting " + step + " steps");
    }

}

