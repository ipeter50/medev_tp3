/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medev_tp3;

/**
 *
 * @author Pierre
 */
public class SwitchTest {
    public static void main(String[] args) {
        String color = "red";
        String colorRGB;
        if (color.equals("black")) {
            colorRGB = "000000";
        } else if (color.equals("red")) {
            colorRGB = "ff0000";
        } else if (color.equals("green")) {
            colorRGB = "008000";
        } else if (color.equals("blue")) {
            colorRGB = "0000ff";
        } else {
            colorRGB = "Invalid color";
        }
        System.out.println(colorRGB);
    }
}
