package Restauracja;

class KasaFiskalna implements Kasy{
    int nrKasy;
    int zalogowanyPracownik;
    Zamowienie obslugiwane_zamowienie;


    KasaFiskalna (int nrKasy){
        this.nrKasy = nrKasy;
    }

    void zalogujPracownika (int zalogowanyPracownik){
        if(obslugiwane_zamowienie == null) this.zalogowanyPracownik = zalogowanyPracownik;
    }
    /**
     * Funkcja rozpoaczynajaca tworzenie nowego zamowienia
     */
    @Override
    public void rozpocznijZamowienie() {
        obslugiwane_zamowienie = new Zamowienie();
    }

    /**
     * Funckja dodajaca do aktualnie otwartego zamowienia produkt
     * @param x idProduktu dodawanego do zamowienia
     * @param y ilosc produktów
     */
    @Override
    public void dodajProdukt(int x, int y) {
        obslugiwane_zamowienie.dodajProdukt(x,y);
    }

    /**
     * Fukcja zamykajaca zamowienie i zwracająca je
     * @return obiekt zamowienie
     */
    @Override
    public Zamowienie zamknijZamowienie() {
        obslugiwane_zamowienie.oplacZamowienie();
        return obslugiwane_zamowienie;
    }

    /**
     * Funkcja zmieniajaca status zamowienia na oplacone
     */
    public void oplacZamowienie() {

    }

    /**
     * Funckja zwracajaca informacje o wszystkich dostepnych produktach
     * @return string zawierajacy pelna liste produktow i ich ceny
     */
    public String wyswietlProdukty(){
        return "";
    }

    /**
     * Funkcja zwracająca informacje o aktualnym zamowieniu
     * @return informacje o aktualnym zamowieniu
     */
    public String wyswietlZamowienie(){
        return obslugiwane_zamowienie.wyswietl();
    }
}