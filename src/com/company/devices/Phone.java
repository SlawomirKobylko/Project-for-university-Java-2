package com.company.devices;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device {
   public String producer;
   public String model;
   public Integer yearOfProduction;
   public String AppName;
   public String version;
   URL url;

   public static String DEFAULT_APP_VERSION;
   public static String DEFAULT_SERVER_NAME;

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("trzymasz przycisk i czekasz");
        System.out.println("trzymasz przycisk i czekasz");
        System.out.println("trzymasz przycisk i czekasz");
        System.out.println("trzymasz przycisk i czekasz");
        System.out.println("o, wyłączyło się");
        }

        //Zadanie 10
        public void installAnApp(String appName){
            System.out.println("instalowanie aplikacji "+appName);
            this.installAnApp(appName, DEFAULT_APP_VERSION);

    }
    public void installAnApp(String appName, String version){
        System.out.println("instalowanie aplikacji "+ appName +" w wersji "+ version);
        this.installAnApp(appName, DEFAULT_SERVER_NAME);

    }
    public void installAnApp(String appName, String version, String server) {
        try{
            URL url = new URL("https",server,443,appName+"-"+version);
            this.installAnApp(url);
        }
        catch (MalformedURLException e){
            e.printStackTrace();
        }

    }

    public void installAnApp(URL url){
        //log
        //sprawdzanie miejsca
        //sprawdzenie czy jest płatna
        //obsługa płatności
        //pobranie aplikacji
        //rozpakowanie
        //instalacja
    }

    public void installAnApp(List<String> appNames){
        for (String appName : appNames)
        {
            this.installAnApp(appName);
        }

    }
}
