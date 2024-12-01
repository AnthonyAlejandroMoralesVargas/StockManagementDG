package com.company.stockmanagement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/**
 * @author Anthony
 */
public class AlphaVantageAPI {

    private static final String API_URL = "https://www.alphavantage.co/query";
    private String apiKey;

    public AlphaVantageAPI(String apiKey) {
        this.apiKey = apiKey;
    }

   
    public double getCurrentPrice(String symbol) {
        String urlString = API_URL + "?function=TIME_SERIES_INTRADAY&symbol=" + symbol + "&interval=1min&apikey=" + apiKey;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            JSONObject json = new JSONObject(content.toString());
            if (json.has("Time Series (1min)")) {
                JSONObject timeSeries = json.getJSONObject("Time Series (1min)");
                String lastKey = timeSeries.keys().next();
                return timeSeries.getJSONObject(lastKey).getDouble("4. close");
            } else {
                System.out.println("API Response: " + content.toString());
                System.out.println("Error: No valid data received.");
                return -1;
            }
        } catch (Exception e) {
            System.out.println("Error fetching current price: " + e.getMessage());
            return -1;
        }
    }
}
