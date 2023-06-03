import controller.UniversityCreator;
import model.University;
import org.junit.Assert;
import org.junit.Test;

public class jsonTest {
    @Test
    public void testFileWriteJsonToFile() {

        String filePath = "src/myJSON.json";
        JsonManager jsonManager = new JsonManager();
        UniversityCreator universityCreator = new UniversityCreator();
        University oldUniversity = universityCreator.createUniversity("NTU DP", "KB");

        jsonManager.writeToJson(oldUniversity, filePath);
        University newUniversity = (University) jsonManager.readFromJson(filePath);

        Assert.assertEquals(newUniversity, oldUniversity);
    }
}
