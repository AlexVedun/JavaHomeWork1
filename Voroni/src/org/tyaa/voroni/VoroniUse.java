/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.voroni;

import java.util.Scanner;
import org.tyaa.grammarlib.Voroni;

/**
 *
 * @author student
 */
public class VoroniUse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Integer number = 0;
        Scanner sc = new Scanner(System.in);

        MAIN_LOOP : do {
            
            System.out.println("Input number:");
            try {
                number = sc.nextInt();
            } catch (Exception ex) {
                System.out.println("Number format exception!");
                System.exit(0);
            }
            
            //TODO
            //ctrl + space
            System.out.println("Answer is: " + number + " " + Voroni.numToWord(number));
            
            do {
                System.out.println("Continue? (y/n)");
                String answer = sc.next();
                if (answer.toLowerCase().equals("y")) {
                    break;
                } else if (answer.toLowerCase().equals("n")) {
                    break MAIN_LOOP;
                }
            } while (true);
            
        } while (true);

    }

}
