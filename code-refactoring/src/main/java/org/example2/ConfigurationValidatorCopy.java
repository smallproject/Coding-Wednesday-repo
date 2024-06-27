package org.example2;

public class ConfigurationValidatorCopy {
   public boolean validateConfiguration(Config config) {
       if(!isConfigNull(config)) return false;
       if(!isUsernameNull(config)) return false;
       if(!isUsernameEmpty(config)) return false;
       if(!isPasswordNull(config)) return false;
       if(!isPasswordEmpty(config)) return false;
       if(!isUrlNull(config)) return false;
       if(!isUrlEmpty(config)) return false;
       return isUrlStartWith(config);
   }

    private boolean isConfigNull(Config config) {
        if (config == null) {
            System.out.println("Config object cannot be null");
            return false;
        }
        return true;
    }

    private boolean isUsernameNull(Config config) {
        if (config.getUsername() == null) {
            System.out.println("Username cannot be null");
            return false;
        }
        return true;
    }

    private boolean isUsernameEmpty(Config config) {

        if (config.getUsername().isEmpty()) {
            System.out.println("Username cannot be empty");
            return false;
        }

        return true;
    }

    private boolean isPasswordNull(Config config) {
        if (config.getPassword() == null) {
            System.out.println("Password cannot be null");
            return false;
        }
        return true;
    }

    private Boolean isPasswordEmpty(Config config) {
        if (config.getPassword().isEmpty()) {
            System.out.println("Password cannot be empty");
            return false;
        }
        return true;
    }

    private Boolean isUrlNull(Config config) {
        if (config.getUrl() == null) {
            System.out.println("URL cannot be null");
            return false;
        }
        return true;
    }

    private Boolean isUrlEmpty(Config config) {
        if (config.getUrl().isEmpty()) {
            System.out.println("URL cannot be empty");
            return false;
        }
        return true;
    }

    private boolean isUrlStartWith(Config config) {
        if (!config.getUrl().startsWith("http")) {
            System.out.println("Invalid URL: must start with http");
            return false;
        }
        return true;
    }
}


