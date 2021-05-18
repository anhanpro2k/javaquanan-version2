-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 18, 2021 at 08:52 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanan`
--

-- --------------------------------------------------------

--
-- Table structure for table `app`
--

CREATE TABLE `app` (
  `maApp` int(11) NOT NULL,
  `tenApp` varchar(30) NOT NULL,
  `phiHoaHong` int(11) NOT NULL,
  `TrangThai` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `app`
--

INSERT INTO `app` (`maApp`, `tenApp`, `phiHoaHong`, `TrangThai`) VALUES
(1, 'Tại Quán', 0, 1),
(2, 'Grab', 30, 1),
(3, 'GoViet', 20, 1),
(4, 'Baemin', 20, 1),
(5, 'Lixifood', 15, 1),
(7, 'Test', 12, 0);

-- --------------------------------------------------------

--
-- Table structure for table `chitiethoadon`
--

CREATE TABLE `chitiethoadon` (
  `MaHD` int(11) NOT NULL,
  `MaMon` int(11) NOT NULL,
  `DonGia` bigint(20) NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `ThanhTien` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `chitiethoadon`
--

INSERT INTO `chitiethoadon` (`MaHD`, `MaMon`, `DonGia`, `SoLuong`, `ThanhTien`) VALUES
(45, 1, 59000, 1, 59000),
(46, 1, 59000, 1, 59000),
(47, 1, 59000, 1, 59000),
(48, 1, 59000, 1, 59000),
(49, 1, 59000, 1, 59000),
(50, 1, 59000, 1, 59000),
(53, 1, 59000, 1, 59000),
(54, 1, 59000, 1, 59000),
(55, 1, 59000, 1, 59000),
(57, 1, 59000, 1, 59000),
(58, 1, 59000, 3, 177000),
(59, 1, 59000, 2, 118000),
(60, 1, 59000, 2, 118000),
(61, 1, 59000, 2, 118000),
(62, 1, 59000, 2, 118000),
(63, 1, 59000, 1, 59000),
(64, 1, 59000, 2, 118000),
(65, 1, 59000, 1, 59000),
(66, 1, 59000, 2, 118000),
(67, 1, 59000, 2, 118000),
(71, 1, 59000, 2, 118000),
(72, 1, 59000, 1, 59000),
(73, 1, 59000, 1, 59000),
(74, 1, 59000, 2, 118000),
(75, 1, 59000, 4, 236000),
(78, 1, 59000, 1, 59000),
(80, 1, 59000, 2, 118000),
(81, 1, 59000, 2, 118000),
(83, 1, 59000, 2, 118000),
(84, 1, 59000, 2, 118000),
(85, 1, 59000, 2, 118000),
(86, 1, 59000, 2, 118000),
(87, 1, 59000, 2, 118000),
(88, 1, 59000, 2, 118000),
(89, 1, 59000, 2, 118000),
(90, 1, 59000, 2, 118000),
(91, 1, 59000, 1, 59000),
(92, 1, 59000, 2, 118000),
(93, 1, 59000, 2, 118000),
(94, 1, 59000, 2, 118000),
(95, 1, 59000, 2, 118000),
(45, 2, 22000, 3, 66000),
(46, 2, 22000, 1, 22000),
(48, 2, 22000, 1, 22000),
(53, 2, 22000, 1, 22000),
(54, 2, 22000, 1, 22000),
(55, 2, 22000, 1, 22000),
(57, 2, 22000, 1, 22000),
(58, 2, 22000, 2, 44000),
(60, 2, 22000, 1, 22000),
(61, 2, 22000, 1, 22000),
(62, 2, 22000, 1, 22000),
(63, 2, 22000, 1, 22000),
(64, 2, 22000, 2, 44000),
(65, 2, 22000, 1, 22000),
(68, 2, 22000, 1, 22000),
(71, 2, 22000, 1, 22000),
(72, 2, 22000, 1, 22000),
(73, 2, 22000, 2, 44000),
(74, 2, 22000, 1, 22000),
(75, 2, 22000, 1, 22000),
(76, 2, 22000, 1, 22000),
(77, 2, 22000, 1, 22000),
(78, 2, 22000, 2, 44000),
(79, 2, 22000, 3, 66000),
(80, 2, 22000, 2, 44000),
(81, 2, 22000, 1, 22000),
(82, 2, 22000, 2, 44000),
(83, 2, 22000, 1, 22000),
(85, 2, 22000, 1, 22000),
(86, 2, 22000, 1, 22000),
(88, 2, 22000, 1, 22000),
(89, 2, 22000, 1, 22000),
(90, 2, 22000, 2, 44000),
(93, 2, 22000, 2, 44000),
(94, 2, 22000, 1, 22000),
(45, 3, 5000, 1, 5000),
(46, 3, 5000, 2, 10000),
(57, 3, 5000, 2, 10000),
(61, 3, 5000, 1, 5000),
(62, 3, 5000, 1, 5000),
(63, 3, 5000, 2, 10000),
(64, 3, 5000, 1, 5000),
(71, 3, 5000, 1, 5000),
(73, 3, 5000, 2, 10000),
(74, 3, 5000, 1, 5000),
(76, 3, 5000, 1, 5000),
(77, 3, 5000, 2, 10000),
(79, 3, 5000, 1, 5000),
(81, 3, 5000, 2, 10000),
(82, 3, 5000, 2, 10000),
(83, 3, 5000, 2, 10000),
(84, 3, 5000, 3, 15000),
(87, 3, 5000, 1, 5000),
(89, 3, 5000, 1, 5000),
(95, 3, 5000, 2, 10000),
(53, 4, 59000, 1, 59000),
(55, 4, 59000, 3, 177000),
(56, 4, 59000, 3, 177000),
(66, 4, 59000, 1, 59000),
(84, 4, 59000, 1, 59000),
(92, 4, 59000, 3, 177000),
(66, 6, 99000, 1, 99000),
(67, 6, 99000, 1, 99000),
(68, 6, 99000, 1, 99000),
(91, 6, 99000, 2, 198000),
(59, 7, 23000, 1, 23000),
(64, 7, 23000, 1, 23000),
(54, 8, 59000, 3, 177000),
(59, 8, 59000, 1, 59000),
(65, 8, 59000, 1, 59000),
(68, 8, 59000, 2, 118000),
(69, 8, 59000, 1, 59000),
(70, 8, 59000, 2, 118000),
(82, 8, 59000, 2, 118000),
(91, 8, 59000, 2, 118000),
(56, 9, 49000, 1, 49000),
(66, 9, 49000, 2, 98000),
(69, 9, 49000, 2, 98000),
(91, 9, 49000, 2, 98000),
(65, 10, 19000, 2, 38000),
(70, 10, 19000, 2, 38000),
(72, 10, 19000, 3, 57000),
(75, 10, 19000, 2, 38000),
(85, 10, 19000, 2, 38000),
(94, 10, 19000, 2, 38000),
(54, 11, 30000, 1, 30000),
(87, 11, 30000, 1, 30000),
(87, 12, 32000, 1, 32000);

-- --------------------------------------------------------

--
-- Table structure for table `chitietphieunhap`
--

CREATE TABLE `chitietphieunhap` (
  `MaPhieuNhap` int(11) NOT NULL,
  `MaNL` int(11) NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `DonGia` int(11) NOT NULL,
  `ThanhTien` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `chucvu`
--

CREATE TABLE `chucvu` (
  `MaChucVu` int(11) NOT NULL,
  `TenChucVu` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `chucvu`
--

INSERT INTO `chucvu` (`MaChucVu`, `TenChucVu`) VALUES
(1, 'Quản Lý'),
(2, 'Nhân viên');

-- --------------------------------------------------------

--
-- Table structure for table `hoadon`
--

CREATE TABLE `hoadon` (
  `MaHD` int(11) NOT NULL,
  `MaNV` int(11) NOT NULL,
  `NgayLapHD` timestamp NOT NULL DEFAULT current_timestamp(),
  `MaApp` int(11) NOT NULL,
  `MaDonTrenApp` varchar(30) NOT NULL,
  `TongTien` bigint(20) NOT NULL,
  `ChietKhau` bigint(20) NOT NULL,
  `PhiDichVu` bigint(20) NOT NULL,
  `TongThu` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hoadon`
