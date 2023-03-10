package Control;

import eg.edu.alexu.csd.oop.game.GameObject;
import java.awt.Color;
import java.util.List;

public class Generator {

    private int i;
    List<GameObject> moving;
    List<GameObject> constant;
    List<GameObject> control;
    ObjectFactory ob = new ObjectFactory();

    public Generator(List<GameObject> moving, List<GameObject> constant, List<GameObject> control) {
        this.moving = moving;
        this.constant = constant;
        this.control = control;

        control.add(ob.createShape("Clown", (int) (1000 * 0.4), (int) (700 * 0.625), "/Clown.png", Color.LIGHT_GRAY));
        constant.add(ob.createShape("Shelf", 0, 50, "shelf", Color.BLUE)); 
        constant.add(ob.createShape("Shelf", 675, 50, "shelf", Color.BLUE)); 
    }

    public void GenerateLeft() {
        for (i = 0; i < 55; i++) {
            if (i == 4 || i == 15 || i == 28 || i == 40) {
                moving.add(ob.createShape("Skittles", 0 - 75 * (3 * i), 15, "/object666.png", Color.ORANGE));

            } else {
                int rand = ((int) (Math.random() * 1000) % 5);
                switch (rand) {
                    case 0 ->
                        moving.add(ob.createShape("Plate", 0 - 75 * (3 * i), 40, "/object1b.png", Color.RED));
                    case 1 ->
                        moving.add(ob.createShape("Plate", 0 - 75 * (3 * i), 40, "/object2b.png", Color.BLUE));
                    case 2 ->
                        moving.add(ob.createShape("Plate", 0 - 75 * (3 * i), 40, "/object3b.png", Color.YELLOW));
                    case 3 ->
                        moving.add(ob.createShape("Plate", 0 - 75 * (3 * i), 40, "/object4b.png", Color.GREEN));
                    case 4 ->
                        moving.add(ob.createShape("Bomb", 0 - 75 * (3 * i), -20, "/object5.png", Color.BLACK));

                    default -> {
                    }
                }
            }
        }
    }

    public void GenerateRight() {
        for (i = 0; i < 55; i++) {
            if (i == 11 || i == 21 || i == 35 || i == 46) {
                moving.add(ob.createShape("Skittles", 800 + 75 * (3 * i), 15, "/object666.png", Color.ORANGE));

            } else {
                int rand = ((int) (Math.random() * 1000) % 5);
                switch (rand) {
                    case 0 ->
                        moving.add(ob.createShape("Plate", 800 + 75 * (3 * i), 40, "/object1b.png", Color.RED));
                    case 1 ->
                        moving.add(ob.createShape("Plate", 800 + 75 * (3 * i), 40, "/object2b.png", Color.BLUE));
                    case 2 ->
                        moving.add(ob.createShape("Plate", 800 + 75 * (3 * i), 40, "/object3b.png", Color.YELLOW));
                    case 3 ->
                        moving.add(ob.createShape("Plate", 800 + 75 * (3 * i), 40, "/object4b.png", Color.GREEN));
                    case 4 ->
                        moving.add(ob.createShape("Bomb", 800 + 75 * (3 * i), -20, "/object5.png", Color.BLACK));
                    default -> {
                    }
                }
            }
        }
    }
}
