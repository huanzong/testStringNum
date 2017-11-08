import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testString {
    public static void main(String args[]) {
        System.out.printf("输入一串字符串：");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        Pattern  p = Pattern.compile("\\d{2,}");//这个2是指连续数字的最少个数
        String u = "abc435345defsfsaf564565fsabad5467755fewfadfgea";
        Matcher m = p.matcher(u);
        int i = 0;
        while (m.find()) {

            System.out.println(m.group());
            i++;
        }
        System.out.println(i);

    }
    }