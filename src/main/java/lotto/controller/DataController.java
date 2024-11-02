package lotto.controller;

import lotto.model.Lotto;
import lotto.model.LottoWinningNumber;
import lotto.service.DataService;

import java.util.List;

public class DataController {
    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    public LottoWinningNumber createWinningNumber(List<Integer> winningNumbers, int bonusNumber) {
        return dataService.createWinningNumber(winningNumbers, bonusNumber);
    }

    public List<Lotto> createLottos(int tickets) {
        return dataService.createLottos(tickets);
    }

}