import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        ArrayList<Company> companyList = null;

        JReader reader = new JReader();

        String path = "/home/robot-user/idea-workspace/JReader/src/companies.json";

        try {
            companyList = reader.getCompanies(reader.getString(path));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        System.out.println("===========================================================================");

        getInfo(companyList);

        System.out.println("===========================================================================");

        getSecurities(companyList);

        System.out.println("===========================================================================");

        getInfoByDate(companyList);

        System.out.println("===========================================================================");

        getByCode(companyList);

    }

    public static void getInfo(ArrayList<Company> list) {
        list.stream().forEach(item -> System.out.println("Краткое название: " + item.getNameShort()
                + "\t" + "Дата основаниия " + DateParser.getReadableDate4(DateParser.getDate(item.getEgrulDate()))));
    }

    public static void getSecurities(ArrayList<Company> list) {

        list.stream().forEach(company -> company.getSecurities().forEach(securities -> {
            String dateTo = securities.getDateTo();
            Date date = DateParser.getDate(dateTo);
            if (date.after(new Date())){
                System.out.println("Код: " + securities.getId());
                System.out.println("Дата истечения: " + securities.getDateTo());
                System.out.println("Владелец: " + company.getNameFull());
            }
        }));
    }

    public static void getInfoByDate(ArrayList<Company> list) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите дату: ");
            String strDate = bufferedReader.readLine();
            Date date = DateParser.getDate(strDate);

            list.stream().forEach(company -> {
                Date egrulDate = DateParser.getDate(company.getEgrulDate());
                if (egrulDate.after(date)) {
                    System.out.println("Название: " + company.getNameFull());
                    System.out.println("Дата создания: " + company.getEgrulDate());
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
//            bufferedReader.close();
        }
    }

        public static void getByCode(ArrayList<Company> list) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите обозначение (код) валюты: ");
            String code = bufferedReader.readLine();

            for (Company company : list) {
                for (Securities securities: company.getSecurities()) {
                    if (code.equals(securities.getCurrency().getCode())) {
                        System.out.println("Id: " + securities.getId());
                        System.out.println("Code: " + securities.getCode());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            bufferedReader.close();
        }
    }
}
