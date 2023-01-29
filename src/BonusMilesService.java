public class BonusMilesService {
    public int calculate(int cost) {
        byte oneMile = 20;
        int miles = (cost / oneMile);
        return miles;
    }
}
