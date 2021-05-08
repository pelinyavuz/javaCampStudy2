package Concrete;

import Abstracts.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SalesManager implements SalesService {

	@Override
	public void salesGame(Player player, Game game) {
		System.out.println(player.getId() + " kodlu kullanıcı " + game.getAmount() + " tutarında " + game.getId()
				+ " kodlu oyununu satış");

	}

	@Override
	public void salesGameWithCampaign(Game game, Campaign campaign, Player player) {
		double amountWithDiscount = game.getAmount() - (game.getAmount() * (campaign.getDiscountRate() / 100));

		System.out.println(game.getId() + " kodlu oyun " + player.getId() + " kodlu kullanici tarafindan "
				+ amountWithDiscount + " fiyatına alindi");

	}

}