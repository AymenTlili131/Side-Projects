import javax.swing.*;
import java.awt.event.*;

	public class swing1 extends JFrame {

		public swing1() {

		     super("Gestion des Cours");

		      WindowListener l = new WindowAdapter() {
		         public void windowClosing(WindowEvent e){
		           System.exit(0);
		         }
		      };
		     addWindowListener(l);

		     String url ="formation.gif";
		     ImageIcon icone1=new ImageIcon(url);
		     
		     String url2 ="Livre.gif";
		     ImageIcon icone2=new ImageIcon(url2);
		     
		     String url3 ="Etudiant.gif";
		     ImageIcon icone3=new ImageIcon(url3);
		     
		     JButton bouton = new JButton("Formation",icone1);
		     JButton bouton1 = new JButton("Mati�re",icone2);
		     JButton bouton2 = new JButton("Participant",icone3);
		     JPanel panneau = new JPanel();
		     panneau.add(bouton);
		     panneau.add(bouton1);
		     panneau.add(bouton2);

		     setContentPane(panneau);
		     setSize(400,150);
		     setVisible(true);	  
		     
		     /*contentPane.remove(oldPanel);
			 contentPane.add(newPanel);*/
		     JPanel p_forma = new JPanel();
		     JButton bouton_f0 = new JButton("Ajouter une Formation"); /*ajouter formation � un centre*/
		     JButton bouton_f1 = new JButton("Selectionner une formation");
		     p_forma.add(bouton_f1);p_forma.add(bouton_f0);
		     
		     JButton bouton_fs0 = new JButton("Supprimer une Formation");
		     JButton bouton_fs1 = new JButton("Modifier une formation");
		     JPanel Action_f = new JPanel();
		     Action_f.add(bouton_fs0);Action_f.add(bouton_fs1);
		    
		     JPanel Modifier_f = new JPanel();
		     JButton bouton_fm0 = new JButton("Modifier le nom"); /*Modifier nom*/  /*Modifier prix*/
		     JButton bouton_fm1 = new JButton("Modifier le prix"); 
		     JButton bouton_fm2 = new JButton("Modifier la dur�e"); /*modifier duree*/
		     JButton bouton_fm3 = new JButton("Modifier Mati�res");
		     
		     bouton_f0.setPreferredSize(bouton_f1.getPreferredSize());
		     
		     bouton_fs1.setPreferredSize(bouton_fs0.getPreferredSize());
		     
		     bouton_fm1.setPreferredSize(bouton_fm3.getPreferredSize());
		     bouton_fm0.setPreferredSize(bouton_fm3.getPreferredSize());
		     bouton_fm2.setPreferredSize(bouton_fm3.getPreferredSize());
		     Modifier_f.add(bouton_fm0);
		     Modifier_f.add(bouton_fm1);
		     Modifier_f.add(bouton_fm2);
		     Modifier_f.add(bouton_fm3);
		    
		      	
		     
		     bouton.addActionListener(new ActionListener() {
		    	    public void actionPerformed(ActionEvent arg0) {
		    	    }
		    	});
		     
		     bouton.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		             if (!bouton.getModel().isPressed()) {
		                 {System.out.println("tab formation");
		                 panneau.removeAll();
		                 panneau.revalidate();
		                 panneau.repaint();
		                 
		                 setContentPane(p_forma);
		    		     setSize(600,150);
		    		     setVisible(true);
		                 }
		             }
		         }
		     });
		     
		     bouton_f0.addActionListener(new ActionListener() {
		    	    public void actionPerformed(ActionEvent arg0) {
		    	    }
		    	});
		     
		     bouton_f0.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		             if (!bouton_f0.getModel().isPressed()) {
		                 {	/*ajouter formation*/
		                	 JFrame f = new JFrame("Ajout d'une formation");
		                	    f.setSize(500, 200);
		                	    JPanel pannel = new JPanel();

		                	    JTextField  testField1 = new JTextField ("nom formation");
		                	    String nom = testField1.getText();
		                	    JTextField  testField2 = new JTextField ("duree formation");
		                	    float duree =Float.parseFloat(testField2.getText()) ;
		                	    JTextField  testField3 = new JTextField ("prix formation");
		                	    float prix =Float.parseFloat(testField2.getText()) ;
		                	    JTextField  testField4 = new JTextField ("Mati�re initiale");
		                	    String Mati�re = testField1.getText();
		                	   /* formation R = new formation(nom,duree,prix,Mati�re);*/
		                	    pannel.add(testField1);pannel.add(testField2);
		                	    pannel.add(testField3);pannel.add(testField4);
		                	    f.getContentPane().add(pannel);
		                	    f.setVisible(true);
		                	 /*textArea = new JTextArea("nom formation",5, 20);
		                	 JScrollPane scrollPane = new JScrollPane(textArea); 
		                	 textArea.setEditable(false); */
	
		                	 panneau.removeAll();
			                 panneau.revalidate();
			                 panneau.repaint();
			                 
			                 setContentPane(p_forma);
			    		     setSize(600,150);
			    		     setVisible(true); 
		                 }
		             }
		         }
		     });
		     
		     bouton_f1.addActionListener(new ActionListener() {
		    	    public void actionPerformed(ActionEvent arg0) {
		    	    }
		    	});
		     
		     bouton_f1.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		             if (!bouton_f1.getModel().isPressed()) {
		                 {/*drop down menu to select*/
		                	 
		                	 
		                	 setContentPane(Action_f);
		        		     setSize(500,200);
		        		     setVisible(true);
		                 }
		             }
		         }
		     });
		     
		     bouton_fs0.addActionListener(new ActionListener() {
		    	    public void actionPerformed(ActionEvent arg0) {
		    	    }
		    	});
		     
		     bouton_fs0.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		             if (!bouton_fs0.getModel().isPressed()) {
		                 {/*supprimer formation*/
		                	 setContentPane(panneau);
		        		     setSize(400,150);
		        		     setVisible(true);
		                 }
		             }
		         }
		     });
		     bouton_fs1.addActionListener(new ActionListener() {
		    	    public void actionPerformed(ActionEvent arg0) {
		    	    }
		    	});
		     
		     bouton_fs1.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		             if (!bouton_fs1.getModel().isPressed()) {
		                 {/*Modifier formati*/
		                	 setContentPane(Modifier_f);
		        		     setSize(300,200);
		        		     setVisible(true);
		                 }
		             }
		         }
		     });
		     /*peanneau ,
		      * p_forma,Action_f,Modifier_f */ 
		     JPanel p_mati�re = new JPanel();
		     JPanel p_participant = new JPanel();
		     
}}