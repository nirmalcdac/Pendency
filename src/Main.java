public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Design Pattern facade
        start();
    }

    private static void start() {
        TrackingInformation trackingInformation = new TrackingInformationImpl();
        trackingInformation.startTracking(1112, new HierarchicalTags("UPI", "Karnataka", "Bangalore"));
        trackingInformation.startTracking(2451, new HierarchicalTags("UPI", "Karnataka", "Mysore"));
        trackingInformation.startTracking(3421, new HierarchicalTags("UPI", "Rajasthan", "Jaipur"));
        trackingInformation.startTracking(1221, new HierarchicalTags("Wallet", "Karnataka", "Bangalore"));
        System.out.println("result of get count is " + trackingInformation.getCounts(new HierarchicalTags("UPI")));
        System.out.println("result of get count is " + trackingInformation.getCounts(new HierarchicalTags("UPI", "Karnataka")));
        System.out.println("result of get count is " +
                trackingInformation.getCounts(new HierarchicalTags("UPI", "Karnataka", "Bangalore")));
        trackingInformation.startTracking(4221, new HierarchicalTags("Wallet", "Karnataka", "Bangalore"));
        trackingInformation.stopTracking(1112);
        trackingInformation.stopTracking(2451);
        System.out.println("result of get count is " + trackingInformation.getCounts(new HierarchicalTags("UPI")));
        System.out.println("result of get count is " + trackingInformation.getCounts(new HierarchicalTags("Wallet")));
        System.out.println("result of get count is " +
                trackingInformation.getCounts(new HierarchicalTags("UPI", "Karnataka", "Bangalore")));
        System.out.println("result of get count is " + trackingInformation.getCounts(new HierarchicalTags("Bangalore")));
    }
}