/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medev_tp3;

import java.io.*;

/**
 *
 * @author Jules
 */
public class Lecture {

    public static Image LecturePGM(String source) {
        Image img = new Image();
        try {
            String line;
            BufferedReader fichier = new BufferedReader(new FileReader(source));
            line = fichier.readLine();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
