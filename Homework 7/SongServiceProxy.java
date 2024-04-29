import java.util.Map;
import java.util.HashMap;
import java.util.List;

class SongServiceProxy implements SongService {
    private SongService songService;
    private Map<Integer, Song> songCache;

    public SongServiceProxy(SongService songService) {
        this.songService = songService;
        this.songCache = new HashMap<>();
    }

    @Override
    public Song searchById(Integer songID) {
        // Check if song metadata exists in the cache
        if (songCache.containsKey(songID)) {
            System.out.println("Retrieving song metadata from cache for song ID: " + songID);
            return songCache.get(songID);
        }

        // Fetch song metadata from the real server
        System.out.println("Fetching song metadata from server for song ID: " + songID);
        Song song = songService.searchById(songID);

        // Cache the fetched song metadata
        songCache.put(songID, song);
        return song;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        // Not implemented in the proxy
        return songService.searchByTitle(title);
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        // Not implemented in the proxy
        return songService.searchByAlbum(album);
    }
}