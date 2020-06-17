package com.company;

import java.security.SecureRandom;

public class Main {
    public static int bossHealth = 700;
    public static int bossDamage = 50;
    public static String boosDefenseType = " ";
    public static int[] heroesHealth = {260, 250, 270};
    public static int[] heroesDamage = {20, 15, 25};
    public static String[] heroesAttackType = {"Physical",
            "Magical", "Kinetic"};


    public static void main(String[] args) {


    }

    public static void round() {
        heroesHit();
        bossHits();
        printStatistics();
    }

    public static boolean isGameFinish() {
        if (bossHealth <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        if (heroesHealth[0] <= 0 && heroesHealth[1] <= 0 &&
                heroesHealth[2] <= 0) {
            System.out.println("Boss won!!!");
            return true;
        }
        return false;
    }

    public static void printStatistics() {
        System.out.println("Boss health:" + bossHealth);
        System.out.println("Warior health:" + heroesHealth[0]);
        System.out.println("Magic health:" + heroesHealth[1]);
        System.out.println("Kinetic health:" + heroesHealth[2]);
        System.out.println("_______________");
    }

    public static void bossHits() {
        for (int i = 0; i < heroesHealth.length; i++) {
            heroesHealth[i] = heroesHealth[i] - bossDamage;
        }
        public static void heroesHit ()
        for (int i = 0; i < heroesDamage.length; i++) {
            bossHealth = bossHealth - heroesDamage[i];
        }
    }
}