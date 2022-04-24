public class Artwork {
    private String title;
    private Artist artist;
    private int price;
    private int nft;

    public Artwork(String title, Artist artist, int price, int nft) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNft() {
        return nft;
    }

    public void setNft(int nft) {
        this.nft = nft;
    }
}
