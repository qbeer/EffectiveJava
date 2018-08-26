package qbeer.github.io;

public class MobileNumber {

    private final short carrierCode;
    private final int uniqueNumber;
    private final int MAX_VAL = 9999999;

    public MobileNumber(int carrierCode, int uniqueNumber) {
        this.carrierCode = checkCarrierCode(carrierCode);
        this.uniqueNumber = checkUniqueNumber(uniqueNumber);
    }

    private short checkCarrierCode(int carrierCode) {
        if (carrierCode == 20 || carrierCode == 30 || carrierCode == 70) {
            return (short) carrierCode;
        }
        throw new IllegalArgumentException(carrierCode + "illegal carrier code provided");
    }

    private int checkUniqueNumber(int uniqueNumber) {
        if (uniqueNumber < MAX_VAL) {
            return uniqueNumber;
        }
        throw new IllegalArgumentException(uniqueNumber + "illegal line number");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof MobileNumber))
            return false;
        MobileNumber mn = (MobileNumber) obj;
        return mn.uniqueNumber == uniqueNumber && mn.carrierCode == carrierCode;
    }

    @Override
    public int hashCode() {
        int result = Short.hashCode(carrierCode);
        result = 42 * result + Integer.hashCode(uniqueNumber);
        return result;
    }

    @Override
    public String toString() {
        return "+36-" + carrierCode + "-" + uniqueNumber;
    }
}
