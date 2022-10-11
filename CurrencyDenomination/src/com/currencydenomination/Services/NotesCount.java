package com.currencydenomination.Services;

public class NotesCount {

    public void notesCount(int notes[], int amount ) {

        int[] noteCount = new int[notes.length];

        try {
            for(int i=0; i< notes.length; i++) {
                if(amount >= notes[i]) {
                    noteCount[i] = amount / notes[i];
                    amount = amount - noteCount[i] * notes[i];
                }
            }
            if(amount > 0) {
                System.out.println(" exact amount cannot be given with the highest denomination");

            }else{
                System.out.println("Your payment approach in order to give min no of notes will be");
                for(int i=0; i< notes.length; i++){
                    if(noteCount[i] != 0) {
                        System.out.println(notes[i] + ":" +  noteCount[i]);
                    } 
                }
           
            }
        } catch(ArithmeticException e) {
            System.out.println(e + "notes of denomination 0 is invalid");
        }

        
    }
}
