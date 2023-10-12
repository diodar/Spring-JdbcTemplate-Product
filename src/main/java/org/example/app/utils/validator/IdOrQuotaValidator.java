package org.example.app.utils.validator;

public class IdOrQuotaValidator {

    private final static String ID_QUOTA_RGX = "[0-9]+";

    public static boolean isIdOrQuotaValid(String idQuota) {
        return idQuota.isEmpty() || !idQuota.matches(ID_QUOTA_RGX);
    }
}
