package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("규민",29,"zpstls2217@naver.com","부산");
            student.setName("몽돌");
            student.setAge(3);
//        student.name = "규민";
//        student.age = 29;
//        student.email = "zpstls2217@naver.com";
//        student.address = "부산";
//        System.out.println(student.name);
        System.out.println(student.getEmail());
        student.showInfo();
    }
}
