import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JWindow;
import javax.swing.text.AttributeSet.ColorAttribute;

public class Creer_un_compte extends JFrame {

	private JLabel lb_b;
	private JPanel pn_b;
	private JPanel pn_c;
	private JLabel lbn;
	private JTextField txtn;
	private JPanel pn1;
	private JPanel pn_d;
	private JLabel lbm;
	private JPasswordField txtm;
	private JPanel pn2;
	private JPanel pn_e;
	private JLabel lbe;
	private JPasswordField txte;
	private JPanel pn3;
	private JButton bta;
	private JButton btb;
	private JButton btc;
	private JPanel pn4;
	private JPanel pn_r;
	private JPanel pn_f;
	private JLabel lbcon;
	private JPanel pn_t;
	private JPanel pn_c1;
	private JPanel pn_c2;
	private JPanel pn_c3;
	private JLabel lbpass;
	private JLabel lbpass1;
	JLabel jl;
	JPanel jp;
	ImageIcon img;

	Creer_un_compte() {

		displayjwindow();
		this.setSize(520, 300);
		this.setTitle("Acceuil");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());

		lb_b = new JLabel();
		lb_b.setText("Bienvenue");
		pn_b = new JPanel();
		pn_b.add(lb_b);
		lb_b.setFont(new Font("Arial", Font.ITALIC, 39));
		pn_b.setBackground(Color.yellow);
		pn_c = new JPanel();
		pn_c.setLayout(new GridLayout(4, 1));
		lbn = new JLabel("           Email :");
		txtn = new JTextField();
		txtn.setPreferredSize(new Dimension(180, 20));

		pn1 = new JPanel();
		pn1.add(lbn);
		pn1.add(txtn);
		pn_c.add(pn1);

		pn_d = new JPanel();
		pn_d.setLayout(new GridLayout(4, 1));
		lbm = new JLabel("        Password :");
		txtm = new JPasswordField();
		txtm.setPreferredSize(new Dimension(180, 20));
		pn2 = new JPanel();
		pn2.add(lbm);
		pn2.add(txtm);
		pn_c.add(pn2);

		pn_e = new JPanel();
		pn_e.setLayout(new GridLayout(4, 1));
		lbe = new JLabel("Confirm Password :");
		txte = new JPasswordField();
		txte.setPreferredSize(new Dimension(180, 20));
		pn3 = new JPanel();
		pn3.add(lbe);
		pn3.add(txte);
		pn_c.add(pn3);
		bta = new JButton("Admin");
		btb = new JButton("Client");
		pn4 = new JPanel();
		pn4.setLayout(new GridLayout(1, 2));
		pn_r = new JPanel();
		pn_f = new JPanel();

		bta.setPreferredSize(new Dimension(120, 30));
		btb.setPreferredSize(new Dimension(120, 30));
		pn_r.add(bta);
		pn_f.add(btb);
		pn4.add(pn_r);
		pn4.add(pn_f);
		pn_c.add(pn4);

		pn_t = new JPanel();
		pn_t.setLayout(new GridLayout(4, 1));
		pn_c1 = new JPanel();
		pn_c2 = new JPanel();
		pn_t.add(pn_c1);
		pn_c3 = new JPanel();

		lbcon = new JLabel("Vous avez deja un compte :");
		btc = new JButton("Se connecter");
		btc.setBackground(Color.yellow);
		bta.setBackground(Color.yellow);
		btb.setBackground(Color.yellow);
		lbcon.setPreferredSize(new Dimension(180, 20));
		lbcon.setHorizontalAlignment(JLabel.CENTER);
		pn_c2.add(lbcon);

		lbpass = new JLabel("mot de passe est incorrecte");
		lbpass1 = new JLabel("veuillez remplir tous les champs ");
		pn_c3.add(btc);
		pn_t.add(pn_c1);
		pn_t.add(pn_c2);
		pn_t.add(pn_c3);
		this.add(pn_c, BorderLayout.WEST);
		this.add(pn_t, BorderLayout.EAST);
		this.add(pn_b, BorderLayout.NORTH);

		btc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Maquette_bienv d = new Maquette_bienv();
				d.setVisible(true);
				dispose();
			}
		});
		bta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if ((txte.getText().equals("")) && (txtm.getText().equals("")) && (txtn.getText().equals(""))) {

					JOptionPane.showMessageDialog(null, lbpass1, "Erreur1", JOptionPane.WARNING_MESSAGE);
				}

				else {

					ProduitManager f = new ProduitManager();

					f.insereradmin(txtn.getText().toString(), txtm.getText().toString());
					txte.setText("");
					txtm.setText(null);
					txtn.setText(null);
				}

			}

		});

		btb.addActionListener(new ActionListener() {

			String ch1;
			String ch2;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ch1 = txte.getText().toString();
				ch2 = txtm.getText().toString();
				System.out.println(ch1);
				System.out.println(ch2);
				if ((txte.getText().equals("")) && (txtm.getText().equals("")) && (txtn.getText().equals(""))) {

					JOptionPane.showMessageDialog(null, lbpass1, "Erreur1", JOptionPane.WARNING_MESSAGE);
				}

				else {

					ProduitManager f = new ProduitManager();
					f.insererclient(txtn.getText().toString(), txtm.getText().toString());
					txte.setText("");
					txtm.setText(null);
					txtn.setText(null);
				}

			}

		});

	}

	private void displayjwindow() {
		// TODO Auto-generated method stub

		try {
			img = new ImageIcon(getClass().getResource("azerty.jpg"));

			JLabel jl2 = new JLabel(img);
			jl2.setPreferredSize(new Dimension(300, 300));
			jl2.setHorizontalAlignment(jl2.CENTER);
			JWindow s = new JWindow();
			JPanel f = new JPanel();
			f.add(jl2);
			s.setSize(260, 600);
			s.setLocationRelativeTo(null);
			s.setVisible(true);

			s.add(f);
			// f.setBackground(Color.white);

			f.setBorder(BorderFactory.createLineBorder(Color.yellow));
			progr = new JProgressBar(0, 100);
			s.add(BorderLayout.PAGE_END, progr);
			s.revalidate();
			

			time = new javax.swing.Timer(100, new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) { // TODO Auto-generated
					int x = progr.getValue();
					if (x == 100) {
						s.dispose();
						Creer_un_compte.this.setVisible(true);
						time.stop();
					} else {
						progr.setValue(x + 2);
					}
				}
			});
			time.start();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	JProgressBar progr;
	javax.swing.Timer time;

	class Animation extends Thread {

		@Override
		public void run() {
			for (int i = 0; i <= 100; i++) {
				progr.setValue(i);
				System.out.println(i);

				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {

				}
			}

		}
	}
}
