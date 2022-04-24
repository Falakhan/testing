import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TransactionManagerTest {

    @Test
    void checkTillAndWalletAfterPurchase() {
        //Given
        Customer customer = new Customer("David", 100, null);
        Artist artist = new Artist("Banksy", null);
        Artwork artwork = new Artwork("The Holy Moly!", artist, 20, 10);

        ArrayList<Artwork> galleryCollection = new ArrayList<>(Arrays.asList(artwork));
        Gallery gallery = new Gallery("La Galleria", 1000, galleryCollection);

        TransactionManager transactionManager = new TransactionManager();

        //When

        transactionManager.purchase(customer, gallery, artwork);

        //Then

        int expectedWallet = 80;
        int expectedTill = 1020;

        assertEquals(expectedWallet, customer.getWallet());
        assertEquals(expectedTill, gallery.getTill());

    }


}