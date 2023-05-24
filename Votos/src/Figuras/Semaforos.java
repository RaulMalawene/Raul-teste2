package Figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Semaforos extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Semaforos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        
        Semaforos semaforos = new Semaforos();
        frame.add(semaforos);
        
        frame.setVisible(true);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Desenha o fundo branco
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        // Desenha o primeiro semáforo
        g.setColor(Color.WHITE);
        g.fillRect(50, 50, 100, 300);
        
        // Desenha a bola vermelha
        g.setColor(Color.red);
        g.fillOval(60, 260, 80, 80);
        
        // Desenha a bola amarela
        g.setColor(Color.yellow);
        g.fillOval(60, 160, 80, 80);
        
        // Desenha a bola verde
        g.setColor(Color.green);
        g.fillOval(60, 60, 80, 80);
        
        // Desenha o segundo semáforo
        g.setColor(Color.WHITE);
        g.fillRect(250, 50, 100, 200);
        
        // Desenha a bola preta
        g.setColor(Color.black);
        g.fillOval(260, 60, 80, 80);
        
        // Desenha a seta verde
        int[] xPoints = {290, 310, 290, 290};
        int[] yPoints = {160, 180, 200, 160};
        Polygon polygon = new Polygon(xPoints, yPoints, 4);
        g.setColor(Color.green);
        g.fillPolygon(polygon);
    }
}