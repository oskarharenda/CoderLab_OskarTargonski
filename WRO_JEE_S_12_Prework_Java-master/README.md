<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">


# Podstawy programowania w Java
> Kilka ważnych informacji

Przed przystąpieniem do rozwiązywania zadań przeczytaj poniższe wskazówki.

## Jak zacząć?

1. Stwórz [*fork*](https://guides.github.com/activities/forking/) repozytorium z zadaniami.
2. Sklonuj repozytorium na swój komputer. Użyj do tego komendy `git clone adres_repozytorium`.

Adres repozytorium możesz znaleźć na stronie repozytorium po naciśnięciu w guzik "Clone or download".
3. Zaimportuj projekt jako projekt `Maven`, wg poniższych wskazówek:

	* W `IntelliJ` wybieramy: `File –> New –> Project from Existing Sources...`
	* Wskazujemy lokalizację katalogu ze sklonowanym projektem i zatwierdzamy.
	* Następnie w nowym oknie wybieramy: `Import project from external model` i wskazujemy `Maven`
	* Wybieramy kolejno opcje: `Next –> Next –> Next –> Finish`

4. Rozwiąż zadania i zakomituj zmiany do swojego repozytorium. Użyj do tego komend `git add nazwa_pliku`.
Jeżeli chcesz dodać wszystkie zmienione pliki użyj `git add .` 
Pamiętaj że kropka na końcu jest ważna!
Następnie zakomituj zmiany komendą `git commit -m "nazwa_commita"`
5. Wypchnij zmiany do swojego repozytorium na GitHubie.  Użyj do tego komendy `git push origin master`
6. Stwórz [*pull request*](https://help.github.com/articles/creating-a-pull-request) do oryginalnego repozytorium, gdy skończysz wszystkie zadania.
## Plan tego repozytorium

* src/main/java/pl/coderslab/apierwszyprogram
* src/main/java/pl/coderslab/bzmienneioperatory
* src/main/java/pl/coderslab/ckontrolaprzeplywu
* src/main/java/pl/coderslab/dtablice
* src/main/java/pl/coderslab/eparametrystartowe

    * Tutaj znajdziesz zadania do zajęć. Wrzucaj je systematycznie na Githuba.


* src/main/java/pl/coderslab/snippets
    * Tutaj znajdziesz kawałki kodu rozwiązujące różne problemy, mogą Ci się przydać w trakcie rozwiązywania zadań.

    
Poszczególne zadania rozwiązuj w odpowiednich plikach.

Testy do zadań weryfikują na wyświetlanych w metodach komunikatach. Unikaj dodatkowych wywołań, np. :
````java
System.out.println("some message");
````

**Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.**

## Uwagi do zadań

Jeśli masz uwagi do zadań, możesz je zgłaszać mailowo na adres: 
 <a href="mailto:<a href='mailto:arkadiusz.jozwiak@coderslab.pl'>arkadiusz.jozwiak@coderslab.pl</a>">arkadiusz.jozwiak@coderslab.pl</a>,
 w temacie wpisując: **Uwagi do zadań**.
 
Aby można było szybko zlokalizować problem i się do niego odnieść, umieść w mailu następujące informacje:

- link do strony z zadaniem
- numer zadania (ewentualnie podpunkt)
- opis problemu