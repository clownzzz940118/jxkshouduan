/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 26/04/2019 17:55:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `projectname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `projectNum` int(11) NULL DEFAULT NULL,
  `chapterName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `chapterNum` int(11) NULL DEFAULT NULL,
  `sectionName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sectionNum` int(11) NULL DEFAULT NULL,
  `courseName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `courseNum` int(11) NULL DEFAULT NULL,
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of project
-- ----------------------------
INSERT INTO `project` VALUES (1, '科目一', 1, '第一章', 1, '驾驶证的许可、种类和有效期', 1, '驾驶证许可', 1, 'test.mp4');
INSERT INTO `project` VALUES (2, '科目一', 1, '第一章', 1, '驾驶证的许可、种类和有效期', 1, '驶证许的种类和有效期', 2, 'test.mp4');
INSERT INTO `project` VALUES (3, '科目一', 1, '第一章', 1, '驾驶证的申领', 2, '申请条件', 1, 'test.mp4');
INSERT INTO `project` VALUES (4, '科目一', 1, '第一章', 1, '驾驶证的申领', 2, '初次申领的车型', 2, 'test.mp4');
INSERT INTO `project` VALUES (5, '科目一', 1, '第一章', 1, '驾驶证的使用', 3, '驾驶证实习期', 1, 'test.mp4');
INSERT INTO `project` VALUES (6, '科目一', 1, '第一章', 1, '驾驶证的使用', 3, '驾驶证审验', 2, 'test.mp4');
INSERT INTO `project` VALUES (7, '科目一', 1, '第一章', 1, '驾驶证的使用', 3, '驾驶证换证与补证', 3, 'test.mp4');
INSERT INTO `project` VALUES (8, '科目一', 1, '第一章', 1, '驾驶考试', 4, '驾驶考试', 1, 'test.mp4');
INSERT INTO `project` VALUES (9, '科目一', 1, '第一章', 1, '违法记分制度', 5, '违法记分制度', 1, 'test.mp4');
INSERT INTO `project` VALUES (10, '科目一', 1, '第二章', 2, '交通信号灯', 1, '交通信号灯描述', 1, 'test.mp4');

SET FOREIGN_KEY_CHECKS = 1;
