package Restauracja;

import java.util.HashMap;

class EkranGrill implements Ekran{
    int miesa10_1;
    int miesa4_1;
    int miesaThicker;

    /**
     * Tworzy nowy ekran typu Grill w restauracji
     */
    EkranGrill(){
        this.miesa10_1 = 0;
        this.miesa4_1 = 0;
        this.miesaThicker = 0;
    }

    /**
     * Przycisk 10:1 - kasuje z ekranu 6 mies 10:1
     */
    @Override
    public void przycisk1() {
        if(this.miesa10_1 <= 6)
            this.miesa10_1 = 0;
        else
            this.miesa10_1 -= 6;
    }

    /**
     * Przycisk 4:1 - kasuje z ekranu 4 miesa 4:1
     */
    @Override
    public void przycisk2() {
        if(this.miesa4_1 <= 4)
            this.miesa4_1 = 0;
        else
            this.miesa4_1 -= 4;
    }

    /**
     * Przycisk Thicker - kasuje z ekranu 4 miesa Thicker
     */
    @Override
    public void przycisk3() {
        if(this.miesaThicker <= 4)
            this.miesaThicker = 0;
        else
            this.miesaThicker -= 4;
    }


    /**
     * Zwraca informacje o typie ekranu
     * @return typEkranu
     */
    @Override
    public typEkranu typEkranu() {
        return typEkranu.Grill;
    }

    /**
     * Zwraca informacje czy ekran jest aktynwy
     * @return czyAktywny
     */
    @Override
    public boolean czyAktywny(){
        return true;
    }

    /**
     * Dodaje nowe zamowienie do ekranu
     * @param _zamowienie Obiekt zamowienie
     */
    @Override
    public void dodajZamowienie(Zamowienie _zamowienie) {
    	HashMap<Produkt,Integer> lista=_zamowienie.getListaProduktowIIlosci();
    	for(Produkt p:lista.keySet()) {
    		if(p.rodzajMiesa()==Produkt.rodzajMiesa.Mieso) {
    			miesa10_1+=p.getMieso1()*lista.get(p);
    			miesa4_1+=p.getMieso2()*lista.get(p);
    			miesaThicker+=p.getMieso3()*lista.get(p);
    		}
    	}
    }

    /**
     * Wyswietla aktualna zawartosc ekranu
     * @return Zwraca zawartosc ekranu w formie stringa
     */
    @Override
    public String wypiszZawartosc() {
        return String.format("Mieso 10:1 - %d\nMieso 4:1 - %d\nMieso Thicker - %d", this.miesa10_1, this.miesa4_1, this.miesaThicker);
    }

	@Override
	public int ileZamowien() {
		// TODO Auto-generated method stub
		return 0;
	}
}
