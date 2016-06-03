/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 *
 * @author Usuario16
 */
public class fire {
    public int x;
    public int y;

    public fire() {
        this.x = 10;
        this.y = 10;
    }

    fire(int x, int y) {
         this.x = x;
        this.y = y;
    }
    
    public void dibujar(Graphics g){
        g.setColor(Color.red);
        g.fillOval(0+x, 0+y, 20, 20);
    }
    public void movimiento(ActionEvent e){
        do{
        this.x+=1;
        if(x==200){
            this.x=10;
        }
        }while(this.x>200);
    }
    public void movimiento2(ActionEvent e){
        this.x-=1;
        this.y-=1;
    }
    public Rectangle getFire(){
        return new Rectangle(0+x, 0+y, 20, 20);
    }
    
}