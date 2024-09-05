import java.util.*;

public class Jukebox4 {
  public static void main(String[] args){
    new Jukebox4().go();
  }

  public void go(){
    List<SongV3> songList = MockSongs.getSongsV3();
    System.out.println(songList);
    Collections.sort(songList); // En este caso usa el compareTo() de cada elemento. El compareTo() se sobreescribe cuando se implementa la interfaz Comparable en la clase del elemento
    System.out.println(songList);

    // Ordenamiento usando un "Comparator"
    // El "Comparator" sirve cuando se necesitan varios ordenamientos. Se pueden crear varias clases "Comparator" cada una con su lógica de comparación(por nombre, titulo, precio, fecha, etc)
    // Las clases comparator se pueden instanciar y pasar como parámetro al método sort() de la lista.
    ArtistCompare artistCompare = new ArtistCompare();
    songList.sort(artistCompare); // sort recibe el objeto que implementa la interfaz "Comparator", este se encargará de comparar para ordenar la lista
    System.out.println(songList);
  }
}

// Clase comparadora que implementa la interfaz Comparator
// Esta clase define el método compare, para comparar dos objetos por las propiedades que se necesiten
class ArtistCompare implements Comparator<SongV3>{
  public int compare(SongV3 one, SongV3 two){
    return one.getArtist().compareTo(two.getArtist());
  }
}