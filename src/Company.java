import java.util.ArrayList;

public class Company {
    private int id;
    private String code;
    private String name_full;
    private String name_short;
    private String inn;

    private CompanyType companyType;

    private String ogrn;
    private String egrul_date;

    private Country country;

    private String fio_head;
    private String address;
    private String phone;
    private String e_mail;
    private String www;
    private boolean is_resident;

    private ArrayList<Securities> securities;

    public Company() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameFull() {
        return name_full;
    }

    public void setNameFull(String nameFull) {
        this.name_full = nameFull;
    }

    public String getNameShort() {
        return name_short;
    }

    public void setNameShort(String nameShort) {
        this.name_short = nameShort;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public CompanyType getCompanyType() {
        return companyType;
    }

    public void setCompanyType(CompanyType companyType) {
        this.companyType = companyType;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public String getEgrulDate() {
        return egrul_date;
    }

    public void setEgrulDate(String egrulDate) {
        this.egrul_date = egrulDate;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getFioHead() {
        return fio_head;
    }

    public void setFioHead(String fioHead) {
        this.fio_head = fioHead;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return e_mail;
    }

    public void setEmail(String email) {
        this.e_mail = email;
    }

    public String getSite() {
        return www;
    }

    public void setSite(String site) {
        this.www = site;
    }

    public boolean isResident() {
        return is_resident;
    }

    public void setResident(boolean resident) {
        is_resident = resident;
    }

    public ArrayList<Securities> getSecurities() {
        return securities;
    }

    public void setSecurities(ArrayList<Securities> securities) {
        this.securities = securities;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", nameFull='" + name_full + '\'' +
                ", nameShort='" + name_short + '\'' +
                ", inn='" + inn + '\'' +
//                ", companyType=" + companyType.toString() +
                ", ogrn='" + ogrn + '\'' +
                ", egrulDate='" + egrul_date + '\'' +
                ", country=" + country.toString() +
                ", fioHead='" + fio_head + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + e_mail + '\'' +
                ", site='" + www + '\'' +
                ", isResident=" + is_resident +
                ", securities=" + securities +
                "\n" +
                '}';
    }
}
