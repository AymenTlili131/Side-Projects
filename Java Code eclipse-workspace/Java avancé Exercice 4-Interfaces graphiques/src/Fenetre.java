import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Fenetre extends JFrame implements ActionListener
{  JTextField txt3=new JTextField(5);
	public Fenetre(String title, int a, int b,int c)
	{this.setTitle("Formulaire CV");
	this.setSize(a,b);
	
	class moins implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==b1)
		txt3.setText(String.valueOf(Integer.parseInt(txt1.getText()+Integer.parseInt(pwd1.getText()))));
		
	}}
/*if (c==0) {*//*pan.setBackground(Color.BLUE);AWT contient la classe Color  */
BorderLayout BL =new BorderLayout();
GridLayout GL = new GridLayout(2,2);
FlowLayout FL= new FlowLayout();
JPanel pan3= new JPanel();
JPanel pan=new JPanel();
 
this.setContentPane(pan);

JLabel l1=new JLabel(" Nom: ");
JLabel l2=new JLabel(" Prénom :");
JLabel l3=new JLabel(" Poste");

JTextField txt1=new JTextField(20);
JTextField txt2 = new JTextField(20);
JTextField txt3 = new JTextField(20);
pan.setLayout( BL );

pan3.setLayout(GL);
this.getContentPane().add(l1);
this.getContentPane().add(txt1);
this.getContentPane().add(l2);
this.getContentPane().add(txt2);
this.getContentPane().add(l3);
this.getContentPane().add(txt3);
pan3.add(l1);
pan3.add(txt1);
pan3.add(l2);
pan3.add(txt2);
pan3.add(l3);
pan3.add(txt3);


JPanel p2=new JPanel();
JButton b1=new JButton("ajouter Stage");
b1.addActionListener(CV.ajouterStage());
p2.add(b1);
JButton b2=new JButton("ajouter Compétence");
b1.addActionListener(CV.ajouterCompétence());
p2.add(b2);
JButton b3=new JButton("ajouter Loisir");
b1.addActionListener(CV.ajouterLoisir());
p2.add(b3);
JButton b4=new JButton("ajouter Projet");
b1.addActionListener(CV.ajouterProjet());
p2.add(b4);

JButton b5=new JButton("confirmer");
p2.add(b5);

JPanel p3=new JPanel();
p3.add(l3);p3.add(txt3);

pan.add(pan3,BorderLayout.NORTH);
pan.add(p2,BorderLayout.CENTER);
pan.add(p3,BorderLayout.SOUTH);
this.setContentPane(pan);
this.setLocationRelativeTo(null);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}




}
