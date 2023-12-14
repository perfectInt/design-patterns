package structuralpatterns.proxy.example;

import java.util.List;

public class DisplayTimetable {
    private final TimetableTrains timetableTrains = new TimetableElectricTrainsProxy();

    public void printTimetable() {
        List<String> timetable = timetableTrains.getTimetable();
        String[] tmpArr;
        System.out.println("Поезд\tОткуда\tКуда\t\tВремя отправления\tВремя прибытия\tВремя в пути");
        for (String s : timetable) {
            tmpArr = s.split(";");
            System.out.printf("%s\t%s\t%s\t\t%s\t\t\t\t%s\t\t\t%s\n", tmpArr[0], tmpArr[1], tmpArr[2], tmpArr[3], tmpArr[4], tmpArr[5]);
        }
    }
}
