package structuralpatterns.proxy.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimetableElectricTrains implements TimetableTrains {
    @Override
    public List<String> getTimetable() {
        ArrayList<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new FileReader(new File("/tmp/electric_trains.csv")));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
        return list;
    }

    @Override
    public String getTrainDepartureTime(String trainId) {
        List<String> timetable = getTimetable();
        for (String s : timetable) {
            if (s.startsWith(trainId + ";"))
                return s;
        }
        return "";
    }
}
