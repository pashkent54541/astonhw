package phone;

import phone.PhoneNumberValidator;

public enum PhoneCode {
    RUSSIAN("+7"),
    UKRAINIAN("+380"),
    BELORUSSIAN("+375"),
    CHINESE("+86");


    private String phoneCode;

    PhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

}
