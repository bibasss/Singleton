public class Main {


    public static void main(String[] args) {

        new WriteThread().start();
        new ReadThread().start();



    }
}