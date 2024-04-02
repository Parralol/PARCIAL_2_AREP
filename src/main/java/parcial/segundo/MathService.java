package parcial.segundo;

import static spark.Spark.*;

public class MathService {
       static HttpConnetionExample conection = new HttpConnetionExample();

    public static void main(String... args){

        port(getPort());
        
        get("/factors", (req,res) -> {
            
            return "";
        });
  }

  private static int getPort() {
      if (System.getenv("PORT") != null) {
          return Integer.parseInt(System.getenv("PORT"));
      }
      return 4567;
  }
}
