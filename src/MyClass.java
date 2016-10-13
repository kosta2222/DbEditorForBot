
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class MyClass  {
ManagmentSystem ms=null;
Connection connection=null;
PreparedStatement preparedStatement=null;
ResultSet resultSet=null;
    public MyClass() {
	try{
        ms=ManagmentSystem.getInstance("D:\\NetBeansProjects\\ASecondBotJava\\conf\\config.dat");
        connection=ms.getConn();

}catch(Exception ex){
Logger.getLogger(MyClass.class.getName()).log(Level.SEVERE, null, ex);
}
}
    
 
 
}