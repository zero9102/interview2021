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

 Date: 28/06/2021 22:05:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
BEGIN;
INSERT INTO `person` VALUES (1, '张珊');
INSERT INTO `person` VALUES (2, 'lishi');
INSERT INTO `person` VALUES (3, '王五');
INSERT INTO `person` VALUES (4, '雪白');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
