public class PrimeForLoop {
    void main() {
        for (int i = 2; i <= 500; i++) {
            
            boolean isPrime = true;
            for (int divisor = 2; divisor * divisor <= i; divisor++) {
                if (i % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }

        }
    }
}
