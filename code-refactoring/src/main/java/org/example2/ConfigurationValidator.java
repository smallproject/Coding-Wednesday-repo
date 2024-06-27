//package org.example2;
//
//public class ConfigurationValidator {
//    public boolean validateConfiguration(Config config) {
//        if (config != null) {
//            if (config.getUsername() != null) {
//                if (!config.getUsername().isEmpty()) {
//                    if (config.getPassword() != null) {
//                        if (!config.getPassword().isEmpty()) {
//                            if (config.getUrl() != null) {
//                                if (!config.getUrl().isEmpty()) {
//                                    if (config.getUrl().startsWith("http")) {
//                                        // Valid configuration
//                                        return true;
//                                    } else {
//                                        System.out.println("Invalid URL: must start with http");
//                                        return false;
//                                    }
//                                } else {
//                                    System.out.println("URL cannot be empty");
//                                    return false;
//                                }
//                            } else {
//                                System.out.println("URL cannot be null");
//                                return false;
//                            }
//                        } else {
//                            System.out.println("Password cannot be empty");
//                            return false;
//                        }
//                    } else {
//                        System.out.println("Password cannot be null");
//                        return false;
//                    }
//                } else {
//                    System.out.println("Username cannot be empty");
//                    return false;
//                }
//            } else {
//                System.out.println("Username cannot be null");
//                return false;
//            }
//        } else {
//            System.out.println("Config object cannot be null");
//            return false;
//        }
//    }
//}
//
//
//public class Config {
//    private String username;
//    private String password;
//    private String url;
//
//    public Config(String username, String password, String url) {
//        this.username = username;
//        this.password = password;
//        this.url = url;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//}