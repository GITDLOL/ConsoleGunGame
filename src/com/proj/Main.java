package com.proj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GunData gundata = new GunData();

        gundata.bulletAmounts = 50;

        System.out.println("Shoot a bullet?");
        System.out.print("Choose (Yes or No): ");
        String chosenthing = scanner.nextLine();

        switch (chosenthing) {
            case "Yes":
                ShootGun();
                break;
            case "yes":
                ShootGun();
                break;
            case "No":
                System.out.println("Didn't shoot gun");
                break;
            case "no":
                System.out.println("Didn't shoot gun");
                break;
        }

        System.out.println("Shot " + " 1 bullet " + " only " + gundata.bulletAmounts + " bullets left.");
    }

    static void ShootGun() {
        GunData gundata = new GunData();

        gundata.bulletAmounts--;
    }
}
