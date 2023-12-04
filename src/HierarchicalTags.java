import java.util.Objects;

public class HierarchicalTags {
    private final String instrument;
    private String city;
    private String state;

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getInstrument() {
        return instrument;
    }

    public HierarchicalTags(String instrument, String state, String city) {
        this.instrument = instrument;
        this.state = state;
        this.city = city;
    }

    public HierarchicalTags(String instrument, String state) {
        this.instrument = instrument;
        this.state = state;
    }

    @Override
    public String toString() {
        return "HierarchicalTags{" +
                "instrument='" + instrument + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HierarchicalTags that)) return false;
        return Objects.equals(getInstrument(), that.getInstrument()) && Objects.equals(getCity(), that.getCity()) && Objects.equals(getState(), that.getState());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInstrument(), getCity(), getState());
    }

    public HierarchicalTags(String instrument) {
        this.instrument = instrument;
    }
}