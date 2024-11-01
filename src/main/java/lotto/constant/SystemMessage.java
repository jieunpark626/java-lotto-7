package lotto.constant;

public enum SystemMessage {
    Input_Price("구입금액을 입력해 주세요."),
    Purchased_Count("%d개를 구매했습니다."),
    Input_WinningNumbers("당첨 번호를 입력해 주세요."),
    Input_BonusNumber("보너스 번호를 입력해 주세요."),
    Display_LottoNumbers("[%d, %d, %d %d %d %d]");

    private final String message;

    //생성자
    SystemMessage(String message) {
        this.message = message;
    }


    public String getMessage() {
        return message;
    }
}
