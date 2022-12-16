import javax.sound.midi.SysexMessage;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static final String abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        try (BufferedReader buffer = new BufferedReader(new FileReader("input.txt"))) {
            String alphabeticResult = "";
            String line;
            int counter;
            int result = 0;

            while ((line = buffer.readLine()) != null) {
                counter = 0;
                String firstCompartment = line.substring(0, line.length()/2);
                String secondCompartment = line.substring(line.length()/2);
                while (counter < firstCompartment.length()) {
                    if (secondCompartment.contains(firstCompartment.substring(counter, counter+1))) {
                        break;
                    } else {
                        counter += 1;
                    }
                }
                alphabeticResult += (firstCompartment.charAt(counter));
            }

            counter = 0;
            while (counter < alphabeticResult.length()) {
                result += abc.indexOf(alphabeticResult.charAt(counter)) + 1;
                counter++;
            }
            System.out.println(result);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}