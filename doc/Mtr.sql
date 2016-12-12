/*
Navicat MySQL Data Transfer

Source Server         : 111
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : mtr

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2016-12-05 19:15:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for meeting
-- ----------------------------
DROP TABLE IF EXISTS `meeting`;
CREATE TABLE `meeting` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `START_TIME` int(11) DEFAULT NULL,
  `END_TIME` int(11) DEFAULT NULL,
  `BOOKED_BY` int(11) DEFAULT NULL,
  `MEETING_ROOM` int(11) DEFAULT NULL,
  `THEME` varchar(255) DEFAULT NULL,
  `REMARK` varchar(255) DEFAULT NULL,
  `TYPE` int(11) DEFAULT NULL,
  `CONTRACTER` int(11) DEFAULT NULL,
  `PHONE` varchar(255) DEFAULT NULL,
  `MEMBER` varchar(255) DEFAULT NULL,
  `ISEND` bit(1) DEFAULT b'0',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of meeting
-- ----------------------------
INSERT INTO `meeting` VALUES ('1', '1000', '1200', '1', '1', 'study', 'none', '1', '1', '123456', '1,2,3', '\0');
INSERT INTO `meeting` VALUES ('2', '1200', '1500', '1', '1', 'sport', 'none', '2', '1', '654321', '1,2', '\0');
INSERT INTO `meeting` VALUES ('3', '1800', '2000', '2', '2', 'game', 'kill Bill', '3', '2', '133333', '2,3,4', '\0');

-- ----------------------------
-- Table structure for meeting_room
-- ----------------------------
DROP TABLE IF EXISTS `meeting_room`;
CREATE TABLE `meeting_room` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) DEFAULT NULL,
  `DESK` bit(1) DEFAULT NULL,
  `MEDIA` bit(1) DEFAULT NULL,
  `AIRCONDITION` bit(1) DEFAULT NULL,
  `PEOPLE` int(11) DEFAULT NULL,
  `MICROPHONE` int(11) DEFAULT NULL,
  `WHITEBOARD` int(11) DEFAULT NULL,
  `BLACKBOARD` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of meeting_room
-- ----------------------------
INSERT INTO `meeting_room` VALUES ('1', '6-101', '', '', '', '50', '1', '5', '5');
INSERT INTO `meeting_room` VALUES ('2', '6-102', '', '', '\0', '40', '2', '4', '4');

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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '123456', 'HDU', '管理员', '', 'admin@hdu.edu.cn');
INSERT INTO `user` VALUES ('2', 'Jack', '123456', 'HDU', '杰克', '\0', 'jack@hdu.edu.cn');
INSERT INTO `user` VALUES ('3', 'Bob', '123456', 'HDU', '鲍勃', '\0', 'bob@hdu.edu.cn');
INSERT INTO `user` VALUES ('4', 'Paul', '123456', 'SJTU', '保罗', '\0', 'paul@hdu.edu.cn');
