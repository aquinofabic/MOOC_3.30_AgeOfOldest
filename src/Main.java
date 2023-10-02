import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input a name followed by a comma then the age");
        System.out.println("For example: Dale,5");
        System.out.println("An input of nothing will stop the program");


        Scanner reader = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();  // we use an ArrayList because the size of the input could be infinite
        ArrayList<Integer> ages = new ArrayList<>();

        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }
            if (input.length() > 0) {
                String[] splitStringArray = input.split(",");
                names.add(splitStringArray[0]);
                ages.add(Integer.valueOf(splitStringArray[1]));  // we do Integer.valueOf() as this splitting strings will
                                                                 // ALWAYS produce an array of strings
            }
        }
        int oldest = ages.get(0);
        for (int i = 0; i < ages.size(); i++) {
            if (ages.get(i) > oldest) {
                oldest = ages.get(i);
            }
        }
        System.out.println("Age of the oldest is " + oldest);
    }
}
