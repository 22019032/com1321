/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arithmetic;

import java.util.Scanner;

/**
 *
 * @author SEBOLA
 */
import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
         Scanner input=new Scanner (System.in);
        System.out.println("enter first integer");
        int num1=input.nextInt();
        System.out.print("enter second integer");
        int num2=input.nextInt();
        int difference= num1-num2;
        System.out.print("your answer is "+difference);
    }
}
