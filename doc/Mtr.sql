/*
Navicat MySQL Data Transfer

Source Server         : 11111
Source Server Version : 50628
Source Host           : localhost:3306
Source Database       : mtr

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2016-11-21 22:48:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for meeting_room
-- ----------------------------
DROP TABLE IF EXISTS `meeting_room`;
CREATE TABLE `meeting_room` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) DEFAULT NULL,
  `TABLE` bit(1) DEFAULT NULL,
  `MEDIA` bit(1) DEFAULT NULL,
  `AIRCONDITION` bit(1) DEFAULT NULL,
  `PEOPLE` int(11) DEFAULT NULL,
  `MICROPHONE` int(11) DEFAULT NULL,
  `WHITEBOARD` int(11) DEFAULT NULL,
  `BLACKBOARD` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of meeting_room
-- ----------------------------

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `START_TIME` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `END_TIME` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `BOOKED_BY` int(11) DEFAULT NULL,
  `MEETING_ROOM` int(11) DEFAULT NULL,
  `THEME` varchar(255) DEFAULT NULL,
  `REMARK` varchar(255) DEFAULT NULL,
  `TYPE` int(11) DEFAULT NULL,
  `CONTRACTER` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_NAME` varchar(255) DEFAULT NULL,
  `PASSWORD` varchar(255) DEFAULT NULL,
  `COMPANY` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `IS_ADMIN` bit(1) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
