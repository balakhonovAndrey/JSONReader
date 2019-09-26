public class Currency {
    private int id;
    private String code;
    private String name_short;
    private String name_full;

    public Currency() {
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
        return "Currency{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", nameShort='" + name_short + '\'' +
                ", nameFull='" + name_full + '\'' +
                "\n" +
                '}';
    }
}
