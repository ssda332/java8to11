package me.whiteship.java8to11;

@FunctionalInterface
public interface RunSomething {

    // 추상 메소드를 하나만 갖고 있으면 함수형 인터페이스
    // 어떤 메소드가 있던지간에 추상 메소드가 1개다 그럼 함수형 인터페이스
    int doIt(int number); // 인터페이스에서는 abstract 생략 가능

    static void printName() {
        System.out.println("Keesun");
    }

    default void printAge() {
        System.out.println("40");
    }
}
