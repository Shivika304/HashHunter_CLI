import java.io.*;
import java.util.*;

public class passCracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter hash Input ");
            String hashFile = sc.nextLine();

            System.out.print("Enter wordlist path: ");
            String wordlist = sc.nextLine();

            System.out.println("\nHash type detected: MD5");
            System.out.println("Running attack...\n");

           ProcessBuilder pb = new ProcessBuilder(
                    "john",
                    "--format=raw-md5",
                    "--wordlist=" + wordlist,
                    hashFile
            );
            pb.redirectErrorStream(true);
            Process process = pb.start();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            String line;

            System.out.println("\nRunning John the Ripper...\n\n");

            while ((line = reader.readLine()) != null) {
                if(line.contains("(?)")){
                    String password = line.split("\\s+")[0];
                    System.out.println("\nPassword Found: " + password);
                }
            }

            process.waitFor();

            // show cracked passwords
            System.out.println("\nCracked Passwords:");
            ProcessBuilder show = new ProcessBuilder(
                    "john",
                    "--show",
                    hashFile
            );

            Process process2 = show.start();

           BufferedReader reader2 = new BufferedReader(
                    new InputStreamReader(process2.getInputStream())
            );

            while ((line = reader2.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        sc.close();
    }
}
