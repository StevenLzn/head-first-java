class SongV4 implements Comparable<SongV4> {
  private String title;
  private String artist;
  private int bpm;

  // Sobreescribe método que determina si dos objetos son iguales
  public boolean equals(Object aSong){
    SongV4 other = (SongV4) aSong;
    // En este caso, dos objetos con el mismo título son iguales
    // Como String sobreescribe el método equals, solo se llama y este determina si los títulos son iguales
    return title.equals(other.getTitle());
  }

  public int hashCode(){
    // Igual aquí, el método hashCode es sobreescrito por la clase String
    // El hashCode asignado a title está determinado por la lógica sobreescrita en la clase String
    return title.hashCode();
  }

  public int compareTo(SongV4 s){
    return title.compareTo(s.getTitle()); // Se reutiliza el compareTo de la clase string para comparar los títulos
  }

  SongV4(String title, String artist, int bpm){
    this.title = title;
    this.artist = artist;
    this.bpm = bpm;
  }

  public String getTitle(){
    return title;
  }

  public String getArtist(){
    return artist;
  }

  public int getBpm(){
    return bpm;
  }

  public String toString(){ // Sobreescribe el método toString de la clase Object y este se llama al imprimir la Lista
    return title;
  }
}