--

INSERT INTO `hoadon` (`MaHD`, `MaNV`, `NgayLapHD`, `MaApp`, `MaDonTrenApp`, `TongTien`, `ChietKhau`, `PhiDichVu`, `TongThu`) VALUES
(45, 1, '2021-02-12 12:19:16', 1, '', 130000, 0, 0, 130000),
(46, 1, '2021-02-15 11:23:08', 1, '', 91000, 0, 0, 91000),
(47, 1, '2021-02-17 06:32:56', 1, '', 59000, 0, 0, 59000),
(48, 1, '2021-03-02 06:56:50', 1, '', 81000, 0, 0, 81000),
(49, 1, '2021-03-03 08:04:24', 1, '', 59000, 0, 0, 59000),
(50, 1, '2021-03-29 08:06:32', 1, '', 59000, 0, 0, 59000),
(53, 1, '2021-03-05 07:16:07', 1, '', 140000, 0, 0, 140000),
(54, 1, '2021-04-12 10:57:19', 5, 'LIXIFOOD12', 288000, 58000, 43000, 187000),
(55, 1, '2021-04-04 10:58:13', 3, 'GOVIET12', 258000, 77000, 52000, 129000),
(56, 1, '2021-04-20 10:58:39', 5, 'LIXI12', 226000, 68000, 34000, 124000),
(57, 1, '2021-04-30 10:59:07', 1, '', 91000, 0, 0, 91000),
(58, 1, '2021-01-12 10:59:34', 5, 'LIXI12', 221000, 44000, 33000, 144000),
(59, 1, '2021-01-03 10:59:58', 3, '', 200000, 40000, 40000, 120000),
(60, 1, '2021-01-29 11:00:19', 4, 'BAE01', 140000, 0, 28000, 112000),
(61, 1, '2021-01-23 11:00:41', 4, 'BAEMIN20', 145000, 29000, 29000, 87000),
(62, 1, '2021-02-17 11:00:56', 4, '', 145000, 22000, 29000, 94000),
(63, 1, '2021-02-15 11:01:17', 2, 'GRAB', 91000, 18000, 27000, 46000),
(64, 1, '2021-03-20 11:01:33', 2, 'GRAB12', 190000, 38000, 57000, 95000),
(65, 1, '2021-02-23 11:02:02', 2, 'GRAB01', 178000, 36000, 53000, 89000),
(66, 1, '2021-01-12 11:02:26', 1, '', 374000, 75000, 0, 299000),
(67, 1, '2021-01-20 11:02:43', 1, '', 217000, 22000, 0, 195000),
(68, 1, '2021-01-30 11:03:07', 1, '', 239000, 0, 0, 239000),
(69, 1, '2021-04-23 11:03:18', 1, '', 157000, 0, 0, 157000),
(70, 1, '2021-05-17 11:03:32', 1, '', 156000, 0, 0, 156000),
(71, 1, '2021-05-17 11:03:43', 1, '', 145000, 0, 0, 145000),
(72, 1, '2021-05-17 11:03:58', 3, 'GOV01', 138000, 0, 28000, 110000),
(73, 1, '2021-04-17 11:04:17', 3, 'GOVIET', 113000, 0, 23000, 90000),
(74, 1, '2021-03-17 11:04:30', 4, 'BAE150', 145000, 0, 29000, 116000),
(75, 6, '2021-02-17 11:05:18', 2, '', 296000, 0, 89000, 207000),
(76, 6, '2021-05-17 11:05:31', 3, 'GO122', 27000, 0, 5000, 22000),
(77, 6, '2021-05-17 11:05:44', 4, 'BAE15', 32000, 0, 6000, 26000),
(78, 6, '2021-05-17 11:05:57', 5, 'LIXI32', 103000, 0, 15000, 88000),
(79, 6, '2021-05-17 11:06:16', 1, '', 71000, 0, 0, 71000),
(80, 6, '2021-05-17 11:06:28', 2, 'GRA32', 162000, 0, 49000, 113000),
(81, 6, '2021-05-17 11:06:40', 3, 'GOV', 150000, 0, 30000, 120000),
(82, 6, '2021-05-17 11:06:57', 4, '', 172000, 0, 34000, 138000),
(83, 8, '2021-05-17 11:07:22', 4, 'BAEMIN0123', 150000, 0, 30000, 120000),
(84, 8, '2021-05-17 11:07:42', 4, 'BAEMIN01', 192000, 38000, 38000, 116000),
(85, 8, '2021-05-17 11:08:06', 3, 'GRAB', 178000, 36000, 36000, 106000),
(86, 8, '2021-05-17 11:08:35', 4, 'BAE93', 140000, 28000, 28000, 84000),
(87, 8, '2021-05-17 11:10:16', 5, 'LIXI12', 185000, 0, 28000, 157000),
(88, 1, '2021-05-17 11:13:58', 1, '', 140000, 0, 0, 140000),
(89, 1, '2021-05-17 11:14:28', 4, '', 145000, 0, 29000, 116000),
(90, 1, '2021-05-17 11:14:35', 3, '', 162000, 0, 32000, 130000),
(91, 1, '2021-05-17 11:14:51', 1, '', 473000, 0, 0, 473000),
(92, 1, '2021-05-17 11:14:59', 1, '', 295000, 0, 0, 295000),
(93, 1, '2021-05-17 11:15:11', 4, 'BAEMIN12', 162000, 0, 32000, 130000),
(94, 1, '2021-05-17 11:15:26', 1, '', 178000, 0, 0, 178000),
(95, 1, '2021-01-17 11:15:51', 1, '', 128000, 0, 0, 128000);

