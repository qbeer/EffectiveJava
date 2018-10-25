package qbeer.github.io;

public class CaseInsensitiveString implements Comparable<CaseInsensitiveString> {

    private String s;

    public CaseInsensitiveString(String s) {
        this.s = s;
    }

    @Override
    public int compareTo(CaseInsensitiveString caseInsensitiveString) {
        return String.CASE_INSENSITIVE_ORDER.compare(caseInsensitiveString.getS(), this.s);
    }

    public String getS() {
        return this.s;
    }

    public void setS(String s) {
        this.s = s;
    }

}
