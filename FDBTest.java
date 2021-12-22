 import java.sql.*;

public class FDBTest
{
public static void main(String args[])
{
try
{
	// Load and register
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	//Establish connection
	Connection con=DriverManager.getConnection("Jdbc:Odbc:Faculty");
	//create the statement
	Statement st=con.createStatement();

//insert query
         String query1 = "insert into registration values (1117,'Nandani','Sharma','Advance Java Lab')";
         //st.executeUpdate(query1);
//update query
         String query2 = "UPDATE registration SET subject='Compiler Design' WHERE id=1117";
        // st.executeUpdate(query2);
//delete query
         String query3 = "delete from registration where id=6";
        //st.executeUpdate(query3);

//execute query
	String query="select * from registration";

         ResultSet rs=st.executeQuery(query);
	//execute the query.
	 System.out.println("\nFaculty ID\tFirst Name\t\tLast Name\t\tSubject");
	//process the query
	while(rs.next())
	{

		System.out.println("\n"+rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t\t"+rs.getString(3)+"\t\t\t"+rs.getString(4));
	}
}
catch(Exception e1)
{
System.out.println(e1.getMessage());

}
}
}