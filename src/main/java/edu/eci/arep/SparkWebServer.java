package edu.eci.arep;

import static spark.Spark.*;

import java.io.BufferedReader;
import java.io.FileReader;

public class SparkWebServer {
    
    public static void main(String... args){
        port(getPort());

        get("/", (req, res) -> {
            try {
                res.type("text/html");
                StringBuilder content = new StringBuilder();
                BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\co\\edu\\escuelaing\\arep\\formularios.html"));
                String line;
                while ((line = br.readLine()) != null) {
                    content.append(line);
                }
                br.close();
                return content.toString();
            } catch (Exception e) {
                e.printStackTrace();
                return "Error al cargar el archivo HTML";
            }
        });

        get("hello", (req,res) -> "Hello Docker!");

        get("sin", (req,res) -> Functionalities.sin(req.queryParams("number")));
        get("cos", (req,res) -> Functionalities.cosin(req.queryParams("number")));
        get("palindrome", (req,res) -> Functionalities.palindrome(req.queryParams("word")));
        get("magnitude", (req,res) -> Functionalities.magnitude(req.queryParams("int1"), req.queryParams("int2")));
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}