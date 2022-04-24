import java.util.List;

public class Customer {
    private String name;
    private int wallet;
    private List<Artwork> artworkList;

    public Customer(String name, int wallet, List<Artwork> artworkList) {
        this.name = name;
        this.wallet = wallet;
        this.artworkList = artworkList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public List<Artwork> getArtworkList() {
        return artworkList;
    }

    public void setArtworkList(List<Artwork> artworkList) {
        this.artworkList = artworkList;
    }
}
