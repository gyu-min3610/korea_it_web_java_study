package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "규민";
        student.age = 29;
        student.email = "zpstls2217@naver.com";
        student.address = "부산";

        student.showInfo();
    }
}
