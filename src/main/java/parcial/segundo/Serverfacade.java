package parcial.segundo;

import static spark.Spark.*;


public class Serverfacade {
    static HttpConnetionExample conection = new HttpConnetionExample();

    public static void main(String... args){
        port(getPort());
        staticFiles.location("/static");
        get("/favicon", (req,res) -> "");
        get("/send", (req,res) ->  {
            String rest;
            String function = req.queryParamsValues("function")[0];
            String value = req.queryParamsValues("value")[0];
            String conString = "http://localhost:5000/" + function + "?value=" + value ;
            rest = HttpConnetionExample.conect(conString);
            System.out.println(rest + "<-----");
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
