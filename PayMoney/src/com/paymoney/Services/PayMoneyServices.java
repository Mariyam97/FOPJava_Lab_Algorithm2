package com.paymoney.Services;

public class PayMoneyServices {

   

    public static int calculationOfTranscation(int[] array, int targetValue) {
        int sum = 0,no_of_transactions=0;
        for(int i=0;i<array.length;i++) {
            sum=sum+array[i];
            if(sum>targetValue) {
                no_of_transactions=i+1;
                break;
            }
                
        }
        if(sum<targetValue) {
            no_of_transactions=-1;
        }
        return no_of_transactions;
    }
    }


