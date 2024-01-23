import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ProduitManager extends JFrame{
	private Connection conn;
	private Statement st;

	public ProduitManager() {
	
		
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("chargement termine");
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		System.out.println("erreur chargement"+e1.getMessage());
	
	}
	
	String url="jdbc:mysql://127.0.0.1/app_rapport";
	String user="root";
	String mp="";
	
	
	try {
		conn=DriverManager.getConnection(url,user,mp);
		System.out.println("connection etablie");
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
		System.out.println("erreur de connexion"+e1.getMessage());
	}
	
	try {
		if(conn!=null) 
		{
		st=conn.createStatement();
		}
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	}
	int inserer(String reference,String nom,String qte){
		int s=0;
		if(st!=null) {
	    	
	    	try {
				 s=st.executeUpdate("insert into produit values ('"+reference+"','"+nom+"','"+qte+"')");
				System.out.println("insertion avec succes");
		
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println("erreur insertion");
				return 0;
			}
	    	
	    }
		return s;
	
	}
	int insererclient(String email,String mdp){
		int s=0;
		if(st!=null) {
	    	
	    	try {
				 s=st.executeUpdate("insert into client values ('"+email+"','"+mdp+"')");
				System.out.println("insertion avec succes");
		
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println("erreur insertion");
				return 0;
			}
	    	
	    }
		return s;
	
	}
	int insereradmin(String email,String mdp){
		int s=0;
		if(st!=null) {
	    	
	    	try {
				 s=st.executeUpdate("insert into admin values ('"+email+"','"+mdp+"')");
				System.out.println("insertion avec succes");
		
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println("erreur insertion");
				return 0;
			}
	    	
	    }
		return s;
	
	}
	int insererproduit(String refer,String nom,String qte){
		int s=0;
		if(st!=null) {
	    	
	    	try {
				 s=st.executeUpdate("insert into produit value('"+refer+"','"+nom+"','"+nom+"')");
				System.out.println("insertion avec succes");
		
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println("erreur insertion");
				return 0;
			}
	    	
	    }
		return s;
	
	}
	public void suppimerSelonreference(String reference)
	{
        JLabel lbpass=new JLabel("supression avec succes");
        JLabel lbpass1=new JLabel("refer inexistante");
		if(st!= null)
		{
			String requete = "delete from produit where refer= ?";
			try
			{
				PreparedStatement ps= conn.prepareStatement(requete);
				ps.setString(1,reference);
				int n=ps.executeUpdate();
				//a= ps.executeUpdate();
				if(n!=0) {
				JOptionPane.showMessageDialog(null, lbpass, "Erreur1", JOptionPane.YES_NO_OPTION);}
				else {JOptionPane.showMessageDialog(null, lbpass1, "Erreur1", JOptionPane.YES_NO_OPTION);}
				System.out.println("execute avec sucess");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				System.out.println("erreur execution requete de suppression");
			}
		}
		
	}
	
	public void modifierqte(String a,String b) {
		 PreparedStatement ps;
		
		String query = "UPDATE preoduit SET qte = ? where reference = ?";
		 
		  try {
			ps = conn.prepareStatement(query);
			  ps.setString(1, a);
			  ps.setString(2, b);
			  ps.executeUpdate();
			  System.out.println("modifier avec succes!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			  System.out.println("probleme");
		}
		
		
	}
	ResultSet afficherTout(){
		ResultSet rs=null;
		if(st!=null) {
			try {
			rs=st.executeQuery("select * from produit");
		} catch (SQLException e) {
		System.out.println("erreur selection"+e.getMessage());	
		}
		}
		return rs;
	}
	ResultSet connecterclient(String email,String mdp){
		ResultSet rs=null;
		if(st!=null) {
			try {
			rs=st.executeQuery("select * from client where email='"+email+"' and mdp='"+mdp+"'");
		} catch (SQLException e) {
		System.out.println("erreur selection"+e.getMessage());	
		}
		}
		return rs;
	}
	ResultSet connecteradmin(String email,String mdp){
		ResultSet rs=null;
		if(st!=null) {
			try {
			rs=st.executeQuery("select * from admin where email='"+email+"' and mdp='"+mdp+"'");
		} catch (SQLException e) {
		System.out.println("erreur selection"+e.getMessage());	
		}
		}
		return rs;
	}
	ResultSet verifierproduit(String refer,String qte){
		ResultSet rs=null;
		if(st!=null) {
			try {
			rs=st.executeQuery("select * from produit where refer='"+refer+"' and qte>'"+qte+"'");
		} catch (SQLException e) {
		System.out.println("erreur selection"+e.getMessage());	
		}
		}
		return rs;
	}
}
