/*
 Navicat Premium Data Transfer

 Source Server         : docker-mysql-test
 Source Server Type    : MySQL
 Source Server Version : 50732
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50732
 File Encoding         : 65001

 Date: 28/06/2021 22:05:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) NOT NULL,
  `cityname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of city
-- ----------------------------
BEGIN;
INSERT INTO `city` VALUES (1, 1, '北京');
INSERT INTO `city` VALUES (2, 2, '广州');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
