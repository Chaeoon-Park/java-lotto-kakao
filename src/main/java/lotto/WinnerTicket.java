package lotto;

public class WinnerTicket {
    private final LottoNumbers winnerNumbers;
    private final LottoNumber bonusNumber;

    public WinnerTicket(LottoNumbers winnerNumbers, LottoNumber bonusNumber) {
        this.winnerNumbers = winnerNumbers;
        this.bonusNumber = bonusNumber;
    }

    public LottoNumbers getWinnerNumbers() {
        return winnerNumbers;
    }

    public LottoNumber getBonusNumber() {
        return bonusNumber;
    }
}