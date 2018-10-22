/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment06;

import java.util.Scanner;
public class Assignment06 {


    public static void main(String[] args) {
        int num1,num2,num3,num4;
        Scanner console=new Scanner(System.in);
System.out.print("Enter number 1: ");
num1=console.nextInt();
System.out.print("Enter number 2: ");
num2=console.nextInt();
System.out.print("Enter number 3: ");
num3=console.nextInt();
System.out.print("Enter number 4: ");
num4=console.nextInt();
//console.close();
if(num1>num2&&num1>num2&&num1>num3&&num1>num4){
    System.out.print("Number 1 is greater");}
else if(num2>num3&&num2>num4){
    System.out.print("Number 2 is greater");}
else if(num3>num4){
    System.out.print("Number 3 is greater");}
else{
    System.out.print("Number 4 is greater");}
    }
    
}
