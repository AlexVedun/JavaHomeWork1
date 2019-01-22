/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.grammarlib;

/**
 *
 * @author student
 */
public class Voroni {
    
    public static String numToWord(Integer _number)
    {
        Integer number10 = _number % 10;
        Integer number100 = _number % 100;
        
        if (number100 >= 11 && number100 <= 14) {
            return "Voron";          
        } else {
            switch (number10) {

                case 1: {
                    return "Vorona";                    
                }
                case 2:
                case 3:
                case 4: {
                    return "Voroni";                    
                }
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 0: {
                    return "Voron";                    
                }
            }
        }
        return null;
    }
}
