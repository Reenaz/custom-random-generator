package random;

public class Example {

    // test custom rng
    public static void main(String[] args) {
        CustomRandom customRandom = new CustomRandom();

        for(int i = 0; i < 100; i++){
            System.out.println(customRandom.random());
        }
    }
}
