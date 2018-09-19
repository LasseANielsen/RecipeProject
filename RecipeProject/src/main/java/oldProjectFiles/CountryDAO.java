package testDatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CountryDAO {

    public void getAllCountries() {
        try {
            Connection c = new DBConnector().getConnection();
            Statement stmt = c.createStatement();
            String query
                    = "SELECT DISTINCT `CountryName` "
                    + "FROM `country`;";
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                String country = res.getString("CountryName");
                System.out.println(country);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
    }

    public void getAllContinents() {
        try {
            Connection c = new DBConnector().getConnection();
            Statement stmt = c.createStatement();
            String query
                    = "SELECT DISTINCT `Continent` "
                    + "FROM `country`;";
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                String continent = res.getString("Continent");
                System.out.println(continent);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
    }

    public void getAllCountriesOnGivenContinent(String continent) {
        try {
            Connection c = new DBConnector().getConnection();
            Statement stmt = c.createStatement();
            String query
                    = "SELECT DISTINCT `CountryName` "
                    + "FROM `country`"
                    + "WHERE `Continent` = '" + continent + "';";
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                String country = res.getString("CountryName");
                System.out.println(country);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
    }

    public void getContinentWithGivenCountries(String country) {
        try {
            Connection c = new DBConnector().getConnection();
            Statement stmt = c.createStatement();
            String query
                    = "SELECT DISTINCT `Continent` "
                    + "FROM `country`"
                    + "WHERE `CountryName` = '" + country + "';";
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                String continentString = res.getString("Continent");
                System.out.println(continentString);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
    }
}
