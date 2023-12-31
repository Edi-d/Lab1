public class problem_3 {
    public int[] summe(int[] arr1, int[] arr2){
        if (arr1.length == 0 && arr2.length == 0) {
            throw new IllegalArgumentException("Input array cannot be empty");
        }

        int[] sum = new int[arr1.length + 1];
        int carry = 0;

        for(int i = arr1.length - 1; i >= 0; i--){
            int digitSum = arr1[i] + arr2[i] + carry;
            sum[i+1] = digitSum % 10;
            carry = digitSum / 10;
        }

        sum[0] = carry;
        return sum;
    }

    public int[] differenz(int[] arr1, int[] arr2){
        if (arr1.length == 0 && arr2.length == 0) {
            throw new IllegalArgumentException("Input array cannot be empty");
        }

        int[] diff = new int[arr1.length];
        int borrow = 0;

        for(int i = arr1.length - 1; i >= 0; i--){
            int digitDiff = arr1[i] - arr2[i] - borrow;
            if(digitDiff < 0){
                digitDiff += 10;
                borrow = 1;
            }
            else{
                borrow = 0;
            }
            diff[i] = digitDiff;
        }
        return diff;
    }

    public int[] multiplikation(int[] arr, int nr){
        if (arr.length == 0) {
            throw new IllegalArgumentException("Input array cannot be empty");
        }

        int[] newArr = new int[arr.length + 1];
        int carry = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            int digits = arr[i] * nr + carry;
            newArr[i+1] = digits % 10;
            carry = digits / 10;

        }
        int[] resultArr = new int[newArr.length - 1];
        if(newArr[0] == 0){
            System.arraycopy(newArr, 1, resultArr, 0, newArr.length - 1);
        }
        return resultArr;
    }

    public int[] division(int[] arr, int nr){
        if (arr.length == 0) {
            throw new IllegalArgumentException("Input array cannot be empty");
        }
        if(nr == 0){
            throw new IllegalArgumentException("Divisor can not be null");
        }

        for (int i = 0; i < arr.length; i++) {
            int quotient = arr[i] / nr;
            int remainder = arr[i] % nr;
            arr[i] = quotient;
            if (i + 1 < arr.length) {
                arr[i + 1] += remainder * 10;
            }
        }
        return arr;
    }
}