public class MyIntegerTest {
    public static void testInteger(boolean condition) {
        if (condition) {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }
    }

    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(5);
        testInteger(myInteger.isEven());

        testInteger(myInteger.isEven(7));

        testInteger(myInteger.isEven(myInteger.getValue()));

        testInteger(myInteger.isOdd());

        testInteger(myInteger.isOdd(8));

        testInteger(myInteger.isOdd(myInteger.getValue()));

        testInteger(myInteger.isPrime());

        testInteger(myInteger.isPrime(8));

        testInteger(myInteger.isPrime(myInteger.getValue()));

    }
}
