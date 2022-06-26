package reporter;

import java.util.regex.Pattern;

public class EmailExtractorReport extends ExtractorReport{

    private static Pattern PATTERN = Pattern.compile("^(.+)@(.+)$");
    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Email extract report";
    }
}