-- --------------------------------------------------------

--
-- Table structure for table `loaimon`
--

CREATE TABLE `loaimon` (
  `MaLoai` int(11) NOT NULL,
  `TenLoai` varchar(30) NOT NULL,
  `TrangThai` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `loaimon`
--

INSERT INTO `loaimon` (`MaLoai`, `TenLoai`, `TrangThai`) VALUES
(1, 'Bánh Ướt', 1),
(2, 'Giải Khát', 1),
(3, 'Món thêm', 1);

-- --------------------------------------------------------

--
-- Table structure for table `mon`
--

CREATE TABLE `mon` (
  `MaMon` int(11) NOT NULL,
  `MaLoaiMon` int(11) NOT NULL,
  `TenMon` varchar(30) NOT NULL,
  `GiaBan` int(11) NOT NULL,
  `TrangThai` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mon`
--

INSERT INTO `mon` (`MaMon`, `MaLoaiMon`, `TenMon`, `GiaBan`, `TrangThai`) VALUES
(1, 1, 'Bánh Ướt Lòng Gà', 59000, 1),
(2, 2, 'Cà phê sữa', 22000, 1),
(3, 3, 'Bánh ướt thêm', 5000, 1),
(4, 1, 'Bánh ướt hải sản ', 59000, 1),
(5, 3, 'Lòng gà thêm', 35000, 0),
(6, 1, 'Bánh Ướt Hoàng Kim', 99000, 1),
(7, 2, 'Trà Sữa Trân Châu', 23000, 1),
(8, 1, 'Bánh Ướt Hải Sản', 59000, 1),
(9, 1, 'Bánh Ướt Trứng Non', 49000, 1),
(10, 2, 'Cà Phê Đá', 19000, 1),
(11, 3, 'Lòng Gà Thêm', 30000, 1),
(12, 3, 'Trứng non thêm', 32000, 1);

-- --------------------------------------------------------

--
-- Table structure for table `nguyenlieu`
--

CREATE TABLE `nguyenlieu` (
  `MaNL` int(11) NOT NULL,
  `TenNL` varchar(30) NOT NULL,
  `DonGia` int(11) NOT NULL,
  `TrangThai` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nguyenlieu`
--

INSERT INTO `nguyenlieu` (`MaNL`, `TenNL`, `DonGia`, `TrangThai`) VALUES
(1, 'Bánh Ướt (Kg)', 20000, 1),
(2, 'Cơm (Kg)', 12000, 0),
(3, 'Gà (Con)', 56000, 0),
(4, 'Trà xanh (Thùng)', 200001, 1);

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNV` int(11) NOT NULL,
  `MaCV` int(11) NOT NULL,
  `TenNV` varchar(50) NOT NULL,
  `DienThoai` varchar(10) NOT NULL,
  `MaTK` int(11) NOT NULL,
  `TrangThai` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`MaNV`, `MaCV`, `TenNV`, `DienThoai`, `MaTK`, `TrangThai`) VALUES
(1, 1, 'Trần Phước An', '0333487982', 1, 1),
(4, 1, 'An', '0333487982', 1, 0),
(5, 1, 'Trần Phước An', '0333487982', 2, 0),
(6, 2, 'Võ Hoàng Vũ', '0584208003', 3, 1),
(7, 2, 'Thiều Thị Thủy', '0332321234', 4, 1),
(8, 2, 'Đoàn Minh Vương', '0989137882', 5, 1);

-- --------------------------------------------------------

--
-- Table structure for table `phieunhap`
--

CREATE TABLE `phieunhap` (
  `MaPN` int(11) NOT NULL,
  `MaNV` int(11) NOT NULL,
  `NgayLapPhieu` timestamp NOT NULL DEFAULT current_timestamp(),
  `TongTien` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `MaTK` int(11) NOT NULL,
  `TenTK` varchar(30) NOT NULL,
  `MatKhau` varchar(30) NOT NULL,
  `TrangThai` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`MaTK`, `TenTK`, `MatKhau`, `TrangThai`) VALUES
(1, 'admin', '123456', 0),
(2, 'anhanpro2k', '123456', 0),
(3, 'vupro123', '123456', 1),
(4, 'thuypro123', '123456', 1),
(5, 'vuongpro123', '123456', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `app`
--
ALTER TABLE `app`
  ADD PRIMARY KEY (`maApp`);

--
-- Indexes for table `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD PRIMARY KEY (`MaMon`,`MaHD`) USING BTREE,
  ADD KEY `fk_cthd_id_hd` (`MaHD`);

--
-- Indexes for table `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD PRIMARY KEY (`MaPhieuNhap`),
  ADD KEY `fk_ctpn_id_nl` (`MaNL`);

--
-- Indexes for table `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`MaChucVu`);

--
-- Indexes for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`MaHD`),
  ADD KEY `fk_hd_id_nv` (`MaNV`),
  ADD KEY `fk_hd_id_app` (`MaApp`);

