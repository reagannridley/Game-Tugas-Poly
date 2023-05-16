class Hero extends Character {

    public Hero(String name) {
        super(name);
    }

    public void move() {
        System.out.println(name + " use move");
    }

    public void move(String direction) {
        System.out.println(name + " is moving towards " + direction);
    }

}

