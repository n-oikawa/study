package study02.nyukai_taikai.service;

public enum CheckResult {
    OK,
    EXIST_CREDIT_CARD,
    EXPIRED_CREDIT_CARD,
    NOT_TWENTY_YEARS_OLD;

    public boolean isOK() {
        return this == CheckResult.OK;
    }
}
