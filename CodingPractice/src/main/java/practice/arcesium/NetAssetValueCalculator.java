package practice.arcesium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class NetAssetValueCalculator {
	
	 public static double calculateNAV(String date) throws MalformedURLException, ProtocolException, IOException {
		 Gson gson  = new Gson();
         String nextPage = "https://raw.githubusercontent.com/arcjsonapi/HoldingValueCalculator/master/paging/holding_start";
         JsonObject jsonObject = null;
         StringBuffer output = new StringBuffer();
         double result = 0;
         
         String pricingApi = "https://raw.githubusercontent.com/arcjsonapi/HoldingValueCalculator/master/api/pricing";
         StringBuffer pricingOutput = new StringBuffer();
         pricingOutput = getJsonResponse(pricingApi);
         
         JsonArray priceArray =  gson.fromJson(pricingOutput.toString(),JsonArray.class);
         
         Map<String, Map<String, Double>> priceMap = new HashMap<>();
         
         for (int i = 0; i < priceArray.size(); i++) {
        	 String securityDate = priceArray.get(i).getAsJsonObject().get("date").getAsString();
        	 String securityName = priceArray.get(i).getAsJsonObject().get("security").getAsString();
        	 Double securityPrice = priceArray.get(i).getAsJsonObject().get("price").getAsDouble();
        	 
        	 if(!priceMap.containsKey(securityDate)){
        		 Map<String, Double> hashMap = new HashMap<String, Double>();
        		 hashMap.put(securityName, securityPrice);
				
        		 priceMap.put(securityDate, hashMap);
        	 }
        	 else{
        		 priceMap.get(securityDate).put(securityName, securityPrice);
        	 }
		}
         
         System.out.println(priceMap);
         
         while(nextPage != null){
        	 output = getJsonResponse(nextPage);
        	 jsonObject = gson.fromJson(output.toString(),JsonObject.class);
        	 
        	 JsonArray dataArray = jsonObject.getAsJsonObject().get("data").getAsJsonArray();
        	 
        	 for (int i = 0; i < dataArray.size(); i++) {
        		 	String securityDate = dataArray.get(i).getAsJsonObject().get("date").getAsString();
        		 	        		 	
        		 	if(date.equals(securityDate)){
        		 		int quantity = dataArray.get(i).getAsJsonObject().get("quantity").getAsInt();
        		 		String securityName = dataArray.get(i).getAsJsonObject().get("security").getAsString();
        		 		
        		 		result += (quantity * (priceMap.get(securityDate).get(securityName)));
        		 	}
        	 }
        	 
        	 JsonElement jsonElement = jsonObject.getAsJsonObject().get("nextPage");
        	 if(jsonElement != null){
        		 nextPage = jsonElement.getAsString();
        	 }else{
        		 nextPage = null;
        	 }
        	 
        	 
         }
		 return result;
	 }
	 
	 public static void main(String[] args) throws MalformedURLException, ProtocolException, IOException {
		System.out.println(calculateNAV("20190331"));
	}
	 
	 private static StringBuffer getJsonResponse(String targetURL)
				throws MalformedURLException, IOException, ProtocolException {
	      
			URL url = new URL(targetURL);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
	   
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			String line;
			StringBuffer output = new StringBuffer();
			
			while ((line = bufferedReader.readLine()) != null) {
			    output.append(line);
			}
			bufferedReader.close();
			return output;
		}

    

}
