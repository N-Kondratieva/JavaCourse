package com.alee.java1.lesson1;

/**
 * Операторы сравнения
 */
public class Step06RelationalOperators {

    public static void main(String[] args) {

        int value1 = 5;
        int value2 = 10;
        /*
        *
        * Любая операция сравнения всегда возбращает true (истина) или false (ложь)
        *
        * */
        System.out.println(value1 + " равно " + value2 + " ? ");
        System.out.println(value1 + " == " + value2 + " = " + (value1 == value2)+"\n");
        System.out.println(value1 + " не равно " + value2 + " ? ");
        System.out.println(value1 + " != " + value2 + " = " + (value1 != value2)+"\n");
        System.out.println(value1 + " больше " + value2 + " ? ");
        System.out.println(value1 + " > " + value2 + " = " + (value1 > value2)+"\n");
        System.out.println(value1 + " меньше " + value2 + " ? ");
        System.out.println(value1 + " < " + value2 + " = " + (value1 < value2)+"\n");
        System.out.println(value1 + " больше или равно "+value2 + " ? ");
        System.out.println(value1 + " >> " + value2 + " = " + (value1 >= value2)+"\n");
        System.out.println(value1 + " меньше или равно "+value2 + " ? ");
        System.out.println(value1 + " << " + value2 + " = " + (value1 <= value2));
    }

}
