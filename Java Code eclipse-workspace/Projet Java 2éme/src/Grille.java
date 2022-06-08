import java.util.ArrayList;
import java.util.HashMap;

public class Grille extends javax.swing.JFrame 
{
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
        // TODO add your handling code here:
    }                                        
    {
        public static void main(String[] args) 
        {
            JFrame frame = new JFrame("Scrabble Board");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 800);
          
            static HashMap<Double,Squares> L_SQ = new HashMap<Double,Squares>();
            Container pane = aFrame.getContentPane();
            		JButton button = new JButton("Scrabble Game start");
            		pane.add(button, BorderLayout.PAGE_START);
            		//Make the center component big, since that's the
            		//typical usage of BorderLayout.
            		GridLayout experimentLayout = new GridLayout(15,15);
            		for (int i=0; i<=15; i++){
            			for (int j=0; j<=15; j++){
            				//bleuclair[3,11,34,36,42,49,58]
            				//bleuFoncé[19,23]
            				//rouge foncé[0,14,99,112,210,224]
            				//rose[112]
            		        Square SQ =new Square(i+j,eff );
            		        // depending on table get if
            		    }
            	    }
            		compsToExperiment.setLayout(experimentLayout);
            		
                    compsToExperiment.add(new JButton("Button 1"));
                    compsToExperiment.add(new JButton("Button 2"));
                    compsToExperiment.add(new JButton("Button 3"));
                    compsToExperiment.add(new JButton("Long-Named Button 4"));
                    compsToExperiment.add(new JButton("5"));
                    
            		button.setPreferredSize(new Dimension(600, 600));
            		pane.add(button, BorderLayout.CENTER);
            		
            		button b_s= new JButton("Shuffle");
            		button b_sa= new JButton("Shuffle All");
            		button b_d= new JButton("Draw");
            		button b_p= new JButton("Pass");
            		button b_c= new JButton("Call Out wrong word");
            		pane.add(b_s, BorderLayout.PAGE_END);
            		pane.add(b_sa, BorderLayout.PAGE_END);
            		pane.add(b_d, BorderLayout.PAGE_END);
            		pane.add(b_p, BorderLayout.PAGE_END);
            		pane.add(b_c, BorderLayout.PAGE_END);
            		frame.setVisible(true);
        }
    }       
}
