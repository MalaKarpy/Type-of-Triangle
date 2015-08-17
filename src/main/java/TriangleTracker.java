import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.Random;


public class TriangleTracker {
  public static void main(String[] args) {
    // String layout = "templates/layout.vtl";
    // staticFileLocation("/public");
    //
    // get("/", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/home.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
    //
    // get("/rectangle", (request, response) -> {
    //   HashMap<String, Object> model = new HashMap<String, Object>();
    //   int length = Integer.parseInt(request.queryParams("length"));
    //   int width = Integer.parseInt(request.queryParams("width"));
    //
    //   Rectangle myRectangle = new Rectangle(length, width);
    //   model.put("myRectangle", myRectangle);
    //
    //   model.put("template", "templates/rectangle.vtl");
    //   return new ModelAndView(model,layout);
    // }, new VelocityTemplateEngine());


    }


     private Integer sideOne;
     private Integer sideTwo;
     private Integer sideThree;

     public TriangleTracker(Integer side1, Integer side2, Integer side3) {
      sideOne = side1;
      sideTwo = side2;
      sideThree = side3;
     }
     public int getSideOne() {
       return sideOne;
     }
     public int getSideTwo() {
       return sideTwo;
     }
     public int getSideThree() {
       return sideThree;
     }

    public String typeOfTriangle() {
      String type = " ";
      if ((sideOne == sideTwo) && (sideTwo == sideThree) && (sideOne == sideThree)) {
        type = "Equilateral";
      } else if ((sideOne == sideTwo) || (sideTwo == sideThree) || (sideOne == sideThree)) {
        type = "Isoscelene";
      } else {
        type = "Scalene";
      }
      return type;
    }
}
