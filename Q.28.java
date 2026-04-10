class TextProcessingBuilder {
    public static void main(String[] args) {

        // Create StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // Append additional text
        sb.append(" World");

        // Display modified string
        System.out.println("Modified String: " + sb);
    }
}

/*
Comparison: StringBuilder vs StringBuffer

- StringBuilder is NOT thread-safe, but faster.
- StringBuffer is thread-safe (synchronized), but slower.
- Use StringBuilder in single-threaded applications.
- Use StringBuffer in multi-threaded applications.
*/