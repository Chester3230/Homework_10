public class Main {
    public static void main(String[] args) {

        GryffindorStudent harry = new GryffindorStudent(100, 70, 60 );
        harry.setApparitionRange(200);
        harry.setPowerOfMagic(90);
        harry.setNameOfStudents("Harry Potter");

        GryffindorStudent hermione = new GryffindorStudent (90, 80, 100);
        hermione.setApparitionRange(350);
        hermione.setPowerOfMagic(170);
        hermione.setNameOfStudents("Hermione Granger");

        GryffindorStudent ron = new GryffindorStudent (40, 80, 90);
        ron.setApparitionRange(25);
        ron.setPowerOfMagic(155);
        ron.setNameOfStudents("Ron Weasley");

        SlytherinStudent draco = new SlytherinStudent(90, 70, 95, 65, 100);
        draco.setApparitionRange(180);
        draco.setPowerOfMagic(1000);
        draco.setNameOfStudents("Draco Malfoy");

        SlytherinStudent graham = new SlytherinStudent(60, 80, 80, 20, 97);
        graham.setApparitionRange(140);
        graham.setPowerOfMagic(255);
        graham.setNameOfStudents("Graham Montague");

        SlytherinStudent gregory = new SlytherinStudent(90, 70, 90, 50, 20);
        gregory.setApparitionRange(120);
        gregory.setPowerOfMagic(190);
        gregory.setNameOfStudents("Gregory Goyle");

        HufflepuffStudent zachariah = new HufflepuffStudent(100, 50, 70);
        zachariah.setApparitionRange(80);
        zachariah.setPowerOfMagic(200);
        zachariah.setNameOfStudents("Zachariah Smith");

        HufflepuffStudent cedric = new HufflepuffStudent(10, 40, 70);
        cedric.setApparitionRange(90);
        cedric.setPowerOfMagic(60);
        cedric.setNameOfStudents("Cedric Diggory");

        HufflepuffStudent justin = new HufflepuffStudent(70, 30, 25);
        justin.setApparitionRange(55);
        justin.setPowerOfMagic(22);
        justin.setNameOfStudents("Justin Finch-Fletchley");

        RavenclawStudent zhou = new RavenclawStudent(70, 30, 25, 11);
        zhou.setApparitionRange(15);
        zhou.setPowerOfMagic(75);
        zhou.setNameOfStudents("Zhou Chang");

        RavenclawStudent padma = new RavenclawStudent(70, 30, 25, 31);
        padma.setApparitionRange(30);
        padma.setPowerOfMagic(66);
        padma.setNameOfStudents("Padma Patil");

        RavenclawStudent marcus = new RavenclawStudent(78, 55, 75, 71);
        marcus.setApparitionRange(73);
        marcus.setPowerOfMagic(42);
        marcus.setNameOfStudents("Marcus Belby");

        harry.matchStudents(hermione);
        draco.matchStudents(gregory);
        justin.matchStudents(cedric);
        harry.matchStudent(padma);
    }
}