-- phpMyAdmin SQL Dump
-- version 4.5.0.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 2016-05-11 04:28:43
-- 服务器版本： 10.0.17-MariaDB
-- PHP Version: 5.6.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sunonlinedb`
--

-- --------------------------------------------------------

--
-- 表的结构 `administrator`
--

CREATE TABLE `administrator` (
  `admin_id` int(11) NOT NULL,
  `admin_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `admin_pwd` varchar(45) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- 转存表中的数据 `administrator`
--

INSERT INTO `administrator` (`admin_id`, `admin_name`, `admin_pwd`) VALUES
(1, 'admin1', 'cb28e00ef51374b841fb5c189b2b91c9');

-- --------------------------------------------------------

--
-- 表的结构 `college_pinoeer_intro`
--

CREATE TABLE `college_pinoeer_intro` (
  `fcl_id` int(11) NOT NULL,
  `fcl_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `fcl_url` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `fcl_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- 表的结构 `college_voice_player`
--

CREATE TABLE `college_voice_player` (
  `player_id` int(11) NOT NULL,
  `player_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `player_gender` tinyint(1) NOT NULL,
  `player_school` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `player_number` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- 表的结构 `college_voice_video`
--

CREATE TABLE `college_voice_video` (
  `ZQY_video_id` int(11) NOT NULL,
  `ZQY_video_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `ZQY_video_url` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `ZQY_video_date` date NOT NULL,
  `ZQY_video_pic_url` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `ZQY_video_played_number` int(11) NOT NULL DEFAULT '0',
  `zqy_player_number` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- 表的结构 `higo_video`
--

CREATE TABLE `higo_video` (
  `HIGO_video_id` int(11) NOT NULL,
  `HIGO_video_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `HIGO_video_url` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `HIGO_video_date` date NOT NULL,
  `HIGO_video_pic_url` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `HIGO_video_played_number` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- 表的结构 `old_driver_video`
--

CREATE TABLE `old_driver_video` (
  `LSJ_video_id` int(11) NOT NULL,
  `LSJ_video_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `LSJ_video_url` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `LSJ_video_date` date NOT NULL,
  `LSJ_video_pic_url` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `LSJ_video_played_number` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- 表的结构 `sx_school_pic_library`
--

CREATE TABLE `sx_school_pic_library` (
  `pic_lib_id` int(11) NOT NULL,
  `pic_lib_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `pic_lib_url` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `HDpic_lib_url` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `pic_lib_school` varchar(45) COLLATE utf8_unicode_ci NOT NULL COMMENT '图片所属院校名称',
  `pic_lib_uploader` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `pic_lib_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- 表的结构 `user_login`
--

CREATE TABLE `user_login` (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `user_pwd` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `user_mobile` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `administrator`
--
ALTER TABLE `administrator`
  ADD PRIMARY KEY (`admin_id`),
  ADD UNIQUE KEY `admin_id_UNIQUE` (`admin_id`),
  ADD UNIQUE KEY `admin_name_UNIQUE` (`admin_name`);

--
-- Indexes for table `college_pinoeer_intro`
--
ALTER TABLE `college_pinoeer_intro`
  ADD PRIMARY KEY (`fcl_id`),
  ADD UNIQUE KEY `fcl_id_UNIQUE` (`fcl_id`),
  ADD UNIQUE KEY `fcl_name_UNIQUE` (`fcl_name`),
  ADD UNIQUE KEY `fcl_url_UNIQUE` (`fcl_url`);

--
-- Indexes for table `college_voice_player`
--
ALTER TABLE `college_voice_player`
  ADD PRIMARY KEY (`player_id`,`player_number`),
  ADD UNIQUE KEY `people_id_UNIQUE` (`player_id`),
  ADD UNIQUE KEY `player_number_UNIQUE` (`player_number`);

--
-- Indexes for table `college_voice_video`
--
ALTER TABLE `college_voice_video`
  ADD PRIMARY KEY (`ZQY_video_id`),
  ADD UNIQUE KEY `video_id_UNIQUE` (`ZQY_video_id`),
  ADD UNIQUE KEY `video_name_UNIQUE` (`ZQY_video_name`),
  ADD UNIQUE KEY `video_url_UNIQUE` (`ZQY_video_url`),
  ADD UNIQUE KEY `video_pic_url_UNIQUE` (`ZQY_video_pic_url`),
  ADD KEY `fk_zqy_video_zqy_player_idx` (`zqy_player_number`);

--
-- Indexes for table `higo_video`
--
ALTER TABLE `higo_video`
  ADD PRIMARY KEY (`HIGO_video_id`),
  ADD UNIQUE KEY `video_id_UNIQUE` (`HIGO_video_id`),
  ADD UNIQUE KEY `video_name_UNIQUE` (`HIGO_video_name`),
  ADD UNIQUE KEY `video_url_UNIQUE` (`HIGO_video_url`),
  ADD UNIQUE KEY `video_pic_url_UNIQUE` (`HIGO_video_pic_url`);

--
-- Indexes for table `old_driver_video`
--
ALTER TABLE `old_driver_video`
  ADD PRIMARY KEY (`LSJ_video_id`),
  ADD UNIQUE KEY `video_id_UNIQUE` (`LSJ_video_id`),
  ADD UNIQUE KEY `video_name_UNIQUE` (`LSJ_video_name`),
  ADD UNIQUE KEY `video_url_UNIQUE` (`LSJ_video_url`),
  ADD UNIQUE KEY `video_pic_url_UNIQUE` (`LSJ_video_pic_url`);

--
-- Indexes for table `sx_school_pic_library`
--
ALTER TABLE `sx_school_pic_library`
  ADD PRIMARY KEY (`pic_lib_id`),
  ADD UNIQUE KEY `library_pic_id_UNIQUE` (`pic_lib_id`),
  ADD UNIQUE KEY `library_pic_name_UNIQUE` (`pic_lib_name`),
  ADD UNIQUE KEY `library_pic_url_UNIQUE` (`pic_lib_url`),
  ADD UNIQUE KEY `library_HDpic_url_UNIQUE` (`HDpic_lib_url`);

--
-- Indexes for table `user_login`
--
ALTER TABLE `user_login`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `user_id_UNIQUE` (`user_id`),
  ADD UNIQUE KEY `user_name_UNIQUE` (`user_name`),
  ADD UNIQUE KEY `user_mobile_UNIQUE` (`user_mobile`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `administrator`
--
ALTER TABLE `administrator`
  MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `college_pinoeer_intro`
--
ALTER TABLE `college_pinoeer_intro`
  MODIFY `fcl_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `college_voice_video`
--
ALTER TABLE `college_voice_video`
  MODIFY `ZQY_video_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `higo_video`
--
ALTER TABLE `higo_video`
  MODIFY `HIGO_video_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `old_driver_video`
--
ALTER TABLE `old_driver_video`
  MODIFY `LSJ_video_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `sx_school_pic_library`
--
ALTER TABLE `sx_school_pic_library`
  MODIFY `pic_lib_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `user_login`
--
ALTER TABLE `user_login`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- 限制导出的表
--

--
-- 限制表 `college_voice_video`
--
ALTER TABLE `college_voice_video`
  ADD CONSTRAINT `fk_zqy_video_zqy_player` FOREIGN KEY (`zqy_player_number`) REFERENCES `college_voice_player` (`player_number`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
