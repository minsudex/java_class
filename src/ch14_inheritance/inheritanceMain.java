package ch14_inheritance;

public class inheritanceMain {
    ParentClass parentClass = new PerantClass();
    parantclass.setName("이름1");
    parentclass.setAge(10)
    System.out.println("parentClass =" parentclass)
    parentClass.hello():

    childClass childClass = new ChildClass();
    // 상속을 받았기 때문에 자식클래스에서 get, set 메서드 사용가능
    childclass.setName("자식이름1");
    childClass.setAge(100);
    System.out.prinln("childClass = " + childClass);
    childClass.hello();

    // 좌변 : 부모타입의 객체, 우변: 자식클래스 생성자
    PerantClass perantClass = new childClass)();
    ParantClass1.hello():
    parantclass1 = new PerantClass();
    PerantClass1.hello();
    // 우변 : 자식타입의 객체, 우변: 부모클래스 생성자
    ChildClass childClass1 = (childClass) new ParentClass():
}
}