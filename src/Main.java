public class Main {
    public static void main(String[] args) {
        long price = 1000;
        int temp = 20;

        long miles = price / temp;

        System.out.printf("За билет стоимостью %s рублей начислено %d миль", price, miles);
    }
}
