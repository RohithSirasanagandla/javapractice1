public class Student {
    private String studentName;
    private int age;

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentName("Rohith Sirasanagandla");
        student.setAge(26);

        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Age: " + student.getAge());
    }
}