import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path randomNumPath = Paths.get("src", "data", "random.txt");
        //Creating a File object
        String path = "C:\\LabsJava\\lab9_3\\src\\output";
        File file = new File(path);
        //Creating the directory
        boolean bool = file.mkdir();
        if(bool){
            System.out.println("Directory created successfully");
        }
        else{
            System.out.println("Sorry couldn’t create specified directory");
        }
        Path outputPathForSortNum = Paths.get(path, "sorted.txt");
        int amountOfNumbers = 10;
        int boundOfRandomizing = 100;

        RandomNumb.fileWithRandomValues(amountOfNumbers, boundOfRandomizing, randomNumPath);
        RandomNumb.getSortedNum(randomNumPath, outputPathForSortNum);
    }
}
