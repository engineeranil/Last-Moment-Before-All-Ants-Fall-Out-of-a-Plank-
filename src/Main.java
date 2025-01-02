public class Main {
    public static void main(String[] args) {
        int n =9;
        int[] left = {4};
        int[] right = {5};
        int maxDistanceLeft = 0;
        int maxDistanceRight = 0;
        for (int i = 0; i < left.length; i++) {
            if (left[i] > maxDistanceLeft) {
                maxDistanceLeft = left[i];
            }
        }
        for (int j = 0; j < right.length; j++) {
            int rightDistance = n - right[j];
            if (rightDistance > maxDistanceRight) {
                maxDistanceRight = rightDistance;
            }
        }
        if(maxDistanceRight>maxDistanceLeft){
            System.out.println(maxDistanceRight);
        }
        else{
            System.out.println(maxDistanceLeft);
        }
    }
}
