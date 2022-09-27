public class SlytherinStudent extends HogwartsStudent {

    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public SlytherinStudent(int trick, int determination, int ambition, int resourcefulness, int lustForPower){
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    protected int getsSumOfMarks() {
        return this.ambition + this.trick + this.determination + this.lustForPower + this.resourcefulness;
    }

    public void matchStudents(Object object){
        SlytherinStudent student = (SlytherinStudent) object;
        String name1 = this.getNameOfStudents();
        String name2 = student.getNameOfStudents();
        if (student.getsSumOfMarks() > this.getsSumOfMarks()){
            name1 = student.getNameOfStudents();
            name2 = this.getNameOfStudents();
        }
        System.out.println( name1 + " лучший Слизеринец, чем " + name2);
    }

    @Override
    public String toString() {
        return "SlytherinStudent{" +
                "trick=" + trick +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }
}
