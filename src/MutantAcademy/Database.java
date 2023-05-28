package MutantAcademy;

import java.sql.*;

public class Database {
    //Connect to the database - WORKS
    public static Connection ConnectDB() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/MutantAcademyDB","Xavier","ProfessorX");
    }

    //Add students to the database - WORKS
    public static void addStudents(String name, String power, int PowerLvl){
        try{
            String sqlQuery = "INSERT INTO Students (Name, Power, PowerLvl)" +
                    "VALUES (?,?,?)";
            Connection connection = ConnectDB();
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,power);
            preparedStatement.setInt(3,PowerLvl);
            preparedStatement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    //Show students - WORKS
    public static void showStudents(){
        try{
            String sqlQuery = "SELECT * FROM Students";
            Connection connection = ConnectDB();
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("Name");
                String power = resultSet.getString("Power");
                int powerlvl = resultSet.getInt("PowerLvl");
                System.out.println(name + "\n - Power: "+ power + "\n - Powerlvl: " + powerlvl);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    //Method that clears the table - WORKS
    public static void expellStudents(){
        try{
            String sqlQuery = "DELETE FROM Students";
            Connection connection = ConnectDB();
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            int resultSet = preparedStatement.executeUpdate();
            System.out.println(resultSet + " expelled from the academy");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    //Method that
}
