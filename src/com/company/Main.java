package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter sting: ");
        String name = scn.nextLine();
        printStringPyramid(name);
    }

    public static void printStringPyramid(String name) {
        for (int i = name.length() / 2; i > 0; i--) {
            if (!(i == name.length() / 2 && name.length() % 2 == 0)) {
                for (int j = 0; j < i; j++) {
                    System.out.print(' ');
                }
                System.out.println(subString(name,i,name.length()-i));
            }
        }

        for (int i = 0; i <= name.length() / 2; i++) {
            if (!(i == name.length() / 2 && name.length() % 2 == 0)) {
                for (int j = 0; j < i; j++) {
                    System.out.print(' ');
                }
                System.out.println(subString(name,i,name.length()-i));
            }
        }
    }

    public static String subString(String name, int start, int end) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            if(start <=i && end >i){
                stringBuilder.append(name.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
