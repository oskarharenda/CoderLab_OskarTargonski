<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Podstawy pracy z SQL

Przed przystąpieniem do rozwiązywania zadań przeczytaj poniższe wskazówki.

## Jak zacząć?

1. Stwórz [*fork*](https://guides.github.com/activities/forking/) repozytorium z zadaniami.
2. Sklonuj repozytorium na swój komputer. Użyj do tego komendy `git clone adres_repozytorium`
Adres repozytorium możesz znaleźć na stronie repozytorium po naciśnięciu w guzik "Clone or download".
3. Rozwiąż zadania i skomituj zmiany do swojego repozytorium. Użyj do tego komend `git add nazwa_pliku`.
Jeżeli chcesz dodać wszystkie zmienione pliki użyj `git add .` 
Pamiętaj że kropka na końcu jest ważna!
Następnie skommituj zmiany komendą `git commit -m "nazwa_commita"`
4. Wypchnij zmiany do swojego repozytorium na GitHubie.  Użyj do tego komendy `git push origin master`
5. Stwórz [*pull request*](https://help.github.com/articles/creating-a-pull-request) do oryginalnego repozytorium, gdy skończysz wszystkie zadania.

## Plan tego repozytorium

Zaciągnij bazę wraz z danymi z pliku `dump.sql`. Zrób to z poziomu terminala.  
Pamiętaj, że musisz być w katalogu, w którym znajduje się plik z dump'em.
Użyj polecenia `mysql -u root -p < dump.sql`.

Po pojawieniu się komunikatu
``Enter password:`` wpisz hasło, (na ekranie nie będą się pojawiać wpisywane znaki w postaci kropek ani gwiazdek). 

* a_Zadania

    * Tutaj znajdziesz zadania do poszczególnych działów prezentacji. Wrzucaj je systematycznie na Githuba.
    
    Poszczególne zadania rozwiązuj w odpowiednich plikach.
    
* b_Snippety

    * Tutaj znajdziesz kawałki kodu rozwiązujące różne problemy, mogą Ci się przydać w trakcie rozwiązywania zadań.
    
**Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.**

## Uwagi do zadań

Jeśli masz uwagi do zadań, możesz je zgłaszać mailowo na adres: 
 <a href="mailto:<a href='mailto:arkadiusz.jozwiak@coderslab.pl'>arkadiusz.jozwiak@coderslab.pl</a>">arkadiusz.jozwiak@coderslab.pl</a>,
 w temacie wpisując: **Uwagi do zadań**.
 
Aby można było szybko zlokalizować problem i się do niego odnieść, umieść w mailu następujące informacje:

- link do strony z zadaniem
- numer zadania (ewentualnie podpunkt)
- opis problemu