package com.alee.java1.lesson1;

/**
 * Логические операции
 */
public class Step07LogicalOperators {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        /**
         *
         * & - логическое AND
         * возвращает true тольео если оба операнда истинны
         *
         * */
        System.out.println("& - логическое AND");
        System.out.println(a + " & " + b + " = " + (a & b) + "\n");

        /**
         *
         * | - логическое OR
         * возвращает true если один из операндов истинен
         *
         * */
        System.out.println("| - логическое OR");
        System.out.println(a + " | " + b + " = " + (a | b) + "\n");

        /**
         *
         * ^ - логическое XOR
         * возвращает true если первый операнд не равен второму
         *
         * */
        System.out.println("^ - логическое XOR");
        System.out.println(a + " ^ " + b + " = " + (a ^ b) + "\n");

        /**
         *
         * && - сокращенное AND
         * возвращает true если первый операнд не равен второму
         * если первый операнд ложен, то второй не проверяется
         *
         * */
        System.out.println("&& - сокращенное AND");
        System.out.println(a + " && " + b + " = " + (a && b) + "\n");

        /**
         *
         * || - сокращенное OR
         * возвращает true если первый операнд не равен второму
         * если первый операнд истинен, то второй не проверяетс
         *
         * */
        System.out.println("|| - сокращенное OR");
        System.out.println(a + " || " + b + " = " + (a || b));


    }

}
