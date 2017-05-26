/**
 * Created by Fabian on 24.05.2017.
 */
public interface Container {
    int anzahl();
    int maxAnzahl();
    boolean istLeer();
    boolean istVoll();
    int schreiben(String element);
    String lesen();
}
