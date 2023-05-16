import javax.xml.transform.Source;

public class App {
    public static void main(String[] args) {
       Hero h1_mantissa = new Hero("<HERO> Mantissa");
       Enemy e1_morticia = new Enemy("<ENEMY> Morticia");

       System.out.println("\nTUGAS POLYMORPHISM\n");
       System.out.println("Nama: Elisabet Marisa Manalu");
       System.out.println("NIM: 225150600111032");
       System.out.println("Kelas: PTI C");

       System.out.println("Static polymorphism pada class Hero dan class Enemy");
       h1_mantissa.move();
       h1_mantissa.move("North");

       e1_morticia.move();
       e1_morticia.move(7);

        System.out.println("\nDynamic polymorphism sebuah referensi dari class Character ke objek class");
        Character karakter = new Character("<CHARACTER> Molly");
        Character h2_Scoodie = new Hero("<HERO2> Scoodie");
        Character e2_Iwakura = new Enemy("<ENEMY2> Iwakura");
        Character w_Lain = new Witch("<WITCH2> Lain");
        Character f_Molly = new Fighter("<FIGHTER2> Molly");

        karakter.move();
        h2_Scoodie.move();
        e2_Iwakura.move();
        w_Lain.move();
        f_Molly.move();

        System.out.println("\nDynamic polymorphism sebuah referensi dari class Character ke objek Witch yang berubah (di-cast) menjadi objek Fighter");
        Character w2_kana = new Witch("Wiccana");
        try { 
            ((Fighter)w2_kana).move();
         } catch (Exception e) {
            System.out.printf("Error: %s\n",e.getMessage());
        }
    }
}
