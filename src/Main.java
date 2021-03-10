public class Main {
    public static void main(String[] args) {
        double price = 15400.32;

        long miles = calculateMiles(price);

        System.out.printf("За билет стоимостью %s рублей начислено %d миль", price, miles);
    }

    public static long calculateMiles(double price){
        int miles = 20;

        long resultMiles = (long)(price / miles);

        return resultMiles;
    }
}
