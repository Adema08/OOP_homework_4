import java.util.List;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Fruit> box = getFruitBox();
        printBox(box);

    }
    public static void printBox(Box<? extends Fruit> box) {
        List<?> items = box.get();

        System.out.println("В коробке:");
        for (Object item : items) {
            System.out.println(item.toString());
        }
    }

    public static Box<Fruit> getFruitBox() {
        Box<Fruit> fruitBox = new Box<>();

        // Добавление фруктов в коробку

        fruitBox.put(new Orange());
        fruitBox.put(new Apple());
        fruitBox.put(new Apple());
        fruitBox.put(new Orange());
        fruitBox.put(new Apple());
        fruitBox.put(new Orange());
        fruitBox.put(new Apple());

        return fruitBox;
    }
}