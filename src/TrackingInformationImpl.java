import java.util.Map;

public class TrackingInformationImpl implements TrackingInformation {
    @Override
    public Integer getCounts(HierarchicalTags hierarchicalTags) {
        int count = 0;
        for (Map.Entry<Integer, HierarchicalTags> entry : trackingInformationMap.entrySet()) {
            count = count + getCount(hierarchicalTags, entry.getValue());
        }
        return count;
    }

    private int getCount(HierarchicalTags incomingList, HierarchicalTags existingList) {
        int count = 0;
        if (incomingList.getCity() != null
                && incomingList.getInstrument().equalsIgnoreCase(existingList.getInstrument())
                && incomingList.getState().equalsIgnoreCase(existingList.getState())
                && incomingList.getCity().equalsIgnoreCase(existingList.getCity())) {
            count = 1;
        } else if (incomingList.getState() != null && incomingList.getCity() == null
                && incomingList.getInstrument().equalsIgnoreCase(existingList.getInstrument())
                && incomingList.getState().equalsIgnoreCase(existingList.getState())) {
            count = 1;
        } else if (incomingList.getState() == null && incomingList.getCity() == null
                && incomingList.getInstrument().equalsIgnoreCase(existingList.getInstrument())) {
            count = 1;
        }
        return count;
    }

    @Override
    public void startTracking(Integer trackingId, HierarchicalTags hierarchicalTags) {
        trackingInformationMap.put(trackingId, hierarchicalTags);
        System.out.println("After add size is " + trackingInformationMap.size());
    }

    @Override
    public void stopTracking(Integer id) {
        trackingInformationMap.remove(id);
        System.out.println("After Remove the size is " + trackingInformationMap.size());
    }
}