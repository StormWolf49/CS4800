
import java.util.List;

class DummySongService implements SongService {
    @Override
    public Song searchById(Integer songID) {
        // Simulate fetching song metadata from a real server
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        return new Song("Song" + songID, "Artist" + songID, "Album" + songID, 180);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        // Not implemented
        return null;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        // Not implemented
        return null;
    }
}