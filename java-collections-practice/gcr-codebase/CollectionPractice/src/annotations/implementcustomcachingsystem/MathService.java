package annotations.implementcustomcachingsystem;

public class MathService {

    // expensive method whose result should be cached
    @CacheResult
    public int calculateSquare(int number) {

        System.out.println("calculating square for: " + number);

        // simulating expensive computation
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return number * number;
    }
}

