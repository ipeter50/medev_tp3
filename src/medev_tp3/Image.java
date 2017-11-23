/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medev_tp3;

import java.util.ArrayList;

/**
 *
 * @author Pierre
 */
public class Image {

    private int hauteur;
    private int largeur;
    private ArrayList<ArrayList<Integer>> pixels;

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public ArrayList<ArrayList<Integer>> getPixels() {
        return pixels;
    }

    public void setPixels(ArrayList<ArrayList<Integer>> pixels) {
        this.pixels = pixels;
    }

    public Image(int hauteur, int largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.pixels = new ArrayList<ArrayList<Integer>>();
    
    

    public Image() {
        this.hauteur = 0;
        this.largeur = 0;
        this.pixels = new ArrayList<ArrayList<Integer>>();
    }

}
