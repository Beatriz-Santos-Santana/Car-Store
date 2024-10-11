package dao;

import model.Pizzaria;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;


public class PizzariaDao {

    public void createLogin(Pizzaria pizza) {

        String SQL = "INSERT INTO PIZZARIA (EMAIL) VALUES (?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");
            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, pizza.getEmail());
            preparedStatement.execute();
            System.out.println("success in insert data");
            connection.close();        }

        catch (Exception e) {
            System.out.println("fail in database connection");

        }

    }



}
