

import animals.Animal;
import animals.Cat;
import animals.Dog;
import reporter.EmailExtractorReport;
import reporter.ExtractorReport;
import reporter.PhoneNumberExtractorReport;

import java.io.FileNotFoundException;

public class AbstractClassesExample {


    public static void main(String[] args) throws FileNotFoundException {

        ////////////////////////////////// Animals dummy example
        Animal cat = new Cat("Cat", 5.0, "Robert");
        Animal dog = new Dog("Dog", 21.3, "Mara");

        cat.salutation();
        cat.sound();

        System.out.println("--- ");

        dog.salutation();
        dog.sound();

        ///////////////////////////////// Real case example for extract info from a file and send report
        // Phone number report
        ExtractorReport phoneNumberExtractorReport = new PhoneNumberExtractorReport();
        phoneNumberExtractorReport.prepareAndSendReport("src/data.txt");

        // Email number report
        ExtractorReport emailExtractorReport = new EmailExtractorReport();
        emailExtractorReport.prepareAndSendReport("src/data.txt");

    }

}
