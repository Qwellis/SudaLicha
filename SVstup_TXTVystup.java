import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/planeo/Desktop/input.txt");
        Scanner sc = new Scanner(file);

        //Uložení textu z .txt souboru do Stringu
        String txtInput = "";
        String txtOutput = "";
        while (sc.hasNext()) {
            txtInput = sc.nextLine();
        }

        String[] vstupArr = txtInput.split(",");
        ArrayList<Integer> vystup = new ArrayList<>();


        //vložení do pole a naparsování na int
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
            txtOutput = txtOutput.concat(o + ", ");
        }
        FileWriter writer = new FileWriter("/Users/planeo/Desktop/output.txt");
        writer.write(txtOutput);
        writer.close();
    }
}
