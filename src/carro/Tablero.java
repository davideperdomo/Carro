/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.*;

public class Tablero extends JPanel implements ActionListener, KeyListener{
    private Timer timer;
    
    private Carro carro;
    private ArrayList<fire> fires;
    
    public Tablero() {
        this.setFocusable(true);
        this.addKeyListener(this);
        this.carro = new Carro();
        this.fires= new ArrayList<>();
        this.fires.add(new fire());
        this.fires.add(new fire(100,100));
        this.timer = new Timer(20,this);
        this.timer.start();
    }
    
    public void validarColision(){
        Rectangle recCarro= carro.getcarro();
        Rectangle recFire = fires.get(0).getFire();
        if(recCarro.intersects(recFire)){
            System.out.println("ColisionFire");
        }
    }
    
    @Override
    protected void paintComponent(Graphics g){
        
        super.paintComponent(g);
        this.carro.dibujar(g);
        /*for(fire f:fires){
            f.dibujar(g);
        }*/
        g.drawRect(425,10,450,50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        /*fires.get(0).movimiento(e);
        fires.get(1).movimiento2(e);*/
        if(carro.getX()>=400){carro.setX(10);}
        
        repaint();  
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        carro.movimiento(e);
        validarColision();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
  
}