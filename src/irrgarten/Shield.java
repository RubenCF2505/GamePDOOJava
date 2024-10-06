/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author ruben
 */
public class Shield {

    private float protection;
    private int uses;

    public Shield(float protection, int uses) {
        this.protection = protection;
        this.uses = uses;
    }

    public float getProtection() {
        return protection;
    }

    public void setProtection(float protection) {
        this.protection = protection;
    }

    public int getUses() {
        return uses;
    }

    public void setUses(int uses) {
        this.uses = uses;
    }

    public int protect() {
        return this.uses > 0 ? --this.uses : 0;
        
    }

    public boolean discard() {
        return Dice.discardElement(this.uses);
    }

    @Override
    public String toString() {
        return "S[" + this.protection + "," + this.uses + "] para un escudo que proporciona un nivel de proteccion  de " + (int) this.protection + " unidades y que aun puede ser usada " + this.uses + " veces";
    }
}
