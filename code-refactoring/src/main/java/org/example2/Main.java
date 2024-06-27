import org.example2.Config;
import org.example2.ConfigurationValidatorCopy;

public static void main(String[] args) {
    var config = new Config("user", "mySecret" , "http://localhost:8080");
    var validationResult = new ConfigurationValidatorCopy().validateConfiguration(config);
    System.out.println("Config validation resulted in:" + validationResult);
}