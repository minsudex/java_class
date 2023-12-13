package ch10_class.ex9;

public class Student {
    // 필드 getter/setter, 기본생성자, 매개변수 생성자

    private String getStudentId;
    /*
        이름
        학번
        학과
        전화번호
         */
    private String name;
    private String studentId;
    private String department;
    private String phoneNumber;

    //  각 필드의 getter/setter 메서드
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGetStudentId() {
        return getStudentId;
    }

    public void setGetStudentId(String getStudentId) {
        this.getStudentId = getStudentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //  기본생성자
    public Student() {
        this.name = "";
        this.studentId = "";
        this.department = "";
        this.phoneNumber = "";
    }

    // 모든 필드를 매개변수로 하는 생성자
    public Student(String name, String studentId, String department, String phoneNumber) {
        this.name = name;
        this.studentId = studentId;
        this.department = department;
        this.phoneNumber = phoneNumber;
    }


    // 필드에 저정된 값을 출력하는 print() 메서드
    public void print() {
        System.out.println(name);
        System.out.println(studentId);
        System.out.println(department);
        System.out.println(phoneNumber);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("");
        student.setStudentId("");
        student.setDepartment("");
        student.setPhoneNumber("");
        student.print();
    }
}