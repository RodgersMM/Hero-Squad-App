
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

            //Obtain Heroes by their id returned by find method
            get("/heroes/:id", (request, response) -> {
                Map<String, Object> model = new HashMap<String, Object>();
                Hero hero = Hero.find(Integer.parseInt(request.params(":id")));
                model.put("hero", hero);
                model.put("template", "templates/hero.vtl");
                return new ModelAndView(model, layout);
            }, new VelocityTemplateEngine());

            //Create a route to the form for adding new squads

            get("squads/new", (request, response) -> {
                Map<String, Object> model = new HashMap<String, Object>();
                model.put("template", "templates/squadForm.vtl");
                return new ModelAndView(model, layout);
            }, new VelocityTemplateEngine());

            //Route to obtain input from the squad form after success message is displayed
            post("/squads", (request, response) -> {
                Map<String, Object> model = new HashMap<String, Object>();
                String name = request.queryParams("name");
                int size = Integer.parseInt(request.queryParams("size"));
                String cause = request.queryParams("cause");
                Squad newSquad= new Squad(name,size,cause);
                model.put("template", "templates/squadSuccess.vtl");
                return new ModelAndView(model, layout);
            }, new VelocityTemplateEngine());

            //Route to show all squads in the squad list
            get("/squads", (request, response) -> {
                Map<String, Object> model = new HashMap<String, Object>();
                model.put("squads", Squad.all());
                model.put("template", "templates/squads.vtl");
                return new ModelAndView(model, layout);
            }, new VelocityTemplateEngine());


















        }

}
