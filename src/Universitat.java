import java.util.Arrays;

public class Universitat {

    public static int[] notEnoughGrades(int[] noten) {
        int[] result = new int[noten.length];
        for (int i = 0; i < noten.length; i++) {
            if (noten[i] < 38) {
                result[i] = noten[i];
            } else {
                int nextMultipleOf5 = (int) (Math.ceil(noten[i] / 5.0) * 5);
                if (nextMultipleOf5 - noten[i] < 3) {
                    result[i] = nextMultipleOf5;
                } else {
                    result[i] = noten[i];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] noten = {84, 29, 38, 73, 91};
        int[] notEnough = notEnoughGrades(noten);
        System.out.println("Ursprüngliche Noten: " + Arrays.toString(noten));
        System.out.println("Nicht ausreichende Noten: " + Arrays.toString(notEnough));
    }
}
