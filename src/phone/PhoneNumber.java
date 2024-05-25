package phone;

import java.util.Objects;

public class PhoneNumber {

    private final long phoneNumber;
    private final PhoneCode phoneCode;

    private PhoneNumber(long phoneNumber, PhoneCode phoneCode) {
        if(Objects.isNull(phoneCode)) {
            throw new IllegalArgumentException("Phone code must not be null");
        }
        this.phoneNumber = phoneNumber;
        this.phoneCode = phoneCode;
        PhoneNumberValidator.byPhoneCode(phoneCode).validate(Objects.toString(phoneNumber));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhoneNumber number = (PhoneNumber) o;

        if (phoneNumber != number.phoneNumber) return false;
        return phoneCode == number.phoneCode;
    }

    @Override
    public int hashCode() {
        int result = (int) (phoneNumber ^ (phoneNumber >>> 32));
        result = 31 * result + phoneCode.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneNumber=" + phoneNumber +
                ", phoneCode=" + phoneCode +
                '}';
    }

    public static PhoneNumber of(long phoneNumber, PhoneCode phoneCode) {
        return new PhoneNumber(phoneNumber,phoneCode);
    }
}


