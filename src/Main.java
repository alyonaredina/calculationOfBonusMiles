public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);    //должно получиться 500
        System.out.println(miles);

        System.out.println();
        System.out.println("20_000");
        System.out.println(service.calculate(20000));

        System.out.println();
        System.out.println("20");
        System.out.println(service.calculate(20));

        System.out.println();
        System.out.println("52_365");
        System.out.println(service.calculate(52_365));
    }
}