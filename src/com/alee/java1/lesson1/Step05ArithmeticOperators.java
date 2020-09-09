package com.alee.java1.lesson1;

/**
 * Арифметические операции
 */
public class Step05ArithmeticOperators {

    public static void main(String[] args) {

        short value1;
        short value2;


        value1 = 5;
        value2 = 10;
        /*
        *
        * + - операция сложения
        *
        * Так как результат может выйти за рамки значений допускаемых short, операция возвращает значение типа int
        *
        * */
        System.out.println("Операция сложения");
        System.out.println("value1 = " + value1 + " ; value2 = " + value2 + " ;");
        int result = value1 + value2;
        System.out.println("value1 + value2 = " + result + "\n");

        /*
        *
        * Если надо получить результат типа short, то для этого надо явно указать тип (привести тип int к типу short)
        *
        * */
        System.out.println("Операция сложения с приведением типа");
        System.out.println("value1 = " + value1 + " ; value2 = " + value2 + " ;");
        value1 = (short) (value1 + value2);
        System.out.println("(short) (value1 + value2) = " + result + "\n");

        /*
        *
        * Краткая форма записи операции сложения
        * результат сложения value1 и value2 будет записан в переменную value1
        *
        * */
        System.out.println("Операция сложения, краткая форма");
        System.out.println("value1 = " + value1 + " ; value2 = " + value2 + " ;");
        value1 += value2;
        System.out.println("value1 += value2 ---> value1 = " + value1 + "\n");

        /*
        *
        * ++ - инкремент
        *
        * Если необходимо увеличить число на 1, то запись может быть:
        * value1 = value1 + 1;
        * value1+=1;
        * или может быть использована еще более краткая запись, которая является операцией инкрементации
        *
        * */
        System.out.println("Инкрементация");
        System.out.println("value1 = " + value1 + " ; value2 = " + value2 + " ;");
        value1++;

        System.out.println("value1++; ---> value1 = " + value1 + "\n\n");

        value1 = 5;
        value2 = 10;
        /*
        *
        * - - операция вычитания
        *
        * Так как результат может выйти за рамки значений допускаемых short, операция возвращает значение типа int
        *
        * */
        System.out.println("Операция вычитания");
        System.out.println("value1 = " + value1 + " ; value2 = " + value2 + " ;");
        result = value1 - value2;
        System.out.println("value1 - value2 = " + result + "\n");

        /*
        *
        * Если надо получить результат типа short, то это надо явно указать тип (привести тип int к типу short)
        *
        * */
        System.out.println("Операция вычитания с приведением типа");
        System.out.println("value1 = " + value1 + " ; value2 = " + value2 + " ;");
        value1 = (short) (value1 - value2);
        System.out.println("(short) (value1 - value2) = " + result + "\n");

        /*
        *
        * Краткая форма записи операции вычитания
        * результат вычитания из value1 value2 будет записан в переменную value1
        *
        * */
        System.out.println("Операция вычитания, краткая форма");
        System.out.println("value1 = " + value1 + " ; value2 = " + value2 + " ;");
        value1 -= value2;
        System.out.println("value1 -= value2 ---> value1 = " + value1 + "\n");

        /*
        *
        * -- - декремент
        *
        * Если необходимо увеличить число на 1, то запись может быть:
        * value1 = value1 + 1;
        * value1+=1;
        * или может быть использована еще более краткая запись, которая является операцией декрементации
        *
        * */
        System.out.println("Декрементация");
        System.out.println("value1 = " + value1 + " ; value2 = " + value2 + " ;");
        value1--;
        System.out.println("value1--; ---> value1 = " + value1 + "\n\n");

        value1 = 5;
        value2 = 10;
        /*
        *
        * * - операция умножения
        *
        * Так как результат может выйти за рамки значений допускаемых short, операция возвращает значение типа int
        *
        * */
        System.out.println("Операция умножения");
        System.out.println("value1 = " + value1 + " ; value2 = " + value2 + " ;");
        result = value1 * value2;
        System.out.println("value1 * value2 = " + result + "\n");

        /*
        *
        * Если надо получить результат типа short, то это надо явно указать тип (привести тип int к типу short)
        *
        * */
        System.out.println("Операция умножения с приведением типа");
        System.out.println("value1 = " + value1 + " ; value2 = " + value2 + " ;");
        value1 = (short) (value1 * value2);
        System.out.println("(short) (value1 * value2) = " + result + "\n");

        /*
        *
        * Краткая форма записи операции умножения
        * результат умножения value1 и value2 будет записан в переменную value1
        *
        * */
        System.out.println("Операция умножения, краткая форма");
        System.out.println("value1 = " + value1 + " ; value2 = " + value2 + " ;");
        value1 *= value2;
        System.out.println("value1 *= value2 ---> value1 = " + value1 + "\n\n");

        value1 = 10;
        value2 = 4;
        /*
        *
        * / - операция деления
        *
        * Так как результат может выйти за рамки значений допускаемых short, операция возвращает значение типа int
        *
        * */
        System.out.println("Операция деления");
        System.out.println("value1 = " + value1 + " ; value2 = " + value2 + " ;");
        result = value1 / value2;
        System.out.println("value1 / value2 = " + result + "\n");

        /*
        *
        * Если надо получить результат с дробной частью, то надо явно указать что делимое или делитель имеют тип хранящий значения с плавающей точнокй
        *
        * */
        System.out.println("Операция деления c остатком");
        System.out.println("value1 = " + value1 + " ; value2 = " + value2 + " ;");
        float floatResult = (float) value1 / value2;
        System.out.println("(float) value1 / value2 = " + floatResult);
        floatResult = value1 / (float) value2;
        System.out.println("value1 / (float) value2 = " + floatResult + "\n");

        /*
        *
        * Краткая форма записи операции деления
        * результат деления value1 на value2 будет записан в переменную value1
        *
        * */
        System.out.println("Операция деления, краткая форма");
        System.out.println("value1 = " + value1 + " ; value2 = " + value2 + " ;");
        value1 /= value2;
        System.out.println("value1 /= value2 ---> value1 = " + value1 + "\n\n");


        value1 = 5;
        value2 = 10;
        /*
        *
        * % - операция деления по модулю (остаток от деления)
        *
        * Так как результат может выйти за рамки значений допускаемых short, операция возвращает значение типа int
        *
        * */
        System.out.println("Остаток от деления");
        System.out.println("value1 = " + value1 + " ; value2 = " + value2 + " ;");
        result = value1 % value2;
        System.out.println("value1 % value2 = " + result + "\n");

        /*
        *
        * Если надо получить результат типа short, то это надо явно указать тип (привести тип int к типу short)
        *
        * */
        System.out.println("Остаток от деления с приведением типа");
        System.out.println("value1 = " + value1 + " ; value2 = " + value2 + " ;");
        value1 = (short) (value1 % value2);
        System.out.println("(short) (value1 % value2) = " + result + "\n");

        /*
        *
        * Краткая форма записи операции деления
        * результат деления value1 на value2 будет записан в переменную value1
        *
        * */
        System.out.println("Остаток от деления, краткая форма");
        System.out.println("value1 = " + value1 + " ; value2 = " + value2 + " ;");
        value1 %= value2;
        System.out.println("value1 %= value2 ---> value1 = " + value1);
    }

}
