package testDatabase;

public class DAO_Main {

    CountryDAO country = new CountryDAO();
    CityDAO city = new CityDAO();
    LanguageDAO language = new LanguageDAO();

    public void snydCodeForStatic() {
        country.getAllCountries();
        System.out.println("----------------------------");
        country.getAllContinents();
        System.out.println("----------------------------");
        country.getAllCountriesOnGivenContinent("Africa");
        System.out.println("----------------------------");
        country.getContinentWithGivenCountries("Japan");
        System.out.println("----------------------------");
        city.getCityInformation("Berlin");
        System.out.println("----------------------------");
        language.getAllLanguages();
        System.out.println("----------------------------");
        language.getAllLanguagesInGivenCountry("Vietnam");
        System.out.println("----------------------------");
        language.getAllCountriesSpeakingGivenLanguage("Pashto");
        System.out.println("----------------------------");
        language.isLanguageOfficial("Denmark", "English");
    }

    public static void main(String[] args) {
        new DAO_Main().snydCodeForStatic();
    }
}
