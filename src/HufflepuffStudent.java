public class HufflepuffStudent extends HogwartsStudent {

    private int hardworking;
    private int loyal;
    private int honest;

    public HufflepuffStudent(int hardworking, int loyal, int honest) {
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    protected int getsSumOfMarks() {
        return this.hardworking + this.honest + this.loyal;
    }

    public void matchStudents(Object object){
        HufflepuffStudent student = (HufflepuffStudent) object;
        String name1 = this.getNameOfStudents();
        String name2 = student.getNameOfStudents();
        if (student.getsSumOfMarks() > this.getsSumOfMarks()){
            name1 = student.getNameOfStudents();
            name2 = this.getNameOfStudents();
        }
        System.out.println( name1 + " лучший Пуфендуец, чем " + name2);
    }

    @Override
    public String toString() {
        return "HufflepuffStudent{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }
}
