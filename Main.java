public class Main {
    public static void main(String[] args) {
        HealthRecord hr1 = new HealthRecord(170);
        HealthRecord hr2 = new HealthRecord(160);
        HealthRecord hr3 = new HealthRecord(420);
        HealthRecord hr4 = new HealthRecord(90);

        System.out.println(HealthRecord.maxHeight);
        System.out.println(HealthRecord.minHeight);
    }
}
