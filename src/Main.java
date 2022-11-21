import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(className(10, 20));
        System.out.println(className(19, 29));
        System.out.println(className(42, 45));
        System.out.println(className(10, 20));
        System.out.println(className(generateRandomAge(), generateRandomAge()));

    }

    public static String className(int age, int temp) {
        if ((age > 20 && age < 45) && (temp > -20 && temp < 30)) {
            return "Можно идти гулять";
        } else if ((age < 20) && (temp >= 0 && temp < 28)) {
            return "Можно идти гулять";
        } else if ((age > 45) && (temp > -10 && temp < 25)) {
            return "Можно идти гулять";

        } else {
            return "Оставайтесь дома";

        }

    }
    public static int generateRandomAge(){
        Random random = new Random();
        int i = random.nextInt(100);
        return i;
    }


}