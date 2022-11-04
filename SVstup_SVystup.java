import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String vstup = sc.nextLine();


        String[] vstupArr = vstup.split(",");
        ArrayList<Integer> vystup = new ArrayList<>();

        int[] intVstupArr = new int[vstupArr.length];
        for (int i = 0; i < vstupArr.length; i++) {
            intVstupArr[i] = Integer.parseInt(vstupArr[i]);
        }

        if (intVstupArr.length % 2 == 0) {
            for (int i = 0; i < vstupArr.length; i++) {
                if (intVstupArr[i] % 2 != 0) {
                    continue;
                } else vystup.add(intVstupArr[i]);
            }
        } else {
            for (int i = 0; i < vstupArr.length; i++) {
                if (intVstupArr[i] % 2 == 0) {
                    continue;
                } else vystup.add(intVstupArr[i]);
            }
        }

        for (int o : vystup) {
            System.out.println(o);
        }
    }
}
