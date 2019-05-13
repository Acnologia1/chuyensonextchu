package com.company;
import java.util.Scanner;
import  java.lang.String;

public class chuyensothanhchu {
    public  static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can chuyen doi");
        number = scanner.nextInt();
        if(number <=20 && number >0) {
            String doc20 = doc20(number);
            System.out.println(doc20);
        }
        if(number >20 && number <100)
        {
            int so1 = number/10;
            int so2 = number % 10;
            String doc1 = doc100(so1);
            String doc2 = doc20(so2);
            System.out.println(doc1+" "+doc2);

        }
        if( number >=100 && number <1000)
        {
            int so11 = number%100;
            int so2 = so11/10;
            int so1 = so11 % 10;
            int so3 = number /100;
            String doc1 = doc20(so1);
            String doc2 = doc100(so2);
            String doc3 = doc1000(so3);
            System.out.println(doc3+" "+doc2+" and "+ doc1);
        }
    }
    public  static String doc1000(int number)
    {
        String text = "";
        switch (number){
            case 1:
                text ="one hundred";
                break;
            case 2:
                text = "two hundred";
                break;
            case 3:
                text = "three hundred";
                break;
            case 4:
                text ="four hundred";
                break;
            case 5:
                text = "five hundred";
                break;
            case 6:
                text = "six hundred";
                break;
            case 7:
                text = "seven hundred";
                break;
            case 8:
                text = "eigh hundred";
                break;
            case 9:
                text = "nine hundred";
                break;
        }
        return text;
    }
    public static String doc100(int number){
        String text ="";
        switch (number){
            case 2:
                text = "twenty";
                break;
            case 3:
                text = "thirty";
                break;
            case 4:
                text ="forty";
                break;
            case 5:
                text = "fivety";
                break;
            case 6:
                text = "sixty";
                break;
            case 7:
                text = "seventy";
                break;
            case 8:
                text = "eighty";
                break;
            case 9:
                text = "ninety";
                break;
        }
        return text;
    }
    public  static String doc20(int number){
        String text ="";
        switch (number)
        {
            case 1:
                text = "one";
                break;
            case 2:
                text = "two";
                break;
            case 3:
                text = "three";
                break;
            case 4:
                text = "four";
                break;
            case 5:
                text ="five";
                break;
            case 6:
                text ="six";
                break;
            case 7:
                text = "Seven";
                break;
            case 8:
                text = "Eight";
                break;
            case 9:
                text = "Nine";
                break;
            case 10:
                text = "Ten";
                break;
            case 11:
                text = "Eleven";
                break;
            case 12:
                text = "twelve";
                break;
            case 13:
                text = "thirteen";
                break;
            case 14:
                text = "fourteen";
                break;
            case 15:
                text = "fiveteen";
                break;
            case 16:
                text = "Sixteen";
                break;
            case 17:
                text = "Seventeen";
                break;
            case 18:
                text = "Eighteen";
                break;
            case 19:
                text = "Nineteen";
                break;
            case 20:
                text = "Twenty";
                break;
                default:
                    System.out.println("out of ability");
                    break;
        }
        return text;
    }
}
