package lotto;

public enum ErrorCode {
    PRICE_POSITIVE_INTEGER("금액은 자연수여야 합니다.",601),
    PRICE_DIVIDABLE_BY_UNIT("금액은 1000원 단위로만 가능합니다.", 602),
    WIN_NUMBER_PROPER("당첨 번호는 올바른 형식이여야 합니다.(6개의 1-45 사이의 자연수를 겹치지 않게 , 기준으로 입력)", 603),
    BONUS_NUMBER_IN_RANGE("보너스 번호는 1부터 45 사이에 하나의 숫자여야 합니다.", 604),
    LOTTO_NUMBER_COUNT("로또 번호는 6개여야 합니다.", 701),
    LOTTO_NUMBER_DUPLICATE("로또 번호는 겹치지 않아야 합니다.", 702)
    ;

    private final String errorMessage;
    private final Integer code;
    private static final String ERROR = "[ERROR]";

    ErrorCode(String errorMessage, Integer code){
        this.errorMessage = errorMessage;
        this.code = code;
    }

    public String getErrorMessage() {
        return ERROR + " " + errorMessage;
    }
}