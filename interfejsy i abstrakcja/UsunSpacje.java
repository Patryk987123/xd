class UsunSpacje extends OperacjaNaTekscie {
    public String oryginalny;
    @Override
    public String wykonaj(String tekst) {
        oryginalny=tekst;
        return tekst.replace(" ", "");
    }

    @Override
    public String cofnij(String tekst) {
        return oryginalny;
    }

    @Override
    public String nazwaOperacji() {
        return "Usun spacje";
    }
}