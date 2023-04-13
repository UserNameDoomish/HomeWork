public class Main {
    public static void main(String[] args) {
        Fruit[] fruits = {
                new Fruit("apple", true, "green"),
                new Fruit("cherry", true, "red/white/black"),
                new Fruit("banana", true, "yellow/green")
        };

        int iterationNum = 0;
        for (int i = 0; i < fruits.length; i++) {
            Fruit currentFruit = fruits[i];
            System.out.println("Iteration: " + iterationNum);
            System.out.println("Fruit name: " + currentFruit.name);
            System.out.println("Fruit color: " + currentFruit.color);
            System.out.println("Fruit is tasty?: " + currentFruit.isTasty);
            iterationNum++;
        }



    }
}