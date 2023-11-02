# WeatherDataAdapter
WeatherData class represents the common data model for weather information, including location, temperature, and condition.
WeatherAPI is an interface that defines a method for fetching weather data, ensuring that different API implementations adhere to a common contract.
WeatherAPI1 and WeatherAPI2 are sample implementations of the WeatherAPI interface, each simulating data retrieval from different sources and converting it to the common format.
Main is the main class to run the project, demonstrating how to use the different API implementations to fetch and display weather data.

Understanding the Project:
The project provides a simple demonstration of creating a common data model (WeatherData) and implementing an adapter (WeatherAPI) to fetch and convert weather data from different sources into the common format.
The WeatherAPI1 and WeatherAPI2 classes simulate data retrieval and conversion for two different sources, but in a real-world scenario, you would replace these implementations with actual API calls to external services.
The Main class shows how to use the different API implementations to fetch and display weather data for specific locations.
This project can serve as a foundation for building a more complex weather data adapter for your mobile application, integrating real APIs and enhancing the common data model as needed.
