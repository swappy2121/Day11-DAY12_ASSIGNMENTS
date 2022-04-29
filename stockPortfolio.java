package com.Bridgelabz;
import java.util.Scanner;


public class stockPortfolio {

    public static void Stocks() {
        String NAME1 = "Reliance";
        long marketPrice1 = 1906934l;
        int currentSharePrice1 = 2819;
        int earningsPerShare1 = 200000;
        long marketValue1 = currentSharePrice1 * marketPrice1;
        long priceEarningsRatio1 = marketValue1 / earningsPerShare1;
        long totalValueOfStock1 = priceEarningsRatio1 * earningsPerShare1;

        String NAME2 = "TATA";
        long marketPrice2 = 2034542l;
        int currentSharePrice2 = 3200;
        int earningsPerShare2 = 400000;
        long marketValue2 = currentSharePrice2 * marketPrice2;
        long priceEarningsRatio2 = marketValue2 / earningsPerShare2;
        long totalValueOfStock2 = priceEarningsRatio2 * earningsPerShare2;

        String NAME3 = "SBI";
        long marketPrice3 = 1243456l;
        int currentSharePrice3 = 2500;
        int earningsPerShare3 = 350000;
        long marketValue3 = currentSharePrice3 * marketPrice3;
        long priceEarningsRatio3 = marketValue3 / earningsPerShare3;
        long totalValueOfStock3 = priceEarningsRatio3 * earningsPerShare3;

        String NAME4 = "HDFC";
        long marketPrice4 = 1566783l;
        int currentSharePrice4 = 2760;
        int earningsPerShare4 = 250000;
        long marketValue4 = currentSharePrice4 * marketPrice4;
        long priceEarningsRatio4 = marketValue4 / earningsPerShare4;
        long totalValueOfStock4 = priceEarningsRatio4 * earningsPerShare4;



        System.out.println(" Enter number between 1 to 4 to know stock value : ");
        Scanner sc = new Scanner(System.in);
        int NUM = sc.nextInt();
        if ((int) NUM == 1) {
            System.out.println("Stock name  " + " market value " + " Price earning ratio[P/E] " + "  total value of stock");
            System.out.println(  NAME1 + "     " + marketValue1 + "          " + priceEarningsRatio1 + "                  " + totalValueOfStock1 + "  ");
        }else if( NUM == 2) {
            System.out.println("Stock name  " + " market value " + " Price earning ratio[P/E] " + "  total value of stock");
            System.out.println(  NAME2 + "         " + marketValue2 + "          " + priceEarningsRatio2 + "                    " + totalValueOfStock2 + "  ");
        }else if( NUM == 3){
            System.out.println("Stock name  " + " market value " + " Price earning ratio[P/E] " + "  total value of stock");
            System.out.println(  NAME3 + "          " + marketValue3 + "          " + priceEarningsRatio3 + "                      " + totalValueOfStock3 + "  ");
        }else if ( NUM == 4){
            System.out.println("Stock name  " + " market value " + " Price earning ratio[P/E] " + "  total value of stock");
            System.out.println(  NAME4 + "         " + marketValue4 + "          " + priceEarningsRatio4 + "                     " + totalValueOfStock4 + "  ");
        }
    }

        public static void main (String[]args){

            stockPortfolio obj = new stockPortfolio();
            obj.Stocks();
        }

    }

