import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String tung = "Tung oi, da hay qua!";

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < tung.length(); j++) {
                if (str.charAt(i) == tung.charAt(j)) {
                    count += 1;
                }
            }
        }
        System.out.print("Só lần ký tự lặp lại: " + count);
    }
}
