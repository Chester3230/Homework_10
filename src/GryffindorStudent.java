public class GryffindorStudent extends HogwartsStudent {

   private int honor;
   private int brave;
   private int nobility;

   public GryffindorStudent(int honor, int brave, int nobility){
      this.honor = honor;
      this.brave = brave;
      this.nobility = nobility;
   }


   public int getHonor() {
      return honor;
   }

   public int getBrave() {
      return brave;
   }

   public int getNobility() {
      return nobility;
   }

   @Override
   protected int getsSumOfMarks(){
      return this.brave + this.honor + this.nobility;
   }

   public void matchStudents(Object object){
      GryffindorStudent student = (GryffindorStudent) object;

      String name1 = this.getNameOfStudents();
      String name2 = student.getNameOfStudents();
      if (student.getsSumOfMarks() > this.getsSumOfMarks()){
         name1 = student.getNameOfStudents();
         name2 = this.getNameOfStudents();
      }
      System.out.println( name1 + " лучший Гриффиндорец, чем " + name2);
   }

   @Override
   public String toString() {
      return super.toString() + " GryffindorStudent{" +
              "honor=" + honor +
              ", brave=" + brave +
              ", nobility=" + nobility +
              '}';
   }
}
