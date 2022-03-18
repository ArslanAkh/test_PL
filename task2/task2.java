package task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        try (Scanner file1 = new Scanner(new File(args[0]));
             Scanner file2 = new Scanner(new File(args[1]))) {

            float x = file1.nextFloat();
            float y = file1.nextFloat();
            int radius = file1.nextInt();

            while (file2.hasNextLine()) {
                String[] s = file2.nextLine().split(" ");
                float px = Float.parseFloat(s[0]);
                float py = Float.parseFloat(s[1]);
                float dist = (float) Math.sqrt(Math.pow(x - px, 2) + Math.pow(y - py, 2));
                if ((int) dist == radius) {
                    System.out.println(0);
                } else if (dist < radius) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: file not found!");
        }

    }
}
