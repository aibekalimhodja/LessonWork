import java.util.Random;

    public class MainClass {


        public static void main(String[] args) {
            int age = 20;
            int temp = 5;

            System.out.println(nameOfMetod(temp, age));
            System.out.println(nameOfMetod(20, 6));
            System.out.println(nameOfMetod(20, 7));
            System.out.println(nameOfMetod(-40, 6));
            System.out.println(nameOfMetod(25, 54));
            System.out.println(nameOfMetod(23, 45));


            System.out.println(generateRandomAge());


        }


        private static String nameOfMetod(int temp, int age) {
            if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30) {
                return "mojno idti guliat";
            } else if (age > 0 && age <= 20 && temp >= 0 && temp <= 28) {
                return "mojno idti guliat";
            } else if (age >= 45 && temp >= -10 && temp <= 25) {
                return "mojno idti guliat";
            } else
                return "ostavaisia doma";
        }

        public static int generateRandomAge() {
            Random random = new Random();
            int x = random.nextInt(70) + 1;
            return x;

        }
    }












