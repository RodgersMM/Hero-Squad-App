
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import java.util.ArrayList;
import spark.template.velocity.VelocityTemplateEngine;
import javax.sound.sampled.Port;
import static spark.Spark.*;


public class App {
    public static void main (String[] args) {

        public static void main(String[] args) {
            staticFileLocation("/public");
            String layout = "templates/layout.vtl";


            ProcessBuilder process = new ProcessBuilder();
            Integer port;
            if (process.environment().get("PORT") != null) {
                port = Integer.parseInt(process.environment().get("PORT"));
            } else {
                port = 4567;
            }

            port(port);

            get ("/", (request, response) -> {
                Map<String, Object> model = new HashMap<String, Object>();
                model.put("template", "templates/index.vtl");
                return new ModelAndView(model, layout);
            }, new VelocityTemplateEngine());

            // Obtain all heroes and their details
            get("/heroes", (request, response) -> {
                Map<String, Object> model = new HashMap<String, Object>();
                model.put("heroes", Hero.all());
                model.put("template", "templates/heroes.vtl");
                return new ModelAndView(model, layout);
            }, new VelocityTemplateEngine());



    }

}
