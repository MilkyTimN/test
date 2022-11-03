package CollectionPractice2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        HeavyBox heavyBox = new HeavyBox("Box1", 12.3);
        HeavyBox heavyBox1 = new HeavyBox("Box2", 5.2);
        HeavyBox heavyBox2 = new HeavyBox("Box3", 1.9);
        HeavyBox heavyBox3 = new HeavyBox("Box4", 8.5);

        ArrayList<HeavyBox> heavyBoxes = new ArrayList<>();
        heavyBoxes.add(heavyBox);
        heavyBoxes.add(heavyBox1);
        heavyBoxes.add(heavyBox2);
        heavyBoxes.add(heavyBox3);

        for (HeavyBox h : heavyBoxes) {
            System.out.println(h);
        }

        heavyBox.setWeight(heavyBox.getWeight() + 1);
        heavyBoxes.remove(heavyBoxes.size() - 1);

        System.out.println(heavyBoxes);

        heavyBoxes.removeAll(heavyBoxes);

        System.out.println(heavyBoxes);
    }
}
