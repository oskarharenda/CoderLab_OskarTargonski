<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Relacje jeden do jednego – zadania

Wszystkie zapytania do bazy wykonuj w **konsoli** lub z wykorzystaniem **IntelliJ**.  
Dodatkowo zapisz treść zapytań do plików ``java``, przygotowanych do każdego zadania.  
 
> **Część zadań ma w poleceniu utworzenie relacji między tabelami – w takiej sytuacji należy zmodyfikować strukturę tabel**
> **i dodać nowe kolumny lub nowe tabele**

### Zadania rozwiązywane z wykładowcą:

#### Zadanie 1

W bazie danych o nazwie ```products_ex``` stwórz następującą tabelę:
```SQL
* client_address:
  * client_id: int
  * city: string
  * street: string
  * house_nr: string
```

Tabela ```client_address``` ma być połączona relacją jeden do jednego z tabelą ```clients```.  
Napisz 5 zapytań SQL, które wprowadzą adresy dla istniejących już użytkowników.

Zapytania SQL zapisz w przygotowanym pliku `Main1.java`.

-----------------------------------------------------------------------------

### Zadania rozwiązywane samodzielnie:

#### Zadanie 2 – import bazy danych

Jeżeli nie masz bazy danych `cinemas_ex` albo jest ona niekompletna, to usuń ją i stwórz nową bazę danych o nazwie ```cinemas_ex```.  
Następnie zaimportuj do niej dane z pliku **cinema.sql**.
Są to gotowe tabele wypełnione danymi.

#### Zadanie 3

Zapytania wykonuj w bazie `cinemas_ex`.  

Tabela `payments` z tabelą `tickets` ma być powiązana relacją jeden do jednego.  
Relacja między biletem a płatnością jest następująca:  

> płatność musi być przypisana do biletu **(dodaj klucz obcy do tabeli `payments`)**

Uzupełnij tabelę `payments` kilkoma wpisami. Przyjmujemy trzy typy płatności: `cash`, `transfer` i `card`.

Zapytania SQL zapisz w przygotowanym pliku `Main3.java`.