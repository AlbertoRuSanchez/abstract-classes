package reporter;

import java.util.regex.Pattern;

public class PhoneNumberExtractorReport extends ExtractorReport{

    private static Pattern PATTERN = Pattern.compile("\\b\\d+\\b");
    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Number extractor report";
    }
}
