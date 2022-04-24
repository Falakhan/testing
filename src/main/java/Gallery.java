import java.util.List;

public class Gallery {

    private String name;
    private int till;
    private List<Artwork> artCollection;

    public Gallery(String name, int till, List<Artwork> artCollection) {
        this.name = name;
        this.till = till;
        this.artCollection = artCollection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public List<Artwork> getArtCollection() {
        return artCollection;
    }

    public void setArtCollection(List<Artwork> artCollection) {
        this.artCollection = artCollection;
    }
}
