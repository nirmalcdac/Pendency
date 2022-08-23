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

    public HierarchicalTags(String instrument) {
        this.instrument = instrument;
    }
}