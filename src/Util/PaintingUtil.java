/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author 健和
 */
public class PaintingUtil {
    
    
    //传入一个二维数组以及画笔
    public static void paint2DScatterPoint(Graphics g,int x,int y){
        Graphics2D g2 = (Graphics2D) g;

        g2.drawRect(x, y,1, 1);
    }
    
    public static void paint2DLine(Graphics g, int x1,int y1,int x2,int y2){
        Graphics2D g2 = (Graphics2D) g;
        g2.drawLine(x1, y1, x2, y2);
    }
    
    
    
}
