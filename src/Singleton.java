import java.util.ArrayDeque;
import java.util.Queue;

public class Singleton {
    private volatile static Singleton Instance ;
    private Queue<String> QS = new ArrayDeque<>();
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
    public void add(String s){
        QS.add(s);
    }
    public String get(){
        return QS.poll();
    }
}