package weather;
import java.util.HashMap;
import java.util.Map;

class WeatherData {
    private String location;
    private double temperature;
    private String condition;

    public WeatherData(String location, double temperature, String condition) {
        this.location = location;
        this.temperature = temperature;
        this.condition = condition;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}

interface WeatherAPI {
    WeatherData fetchWeatherData(String location);
}
class WeatherAPI1 implements WeatherAPI {
    @Override
    public WeatherData fetchWeatherData(String location) {
        // Simulate fetching data from API 1
        Map<String, Object> api1Data = new HashMap<>();
        api1Data.put("city", location);
        api1Data.put("temp", 25.5);
        api1Data.put("condition", "Sunny");

        return convertToCommonFormat(api1Data);
    }

    private WeatherData convertToCommonFormat(Map<String, Object> data) {
        String location = (String) data.get("city");
        double temperature = (double) data.get("temp");
        String condition = (String) data.get("condition");
        return new WeatherData(location, temperature, condition);
    }
}

class WeatherAPI2 implements WeatherAPI {
    @Override
    public WeatherData fetchWeatherData(String location) {
        Map<String, Object> api2Data = new HashMap<>();
        api2Data.put("Location", location);
        api2Data.put("Temp_C", 20.0);
        api2Data.put("Conditions", "Partly Cloudy");

        return convertToCommonFormat(api2Data);
    }

    private WeatherData convertToCommonFormat(Map<String, Object> data) {
        String location = (String) data.get("Location");
        double temperature = (double) data.get("Temp_C");
        String condition = (String) data.get("Conditions");
        return new WeatherData(location, temperature, condition);
    }
}

public class Main {
    public static void main(String[] args) {
        WeatherAPI weatherAPI2 = new WeatherAPI2();

        WeatherAPI weatherAPI1 = new WeatherAPI1();
        WeatherData weatherData1 = weatherAPI1.fetchWeatherData("New York");
        System.out.println("Location: " + weatherData1.getLocation());
        System.out.println("Temperature: " + weatherData1.getTemperature() + "°C");
        System.out.println("Condition: " + weatherData1.getCondition());

        WeatherData weatherData2 = weatherAPI2.fetchWeatherData("Shymkent");
        System.out.println("Location: " + weatherData2.getLocation());
        System.out.println("Temperature: " + weatherData2.getTemperature() + "°C");
        System.out.println("Condition: " + weatherData2.getCondition());
    }
}
