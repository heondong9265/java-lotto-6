package lotto;

import lotto.Service.GameService;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        GameService gameService = new GameService();
        gameService.setGame();
    }
}
