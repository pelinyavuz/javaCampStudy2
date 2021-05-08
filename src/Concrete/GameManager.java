package Concrete;

import Abstracts.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.err.println(game.getId() + " kodlu oyun basari ile eklendi");

	}

	@Override
	public void delete(Game game) {
		System.err.println(game.getId() + " kodlu oyun basari ile silindi");

	}

	@Override
	public void update(Game game) {
		System.err.println(game.getId() + " kodlu oyun basari ile güncellendi");

	}

}
