import java.util.*;
public class Activity13 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random indexGen = new Random();
        System.out.print("Enter integers please ");
        System.out.println("(EOF or non-integer to terminate): ");
        while(sc.hasNextInt()) {
            list.add(sc.nextInt());
        }
        Integer nums[] = list.toArray(new Integer[0]);
        int index = indexGen.nextInt(nums.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value in array at generated index: " + nums[index]);
           }
}