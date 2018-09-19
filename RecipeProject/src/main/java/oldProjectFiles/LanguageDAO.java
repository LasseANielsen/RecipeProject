package testDatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LanguageDAO {

    public void getAllLanguages() {
        try {
            Connection c = new DBConnector().getConnection();
            Statement stmt = c.createStatement();
            String query
                    = "SELECT DISTINCT `Language` "
                    + "FROM `language`;";
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                String language = res.getString("Language");
                System.out.println(language);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
    }

    public void getAllLanguagesInGivenCountry(String country) {
        try {
            Connection c = new DBConnector().getConnection();
            Statement stmt = c.createStatement();
            String query
                    = "SELECT DISTINCT `Language` "
                    + "FROM `language` NATURAL JOIN `country` "
                    + "WHERE `CountryName` = '" + country + "';";
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                String language = res.getString("Language");
                System.out.println(language);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
    }

    public void getAllCountriesSpeakingGivenLanguage(String language) {
        try {
            Connection c = new DBConnector().getConnection();
            Statement stmt = c.createStatement();
            String query
                    = "SELECT DISTINCT `CountryName` "
                    + "FROM `language` NATURAL JOIN `country` "
                    + "WHERE `Language` = '" + language + "';";
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

    public void isLanguageOfficial(String country, String language) {
        try {
            Connection c = new DBConnector().getConnection();
            Statement stmt = c.createStatement();
            String query
                    = "SELECT DISTINCT `IsOfficial` "
                    + "FROM `language` NATURAL JOIN `country` "
                    + "WHERE `CountryName` = '" + country + "' "
                    + "AND `Language` = '" + language + "';";
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                String Isofficial = res.getString("IsOfficial");
                if (Isofficial.contains("T")) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
    }
}
