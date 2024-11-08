package Question1;

public class Demo {
    public static void main(String[] args) {
        System.out.println();
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);

        System.out.println();
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);

        System.out.println();
        Teacher mrJava = new Teacher("Duke Java" , 34, "M" , "Computer Science", 50000);
        System.out.println(mrJava);

        System.out.println();
        CollegeStudent ima = new CollegeStudent("Ima Frosh" , 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);
        System.out.println();
    }
    // Used empty print messages to space out and clean up the output //
}
