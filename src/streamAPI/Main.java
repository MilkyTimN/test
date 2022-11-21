package streamAPI;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        byte[] bytes = new byte[0];
        try {
            bytes = Files.readAllBytes(Paths.get("D:\\Projects\\text.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text = new String(bytes, StandardCharsets.UTF_8);

        List<String> result = Arrays.asList(text.split("\\PL+"));

        //1
        result.stream().filter(s->s.startsWith("к")).filter(s->s.length()<=3).
                forEach(y-> System.out.println(y));
        //2
        Map<String, List<String>> map = result.stream().collect(Collectors.groupingBy(String::valueOf));
        System.out.println(map);
        //3
        result.stream().filter(s->!s.startsWith("р") && !s.startsWith("Р")).map(String::toUpperCase).forEach(System.out::println);
        //4
        result.stream().sorted().forEach(y-> System.out.println(y));
        //5
        System.out.println(result.stream().count());
        //6
        System.out.println(result.stream().filter(s->s.length()>5).count());
    }
}
