/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.text.NumberFormat;
import java.util.Scanner;

public class FutureInvestment {
    public Double investmentAmount;
    public Double anualInterestRate;
    public int    numOfYears;
    public Double monthlyInvestmentRate;
    public Double acumulatedValue; 
    
    
    public static void main(String[]args) {
        
        
        Scanner scanValue = new Scanner(System.in);
        
        System.out.print("Enter the investment amount:");
        Double investmentAmount = scanValue.nextDouble();
         
        System.out.print("Enter the annual interest rate:");
        Double anualInterestRate = scanValue.nextDouble();
        
        System.out.print("Enter the number of years:");
        int numOfYears = scanValue.nextInt();
        
        //calculate monthly rate
        Double monthlyInvestmentRate = anualInterestRate / 1200;
        
        //calculate acumulated value
        Double acumulatedValue = investmentAmount 
                * Math.pow((1 + monthlyInvestmentRate), (numOfYears * 12));
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
	System.out.println("Your Future Investment Amount is = "
				+ defaultFormat.format(acumulatedValue));
    }

}
