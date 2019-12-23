-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: דצמבר 23, 2019 בזמן 01:23 AM
-- גרסת שרת: 8.0.13-4
-- PHP Version: 7.2.24-0ubuntu0.18.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Bc2JdnNE0Y`
--

-- --------------------------------------------------------

--
-- מבנה טבלה עבור טבלה `items`
--

CREATE TABLE `items` (
  `item_Id` int(10) UNSIGNED NOT NULL,
  `item_type` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `item_price` float NOT NULL,
  `updated` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- הוצאת מידע עבור טבלה `items`
--

INSERT INTO `items` (`item_Id`, `item_type`, `item_price`, `updated`) VALUES
(1, 'Aconitum', 10, 0),
(2, 'African Daisy', 20, 0),
(3, 'Agapanthus.', 15, 0),
(4, 'Alchemilla.', 23, 0),
(5, 'Allium roseum.', 9, 0),
(6, 'Alyssum.', 25, 0);

--
-- Indexes for dumped tables
--

--
-- אינדקסים לטבלה `items`
--
ALTER TABLE `items`
  ADD PRIMARY KEY (`item_Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `items`
--
ALTER TABLE `items`
  MODIFY `item_Id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
