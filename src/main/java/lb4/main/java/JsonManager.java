package lb4.main.java;
import com.google.gson.Gson;

import lb4.main.java.models.University;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonManager {
    public University convertJsonToUniversity (String universityInJson) {
        return new Gson().fromJson(universityInJson, University.class);
    }

    public String convertUniversityToJson(University university) {
        Gson gson = new Gson();
        return gson.toJson(university);
    }

    public void writeObjectToFile(String text) throws IOException {
        FileWriter newFile = new FileWriter("university.json");
        newFile.write(text);
        newFile.close();
    }

    public String readObjectFromFile() throws IOException {
        return new String(Files.readAllBytes(Paths.get("university.json")));
    }
}
