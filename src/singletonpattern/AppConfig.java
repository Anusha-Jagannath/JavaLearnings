package singletonpattern;

public class AppConfig {

   private static AppConfig obj = null;

   private AppConfig() {

   }

   public static AppConfig getInstance() {
       if (obj == null) {
           obj = new AppConfig();
       }

       return obj;
   }
}
