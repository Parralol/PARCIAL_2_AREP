package parcial.segundo;

import static spark.Spark.*;


public class Serverfacade {
    static HttpConnetionExample conection;
    private static final String DEFAULT_SERVER_URL = "http://localhost:5000/"  ;
    public static void main(String... args){
        
        port(getPort());
        staticFiles.location("/static");
        get("/favicon", (req,res) -> "");
        get("/send", (req,res) ->  {
            String rest;
            String function = req.queryParamsValues("function")[0];
            String value = req.queryParamsValues("value")[0];
            String[] conString = {DEFAULT_SERVER_URL + function + "?value=" + value, DEFAULT_SERVER_URL + function + "?value=" + value};
            rest = HttpConnetionExample.conect(conString);
            return rest;
        });
  }

  private static int getPort() {
      if (System.getenv("PORT") != null) {
          return Integer.parseInt(System.getenv("PORT"));
      }
      return 4567;
  }
}
