-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 12, 2023 lúc 07:25 PM
-- Phiên bản máy phục vụ: 10.4.27-MariaDB
-- Phiên bản PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlbh`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `products`
--

CREATE TABLE `products` (
  `ID` varchar(8) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Number` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `products`
--

INSERT INTO `products` (`ID`, `Name`, `Number`) VALUES
('sp01', 'Quat ban', '100'),
('sp02', 'Ao so mi', '1000'),
('sp04', 'Áo cộc tay', '450'),
('sp05', 'Áo khoác', '450'),
('sp06', 'Áo dài', '150'),
('sp07', 'Áo sơ mi', '1500'),
('sp08', 'Áo trẻ em', '150'),
('sp11', 'Áo dài tay', '150'),
('sp12', 'Áo sơ mi', '150'),
('sp14', 'Áo ấm mùa đông', '20000'),
('sp16', 'Áo ấm', '20000'),
('sp17', 'Áo ấm', '20000'),
('sp18', 'Áo ấm', '20000'),
('sp19', 'Áo ấm', '20000');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `id` varchar(11) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`id`, `username`, `password`) VALUES
('3', 'user2', '123'),
('4', 'user3', '123'),
('5', 'user4', '123'),
('1', 'admin', 'admin'),
('2', 'user1', '123'),
('7', 'PhamHong', '123'),
('ql01', '02003004', '112345678'),
('100', 'admin5', '123456');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
