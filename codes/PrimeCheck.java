public class PrimeCheck {
    public static void main(String[] args) {
        int num = 29;
        Boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                isPrime = false;
                break;

            }
        }
        if (isPrime) {
            System.out.println(+num + " is the prime num");

        } else {
            System.out.println(+num + "is not a prime no");
        }
    }
}


// 29 is the prime num