package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Simplest exception ever.");
        } catch (Exception e) {
            System.out.println("Simplest exception ever has been handled.");
        }
    }
}
