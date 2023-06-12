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
-- Cơ sở dữ liệu: `qlsv`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sinhvien`
--

CREATE TABLE `sinhvien` (
  `Ma` varchar(10) NOT NULL,
  `HoTen` varchar(50) NOT NULL,
  `NamSinh` int(11) NOT NULL,
  `QueQuan` varchar(60) NOT NULL,
  `DiaChi` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `sinhvien`
--

INSERT INTO `sinhvien` (`Ma`, `HoTen`, `NamSinh`, `QueQuan`, `DiaChi`) VALUES
('SV01', 'Pham Thi Ngoc Lan', 2004, 'Thai Binh', 'Huyen Vu Thu'),
('SV02', 'Bui Ba B', 2012, 'Bac Giang', 'Bac Giang'),
('SV03', 'Can Chung C', 2013, 'Can Tho', 'Can Tho'),
('Sv04', 'Do Doanh D', 2014, 'Dak Lak', 'Dak Lak'),
('SV05', 'Pham Phu P', 2015, 'Nam Dinh', 'Nam Dinh'),
('SV08', 'Pham Thi Ngoc Lan', 2016, 'Binh Duong', 'Thu Dau Mot');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
