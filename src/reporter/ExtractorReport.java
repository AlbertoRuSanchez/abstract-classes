package reporter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class ExtractorReport {

    public abstract Pattern getPattern();

    public abstract String getReportName();

    public String parse(String path) throws FileNotFoundException {

        String out = "";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        if (!scanner.hasNext()) {
            return "Empty file";
        }
        scanner.nextLine();

        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            Matcher matcher = getPattern().matcher(nextLine);
            boolean matches = matcher.matches();
            if (matches) {
                out += nextLine + "\n";
            }
        }
        return out.isBlank() ? "Empty file" : out;
    }

    public void prepareAndSendReport(String path) throws FileNotFoundException {
        System.out.println("Starting report..." + getReportName());
        String report = parse(path);
        System.out.println(report);
        System.out.println("Sent report..." + getReportName());
    }


}
