package camunda;

import java.io.Serializable;

public class BigObject implements Serializable {
    private String bigBigBigValue = "I am too big to fail! ".repeat(1000);

    public String getBigBigBigValue() {
        return bigBigBigValue;
    }

    public void setBigBigBigValue(String bigBigBigValue) {
        this.bigBigBigValue = bigBigBigValue;
    }
}
