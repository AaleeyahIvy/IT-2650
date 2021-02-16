/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aalee
 */
public class QuartsToGallons {
    final static int QUARTS_IN_GALLON = 4;

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        int numOfQuarts;
        numOfQuarts = 25;
        System.out.println("You will need"); 
        System.out.println(numOfQuarts/QUARTS_IN_GALLON);
        System.out.println("gallons and ");
        System.out.println(numOfQuarts % QUARTS_IN_GALLON);
        System.out.println("quarts of paint!");
    }
}

