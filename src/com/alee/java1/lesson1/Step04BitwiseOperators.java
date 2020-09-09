package com.alee.java1.lesson1;

/**
 * Побитовые операции
 */
public class Step04BitwiseOperators {

    public static void main(String[] args) {

        /*
        *
        * При переводе в двоичное представление 53 равно 00110101
        *
        * */
        byte a = 53;

        /*
        *
        * При переводе в двоичное представление 11 равно 00001011
        *
        * */
        byte b = 11;

        /*
        *
        * ~ - Побитовый унарный оператор NOT (НЕ)
        * При выполнении операции происходит инвертирование всех битов операнда
        *
        * a = 00110101
        * инвертируем биты и получаем 11001010
        *
        * */
        System.out.println("~ - Побитовый унарный оператор NOT (НЕ)");
        System.out.println("a = " + a + " ---> ~a = " + ~a + "\n");

        /*
        *
        * &   - Побитовое AND (И)
        * При выполнении операции сравниваем по И каждую пару бит
        *
        * a = 00110101
        * b = 00001011
        * получаем результат 00000001
        *
        * допустима запись a &= b; она эквивалентна a = a & b;
        *
        * */
        System.out.println("& - Побитовое AND (И)");
        System.out.println("a = " + a + " b = " + b + " ---> a&b = " + (a & b)+"\n");

        /*
        *
        * |   - Побитовое OR (ИЛИ)
        * При выполнении операции сравниваем по ИЛИ каждую пару бит
        *
        * a = 00110101
        * b = 00001011
        * получаем результат 00111111
        *
        * допустима запись a |= b; она эквивалентна a = a | b;
        *
        * */
        System.out.println("|   - Побитовое OR (ИЛИ)");
        System.out.println("a = " + a + " b = " + b + " ---> a|b = " + (a | b)+"\n");

        /*
        *
        * ^   - Побитовое исключающее OR
        * При выполнении операции сравниваем каждую пару бит и записываем
        *   1 - если биты разные
        *   0 - если биты одинаковые
        *
        * a = 00110101
        * b = 00001011
        * получаем результат 00111110
        *
        * допустима запись a ^= b; она эквивалентна a = a ^ b;
        *
        * */
        System.out.println("^   - Побитовое исключающее OR");
        System.out.println("a = " + a + " b = " + b + " ---> a^b = " + (a ^ b)+"\n");

        /*
        *
        * >>  - Сдвиг вправо
        * При выполнении операции сдвигаем все биты вправо на указываемое число позиций
        *
        * a = 00110101
        * получаем результат 00011010
        *
        * допустима запись a >>= 1; она эквивалентна a = a>>1;
        *
        * */

        System.out.println(">>  - Сдвиг вправо");
        System.out.println("a = " + a + " ---> a>> = " + (a>>1)+"\n");

        /*
        *
        * <<  - Сдвиг влево
        * При выполнении операции сдвигаем все биты влево на указываемое число позиций
        *
        * a = 00110101
        * получаем результат 01101010
        *
        * допустима запись a <<= 1; она эквивалентна a = a<<1;
        *
        * */
        System.out.println("<<  - Сдвиг влево");
        System.out.println("a = " + a + " ---> a<< = " + (a<<1)+"\n");

        /*
        *
        * ">>> - Сдвиг вправо с заполнением нулями
        * При выполнении операции приводим переменную к int b сдвигаем все биты вправо на указываемое число позиций
        *
        * a = 00110101
        * получаем результат 00000000000000000000000000011010
        *\
        * допустима запись a >>>= 1; она эквивалентна a = a>>>1;
        *
        * */

        System.out.println(">>> - Сдвиг в право с заполнением нулями");
        System.out.println("a = " + a + " ---> a>>> = " + ((a>>>1))+"\n");
    }


}