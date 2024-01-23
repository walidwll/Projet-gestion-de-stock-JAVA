import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Jtable extends JFrame {
	private JScrollPane scr;
	private ProduitModel model;
	private JTable jt;

	Jtable(){
		
		this.setSize(700,400);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		ProduitManager pm=new ProduitManager();
		ResultSet rs=pm.afficherTout();
		
		model=new ProduitModel(rs);
		
		
		jt=new JTable(model);
		
		jt.addMouseListener(new ecouteur());
		scr=new JScrollPane(jt);
		this.add(scr);
				
		
		
		
	}
	/*public static void main(String[] args) {
		Jtable f=new Jtable();
		f.setVisible(true);
	}*/
class ecouteur extends MouseAdapter{
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

    if(e.getSource()==jt) {
	
	if(e.getButton()==e.BUTTON3) {
		
		JPopupMenu om=new JPopupMenu(); 
		JMenuItem supp=new JMenuItem("supprimer");
		om.add(supp);
		om.show(jt,e.getX(),e.getY());
		supp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				model.supprimer(jt.getSelectedRow());
				
			
	}
		});
		}
	}
	}}
}
