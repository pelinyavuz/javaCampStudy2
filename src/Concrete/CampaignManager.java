package Concrete;

import Abstracts.CampainService;
import Entities.Campaign;

public class CampaignManager implements CampainService {

	@Override
	public void add(Campaign campaign) {
		System.err.println(campaign.getId() + "kodlu kampanya basari ile eklendi");

	}

	@Override
	public void delete(Campaign campaign) {
		System.err.println(campaign.getId() + "kodlu kampanya basari ile silindi");

	}

	@Override
	public void update(Campaign campaign) {
		System.err.println(campaign.getId() + "kodlu kampanya basari ile güncellendi");

	}

}
