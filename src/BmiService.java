public class BmiService {
    public int calculate(int weightInKilograms, double heightInMeters) {
        int result;
        result = (int) (weightInKilograms / (heightInMeters * heightInMeters));
        return result;
    }
}
