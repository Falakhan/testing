import java.util.ArrayList;
import java.util.List;

public class TransactionManager {

    public void purchase(Customer customer,Gallery gallery, Artwork artwork){
        int price = artwork.getPrice();

        customer.setWallet(customer.getWallet() - price);
        gallery.setTill(gallery.getTill() + price);

        if(customer.getArtworkList() == null){
            List<Artwork> newCustomerList = new ArrayList<>();
            newCustomerList.add(artwork);
            customer.setArtworkList(newCustomerList);

        }else{
            List<Artwork> newCustomerList = customer.getArtworkList();
            newCustomerList.add(artwork);
            customer.setArtworkList(newCustomerList);
        }


        List<Artwork> newGalleryList = gallery.getArtCollection();
        newGalleryList.remove(artwork);
        gallery.setArtCollection(newGalleryList);

    }

}
