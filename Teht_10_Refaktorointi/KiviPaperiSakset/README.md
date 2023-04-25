Tehtävä 10 - Refaktorointi (Kivi-Paperi-Sakset) (Eclipse, JUnit 5, JaCoCoverage)

Asiat, jotka osuivat ekana silmiin ja tarvitsee korjaamista:
-	Ääkköset
-	Muuttujilla ei ole näkyvyysmääreitä
-	Switch case ei sisältäny default casea
-	Pelaaja luokassa oli luotu muuttuja, jota ei edes käytetty
-	Turhia sulkuja

Refaktoroidut asiat:
-	Poistettiin kaikki ääkköset ja nimettiin kaikki missä niitä käytettiin uudelleen
-	Pelaaja luokassa 
o	Tehtiin muuttujista privaatteja
o	Poistettiin voitotYhteensä muuttuja
o	Lisättiin constructor joka alustaa voitot nollaan pelaajan luodessa
o	Lisättiin default case switchiin
o	Muokattiin setVoitot metodia lisäämään voitot muuttujaa aina yhdellä kutsuessa. Tehtiin siitä void, koska returnia ei tarvittu
o	Poistettiin turhat sulut getVoitot metodissa
-	Peli luokassa
o	Muokattiin kaikki toimivaksi pelaaja luokassa tehtyjen muutosten jälkeen
o	Tulostuksista tehtiin selkeämpiä
o	Poistettiin muuttujat p1Voitot ja p2Voitot, koska niille ei ollut tarvetta
o	pelatutPelit ja tasapelit muutettiin static muuttujiksi testejä varten