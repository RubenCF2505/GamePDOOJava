/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author ruben
 */
public class Weapon {

    private float power;
    private int uses;

    public Weapon(float power, int uses) {

        this.power = power;
        this.uses = uses;
    }

    public int attack() {
        return this.uses > 0 ? --this.uses : 0;
    }

    public boolean discard() {
        return Dice.discardElement(this.uses);
    }

    @Override
    public String toString() {
        return "W[" + this.power + "," + this.uses + "] para un arma con una potencia de disparo de "
                + (int) this.power + " unidades y que aun puede ser usada " + this.uses + " veces";
    }
}
