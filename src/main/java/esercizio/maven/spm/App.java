package esercizio.maven.spm;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;

/**
 * JSON writing to file
 *
 */
public class App {
    public static void main(String[] args) {
        // JSON object creation
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Lorenzo");
        jsonObject.put("age", 24);
        jsonObject.put("city", "Fabriano");

        // Writing file
        try (FileWriter file = new FileWriter("output.json")) {
            file.write(jsonObject.toString(4)); // 4 is the indentation
            System.out.println("JSON written on file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
