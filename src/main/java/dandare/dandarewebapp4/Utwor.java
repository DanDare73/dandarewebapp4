package dandare.dandarewebapp4;

import java.util.ArrayList;
import java.util.List;

public class Utwor {

    private Integer id;
    private String nazwaWykonawcy;
    private String tytulUtworu;
    private String linkDoVideo;
    private static List<Utwor> listaUtworow = new ArrayList<Utwor>();

    //konstruktor
    public Utwor(String nazwaWykonawcy, String tytulUtworu, String linkDoVideo) {
        this.nazwaWykonawcy = nazwaWykonawcy;
        this.tytulUtworu = tytulUtworu;
        this.linkDoVideo = linkDoVideo;
        dodajUtwor(this);
    }

    //metody
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazwaWykonawcy() {
        return nazwaWykonawcy;
    }

    public void setNazwaWykonawcy() {
        this.nazwaWykonawcy = nazwaWykonawcy;
    }

    public String getTytulUtworu() {
        return tytulUtworu;
    }

    public void setTytulUtworu() {
        this.tytulUtworu = tytulUtworu;
    }

    public String getLinkDoVideo() {
        return linkDoVideo;
    }

    public void setLinkDoVideo() {
        this.linkDoVideo = linkDoVideo;
    }

    public static void dodajUtwor(Utwor utwor) {
        listaUtworow.add(utwor);
    }

    public static void usunUtwor(Utwor utwor) {
        listaUtworow.remove(utwor);
    }

    public static String listaUtworowToString() {
        String lista = "";
        for (Utwor u : listaUtworow) {
            lista += "  <tr>\n";
            lista += "    <td>" + u.nazwaWykonawcy + "</td>\n";
            lista += "    <td>" + u.tytulUtworu + "</td>\n";
            lista += "    <td><a href=\"" + u.linkDoVideo + "\">" + u.linkDoVideo + "</a></td>\n";
            lista += "  </tr>\n";
        }
        return lista;
    }
}
