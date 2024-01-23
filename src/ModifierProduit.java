import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ModifierProduit extends JFrame {
	private JLabel lbr;
	private JPanel pnr;
	private JTextField txtr;
	private JPanel pnr1;
	private JPanel pnr2;
	private JButton btnv;
	private JComponent btna;
	private JPanel pnbv;
	private JPanel pnba;
	private JPanel pnaz;
	private JButton btns;
	private JComponent btnr;
	private Component pnbs;
	private Component pnbr;
	private JButton btnw;
	private JLabel lbr1;
	private JTextField txtr1;
	private JPanel pnr5;
	private JPanel pnr6;
	private JPanel pnr9;
	
	ModifierProduit(){
	this.setTitle("Modifier un produit");
	this.setSize(400,220);
	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    this.setLayout(new GridLayout(3, 1));

    lbr=new JLabel();
    lbr.setText("Reference :");
    pnr=new JPanel();
    pnr.setLayout(new GridLayout(1, 2));
	txtr=new JTextField();
	txtr.setPreferredSize(new Dimension(150,20));
	
	pnr1=new JPanel();
	pnr1.setPreferredSize(new Dimension(150,20));
	
	pnr1.add(lbr);
	pnr2=new JPanel();
	pnr2.add(txtr);
	
	pnr.add(pnr1);
	pnr.add(pnr2);
	this.add(pnr);
	
	    lbr1=new JLabel();
	    lbr1.setText("Quantite :");
	    pnr9=new JPanel();
	    pnr9.setLayout(new GridLayout(1, 2));
		txtr1=new JTextField();
		txtr1.setPreferredSize(new Dimension(150,20));
		
		pnr5=new JPanel();
		pnr5.setPreferredSize(new Dimension(150,20));
		
		pnr5.add(lbr1);
		pnr6=new JPanel();
		pnr6.add(txtr1);
		
		pnr9.add(pnr5);
		pnr9.add(pnr6);
		this.add(pnr9);
	
	btnv=new JButton("Modifier");
	btnw=new JButton("Annuler");
	btnw.setBackground(Color.yellow);
	btnv.setBackground(Color.yellow);
	btnv.setPreferredSize(new Dimension(120,25));
	btnw.setPreferredSize(new Dimension(120,25));
	pnbv=new JPanel();
	pnbv.add(btnv);
	pnba=new JPanel();
	pnba.add(btnw);
	pnaz=new JPanel();
	pnaz.add(pnbv);
	pnaz.add(pnba);
	this.add(pnaz);}
}
