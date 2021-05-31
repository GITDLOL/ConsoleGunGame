package com.proj;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // BASIC NEEDS
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        GunData gundata = new GunData();

        // DATA FOR PLAYER
        gundata.bulletAmounts = 50;
        gundata.guntype = "AK-47";
        gundata.charhealth = 30;

        // PROMPT
        System.out.println("PLAYER DATA:");
        System.out.println("Health: " + gundata.charhealth);
        System.out.println("Gun Used: " + gundata.guntype);
        System.out.println("Amount of Bullets: " + gundata.bulletAmounts + "\n");
        System.out.println("Shoot a bullet?");
        System.out.print("Choose (Yes or No): ");
        String chosenthing = scanner.nextLine();

        // SWITCH STATEMENT FOR WHAT YOU CHOOSE
        switch (chosenthing) {
            case "Yes":
                ShootGun();
                System.out.println("\nShot " + " 1 bullet using " + gundata.guntype + "." +" Only " + gundata.bulletAmounts + " bullets left.");
                break;
            case "yes":
                ShootGun();
                System.out.println("\nShot " + " 1 bullet using " + gundata.guntype + "." +" Only " + gundata.bulletAmounts + " bullets left.");
                break;
            case "No":
                System.out.println("Didn't shoot gun");
                break;
            case "no":
                System.out.println("Didn't shoot gun");
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }

        SLOL(30, 20);
        int rng = random.nextInt(6);

        if (rng == 3) {
            /* DONT CALL ME UNORGANIZED CODE
            BECAUSE I COULDN'T FIND ANY OTHER WAY.
             */
            gundata.charhealth--;
            gundata.charhealth--;
            gundata.charhealth--;
            gundata.charhealth--;
            gundata.charhealth--;
            gundata.charhealth--;
            gundata.charhealth--;
            System.out.println("Opponent Shot");
            System.out.println("You now only have " + gundata.charhealth + " hearts");
        }
        else {
            System.out.println("Opponent didn't shoot");
        }
    }

    static void ShootGun() {
        GunData gundata = new GunData();

        gundata.bulletAmounts--;
    }

    static int SLOL(int x, int y) {
        int lol = 30;
        return lol;
    }
}
