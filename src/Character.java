public class Character {
    protected String name;

    public Character(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println(name + " is moving");
    }

}