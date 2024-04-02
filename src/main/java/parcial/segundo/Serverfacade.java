package parcial.segundo;

import static spark.Spark.*;


public class Serverfacade {
    public static void main(String... args){
        port(getPort());
        staticFiles.location("/static");
        get("hello", (req,res) -> "Hello Docker!");
  }

  private static int getPort() {
      if (System.getenv("PORT") != null) {
          return Integer.parseInt(System.getenv("PORT"));
      }
      return 4567;
  }
}
