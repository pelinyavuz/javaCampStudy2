package Concrete;

import Abstracts.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService {

	@Override
	public void add(Player player) {
		System.err.println(player.getId() + "kodlu oyuncu basari ile eklendi");

	}

	@Override
	public void delete(Player player) {
		System.err.println(player.getId() + "kodlu oyuncu basari ile silindi");

	}

	@Override
	public void update(Player player) {
		System.err.println(player.getId() + "kodlu oyuncu basari ile güncellendi");

	}

}
