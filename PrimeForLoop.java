public class PrimeForLoop {
    void main() {
        for (int i = 2; i <= 500; i++) {
            
            boolean Prime = true;
            for (int div = 2; div * div <= i; div++) {
                if (i % div == 0) {
                    Prime = false;
                    break;
                }
            }
            if (Prime) {
                System.out.println(i);
            }

        }
    }
}
