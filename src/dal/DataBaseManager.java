package dal;

import bll.Auto;
import util.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseManager {
    private static DataBaseManager instance;
    private String driver;
    private String url;
    private String username;
    private String password;

    private DataBaseManager(){
        PropertyManager.getInstance().setFilemname("db.properties");
        this.driver = PropertyManager.getInstance().readProperty("driver", "oracle.jdbc.OracleDriver");
        this.url = PropertyManager.getInstance().readProperty("url", "jdbc:oracle:thin:@tcif.htl-villach.at:1521/orcl");
        this.username = PropertyManager.getInstance().readProperty("username", "d3a16");;
        this.password = PropertyManager.getInstance().readProperty("password", "d3a16");;
    }

    private Connection createConnection(){
        Connection con = null;
        //Laden des Treibers
        try {
            Class.forName(driver);
            //Erzeugen der Verbindung
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;

    }

    public static DataBaseManager getInstance(){
        if(instance == null){
            instance = new DataBaseManager();
        }
        return instance;
    }

    public List<Auto> getAllAutos(){
        List<Auto> allAutos = new ArrayList<>();
        Statement stmt;
        ResultSet resultSet;

        String query = "SELECT * FROM Auto";
        try {
            try(Connection con = createConnection()){ // Wird automatisch am ende von try geschlossen
                //Statement wird erzeugt
                stmt = con.createStatement();
                resultSet = stmt.executeQuery(query);
                //resultset durchiterieren
                while(resultSet.next()){
                    Auto newAuto = new Auto(
                            resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getInt(4),
                            resultSet.getInt(5),
                            resultSet.getInt(6),
                            resultSet.getInt(7),
                            resultSet.getString(8),
                            resultSet.getString(9),
                            resultSet.getString(10),
                            resultSet.getString(11)
                            );
                    allAutos.add(newAuto);

                }
                return allAutos;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return allAutos;
    }


/*    public boolean updateAuto(Auto p){
        boolean result = false;
        PreparedStatement preparedStatement;
        String stmt_update = "UPDATE Auto SET firstname = ?, lastname = ? WHERE ID = ?";
        ResultSet resultSet;
        int numRows = 0;
        try ( Connection con = this.createConnection()){
            preparedStatement = con.prepareStatement(stmt_update);
            preparedStatement.setString(1, p.getFirstName());
            preparedStatement.setString(2, p.getLastName());
            preparedStatement.setInt(3, p.getId());
            numRows = preparedStatement.executeUpdate();
            if ( numRows == 1 ){
                result = true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }*/



















/*

    public boolean updateBook(Book s){
        boolean result = false;
        PreparedStatement preparedStatement;
        String stmt_insert = "UPDATE book SET idauthor=?, isbn=?, title=?  publisher=? WHERE id=?";
        try {
            try(Connection con = createConnection()){ // Wird automatisch am ende von try geschlossen
                preparedStatement = con.prepareStatement(stmt_insert);
                preparedStatement.setInt(1, s.getAuthor().getIdAuthor());
                preparedStatement.setString(2, s.getISBN());
                preparedStatement.setString(3, s.getTitle());
                preparedStatement.setString(4, s.getPublisher());
                preparedStatement.setInt(5, s.getIdBook());


                int rowsUpdated = preparedStatement.executeUpdate();
                if (rowsUpdated > 0) {
                    result = true;
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return result;
    }

    public boolean insertBook (Book s){
        boolean result = false;
        PreparedStatement preparedStatement;
        String stmt_insert = "INSERT INTO book (idauthor, isbn, title, publisher) VALUES (?, ?, ?, ?)";
        ResultSet resultSet;
        int id = -1;

        try {
            try(Connection con = createConnection()){ // Wird automatisch am ende von try geschlossen
                preparedStatement = con.prepareStatement(stmt_insert, new String[]{"id"});
                preparedStatement.setInt(1, s.getAuthor().getIdAuthor());
                preparedStatement.setString(2, s.getISBN());
                preparedStatement.setString(3, s.getTitle());
                preparedStatement.setString(4, s.getPublisher());
                preparedStatement.execute();

                resultSet = preparedStatement.getGeneratedKeys();
                if(resultSet.next()){
                    id = resultSet.getInt(1);
                    s.setIdBook(id);
                    result = true;
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return result;
    }

    public boolean deleteBook (int id){
        boolean result = false;
        PreparedStatement preparedStatement;
        String stmt_insert = "DELETE FROM Book WHERE id=?";

        try {
            try(Connection con = createConnection()){ // Wird automatisch am ende von try geschlossen
                preparedStatement = con.prepareStatement(stmt_insert);
                preparedStatement.setInt(1, id);
                int rowsDeleted = preparedStatement.executeUpdate();
                if (rowsDeleted > 0) {
                    result =  true;
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return result;
    }

    public Book getById(int id){
        Book s = null;
        ResultSet resultSet;
        String stmt = "SELECT * FROM book WHERE id=?";
        PreparedStatement preparedStatement;

        try {
            try(Connection con = createConnection()){ // Wird automatisch am ende von try geschlossen
                //Statement wird erzeugt
                preparedStatement = con.prepareStatement(stmt);
                preparedStatement.setInt(1, id);
                resultSet = preparedStatement.executeQuery();
                if(resultSet.next()){
                    Author nA = new Author(resultSet.getString(5), resultSet.getString(6));
                    s = new Book(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getDouble(4), nA, resultSet.getInt(7));
                }

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return s;
    }*/
}
