package hashmap;
import java.util.TreeSet;
public class TreeSetDemo {

    public void treeSetDemo() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(1);
        treeSet.add(8);
        treeSet.add(2);

        System.out.println(treeSet);
    }

    public static void main(String[] args) {
        System.out.println("This is Tree set examples");
        TreeSetDemo treeSetDemo = new TreeSetDemo();
        treeSetDemo.treeSetDemo();

    }
}
