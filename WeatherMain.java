package temperatureassign;

import javax.xml.bind.Element;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WeatherMain {
    public static void main(String[] args) {
        //String filepath = "C:\\Users\\Shivu\\IdeaProjects\\DATASETS\\jena_climate_2009_2016.csv";
        //String filepath = "C:\\Users\\Shivu\\IdeaProjects\\DATASETS\\weatherinput.txt";
        String filepath = "C:\\Users\\Shivu\\IdeaProjects\\DATASETS\\weather.txt";
       // String filepath = "C:\\Users\\Shivu\\IdeaProjects\\DATASETS\\weatheript.txt";//for 10000 records

        ArrayList<String> linesRead = new ArrayList<>();

        FileRead fileRead = new FileRead();
        String allLines = fileRead.ReadFromFile(filepath);
        String[] lines = allLines.split("\n");
        System.out.println("*******************************");

        ArrayList<Weather> records = new ArrayList<>();

        Weather wobj;
        for (String s : lines)
        {
            wobj = new Weather(s);
            records.add(wobj);
        }

        Weather element;

        //Maximum temp
        element = Collections.max(records, Comparator.comparingDouble(Weather::getTempdegC));
        System.out.println("Year in which Maximum temperature is:" );
        System.out.println("->Temp is:" + element.getTempdegC());
        System.out.println("->Year is:" + element.getYear());
        System.out.println("**********************************************");

        //Year in which Relative Humidity >96
        double relativehumidity = element.getRh();
        ArrayList<Weather> rhrecords = new ArrayList<>();
        for (Weather w : records)
        {
            relativehumidity = w.getRh();
           // if (relativehumidity > 98.1 && relativehumidity < 98.3)
            if(relativehumidity>96)
            {
                rhrecords.add(w);
            }
        }

        for (Weather weather: rhrecords)
        {
           // System.out.println("Year in which Relative Humidity greater than 98.1 is and less than 98.3:");
            System.out.println("Year in which Relative Humidity greater than 96");
            System.out.println("->Relative Humidity is:" + weather.getRh());
            System.out.println("->Year is:" + weather.getYear());
        }
            System.out.println("**********************************************");

            //Day with maximum relative humidity
            element = Collections.max(records, Comparator.comparingDouble(Weather::getRh));
            System.out.println("Day having Maximum Relative Humidity is:");
            System.out.println("->Relative Humidity is:" + element.getRh());
            System.out.println("->Day is:" + element.getDate());
            System.out.println("**********************************************");

            //Min Temperature, 1 bar=1000;
            Weather element1;
            double pressure = element.getPressure();
            ArrayList<Weather> minTemp = new ArrayList<>();

            for (Weather w2 : records)
            {
                pressure = w2.getPressure();
                if (pressure > 1000)
                {
                    minTemp.add(w2);
                }
            }
            Weather element2 = Collections.min(minTemp, Comparator.comparingDouble(Weather::getTempdegC));
            System.out.println("Minimum temp where pressure is greater than 1 bar is:");
            System.out.println("->Pressure is:" +element2.getPressure());
            System.out.println("->Minimum temp is:" +element2.getTempdegC());
            System.out.println("**********************************************");
    }
}































//Max RH in one year
        /*int[] rhlist=new int[365];
        for(int i=0;i<rhlist.length;i++)
            rhlist[i]=records.nextint[];*/


         /*for(String s:lines)
        {
            System.out.println("All lines to be displayed are:" +s);
        }*/


       /* private static void printWeatherDetails (String s, Weather element)
        {
            System.out.println(s + element.getDate_time() + " " + element.getPressure() + " " + element.getTempdegC() + " " + element.getTempdegK() + " " + element.getTdew() + " "
                    + element.getRh() + " " + element.getVpmax() + " " + element.getVpact() + " " + element.getVpdef() + " " + element.getSh() + " "
                    + element.getH2oc() + " " + element.getRho() + " " + element.getWv() + " " + element.getMax_wv() + " " + element.getWd());
        }*/




         /*for(int i=0;i<records.size();i++)
       {
            if (element.getPressure() > 1000)
            {
                Collections.sort(records, Comparator.comparingDouble(Weather::getPressure));
                System.out.println(element.getPressure());
            }
        }*/