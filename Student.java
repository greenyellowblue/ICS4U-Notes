public class Student {
    private String first;
    private String last;
    private int id;
    private int grade;

    private static int studentCount = 0;
    private static int totalGrade = 0;
    private static double gradeAverage = 0;

    public Student(String firstName, String lastName, int inputid, int inputgrade) {
        first = firstName;
        last = lastName;
        id = inputid;
        grade = inputgrade;

        studentCount++;
        totalGrade += grade;
        Student.calcAverage();
    }

    private static void calcAverage() {
        gradeAverage = totalGrade / studentCount;

    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public int getGrade() {
        return grade;
    }

    public int getId() {
        return id;
    }

    public static double getGradeAverage() {
        return gradeAverage;
    }

    public void setGrade(int grade) {
        totalGrade -= this.grade;
        this.grade = grade;
        totalGrade += this.grade;
        Student.calcAverage();
    }

    public void gradeBoost() {
        this.grade += this.grade >= 100 ? 0 : 1;
    }
    public static int getStudentNumber(){
    	return studentCount;
    }
    
}