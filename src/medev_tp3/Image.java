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

    }

    public Image histogramme() {
        ArrayList<Integer> niveaux = new ArrayList<Integer>();
        for (int i = 0; i < 256; i++) {
            niveaux.add(0);
        }

        for (int i = 0; i < this.hauteur; i++) {
            for (int j = 0; j < this.largeur; j++) {
                niveaux.set(this.pixels.get(i).get(j), niveaux.get(this.pixels.get(i).get(j)) + 1);
            }
        }
        Image hist = new Image(this.max(niveaux), 256*5);

        for (int i = 0; i < hist.hauteur; i++) {
            hist.pixels.add(new ArrayList<Integer>());
            for (int j = 0; j < hist.largeur; j++) {

                hist.pixels.get(i).add(255);
            }

        }
        for (int i = 0; i < niveaux.size(); i++) {
            for (int j = 0; j < niveaux.get(i); j++) {
                hist.pixels.get(hist.hauteur - j - 1).set(5*i, 0);
                hist.pixels.get(hist.hauteur - j - 1).set(5*i+1, 0);
                hist.pixels.get(hist.hauteur - j - 1).set(5*i+2, 0);
                hist.pixels.get(hist.hauteur - j - 1).set(5*i+3, 0);
                hist.pixels.get(hist.hauteur - j - 1).set(5*i+4, 0);
            }

        }
        return hist;
    }

    public int max(ArrayList<Integer> niveaux) {
        int max = 0;
        for (int i = 0; i < niveaux.size(); i++) {
            if (niveaux.get(i) > max) {
                max = niveaux.get(i);
            }
        }
        return max;
    }

    public void seuillage(int seuil) {
        for (int i = 0; i < this.hauteur; i++) {
            for (int j = 0; j < this.largeur; j++) {
                if (this.pixels.get(i).get(j) >= seuil) {
                    this.pixels.get(i).set(j, 255);
                } else {
                    this.pixels.get(i).set(j, 0);
                }

            }

        }

    }
    
    
    public String toString(){
        String s;
        s="Hauteur:"+Integer.toString(this.hauteur);
        s=s+"\nLargeur:"+Integer.toString(this.largeur);
        s=s+"\npixels:"+this.pixels.toString();
        return s;
    }

    public boolean equals(Image img) {
        boolean res = true;
        if (this.hauteur != img.hauteur) {
            System.out.println("a");
            res = false;
        } else if (this.largeur != img.largeur) {
            System.out.println("z");
            res = false;
        } else {
            for (int i = 0; i < this.hauteur; i++) {
                for (int j = 0; j < this.largeur; j++) {
                    if (!img.getPixels().get(i).get(j).equals(this.pixels.get(i).get(j))) {
                        res = false;
                    }
                }
            }
        }
        return res;
    }

}
