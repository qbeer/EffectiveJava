package qbeer.github.io;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        CaseInsensitiveString myString = new CaseInsensitiveString("HelloBello");
        CaseInsensitiveString anotherString = new CaseInsensitiveString("heLLObellO");

        System.out.println(myString.compareTo(anotherString) == 0);

        HashSet<BigDecimal> bigDecimalHashSet = new HashSet<>();
        bigDecimalHashSet.add(new BigDecimal("1.000"));
        bigDecimalHashSet.add(new BigDecimal("1.0"));
        bigDecimalHashSet.add(new BigDecimal("1.00"));
        System.out.println(bigDecimalHashSet); // [1.0, 1.000, 1.00]

        TreeSet<BigDecimal> bigDecimalTreeSet = new TreeSet<>();
        bigDecimalTreeSet.add(new BigDecimal("1.000"));
        bigDecimalTreeSet.add(new BigDecimal("1.0"));
        bigDecimalTreeSet.add(new BigDecimal("1.00"));
        System.out.println(bigDecimalTreeSet); // [1.000]

        PhoneNumber alex = new PhoneNumber(20, "5880655");
        PhoneNumber someone = new PhoneNumber(70, "3412314");
        PhoneNumber someoneSame = new PhoneNumber(20, "5880655");

        System.out.println(alex.compareTo(someone) == 0);
        System.out.println(alex.compareTo(someoneSame) == 0);

    }
}
