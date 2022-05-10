package string.helper.npe;

public class NpeTestCaseAsserts {
    private Object getNull() {
        return null;
    }

    public void testAsserts1() {
        Object o1 = getNull();
        NpeHelper.assertNotNull(o1);
        //no NPE possible, Bug found
        o1.hashCode();
        Object o2 = null;
        NpeHelper.assertNotNull(o2);
        o2.hashCode();
    }

    public void testAsserts2() {
        Object o1 = getNull();
        NpeHelper.assertTrue(o1 != null && o1.toString().isEmpty());
        //no NPE possible, Bug found
        o1.hashCode();
        Object o2 = null;
        NpeHelper.assertTrue(o2 != null && o2.toString().isEmpty());
        //no NPE possible, no Bug found
        o2.hashCode();
    }

    public void testAsserts3() {
        Object o1 = getNull();
        if (o1 == null) {
            throw new IllegalStateException();
        }
        o1.hashCode();
        Object o2 = null;
        NpeHelper.assertTrue(o2 != null && o2.toString().isEmpty());
        o2.hashCode();
    }
}
