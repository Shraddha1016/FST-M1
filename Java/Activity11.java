import java.util.HashMap;
public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Green");
        hm.put(2, "Red");
        hm.put(3, "Black");
        hm.put(4, "Blue");
        hm.put(5, "white");
        System.out.println("Original map" + hm);
        hm.remove(5);
        System.out.println("after removing the white" + hm);
        if (hm.containsValue("Green")) {
            System.out.println("Green is present");
        } else {
            System.out.println("Green is not present");
        }
        System.out.println("Size if the map is" + hm.size());
    }
}