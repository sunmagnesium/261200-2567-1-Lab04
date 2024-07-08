public class HealthRecord {
    int height;
    private static final int MIN_ALLOWED_HEIGHT = 10;
    private static final int MAX_ALLOWED_HEIGHT = 500;
    private static final int DEFAULT_HEIGHT = 150;
    public static int minHeight = MAX_ALLOWED_HEIGHT;
    public static int maxHeight = MIN_ALLOWED_HEIGHT;

    public HealthRecord(int height) {
        setHeight(height);
        updateMaxMinHeight();
    }

    public void setHeight(int height) {
        if (height < MIN_ALLOWED_HEIGHT || height > MAX_ALLOWED_HEIGHT)
            this.height = DEFAULT_HEIGHT;
        else
            this.height = height;
    }

    public void updateMaxMinHeight() {
        if (height < minHeight) {
            minHeight = height;
        }
        if (height > maxHeight) {
            maxHeight = height;
        }
    }
}
