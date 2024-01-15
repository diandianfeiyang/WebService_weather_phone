import client3.ArrayOfString;
import client3.WeatherWS;
import client3.WeatherWSSoap;

public class WeatherTest {
    public static void main(String[] args) {
        WeatherWS weatherWS = new WeatherWS();
        WeatherWSSoap soap = weatherWS.getWeatherWSSoap();
        ArrayOfString s = soap.getWeather("北京", null);
        s.getString().stream().forEach(System.out::println);
    }
}
