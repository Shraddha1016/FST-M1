import java.util.ArrayList;
public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Leena");
        myList.add("Thomas");
        myList.add("Edison");
        myList.add(3,"Tom");
        myList.add(1,"Frank");
        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }
        System.out.println("3rd element in the list is:" +myList.get(2));
        System.out.println("Is Frank is in list:" +myList.contains("Frank"));
        System.out.println("Size of ArrayList:"+myList.size());
        myList.remove("Papaya");
        System.out.println("New Size of ArrayList:"+myList.size());
    }
}