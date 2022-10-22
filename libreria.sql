-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 22, 2022 at 08:50 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `libreria`
--

-- --------------------------------------------------------

--
-- Table structure for table `libro`
--

CREATE TABLE `libro` (
  `id` int(11) NOT NULL,
  `titolo` varchar(255) NOT NULL,
  `genere` varchar(255) NOT NULL,
  `annopublicazione` int(4) NOT NULL,
  `immagini` varchar(255) NOT NULL,
  `isbn` varchar(255) NOT NULL,
  `prezzo` double(5,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `libro`
--

INSERT INTO `libro` (`id`, `titolo`, `genere`, `annopublicazione`, `immagini`, `isbn`, `prezzo`) VALUES
(1, 'il lupo che ride', 'comico', 2003, 'nullo', '123456789', 20.43),
(2, 'IL FUTURO DOPO 3 GUERRA MONDIALE', 'GUERRA', 1994, 'nullo', '1234567890', 13.33),
(3, 'cosa si mangia ', 'comico', 1999, 'nullo', '1234567890', 16.33),
(4, 'la coppia piu bella', 'romantico', 2000, 'nullo', '1234567890', 15.33),
(5, 'i futuri sposi', 'romantico', 2010, 'nullo', '1234567890', 19.33),
(6, 'IL FUTURO DOPO 7 giorni', 'comico', 1820, 'nullo', '1234567890', 10.33);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `libro`
--
ALTER TABLE `libro`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `libro`
--
ALTER TABLE `libro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
