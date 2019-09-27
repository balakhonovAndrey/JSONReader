import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class JReader {

    public ArrayList<Company> getCompanies(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, new TypeToken<ArrayList<Company>>(){}.getType());
    }

    public String getString(String path) {
        String buffer = "";
        try {
            FileReader fileReader = new FileReader(new File(path));
            int data = 0;
            while ((data = fileReader.read()) != -1) {
                buffer += (char) data;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer;
    }
}
