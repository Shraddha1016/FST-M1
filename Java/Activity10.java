import java.util.HashSet;
public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("S");
        hs.add("H");
        hs.add("D");
        hs.add("M");
        hs.add("A");
        hs.add("R");
        System.out.println("Existing HashSet: " + hs);
        System.out.println("Size of HashSet: " + hs.size());
        System.out.println("Removing A from HashSet: " + hs.remove("A"));
        if(hs.remove("R"))
        {
            System.out.println("R removed from the Set");
        }
        else
        {
            System.out.println("R is not present in the Set");
        }
        System.out.println("Checking whether M is present: " + hs.contains("M"));
        System.out.println("Newly HashSet: " + hs);
    }
}