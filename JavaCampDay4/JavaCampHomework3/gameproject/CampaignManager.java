
package gameproject;

public class CampaignManager implements CampaignService{

    @Override
    public void add(Campaign campaign) {
        System.out.println("----------");
        System.out.println("Yeni kampanya eklendi: "+campaign.getName());
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Kampanya silindi: "+campaign.getName());
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Kampanya güncellendi: "+campaign.getName());
    }
    
}
