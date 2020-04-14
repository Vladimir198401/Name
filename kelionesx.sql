-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 09, 2020 at 08:01 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kelionesx`
--

-- --------------------------------------------------------

--
-- Table structure for table `keliones`
--

CREATE TABLE `keliones` (
  `id` int(10) UNSIGNED NOT NULL,
  `pav` varchar(255) COLLATE utf8_lithuanian_ci NOT NULL,
  `apras` text COLLATE utf8_lithuanian_ci NOT NULL,
  `flag_poilsines` tinyint(3) NOT NULL,
  `flag_pazintines` tinyint(3) NOT NULL,
  `flag_viskas_isk` tinyint(3) NOT NULL,
  `kaina` decimal(12,2) UNSIGNED NOT NULL,
  `trukme_val` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_lithuanian_ci;

--
-- Dumping data for table `keliones`
--

INSERT INTO `keliones` (`id`, `pav`, `apras`, `flag_poilsines`, `flag_pazintines`, `flag_viskas_isk`, `kaina`, `trukme_val`) VALUES
(1, 'po LDK pilis ir pilaites', 'visos LDK pilys Baltarusijoje', 1, 1, 1, '150.00', 20),
(3, 'Ventės ragas', 'paukščių žiedavimas ir kt. ', 0, 0, 0, '60.00', 12),
(14, 'umuyk', 'tukk', 1, 1, 1, '1000.00', 199);

-- --------------------------------------------------------

--
-- Table structure for table `keliones_miestai`
--

CREATE TABLE `keliones_miestai` (
  `id` int(10) UNSIGNED NOT NULL,
  `miestai_id` int(10) UNSIGNED NOT NULL,
  `keliones_id` int(10) UNSIGNED NOT NULL,
  `trukme_val` int(10) UNSIGNED NOT NULL DEFAULT 3
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_lithuanian_ci;

--
-- Dumping data for table `keliones_miestai`
--

INSERT INTO `keliones_miestai` (`id`, `miestai_id`, `keliones_id`, `trukme_val`) VALUES
(2, 2, 1, 3),
(3, 3, 1, 2),
(4, 4, 1, 4),
(5, 3, 1, 4);

-- --------------------------------------------------------

--
-- Table structure for table `miestai`
--

CREATE TABLE `miestai` (
  `id` int(10) UNSIGNED NOT NULL,
  `pav` varchar(64) COLLATE utf8_lithuanian_ci NOT NULL,
  `kodas_salies` char(3) COLLATE utf8_lithuanian_ci NOT NULL,
  `apras` varchar(255) COLLATE utf8_lithuanian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_lithuanian_ci;

--
-- Dumping data for table `miestai`
--

INSERT INTO `miestai` (`id`, `pav`, `kodas_salies`, `apras`) VALUES
(1, 'Lyda', 'LT', 'kazkas'),
(2, 'Gardinas', '', ''),
(3, 'Nesvyžius', '', ''),
(4, 'Naugardukas', '', ''),
(5, 'Myras', 'LT', 'lialialia'),
(6, 'Rusnė', '', ''),
(10, 'Kaunas', 'LT', 'murrr'),
(11, 'Kaunas', 'LT', 'murrrrrrrr'),
(12, 'Kaunas', 'LT', 'labukas'),
(13, 'Vilnius', 'LT', 'sostine');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `keliones`
--
ALTER TABLE `keliones`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `keliones_miestai`
--
ALTER TABLE `keliones_miestai`
  ADD PRIMARY KEY (`id`),
  ADD KEY `keliones_id` (`keliones_id`),
  ADD KEY `miestai_id` (`miestai_id`);

--
-- Indexes for table `miestai`
--
ALTER TABLE `miestai`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `keliones`
--
ALTER TABLE `keliones`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `keliones_miestai`
--
ALTER TABLE `keliones_miestai`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `miestai`
--
ALTER TABLE `miestai`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `keliones_miestai`
--
ALTER TABLE `keliones_miestai`
  ADD CONSTRAINT `keliones_miestai_ibfk_1` FOREIGN KEY (`keliones_id`) REFERENCES `keliones` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `keliones_miestai_ibfk_2` FOREIGN KEY (`miestai_id`) REFERENCES `miestai` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
