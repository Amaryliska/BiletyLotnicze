-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Czas generowania: 16 Kwi 2016, 20:32
-- Wersja serwera: 5.6.24
-- Wersja PHP: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Baza danych: `loty`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `adresy`
--

CREATE TABLE IF NOT EXISTS `adresy` (
  `ADR_ID` int(11) NOT NULL,
  `ADR_UZT_ID` int(11) NOT NULL,
  `ADR_ULICA` varchar(45) NOT NULL,
  `ADR_NR_DOMU` int(11) NOT NULL,
  `ADR_NR_MIESZKANIA` int(11) DEFAULT NULL,
  `ADR_MIASTO` varchar(45) NOT NULL,
  `ADR_KRAJ` varchar(2) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `adresy`
--

INSERT INTO `adresy` (`ADR_ID`, `ADR_UZT_ID`, `ADR_ULICA`, `ADR_NR_DOMU`, `ADR_NR_MIESZKANIA`, `ADR_MIASTO`, `ADR_KRAJ`) VALUES
(1, 1, 'Artyleryjska', 121, NULL, 'Częstochowa', 'PL'),
(2, 2, 'Marcelińska', 63, NULL, 'Poznań', 'PL'),
(3, 3, 'Aleksandrowska', 99, 5, 'Łódź', 'PL'),
(4, 4, 'Medical Center Drive', 4547, NULL, 'Venice', 'IT'),
(5, 5, 'Via Capo le Case', 28, NULL, 'Vols am Schlern', 'IT');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `dokumenty`
--

CREATE TABLE IF NOT EXISTS `dokumenty` (
  `DKM_ID` int(11) NOT NULL,
  `DKM_UZT_ID` int(11) NOT NULL,
  `DKM_TYP` enum('D','P') NOT NULL,
  `DKM_NUMER` varchar(9) DEFAULT NULL,
  `DKM_DATA_WAZNOSCI` date DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `dokumenty`
--

INSERT INTO `dokumenty` (`DKM_ID`, `DKM_UZT_ID`, `DKM_TYP`, `DKM_NUMER`, `DKM_DATA_WAZNOSCI`) VALUES
(1, 1, 'D', 'D1F4', '2016-04-18'),
(2, 1, 'P', 'P1E3', '2016-04-18'),
(3, 2, 'D', 'D2F5', '2016-04-18'),
(4, 3, 'P', 'P2E2', '2016-04-16'),
(5, 4, 'P', 'P3E8', '2016-03-04'),
(7, 5, 'D', 'D8F12', '2015-11-21');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `historia_platnosci`
--

CREATE TABLE IF NOT EXISTS `historia_platnosci` (
  `HST_ID` int(10) unsigned NOT NULL,
  `HST_UZT_ID` int(11) NOT NULL,
  `HST_ZKP_ID` int(11) NOT NULL,
  `HST_KWOTA` float(7,2) NOT NULL,
  `HST_DATA` datetime NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `historia_platnosci`
--

INSERT INTO `historia_platnosci` (`HST_ID`, `HST_UZT_ID`, `HST_ZKP_ID`, `HST_KWOTA`, `HST_DATA`) VALUES
(1, 1, 1, 2207.00, '2016-04-14 10:00:00'),
(2, 2, 2, 560.00, '2016-04-15 09:00:00'),
(3, 3, 3, 234.00, '2016-04-15 17:00:00'),
(4, 4, 4, 1234.00, '2016-04-16 00:00:00'),
(5, 5, 5, 1537.00, '2015-10-30 00:00:00');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `kontakty`
--

CREATE TABLE IF NOT EXISTS `kontakty` (
  `KNT_ID` int(11) NOT NULL,
  `KNT_UZT_ID` int(11) NOT NULL,
  `KNT_EMAIL` varchar(45) NOT NULL,
  `KNT_TELEFON` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `kontakty`
--

INSERT INTO `kontakty` (`KNT_ID`, `KNT_UZT_ID`, `KNT_EMAIL`, `KNT_TELEFON`) VALUES
(1, 1, 'jannowak@gmail.com', '796742711'),
(2, 2, 'olabak@gmail.com', '668305313'),
(3, 3, 'dawidr@gmail.com', '793256946'),
(4, 4, 'nowakg@yahoo.com', '795256948'),
(5, 5, 'ryba.kamila@gmail.com', '784747739');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `lotnisko`
--

CREATE TABLE IF NOT EXISTS `lotnisko` (
  `LTN_ID` int(11) NOT NULL,
  `LTN_KRAJ` varchar(2) NOT NULL,
  `LTN_MIASTO` varchar(45) NOT NULL,
  `LTN_NAZWA` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `lotnisko`
--

INSERT INTO `lotnisko` (`LTN_ID`, `LTN_KRAJ`, `LTN_MIASTO`, `LTN_NAZWA`) VALUES
(1, 'US', 'New York', 'Buckmaster Heliport'),
(2, 'PL', 'Kraków', 'Andrews Municipal Airport'),
(3, 'IT', 'Rome', 'Diamond Seven Ranch Airport'),
(4, 'GR', 'Rodos', 'Cherry Creek Townhouse Heliport'),
(5, 'PL', 'Warszawa', 'Cut and Shoot Airport');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `loty`
--

CREATE TABLE IF NOT EXISTS `loty` (
  `LOT_ID` int(11) NOT NULL,
  `LOT_ODLOT_PRZYLOT` enum('O','P') NOT NULL,
  `LOT_CENA_KLASA_EKONOMICZNA` float DEFAULT NULL,
  `LOT_CENA_KLASA_EKONOMICZNA_PREMIUM` float DEFAULT NULL,
  `LOT_CENA_KLASA_BIZNES` float DEFAULT NULL,
  `LOT_CENA_KLASA_PIERWSZA` float DEFAULT NULL,
  `LOT_DATA_ODLOTU` datetime NOT NULL,
  `LOT_DATA_PRZYLOTU` datetime NOT NULL,
  `LOT_LOTNISKO_ID` int(11) NOT NULL,
  `LOT_SAMOLOT_ID` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `loty`
--

INSERT INTO `loty` (`LOT_ID`, `LOT_ODLOT_PRZYLOT`, `LOT_CENA_KLASA_EKONOMICZNA`, `LOT_CENA_KLASA_EKONOMICZNA_PREMIUM`, `LOT_CENA_KLASA_BIZNES`, `LOT_CENA_KLASA_PIERWSZA`, `LOT_DATA_ODLOTU`, `LOT_DATA_PRZYLOTU`, `LOT_LOTNISKO_ID`, `LOT_SAMOLOT_ID`) VALUES
(1, 'O', 234, 328, NULL, NULL, '2016-04-16 11:00:00', '2016-04-16 13:00:00', 1, 1),
(2, 'P', 560, NULL, NULL, 2207, '2016-04-17 08:00:00', '2016-04-17 10:00:00', 4, 5),
(3, 'O', 407, 580, 990, 1234, '2016-04-20 07:00:00', '2016-04-20 10:00:00', 3, 2),
(4, 'P', NULL, NULL, 1537, 2287, '2015-12-30 00:00:00', '2015-12-30 03:00:00', 4, 4),
(5, 'O', 608, 875, 2346, 2975, '2016-05-16 01:20:00', '2016-05-16 03:30:00', 2, 3);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `potwierdzenia_pdf`
--

CREATE TABLE IF NOT EXISTS `potwierdzenia_pdf` (
  `PTW_ID` int(11) NOT NULL,
  `PTW_UZT_ID` int(11) NOT NULL,
  `PTW_PDF` varchar(2048) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `potwierdzenia_pdf`
--

INSERT INTO `potwierdzenia_pdf` (`PTW_ID`, `PTW_UZT_ID`, `PTW_PDF`) VALUES
(1, 1, 'nazwa.pdf'),
(2, 2, 'nazwa.pdf'),
(3, 3, 'nazwa.pdf'),
(4, 4, 'nazwa.pdf'),
(5, 5, 'nazwa.pdf');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `rezerwacje`
--

CREATE TABLE IF NOT EXISTS `rezerwacje` (
  `RZR_ID` int(11) NOT NULL,
  `RZR_UZT_ID` int(11) NOT NULL,
  `RZR_LOT_ID` int(11) NOT NULL,
  `RZR_DATA` datetime NOT NULL,
  `RZR_RZAD_MIEJSCE` varchar(1024) NOT NULL,
  `RZR_KLASA` enum('E','EP','B','P') NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `rezerwacje`
--

INSERT INTO `rezerwacje` (`RZR_ID`, `RZR_UZT_ID`, `RZR_LOT_ID`, `RZR_DATA`, `RZR_RZAD_MIEJSCE`, `RZR_KLASA`) VALUES
(1, 1, 2, '2016-04-14 09:14:19', '2', 'P'),
(2, 2, 2, '2016-04-15 08:18:00', '5', 'E'),
(3, 3, 1, '2016-04-15 17:00:00', '6', 'E'),
(4, 4, 3, '2016-04-16 00:00:00', '20', 'P'),
(5, 5, 4, '2015-10-30 00:00:00', '35', 'B');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `samoloty`
--

CREATE TABLE IF NOT EXISTS `samoloty` (
  `SML_ID` int(11) NOT NULL,
  `SML_LINIE_LOTNICZE` varchar(45) NOT NULL,
  `SML_ILOSC_RZEDOW` int(11) NOT NULL,
  `SML_ILOSC_MIEJSC_W_RZEDZIE` int(11) NOT NULL,
  `SML_KLASA_EKONOMICZNA` tinyint(1) NOT NULL,
  `SML_KLASA_EKONOMICZNA_PREMIUM` tinyint(1) NOT NULL,
  `SML_KLASA_BIZNES` tinyint(1) NOT NULL,
  `SML_KLASA_PIERWSZA` tinyint(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `samoloty`
--

INSERT INTO `samoloty` (`SML_ID`, `SML_LINIE_LOTNICZE`, `SML_ILOSC_RZEDOW`, `SML_ILOSC_MIEJSC_W_RZEDZIE`, `SML_KLASA_EKONOMICZNA`, `SML_KLASA_EKONOMICZNA_PREMIUM`, `SML_KLASA_BIZNES`, `SML_KLASA_PIERWSZA`) VALUES
(1, 'Wizz Air', 30, 15, 1, 1, 0, 0),
(2, 'Ryanair', 50, 20, 1, 1, 1, 1),
(3, 'Lot', 50, 25, 1, 1, 1, 1),
(4, 'Lufthansa', 40, 30, 0, 0, 1, 1),
(5, 'Alitalia', 30, 30, 1, 0, 0, 1);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `uzytkownicy`
--

CREATE TABLE IF NOT EXISTS `uzytkownicy` (
  `UZT_ID` int(11) NOT NULL,
  `UZT_IMIE` varchar(45) NOT NULL,
  `UZT_NAZWISKO` varchar(45) NOT NULL,
  `UZT_PLEC` enum('K','M') NOT NULL,
  `UZT_PESEL` bigint(11) NOT NULL,
  `UZT_CZY_ADM` tinyint(1) NOT NULL,
  `UZT_CZY_BLOKADA` tinyint(1) NOT NULL,
  `UZT_HASLO` varchar(45) NOT NULL,
  `UZT_CZY_ZMIANA_HASLA` tinyint(1) NOT NULL,
  `UZT_SALDO` float(7,2) DEFAULT '5000.00',
  `UZT_DATA` datetime NOT NULL COMMENT 'Data i godzina dodania użytkownika.'
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `uzytkownicy`
--

INSERT INTO `uzytkownicy` (`UZT_ID`, `UZT_IMIE`, `UZT_NAZWISKO`, `UZT_PLEC`, `UZT_PESEL`, `UZT_CZY_ADM`, `UZT_CZY_BLOKADA`, `UZT_HASLO`, `UZT_CZY_ZMIANA_HASLA`, `UZT_SALDO`, `UZT_DATA`) VALUES
(1, 'Jan', 'Kowalski', 'M', 19042308416, 0, 0, 'HNIhydtpvWQhz6H3', 0, 5000.00, '2016-04-16 10:00:00'),
(2, 'Ola', 'Bąk', 'K', 92042318924, 0, 0, 'nnqmX1jJ6RoFjzTN', 0, 5000.00, '2016-04-16 13:11:00'),
(3, 'Dawid', 'Ręka', 'M', 81040809138, 0, 0, '0', 0, 5000.00, '2016-04-14 03:00:00'),
(4, 'Grzegorz', 'Nowak', 'M', 79080809412, 0, 0, 'ozkirlaWC0NoiaJp', 0, 5000.00, '2016-03-01 16:21:00'),
(5, 'Kamila', 'Ryba', 'K', 95032402922, 0, 0, 'DpZu47EZRvG2ZxD4', 0, 5000.00, '2015-11-18 15:03:02');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `wiadomosci`
--

CREATE TABLE IF NOT EXISTS `wiadomosci` (
  `WDM_ID` int(11) NOT NULL,
  `WDM_UZT_ID_ODBIOCY` int(11) NOT NULL,
  `WDM_UZT_ID_NADAWCY` int(11) NOT NULL,
  `WDM_TEMAT` varchar(45) NOT NULL,
  `WDM_TRESC` varchar(2048) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `WDM_DATA` datetime NOT NULL,
  `WDM_TYP` enum('0','1','2','3','4','5') NOT NULL COMMENT '0 - wiadomość tworzona przed administratora\n1 - nowa rezerwacja/wykupienie lotu\n2 - anulowanie rezerwacji/wykupienia lotu\n3 - wygenerowanie nowego potwierdzenia PDF\n4 - anunlacja lotu\n5 - edycja lotu'
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `wiadomosci`
--

INSERT INTO `wiadomosci` (`WDM_ID`, `WDM_UZT_ID_ODBIOCY`, `WDM_UZT_ID_NADAWCY`, `WDM_TEMAT`, `WDM_TRESC`, `WDM_DATA`, `WDM_TYP`) VALUES
(1, 1, 2, 'Lorem', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent tristique, ligula in pulvinar rhoncus, ipsum ex auctor dui, ut hendrerit elit dolor eget mauris. Maecenas cursus vestibulum ipsum eu dictum. Suspendisse potenti. Sed eleifend auctor mollis. Nullam et lectus feugiat, faucibus ante in, facilisis nisi. Nulla quis faucibus purus. Aliquam laoreet nisi eget fermentum dictum. Nulla diam quam, ornare nec elit vel, sodales consequat leo. Suspendisse ac scelerisque eros. Cras urna sapien, tempor sed pulvinar ut, convallis a diam.', '2016-04-16 00:00:00', '0'),
(2, 2, 5, 'Lorem', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent tristique, ligula in pulvinar rhoncus, ipsum ex auctor dui, ut hendrerit elit dolor eget mauris. Maecenas cursus vestibulum ipsum eu dictum. Suspendisse potenti. Sed eleifend auctor mollis. Nullam et lectus feugiat, faucibus ante in, facilisis nisi. Nulla quis faucibus purus. Aliquam laoreet nisi eget fermentum dictum. Nulla diam quam, ornare nec elit vel, sodales consequat leo. Suspendisse ac scelerisque eros. Cras urna sapien, tempor sed pulvinar ut, convallis a diam.', '2016-04-16 00:00:00', '1'),
(3, 4, 3, 'Lorem', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent tristique, ligula in pulvinar rhoncus, ipsum ex auctor dui, ut hendrerit elit dolor eget mauris. Maecenas cursus vestibulum ipsum eu dictum. Suspendisse potenti. Sed eleifend auctor mollis. Nullam et lectus feugiat, faucibus ante in, facilisis nisi. Nulla quis faucibus purus. Aliquam laoreet nisi eget fermentum dictum. Nulla diam quam, ornare nec elit vel, sodales consequat leo. Suspendisse ac scelerisque eros. Cras urna sapien, tempor sed pulvinar ut, convallis a diam.', '2016-04-15 00:00:00', '2'),
(4, 2, 3, 'Lorem', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent tristique, ligula in pulvinar rhoncus, ipsum ex auctor dui, ut hendrerit elit dolor eget mauris. Maecenas cursus vestibulum ipsum eu dictum. Suspendisse potenti. Sed eleifend auctor mollis. Nullam et lectus feugiat, faucibus ante in, facilisis nisi. Nulla quis faucibus purus. Aliquam laoreet nisi eget fermentum dictum. Nulla diam quam, ornare nec elit vel, sodales consequat leo. Suspendisse ac scelerisque eros. Cras urna sapien, tempor sed pulvinar ut, convallis a diam.', '2016-04-12 00:00:00', '3'),
(5, 2, 4, 'Lorem', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent tristique, ligula in pulvinar rhoncus, ipsum ex auctor dui, ut hendrerit elit dolor eget mauris. Maecenas cursus vestibulum ipsum eu dictum. Suspendisse potenti. Sed eleifend auctor mollis. Nullam et lectus feugiat, faucibus ante in, facilisis nisi. Nulla quis faucibus purus. Aliquam laoreet nisi eget fermentum dictum. Nulla diam quam, ornare nec elit vel, sodales consequat leo. Suspendisse ac scelerisque eros. Cras urna sapien, tempor sed pulvinar ut, convallis a diam.', '2016-04-27 00:00:00', '4'),
(6, 5, 1, 'Lorem', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent tristique, ligula in pulvinar rhoncus, ipsum ex auctor dui, ut hendrerit elit dolor eget mauris. Maecenas cursus vestibulum ipsum eu dictum. Suspendisse potenti. Sed eleifend auctor mollis. Nullam et lectus feugiat, faucibus ante in, facilisis nisi. Nulla quis faucibus purus. Aliquam laoreet nisi eget fermentum dictum. Nulla diam quam, ornare nec elit vel, sodales consequat leo. Suspendisse ac scelerisque eros. Cras urna sapien, tempor sed pulvinar ut, convallis a diam.', '2016-04-28 00:00:00', '5');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `zakupy`
--

CREATE TABLE IF NOT EXISTS `zakupy` (
  `ZKP_ID` int(11) NOT NULL,
  `ZKP_UZT_ID` int(11) NOT NULL,
  `ZKP_LOT_ID` int(11) NOT NULL,
  `ZKP_DATA` datetime NOT NULL,
  `ZKP_RZAD_MIEJSCE` varchar(1024) NOT NULL,
  `ZKP_KLASA` enum('E','EP','B','P') NOT NULL,
  `ZKP_KWOTA` float(7,2) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `zakupy`
--

INSERT INTO `zakupy` (`ZKP_ID`, `ZKP_UZT_ID`, `ZKP_LOT_ID`, `ZKP_DATA`, `ZKP_RZAD_MIEJSCE`, `ZKP_KLASA`, `ZKP_KWOTA`) VALUES
(1, 1, 2, '2016-04-14 10:00:00', '2', 'P', 2207.00),
(2, 2, 2, '2016-04-15 09:00:00', '5', 'E', 560.00),
(3, 3, 1, '2016-04-15 17:00:00', '6', 'E', 234.00),
(4, 4, 3, '2016-04-16 00:00:00', '20', 'P', 1234.00),
(5, 5, 4, '2015-10-30 00:00:00', '35', 'B', 1537.00);

--
-- Indeksy dla zrzutów tabel
--

--
-- Indexes for table `adresy`
--
ALTER TABLE `adresy`
  ADD PRIMARY KEY (`ADR_ID`), ADD UNIQUE KEY `ADR_ID_UNIQUE` (`ADR_ID`), ADD KEY `fk_ADRESY_UZYTKOWNICY1_idx` (`ADR_UZT_ID`);

--
-- Indexes for table `dokumenty`
--
ALTER TABLE `dokumenty`
  ADD PRIMARY KEY (`DKM_ID`), ADD UNIQUE KEY `DKM_ID_UNIQUE` (`DKM_ID`), ADD UNIQUE KEY `DKM_NUMER_UNIQUE` (`DKM_NUMER`), ADD KEY `fk_DOKUMENTY_UZYTKOWNICY_idx` (`DKM_UZT_ID`);

--
-- Indexes for table `historia_platnosci`
--
ALTER TABLE `historia_platnosci`
  ADD PRIMARY KEY (`HST_ID`), ADD KEY `fk_HISTORIA_PLATNOSCI_UZYTKOWNICY1_idx` (`HST_UZT_ID`), ADD KEY `fk_HISTORIA_PLATNOSCI_ZAKUPY1_idx` (`HST_ZKP_ID`);

--
-- Indexes for table `kontakty`
--
ALTER TABLE `kontakty`
  ADD PRIMARY KEY (`KNT_ID`), ADD UNIQUE KEY `KNT_ID_UNIQUE` (`KNT_ID`), ADD KEY `fk_KONTAKTY_UZYTKOWNICY1_idx` (`KNT_UZT_ID`);

--
-- Indexes for table `lotnisko`
--
ALTER TABLE `lotnisko`
  ADD PRIMARY KEY (`LTN_ID`), ADD UNIQUE KEY `LTN_ID_UNIQUE` (`LTN_ID`);

--
-- Indexes for table `loty`
--
ALTER TABLE `loty`
  ADD PRIMARY KEY (`LOT_ID`), ADD KEY `fk_LOTY_LOTNISKO1_idx` (`LOT_LOTNISKO_ID`), ADD KEY `fk_LOTY_SAMOLOTY1_idx` (`LOT_SAMOLOT_ID`);

--
-- Indexes for table `potwierdzenia_pdf`
--
ALTER TABLE `potwierdzenia_pdf`
  ADD PRIMARY KEY (`PTW_ID`), ADD KEY `fk_POTWIERDZENIA_PDF_UZYTKOWNICY1_idx` (`PTW_UZT_ID`);

--
-- Indexes for table `rezerwacje`
--
ALTER TABLE `rezerwacje`
  ADD PRIMARY KEY (`RZR_ID`), ADD KEY `fk_REZERWACJE_UZYTKOWNICY1_idx` (`RZR_UZT_ID`), ADD KEY `fk_REZERWACJE_LOTY1_idx` (`RZR_LOT_ID`);

--
-- Indexes for table `samoloty`
--
ALTER TABLE `samoloty`
  ADD PRIMARY KEY (`SML_ID`), ADD UNIQUE KEY `SML_ID_UNIQUE` (`SML_ID`);

--
-- Indexes for table `uzytkownicy`
--
ALTER TABLE `uzytkownicy`
  ADD PRIMARY KEY (`UZT_ID`);

--
-- Indexes for table `wiadomosci`
--
ALTER TABLE `wiadomosci`
  ADD PRIMARY KEY (`WDM_ID`), ADD KEY `fk_WIADOMOSCI_UZYTKOWNICY1_idx` (`WDM_UZT_ID_ODBIOCY`), ADD KEY `fk_WIADOMOSCI_UZYTKOWNICY2_idx` (`WDM_UZT_ID_NADAWCY`);

--
-- Indexes for table `zakupy`
--
ALTER TABLE `zakupy`
  ADD PRIMARY KEY (`ZKP_ID`), ADD KEY `fk_ZAKUPY_UZYTKOWNICY1_idx` (`ZKP_UZT_ID`), ADD KEY `fk_ZAKUPY_LOTY1_idx` (`ZKP_LOT_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT dla tabeli `adresy`
--
ALTER TABLE `adresy`
  MODIFY `ADR_ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT dla tabeli `dokumenty`
--
ALTER TABLE `dokumenty`
  MODIFY `DKM_ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT dla tabeli `historia_platnosci`
--
ALTER TABLE `historia_platnosci`
  MODIFY `HST_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT dla tabeli `kontakty`
--
ALTER TABLE `kontakty`
  MODIFY `KNT_ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT dla tabeli `lotnisko`
--
ALTER TABLE `lotnisko`
  MODIFY `LTN_ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT dla tabeli `loty`
--
ALTER TABLE `loty`
  MODIFY `LOT_ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT dla tabeli `potwierdzenia_pdf`
--
ALTER TABLE `potwierdzenia_pdf`
  MODIFY `PTW_ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT dla tabeli `rezerwacje`
--
ALTER TABLE `rezerwacje`
  MODIFY `RZR_ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT dla tabeli `samoloty`
--
ALTER TABLE `samoloty`
  MODIFY `SML_ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT dla tabeli `uzytkownicy`
--
ALTER TABLE `uzytkownicy`
  MODIFY `UZT_ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT dla tabeli `wiadomosci`
--
ALTER TABLE `wiadomosci`
  MODIFY `WDM_ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT dla tabeli `zakupy`
--
ALTER TABLE `zakupy`
  MODIFY `ZKP_ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- Ograniczenia dla zrzutów tabel
--

--
-- Ograniczenia dla tabeli `adresy`
--
ALTER TABLE `adresy`
ADD CONSTRAINT `fk_ADRESY_UZYTKOWNICY1` FOREIGN KEY (`ADR_UZT_ID`) REFERENCES `uzytkownicy` (`UZT_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ograniczenia dla tabeli `dokumenty`
--
ALTER TABLE `dokumenty`
ADD CONSTRAINT `fk_DOKUMENTY_UZYTKOWNICY` FOREIGN KEY (`DKM_UZT_ID`) REFERENCES `uzytkownicy` (`UZT_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ograniczenia dla tabeli `historia_platnosci`
--
ALTER TABLE `historia_platnosci`
ADD CONSTRAINT `fk_HISTORIA_PLATNOSCI_UZYTKOWNICY1` FOREIGN KEY (`HST_UZT_ID`) REFERENCES `uzytkownicy` (`UZT_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_HISTORIA_PLATNOSCI_ZAKUPY1` FOREIGN KEY (`HST_ZKP_ID`) REFERENCES `zakupy` (`ZKP_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ograniczenia dla tabeli `kontakty`
--
ALTER TABLE `kontakty`
ADD CONSTRAINT `fk_KONTAKTY_UZYTKOWNICY1` FOREIGN KEY (`KNT_UZT_ID`) REFERENCES `uzytkownicy` (`UZT_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ograniczenia dla tabeli `loty`
--
ALTER TABLE `loty`
ADD CONSTRAINT `fk_LOTY_LOTNISKO1` FOREIGN KEY (`LOT_LOTNISKO_ID`) REFERENCES `lotnisko` (`LTN_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_LOTY_SAMOLOTY1` FOREIGN KEY (`LOT_SAMOLOT_ID`) REFERENCES `samoloty` (`SML_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ograniczenia dla tabeli `potwierdzenia_pdf`
--
ALTER TABLE `potwierdzenia_pdf`
ADD CONSTRAINT `fk_POTWIERDZENIA_PDF_UZYTKOWNICY1` FOREIGN KEY (`PTW_UZT_ID`) REFERENCES `uzytkownicy` (`UZT_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ograniczenia dla tabeli `rezerwacje`
--
ALTER TABLE `rezerwacje`
ADD CONSTRAINT `fk_REZERWACJE_LOTY1` FOREIGN KEY (`RZR_LOT_ID`) REFERENCES `loty` (`LOT_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_REZERWACJE_UZYTKOWNICY1` FOREIGN KEY (`RZR_UZT_ID`) REFERENCES `uzytkownicy` (`UZT_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ograniczenia dla tabeli `wiadomosci`
--
ALTER TABLE `wiadomosci`
ADD CONSTRAINT `fk_WIADOMOSCI_UZYTKOWNICY1` FOREIGN KEY (`WDM_UZT_ID_ODBIOCY`) REFERENCES `uzytkownicy` (`UZT_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_WIADOMOSCI_UZYTKOWNICY2` FOREIGN KEY (`WDM_UZT_ID_NADAWCY`) REFERENCES `uzytkownicy` (`UZT_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ograniczenia dla tabeli `zakupy`
--
ALTER TABLE `zakupy`
ADD CONSTRAINT `fk_ZAKUPY_LOTY1` FOREIGN KEY (`ZKP_LOT_ID`) REFERENCES `loty` (`LOT_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_ZAKUPY_UZYTKOWNICY1` FOREIGN KEY (`ZKP_UZT_ID`) REFERENCES `uzytkownicy` (`UZT_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
