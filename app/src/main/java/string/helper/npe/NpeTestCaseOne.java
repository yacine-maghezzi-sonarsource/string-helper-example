package string.helper.npe;

/*
 * False positive: NPE
 */

public class NpeTestCaseOne {

    private boolean isNull(Object o) {
        return o == null;
    }

    private Object getNull() {
        return null;
    }

    public void test() {
        Object o = null;
        //valid NPE, Bug found
        if (isNull(o)) {
            o.hashCode();
        }
        //valid NPE, Bug found
        if (!isNull(o)) {
            o.hashCode();
        }
        //valid NPE, Bug found
        getNull().hashCode(); 

        //valid NPE, no Bug found
        if (NpeHelper.isNull(o)) {
            o.hashCode(); 
        }
        //no NPE possible, no Bug found
        if (!NpeHelper.isNull(o)) {
            o.hashCode();
        }
        //valid NPE, no Bug found
        NpeHelper.getNull().hashCode(); 
    }
}
