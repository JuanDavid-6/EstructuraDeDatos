package clase6.Ejer2;

import java.util.*;

public class Sandwiches {

    public static void main(String[] args) {

        //List<String> s1 = Arrays.asList("pan blanco", "lechuga", "pan blanco");
        //List<String> s2 = Arrays.asList("pan gris", "lechuga", "pan gris");

        Deque<String> sw1 = new ArrayDeque<>();
        Deque<String> sw2 = new ArrayDeque<>();

        sw1.add("pan blanco");
        sw1.add("lechuga");
        sw1.add("pan blanco");

        sw2.add("pan blanco");
        sw2.add("lechuga");
        sw2.add("pan blanco");

        System.out.println(mismoPan(sw1 , sw2));
    }

    public static boolean mismoPan(Deque<String> s1, Deque<String> s2) {
       
        if (s1.peekFirst().equals(s2.peekFirst()) && s1.peekLast().equals(s2.peekLast())) {

            System.out.println("Los panes son iguales");
        } else {
            System.out.println("Los panes son diferentes");

        } 
        
        return s1.peekFirst().equals(s2.peekFirst()) && s1.peekLast().equals(s2.peekLast());

    }
}