--
-- Indexes for table `loaimon`
--
ALTER TABLE `loaimon`
  ADD PRIMARY KEY (`MaLoai`);

--
-- Indexes for table `mon`
--
ALTER TABLE `mon`
  ADD PRIMARY KEY (`MaMon`),
  ADD KEY `fk_mon_id_loai` (`MaLoaiMon`);

--
-- Indexes for table `nguyenlieu`
--
ALTER TABLE `nguyenlieu`
  ADD PRIMARY KEY (`MaNL`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNV`),
  ADD KEY `fk_nv_id_chucvu` (`MaCV`),
  ADD KEY `fk_nv_id_taikhoan` (`MaTK`);

--
-- Indexes for table `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD PRIMARY KEY (`MaPN`),
  ADD KEY `fk_pn_id_nv` (`MaNV`);

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`MaTK`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `app`
--
ALTER TABLE `app`
  MODIFY `maApp` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  MODIFY `MaPhieuNhap` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `chucvu`
--
ALTER TABLE `chucvu`
  MODIFY `MaChucVu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `hoadon`
--
ALTER TABLE `hoadon`
  MODIFY `MaHD` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=96;

--
-- AUTO_INCREMENT for table `loaimon`
--
ALTER TABLE `loaimon`
  MODIFY `MaLoai` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `mon`
--
ALTER TABLE `mon`
  MODIFY `MaMon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `nguyenlieu`
--
ALTER TABLE `nguyenlieu`
  MODIFY `MaNL` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `MaNV` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `phieunhap`
--
ALTER TABLE `phieunhap`
  MODIFY `MaPN` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `taikhoan`
--
ALTER TABLE `taikhoan`
  MODIFY `MaTK` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD CONSTRAINT `fk_cthd_id_hd` FOREIGN KEY (`MaHD`) REFERENCES `hoadon` (`MaHD`),
  ADD CONSTRAINT `fk_cthd_id_mon` FOREIGN KEY (`MaMon`) REFERENCES `mon` (`MaMon`);

--
-- Constraints for table `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD CONSTRAINT `fk_ctpn_id_nl` FOREIGN KEY (`MaNL`) REFERENCES `nguyenlieu` (`MaNL`),
  ADD CONSTRAINT `fk_ctpn_id_pn` FOREIGN KEY (`MaPhieuNhap`) REFERENCES `phieunhap` (`MaPN`);

--
-- Constraints for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `fk_hd_id_app` FOREIGN KEY (`MaApp`) REFERENCES `app` (`maApp`),
  ADD CONSTRAINT `fk_hd_id_nv` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`);

--
-- Constraints for table `mon`
--
ALTER TABLE `mon`
  ADD CONSTRAINT `fk_mon_id_loai` FOREIGN KEY (`MaLoaiMon`) REFERENCES `loaimon` (`MaLoai`);

--
-- Constraints for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `fk_nv_id_chucvu` FOREIGN KEY (`MaCV`) REFERENCES `chucvu` (`MaChucVu`),
  ADD CONSTRAINT `fk_nv_id_taikhoan` FOREIGN KEY (`MaTK`) REFERENCES `taikhoan` (`MaTK`);

--
-- Constraints for table `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD CONSTRAINT `fk_pn_id_nv` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
