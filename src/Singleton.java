public class Singleton {
    private volatile static Singleton Instance ;
    private static String addressOfSender;
    private  static String addressOfClient;
    private static double length;
    private static double cost;
    private static double weight;
    private static String weather;
    private static double hourofDelivery;

    private Singleton(){}
    public static Singleton getInstance(){
        if(Instance==null){
            synchronized (Singleton.class){
                if(Instance == null){
                    Instance = new Singleton();
                }
            }

        }
        return Instance;
    }

    public static void setInstance(Singleton instance) {
        Instance = instance;
    }

    public static String getAddressOfSender() {
        return addressOfSender;
    }

    public static void setAddressOfSender(String addressOfSender) {
        Singleton.addressOfSender = addressOfSender;
    }

    public static String getAddressOfClient() {
        return addressOfClient;
    }

    public static void setAddressOfClient(String addressOfClient) {
        Singleton.addressOfClient = addressOfClient;
    }

    public static double getLength() {
        return length;
    }

    public static void setLength(double length) {
        Singleton.length = length;
    }

    public static double getCost() {
        return cost;
    }

    public static void setCost(double cost) {
        Singleton.cost = cost;
    }

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        Singleton.weight = weight;
    }

    public static String getWeather() {
        return weather;
    }

    public static void setWeather(String weather) {
        Singleton.weather = weather;
    }

    public static double getHourofDelivery() {
        return hourofDelivery;
    }

    public static void setHourofDelivery(double hourofDelivery) {
        Singleton.hourofDelivery = hourofDelivery;
    }
}