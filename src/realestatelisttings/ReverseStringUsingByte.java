package realestatelisttings;

public class ReverseStringUsingByte {
    private static String reverseString(String string) {
        byte[] strBytes = string.getBytes();
        byte[] resultString = new byte[strBytes.length];
        for (int i = 0; i < strBytes.length; i++) {
            resultString[i] = strBytes[strBytes.length - 1 - i];
        }
        return new String(resultString);
    }

    public static void main(String... args) {
        System.out.println(reverseString("austine"));
    }
}
