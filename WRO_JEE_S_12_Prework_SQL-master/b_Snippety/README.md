<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# SQL Prework – Snippety
> Popularne zapytania które mogą przydać się przy rozwiązywaniu zadań.

#### 1. Tworzenie bazy danych:
```
CREATE DATABASE preworkSQL CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```

#### 2. Wejście do konkretnej bazy danych lub przełączenie na inną bazę danych:
```
USE preworkSQL;
```

#### 3. Zaciągniecie dump'a do konkretnej bazy danych:
```
mysql -u root -p preworkSQL < dump.sql
```

#### 4. Najprostsze wyciągnięcie danych z konkretnej tabeli:
```
SELECT * FROM students;
```

#### 5. Usunięcie bazy danych (wraz z tabelami i wszystkimi danymi):
```
DROP DATABASE preworkSQL;
```
