import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AjoutProduit extends JFrame{

	private JLabel lbr;
	private JPanel pnr;
	private JTextField txtr;
	private JPanel pnr1;
	private JPanel pnr2;
	private JLabel lbn;
	private JPanel pnn;
	private JTextField txtn;
	private JPanel pnr3;
	private JPanel pnr4;
	private JLabel lbq;
	private JPanel pnq;
	private JTextField txtq;
	private JPanel pnr5;
	private Container pnr6;
	private JButton btnv;
	private JButton btna;
	private JPanel pnbv;
	private JPanel pnba;
	private JPanel pnaz;

	AjoutProduit(){
		
		this.setTitle("Ajouter un produit");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(new GridLayout(4, 1));
		
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
		
		lbn=new JLabel();
        lbn.setText("Nom :");
        pnn=new JPanel();
        pnn.setLayout(new GridLayout(1, 2));
		txtn=new JTextField();
		txtn.setPreferredSize(new Dimension(150,20));
		
		pnr3=new JPanel();
		pnr3.add(lbn);
		pnr4=new JPanel();
		pnr4.add(txtn);
		
		pnn.add(pnr3);
		pnn.add(pnr4);
		this.add(pnn);
		
		
		lbq=new JLabel();
        lbq.setText("Quantite :");
        pnq=new JPanel();
        pnq.setLayout(new GridLayout(1, 2));
		txtq=new JTextField();
		txtq.setPreferredSize(new Dimension(150,20));
		
		pnr5=new JPanel();
		pnr5.add(lbq);
		pnr6=new JPanel();
		pnr6.add(txtq);
		
		pnq.add(pnr5);
		pnq.add(pnr6);
		this.add(pnq);
		JLabel lbpass=new JLabel("ajout avec succes");
		btnv=new JButton("Valider");
		btna=new JButton("Annuler");
		btna.setBackground(Color.yellow);
		btnv.setBackground(Color.yellow);
		btnv.setPreferredSize(new Dimension(130,30));
		btna.setPreferredSize(new Dimension(130,30));
		pnbv=new JPanel();
		pnbv.add(btnv);
		pnba=new JPanel();
		pnba.add(btna);
		pnaz=new JPanel();
		pnaz.add(pnbv);
		pnaz.add(pnba);
		this.add(pnaz);
		btna.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		btnv.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				
				ProduitManager f=new ProduitManager();
				f.insererproduit(txtr.getText(), txtn.getText(), txtq.getText());
				JOptionPane.showMessageDialog(null, lbpass, "Erreur1", JOptionPane.YES_NO_OPTION);
				txtn.setText(null);
				txtq.setText(null);
				txtr.setText(null);
			}
		});
	}
}
