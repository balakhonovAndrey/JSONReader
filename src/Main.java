import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        JReader reader = new JReader();

        try {
            File file = new File("/home/robot-user/idea-workspace/JReader/src/companies.json");
            FileReader fileReader = new FileReader(file);

            String buffer = "";
            int data = 0;

            while ((data = fileReader.read()) != -1) {
                buffer += (char) data;
            }

            ArrayList<Company> companyList = reader.getCompanies(buffer);

            for (Company item : companyList) {
                System.out.println(item.toString());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
