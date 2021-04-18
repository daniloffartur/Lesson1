public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        compareNumbers();
    }

    private static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign(){
        int a = 5;
        int b = 10;

        if(a + b < 0){
            System.out.println("Сумма отрицательная");
        } else {
            System.out.println("Сумма положительная");
        }
    }

    private static void printColor(){
        int value = 50;

        if(value > 100){
            System.out.println("Зеленый");
        }
        else if(value > 0){
            System.out.println("Желтый");
        }
        else{
            System.out.println("Красный");
        }
    }

    private static void compareNumbers(){
        int a = 5;
        int b = 10;

        if(a < b){
            System.out.println("a < b");
        } else {
            System.out.println("a >= b");
        }
    }

}
