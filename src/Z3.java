import java.io.File;
import java.util.Scanner;

public class Z3 {
    public static String[] zwroc(String Path, String ext){
        File pliki = new File(Path);
        return pliki.list(((dir, name) -> !name.endsWith(ext.toLowerCase())));
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String P = scan.next();
        String E = scan.next();
        for(String x: zwroc(P, E)){
            System.out.println(x);
        }
    }
}
