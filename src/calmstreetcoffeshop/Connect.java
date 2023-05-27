
package calmstreetcoffeshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    Connection cnx;
    public  Connect(){
    String urldriver ="com.mysql.cj.jdbc.Driver";
    String urldatabase ="jdbc:mysql://localhost:3306/calmstreetcoffeshop?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    //chargement de pilote
    try{
        Class.forName(urldriver);
        System.out.println("Chargement de piloe reussi");
    }
    catch(ClassNotFoundException exp){
        System.out.println("driver not found");
    }
    //connexion a la base
    try{
        cnx = DriverManager.getConnection(urldatabase,"root","Imedbennington@54");
        System.out.println("Chargement base de donnee reussi");
    }
    catch(SQLException err){
       System.out.println("data base not found"); 
    }
}
   Connection obtenircon (){
      return cnx; 
    } 
}
