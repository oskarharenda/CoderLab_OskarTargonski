<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Tworzenie bazy danych i tabel – zadania

Wszystkie zapytania do bazy wykonuj w **konsoli** lub z wykorzystaniem **IntelliJ**.  
Pamiętaj, aby zapisać treść zapytań do plików ``java``, przygotowanych do każdego zadania.  

### Zadania rozwiązywane z wykładowcą:


#### Zadanie 1

1. Utwórz bazę o nazwie ```products_ex```, pamiętaj o prawidłowym kodowaniu.
2. Zapisz zapytanie w zmiennej `query` w pliku `Main1.java`.

#### Zadanie 2

W bazie danych o nazwie ```products_ex``` stwórz następujące tabele:
```SQL
* products:
  * id: int
  * name: String
  * description: String
  * price: decimal (2 decimal places)

* orders:
  * id:int
  * description: String

* clients:
  * id: int
  * name: String
  * surname: String
```

Zapytania SQL zapisz w przygotowanym pliku `Main2.java`.  

**Pamiętaj aby użyć odpowiednich typów danych dla każdej kolumny w bazie.**

-----------------------------------------------------------------------------

### Zadania rozwiązywane samodzielnie:

#### Zadanie 3

1. Stwórz nową bazę danych o nazwie ```cinemas_ex```. Pamiętaj, że zapytanie się nie uda, jeżeli baza już istnieje.
2. W pliku `Main3.java` zapisz treść zapytania.


#### Zadanie 4

w bazie danych o nazwie ```cinemas_ex``` stwórz następujące tabele (jeżeli tabela już istnieje, to nie da się jej stworzyć – SQL zwróci błąd):
```SQL
* cinemas:
  * id: int
  * name: String
  * address: String

* movies:
  * id: int
  * title: String
  * description: String
  * rating: decimal (2 decimal places)

* tickets:
  * id: int
  * quantity: int
  * price: decimal (2 decimal places)
  * status: int (1 - opłacony, 0 - nie opłacony)

* payments:
  * id: int
  * type: String (Zakładamy, że są trzy typy płatności: `cash`, `transfer` lub `card`).
  * payment_date: date
```

Zapytania SQL zapisz w przygotowanym pliku `Main4.java`.  

Pamiętaj o:  
* zakładaniu odpowiednich atrybutów na pola (np. każde **id** powinno być kluczem głównym, automatycznie numerowanym),  
* używaniu **odpowiednich typów danych** dla każdej kolumny w bazie,
* dokładnym czytaniu **kodów błędów** zwracanych przez MySQL.  
