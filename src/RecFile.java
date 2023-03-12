import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RecFile {
    public static void recFile() {
        String file_name = "record.json";
        StringBuilder sb = new StringBuilder("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");
        File file = new File(file_name);
        try {
            FileWriter writer = new FileWriter(file, false);
            writer.write(String.valueOf(sb));
            writer.write("\n");

            writer.close();
            System.out.println("Успешная запись файла для задания № 1");
        } catch (IOException e) {
            System.out.println("Ошибка записи ");
        }
    }
}
