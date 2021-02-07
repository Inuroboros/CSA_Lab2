package com.company;

public class Service {
    static void ConvertToBinary(int number) {

        int a[] = new int[20];
        int i;
        String binary = "";

        while (number > 0) {

            i = number % 2;
            number = number / 2;
            binary = i + binary;

        }
        System.out.println(binary + "\n");
    }

    static void ConvertToOctal(int number) {
        int a[] = new int[20];
        int i;
        String octal = "";

        while (number > 0) {

            i = number % 8;
            number = number / 8;
            octal = i + octal;

        }
        System.out.println(octal + "\n");
    }

    static void ConvertToHexadecimal(int number) {

        char a[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int i;
        String hexdec = "";

        while (number > 0) {

            i = number % 16;
            number = number / 16;
            hexdec = a[i] + hexdec;

        }
        System.out.println(hexdec + "\n");
    }

    static void ViceVersaFromBinary(int number){
        int i = 0;
        int decimal = 0;

        while (number > 0){

            decimal = decimal + (number % 10) * (int) Math.pow(2, i);
            i++;
            number = number / 10;

        }
        System.out.println(decimal + "\n");
    }

    static void ViceVersaFromOctal(int number){
        int i = 0;
        int decimal = 0;

        while (number > 0){

            decimal = decimal + (number % 10) * (int) Math.pow(8, i);
            i++;
            number = number / 10;

        }
        System.out.println(decimal + "\n");
    }

    static void ViceVersaFromHexadecimal(String number){
        number = number.toUpperCase();
        String a = "0123456789ABCDEF";
        int decimal = 0;

        for (int i = 0; i < number.length(); i++){

            char hex = number.charAt(i);
            int b = a.indexOf(hex);
            decimal = 16 * decimal + b;

        }
        System.out.print(decimal + "\n");
    }

    static void PlusBinary(int a, int b){
        int c = a + b;
        ViceVersaFromBinary(c);
    }

    static void PlusOctal(int a, int b){
        int c = a + b;
        ViceVersaFromOctal(c);
    }

    static void PlusHexadecimal(String a, String b){
        int c = Integer.parseInt(a, 16) + Integer.parseInt(b,16);
        System.out.println(c);
    }

    static void MinusBinary(int a, int b){
        if (a > b){
            int c = a - b;
            ViceVersaFromBinary(c);
        }
        else if (a < b){
            int c = b - a;
            ViceVersaFromBinary(c);
        }
        else{
            int c = 0;
            ViceVersaFromBinary(c);
        }
    }

    static void MinusOctal(int a, int b){
        if (a > b){
            int c = a - b;
            ViceVersaFromOctal(c);
        }
        else if (a < b){
            int c = b - a;
            ViceVersaFromOctal(c);
        }
        else{
            int c = 0;
            ViceVersaFromOctal(c);
        }
    }

    static void MinusHexadecimal(String a, String b){
        int x = Integer.parseInt(a, 16);
        int y = Integer.parseInt(b, 16);
        if (x > y){
            int c = x - y;
            System.out.println(c);
        }
        else if (x < y){
            int c = y - x;
            System.out.println(c);
        }
        else{
            int c = 0;
            System.out.println(c);
        }
    }

    static void MultiplicationBinary(int a, int b){
        int c = a * b;
        ViceVersaFromBinary(c);
    }

    static void MultiplicationOctal(int a, int b){
        int c = a * b;
        ViceVersaFromOctal(c);
    }

    static void MultiplicationHexadecimal(String a, String b){
        int c = Integer.parseInt(a, 16) * Integer.parseInt(b,16);
        System.out.println(c);
    }

    static void DivisionBinary(int a, int b){
        if (a > b){
            int c = a / b;
            ViceVersaFromBinary(c);
        }
        else if (a < b){
            int c = b / a;
            ViceVersaFromBinary(c);
        }
        else{
            int c = 1;
            ViceVersaFromBinary(c);
        }
    }

    static void DivisionOctal(int a, int b){
        if (a > b){
            int c = a / b;
            ViceVersaFromOctal(c);
        }
        else if (a < b){
            int c = b / a;
            ViceVersaFromOctal(c);
        }
        else{
            int c = 1;
            ViceVersaFromOctal(c);
        }
    }

    static void DivisionHexadecimal(String a, String b){
        int x = Integer.parseInt(a, 16);
        int y = Integer.parseInt(b, 16);
        if (x > y){
            int c = x / y;
            System.out.println(c);
        }
        else if (x < y){
            int c = y / x;
            System.out.println(c);
        }
        else{
            int c = 1;
            System.out.println(c);
        }
    }

}

