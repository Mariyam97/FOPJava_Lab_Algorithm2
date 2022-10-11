/*You are a traveler and traveling to a country where the currency denominations are unknown and as you travel you get to know about the denomination in random order.
You want to make a payment of amount x, in such a way that the higher denomination is used to make exact payment.  */

/* 1.Enter the Size of Currency Denominations. 
 * 2.Enter the Currency Denominations Value.
 * 3.Enter the Amount you want to Pay.
 */

package com.currencydenomination.Main;

import java.util.Scanner;

import com.currencydenomination.Services.MergeSort;
import com.currencydenomination.Services.NotesCount;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations ");
		int size = sc.nextInt();
		System.out.println();

		System.out.println("Enter the Currency Denominations Value");
		int[] notes = new int[size];
		for(int i=0; i<size; i++){
			notes[i]=sc.nextInt();
		}
		System.out.println();

		System.out.println("Enter the amount you want to Pay");
		int amount = sc.nextInt();
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(notes,0,notes.length-1);

		NotesCount notesCount = new NotesCount();
		notesCount.notesCount(notes, amount);
	}

}
