package string.helper.npe;

public class NpeThisAndThat {
    public Object sequencingGroup;

    public int compareTo(NpeThisAndThat that) {
        if (that == null) {
            return -1;
        } else if (sequencingGroup == null && that.sequencingGroup == null) {
            return 0;
        } else if (sequencingGroup != null && that.sequencingGroup == null) {
            return -1;
        } else if (sequencingGroup == null && that.sequencingGroup != null) {
            return 1;
        } else if (!sequencingGroup.equals(that.sequencingGroup)) {
            return 0;
        }
        return -99;
    }
}
