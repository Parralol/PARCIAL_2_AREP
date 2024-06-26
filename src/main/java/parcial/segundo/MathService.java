package parcial.segundo;

import static spark.Spark.*;

public class MathService {
    public static void main(String... args){

        port(getPort());
        
        get("/factors", (req,res) -> {
            String value = req.queryParamsValues("value")[0];
            return "{ \"operation\": \"factors\"," + "\"input \":" + value + "," +  "\"output:\"" +Functions.factors( Integer.parseInt(value))+ "}";
        });
        get("/primes", (req,res) -> {
            String value = req.queryParamsValues("value")[0];
            return "{ \"operation\": \"primes\"," + "\"input \":" + value + "," +  "\"output:\"" + Functions.prime( Integer.parseInt(value)) + "}";
        });
  }

  private static int getPort() {
      if (System.getenv("PORT") != null) {
          return Integer.parseInt(System.getenv("PORT"));
      }
      return 5000;
  }
}
