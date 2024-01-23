import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SupprimerProduit extends JFrame{
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

	SupprimerProduit(){
		
		this.setTitle("Supprimer un produit");
		this.setSize(400, 120);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(new GridLayout(2, 1));

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
		
		btnv=new JButton("Supprimer");
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
		this.add(pnaz);
		btnv.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ProduitManager r=new ProduitManager();
				r.suppimerSelonreference(txtr.getText());
				txtr.setText(null);
			}
		});
		btnw.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		dispose();		
			}
		});
	}
}
