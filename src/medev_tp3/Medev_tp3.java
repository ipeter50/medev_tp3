/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medev_tp3;

import static medev_tp3.Ecriture.EcriturePGM;
import static medev_tp3.Lecture.LecturePGM;

/**
 *
 * @author Pierre
 */
public class Medev_tp3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Image img = LecturePGM("C:\\Users\\Jules\\Desktop\\lena.pgm");
        //img.seuillage(150);
        EcriturePGM("C:\\Users\\Jules\\Desktop\\lena2.pgm", img);
    }

}
