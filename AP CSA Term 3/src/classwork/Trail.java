package classwork;

public class Trail {
    public static int[] markers = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
    public boolean isLevelTrailSegment(int start, int end) {
        int min = markers[start];
        int max = markers[start];
        for(int i = start; i <= end; ++i) {
            if(markers[i] < min) {
                min = markers[i];
            } else if(markers[i] > max) {
                max = markers[i];
            }
        }
        int difference = Math.abs(max) - Math.abs(min);
        return difference <= 10;
    }

    public boolean isDifficult() {
        int difference = 0;
        for(int i = 1; i < markers.length; ++i) {
            if(Math.abs(markers[i-1] - markers[i]) >= 30)
                ++difference;
        }

        return difference >= 3;
    }

    public static void main(String[] args) {
        Trail test = new Trail();
        System.out.println(test.isLevelTrailSegment(0, markers.length-1));
        test.isDifficult();
    }
}
