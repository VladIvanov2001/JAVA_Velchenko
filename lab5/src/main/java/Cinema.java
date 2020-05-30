import java.util.ArrayList;
import java.util.List;
//вложенный, анонимный, внутренний

public class Cinema {
    static class Film {
        List<String> arr;
        Film(List <String> arr){
            this.arr = arr;
        }

        public List<String> getArr() {
            return arr;
        }
    }
    static class TimeTable {
        List<String> arr;
        TimeTable(List<String> arr){
            this.arr = arr;
        }

        public List<String> getArr() {
            return arr;
        }
    }
    static class Time {
        List<String> arr;
        Time(List<String> arr){
            this.arr = arr;
        }

        public List<String> getArr() {
            return arr;
        }
    }
    void showInfo(){
        System.out.println("Анонимный класс");
    }

    private static void showInner(){
        System.out.println("Вложенный внутренний класс");
    }
}
