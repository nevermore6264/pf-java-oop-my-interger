public class MyInteger {
    private int value;

    public MyInteger() {
        this.value = 0;
    }

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public boolean isPrime() {
        if (value < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(value);
        for (int i = 2; i <= squareRoot; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    //nếu giá trị truyền vào cho value là số chẵn, lẻ hoặc là số nguyên tố.
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    //nếu giá trị truyền vào cho value là số chẵn, lẻ hoặc là số nguyên tố.
    public boolean isOdd(int number) {
        return !isEven();
    }

    //nếu giá trị truyền vào cho value là số chẵn, lẻ hoặc là số nguyên tố.
    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(number);
        for (int i = 2; i <= squareRoot; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //nếu giá trị truyền vào cho value là số chẵn, lẻ hoặc là số nguyên tố.
    public boolean isEven(MyInteger number) {
        return number.value % 2 == 0;
    }

    //nếu giá trị truyền vào cho value là số chẵn, lẻ hoặc là số nguyên tố.
    public boolean isOdd(MyInteger number) {
        return !isEven();
    }

    //nếu giá trị truyền vào cho value là số chẵn, lẻ hoặc là số nguyên tố.
    public boolean isPrime(MyInteger number) {
        if (number.value < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(number.value);
        for (int i = 2; i <= squareRoot; i++) {
            if (number.value % i == 0) {
                return false;
            }
        }
        return true;
    }


    //nếu value của đối tượng này bằng value được truyền vào
    public boolean equals(int number) {
        return this.value == number;
    }

    //nếu value của đối tượng này bằng value được truyền vào.
    public boolean equals(MyInteger number) {
        return this.value == number.value;
    }

    //để chuyển một mảng ký tự sang các giá trị số nguyên
    public static int parseInt(char[] listChar) {
        int resultNumber = 0;
        for (int i = 0; i < listChar.length; i++) {
            int number = Integer.parseInt(String.valueOf(listChar[i]));
            resultNumber += number;
        }
        return resultNumber;
    }

    //để chuyển một chuỗi sang giá trị số nguyên
    public static int parseInt(String string) {
        int numberSwap = Integer.parseInt(string);
        return numberSwap;
    }
}
