import java.sql.*;
import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;
import java.sql.Statement;  
/*
<applet code="C.class" height = 700 width=700>
</applet> */
public class C extends Applet implements ActionListener  
{  
    TextField t1 = new TextField(10);  //for id
    TextField t2 = new TextField(10);  //for first name
    TextField t3 = new TextField(10);  //for last name
    TextField t4 = new TextField(10);  //for subject

    Label l1 = new Label("Faculty ID:");  
    Label l2 = new Label("First Name:");  
    Label l3 = new Label("Last Name:"); 
    Label l4 = new Label("Subject:");
  
    Button b1 = new Button("Display");
    Button b2 = new Button("Insert"); 
    Button b3 = new Button("Update");
    Button b4 = new Button("Delete");
    String finalstr;
  public void init()  
    {  
       setBackground(Color.RED);
       b1.setBackground(Color.BLUE);
       b2.setBackground(Color.BLUE);
       b3.setBackground(Color.BLUE);
       b4.setBackground(Color.BLUE);

       b1.setForeground(Color.WHITE);
       b2.setForeground(Color.WHITE);
       b3.setForeground(Color.WHITE);
       b4.setForeground(Color.WHITE);


 
        add(l1);  
        add(t1);  
        add(l2);  
        add(t2);  
        add(l3);  
        add(t3);
        add(l4);  
        add(t4);
  
        //Buttons for the work
        add(b1);  
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);  
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
       
    }  
   public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource() == b1)  
        {

   /***  try
                {
	 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	//Establish connection
	     Connection con=DriverManager.getConnection("Jdbc:Odbc:Faculty");
             finalstr=new String();
	//create the statement
	    Statement st=con.createStatement();
        // execute query
	   String query="select * from registration";
           ResultSet rs=st.executeQuery(query);
	//execute the query.
	   finalstr=(finalstr+"ID\tFirst Name\t\tLast Name\t\tSubject");
	//process the query
	  while(rs.next())
	      {

		finalstr=(finalstr+rs.getString(1)+"\t"+rs.getString(2)+"\t\t\t"+rs.getString(3)+"\t\t"+rs.getString(4));
        
	         }
}
catch(Exception e1)
{
System.out.println(e1.getMessage());
}  ***/

    } 

    

if(e.getSource() == b2)  //insert query
        {  
          String query1 = "insert into registration values (1117,'Nandani','Sharma','Advance Java Lab')";
         //st.executeUpdate(query1);
          
        }  
        
if(e.getSource() == b3)   //update query
        {  
           String query2 = "UPDATE registration SET subject='ITC' WHERE id=1117";
            // st.executeUpdate(query2);
           
               
               } 
if(e.getSource() == b4)    //delete query
         {
            String query3 = "delete from registration where id=1115";
             // st.executeUpdate(query3);
             
               
               }

}
 
}