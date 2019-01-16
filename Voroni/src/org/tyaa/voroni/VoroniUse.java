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

        
        int number = 0;
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
            Voroni.numToWord(number);
                        
            int number10 = number % 10;
            int number100 = number % 100;
            if (number100 >= 11 && number100 <= 14) {
                System.out.println("Voron");
            } else {
                switch (number10) {

                    case 1: {
                        System.out.println("Vorona");
                        break;
                    }
                    case 2:
                    case 3:
                    case 4: {
                        System.out.println("Voroni");
                        break;
                    }
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 0: {
                        System.out.println("Voron");
                        break;
                    }
                }
            }
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
