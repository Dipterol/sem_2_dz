//        Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
//        используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
//        Если значение null, то параметр не должен попадать в запрос.
//        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

import java.io.*;

public class Task_1 {
    public static void task_1() throws Exception {
        String data = fileReader();
        System.out.println("Чтение прошло успешно, строка -> " + data);
        System.out.println();
        StringBuilder newData = new StringBuilder(newStr(data));
        System.out.println("Строка без параметров \"null\" будет выглядеть так -> " + newData);
        System.out.println();
    }

    private static String fileReader() throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader("record.json"));
        String str = br.readLine();
        return str;
    }

    private static StringBuilder newStr(String string) {
        boolean allValuesAreNull = true;
        int startIndex = string.indexOf("{");                // Ищем позицию, с которой начинается объект JSON
        int endIndex = string.lastIndexOf("}");            // Ищем позицию, на которой заканчивается объект JSON
        String valuesString = string.substring(startIndex + 1, endIndex);   // Извлекаем подстроку, содержащую только значения ключей
        String[] values = valuesString.split(",");                     // Разбиваем строку на массив строк по символу ","
        StringBuilder result = new StringBuilder("{");                 // Создаем объект StringBuilder для хранения значений, не равных "null"
        for (String value : values) {
            if (!value.contains(":\"null\"")) {                        // Проверяем каждое значение на равенство "null"
                // Если значение не равно "null", добавляем его в объект StringBuilder "result"
                result.append(value).append(",");
            }
        }
        if (result.length() > 0) {                                 // Удаляем последний символ "," из объекта StringBuilder "result"
            result.deleteCharAt(result.length() - 1);
        }
        result.append("}");
        return result;
    }
}



