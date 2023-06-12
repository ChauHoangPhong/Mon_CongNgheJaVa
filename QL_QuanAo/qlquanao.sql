-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 12, 2023 lúc 07:30 PM
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
-- Cơ sở dữ liệu: `qlquanao`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `quanao`
--

CREATE TABLE `quanao` (
  `Ma` varchar(10) NOT NULL,
  `Loai` varchar(50) NOT NULL,
  `kthuoc` float NOT NULL,
  `chatlieu` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `quanao`
--

INSERT INTO `quanao` (`Ma`, `Loai`, `kthuoc`, `chatlieu`) VALUES
('QA01', 'Au', 56.8, 'Tui'),
('QA02', 'Vai', 24.3, 'thung'),
('QA03', 'Vai', 24.3, 'thung'),
('QA05', 'Vai', 24.3, 'thung'),
('QA06', 'Vai', 24.3, 'thung');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `quanao`
--
ALTER TABLE `quanao`
  ADD PRIMARY KEY (`Ma`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
