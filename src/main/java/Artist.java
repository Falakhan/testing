import java.util.List;

public class Artist {
    private String name;
    private List<Artwork> artistCollection;

    public Artist(String name, List<Artwork> artistCollection) {
        this.name = name;
        this.artistCollection = artistCollection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Artwork> getArtistCollection() {
        return artistCollection;
    }

    public void setArtistCollection(List<Artwork> artistCollection) {
        this.artistCollection = artistCollection;
    }
}
