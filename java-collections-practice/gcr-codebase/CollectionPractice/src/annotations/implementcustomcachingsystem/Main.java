package annotations.implementcustomcachingsystem;

public class Main {
    public static void main(String[] args) {

        MathService service = new MathService();

        // first call (computes result)
        System.out.println(CacheManager.execute(service, "calculateSquare", 5));

        // second call with same input (cached result)
        System.out.println(CacheManager.execute(service, "calculateSquare", 5));

        // different input (new computation)
        System.out.println(CacheManager.execute(service, "calculateSquare", 7));
    }
}

