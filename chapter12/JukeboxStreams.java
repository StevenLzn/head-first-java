import java.util.List;
import java.util.stream.Collectors;

class JukeboxStreams {
  public static void main(String[] args){
    List<Song> songs = new Songs().getSongs();

    List<Song> rockSongs = songs.stream()
                                .filter(song -> song.getGenre().contains("Rock"))
                                .collect(Collectors.toList());
    System.out.println("------- rockSongs -------");
    System.out.println(rockSongs);

    List<Song> beatlesSongs = songs.stream()
                                .filter(song -> song.getArtist().equals("The Beatles"))
                                .collect(Collectors.toList());
    System.out.println("------- beatlesSongs -------");
    System.out.println(beatlesSongs);

    List<Song> startWihtHSongs = songs.stream()
                                .filter(song -> song.getTitle().startsWith("H"))
                                .collect(Collectors.toList());
    System.out.println("------- startWihtHSongs -------");
    System.out.println(startWihtHSongs);

    List<Song> recentThan1995Songs = songs.stream()
                                .filter(song -> song.getYear() > 1995)
                                .collect(Collectors.toList());
    System.out.println("------- recentThan1995Songs -------");
    System.out.println(recentThan1995Songs);

    List<String> genres = songs.stream()
                                .map(song -> song.getGenre())
                                .distinct()
                                .collect(Collectors.toList());
    System.out.println("------- genres -------");
    System.out.println(genres);

    String songTitle = "With a Little Help from My Friends";
    List<String> result = songs.stream()
                                .filter(song -> song.getTitle().equals(songTitle))
                                .map(song -> song.getArtist())
                                .filter(artist -> !artist.equals("The Beatles"))
                                .collect(Collectors.toList());
    System.out.println("------- query result -------");
    System.out.println(result);
  }
}