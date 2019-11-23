package testng;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Method {
    public static float calculateRectangleArea(float height, float width){
        if(height < 0 || width < 0){
            throw new IllegalArgumentException("Height and Width must be > 0");
        }
        return height * width;
    }
}
