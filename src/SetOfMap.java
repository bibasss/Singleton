public class SetOfMap extends Thread{
    public void run() {
    Singleton singleton=Singleton.getInstance();
        singleton.setLength(12);
        singleton.setWeather("Rainy");
    }

}
