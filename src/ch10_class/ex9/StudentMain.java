package ch10_class.ex9;

public class StudentMain {
    public static void main(String[] args) {
        //  기본생성자로 Student 클래스 객체 만들고 setter를 이용하여 필드값 채우기
        Student student = new Student();
        student.setName("학생1");
        student.setStudentId("2023012345");
        student.setDepartment("컴퓨터공학과");
        student.setPhoneNumber("010-1234-5678");

        //  모든 필드를 매개변수로 하는 생성자로 Student 클래스 객체 만들기
        Student student2 = new Student(
                "학생2",
                "2023012346",
                "경영학과",
                "010-1234-5679");


        //  각각의 객체 print 메세드 호출하여 필드값 출력
        System.out.println("이름: " + student2.getName());
        System.out.println("학번: " + student2.getStudentId());
        System.out.println("학과: " + student2.getDepartment());
        System.out.println("전화번호: " + student2.getPhoneNumber());
    }
}