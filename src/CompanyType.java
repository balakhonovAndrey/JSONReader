public class CompanyType {
    private int id;
    private String name_short;
    private String name_full;

    public CompanyType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameShort() {
        return name_short;
    }

    public void setNameShort(String nameShort) {
        this.name_short = nameShort;
    }

    public String getNameFull() {
        return name_full;
    }

    public void setNameFull(String nameFull) {
        this.name_full = nameFull;
    }

    @Override
    public String toString() {
        return "CompanyType{" +
                "id=" + id +
                ", nameShort='" + name_short + '\'' +
                ", nameFull='" + name_full + '\'' +
                "\n" +
                '}';
    }
}
