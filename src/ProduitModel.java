import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ProduitModel extends AbstractTableModel{

	String m77;
	private ResultSetMetaData rsmd;
    int nbligne=0;
    ArrayList<Object[]> data=new ArrayList<Object[]>();
	ProduitModel(ResultSet rs){
		
		try {
			rsmd=rs.getMetaData();
			
			while(rs.next()) {
				nbligne++;
				Object[] ligne =new Object[rsmd.getColumnCount()] ;
				for(int i=0;i<ligne.length;i++) {
					ligne[i]=rs.getObject(i+1);
					
				}
				data.add(ligne);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		try {
         return rsmd.getColumnCount();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Object getValueAt(int l, int c) {
		// TODO Auto-generated method stub
		
		return data.get(l)[c];
	}
	
	@Override
	public String getColumnName(int c) {
		// TODO Auto-generated method stub
		try {
			return rsmd.getColumnName(c+1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "erreur";
		}
	}
	@Override
	public void setValueAt(Object val, int l, int c) {
		// TODO Auto-generated method stub
		m77=data.get(l)[c].toString();
		 String m2=val.toString();
		data.get(l)[c]=val;
		//maj bdd
		ProduitManager pm=new ProduitManager();
		pm.modifierqte(m2, m77);

	}

	@Override
	public boolean isCellEditable(int l, int c) {
		// TODO Auto-generated method stub
		if(getColumnName(c).equals("qte"))
			return true;
		else
		return super.isCellEditable(l, c);
	}

	public void supprimer(int selectedRow) {
		// TODO Auto-generated method stub
		Object[] p=data.get(selectedRow);
		ProduitManager pm=new ProduitManager();
		pm.suppimerSelonreference(p[2].toString());
		data.remove(selectedRow);
		this.fireTableDataChanged();
	}
}
