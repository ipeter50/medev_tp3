/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medev_tp3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pierre
 */
public class Ecriture {
    BufferedWriter writer;
    private String path;

    public Ecriture(String path,Image img) {
        this.path = path;
        try {
            writer = new BufferedWriter(new FileWriter(path));
        } catch (IOException ex) {
            Logger.getLogger(Ecriture.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            writer.write("P2");
            writer.newLine();
            writer.write("#");
            writer.newLine();
            writer.write(Integer.toString(img.getLargeur())+" "+ Integer.toString(img.getHauteur()));
            writer.newLine();
            for (int i=0;i<img.getHauteur();i++){
                for(int j=0;j<img.getLargeur();j++){
                    writer.write(Integer.toString(img.getPixels().get(i).get(j)));
                    writer.write(" ");
                }
                writer.newLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(Ecriture.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (writer != null) {
                    writer.flush();
                    writer.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Ecriture.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
    
    
}
