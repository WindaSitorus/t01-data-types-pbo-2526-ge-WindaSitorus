import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membaca penanda soal (Soal1, Soal2, ..., Soal5)
        String soal = sc.next();

        switch (soal) {

            // ================= SOAL 1 =================
            case "Soal1": {
                int a = sc.nextInt();
                int b = sc.nextInt();

                int sum = a + b;

                // Deteksi integer overflow tanpa long / try-catch
                if ((a > 0 && b > 0 && sum < 0) ||
                    (a < 0 && b < 0 && sum > 0)) {
                    System.out.println("OVERFLOW");
                } else {
                    System.out.println(sum);
                }
                break;
            }

            // ================= SOAL 2 =================
            case "Soal2": {
                double x = sc.nextDouble();
                double y = sc.nextDouble();

                float sumFloat = (float) x + (float) y;
                double sumDouble = x + y;

                double diff = Math.abs(sumFloat - sumDouble);

                System.out.printf("%.6f%n", diff);
                break;
            }

            // ================= SOAL 3 =================
            case "Soal3": {
                int N = sc.nextInt();

                Integer a = N;
                Integer b = a;

                a = a + 1;

                System.out.println("==: " + (a == b));
                System.out.println("equals: " + a.equals(b));
                break;
            }

            // ================= SOAL 4 =================
            case "Soal4": {
                String S = sc.next();

                String a = S;
                String b = new String(S);

                a = a + "X";

                System.out.println("==: " + (a == b));
                System.out.println("equals: " + a.equals(b));
                break;
            }

            // ================= SOAL 5 =================
            case "Soal5": {
                String intStr = sc.next();
                String doubleStr = sc.next();
                String boolStr = sc.next();

                int i = Integer.parseInt(intStr);
                double d = Double.parseDouble(doubleStr);
                boolean b = Boolean.parseBoolean(boolStr);

                double result = i * d;

                if (!b) {
                    result *= -1;
                }

                System.out.printf("%.2f%n", result);
                break;
            }

            // ================= DEFAULT =================
            default:
                System.out.println("Soal tidak dikenali");
        }

        sc.close();
    }
}
