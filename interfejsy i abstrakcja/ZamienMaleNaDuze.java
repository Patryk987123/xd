public class ZamienMaleNaDuze extends OperacjaNaTekscie {
    public String oryginalny;
    @Override
    public String wykonaj(String tekst) {
        return tekst.toUpperCase();
    }

    @Override
    public String cofnij(String tekst) {
        return oryginalny;
    }

    @Override
    public String nazwaOperacji() {
        return "Zamien male na duze";
    }
}