package study02.nyukai_taikai.domain.individual;

public enum ExistIndividualInquiry {
    EXIST,
    NOT_EXIST;

    public boolean isExist() {
        return this == ExistIndividualInquiry.EXIST;
    }
}
