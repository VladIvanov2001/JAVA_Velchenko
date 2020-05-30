import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> arr = new ArrayList<>();
        arr.add("Matrix");
        arr.add("1812");
        arr.add("X-men");

        Cinema.Film cinema = new Cinema.Film(arr);

        List<String> arr1 = new ArrayList<>();
        arr1.add("12:00 - 13:20");
        arr1.add("14:00 - 15:50");
        arr1.add("19:00 - 22:20");

        Cinema.Time time = new Cinema.Time(arr1);

        List<String> arr2 = new ArrayList<>();
        arr2.add("Monday, Tuesday, Sunday");
        arr2.add("Wednesday");
        arr2.add("Saturday, Sunday");

        Cinema.TimeTable timeTable = new Cinema.TimeTable(arr2);

        System.out.println(cinema.getArr());
        System.out.println(timeTable.getArr());
        System.out.println(time.getArr());

        Cinema cinema4 = new Cinema(){
            @Override
            public void showInfo() {
                System.out.println("Анонимный класс переопределен");
            }
        };
        cinema4.showInfo();
    }
}
