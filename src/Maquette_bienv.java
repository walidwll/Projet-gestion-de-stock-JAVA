import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Maquette_bienv extends JFrame {
	private JLabel lb_1;
	private JPanel pn_1;
	private JTextField txt_n;
	private JLabel lb_n;
	private JLabel lb_m;
	private JLabel lb_mo;
	private JTextField txt_m;
	private JTextField txt_mo;
	private JPanel pn_2;
	private JPanel pn_3;
	private JPanel pn_4;
	private JPanel pn_5;
	private Container pn_6;
	private JPanel pn_7;
	private JPanel pn_8;
	private JPanel pn_11;
	private JPanel pn_12;
	private JLabel lb_help;
	String ch1;
	String ch3,ch2,ch4,ch5;
	JButton ba;
	Maquette_bienv(){
		
		this.setSize(800, 400);;
		this.setTitle("Bienvenue");
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		lb_1=new JLabel();
		lb_1.setText("MARJANE");
		lb_1.setFont(new Font("Arial",Font.ITALIC,39));
		
		pn_1=new JPanel();
		
		pn_1.setSize(new Dimension(800,70));
		pn_1.setBackground(Color.YELLOW);
		pn_1.add(lb_1);
		this.add(pn_1, BorderLayout.NORTH);
		
		lb_m=new JLabel("Email :");
		lb_m.setPreferredSize(new Dimension(250,30));
		lb_m.setHorizontalAlignment(JLabel.RIGHT);
		pn_5=new JPanel();
		pn_5.add(lb_m);
		lb_mo=new JLabel("Mot de passe :");
		lb_mo.setPreferredSize(new Dimension(250,30));
		lb_mo.setHorizontalAlignment(JLabel.RIGHT);;
		pn_6=new JPanel();
		pn_6.add(lb_mo);
		
		txt_m=new JTextField();
		txt_mo=new JTextField();
		txt_mo.setPreferredSize(new Dimension(350,30));
		txt_m.setPreferredSize(new Dimension(350,30));
		//txt_m.setHorizontalAlignment(JTextField.LEFT);
		pn_11=new JPanel();
		pn_12=new JPanel();
		pn_3=new JPanel();
		pn_3.add(txt_mo);
		pn_4=new JPanel();
		pn_4.add(txt_m);
		pn_2=new JPanel();
		pn_2.setLayout(new GridLayout(3,3));
		//pn_2.add(pn_11);
		//pn_2.add(pn_12);
		pn_2.add(pn_5);
		pn_2.add(pn_4);
		pn_2.add(pn_6);
		pn_2.add(pn_3);
		JButton bc=new JButton("Client");
		ba=new JButton("Admin");
		bc.setPreferredSize(new Dimension(230,30));
		ba.setPreferredSize(new Dimension(230,30));
		JLabel lbpass=new JLabel("email ou mot de passe incorrecte");
		//JLabel lbpass=new JLabel("email ou mot de passe incorrecte");

		bc.setBackground(Color.YELLOW);
		ba.setBackground(Color.YELLOW);
		pn_7=new JPanel();
		pn_7.add(bc);
		pn_8=new JPanel();
		pn_8.add(ba);
		pn_2.add(pn_7);
		pn_2.add(pn_8);
		lb_help=new JLabel("");
		this.add(pn_2, BorderLayout.CENTER);
		this.add(lb_help, BorderLayout.SOUTH);
		ba.addMouseListener(new Ecouteurmouse());
		lb_m.addMouseListener(new Ecouteurmouse());
		lb_mo.addMouseListener(new Ecouteurmouse());
		txt_m.addMouseListener(new Ecouteurmouse());
		txt_mo.addMouseListener(new Ecouteurmouse());
		ch1=txt_m.getText();
		bc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a=5;
				ch4=txt_m.getText();
				ch5=txt_mo.getText();
				ResultSet rs1;
				ProduitManager f=new ProduitManager();
				rs1=f.connecterclient(txt_m.getText(), txt_mo.getText().toString());
				try {
					while(rs1.next()) {
						 ch3=rs1.getString(1);
						 ch2=rs1.getString(2);
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("eeeeee");
				}
				
				System.out.println(ch3);
				System.out.println(ch2);
				System.out.println(ch4);
				System.out.println(ch5);
				System.out.println("eeeeeggge");
			if((txt_m.getText().equals(ch3))&&(txt_mo.getText().equals(ch2))) {
				
				Mquette_Client w=new Mquette_Client();
				w.setVisible(true);
			}
			else {
				JOptionPane.showMessageDialog(null, lbpass, "Erreur1", JOptionPane.WARNING_MESSAGE);
			}
				}
		});
		ba.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ch4=txt_m.getText();
				ch5=txt_mo.getText();
				ResultSet rs1;
				ProduitManager f=new ProduitManager();
				rs1=f.connecteradmin(txt_m.getText(), txt_mo.getText().toString());
				try {
					while(rs1.next()) {
						 ch3=rs1.getString(1);
						 ch2=rs1.getString(2);
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("eeeeee");
				}
				
				System.out.println(ch3);
				System.out.println(ch2);
				System.out.println(ch4);
				System.out.println(ch5);
				System.out.println("eeeeeggge");
			if((txt_m.getText().equals(ch3))&&(txt_mo.getText().equals(ch2))) {
				
				Mquette_Admin d=new Mquette_Admin(txt_m.getText().toString());
				d.setVisible(true);
				dispose();
			}
			else {
				JOptionPane.showMessageDialog(null, lbpass, "Erreur1", JOptionPane.WARNING_MESSAGE);
			}
				}
		});
	}
	
	class Ecouteurmouse extends MouseAdapter{

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==ba) {
				lb_help.setText("Help:  ");
			}
			if(e.getSource()==txt_m) {
				lb_help.setText("Help:  Veuillez entrez votre Mail");
			}
			if(e.getSource()==txt_mo) {
				lb_help.setText("Help:  Veuillez entrez votre mot de passe");
			}
			if(e.getSource()==lb_m) {
				lb_help.setText("Help:  Veuillez entrez votre Mail");
			}
			if(e.getSource()==lb_mo) {
				lb_help.setText("Help:  Veuillez entrez votre mot de passe");
			}
			
		};

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-  method stub
			if(e.getSource()==lb_m) {
				lb_help.setText("Help:");
			}
			if(e.getSource()==lb_mo) {
				lb_help.setText("Help:");
			}
			if(e.getSource()==ba) {
				lb_help.setText("Help:");
			}
			if(e.getSource()==txt_m) {
				lb_help.setText("Help:  ");
			}
			if(e.getSource()==txt_mo) {
				lb_help.setText("Help:  ");
			}
		};
		 
	}
	
}
