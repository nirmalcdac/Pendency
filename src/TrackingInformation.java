import java.util.HashMap;
import java.util.Map;

public interface TrackingInformation {
    Map<Integer, HierarchicalTags> trackingInformationMap = new HashMap<>();

    Integer getCounts(HierarchicalTags hierarchicalTags);

    void startTracking(Integer trackingId, HierarchicalTags hierarchicalTags);

    void stopTracking(Integer id);
}
