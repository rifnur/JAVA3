
public class Main {

    public static void main(String[] args) {

        //Задача 1

        //Создаем ссылку и объект типа gen и все упоковываем
        Simple<String> Names = new Simple<String>(new String[]{"Ivan", "Misha"});
        Simple<Integer> Ages = new Simple<Integer>(new Integer[]{25, 35});
        Simple<Double> Wieghts = new Simple<Double>(new Double[]{100.3, 68.4});

        System.out.println("Типы: ");
        Names.showType();
        Ages.showType();
        Wieghts.showType();

        System.out.println("Создаем листы");
        Names.createArrayList();
        Ages.createArrayList();
        Wieghts.createArrayList();

        System.out.println("Меняем местами");
        Names.changePosition();
        Ages.changePosition();
        Wieghts.changePosition();

        // Задача 2

        Box<Apple> appleBox = new Box<>();
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();

        appleBox.addFruit(a1);
        appleBox.addFruit(a2);
        appleBox.addFruit(a3);

        System.out.println("Коробка с яблоками " + appleBox.getTotalWeight());

        Box<Orange> orangeBox = new Box<>();
        Orange o1 = new Orange();
        Orange o2 = new Orange();
        Orange o3 = new Orange();

        orangeBox.addFruit(o1);
        orangeBox.addFruit(o2);
        orangeBox.addFruit(o3);

        System.out.println("Коробка с апельсинами: " + orangeBox.getTotalWeight());

        System.out.println("Сравниваем коробки " + appleBox.compare(orangeBox));

        Box<Apple> newAppleBox = new Box<>();
        appleBox.replaceAllFruitsToOtherBox(newAppleBox);

        Apple a4 = new Apple();
        newAppleBox.addFruit(a4);
        System.out.println("Новая коробка с яблоками " + newAppleBox.getTotalWeight());
    }
}