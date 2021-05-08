package Abstracts;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface SalesService {

	void salesGame(Player player, Game game);

	void salesGameWithCampaign(Game game,  Campaign campaign,Player player);
}
