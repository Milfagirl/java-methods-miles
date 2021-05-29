public class BonusMilesService {
    public int calculate(int cost) {
        int conditionForMileInPenny = 20_00;
        return cost / conditionForMileInPenny;
    }
}
