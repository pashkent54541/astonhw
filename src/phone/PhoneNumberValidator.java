package phone;

public interface PhoneNumberValidator {

    void validate(String phone);

    static PhoneNumberValidator byDigitsCount(int requiredDigits) {
        return new SimpleCountDigitsPhoneNumberValidator(requiredDigits);
    }

    static PhoneNumberValidator byPhoneCode(PhoneCode phoneCode) {
        switch (phoneCode) {
            case RUSSIAN:
                return new RussianPhoneNumberValidator();
            case UKRAINIAN:
                return new UkranianPhoneNumberValidator();
            case BELORUSSIAN:
                return new BelorussianPhoneNumberValidator();
            case CHINESE:
                return new ChinesePhoneNumberValidator();
            default:
                throw new IllegalArgumentException("No validator exists for phone code " + phoneCode.name());
        }
    }
}
