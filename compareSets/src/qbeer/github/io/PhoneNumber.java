package qbeer.github.io;

import java.util.Comparator;

public class PhoneNumber implements Comparable<PhoneNumber> {

    private final Short carrierCode;
    private final String lineNumber;

    public PhoneNumber(int carrierCode, String lineNumber) {
        if ((carrierCode == 20 || carrierCode == 30 || carrierCode == 70) && lineNumber.length() == 7) {
            this.carrierCode = (short) carrierCode;
            this.lineNumber = lineNumber;
        } else {
            throw new AssertionError();
        }
    }

    private static final Comparator<PhoneNumber> COMPARATOR =
            Comparator.comparing((PhoneNumber pn) -> pn.carrierCode)
            .thenComparing(pn -> pn.lineNumber);

    @Override
    public int compareTo(PhoneNumber phoneNumber) {
        return COMPARATOR.compare(this, phoneNumber);
    }
}
