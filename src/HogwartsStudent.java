public abstract class HogwartsStudent {
    private int powerOfMagic;
    private int apparitionRange;

    private String nameOfStudents;

    protected int getsSumOfMarks(){
        return this.powerOfMagic + this.apparitionRange;
    }

    public void matchStudent(Object object){
        HogwartsStudent student = (HogwartsStudent) object;

        String name1 = this.getNameOfStudents();
        String name2 = student.getNameOfStudents();

        if (student.getApparitionRange() > this.getApparitionRange()){
            System.out.println( name1 + " трансгресирует дальше, чем " + this.nameOfStudents);
        }else {
            System.out.println( this.nameOfStudents + " трансгресирует дальше, чем " + name2);
        }

        if (student.getPowerOfMagic() > this.getPowerOfMagic()){
            System.out.println( this.nameOfStudents + " обладает большей магией, чем " + student.getNameOfStudents());
        }else {
            System.out.println(  student.getNameOfStudents() + " обладает большей магией, чем " + this.nameOfStudents);
        }
    }

    public String getNameOfStudents() {
        return nameOfStudents;
    }

    public void setNameOfStudents(String nameOfStudents) {
        this.nameOfStudents = nameOfStudents;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getApparitionRange() {
        return apparitionRange;
    }

    public void setApparitionRange(int apparitionRange) {
        this.apparitionRange = apparitionRange;
    }


    @Override
    public int hashCode() {
        int result = powerOfMagic;
        result = 31 * result + apparitionRange;
        return result;
    }

    public String toString() {
        return "HogwartsStudent{" +
                "powerOfMagic=" + powerOfMagic +
                ", apparitionRange=" + apparitionRange +
                ", nameOfStudents='" + nameOfStudents + '\'' +
                '}';
    }
}
