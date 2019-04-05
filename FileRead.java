package temperatureassign;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileRead {

    public String ReadFromFile(String filepath) {
        String filecontents = "";

        try {
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            String currentLine = br.readLine();

            while ((currentLine = br.readLine())!= null)//Reading from second line
            {
                    filecontents += currentLine + "\n";

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return filecontents;
    }
}
