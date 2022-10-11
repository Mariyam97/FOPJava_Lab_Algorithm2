/* PayMoney.
 *  processes thousands of transactions daily amounting to crores of Rupees. 
 *  They also have a daily target that they must achieve.
 *   Given a list of transactions done byPayMoney and a daily target,
 *  your task is to determine at which transaction PayMoney achieves the same. 
 *  If the target is not achievable, then display the target is not achieved.
 *  */

 /* 1.Enter the size of transaction array.
  * 2.Enter the values of array
    3.Enter the total no of targets that needs to be achieved.
	4.Enter the value of target
  */
package com.paymoney.Main;

import java.util.Scanner;

import com.paymoney.Services.PayMoneyServices;

public class DriverClass {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		System.out.println();

		System.out.println("Enter the values of array");
		int[] array = new int[size];

		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println();

		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetCount = sc.nextInt();

		for(int i=0; i<targetCount; i++){
			System.out.println("Enter the value of target");
			int targetValue = sc.nextInt();
			System.out.println();
			int numberOfTranscations = PayMoneyServices.calculationOfTranscation(array,targetValue);
	
		if(numberOfTranscations!=-1){
				System.out.println("Target acheived after "+numberOfTranscations + " transactions");
				System.out.println();
		}else{
				System.out.println("Given target is not acheived");
				System.out.println();
		}
	}	
	}
}


