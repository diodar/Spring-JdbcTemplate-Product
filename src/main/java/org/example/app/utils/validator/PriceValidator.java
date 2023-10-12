package org.example.app.utils.validator;

public class PriceValidator {

    private final static String PRICE_RGX =
            "^[0-9]+(\\.[0-9]{1,2})?$";

    public static boolean isPriceValid(String price) {
        return price.isEmpty() || !price.matches(PRICE_RGX);
    }
}
