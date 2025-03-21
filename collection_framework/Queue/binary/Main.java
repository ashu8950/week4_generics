package collection_framework.Queue.binary;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int N = 5;

        BinaryGenerator generator = new BinaryGenerator();
        List<String> binaryNumbers = generator.generateBinaryNumbers(N);

        System.out.println("First " + N + " Binary Numbers: " + binaryNumbers);
    }
}

