/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import java.util.Random;

/**
 *
 * @author ruben
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Weapon armas[] = new Weapon[6];
        Shield escudos[] = new Shield[6];
        System.out.println("<-------ARMAS------->");
        for (int i = 0; i < armas.length; i++) {
            armas[i] = new Weapon(Math.round(rand.nextFloat(10)), rand.nextInt(5) + 1);
            System.out.println(armas[i]);
        }
        System.out.println("\n");
        System.out.println("<------ESCUDOS------>");

        for (int i = 0; i < escudos.length; i++) {
            escudos[i] = new Shield(Math.round(rand.nextFloat(10)), rand.nextInt(5) + 1);
            System.out.println(escudos[i]);
        }
        System.out.println("\n");
        System.out.println("<-----ENUMERADOS----->");
        System.out.println("1" + Directions.DOWN);
        System.out.println("2" + Directions.RIGHT);
        System.out.println("3" + Orientation.HORIZONTAL);
        System.out.println("4" + GameCharacter.PLAYER);

        System.out.println("<----PRUEBA DE LA CLASE DICE---->");

        for (int i = 1; i <= 100; i++) {
            System.out.println("fila " + i);
            System.out.println("<----DiscardELement---->");
            System.out.println(Dice.discardElement(Math.round(rand.nextInt(5) + 1)));
            System.out.println("<----healthReward---->");
            System.out.println(Dice.healthReward());
            System.out.println("<----intensity---->");
            System.out.println(Dice.intensity(Math.round(rand.nextFloat(5) + 1)));
            System.out.println("<----randomIntelligence---->");
            System.out.println(Dice.randomIntelligence());
            System.out.println("<----randomPos---->");
            System.out.println(Dice.randomPos(Math.round(rand.nextInt(5) + 1)));
            System.out.println("<----randomStrength---->");
            System.out.println(Dice.randomStrength());
            System.out.println("<----resurrectPlayer---->");
            System.out.println(Dice.resurrectPlayer());
            System.out.println("<----shieldReward---->");
            System.out.println(Dice.sheildReward());
            System.out.println("<----shieldPower---->");
            System.out.println(Dice.shieldPower());
            System.out.println("<----usesLeft---->");
            System.out.println(Dice.usesLeft());
            System.out.println("<----weaponPower---->");
            System.out.println(Dice.weaponPower());
            System.out.println("<----weaponsReward---->");
            System.out.println(Dice.weaponsReward());
            System.out.println("<----whoStarts---->");
            System.out.println(Dice.whoStarts(Math.round(rand.nextInt(3) + 1)));
            System.out.println("\n");
        }
    }

}
