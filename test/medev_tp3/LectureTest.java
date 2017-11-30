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
public class LectureTest {
    
    public LectureTest() {
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
     * Test of LecturePGM method, of class Lecture.
     */
    @Test
    public void testLecturePGM() {
        System.out.println("LecturePGM");
        String source = "C:\\Users\\Pierre\\Desktop\\test.pgm";
        Image expResult = null;
        Image result = Lecture.LecturePGM(source);
        expResult= new Image(3,3);
        
        expResult.getPixels().add(new ArrayList<Integer>());
        expResult.getPixels().add(new ArrayList<Integer>());
        expResult.getPixels().add(new ArrayList<Integer>());
        expResult.getPixels().get(0).add(0);
        expResult.getPixels().get(0).add(1);
        expResult.getPixels().get(0).add(0);
        expResult.getPixels().get(1).add(1);
        expResult.getPixels().get(1).add(0);
        expResult.getPixels().get(1).add(1);
        expResult.getPixels().get(2).add(0);
        expResult.getPixels().get(2).add(1);
        expResult.getPixels().get(2).add(0);
        System.out.println(expResult.getPixels().toString());
        System.out.println(expResult.toString());
        System.out.println(result.toString());
        Ecriture.EcriturePGM("C:\\Users\\Pierre\\Desktop\\test2.pgm",expResult);
        
        assertTrue(expResult.equals(result));
        //assertEquals(expResult, result);
      
    }
    
}
