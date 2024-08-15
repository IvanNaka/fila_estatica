import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        StaticQueue staticQueue = new StaticQueue(3);
        staticQueue.add("A");
        staticQueue.add("B");
        var removedItem = staticQueue.remove();
    }
}