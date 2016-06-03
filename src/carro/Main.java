/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Usuario16
 */
public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(500, 400));
        frame.add(new Tablero());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}