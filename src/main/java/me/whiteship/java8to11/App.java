package me.whiteship.java8to11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        int baseNumber = 10;

        // 익명 내부 클래스 anonymous inner class
        RunSomething runSomething = new RunSomething() {
            @Override
            public int doIt(int number) {
                return number + 10;
            }
        };

        RunSomething runSomething1 = (number) -> number + 10;

        System.out.println(runSomething1.doIt(10));

        /*  자바에서의 함수형 프로그래밍
                함수를 First class object로 사용할 수 있다. -> 만들어진 구현체(runSomething)가
                함수처럼 보이기 때문에 이것을 리턴하고 메소드의 파라미터로 넣고 변수에 할당할 수 있다.

                - 고차함수도 위와 같은 이야기

                순수 함수
                함수 밖에 있는 값을 변경하거나 사용하지 않는다.(참조는 가능)

        */
        System.out.println("=============================");

        List<String> name = new ArrayList<>();
        name.add("keesun");
        name.add("whiteship");
        name.add("toby");
        name.add("foo");

        Stream<String> stringStream = name.stream().map(String::toUpperCase);

        name.forEach(System.out::println);

        System.out.println("=========================");
        /*Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        name.sort(compareToIgnoreCase.reversed().thenComparing((s) -> ""));
        name.forEach(System.out::println);*/



        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multifly2 = (i) -> i * 2;

        System.out.println(plus10.andThen(multifly2).apply(2));

    }
}
