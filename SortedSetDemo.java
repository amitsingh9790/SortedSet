package SortedSet;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet set = new TreeSet(Comparator.reverseOrder());

        set.add("aa");
        set.add("dd");
        set.add("bb");
        set.add("ee");
        set.add("ff");
        set.add("cc");

        System.out.println(set);
        System.out.println("First: "+set.first()); // First elements
        System.out.println("Last: "+set.last()); // Last elements
        System.out.println("Previous than CC"+set.headSet("cc"));//Elements previous than cc
        System.out.println("Next than or equal to CC"+set.tailSet("cc"));//Elements Next than or equal to cc
        System.out.println(set.subSet("ee","bb")); //Elements strictly between bb(include) and ee(exclude)
    }
}
