package parcial.segundo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Hello world!
 */
public final class HttpConnetionExample {
     private static final String USER_AGENT = "Mozilla/5.0";
     private static String[] res; 
     private static int count = 0;
     protected static final Logger logger = Logger.getLogger(HttpConnetionExample.class.getName());
     
     public HttpConnetionExample(String d){
     }

    @SuppressWarnings("unused")
    private HttpConnetionExample(){
        throw new IllegalStateException("Utility class");
     }

    public static String conect(String [] url) throws IOException {
        res = url;
        String urls = check();
        @SuppressWarnings("deprecation")
        URL obj = new URL(urls);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        
        //The following invocation perform the connection implicitly before getting the code
        int responseCode = con.getResponseCode();
        logger.info("GET Response Code :: " + responseCode);
        
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            logger.info(response.toString());
            // print result
            return response.toString();
        } else {
            return "GET request not worked";
        }
    }
    private static String check(){
        String rest = "";
        if(count == 0){
            rest = res[0];
            count +=1;
        }else{
            rest = res[1];
            count =0;
        }
        return rest;
    }
}
