package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] array = new int[]{10,20,30,40,50,60,70,80,90,33333};

        //проверку на четность элемента
        int[] result = Sequence.filter(array, number -> number % 2 == 0);
        for (int number : result)
        {
            System.out.print(number+ " ");
        }

        //проверку, является ли сумма цифр элемента четным числом.
        result = Sequence.filter(array, number -> {
            int sum = 0;
            while (number != 0) {
                sum += (number % 10);
                number /= 10;
            }
            return sum % 2 == 0;
        });
        System.out.println(" ");
        for (int number : result)
        {
            System.out.print(number+ " ");
        }

        //Доп. задача: проверка на четность всех цифр числа. (число состоит из цифр)
        result = Sequence.filter(array, number -> {
            boolean isEven;
            while (number != 0) {
                isEven = (number % 10) % 2 == 0;
                if (!isEven)
                    return false;
                number /= 10;
            }
            return true;
        });
        System.out.println(" ");
        for (int number : result)
        {
            System.out.print(number+ " ");
        }

        //Доп. задача: проверка на палиндромность числа (число читается одинаково и слева, и справа -> 11 - палиндром, 12 - нет, 3333 - палиндром, 3211 - нет, и т.д.).
        result = Sequence.filter(array, number -> {
            StringBuilder num = new StringBuilder();
            num.append(number);
            for(int i = 0; i < num.length() / 2; i++)
            {
                if (num.charAt(i) != num.charAt(num.length() - 1))
                    return false;
            }
            return true;
        });
        System.out.println(" ");
        for (int number : result)
        {
            System.out.print(number+ " ");
        }
    }
}
