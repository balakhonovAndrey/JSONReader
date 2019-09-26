import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class JReader {

    public ArrayList<Company> getCompanies(String json) {

        Gson gson = new Gson();
        return gson.fromJson(json, new TypeToken<ArrayList<Company>>(){}.getType());
    }
}
