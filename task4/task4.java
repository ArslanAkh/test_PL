import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length == 1) {
            Scanner sc = new Scanner(new File(args[0]));
            Scanner linesQty = new Scanner(new File(args[0]));

            int counter = 0;
            while (linesQty.hasNextInt()) {
                String[] s = linesQty.nextLine().split(" ");
                counter++;
            }

            int[] nums = new int[counter];
            int index = 0;

            while (sc.hasNextInt()) {
                nums[index] = sc.nextInt();
                index++;
            }
            //System.out.println(Arrays.toString(nums));
            Arrays.sort(nums);
            //System.out.println(Arrays.toString(nums));

            int middle = nums.length / 2;
            int medianValue = 0;
            if (nums.length % 2 == 1)
                medianValue = nums[middle];
            else
                medianValue = (nums[middle - 1] + nums[middle]) / 2;
            //System.out.println("медиана: " + medianValue);

            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                count += Math.abs(nums[j] - medianValue);
            }
            System.out.println(count);
            System.out.println();

            sc.close();
            linesQty.close();
        }
    }
}
