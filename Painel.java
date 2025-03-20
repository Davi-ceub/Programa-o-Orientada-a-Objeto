package apresentacao;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Painel extends JPanel {

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		// céu
		g.setColor(Color.cyan);
		g.fillRect(0, 0, 1024, 500);
		
		// Chão
		g.setColor(Color.green);
		g.fillRect(0, 500, 1024, 268);
		
		// Sol	
		g.setColor(Color.orange);
		g.fillOval(850, 50, 120, 120); 	
		g.setColor(Color.yellow);
		g.fillOval(870, 70, 80, 80);
		
		// Frente da casa
		g.setColor(Color.black);
		g.drawRect(100, 500, 50, 100);
	    g.fillRect(100, 500, 50, 100);
	    
	    // Telhado da frente da casa
	    g.setColor(Color.gray);
	    g.drawLine(100, 500, 125, 450);
	    g.drawLine(150, 500, 125, 450);
	    
	    // Lateral da Casa
	     g.drawLine(150, 600, 350,550 );
	     g.drawLine(150, 500,350 ,470 );
	     g.drawLine(350, 550, 350, 470);
	     
	     // Telhado da lateral da casa
	     g.drawLine(125, 450, 340, 420);
	     g.drawLine(340, 420, 350, 470);
	     
	     // Boneco Cabeçudo
	     g.setColor(Color.red);
	     g.fillOval(500,450,50,50);
	     g.drawLine(525, 500, 525, 550);
	     g.drawLine(525, 500, 500, 550);
	     g.drawLine(525, 500, 550, 550);
	     g.drawLine(525, 550, 500, 600);
	     g.drawLine(525, 550, 550, 600);
		}
	
}