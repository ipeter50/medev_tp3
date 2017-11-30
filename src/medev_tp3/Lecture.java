/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medev_tp3;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Jules
 */
public class Lecture {

    public static Image LecturePGM(String source) {
        Image img = new Image(0, 0);
        try {
            String line;
            BufferedReader fichier = new BufferedReader(new FileReader(source));
            line = fichier.readLine();
            if (line.contains("P2")) {
                fichier.readLine();
                line = fichier.readLine();
                StringTokenizer t = new StringTokenizer(line, " ");
                img.setLargeur(Integer.parseInt(t.nextToken()));
                img.setHauteur(Integer.parseInt(t.nextToken()));
                fichier.readLine();
                line = fichier.readLine();
                int i = 0;
                while (line != null) {
                    img.getPixels().add(new ArrayList<Integer>());
                    t = new StringTokenizer(line, "\t");
                    while (t.hasMoreTokens()) {
                        String pixel = t.nextToken();
                        img.getPixels().get(i).add(Integer.parseInt(pixel));
                    }
                    i++;
                    line = fichier.readLine();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return img;
    }
}
