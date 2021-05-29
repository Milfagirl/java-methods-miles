public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int priceInPenny = 10000_00;
        int miles = service.calculate(priceInPenny);
        System.out.println(miles);
    }
}
