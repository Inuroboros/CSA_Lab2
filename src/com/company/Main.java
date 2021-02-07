package com.company;

import java.util.Scanner;

public class Main {

    static int i = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service Service = new Service();

        while (true) {
            System.out.println("1. Convert from Decimal to Binary");
            System.out.println("2. Convert from Binary to Decimal");
            System.out.println("3. Convert from Decimal to Octal");
            System.out.println("4. Convert from Octal to Decimal");
            System.out.println("5. Convert from Decimal to Hexadecimal");
            System.out.println("6. Convert from Hexadecimal to Decimal");
            System.out.println("7. Sum of Binary Numbers");
            System.out.println("8. Sum of Octal Numbers");
            System.out.println("9. Sum of Hexadecimal Numbers");
            System.out.println("10. Subtraction of Binary Numbers");
            System.out.println("11. Subtraction of Octal Numbers");
            System.out.println("12. Subtraction of Hexadecimal Numbers");
            System.out.println("13. Multiplication of Binary Numbers");
            System.out.println("14. Multiplication of Octal Numbers");
            System.out.println("15. Multiplication of Hexadecimal Numbers");
            System.out.println("16. Division of Binary Numbers");
            System.out.println("17. Division of Octal Numbers");
            System.out.println("18. Division of Hexadecimal Numbers");
            System.out.println("0. Exit");

            int menu = sc.nextInt();

            if (menu == 1) {
                System.out.println("Write Decimal number");
                int number = sc.nextInt();
                Service.ConvertToBinary(number);
            }
            if (menu == 2) {
                System.out.println("Write Binary number");
                int number = sc.nextInt();
                Service.ViceVersaFromBinary(number);
            }
            if (menu == 3) {
                System.out.println("Write Decimal number");
                int number = sc.nextInt();
                Service.ConvertToOctal(number);
            }
            if (menu == 4) {
                System.out.println("Write Octal number");
                int number = sc.nextInt();
                Service.ViceVersaFromOctal(number);
            }
            if (menu == 5) {
                System.out.println("Write Decimal number");
                int number = sc.nextInt();
                Service.ConvertToHexadecimal(number);
            }
            if (menu == 6) {
                System.out.println("Write Hexadecimal number");
                String number = sc.next();
                Service.ViceVersaFromHexadecimal(number);
            }
            if (menu == 7) {
                System.out.println("Write first Binary number");
                int a = sc.nextInt();
                System.out.println("Write second Binary number");
                int b = sc.nextInt();
                Service.PlusBinary(a, b);
            }
            if (menu == 8) {
                System.out.println("Write first Octal number");
                int a = sc.nextInt();
                System.out.println("Write second Octal number");
                int b = sc.nextInt();
                Service.PlusOctal(a, b);
            }
            if (menu == 9) {
                System.out.println("Write first Hexadecimal number");
                String a = sc.next();
                System.out.println("Write second Hexadecimal number");
                String b = sc.next();
                Service.PlusHexadecimal(a, b);
            }
            if (menu == 10) {
                System.out.println("Write first Binary number");
                int a = sc.nextInt();
                System.out.println("Write second Binary number");
                int b = sc.nextInt();
                Service.MinusBinary(a, b);
            }
            if (menu == 11) {
                System.out.println("Write first Octal number");
                int a = sc.nextInt();
                System.out.println("Write second Octal number");
                int b = sc.nextInt();
                Service.MinusOctal(a, b);
            }
            if (menu == 12) {
                System.out.println("Write first Hexadecimal number");
                String a = sc.next();
                System.out.println("Write second Hexadecimal number");
                String b = sc.next();
                Service.MinusHexadecimal(a, b);
            }
            if (menu == 13) {
                System.out.println("Write first Binary number");
                int a = sc.nextInt();
                System.out.println("Write second Binary number");
                int b = sc.nextInt();
                Service.MultiplicationBinary(a, b);
            }
            if (menu == 14) {
                System.out.println("Write first Octal number");
                int a = sc.nextInt();
                System.out.println("Write second Octal number");
                int b = sc.nextInt();
                Service.MultiplicationOctal(a, b);
            }
            if (menu == 15) {
                System.out.println("Write first Hexadecimal number");
                String a = sc.next();
                System.out.println("Write second Hexadecimal number");
                String b = sc.next();
                Service.MultiplicationHexadecimal(a, b);
            }
            if (menu == 16) {
                System.out.println("Write first Binary number");
                int a = sc.nextInt();
                System.out.println("Write second Binary number");
                int b = sc.nextInt();
                Service.DivisionBinary(a, b);
            }
            if (menu == 17) {
                System.out.println("Write first Octal number");
                int a = sc.nextInt();
                System.out.println("Write second Octal number");
                int b = sc.nextInt();
                Service.DivisionOctal(a, b);
            }
            if (menu == 18) {
                System.out.println("Write first Hexadecimal number");
                String a = sc.next();
                System.out.println("Write second Hexadecimal number");
                String b = sc.next();
                Service.DivisionHexadecimal(a, b);
            }
            if (menu == 0) {
                break;
            }
        }
    }
}
