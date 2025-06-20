package _21_Class.OOP;

import _21_Class.Person.Person;

public class OOP {
    public static void main(String[] args) {
        // OOP => Object Oriented Programming
        // 객체 지향 프로그래밍
        // - 현실 세계의 개념을 코드로 표현
        // - 사람, 동물, 자동차 하나의 객체로 보는것
        // - 상태(속성)과 동장(기능)을 중심으로 프로그래밍

        // OOP의 4가지 원칙
        // 1. 추상화
        // - 복잡한 내부 동작은 감추고, 꼭 필요한 기능만 보여주는 것
        // 2. 캡슐화
        // - 데이터(변수)를 보호하고, 접근을 제한하여 안정성을 높히는 것(정보은닉)
        // 3. 상속
        // 4. 다형성

        Person person = new Person();
        System.out.println(person.name);
//        System.out.println(person.age);
//        System.out.println(address);

    }
}
