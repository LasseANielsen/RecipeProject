package testDatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CityDAO {

    public void getCityInformation(String cityName) {
        try {
            Connection c = new DBConnector().getConnection();
            Statement stmt = c.createStatement();
            String query
                    = "SELECT DISTINCT `ID`, `CityName`, `District`, `Population` "
                    + "FROM `city` "
                    + "WHERE `CityName` = '" + cityName + "';";
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                int id = res.getInt("ID");
                String name = res.getString("CityName");
                String district = res.getString("District");
                int population = res.getInt("Population");
                System.out.println("ID: " + id + "\nName: " + name + "\nDistrict: " + district + "\nPopulation: " +population);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
    }
}
