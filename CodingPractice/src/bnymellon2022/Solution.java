package bnymellon2022;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

class Result
{

    /*
     * Complete the 'getTopRatedFoodOutlets' function below.
     *
     * URL for cut and paste
     * https://jsonmock.hackerrank.com/api/food_outlets?city=<city>&page=<pageNumber>
     *
     * The function is expected to return an array of strings.
     * 
     * The function accepts only city argument (String).
     */

    public static List<String> getTopRatedFoodOutlets(String city)
    {
        SortedMap<Float, List<String>> floatStringSortedMap = new TreeMap<>();
        try{
            StringBuffer output = getJsonResponse(city, 1);
            
            Gson gson  = new Gson();
            
            JsonObject jsonObject = gson.fromJson(output.toString(),JsonObject.class);
            int pages = jsonObject.getAsJsonObject().get("total_pages").getAsInt();
            int counter = 1;
            
            while(counter <= pages){
                
                output = getJsonResponse(city, counter);
                JsonArray arr = jsonObject.getAsJsonArray("data");
                
                for (JsonElement e : arr) {
                    JsonElement outletName = e.getAsJsonObject().get("name");
                    JsonElement userRating = e.getAsJsonObject().get("user_rating").getAsJsonObject().get("average_rating");

                    String name = outletName.getAsString();

                    if(floatStringSortedMap.containsKey(userRating)){
                        floatStringSortedMap.get(userRating).add(outletName.getAsString());
                    }else{
                        List<String> strings = new ArrayList<>();
                        strings.add(outletName.getAsString());
                        floatStringSortedMap.put(userRating.getAsFloat(),strings);
                    }

                }
            
                counter++;
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return floatStringSortedMap.get(floatStringSortedMap.firstKey());
    }
    
    private static StringBuffer getJsonResponse(String city, int page)
            throws  IOException {
                
      String targetURL = "https://jsonmock.hackerrank.com/api/food_outlets?city" + city + "&page="+ page;
      
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

public class Solution {
    public static void main(String[] args) throws IOException {

        List<String> result = Result.getTopRatedFoodOutlets("houston");
        System.out.println(result);
    }
}
