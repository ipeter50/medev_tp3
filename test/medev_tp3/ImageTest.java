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
public class ImageTest {
    
    public ImageTest() {
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
     * Test of getHauteur method, of class Image.
     */
    @Test
    public void testGetHauteur() {
        System.out.println("getHauteur");
        Image instance = null;
        int expResult = 0;
        int result = instance.getHauteur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHauteur method, of class Image.
     */
    @Test
    public void testSetHauteur() {
        System.out.println("setHauteur");
        int hauteur = 0;
        Image instance = null;
        instance.setHauteur(hauteur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLargeur method, of class Image.
     */
    @Test
    public void testGetLargeur() {
        System.out.println("getLargeur");
        Image instance = null;
        int expResult = 0;
        int result = instance.getLargeur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLargeur method, of class Image.
     */
    @Test
    public void testSetLargeur() {
        System.out.println("setLargeur");
        int largeur = 0;
        Image instance = null;
        instance.setLargeur(largeur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPixels method, of class Image.
     */
    @Test
    public void testGetPixels() {
        System.out.println("getPixels");
        Image instance = null;
        ArrayList<ArrayList<Integer>> expResult = null;
        ArrayList<ArrayList<Integer>> result = instance.getPixels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPixels method, of class Image.
     */
    @Test
    public void testSetPixels() {
        System.out.println("setPixels");
        ArrayList<ArrayList<Integer>> pixels = null;
        Image instance = null;
        instance.setPixels(pixels);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of histogramme method, of class Image.
     */
    @Test
    public void testHistogramme() {
        System.out.println("histogramme");
        Image instance = null;
        Image expResult = null;
        Image result = instance.histogramme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of max method, of class Image.
     */
    @Test
    public void testMax() {
        System.out.println("max");
        ArrayList<Integer> niveaux = null;
        Image instance = null;
        int expResult = 0;
        int result = instance.max(niveaux);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seuillage method, of class Image.
     */
    @Test
    public void testSeuillage() {
        System.out.println("seuillage");
        int seuil = 0;
        Image instance = null;
        instance.seuillage(seuil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of difference method, of class Image.
     */
    @Test
    public void testDifference() {
        System.out.println("difference");
        Image img = null;
        Image instance = null;
        boolean expResult = false;
        boolean result = instance.difference(img);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
