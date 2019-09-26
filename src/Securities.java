public class Securities {
    private int id;
    private String code;
    private String name_full;
    private String cfi;
    private String date_to;
    private String state_reg_date;

    private State state;
    private Currency currency;

    public Securities() {
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

    public String getCfi() {
        return cfi;
    }

    public void setCfi(String cfi) {
        this.cfi = cfi;
    }

    public String getDateTo() {
        return date_to;
    }

    public void setDateTo(String dateTo) {
        this.date_to = dateTo;
    }

    public String getStateRegDate() {
        return state_reg_date;
    }

    public void setStateRegDate(String stateRegDate) {
        this.state_reg_date = stateRegDate;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Securities{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", nameFull='" + name_full + '\'' +
                ", cfi='" + cfi + '\'' +
                ", dateTo='" + date_to + '\'' +
                ", stateRegDate='" + state_reg_date + '\'' +
                ", state=" + state.toString() +
                ", currency=" + currency.toString() +
                "\n" +
                '}';
    }
}
