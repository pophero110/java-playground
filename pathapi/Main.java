package pathapi;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

public class Main {
    public static void main(String[] args) {
        Path path = Path.of("/Users/jiajinou/Projects/java-playground/pathapi/foo.txt");
        Path path2 = Path.of("/Users/jiajinou/Projects/java-playground/pathapi/bar.txt");
        System.out.println(path);
        boolean exists = Files.exists(path);
        System.out.println("exists = " + exists);
        try {
            System.out.println(Files.readString(path));
            FileTime lastModifiedTime = Files.getLastModifiedTime(path);
            System.out.println("lastModifiedTime = " + lastModifiedTime);
            long mismatchIndex = Files.mismatch(path, path2);
            System.out.println("mismatch = " + mismatchIndex);
            UserPrincipal owner = Files.getOwner(path);
            System.out.println(owner);
            System.out.println(path.getParent());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
