package lb4.test.java;

import lb4.main.java.JsonManager;
import lb4.main.java.controllers.UniversityCreator;
import lb4.main.java.models.University;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class JsonTest {
    @org.junit.Test
    public void jsonTest() throws IOException {
        JsonManager jsonManager = new JsonManager();
        University oldUniversity = new UniversityCreator().createTypicalUniversity();
        String oldUniversityToString = jsonManager.convertUniversityToJson(oldUniversity);
        jsonManager.writeObjectToFile(oldUniversityToString);
        String oldUniversityString = jsonManager.readObjectFromFile();
        University newUniversity = jsonManager.convertJsonToUniversity(oldUniversityString);
        assertEquals(oldUniversity, newUniversity);
    }
}
