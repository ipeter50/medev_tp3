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
        this.pixels=new ArrayList<ArrayList<Integer>>(); 
    }
    
    public Image histogramme(){
        ArrayList<Integer> niveaux = new ArrayList<Integer>();
        for (int i=0; i<256;i++){
            niveaux.add(0);
        }
        
        for (int i=0;i<this.hauteur;i++){
            for (int j=0;j<this.largeur;j++){
                niveaux.set(this.pixels.get(i).get(j),niveaux.get(this.pixels.get(i).get(j))+1);
            }
        }
        Image hist=new Image(this.max(niveaux),256);
        
        for(int i=0;i<hist.hauteur;i++){
            for(int j=0;j<hist.largeur;j++){
                hist.pixels.get(j).set(i,255);
            }
            
        }
        for(int i=0;i<niveaux.size();i++){
            for(int j=0;j<niveaux.get(i);j++){
                hist.pixels.get(j).set(i,0);
            }
            
        }
        return hist;
    }
    
    public int max(ArrayList<Integer> niveaux){
        int max=0;
        for (int i=0;i<niveaux.size();i++){
            if(niveaux.get(i)>max){
                max=niveaux.get(i);
            }
        }
        return max;
    }
    
    public void seuillage(int seuil){
        for(int i=0;i<this.hauteur;i++){
            for(int j=0;j<this.largeur;j++){
                if(this.pixels.get(i).get(j)>=seuil){
                    this.pixels.get(j).set(i,255);
                }
                else{
                    this.pixels.get(j).set(i,0);
                }
                
            }
            
        }
        
    }
    
    
    
}
