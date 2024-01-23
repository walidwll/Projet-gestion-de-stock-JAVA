import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Mquette_Client extends JFrame {

	private JLabel lb_num;
	private JLabel lb_qte;
	private JLabel lb_ref;
	private JTextField txt_ref;
	private JTextField txt_qte;
	private JButton bt_val;
	private JPanel pn_5;
	private JPanel pn_6;
	private JPanel pn_1;
	private Container pn_2;
	private JPanel pn_3;
	private JPanel pn_4;
String ch3,ch2;
	Mquette_Client(){
		
		this.setSize(600, 300);;
		this.setTitle("Client");
		this.setLayout(new GridLayout(3,3));
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		lb_ref=new JLabel();
		lb_ref.setText("Reference :");
		lb_qte=new JLabel();
		lb_qte.setText("Quantite :");
		lb_ref.setPreferredSize(new Dimension(250,30));
		lb_qte.setPreferredSize(new Dimension(250,30));
		lb_ref.setHorizontalAlignment(JLabel.CENTER);
		lb_ref.setBackground(Color.yellow);
		lb_ref.setOpaque(true);
		lb_qte.setBackground(Color.yellow);
		lb_qte.setOpaque(true);
		lb_ref.setBackground(Color.yellow);
		lb_qte.setHorizontalAlignment(JLabel.CENTER);
		txt_ref=new JTextField();
		txt_qte=new JTextField();
		pn_5=new JPanel();
		bt_val=new JButton("Valider");
		pn_6=new JPanel();  
		//lb_ref.setPreferredSize(new Dimension(200,30));
		txt_ref.setPreferredSize(new Dimension(200,30));
		txt_qte.setPreferredSize(new Dimension(200,30));
		pn_1=new JPanel();
		pn_1.add(lb_ref);
		JLabel lbpass=new JLabel("produit existant");
		JLabel lbpass1=new JLabel("produit non existant");

		pn_2=new JPanel();
		pn_2.add(txt_ref);
		pn_3=new JPanel();
		pn_3.add(lb_qte);
		pn_4=new JPanel();
		pn_4.add(txt_qte);
		bt_val.setPreferredSize(new Dimension(150,30));
		bt_val.setBackground(Color.yellow);
		pn_5=new JPanel();
		pn_5.add(bt_val);
		this.add(pn_1);
		this.add(pn_2);
		this.add(pn_3);
		this.add(pn_4);
		this.add(pn_6);
		this.add(pn_5);
		
		
		bt_val.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ResultSet rs1;
				ProduitManager r=new ProduitManager();
				rs1=r.verifierproduit(txt_ref.getText().toString(), txt_qte.getText().toString());
				try {
					while(rs1.next()) {
						 ch3=rs1.getString(1);
						 ch2=rs1.getString(2);
						 System.out.println(ch3);
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("eeeeee");
				}
				
				if(ch3!=null) {
					
					JOptionPane.showMessageDialog(null, lbpass, "Erreur1", JOptionPane.YES_NO_OPTION);
                  txt_qte.setText(null);
                  txt_ref.setText(null);
				}
				else {
					JOptionPane.showMessageDialog(null, lbpass1, "Erreur1", JOptionPane.YES_NO_OPTION);
					txt_qte.setText(null);
	                  txt_ref.setText(null);
				}
			}
		});
		
		
		
		
	}
}
