package string.helper.npe;

public class NpeHelper {
    private NpeHelper() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isNull(Object o) {
        return o == null;
    }

    public static Object getNull() {
        return null;
    }

    public static void assertNotNull(Object object) {
        if (object == null) {
            throw new IllegalStateException();
        }
    }
    
    public static boolean assertTrue(boolean expression) {
        if (!expression) {
            throw new IllegalStateException();
        }
        return expression;
    }
}
