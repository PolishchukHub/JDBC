import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/conference","root","root");
		PreparedStatement preparedStatement;
		preparedStatement = (PreparedStatement) connection.prepareStatement("insert into company (name,address,money) values ('Vonlatheh','Opletalova',50000),"
				+ "('Tbm','Konevova',30000),('IEEE','Hlavkova',20000)");
		preparedStatement.execute();
//		preparedStatement = (PreparedStatement) connection.prepareStatement("select name_company,money from sponsor where money > 3500");
//		preparedStatement.execute();
		preparedStatement = (PreparedStatement) connection.prepareStatement("insert into conference (name,local_country,local_city,venue,scale,dates) values "
				+ "('Information technology','Germany','Berlin','Hotel Plaza',180,'2.11.2016')");
		preparedStatement.execute();
		preparedStatement = (PreparedStatement) connection.prepareStatement("insert into sponsor (name_company,money) values ('Oracle',3000),('Microsoft',5000),('Apple',6000)");
		preparedStatement.execute();
//		preparedStatement = (PreparedStatement) connection.prepareStatement("delete from sponsor where money < 4000");
//		preparedStatement.execute();
		preparedStatement = (PreparedStatement) connection.prepareStatement("insert into location_country (country) values ('Germany'),('Italy'),('Spain')");
		preparedStatement.execute();
		preparedStatement = (PreparedStatement) connection.prepareStatement("insert into location_city (city) values ('Berlin'),('Barcelona'),('Praha'),('Milan')");
		preparedStatement.execute();
		preparedStatement = (PreparedStatement) connection.prepareStatement("insert into cherman (name,name_company,job_title,money) values ('John','TBM','Manager',400),('Anna','Oracle','hr',450)");
		preparedStatement.execute();
		System.out.println("To Git");
	}
}
