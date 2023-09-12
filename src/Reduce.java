public class Reduce {
    public static void main(String[] args) {
        int current = 100;
        int counter = 0;
        while (current > 0) {
            if (current % 2 == 0)
                current /= 2;
            else
                current -= 1;
            counter++;
        }
        System.out.println(counter);
    }
}
