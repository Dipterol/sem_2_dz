import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RecFile_3 {
    public static void recFile() {
        String file_name = "record3.json";
        StringBuilder sb = new StringBuilder("[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\"" +
                ",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]\n");
        File file = new File(file_name);
        try {
            FileWriter writer = new FileWriter(file, false);
            writer.write(String.valueOf(sb));
            writer.write("\n");

            writer.close();
            System.out.println("Успешная запись файла для задания № 3 \n");
        } catch (IOException e) {
            System.out.println("Ошибка записи ");
        }
    }
}
