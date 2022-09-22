public class RavenclawStudent extends HogwartsStudent {

    private int smart;
    private int wisdom;
    private int ingenious;
    private int creative;

    public RavenclawStudent(int smart, int wisdom, int ingenious, int creative){
        this.smart = smart;
        this.wisdom = wisdom;
        this.ingenious = ingenious;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getIngenious() {
        return ingenious;
    }

    public int getCreative() {
        return creative;
    }

    @Override
    protected int getsSumOfMarks() {
        return this.creative + this.ingenious + this.wisdom + this.smart;
    }

    public void matchStudents(Object object){
        RavenclawStudent student = (RavenclawStudent) object;
        String name1 = this.getNameOfStudents();
        String name2 = student.getNameOfStudents();
        if (student.getsSumOfMarks() > this.getsSumOfMarks()){
            name1 = student.getNameOfStudents();
            name2 = this.getNameOfStudents();
        }
        System.out.println( name1 + " лучший Когтевранец, чем " + name2);
    }

    @Override
    public String toString() {
        return "RavenclawStudent{" +
                "smart=" + smart +
                ", wisdom=" + wisdom +
                ", ingenious=" + ingenious +
                ", creative=" + creative +
                '}';
    }
}
