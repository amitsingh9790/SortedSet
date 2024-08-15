package SortedSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet set = new TreeSet();

        set.add("aa");
        set.add("dd");
        set.add("bb");
        set.add("ee");
        set.add("ff");
        set.add("cc");

        System.out.println(set);
        System.out.println(set.headSet("cc"));
        System.out.println(set.tailSet("cc"));
        System.out.println(set.subSet("bb","ee"));
    }
}
