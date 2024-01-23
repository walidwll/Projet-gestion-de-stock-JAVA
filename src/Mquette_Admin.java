import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Mquette_Admin extends JFrame {
	String ch;
	private JLabel lb_n; 
	private JPanel pn1;

	private JLabel lb_r;
	private JLabel lb_m;
	private JLabel lb_q;
	private JTextField txt_r;
	private JTextField txt_m;
	private JTextField txt_q;
	private JButton btnv;
	private JPanel pnbv;
	private JButton btna;
	private JButton btnm;
	private JButton btns;
	private JButton btnq;
	private JPanel pn_2;
	private JPanel pn_4;
	private JPanel pn_5;
	private JPanel pn_6;
	private JPanel pn_7;
	private JPanel pnba;
	private JPanel pnbb;
	private JPanel pnbc;
	private JPanel pnbd;
	static ArrayList<Produit> data=new ArrayList<Produit>();

	Mquette_Admin(String ch){
		this.ch=ch;
		this.setTitle("Admin");
		this.setSize(800,500);
		this.setLayout(new BorderLayout());
		
		lb_n=new JLabel();
		lb_n.setText("Mr" +" "+this.ch);
		lb_n.setFont(new Font("Arial",Font.ITALIC,39));
		lb_n.setHorizontalAlignment(JLabel.CENTER);
		lb_n.setOpaque(true);
		
		pnbv=new JPanel();
		
		pnbv.add(lb_n);
		pnbv.setBackground(Color.yellow);
		
		pn1=new JPanel();
		pn1.setLayout(new FlowLayout());
		pn1.add(pnbv);
		lb_r=new JLabel("Reference");
		lb_m=new JLabel("Nom");
		lb_q=new JLabel("Quantite");
		txt_r=new JTextField(9);
		txt_m=new JTextField(9);
		txt_q=new JTextField(9);
		lb_n.setBackground(Color.yellow);
		
		
		this.add(lb_n, BorderLayout.NORTH);
		
		pn_2=new JPanel();
		pn_4=new JPanel();
		pn_5=new JPanel();
		pn_6=new JPanel();
		pn_7=new JPanel();
		pn_2.setLayout(new GridLayout(4,1));
		btna=new JButton("Ajouter");
		
		btnm=new JButton("Modifier");
		btns=new JButton("Supprimer");
		btnq=new JButton("Afficher ");
		btna.setPreferredSize(new Dimension(160, 30));
		btnm.setPreferredSize(new Dimension(160, 30));
		btnq.setPreferredSize(new Dimension(160, 30));
		btns.setPreferredSize(new Dimension(160, 30));
		JLabel lba=new JLabel("Ajouter un produit: ");
		JLabel lbb=new JLabel("Modifier un produit: ");
		JLabel lbc=new JLabel("Supprimer un produit: ");
		JLabel lbd=new JLabel("Afficher tous les produits: ");
		lba.setOpaque(true);
		lba.setHorizontalAlignment(JLabel.CENTER);
		JPanel pna=new JPanel();
		pna.add(lba);
		pnba=new JPanel();
		pnba.add(btna);
		pn_4.setLayout(new GridLayout(1,2));
		pn_4.add(pna);
		pn_4.add(pnba);
		pn_5.setLayout(new GridLayout(1,2));
		lbb.setOpaque(true);
		lbb.setHorizontalAlignment(JLabel.CENTER);
		JPanel pnb=new JPanel();
		pnb.add(lbb);
		pnbb=new JPanel();
		pnbb.add(btnm);
		
		pn_5.add(pnb);
		pn_5.add(pnbb);
		
		lbc.setOpaque(true);
		lbc.setHorizontalAlignment(JLabel.CENTER);
		JPanel pnc=new JPanel();
		pnc.add(lbc);
		pnbc=new JPanel();
		pnbc.add(btns);
		pn_6.setLayout(new GridLayout(1,2));
		
		pn_6.add(pnc);
		pn_6.add(pnbc);
		
		
		pn_7.setLayout(new GridLayout(1,2));
		lbd.setOpaque(true);
		lbd.setHorizontalAlignment(JLabel.CENTER);
		JPanel pnd=new JPanel();
		pnd.add(lbd);
		pnbd=new JPanel();
		pnbd.add(btnq);
		
		
		pn_7.add(pnd);
		pn_7.add(pnbd);
		
		pn_2.add(pn_4);
		
	
		pn_2.add(pn_5);
		
		pn_2.add(pn_6);
	
		pn_2.add(pn_7);
		
		this.add(pn_2, BorderLayout.CENTER);
		
		btnm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ModifierProduit n=new ModifierProduit();
				n.setVisible(true);
				
			}
		});
		btna.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AjoutProduit f=new AjoutProduit();
				f.setVisible(true);
			}
		});
		btns.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SupprimerProduit x=new SupprimerProduit();
				x.setVisible(true);
			}
		});
		btnq.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Jtable f=new Jtable();
				f.setVisible(true);
			}
		});
	}
}
