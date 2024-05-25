package phone;

public class ChinesePhoneNumberValidator implements PhoneNumberValidator {


    @Override
    public void validate(String phone) {
        if(phone.length() != 8) {
            throw new RuntimeException("Chinese number is not valid, it must contains 8 digits");
        }
    }
}
