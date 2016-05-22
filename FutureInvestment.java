/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.text.NumberFormat;
import java.util.Scanner;

public class FutureInvestment {
    static Double investmentAmount;
    static Double anualInterestRate;
    static int    numOfYears;
    static Double monthlyInvestmentRate;
    static Double acumulatedValue; 
    
    
    public static void main(String[]args) {
        
        
        Scanner scanValue = new Scanner(System.in);
        
        System.out.print("Enter the investment amount:");
        investmentAmount = scanValue.nextDouble();
         
        System.out.print("Enter the annual interest rate:");
        anualInterestRate = scanValue.nextDouble();
        
        System.out.print("Enter the number of years:");
        int numOfYears = scanValue.nextInt();
        
        //calculate monthly rate
        monthlyInvestmentRate = anualInterestRate / 1200;
        
        //calculate acumulated value
        acumulatedValue = investmentAmount 
                * Math.pow((1 + monthlyInvestmentRate), (numOfYears * 12));
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
	System.out.println("Your Future Investment Amount is = "
				+ defaultFormat.format(acumulatedValue));
    }

}
