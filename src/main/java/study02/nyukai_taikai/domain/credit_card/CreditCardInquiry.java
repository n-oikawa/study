package study02.nyukai_taikai.domain.credit_card;

public enum CreditCardInquiry {
    OK,
    EXIST_CREDIT_CARD,
    EXPIRED_CREDIT_CARD;

    public boolean isExist() {
        return this == CreditCardInquiry.EXIST_CREDIT_CARD;
    }

    public boolean isExpired() {
        return this == CreditCardInquiry.EXPIRED_CREDIT_CARD;
    }
}
