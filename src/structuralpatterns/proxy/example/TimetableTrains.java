package structuralpatterns.proxy.example;

import java.util.List;

public interface TimetableTrains {
    List<String> getTimetable();
    String getTrainDepartureTime(String trainId);
}
