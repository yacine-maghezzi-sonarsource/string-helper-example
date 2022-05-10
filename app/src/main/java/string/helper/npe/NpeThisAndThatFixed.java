package string.helper.npe;

public class NpeThisAndThatFixed {
    public Object sequencingGroup;

    public int compareTo(NpeThisAndThatFixed that) {
        NpeThisAndThatFixed ths=this;
        if (that == null) {
            return -1;
        } else if (ths.sequencingGroup == null && that.sequencingGroup == null) {
            return 0;
        } else if (ths.sequencingGroup != null && that.sequencingGroup == null) {
            return -1;
        } else if (ths.sequencingGroup == null && that.sequencingGroup != null) {
            return 1;
        } else if (!ths.sequencingGroup.equals(that.sequencingGroup)) {
            return 0;
        }
        return -99;
    }
}
