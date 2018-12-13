package random;

public class Example {
    public static void main(String[] args) {
        CustomRandom customRandom = new CustomRandom(1000);

        for(int i = 0; i < 100; i++){
            System.out.println(customRandom.nextInt());
        }
    }
}
