package lotto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoTicket {

    public static final String LOTTO_TICKET_EXCEPTION_MESSAGE = "중복된 숫자는 허용되지 않고, 로또 번호의 개수가 6개여야 합니다.";
    private static final int LOTTO_TICKET_LENGTH = 6;

    private final List<LottoNumber> lottoNumbers;

    public LottoTicket(List<LottoNumber> lottoNumbers) {
        validateDuplicate(lottoNumbers);
        validateLength(lottoNumbers);

        this.lottoNumbers = lottoNumbers;
    }

    private void validateDuplicate(List<LottoNumber> lottoNumbers) {
        Set<LottoNumber> distinctNumbers = new HashSet<>(lottoNumbers);
        if (distinctNumbers.size() != lottoNumbers.size()) {
            throw new IllegalArgumentException(LOTTO_TICKET_EXCEPTION_MESSAGE);
        }
    }

    private void validateLength(List<LottoNumber> lottoNumbers) {
        if (lottoNumbers.size() != LOTTO_TICKET_LENGTH) {
            throw new IllegalArgumentException(LOTTO_TICKET_EXCEPTION_MESSAGE);
        }
    }

    public List<LottoNumber> getLottoNumbers() {
        return lottoNumbers;
    }
}
