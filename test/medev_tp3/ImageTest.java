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
        instance=new Image(4,5);
        int expResult = 4;
        int result = instance.getHauteur();
        assertTrue(expResult== result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setHauteur method, of class Image.
     */
    @Test
    public void testSetHauteur() {
        System.out.println("setHauteur");
        int hauteur = 0;
        Image instance = null;
        instance=new Image(3,6);
        instance.setHauteur(hauteur);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.getHauteur()==hauteur);
    }

    /**
     * Test of getLargeur method, of class Image.
     */
    @Test
    public void testGetLargeur() {
        System.out.println("getLargeur");
        Image instance = null;
        instance=new Image(4,5);
        int expResult = 5;
        int result = instance.getLargeur();
        assertTrue(expResult==result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setLargeur method, of class Image.
     */
    @Test
    public void testSetLargeur() {
        System.out.println("setLargeur");
        int largeur = 0;
        Image instance = null;
        instance=new Image(3,6);
        instance.setLargeur(largeur);
        
        assertTrue(instance.getLargeur()==largeur);
        
    }

    /**
     * Test of getPixels method, of class Image.
     */
    @Test
    public void testGetPixels() {
        System.out.println("getPixels");
        Image instance = null;
        ArrayList<ArrayList<Integer>> expResult = new ArrayList<ArrayList<Integer>>();
        expResult.add(new ArrayList<Integer>());
        expResult.add(new ArrayList<Integer>());
        expResult.add(new ArrayList<Integer>());
        expResult.get(0).add(0);
        expResult.get(0).add(1);
        expResult.get(0).add(2);
        expResult.get(1).add(3);
        expResult.get(1).add(4);
        expResult.get(1).add(5);
        expResult.get(2).add(6);
        expResult.get(2).add(7);
        expResult.get(2).add(8);
        
        
        instance= new Image(3,3);
        
        instance.getPixels().add(new ArrayList<Integer>());
        instance.getPixels().add(new ArrayList<Integer>());
        instance.getPixels().add(new ArrayList<Integer>());
        instance.getPixels().get(0).add(0);
        instance.getPixels().get(0).add(1);
        instance.getPixels().get(0).add(2);
        instance.getPixels().get(1).add(3);
        instance.getPixels().get(1).add(4);
        instance.getPixels().get(1).add(5);
        instance.getPixels().get(2).add(6);
        instance.getPixels().get(2).add(7);
        instance.getPixels().get(2).add(8);
        
        ArrayList<ArrayList<Integer>> result = instance.getPixels();
        
        assertTrue(expResult.equals(result));
        
        
        
    }

    /**
     * Test of setPixels method, of class Image.
     */
    @Test
    public void testSetPixels() {
        System.out.println("setPixels");
        Image instance=new Image(3,3);
        ArrayList<ArrayList<Integer>> expResult = new ArrayList<ArrayList<Integer>>();
        expResult.add(new ArrayList<Integer>());
        expResult.add(new ArrayList<Integer>());
        expResult.add(new ArrayList<Integer>());
        expResult.get(0).add(0);
        expResult.get(0).add(1);
        expResult.get(0).add(2);
        expResult.get(1).add(3);
        expResult.get(1).add(4);
        expResult.get(1).add(5);
        expResult.get(2).add(6);
        expResult.get(2).add(7);
        expResult.get(2).add(8);
        
        ArrayList<ArrayList<Integer>> pixels = new ArrayList<ArrayList<Integer>>();
        pixels.add(new ArrayList<Integer>());
        pixels.add(new ArrayList<Integer>());
        pixels.add(new ArrayList<Integer>());
        pixels.get(0).add(0);
        pixels.get(0).add(1);
        pixels.get(0).add(2);
        pixels.get(1).add(3);
        pixels.get(1).add(4);
        pixels.get(1).add(5);
        pixels.get(2).add(6);
        pixels.get(2).add(7);
        pixels.get(2).add(8);
        
        
        instance= new Image(3,3);
        
        instance.setPixels(pixels);
        assertTrue(expResult.equals(instance.getPixels()));
    }

    /**
     * Test of histogramme method, of class Image.
     */
    @Test
    public void testHistogramme() {
        System.out.println("histogramme");
        Image instance = new Image(3,3);
        //Image expResult = Lecture.LecturePGM(source);
        
        assertTrue(true);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of max method, of class Image.
     */
    @Test
    public void testMax() {
        System.out.println("max");
        ArrayList<Integer> niveaux = null;
        niveaux=new ArrayList<Integer>();
        niveaux.add(0);
        niveaux.add(2);
        niveaux.add(6);
        niveaux.add(28);
        niveaux.add(1);
        
        Image instance=new Image(3,3);
        
        int expResult = 28;
        int result = instance.max(niveaux);
        assertTrue(result == expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of seuillage method, of class Image.
     */
    @Test
    public void testSeuillage() {
        System.out.println("seuillage");
        int seuil = 4;
        Image instance = null;
        
        instance= new Image(3,3);
        
        instance.getPixels().add(new ArrayList<Integer>());
        instance.getPixels().add(new ArrayList<Integer>());
        instance.getPixels().add(new ArrayList<Integer>());
        instance.getPixels().get(0).add(0);
        instance.getPixels().get(0).add(1);
        instance.getPixels().get(0).add(2);
        instance.getPixels().get(1).add(3);
        instance.getPixels().get(1).add(4);
        instance.getPixels().get(1).add(5);
        instance.getPixels().get(2).add(6);
        instance.getPixels().get(2).add(7);
        instance.getPixels().get(2).add(8);
        
        instance.seuillage(seuil);
        
        Image expResult = null;
        expResult= new Image(3,3);
        
        expResult.getPixels().add(new ArrayList<Integer>());
        expResult.getPixels().add(new ArrayList<Integer>());
        expResult.getPixels().add(new ArrayList<Integer>());
        expResult.getPixels().get(0).add(0);
        expResult.getPixels().get(0).add(0);
        expResult.getPixels().get(0).add(0);
        expResult.getPixels().get(1).add(0);
        expResult.getPixels().get(1).add(255);
        expResult.getPixels().get(1).add(255);
        expResult.getPixels().get(2).add(255);
        expResult.getPixels().get(2).add(255);
        expResult.getPixels().get(2).add(255);
        
        System.out.println(expResult.toString());
        System.out.println(instance.toString());
    
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(expResult.equals(instance));
    }

    /**
     * Test of difference method, of class Image.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Image result = null;
        Image expResult = null;
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
        
        result= new Image(3,3);
        
        result.getPixels().add(new ArrayList<Integer>());
        result.getPixels().add(new ArrayList<Integer>());
        result.getPixels().add(new ArrayList<Integer>());
        result.getPixels().get(0).add(0);
        result.getPixels().get(0).add(1);
        result.getPixels().get(0).add(0);
        result.getPixels().get(1).add(1);
        result.getPixels().get(1).add(0);
        result.getPixels().get(1).add(1);
        result.getPixels().get(2).add(0);
        result.getPixels().get(2).add(1);
        result.getPixels().get(2).add(0);
        
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(expResult.equals(result));
    }
    
}
