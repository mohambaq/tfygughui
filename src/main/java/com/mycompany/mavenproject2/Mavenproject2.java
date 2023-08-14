/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

public class Mavenproject2 {

    public static void main(String[] args) {
        Mavenproject2 validator = new Mavenproject2();

        int testBirthYear = 2005;
        boolean isEligible = validator.validateBirthYear(testBirthYear);

        if (isEligible) {
            System.out.println("Player is eligible.");
        } else {
            System.out.println("Player is not eligible.");
        }
    }

    public boolean validateBirthYear(int playerBirthYear) {
        if (playerBirthYear >= 2009) {
            return true;
        }
        return false;
    }
}


