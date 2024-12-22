import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;

    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        //int fiveHun = fiveHun();
        //int largest = findLargest();
        //int odds = odds();
        //int evens = evens();
        //int doubleDigits = doubleDigits();
        //System.out.println("FiveHun = " + fiveHun);
        //System.out.println("Largest number = " + largest);
        //System.out.println("Odds = " + odds);
        //System.out.println("Evens = " + evens);
        //System.out.println("Double digits = " + doubleDigits);
       // int smallest = findSmallest();
        //System.out.println("Smallest number = " + smallest);
        int sum = sum();
        double average = average();
        int mode = mode();
        System.out.println("Sum = " + sum);
        System.out.println("Arithmetic mean (rounded to nearest thousandth) = " + String.format("%.3f", average));
        System.out.println("Mode = " + mode);
    }
    /* public static int findSmallest() throws FileNotFoundException {
        Scanner s = new Scanner(f);
        int smallest = Integer.MAX_VALUE;
        while (s.hasNextInt()) {
            int number = s.nextInt();
            if (number < smallest) {
                smallest = number;
            }
        }
        s.close();
        return smallest;
    }
*/



    /*public static int odds() throws FileNotFoundException {
        Scanner s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        s.close();
        return odds;
    }

    public static int evens() throws FileNotFoundException {
        Scanner s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        s.close();
        return evens;
    }

    public static int doubleDigits() throws FileNotFoundException {
        Scanner s = new Scanner(f);
        int doubleDigits = 0;
        while (s.hasNextInt()) {
            int number = s.nextInt();
            if (number >= 10 && number <= 99) {
                doubleDigits++;
            }
        }
        s.close();
        return doubleDigits;
    }

    public static int fiveHun() throws FileNotFoundException {
        Scanner s = new Scanner(f);
        int fiveHunCount = 0;
        while (s.hasNextInt()) {
            int number = s.nextInt();
            if (number > 500) {
                fiveHunCount++;
            }
        }
        s.close();
        return fiveHunCount;
    }

    public static int findLargest() throws FileNotFoundException {
        Scanner s = new Scanner(f);
        int largest = Integer.MIN_VALUE;
        while (s.hasNextInt()) {
            int number = s.nextInt();
            if (number > largest) {
                largest = number;
            }
        }
        s.close();
        return largest;
    }
*/
public static int sum() throws FileNotFoundException {
        Scanner s = new Scanner(f);
        int sum = 0;
        while (s.hasNextInt()) {
            sum += s.nextInt();
        }
        s.close();
        return sum;
    }

    public static double average() throws FileNotFoundException {
        Scanner s = new Scanner(f);
        int sum = 0;
        int count = 0;
        while (s.hasNextInt()) {
            sum += s.nextInt();
            count++;
        }
        s.close();
        return (count == 0) ? 0 : (double) sum / count;
    }

    public static int mode() throws FileNotFoundException {
        Scanner s = new Scanner(f);
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        while (s.hasNextInt()) {
            int number = s.nextInt();
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }
        s.close();

        int mode = Integer.MIN_VALUE;
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mode = entry.getKey();
            }
        }

        return mode;
    }
}