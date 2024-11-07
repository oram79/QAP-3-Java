package Question1;

public class CollegeStudent extends Student {
    private String major;
    private int year;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major){
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;
    }

    // Getter Methods //
    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    // Setter Methods //

    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return super.toString() + ", Year: " + year + ", Major: " + major;
    }
}
