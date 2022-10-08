package Exam1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank b = new Bank(1000, 10);
        System.out.println(b.calculateInterest());
    }
}
