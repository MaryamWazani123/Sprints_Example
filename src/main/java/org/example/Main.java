package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface PrintName {
    void print();
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Create a functional interface to print your name and use Lambda Expressions to implement it.");
        PrintName printMyName = () -> System.out.println("My name is Mariam Alwazani");
        printMyName.print();

        System.out.println("Write a Predicate to check if a string starts with the letter \"A\".");
        Predicate<String> startsWithA = str -> str.startsWith("A");
        System.out.println(startsWithA.test("Aya"));
        System.out.println(startsWithA.test("Mariam"));

        System.out.println("Use a Consumer to print each element in a list of integers.");
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        Consumer<Integer> printInt = intg -> System.out.println(intg);
        integers.forEach(printInt);

        System.out.println("Write a Function that converts a string to its uppercase equivalent.");
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        System.out.println(toUpperCase.apply("hello"));

        System.out.println("Create a Supplier that returns the current system time in milliseconds.");
        Supplier<Long> current_time = () -> System.currentTimeMillis();
        System.out.println("Current Time in MilliSeconds: " + current_time.get());

        System.out.println("Use Streams to filter odd numbers from a list and print them.");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        numbers.stream().filter(n -> n % 2 != 0).forEach(number -> System.out.println(number));

        System.out.println("Compute the sum of even numbers in a list using Streams.");
        AtomicInteger sumOfEvens = new AtomicInteger(0);
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> sumOfEvens.addAndGet(n));
        System.out.println("Sum of even numbers: " + sumOfEvens.get());
    }
}

