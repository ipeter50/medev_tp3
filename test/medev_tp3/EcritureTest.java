/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medev_tp3;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pierre
 */
public class EcritureTest {
    
    public EcritureTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of EcriturePGM method, of class Ecriture.
     */
    @Test
    public void testEcriturePGM() {
        System.out.println("EcriturePGM");
        String path = "C:\\Users\\Jules\\Desktop\\test.pgm";
        // testLecturePGM();
        Image img = Lecture.LecturePGM(path);
        Ecriture.EcriturePGM("C:\\Users\\Jules\\Desktop\\test1.pgm", img);
        Image real = new Image(2, 3);
        real.getPixels().add(new ArrayList<Integer>());
        real.getPixels().add(new ArrayList<Integer>());
        real.getPixels().get(0).add(255);
        real.getPixels().get(0).add(0);
        real.getPixels().get(0).add(255);
        real.getPixels().get(1).add(0);
        real.getPixels().get(1).add(255);
        real.getPixels().get(1).add(0);
        Ecriture.EcriturePGM("C:\\Users\\Jules\\Desktop\\test2.pgm", real);
        Image res1 = Lecture.LecturePGM("C:\\Users\\Jules\\Desktop\\test1.pgm");
        Image res2 = Lecture.LecturePGM("C:\\Users\\Jules\\Desktop\\test2.pgm");
        assertTrue(res1.equals(res2));
    }
    
}
