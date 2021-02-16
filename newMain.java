/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aalee
 */
public class newMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1;
        p1 = new Person();
        p1.firstName = "Aaleeyah";
        p1.lastName = "Ivy";
        p1.address = "9440 Vista Ct, Streetsboro, OH 44241";
        System.out.println(p1.firstName);
        System.out.println(p1.lastName);
        System.out.println(p1.address);
    }
    
}
