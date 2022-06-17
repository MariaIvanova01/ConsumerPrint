package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] input = scan.nextLine().split(" ");

        Consumer<String[]> output = print -> Arrays.stream(input).forEach(System.out::println);
        output.accept(input);
    }
}
