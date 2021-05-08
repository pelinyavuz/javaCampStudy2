import java.util.GregorianCalendar;

import Abstracts.SalesService;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		// PlayerManager playerManager = new PlayerManager(new
		// ValidationManager());
		// playerManager.add(new Player(1, "Pelin", "Yavuz", (new
		// GregorianCalendar(1997, 1, 1)), "12312312312"));

		GameManager gameService = new GameManager();
		gameService.add(new Game(1, "TheSims3", 161.90));

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign(1, "Quarantine Campaign", 5));

		SalesService salesService = new SalesManager();
		salesService.salesGameWithCampaign(new Game(1, "TheSims3", 161.90), new Campaign(1, "Quarantine Campaign", 5),
				new Player(1, "12312312312", "Pelin", "Yavuz", (new GregorianCalendar(1997, 1, 1))));

	}

}
