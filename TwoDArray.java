import java.util.*;

public class DobInt{
    public int[] double_To_Int(double[] ar) {
        int arrInt[] = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            arrInt[i] = (int) ar[i];
        }
        return arrInt;
    }

    public static void main(String[] args) {
        System.out.println("Enter thr size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
	DobInt c = new DobIn();
        double arr[] = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the double value for index" + i);
            arr[i] = sc.nextDouble();
        }
        int arrInt[] = new int[n];
        arrInt= c.double_To_Int(arr);

        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }

    }

}
