/*
 Navicat Premium Data Transfer

 Source Server         : EMI's MySQL
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : ordering_systemdb

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 25/05/2022 11:48:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for administrator
-- ----------------------------
DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator`  (
  `a_id` int(11) NOT NULL AUTO_INCREMENT,
  `a_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `a_idnumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `a_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `a_pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`a_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 41 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of administrator
-- ----------------------------
INSERT INTO `administrator` VALUES (1, '祝佳宇', '450481200304212062', '60104202925', '113218');
INSERT INTO `administrator` VALUES (2, '朱俞庆', '510321200401306321', '60101122909', '202925');
INSERT INTO `administrator` VALUES (3, '朱明昊', '51032120041020620X', '60101113310', '113009');
INSERT INTO `administrator` VALUES (4, '朱珏妹', '511102200211260730', '60101113218', '112901');
INSERT INTO `administrator` VALUES (5, '周子榆', '511102200310148226', '60101113009', '122909');
INSERT INTO `administrator` VALUES (6, '周玉潇', '511102200312168044', '60101112901', '113310');
INSERT INTO `administrator` VALUES (7, '周妍利', '511102200312208229', '60101102903', '102903');
INSERT INTO `administrator` VALUES (8, '周心蕊', '511102200312223218', '60104203720', '102812');
INSERT INTO `administrator` VALUES (9, '周霞', '511102200410083423', '60104203612', '203317');
INSERT INTO `administrator` VALUES (10, '周其', '51110220041019342X', '60104203529', '203023');
INSERT INTO `administrator` VALUES (11, '周霖利', '511102200411170721', '60104203512', '103502');
INSERT INTO `administrator` VALUES (12, '周金慧', '511112200402284519', '60104203507', '203529');
INSERT INTO `administrator` VALUES (13, '周航', '511112200403092121', '60104203430', '103030');
INSERT INTO `administrator` VALUES (14, '郑雯', '511112200404300949', '60104203405', '192801');
INSERT INTO `administrator` VALUES (15, '郑佳俊', '511112200405110717', '60104203319', '132904');
INSERT INTO `administrator` VALUES (16, '赵余航', '511113200312151428', '60104203318', '102929');
INSERT INTO `administrator` VALUES (17, '赵艳玲', '511123200210297322', '60104203317', '192916');
INSERT INTO `administrator` VALUES (18, '赵敏', '51112320030303066X', '60104203309', '123029');
INSERT INTO `administrator` VALUES (19, '赵梦佳', '511123200308301967', '60104203302', '103017');
INSERT INTO `administrator` VALUES (20, '赵洛樟', '511123200309037010', '60104203301', '102808');
INSERT INTO `administrator` VALUES (21, '赵健茜', '511123200310195753', '60104203230', '193015');
INSERT INTO `administrator` VALUES (22, '张政', '511123200310205560', '60104203208', '202829');
INSERT INTO `administrator` VALUES (23, '张昀娴', '511123200310231953', '60104203205', '202818');
INSERT INTO `administrator` VALUES (24, '张益', '511123200311110029', '60104203204', '102813');
INSERT INTO `administrator` VALUES (25, '张梦佳', '511123200311130660', '60104203125', '113501');
INSERT INTO `administrator` VALUES (26, '张瓅丹', '511123200311131823', '60104203123', '113012');
INSERT INTO `administrator` VALUES (27, '张俊杰', '511123200311211161', '60104203120', '102902');
INSERT INTO `administrator` VALUES (28, '张静', '511123200312011161', '60104203119', '193106');
INSERT INTO `administrator` VALUES (29, '袁钰颍', '511123200312040659', '60104203108', '192816');
INSERT INTO `administrator` VALUES (30, '袁益民', '511123200312280046', '60104203028', '103004');
INSERT INTO `administrator` VALUES (31, '袁艺丹', '511123200401020027', '60104203025', '203205');
INSERT INTO `administrator` VALUES (32, '袁鑫健', '511123200401110049', '60104203023', '102913');
INSERT INTO `administrator` VALUES (33, '袁文怡', '511123200401161153', '60104203006', '193423');
INSERT INTO `administrator` VALUES (34, '袁司洋', '511123200401176865', '60104203003', '193110');
INSERT INTO `administrator` VALUES (35, '余姝汶', '511123200401250041', '60104202928', '123518');
INSERT INTO `administrator` VALUES (36, '余沁利', '511123200401261461', '60104202927', '203006');
INSERT INTO `administrator` VALUES (37, '余佳薪', '51112320040130322X', '60104202918', '192914');
INSERT INTO `administrator` VALUES (38, '余佳松', '511123200401313364', '60104202917', '113219');
INSERT INTO `administrator` VALUES (39, '于快', '511123200402060047', '60104202915', '112924');
INSERT INTO `administrator` VALUES (40, '叶思成', '511123200402105364', '60104202905', '103010');

-- ----------------------------
-- Table structure for business
-- ----------------------------
DROP TABLE IF EXISTS `business`;
CREATE TABLE `business`  (
  `b_id` int(11) NOT NULL AUTO_INCREMENT,
  `b_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `b_userid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `b_pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`b_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 110 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of business
-- ----------------------------
INSERT INTO `business` VALUES (1, '李志强', '60191160101', '160101');
INSERT INTO `business` VALUES (2, '朱卢桐', '60191050114', '050114');
INSERT INTO `business` VALUES (3, '李昱坤', '60191050128', '050128');
INSERT INTO `business` VALUES (4, '孙蒙莹', '60191050811', '050811');
INSERT INTO `business` VALUES (5, '王钟玉', '60191060313', '060313');
INSERT INTO `business` VALUES (6, '史红艳', '60191070205', '070205');
INSERT INTO `business` VALUES (7, '张海涛', '60191070401', '070401');
INSERT INTO `business` VALUES (8, '张思怡', '60191070415', '070415');
INSERT INTO `business` VALUES (9, '刘骐铭', '60191070601', '070601');
INSERT INTO `business` VALUES (10, '刘虹麟', '60191070613', '070613');
INSERT INTO `business` VALUES (11, '周阳', '60191070621', '070621');
INSERT INTO `business` VALUES (12, '刘仪莲', '60191070622', '070622');
INSERT INTO `business` VALUES (13, '董雨露', '60191070715', '070715');
INSERT INTO `business` VALUES (14, '周弋驰', '60191070826', '070826');
INSERT INTO `business` VALUES (15, '周捷', '60191070907', '070907');
INSERT INTO `business` VALUES (16, '车鸿飞', '60191070918', '070918');
INSERT INTO `business` VALUES (17, '廖开贵', '60191071209', '071209');
INSERT INTO `business` VALUES (18, '刘俊', '60191080217', '080217');
INSERT INTO `business` VALUES (19, '龙健', '60191080330', '080330');
INSERT INTO `business` VALUES (20, '黄梦婷', '60191090402', '090402');
INSERT INTO `business` VALUES (21, '张晓炜', '60191150112', '150112');
INSERT INTO `business` VALUES (22, '操沛伶', '60191150222', '150222');
INSERT INTO `business` VALUES (23, '夏浩扬', '60191150223', '150223');
INSERT INTO `business` VALUES (24, '肖金雪', '60191150227', '150227');
INSERT INTO `business` VALUES (25, '陈彥冰', '60191150303', '150303');
INSERT INTO `business` VALUES (26, '叶梦欣', '60191150307', '150307');
INSERT INTO `business` VALUES (27, '万松林', '60191150514', '150514');
INSERT INTO `business` VALUES (28, '叶欣雨', '60191150517', '150517');
INSERT INTO `business` VALUES (29, '王少凯', '60191150822', '150822');
INSERT INTO `business` VALUES (30, '卢甜甜', '60191150825', '150825');
INSERT INTO `business` VALUES (31, '王露瑶', '60191160107', '160107');
INSERT INTO `business` VALUES (32, '苟婷', '60191160108', '160108');
INSERT INTO `business` VALUES (33, '彭文杰', '60191160113', '160113');
INSERT INTO `business` VALUES (34, '吴守恒', '60191160116', '160116');
INSERT INTO `business` VALUES (35, '李周阳', '60191160117', '160117');
INSERT INTO `business` VALUES (36, '龙武强', '60191160119', '160119');
INSERT INTO `business` VALUES (37, '赵福民', '60191160122', '160122');
INSERT INTO `business` VALUES (38, '李笑宇', '60191160123', '160123');
INSERT INTO `business` VALUES (39, '杜芸洁', '60191160124', '160124');
INSERT INTO `business` VALUES (40, '陈婷', '60191160203', '160203');
INSERT INTO `business` VALUES (41, '杨秋林', '60191160208', '160208');
INSERT INTO `business` VALUES (42, '彭锋', '60191160210', '160210');
INSERT INTO `business` VALUES (43, '周豪杰', '60191160226', '160226');
INSERT INTO `business` VALUES (44, '刘梦琳', '60191160309', '160309');
INSERT INTO `business` VALUES (45, '田妮鹭', '60191160328', '160328');
INSERT INTO `business` VALUES (46, '刘莉', '60191160329', '160329');
INSERT INTO `business` VALUES (47, '徐敏', '60191160420', '160420');
INSERT INTO `business` VALUES (48, '曾浩峻', '60191160502', '160502');
INSERT INTO `business` VALUES (49, '张雅琪', '60191160530', '160530');
INSERT INTO `business` VALUES (50, '李長江', '60191160612', '160612');
INSERT INTO `business` VALUES (51, '杨巧', '60191160821', '160821');
INSERT INTO `business` VALUES (52, '李玉萍', '60191170104', '170104');
INSERT INTO `business` VALUES (53, '钱瑶', '60191170105', '170105');
INSERT INTO `business` VALUES (54, '张娟', '60191170115', '170115');
INSERT INTO `business` VALUES (55, '毛瑞嘉', '60191170120', '170120');
INSERT INTO `business` VALUES (56, '唐杰', '60191170127', '170127');
INSERT INTO `business` VALUES (57, '张嘉伟', '60191170129', '170129');
INSERT INTO `business` VALUES (58, '胡媛媛', '60191170207', '170207');
INSERT INTO `business` VALUES (59, '窦炜骁', '60191170209', '170209');
INSERT INTO `business` VALUES (60, '潘绍桃', '60191170215', '170215');
INSERT INTO `business` VALUES (61, '肖余峰', '60191170221', '170221');
INSERT INTO `business` VALUES (62, '陈世安', '60191170225', '170225');
INSERT INTO `business` VALUES (63, '张鸿堽', '60191170310', '170310');
INSERT INTO `business` VALUES (64, '朱炫', '60191170311', '170311');
INSERT INTO `business` VALUES (65, '刘静', '60191170312', '170312');
INSERT INTO `business` VALUES (66, '李浩楠', '60191170425', '170425');
INSERT INTO `business` VALUES (67, '刘稆檬', '60191170503', '170503');
INSERT INTO `business` VALUES (68, '周艺昕', '60191170504', '170504');
INSERT INTO `business` VALUES (69, '廖雨曦', '60191170602', '170602');
INSERT INTO `business` VALUES (70, '朱正行', '60191170708', '170708');
INSERT INTO `business` VALUES (71, '段霖睿', '60191170823', '170823');
INSERT INTO `business` VALUES (72, '廖缘佳', '60191170909', '170909');
INSERT INTO `business` VALUES (73, '粟裕昕', '60191170922', '170922');
INSERT INTO `business` VALUES (74, '先智婷', '60191172223', '172223');
INSERT INTO `business` VALUES (75, '邱帅波', '60191180103', '180103');
INSERT INTO `business` VALUES (76, '陈静茹', '60191180106', '180106');
INSERT INTO `business` VALUES (77, '黄瑞鑫', '60191180109', '180109');
INSERT INTO `business` VALUES (78, '周芋洁', '60191180110', '180110');
INSERT INTO `business` VALUES (79, '谢林秋', '60191180111', '180111');
INSERT INTO `business` VALUES (80, '彭凡', '60191180118', '180118');
INSERT INTO `business` VALUES (81, '李雪琴', '60191180125', '180125');
INSERT INTO `business` VALUES (82, '勒尔合子', '60191180204', '180204');
INSERT INTO `business` VALUES (83, '张铸鑫', '60191180211', '180211');
INSERT INTO `business` VALUES (84, '张露', '60191180213', '180213');
INSERT INTO `business` VALUES (85, '刘欣冉', '60191180216', '180216');
INSERT INTO `business` VALUES (86, '雷雨鑫', '60191180224', '180224');
INSERT INTO `business` VALUES (87, '安蕊', '60191180228', '180228');
INSERT INTO `business` VALUES (88, '江晓', '60191180301', '180301');
INSERT INTO `business` VALUES (89, '张乐', '60191180302', '180302');
INSERT INTO `business` VALUES (90, '邓梓源', '60191180306', '180306');
INSERT INTO `business` VALUES (91, '周子谦', '60191180308', '180308');
INSERT INTO `business` VALUES (92, '杨俊', '60191180318', '180318');
INSERT INTO `business` VALUES (93, '杨书婷', '60191180324', '180324');
INSERT INTO `business` VALUES (94, '魏明源', '60191180421', '180421');
INSERT INTO `business` VALUES (95, '张洪伟', '60191180515', '180515');
INSERT INTO `business` VALUES (96, '钟芷怡', '60191180523', '180523');
INSERT INTO `business` VALUES (97, '夏瑞涛', '60191180604', '180604');
INSERT INTO `business` VALUES (98, '杨乔于', '60191180630', '180630');
INSERT INTO `business` VALUES (99, '李晓冉', '60191180710', '180710');
INSERT INTO `business` VALUES (100, '纪雪萍', '60191181019', '181019');
INSERT INTO `business` VALUES (101, '祝愿', '60191181206', '181206');
INSERT INTO `business` VALUES (102, '张俊杰', '60194210512', '210512');
INSERT INTO `business` VALUES (103, '许露丹', '60194211403', '211403');
INSERT INTO `business` VALUES (104, '周伦杰', '60194220527', '220527');
INSERT INTO `business` VALUES (105, '杨金鑫', '60194220903', '220903');
INSERT INTO `business` VALUES (106, '李宇涵', '60194230102', '230102');
INSERT INTO `business` VALUES (107, '程红丽', '60194230206', '230206');
INSERT INTO `business` VALUES (108, '周思宇', '60194231402', '231402');
INSERT INTO `business` VALUES (109, '宋卓鲜', '60194231620', '231620');

-- ----------------------------
-- Table structure for discount
-- ----------------------------
DROP TABLE IF EXISTS `discount`;
CREATE TABLE `discount`  (
  `d_couponid` int(11) NOT NULL AUTO_INCREMENT,
  `d_couponnum` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_id` int(11) NULL DEFAULT NULL,
  `d_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `d_details` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `d_overlying` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `d_concessionalrate` int(11) NULL DEFAULT NULL,
  `d_value` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`d_couponid`) USING BTREE,
  INDEX `u_id`(`u_id`) USING BTREE,
  INDEX `d_couponnum`(`d_couponnum`) USING BTREE,
  CONSTRAINT `discount_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `userinfo` (`u_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of discount
-- ----------------------------
INSERT INTO `discount` VALUES (1, '01EXCCES', 99, '满减优惠券1', '满5.01减5', '0', 5, 5);
INSERT INTO `discount` VALUES (2, '02EXCCES', 54, '满减优惠券2', '满20减2', '1', 2, 20);
INSERT INTO `discount` VALUES (3, '03EXCCES', 145, '满减优惠券2', '满20减2', '1', 2, 20);
INSERT INTO `discount` VALUES (4, '04EXCCES', 144, '满减优惠券2', '满20减2', '1', 2, 20);
INSERT INTO `discount` VALUES (5, '05EXCCES', 159, '满减优惠券2', '满20减2', '1', 2, 20);
INSERT INTO `discount` VALUES (6, '06EXCCES', 140, '满减优惠券2', '满20减2', '1', 2, 20);
INSERT INTO `discount` VALUES (7, '07EXCCES', 139, '满减优惠券3', '满40减4', '0', 4, 40);
INSERT INTO `discount` VALUES (8, '08EXCCES', 157, '满减优惠券3', '满40减4', '0', 4, 40);
INSERT INTO `discount` VALUES (9, '09EXCCES', 47, '满减优惠券3', '满40减4', '0', 4, 40);
INSERT INTO `discount` VALUES (10, '10EXCCES', 81, '满减优惠券3', '满40减4', '0', 4, 40);
INSERT INTO `discount` VALUES (11, '11EXCCES', 138, '满减优惠券3', '满40减4', '0', 4, 40);
INSERT INTO `discount` VALUES (12, '12EXCCES', 155, '满减优惠券3', '满40减4', '0', 4, 40);
INSERT INTO `discount` VALUES (13, '13EXCCES', 68, '满减优惠券4', '满60减5', '1', 5, 60);
INSERT INTO `discount` VALUES (14, '14EXCCES', 99, '满减优惠券4', '满60减5', '1', 5, 60);
INSERT INTO `discount` VALUES (15, '15EXCCES', 141, '满减优惠券4', '满60减5', '1', 5, 60);
INSERT INTO `discount` VALUES (16, '16EXCCES', 160, '满减优惠券4', '满60减5', '1', 5, 60);
INSERT INTO `discount` VALUES (17, '17EXCCES', 136, '满减优惠券5', '满100减11', '1', 11, 100);
INSERT INTO `discount` VALUES (18, '18EXCCES', 21, '满减优惠券5', '满100减11', '1', 11, 100);
INSERT INTO `discount` VALUES (19, '19EXCCES', 171, '满减优惠券5', '满100减11', '1', 11, 100);
INSERT INTO `discount` VALUES (20, '20EXCCES', 176, '满减优惠券5', '满100减11', '1', 11, 100);
INSERT INTO `discount` VALUES (21, '21EXCCES', 168, '节日特券1', '满160减40', '0', 40, 160);

-- ----------------------------
-- Table structure for evaluate1
-- ----------------------------
DROP TABLE IF EXISTS `evaluate1`;
CREATE TABLE `evaluate1`  (
  `e_recordid` int(11) NOT NULL AUTO_INCREMENT,
  `e_evaluate` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_id` int(11) NULL DEFAULT NULL,
  `g_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`e_recordid`) USING BTREE,
  INDEX `g_id`(`g_id`) USING BTREE,
  INDEX `u_id`(`u_id`) USING BTREE,
  CONSTRAINT `evaluate1_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `userinfo` (`u_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `evaluate1_ibfk_2` FOREIGN KEY (`g_id`) REFERENCES `goods` (`g_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 304 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of evaluate1
-- ----------------------------
INSERT INTO `evaluate1` VALUES (1, '味道一般', 178, 1);
INSERT INTO `evaluate1` VALUES (2, '是妈妈的味道', 69, 2);
INSERT INTO `evaluate1` VALUES (3, '是妈妈的味道', 122, 3);
INSERT INTO `evaluate1` VALUES (4, '差评', 192, 4);
INSERT INTO `evaluate1` VALUES (5, '和预想的不一样，味道非常好', 79, 5);
INSERT INTO `evaluate1` VALUES (6, '很赞', 40, 6);
INSERT INTO `evaluate1` VALUES (7, '差评', 160, 7);
INSERT INTO `evaluate1` VALUES (8, '差评', 61, 8);
INSERT INTO `evaluate1` VALUES (9, '和预想的不一样，味道非常好', 71, 9);
INSERT INTO `evaluate1` VALUES (10, '很好吃，什么时候会再次购买', 182, 10);
INSERT INTO `evaluate1` VALUES (11, '是妈妈的味道', 110, 11);
INSERT INTO `evaluate1` VALUES (12, '差评', 43, 12);
INSERT INTO `evaluate1` VALUES (13, '差评', 139, 13);
INSERT INTO `evaluate1` VALUES (14, '味道真的很不错', 104, 14);
INSERT INTO `evaluate1` VALUES (15, '好吃到哭', 29, 15);
INSERT INTO `evaluate1` VALUES (16, '味道好极了', 111, 16);
INSERT INTO `evaluate1` VALUES (17, '是妈妈的味道', 100, 17);
INSERT INTO `evaluate1` VALUES (18, '很nice', 56, 18);
INSERT INTO `evaluate1` VALUES (19, '味道好极了', 155, 19);
INSERT INTO `evaluate1` VALUES (20, '味道好极了', 98, 20);
INSERT INTO `evaluate1` VALUES (21, '味道好极了', 171, 21);
INSERT INTO `evaluate1` VALUES (22, '下一次还想吃', 45, 22);
INSERT INTO `evaluate1` VALUES (23, '味道很不错', 48, 23);
INSERT INTO `evaluate1` VALUES (24, '很赞', 186, 24);
INSERT INTO `evaluate1` VALUES (25, '和预想的不一样，味道非常好', 112, 25);
INSERT INTO `evaluate1` VALUES (26, '味道很不错', 16, 26);
INSERT INTO `evaluate1` VALUES (27, '味道好极了', 10, 27);
INSERT INTO `evaluate1` VALUES (28, '很nice', 193, 28);
INSERT INTO `evaluate1` VALUES (29, '味道一般', 183, 29);
INSERT INTO `evaluate1` VALUES (30, '差评', 94, 30);
INSERT INTO `evaluate1` VALUES (31, '味道真的很不错', 148, 31);
INSERT INTO `evaluate1` VALUES (32, '下一次还想吃', 111, 32);
INSERT INTO `evaluate1` VALUES (33, '和预想的不一样，味道非常好', 196, 33);
INSERT INTO `evaluate1` VALUES (34, '味道好极了', 33, 34);
INSERT INTO `evaluate1` VALUES (35, '是妈妈的味道', 37, 35);
INSERT INTO `evaluate1` VALUES (36, '以后工作忙了还会继续购买', 175, 36);
INSERT INTO `evaluate1` VALUES (37, '和预想的不一样，味道非常好', 151, 37);
INSERT INTO `evaluate1` VALUES (38, '好吃到哭', 85, 38);
INSERT INTO `evaluate1` VALUES (39, '味道好极了', 69, 39);
INSERT INTO `evaluate1` VALUES (40, '差评', 104, 40);
INSERT INTO `evaluate1` VALUES (41, '是妈妈的味道', 2, 41);
INSERT INTO `evaluate1` VALUES (42, '差评', 189, 42);
INSERT INTO `evaluate1` VALUES (43, '和预想的不一样，味道非常好', 82, 43);
INSERT INTO `evaluate1` VALUES (44, '好吃到哭', 58, 44);
INSERT INTO `evaluate1` VALUES (45, '好吃到哭', 152, 45);
INSERT INTO `evaluate1` VALUES (46, '以后工作忙了还会继续购买', 63, 46);
INSERT INTO `evaluate1` VALUES (47, '好吃到哭', 137, 47);
INSERT INTO `evaluate1` VALUES (48, '很nice', 179, 48);
INSERT INTO `evaluate1` VALUES (49, '以后工作忙了还会继续购买', 72, 49);
INSERT INTO `evaluate1` VALUES (50, '以后工作忙了还会继续购买', 27, 50);
INSERT INTO `evaluate1` VALUES (51, '味道好极了', 137, 51);
INSERT INTO `evaluate1` VALUES (52, '以后工作忙了还会继续购买', 93, 52);
INSERT INTO `evaluate1` VALUES (53, '很好吃，什么时候会再次购买', 198, 53);
INSERT INTO `evaluate1` VALUES (54, '好吃到哭', 163, 54);
INSERT INTO `evaluate1` VALUES (55, '味道一般', 16, 55);
INSERT INTO `evaluate1` VALUES (56, '很好吃，什么时候会再次购买', 94, 56);
INSERT INTO `evaluate1` VALUES (57, '和预想的不一样，味道非常好', 43, 57);
INSERT INTO `evaluate1` VALUES (58, '味道好极了', 135, 58);
INSERT INTO `evaluate1` VALUES (59, '下一次还想吃', 41, 59);
INSERT INTO `evaluate1` VALUES (60, '很赞', 188, 60);
INSERT INTO `evaluate1` VALUES (61, '和预想的不一样，味道非常好', 83, 61);
INSERT INTO `evaluate1` VALUES (62, '味道真的很不错', 40, 62);
INSERT INTO `evaluate1` VALUES (63, '味道一般', 173, 63);
INSERT INTO `evaluate1` VALUES (64, '下一次还想吃', 27, 64);
INSERT INTO `evaluate1` VALUES (65, '味道一般', 116, 65);
INSERT INTO `evaluate1` VALUES (66, '以后工作忙了还会继续购买', 86, 66);
INSERT INTO `evaluate1` VALUES (67, '好吃到哭', 30, 67);
INSERT INTO `evaluate1` VALUES (68, '下一次还想吃', 60, 68);
INSERT INTO `evaluate1` VALUES (69, '和预想的不一样，味道非常好', 174, 69);
INSERT INTO `evaluate1` VALUES (70, '味道真的很不错', 33, 70);
INSERT INTO `evaluate1` VALUES (71, '差评', 59, 71);
INSERT INTO `evaluate1` VALUES (72, '味道真的很不错', 115, 72);
INSERT INTO `evaluate1` VALUES (73, '味道很不错', 190, 73);
INSERT INTO `evaluate1` VALUES (74, '很好吃，什么时候会再次购买', 16, 74);
INSERT INTO `evaluate1` VALUES (75, '差评', 53, 75);
INSERT INTO `evaluate1` VALUES (76, '差评', 13, 76);
INSERT INTO `evaluate1` VALUES (77, '味道好极了', 188, 77);
INSERT INTO `evaluate1` VALUES (78, '以后工作忙了还会继续购买', 50, 78);
INSERT INTO `evaluate1` VALUES (79, '很赞', 33, 79);
INSERT INTO `evaluate1` VALUES (80, '差评', 196, 80);
INSERT INTO `evaluate1` VALUES (81, '好吃到哭', 141, 81);
INSERT INTO `evaluate1` VALUES (82, '差评', 167, 82);
INSERT INTO `evaluate1` VALUES (83, '味道很不错', 174, 83);
INSERT INTO `evaluate1` VALUES (84, '很nice', 49, 84);
INSERT INTO `evaluate1` VALUES (85, '味道一般', 83, 85);
INSERT INTO `evaluate1` VALUES (86, '好吃到哭', 153, 86);
INSERT INTO `evaluate1` VALUES (87, '很好吃，什么时候会再次购买', 30, 87);
INSERT INTO `evaluate1` VALUES (88, '以后工作忙了还会继续购买', 53, 88);
INSERT INTO `evaluate1` VALUES (89, '差评', 7, 89);
INSERT INTO `evaluate1` VALUES (90, '味道很不错', 172, 90);
INSERT INTO `evaluate1` VALUES (91, '以后工作忙了还会继续购买', 129, 91);
INSERT INTO `evaluate1` VALUES (92, '味道很不错', 188, 92);
INSERT INTO `evaluate1` VALUES (93, '好吃到哭', 65, 93);
INSERT INTO `evaluate1` VALUES (94, '好吃到哭', 111, 94);
INSERT INTO `evaluate1` VALUES (95, '味道好极了', 132, 95);
INSERT INTO `evaluate1` VALUES (96, '下一次还想吃', 134, 96);
INSERT INTO `evaluate1` VALUES (97, '很nice', 142, 97);
INSERT INTO `evaluate1` VALUES (98, '味道真的很不错', 55, 98);
INSERT INTO `evaluate1` VALUES (99, '味道真的很不错', 41, 99);
INSERT INTO `evaluate1` VALUES (100, '味道一般', 163, 100);
INSERT INTO `evaluate1` VALUES (101, '下一次还想吃', 57, 101);
INSERT INTO `evaluate1` VALUES (102, '味道好极了', 95, 102);
INSERT INTO `evaluate1` VALUES (103, '很赞', 72, 103);
INSERT INTO `evaluate1` VALUES (104, '味道真的很不错', 163, 104);
INSERT INTO `evaluate1` VALUES (105, '味道好极了', 108, 105);
INSERT INTO `evaluate1` VALUES (106, '很赞', 69, 106);
INSERT INTO `evaluate1` VALUES (107, '味道一般', 67, 107);
INSERT INTO `evaluate1` VALUES (108, '是妈妈的味道', 151, 108);
INSERT INTO `evaluate1` VALUES (109, '很nice', 165, 109);
INSERT INTO `evaluate1` VALUES (110, '味道好极了', 52, 110);
INSERT INTO `evaluate1` VALUES (111, '和预想的不一样，味道非常好', 176, 111);
INSERT INTO `evaluate1` VALUES (112, '下一次还想吃', 7, 112);
INSERT INTO `evaluate1` VALUES (113, '味道真的很不错', 22, 113);
INSERT INTO `evaluate1` VALUES (114, '味道好极了', 97, 114);
INSERT INTO `evaluate1` VALUES (115, '以后工作忙了还会继续购买', 143, 115);
INSERT INTO `evaluate1` VALUES (116, '味道真的很不错', 193, 116);
INSERT INTO `evaluate1` VALUES (117, '以后工作忙了还会继续购买', 180, 117);
INSERT INTO `evaluate1` VALUES (118, '好吃到哭', 100, 118);
INSERT INTO `evaluate1` VALUES (119, '味道真的很不错', 43, 119);
INSERT INTO `evaluate1` VALUES (120, '很赞', 179, 120);
INSERT INTO `evaluate1` VALUES (121, '很赞', 25, 121);
INSERT INTO `evaluate1` VALUES (122, '味道真的很不错', 109, 122);
INSERT INTO `evaluate1` VALUES (123, '差评', 46, 123);
INSERT INTO `evaluate1` VALUES (124, '味道一般', 181, 124);
INSERT INTO `evaluate1` VALUES (125, '差评', 133, 125);
INSERT INTO `evaluate1` VALUES (126, '好吃到哭', 88, 126);
INSERT INTO `evaluate1` VALUES (127, '很好吃，什么时候会再次购买', 4, 127);
INSERT INTO `evaluate1` VALUES (128, '很赞', 78, 128);
INSERT INTO `evaluate1` VALUES (129, '很nice', 40, 129);
INSERT INTO `evaluate1` VALUES (130, '以后工作忙了还会继续购买', 127, 130);
INSERT INTO `evaluate1` VALUES (131, '很赞', 42, 131);
INSERT INTO `evaluate1` VALUES (132, '很好吃，什么时候会再次购买', 193, 132);
INSERT INTO `evaluate1` VALUES (133, '差评', 18, 133);
INSERT INTO `evaluate1` VALUES (134, '下一次还想吃', 139, 134);
INSERT INTO `evaluate1` VALUES (135, '是妈妈的味道', 39, 135);
INSERT INTO `evaluate1` VALUES (136, '以后工作忙了还会继续购买', 75, 136);
INSERT INTO `evaluate1` VALUES (137, '很nice', 131, 137);
INSERT INTO `evaluate1` VALUES (138, '很nice', 23, 138);
INSERT INTO `evaluate1` VALUES (139, '味道一般', 56, 139);
INSERT INTO `evaluate1` VALUES (140, '是妈妈的味道', 68, 140);
INSERT INTO `evaluate1` VALUES (141, '味道一般', 142, 141);
INSERT INTO `evaluate1` VALUES (142, '很nice', 1, 142);
INSERT INTO `evaluate1` VALUES (143, '是妈妈的味道', 2, 143);
INSERT INTO `evaluate1` VALUES (144, '味道一般', 64, 144);
INSERT INTO `evaluate1` VALUES (145, '很好吃，什么时候会再次购买', 45, 145);
INSERT INTO `evaluate1` VALUES (146, '和预想的不一样，味道非常好', 69, 146);
INSERT INTO `evaluate1` VALUES (147, '很赞', 16, 147);
INSERT INTO `evaluate1` VALUES (148, '很赞', 169, 148);
INSERT INTO `evaluate1` VALUES (149, '和预想的不一样，味道非常好', 47, 149);
INSERT INTO `evaluate1` VALUES (150, '以后工作忙了还会继续购买', 111, 150);
INSERT INTO `evaluate1` VALUES (151, '是妈妈的味道', 157, 151);
INSERT INTO `evaluate1` VALUES (152, '是妈妈的味道', 59, 152);
INSERT INTO `evaluate1` VALUES (153, '很好吃，什么时候会再次购买', 109, 153);
INSERT INTO `evaluate1` VALUES (154, '以后工作忙了还会继续购买', 125, 154);
INSERT INTO `evaluate1` VALUES (155, '差评', 91, 155);
INSERT INTO `evaluate1` VALUES (156, '好吃到哭', 108, 156);
INSERT INTO `evaluate1` VALUES (157, '味道很不错', 132, 157);
INSERT INTO `evaluate1` VALUES (158, '差评', 95, 158);
INSERT INTO `evaluate1` VALUES (159, '味道真的很不错', 178, 159);
INSERT INTO `evaluate1` VALUES (160, '很nice', 61, 160);
INSERT INTO `evaluate1` VALUES (161, '下一次还想吃', 187, 161);
INSERT INTO `evaluate1` VALUES (162, '很赞', 196, 162);
INSERT INTO `evaluate1` VALUES (163, '味道一般', 20, 163);
INSERT INTO `evaluate1` VALUES (164, '很赞', 9, 164);
INSERT INTO `evaluate1` VALUES (165, '差评', 166, 165);
INSERT INTO `evaluate1` VALUES (166, '很nice', 74, 166);
INSERT INTO `evaluate1` VALUES (167, '下一次还想吃', 29, 167);
INSERT INTO `evaluate1` VALUES (168, '味道很不错', 1, 168);
INSERT INTO `evaluate1` VALUES (169, '味道真的很不错', 93, 169);
INSERT INTO `evaluate1` VALUES (170, '味道好极了', 17, 170);
INSERT INTO `evaluate1` VALUES (171, '是妈妈的味道', 95, 171);
INSERT INTO `evaluate1` VALUES (172, '以后工作忙了还会继续购买', 33, 172);
INSERT INTO `evaluate1` VALUES (173, '味道好极了', 179, 173);
INSERT INTO `evaluate1` VALUES (174, '很赞', 133, 174);
INSERT INTO `evaluate1` VALUES (175, '好吃到哭', 44, 175);
INSERT INTO `evaluate1` VALUES (176, '味道真的很不错', 11, 176);
INSERT INTO `evaluate1` VALUES (177, '好吃到哭', 126, 177);
INSERT INTO `evaluate1` VALUES (178, '味道一般', 79, 178);
INSERT INTO `evaluate1` VALUES (179, '很nice', 157, 179);
INSERT INTO `evaluate1` VALUES (180, '下一次还想吃', 166, 180);
INSERT INTO `evaluate1` VALUES (181, '差评', 22, 181);
INSERT INTO `evaluate1` VALUES (182, '很赞', 151, 182);
INSERT INTO `evaluate1` VALUES (183, '差评', 127, 183);
INSERT INTO `evaluate1` VALUES (184, '味道很不错', 74, 184);
INSERT INTO `evaluate1` VALUES (185, '味道一般', 30, 185);
INSERT INTO `evaluate1` VALUES (186, '味道真的很不错', 143, 186);
INSERT INTO `evaluate1` VALUES (187, '和预想的不一样，味道非常好', 165, 187);
INSERT INTO `evaluate1` VALUES (188, '是妈妈的味道', 147, 188);
INSERT INTO `evaluate1` VALUES (189, '以后工作忙了还会继续购买', 128, 189);
INSERT INTO `evaluate1` VALUES (190, '味道一般', 39, 190);
INSERT INTO `evaluate1` VALUES (191, '很赞', 24, 191);
INSERT INTO `evaluate1` VALUES (192, '味道好极了', 64, 192);
INSERT INTO `evaluate1` VALUES (193, '味道好极了', 181, 193);
INSERT INTO `evaluate1` VALUES (194, '下一次还想吃', 96, 194);
INSERT INTO `evaluate1` VALUES (195, '是妈妈的味道', 164, 195);
INSERT INTO `evaluate1` VALUES (196, '味道很不错', 127, 196);
INSERT INTO `evaluate1` VALUES (197, '味道一般', 138, 197);
INSERT INTO `evaluate1` VALUES (198, '很赞', 15, 198);
INSERT INTO `evaluate1` VALUES (199, '味道很不错', 116, 199);
INSERT INTO `evaluate1` VALUES (200, '很好吃，什么时候会再次购买', 174, 200);
INSERT INTO `evaluate1` VALUES (201, '味道一般', 110, 1);
INSERT INTO `evaluate1` VALUES (202, '很nice', 33, 2);
INSERT INTO `evaluate1` VALUES (203, '是妈妈的味道', 166, 3);
INSERT INTO `evaluate1` VALUES (204, '味道一般', 192, 4);
INSERT INTO `evaluate1` VALUES (205, '很好吃，什么时候会再次购买', 72, 5);
INSERT INTO `evaluate1` VALUES (206, '和预想的不一样，味道非常好', 165, 6);
INSERT INTO `evaluate1` VALUES (207, '很赞', 40, 7);
INSERT INTO `evaluate1` VALUES (208, '很赞', 107, 8);
INSERT INTO `evaluate1` VALUES (209, '和预想的不一样，味道非常好', 13, 9);
INSERT INTO `evaluate1` VALUES (210, '以后工作忙了还会继续购买', 83, 10);
INSERT INTO `evaluate1` VALUES (211, '是妈妈的味道', 74, 11);
INSERT INTO `evaluate1` VALUES (212, '是妈妈的味道', 138, 12);
INSERT INTO `evaluate1` VALUES (213, '很好吃，什么时候会再次购买', 175, 13);
INSERT INTO `evaluate1` VALUES (214, '以后工作忙了还会继续购买', 15, 14);
INSERT INTO `evaluate1` VALUES (215, '差评', 117, 15);
INSERT INTO `evaluate1` VALUES (216, '好吃到哭', 116, 16);
INSERT INTO `evaluate1` VALUES (217, '味道很不错', 49, 17);
INSERT INTO `evaluate1` VALUES (218, '差评', 129, 18);
INSERT INTO `evaluate1` VALUES (219, '味道真的很不错', 25, 19);
INSERT INTO `evaluate1` VALUES (220, '很nice', 120, 20);
INSERT INTO `evaluate1` VALUES (221, '下一次还想吃', 198, 21);
INSERT INTO `evaluate1` VALUES (222, '很赞', 140, 22);
INSERT INTO `evaluate1` VALUES (223, '味道一般', 44, 23);
INSERT INTO `evaluate1` VALUES (224, '很赞', 186, 24);
INSERT INTO `evaluate1` VALUES (225, '差评', 170, 25);
INSERT INTO `evaluate1` VALUES (226, '好吃到哭', 145, 26);
INSERT INTO `evaluate1` VALUES (227, '味道真的很不错', 86, 27);
INSERT INTO `evaluate1` VALUES (228, '很赞', 127, 28);
INSERT INTO `evaluate1` VALUES (229, '很赞', 168, 29);
INSERT INTO `evaluate1` VALUES (230, '味道真的很不错', 143, 30);
INSERT INTO `evaluate1` VALUES (231, '差评', 90, 31);
INSERT INTO `evaluate1` VALUES (232, '味道一般', 193, 32);
INSERT INTO `evaluate1` VALUES (233, '差评', 11, 33);
INSERT INTO `evaluate1` VALUES (234, '好吃到哭', 177, 34);
INSERT INTO `evaluate1` VALUES (235, '很好吃，什么时候会再次购买', 79, 35);
INSERT INTO `evaluate1` VALUES (236, '很赞', 143, 36);
INSERT INTO `evaluate1` VALUES (237, '很nice', 176, 37);
INSERT INTO `evaluate1` VALUES (238, '以后工作忙了还会继续购买', 85, 38);
INSERT INTO `evaluate1` VALUES (239, '很赞', 69, 39);
INSERT INTO `evaluate1` VALUES (240, '很好吃，什么时候会再次购买', 36, 40);
INSERT INTO `evaluate1` VALUES (241, '差评', 80, 41);
INSERT INTO `evaluate1` VALUES (242, '下一次还想吃', 172, 42);
INSERT INTO `evaluate1` VALUES (243, '是妈妈的味道', 154, 43);
INSERT INTO `evaluate1` VALUES (244, '以后工作忙了还会继续购买', 67, 44);
INSERT INTO `evaluate1` VALUES (245, '很nice', 156, 45);
INSERT INTO `evaluate1` VALUES (246, '很nice', 59, 46);
INSERT INTO `evaluate1` VALUES (247, '味道一般', 148, 47);
INSERT INTO `evaluate1` VALUES (248, '是妈妈的味道', 60, 48);
INSERT INTO `evaluate1` VALUES (249, '味道一般', 137, 49);
INSERT INTO `evaluate1` VALUES (250, '很nice', 197, 50);
INSERT INTO `evaluate1` VALUES (251, '是妈妈的味道', 73, 51);
INSERT INTO `evaluate1` VALUES (252, '味道一般', 21, 52);
INSERT INTO `evaluate1` VALUES (253, '很好吃，什么时候会再次购买', 139, 53);
INSERT INTO `evaluate1` VALUES (254, '和预想的不一样，味道非常好', 186, 54);
INSERT INTO `evaluate1` VALUES (255, '很赞', 10, 55);
INSERT INTO `evaluate1` VALUES (256, '很赞', 176, 56);
INSERT INTO `evaluate1` VALUES (257, '和预想的不一样，味道非常好', 189, 57);
INSERT INTO `evaluate1` VALUES (258, '以后工作忙了还会继续购买', 81, 58);
INSERT INTO `evaluate1` VALUES (259, '是妈妈的味道', 158, 59);
INSERT INTO `evaluate1` VALUES (260, '是妈妈的味道', 85, 60);
INSERT INTO `evaluate1` VALUES (261, '很好吃，什么时候会再次购买', 166, 61);
INSERT INTO `evaluate1` VALUES (262, '以后工作忙了还会继续购买', 149, 62);
INSERT INTO `evaluate1` VALUES (263, '差评', 130, 63);
INSERT INTO `evaluate1` VALUES (264, '好吃到哭', 44, 64);
INSERT INTO `evaluate1` VALUES (265, '味道很不错', 39, 65);
INSERT INTO `evaluate1` VALUES (266, '差评', 15, 66);
INSERT INTO `evaluate1` VALUES (267, '味道真的很不错', 199, 67);
INSERT INTO `evaluate1` VALUES (268, '很nice', 97, 68);
INSERT INTO `evaluate1` VALUES (269, '下一次还想吃', 137, 69);
INSERT INTO `evaluate1` VALUES (270, '很赞', 64, 70);
INSERT INTO `evaluate1` VALUES (271, '味道一般', 36, 71);
INSERT INTO `evaluate1` VALUES (272, '很赞', 124, 72);
INSERT INTO `evaluate1` VALUES (273, '差评', 116, 73);
INSERT INTO `evaluate1` VALUES (274, '很nice', 120, 74);
INSERT INTO `evaluate1` VALUES (275, '下一次还想吃', 186, 75);
INSERT INTO `evaluate1` VALUES (276, '味道很不错', 131, 76);
INSERT INTO `evaluate1` VALUES (277, '味道真的很不错', 155, 77);
INSERT INTO `evaluate1` VALUES (278, '味道好极了', 72, 78);
INSERT INTO `evaluate1` VALUES (279, '是妈妈的味道', 23, 79);
INSERT INTO `evaluate1` VALUES (280, '以后工作忙了还会继续购买', 151, 80);
INSERT INTO `evaluate1` VALUES (281, '味道好极了', 179, 81);
INSERT INTO `evaluate1` VALUES (282, '很赞', 48, 82);
INSERT INTO `evaluate1` VALUES (283, '好吃到哭', 121, 83);
INSERT INTO `evaluate1` VALUES (284, '味道真的很不错', 144, 84);
INSERT INTO `evaluate1` VALUES (285, '好吃到哭', 177, 85);
INSERT INTO `evaluate1` VALUES (286, '味道一般', 62, 86);
INSERT INTO `evaluate1` VALUES (287, '很nice', 188, 87);
INSERT INTO `evaluate1` VALUES (288, '下一次还想吃', 86, 88);
INSERT INTO `evaluate1` VALUES (289, '差评', 83, 89);
INSERT INTO `evaluate1` VALUES (290, '很赞', 77, 90);
INSERT INTO `evaluate1` VALUES (291, '差评', 151, 91);
INSERT INTO `evaluate1` VALUES (292, '味道很不错', 85, 92);
INSERT INTO `evaluate1` VALUES (293, '味道一般', 126, 93);
INSERT INTO `evaluate1` VALUES (294, '味道真的很不错', 102, 94);
INSERT INTO `evaluate1` VALUES (295, '和预想的不一样，味道非常好', 65, 95);
INSERT INTO `evaluate1` VALUES (296, '是妈妈的味道', 172, 96);
INSERT INTO `evaluate1` VALUES (297, '以后工作忙了还会继续购买', 135, 97);
INSERT INTO `evaluate1` VALUES (298, '味道一般', 117, 98);
INSERT INTO `evaluate1` VALUES (299, '很赞', 25, 99);
INSERT INTO `evaluate1` VALUES (300, '味道好极了', 162, 100);
INSERT INTO `evaluate1` VALUES (301, '味道好极了', 6, 101);
INSERT INTO `evaluate1` VALUES (302, '下一次还想吃', 130, 102);
INSERT INTO `evaluate1` VALUES (303, '是妈妈的味道', 75, 103);

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `g_id` int(11) NOT NULL AUTO_INCREMENT,
  `g_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `g_price` decimal(8, 2) NULL DEFAULT NULL,
  `g_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `g_dprice` decimal(8, 2) NULL DEFAULT NULL,
  `g_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `g_coupon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `m_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`g_id`) USING BTREE,
  INDEX `m_id`(`m_id`) USING BTREE,
  CONSTRAINT `goods_ibfk_1` FOREIGN KEY (`m_id`) REFERENCES `mer` (`m_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 201 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (1, '多人套餐', 61.00, '5:00-23:59', 57.95, '1.png', '0', 1);
INSERT INTO `goods` VALUES (2, '宫保鸡丁', 80.00, '5:00-23:59', 76.00, '2.png', '1', 1);
INSERT INTO `goods` VALUES (3, '情侣套餐', 88.00, '5:00-23:59', 83.60, '3.png', '1', 1);
INSERT INTO `goods` VALUES (4, '毛血旺', 75.00, '5:00-23:59', 71.25, '4.png', '1', 1);
INSERT INTO `goods` VALUES (5, '火爆双脆', 75.00, '5:00-23:59', 71.25, '5.png', '1', 1);
INSERT INTO `goods` VALUES (6, '糖醋排骨', 76.00, '5:00-23:59', 72.20, '6.png', '1', 1);
INSERT INTO `goods` VALUES (7, '松鼠鱼', 16.00, '5:00-23:59', 16.00, '7.png', '0', 1);
INSERT INTO `goods` VALUES (8, '回锅肉', 39.00, '5:00-23:59', 39.00, '8.png', '0', 1);
INSERT INTO `goods` VALUES (9, '儿童套餐', 37.00, '5:00-23:59', 37.00, '9.png', '0', 1);
INSERT INTO `goods` VALUES (10, '实惠套餐', 81.00, '5:00-23:59', 76.95, '10.png', '1', 1);
INSERT INTO `goods` VALUES (11, '一碗鲜', 78.00, '5:00-23:59', 74.10, '11.png', '1', 2);
INSERT INTO `goods` VALUES (12, '脆皮烤鸭', 23.00, '5:00-23:59', 23.00, '12.png', '0', 2);
INSERT INTO `goods` VALUES (13, '奶茶', 16.00, '5:00-23:59', 16.00, '13.png', '0', 2);
INSERT INTO `goods` VALUES (14, '百味一盅', 71.00, '5:00-23:59', 67.45, '14.png', '1', 2);
INSERT INTO `goods` VALUES (15, '鲜拌鸡胗', 13.00, '5:00-23:59', 13.00, '15.png', '0', 2);
INSERT INTO `goods` VALUES (16, '白切鸡', 13.00, '5:00-23:59', 13.00, '16.png', '0', 2);
INSERT INTO `goods` VALUES (17, '火爆腰花', 84.00, '5:00-23:59', 79.80, '17.png', '1', 2);
INSERT INTO `goods` VALUES (18, '鲍鱼', 80.00, '5:00-23:59', 76.00, '18.png', '1', 2);
INSERT INTO `goods` VALUES (19, '福蛋', 57.00, '5:00-23:59', 57.00, '19.png', '0', 2);
INSERT INTO `goods` VALUES (20, '美味多拼', 56.00, '5:00-23:59', 56.00, '20.png', '0', 2);
INSERT INTO `goods` VALUES (21, '多人套餐', 12.00, '5:00-23:59', 12.00, '1.png', '0', 3);
INSERT INTO `goods` VALUES (22, '宫保鸡丁', 29.00, '5:00-23:59', 29.00, '2.png', '0', 3);
INSERT INTO `goods` VALUES (23, '情侣套餐', 77.00, '5:00-23:59', 73.15, '3.png', '1', 3);
INSERT INTO `goods` VALUES (24, '毛血旺', 68.00, '5:00-23:59', 64.60, '4.png', '1', 3);
INSERT INTO `goods` VALUES (25, '火爆双脆', 73.00, '5:00-23:59', 69.35, '5.png', '1', 3);
INSERT INTO `goods` VALUES (26, '糖醋排骨', 77.00, '5:00-23:59', 73.15, '6.png', '1', 3);
INSERT INTO `goods` VALUES (27, '松鼠鱼', 58.00, '5:00-23:59', 58.00, '7.png', '0', 3);
INSERT INTO `goods` VALUES (28, ' 回锅肉', 79.00, '5:00-23:59', 75.05, '8.png', '1', 3);
INSERT INTO `goods` VALUES (29, ' 儿童套餐', 70.00, '5:00-23:59', 66.50, '9.png', '1', 3);
INSERT INTO `goods` VALUES (30, ' 实惠套餐', 52.00, '5:00-23:59', 52.00, '10.png', '0', 3);
INSERT INTO `goods` VALUES (31, ' 一碗鲜', 19.00, '5:00-23:59', 19.00, '11.png', '0', 4);
INSERT INTO `goods` VALUES (32, '脆皮烤鸭', 41.00, '5:00-23:59', 41.00, '12.png', '0', 4);
INSERT INTO `goods` VALUES (33, '奶茶', 87.00, '5:00-23:59', 82.65, '13.png', '1', 4);
INSERT INTO `goods` VALUES (34, '百味一盅', 19.00, '5:00-23:59', 19.00, '14.png', '0', 4);
INSERT INTO `goods` VALUES (35, '鲜拌鸡胗', 53.00, '5:00-23:59', 53.00, '15.png', '0', 4);
INSERT INTO `goods` VALUES (36, '白切鸡', 55.00, '5:00-23:59', 55.00, '16.png', '0', 4);
INSERT INTO `goods` VALUES (37, '火爆腰花', 42.00, '5:00-23:59', 42.00, '17.png', '0', 4);
INSERT INTO `goods` VALUES (38, '鲍鱼', 42.00, '5:00-23:59', 42.00, '18.png', '0', 4);
INSERT INTO `goods` VALUES (39, '福蛋', 69.00, '5:00-23:59', 65.55, '19.png', '1', 4);
INSERT INTO `goods` VALUES (40, '美味多拼', 84.00, '5:00-23:59', 79.80, '20.png', '1', 4);
INSERT INTO `goods` VALUES (41, '多人套餐', 64.00, '5:00-23:59', 60.80, '1.png', '1', 5);
INSERT INTO `goods` VALUES (42, '宫保鸡丁', 39.00, '5:00-23:59', 39.00, '2.png', '0', 5);
INSERT INTO `goods` VALUES (43, '情侣套餐', 81.00, '5:00-23:59', 76.95, '3.png', '1', 5);
INSERT INTO `goods` VALUES (44, '毛血旺', 85.00, '5:00-23:59', 80.75, '4.png', '1', 5);
INSERT INTO `goods` VALUES (45, '火爆双脆', 53.00, '5:00-23:59', 53.00, '5.png', '0', 5);
INSERT INTO `goods` VALUES (46, '糖醋排骨', 41.00, '5:00-23:59', 41.00, '6.png', '0', 5);
INSERT INTO `goods` VALUES (47, '松鼠鱼', 24.00, '5:00-23:59', 24.00, '7.png', '0', 5);
INSERT INTO `goods` VALUES (48, ' 回锅肉', 87.00, '5:00-23:59', 82.65, '8.png', '1', 5);
INSERT INTO `goods` VALUES (49, ' 儿童套餐', 10.00, '5:00-23:59', 10.00, '9.png', '0', 5);
INSERT INTO `goods` VALUES (50, ' 实惠套餐', 86.00, '5:00-23:59', 81.70, '10.png', '1', 5);
INSERT INTO `goods` VALUES (51, ' 一碗鲜', 85.00, '5:00-23:59', 80.75, '11.png', '1', 6);
INSERT INTO `goods` VALUES (52, '脆皮烤鸭', 40.00, '5:00-23:59', 40.00, '12.png', '0', 6);
INSERT INTO `goods` VALUES (53, '奶茶', 52.00, '5:00-23:59', 52.00, '13.png', '0', 6);
INSERT INTO `goods` VALUES (54, '百味一盅', 21.00, '5:00-23:59', 21.00, '14.png', '0', 6);
INSERT INTO `goods` VALUES (55, '鲜拌鸡胗', 54.00, '5:00-23:59', 54.00, '15.png', '0', 6);
INSERT INTO `goods` VALUES (56, '白切鸡', 14.00, '5:00-23:59', 14.00, '16.png', '0', 6);
INSERT INTO `goods` VALUES (57, '火爆腰花', 30.00, '5:00-23:59', 30.00, '17.png', '0', 6);
INSERT INTO `goods` VALUES (58, '鲍鱼', 24.00, '5:00-23:59', 24.00, '18.png', '0', 6);
INSERT INTO `goods` VALUES (59, '福蛋', 12.00, '5:00-23:59', 12.00, '19.png', '0', 6);
INSERT INTO `goods` VALUES (60, '美味多拼', 40.00, '5:00-23:59', 40.00, '20.png', '0', 6);
INSERT INTO `goods` VALUES (61, '多人套餐', 41.00, '5:00-23:59', 41.00, '1.png', '0', 7);
INSERT INTO `goods` VALUES (62, '宫保鸡丁', 10.00, '5:00-23:59', 10.00, '2.png', '0', 7);
INSERT INTO `goods` VALUES (63, '情侣套餐', 75.00, '5:00-23:59', 71.25, '3.png', '1', 7);
INSERT INTO `goods` VALUES (64, '毛血旺', 47.00, '5:00-23:59', 47.00, '4.png', '0', 7);
INSERT INTO `goods` VALUES (65, '火爆双脆', 67.00, '5:00-23:59', 63.65, '5.png', '1', 7);
INSERT INTO `goods` VALUES (66, '糖醋排骨', 65.00, '5:00-23:59', 61.75, '6.png', '1', 7);
INSERT INTO `goods` VALUES (67, '松鼠鱼', 49.00, '5:00-23:59', 49.00, '7.png', '0', 7);
INSERT INTO `goods` VALUES (68, ' 回锅肉', 72.00, '5:00-23:59', 68.40, '8.png', '1', 7);
INSERT INTO `goods` VALUES (69, ' 儿童套餐', 69.00, '5:00-23:59', 65.55, '9.png', '1', 7);
INSERT INTO `goods` VALUES (70, ' 实惠套餐', 80.00, '5:00-23:59', 76.00, '10.png', '1', 7);
INSERT INTO `goods` VALUES (71, ' 一碗鲜', 36.00, '5:00-23:59', 36.00, '11.png', '0', 8);
INSERT INTO `goods` VALUES (72, '脆皮烤鸭', 89.00, '5:00-23:59', 84.55, '12.png', '1', 8);
INSERT INTO `goods` VALUES (73, '奶茶', 23.00, '5:00-23:59', 23.00, '13.png', '0', 8);
INSERT INTO `goods` VALUES (74, '百味一盅', 12.00, '5:00-23:59', 12.00, '14.png', '0', 8);
INSERT INTO `goods` VALUES (75, '鲜拌鸡胗', 35.00, '5:00-23:59', 35.00, '15.png', '0', 8);
INSERT INTO `goods` VALUES (76, '白切鸡', 85.00, '5:00-23:59', 80.75, '16.png', '1', 8);
INSERT INTO `goods` VALUES (77, '火爆腰花', 14.00, '5:00-23:59', 14.00, '17.png', '0', 8);
INSERT INTO `goods` VALUES (78, '鲍鱼', 73.00, '5:00-23:59', 69.35, '18.png', '1', 8);
INSERT INTO `goods` VALUES (79, '福蛋', 14.00, '5:00-23:59', 14.00, '19.png', '0', 8);
INSERT INTO `goods` VALUES (80, '美味多拼', 70.00, '5:00-23:59', 66.50, '20.png', '1', 8);
INSERT INTO `goods` VALUES (81, '多人套餐', 38.00, '5:00-23:59', 38.00, '1.png', '0', 9);
INSERT INTO `goods` VALUES (82, '宫保鸡丁', 32.00, '5:00-23:59', 32.00, '2.png', '0', 9);
INSERT INTO `goods` VALUES (83, '情侣套餐', 66.00, '5:00-23:59', 62.70, '3.png', '1', 9);
INSERT INTO `goods` VALUES (84, '毛血旺', 54.00, '5:00-23:59', 54.00, '4.png', '0', 9);
INSERT INTO `goods` VALUES (85, '火爆双脆', 26.00, '5:00-23:59', 26.00, '5.png', '0', 9);
INSERT INTO `goods` VALUES (86, '糖醋排骨', 79.00, '5:00-23:59', 75.05, '6.png', '1', 9);
INSERT INTO `goods` VALUES (87, '松鼠鱼', 12.00, '5:00-23:59', 12.00, '7.png', '0', 9);
INSERT INTO `goods` VALUES (88, ' 回锅肉', 42.00, '5:00-23:59', 42.00, '8.png', '0', 9);
INSERT INTO `goods` VALUES (89, ' 儿童套餐', 48.00, '5:00-23:59', 48.00, '9.png', '0', 9);
INSERT INTO `goods` VALUES (90, ' 实惠套餐', 61.00, '5:00-23:59', 57.95, '10.png', '0', 9);
INSERT INTO `goods` VALUES (91, ' 一碗鲜', 15.00, '5:00-23:59', 15.00, '11.png', '0', 10);
INSERT INTO `goods` VALUES (92, '脆皮烤鸭', 76.00, '5:00-23:59', 72.20, '12.png', '1', 10);
INSERT INTO `goods` VALUES (93, '奶茶', 82.00, '5:00-23:59', 77.90, '13.png', '1', 10);
INSERT INTO `goods` VALUES (94, '百味一盅', 40.00, '5:00-23:59', 40.00, '14.png', '0', 10);
INSERT INTO `goods` VALUES (95, '鲜拌鸡胗', 17.00, '5:00-23:59', 17.00, '15.png', '0', 10);
INSERT INTO `goods` VALUES (96, '白切鸡', 67.00, '5:00-23:59', 63.65, '16.png', '1', 10);
INSERT INTO `goods` VALUES (97, '火爆腰花', 55.00, '5:00-23:59', 55.00, '17.png', '0', 10);
INSERT INTO `goods` VALUES (98, '鲍鱼', 29.00, '5:00-23:59', 29.00, '18.png', '0', 10);
INSERT INTO `goods` VALUES (99, '福蛋', 63.00, '5:00-23:59', 59.85, '19.png', '0', 10);
INSERT INTO `goods` VALUES (100, '美味多拼', 65.00, '5:00-23:59', 61.75, '20.png', '1', 10);
INSERT INTO `goods` VALUES (101, '多人套餐', 32.00, '5:00-23:59', 32.00, '1.png', '0', 11);
INSERT INTO `goods` VALUES (102, '宫保鸡丁', 35.00, '5:00-23:59', 35.00, '2.png', '0', 11);
INSERT INTO `goods` VALUES (103, '情侣套餐', 65.00, '5:00-23:59', 61.75, '3.png', '1', 11);
INSERT INTO `goods` VALUES (104, '毛血旺', 25.00, '5:00-23:59', 25.00, '4.png', '0', 11);
INSERT INTO `goods` VALUES (105, '火爆双脆', 78.00, '5:00-23:59', 74.10, '5.png', '1', 11);
INSERT INTO `goods` VALUES (106, '糖醋排骨', 69.00, '5:00-23:59', 65.55, '6.png', '1', 11);
INSERT INTO `goods` VALUES (107, '松鼠鱼', 57.00, '5:00-23:59', 57.00, '7.png', '0', 11);
INSERT INTO `goods` VALUES (108, ' 回锅肉', 74.00, '5:00-23:59', 70.30, '8.png', '1', 11);
INSERT INTO `goods` VALUES (109, ' 儿童套餐', 80.00, '5:00-23:59', 76.00, '9.png', '1', 11);
INSERT INTO `goods` VALUES (110, ' 实惠套餐', 42.00, '5:00-23:59', 42.00, '10.png', '0', 11);
INSERT INTO `goods` VALUES (111, ' 一碗鲜', 20.00, '5:00-23:59', 20.00, '11.png', '0', 12);
INSERT INTO `goods` VALUES (112, '脆皮烤鸭', 13.00, '5:00-23:59', 13.00, '12.png', '0', 12);
INSERT INTO `goods` VALUES (113, '奶茶', 10.00, '5:00-23:59', 10.00, '13.png', '0', 12);
INSERT INTO `goods` VALUES (114, '百味一盅', 19.00, '5:00-23:59', 19.00, '14.png', '0', 12);
INSERT INTO `goods` VALUES (115, '鲜拌鸡胗', 51.00, '5:00-23:59', 51.00, '15.png', '0', 12);
INSERT INTO `goods` VALUES (116, '白切鸡', 23.00, '5:00-23:59', 23.00, '16.png', '0', 12);
INSERT INTO `goods` VALUES (117, '火爆腰花', 18.00, '5:00-23:59', 18.00, '17.png', '0', 12);
INSERT INTO `goods` VALUES (118, '鲍鱼', 32.00, '5:00-23:59', 32.00, '18.png', '0', 12);
INSERT INTO `goods` VALUES (119, '福蛋', 67.00, '5:00-23:59', 63.65, '19.png', '1', 12);
INSERT INTO `goods` VALUES (120, '美味多拼', 27.00, '5:00-23:59', 27.00, '20.png', '0', 12);
INSERT INTO `goods` VALUES (121, '多人套餐', 52.00, '5:00-23:59', 52.00, '1.png', '0', 13);
INSERT INTO `goods` VALUES (122, '宫保鸡丁', 31.00, '5:00-23:59', 31.00, '2.png', '0', 13);
INSERT INTO `goods` VALUES (123, '情侣套餐', 72.00, '5:00-23:59', 68.40, '3.png', '1', 13);
INSERT INTO `goods` VALUES (124, '毛血旺', 15.00, '5:00-23:59', 15.00, '4.png', '0', 13);
INSERT INTO `goods` VALUES (125, '火爆双脆', 86.00, '5:00-23:59', 81.70, '5.png', '1', 13);
INSERT INTO `goods` VALUES (126, '糖醋排骨', 34.00, '5:00-23:59', 34.00, '6.png', '0', 13);
INSERT INTO `goods` VALUES (127, '松鼠鱼', 41.00, '5:00-23:59', 41.00, '7.png', '0', 13);
INSERT INTO `goods` VALUES (128, ' 回锅肉', 89.00, '5:00-23:59', 84.55, '8.png', '1', 13);
INSERT INTO `goods` VALUES (129, ' 儿童套餐', 53.00, '5:00-23:59', 53.00, '9.png', '0', 13);
INSERT INTO `goods` VALUES (130, ' 实惠套餐', 28.00, '5:00-23:59', 28.00, '10.png', '0', 13);
INSERT INTO `goods` VALUES (131, ' 一碗鲜', 68.00, '5:00-23:59', 64.60, '11.png', '1', 14);
INSERT INTO `goods` VALUES (132, '脆皮烤鸭', 87.00, '5:00-23:59', 82.65, '12.png', '1', 14);
INSERT INTO `goods` VALUES (133, '奶茶', 46.00, '5:00-23:59', 46.00, '13.png', '0', 14);
INSERT INTO `goods` VALUES (134, '百味一盅', 56.00, '5:00-23:59', 56.00, '14.png', '0', 14);
INSERT INTO `goods` VALUES (135, '鲜拌鸡胗', 82.00, '5:00-23:59', 77.90, '15.png', '1', 14);
INSERT INTO `goods` VALUES (136, '白切鸡', 40.00, '5:00-23:59', 40.00, '16.png', '0', 14);
INSERT INTO `goods` VALUES (137, '火爆腰花', 89.00, '5:00-23:59', 84.55, '17.png', '1', 14);
INSERT INTO `goods` VALUES (138, '鲍鱼', 85.00, '5:00-23:59', 80.75, '18.png', '1', 14);
INSERT INTO `goods` VALUES (139, '福蛋', 37.00, '5:00-23:59', 37.00, '19.png', '0', 14);
INSERT INTO `goods` VALUES (140, '美味多拼', 73.00, '5:00-23:59', 69.35, '20.png', '1', 14);
INSERT INTO `goods` VALUES (141, '多人套餐', 15.00, '5:00-23:59', 15.00, '1.png', '0', 15);
INSERT INTO `goods` VALUES (142, '宫保鸡丁', 50.00, '5:00-23:59', 50.00, '2.png', '0', 15);
INSERT INTO `goods` VALUES (143, '情侣套餐', 62.00, '5:00-23:59', 58.90, '3.png', '0', 15);
INSERT INTO `goods` VALUES (144, '毛血旺', 79.00, '5:00-23:59', 75.05, '4.png', '1', 15);
INSERT INTO `goods` VALUES (145, '火爆双脆', 44.00, '5:00-23:59', 44.00, '5.png', '0', 15);
INSERT INTO `goods` VALUES (146, '糖醋排骨', 50.00, '5:00-23:59', 50.00, '6.png', '0', 15);
INSERT INTO `goods` VALUES (147, '松鼠鱼', 76.00, '5:00-23:59', 72.20, '7.png', '1', 15);
INSERT INTO `goods` VALUES (148, ' 回锅肉', 78.00, '5:00-23:59', 74.10, '8.png', '1', 15);
INSERT INTO `goods` VALUES (149, ' 儿童套餐', 31.00, '5:00-23:59', 31.00, '9.png', '0', 15);
INSERT INTO `goods` VALUES (150, ' 实惠套餐', 60.00, '5:00-23:59', 60.00, '10.png', '0', 15);
INSERT INTO `goods` VALUES (151, ' 一碗鲜', 15.00, '5:00-23:59', 15.00, '11.png', '0', 16);
INSERT INTO `goods` VALUES (152, '脆皮烤鸭', 21.00, '5:00-23:59', 21.00, '12.png', '0', 16);
INSERT INTO `goods` VALUES (153, '奶茶', 15.00, '5:00-23:59', 15.00, '13.png', '0', 16);
INSERT INTO `goods` VALUES (154, '百味一盅', 50.00, '5:00-23:59', 50.00, '14.png', '0', 16);
INSERT INTO `goods` VALUES (155, '鲜拌鸡胗', 10.00, '5:00-23:59', 10.00, '15.png', '0', 16);
INSERT INTO `goods` VALUES (156, '白切鸡', 39.00, '5:00-23:59', 39.00, '16.png', '0', 16);
INSERT INTO `goods` VALUES (157, '火爆腰花', 24.00, '5:00-23:59', 24.00, '17.png', '0', 16);
INSERT INTO `goods` VALUES (158, '鲍鱼', 76.00, '5:00-23:59', 72.20, '18.png', '1', 16);
INSERT INTO `goods` VALUES (159, '福蛋', 22.00, '5:00-23:59', 22.00, '19.png', '0', 16);
INSERT INTO `goods` VALUES (160, '美味多拼', 54.00, '5:00-23:59', 54.00, '20.png', '0', 16);
INSERT INTO `goods` VALUES (161, '多人套餐', 35.00, '5:00-23:59', 35.00, '1.png', '0', 17);
INSERT INTO `goods` VALUES (162, '宫保鸡丁', 65.00, '5:00-23:59', 61.75, '2.png', '1', 17);
INSERT INTO `goods` VALUES (163, '情侣套餐', 19.00, '5:00-23:59', 19.00, '3.png', '0', 17);
INSERT INTO `goods` VALUES (164, '毛血旺', 45.00, '5:00-23:59', 45.00, '4.png', '0', 17);
INSERT INTO `goods` VALUES (165, '火爆双脆', 19.00, '5:00-23:59', 19.00, '5.png', '0', 17);
INSERT INTO `goods` VALUES (166, '糖醋排骨', 65.00, '5:00-23:59', 61.75, '6.png', '1', 17);
INSERT INTO `goods` VALUES (167, '松鼠鱼', 25.00, '5:00-23:59', 25.00, '7.png', '0', 17);
INSERT INTO `goods` VALUES (168, ' 回锅肉', 74.00, '5:00-23:59', 70.30, '8.png', '1', 17);
INSERT INTO `goods` VALUES (169, ' 儿童套餐', 12.00, '5:00-23:59', 12.00, '9.png', '0', 17);
INSERT INTO `goods` VALUES (170, ' 实惠套餐', 49.00, '5:00-23:59', 49.00, '10.png', '0', 17);
INSERT INTO `goods` VALUES (171, ' 一碗鲜', 77.00, '5:00-23:59', 73.15, '11.png', '1', 18);
INSERT INTO `goods` VALUES (172, '脆皮烤鸭', 22.00, '5:00-23:59', 22.00, '12.png', '0', 18);
INSERT INTO `goods` VALUES (173, '奶茶', 14.00, '5:00-23:59', 14.00, '13.png', '0', 18);
INSERT INTO `goods` VALUES (174, '百味一盅', 67.00, '5:00-23:59', 63.65, '14.png', '1', 18);
INSERT INTO `goods` VALUES (175, '鲜拌鸡胗', 48.00, '5:00-23:59', 48.00, '15.png', '0', 18);
INSERT INTO `goods` VALUES (176, '白切鸡', 19.00, '5:00-23:59', 19.00, '16.png', '0', 18);
INSERT INTO `goods` VALUES (177, '火爆腰花', 63.00, '5:00-23:59', 59.85, '17.png', '0', 18);
INSERT INTO `goods` VALUES (178, '鲍鱼', 50.00, '5:00-23:59', 50.00, '18.png', '0', 18);
INSERT INTO `goods` VALUES (179, '福蛋', 17.00, '5:00-23:59', 17.00, '19.png', '0', 18);
INSERT INTO `goods` VALUES (180, '美味多拼', 49.00, '5:00-23:59', 49.00, '20.png', '0', 18);
INSERT INTO `goods` VALUES (181, '多人套餐', 38.00, '5:00-23:59', 38.00, '1.png', '0', 19);
INSERT INTO `goods` VALUES (182, '宫保鸡丁', 87.00, '5:00-23:59', 82.65, '2.png', '1', 19);
INSERT INTO `goods` VALUES (183, '情侣套餐', 51.00, '5:00-23:59', 51.00, '3.png', '0', 19);
INSERT INTO `goods` VALUES (184, '毛血旺', 44.00, '5:00-23:59', 44.00, '4.png', '0', 19);
INSERT INTO `goods` VALUES (185, '火爆双脆', 35.00, '5:00-23:59', 35.00, '5.png', '0', 19);
INSERT INTO `goods` VALUES (186, '糖醋排骨', 59.00, '5:00-23:59', 59.00, '6.png', '0', 19);
INSERT INTO `goods` VALUES (187, '松鼠鱼', 57.00, '5:00-23:59', 57.00, '7.png', '0', 19);
INSERT INTO `goods` VALUES (188, ' 回锅肉', 38.00, '5:00-23:59', 38.00, '8.png', '0', 19);
INSERT INTO `goods` VALUES (189, ' 儿童套餐', 45.00, '5:00-23:59', 45.00, '9.png', '0', 19);
INSERT INTO `goods` VALUES (190, ' 实惠套餐', 42.00, '5:00-23:59', 42.00, '10.png', '0', 19);
INSERT INTO `goods` VALUES (191, ' 一碗鲜', 29.00, '5:00-23:59', 29.00, '11.png', '0', 20);
INSERT INTO `goods` VALUES (192, '脆皮烤鸭', 76.00, '5:00-23:59', 72.20, '12.png', '1', 20);
INSERT INTO `goods` VALUES (193, '奶茶', 67.00, '5:00-23:59', 63.65, '13.png', '1', 20);
INSERT INTO `goods` VALUES (194, '百味一盅', 16.00, '5:00-23:59', 16.00, '14.png', '0', 20);
INSERT INTO `goods` VALUES (195, '鲜拌鸡胗', 16.00, '5:00-23:59', 16.00, '15.png', '0', 20);
INSERT INTO `goods` VALUES (196, '白切鸡', 24.00, '5:00-23:59', 24.00, '16.png', '0', 20);
INSERT INTO `goods` VALUES (197, '火爆腰花', 36.00, '5:00-23:59', 36.00, '17.png', '0', 20);
INSERT INTO `goods` VALUES (198, '鲍鱼', 67.00, '5:00-23:59', 63.65, '18.png', '1', 20);
INSERT INTO `goods` VALUES (199, '福蛋', 27.00, '5:00-23:59', 27.00, '19.png', '0', 20);
INSERT INTO `goods` VALUES (200, '美味多拼', 67.00, '5:00-23:59', 63.65, '20.png', '1', 20);

-- ----------------------------
-- Table structure for mer
-- ----------------------------
DROP TABLE IF EXISTS `mer`;
CREATE TABLE `mer`  (
  `m_id` int(11) NOT NULL AUTO_INCREMENT,
  `m_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `m_des` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `mt_id` int(11) NULL DEFAULT NULL,
  `m_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `m_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `m_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `m_isorder` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `e_recordid` int(11) NULL DEFAULT NULL,
  `b_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`m_id`) USING BTREE,
  INDEX `b_id`(`b_id`) USING BTREE,
  INDEX `mt_id`(`mt_id`) USING BTREE,
  CONSTRAINT `mer_ibfk_1` FOREIGN KEY (`mt_id`) REFERENCES `mertype` (`mt_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `mer_ibfk_2` FOREIGN KEY (`b_id`) REFERENCES `business` (`b_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of mer
-- ----------------------------
INSERT INTO `mer` VALUES (1, 'FlowerinessCafe佛洛力斯餐厅（大融城店）', '古茗期待打造一种极致日常化的喝茶体验，让每一个平凡的人，都能通过喝茶感受、享受当下，并且过得更开心，变得更好。日常化，绝不是快速与随便的。希望每一天的古茗茶饮，都能被喝出品质、细节，甚至是奇思妙想的惊喜。 每一杯古茗，都是“Have a good day!”的鼓励。', 10, '重庆市沙坪坝区大学城中路虎曾南段虎溪便民夜市A区31号门面', '13859376382', NULL, '1', 128, 62);
INSERT INTO `mer` VALUES (2, '布拉诺意大利餐厅（重庆时代店）', '我们的团队是一家全国连锁中西结合餐厅，24小时经营以港式粤菜为基础的中西融合菜，特聘香港融合菜大师主理，打造新派主题时尚餐厅。它专业的厨师团队，开发和研究新派融合菜，定期推出特色菜品，聘请专业艺术团队研发造型，让茉莉每一款菜品成为一件艺术品，让客人感受别样的饮食文化。\n', 22, '重庆市九龙坡区含谷镇含兴路24号', '15733552669', NULL, '1', 211, 1);
INSERT INTO `mer` VALUES (3, '豆花饭庄（鹅岭正街店）', '我们的团队深度开发新派精品新疆菜，涵括疆内各地特色美食、民族糕点，以弘扬传统饮食文化为已任，令您足不出户尝遍地道新疆特色菜肴！主营以新疆稀有珍品烹煮之精品佳肴，品位常新，应有尽有！', 2, '重庆市渝北区两江新区鸳鸯街道湖彩路118号光环购物公园L5层A-L5-03号', '18282273714', NULL, '1', 57, 27);
INSERT INTO `mer` VALUES (4, '古四老饭馆', '本店是正宗地道的香港美食品牌，自2006年成立以来一-直致力于传播原汁原味、独具特色的香港饮食文化。品牌承继传统港式茶餐厅特色，菜品丰富、口味独特。吃烧鹅，金翠河，享粵菜，可青睐。', 2, '渝中区邹容路100号重庆时代广场L6层L602', '15546704593', NULL, '1', 49, 24);
INSERT INTO `mer` VALUES (5, '古镇唐门饭庄', '我们的团队深度开发新派精品新疆菜，涵括疆内各地特色美食、民族糕点，以弘扬传统饮食文化为已任，令您足不出户尝遍地道新疆特色菜肴！主营以新疆稀有珍品烹煮之精品佳肴，品位常新，应有尽有！', 13, '重庆市九龙坡区谢家湾正街55号万象城4层86号', '13512038658', NULL, '1', 168, 81);
INSERT INTO `mer` VALUES (6, '加荷港式茶餐厅（重庆财富购物中心店）', '我们的团队在这里北欧风格的后现代元素与奔放的埃及风会同重庆火锅的炽热，完美地融为一体！精致的产品、精细的服务又体现了过江龙对现代都市人消费观念的完全认同！我们完全有理由淡忘喧闹的码头传统，激情拥抱并体味这份全新的火锅感受；', 1, '重庆市沙坪坝区景苑路8号附18号1F-25', '15983699452', NULL, '1', 4, 2);
INSERT INTO `mer` VALUES (7, '加禧港式茶餐厅（解放碑店）', '我们的团队倾心打造至高品味的美食场所，创立了中餐特色餐饮品牌，将传统大型中餐与特色餐饮相结合，形成独特的店中店模式，满足不同消费群体的不同需求。专业的团队，个性化的装修、极显人性化的亲和服务。一直以来，金海华对美食的执着与创新，精彩的演绎着美食的至高境界。', 1, '重庆市沙坪坝区景和路42号', '19824728415', NULL, '1', 11, 5);
INSERT INTO `mer` VALUES (8, '佳居饭庄（兴科一路）', '本店的食品，饮品，新鲜、干净，卫生.本店成立以来一直致力于，制作，传播新颖，美味，独特的食品。原材料干净卫生，制作认真严谨。只愿给顾客带来更好的体验。', 13, '重庆市沙坪坝区景苑路8号附236号', '17881607259', NULL, '1', 186, 90);
INSERT INTO `mer` VALUES (9, '佳乐饭庄', '本店的食品，饮品，新鲜、干净，卫生.本店成立以来一直致力于，制作，传播新颖，美味，独特的食品。原材料干净卫生，制作认真严谨。只愿给顾客带来更好的体验。', 13, '重庆市沙坪坝区熙街11号楼1F-04', '17230679587', NULL, '1', 171, 83);
INSERT INTO `mer` VALUES (10, '佳肴干锅', '蜜雪冰城致力于让全球每个人享受高质平价的美味，始终秉承“近者悦，远者来；以奋斗者为本，以顾客为中心”的理念，用优质的原材料打造产品，以优质的团队服务顾客。', 5, '重庆市沙坪坝区陈家桥桥北路18号附10号', '13620604389', NULL, '1', 66, 32);
INSERT INTO `mer` VALUES (11, '金翠河港式茶餐厅（龙湖U城天街店）', '本店的食品，饮品，新鲜、干净，卫生.本店成立以来一直致力于，制作，传播新颖，美味，独特的食品。原材料干净卫生，制作认真严谨。只愿给顾客带来更好的体验。', 1, '重庆市沙坪坝区景苑路与大学城北路交叉口东南140米', '17817349377', NULL, '1', 7, 4);
INSERT INTO `mer` VALUES (12, '金翠河烧鹅餐厅（涪陵店）', '本店的食品，饮品，新鲜、干净，卫生.本店成立以来一直致力于，制作，传播新颖，美味，独特的食品。原材料干净卫生，制作认真严谨。只愿给顾客带来更好的体验。', 23, '重庆市南岸区黄桷垭正街150号第四人民医院沿西北方往木子园方向前行200米老君洞南门牌坊处', '17803946147', NULL, '1', 212, 8);
INSERT INTO `mer` VALUES (13, '金翠河烧鹅餐厅（南坪万达店）', '本店的食品，饮品，新鲜、干净，卫生.本店成立以来一直致力于，制作，传播新颖，美味，独特的食品。原材料干净卫生，制作认真严谨。只愿给顾客带来更好的体验。', 1, '重庆市巴南区红光大道杰信华府广场东北侧约50米', '18568995526', NULL, '1', 9, 5);
INSERT INTO `mer` VALUES (14, '金翠河烧鹅餐厅（时代广场店）', '本店的食品，饮品，新鲜、干净，卫生.本店成立以来一直致力于，制作，传播新颖，美味，独特的食品。原材料干净卫生，制作认真严谨。只愿给顾客带来更好的体验。', 1, '重庆市万州区天城镇塘坊还房B栋1幢二楼', '17798429770', NULL, '1', 2, 1);
INSERT INTO `mer` VALUES (15, '金牌泰香米泰国餐厅（万象城店）', '本店的食品，饮品，新鲜、干净，卫生.本店成立以来一直致力于，制作，传播新颖，美味，独特的食品。原材料干净卫生，制作认真严谨。只愿给顾客带来更好的体验。', 17, '重庆市巫山县桐子坪巫山大酒店', '18896893756', NULL, '1', 198, 96);
INSERT INTO `mer` VALUES (16, '楼兰新疆主题餐厅（龙湖时代天街店）', '本店的食品，饮品，新鲜、干净，卫生.本店成立以来一直致力于，制作，传播新颖，美味，独特的食品。原材料干净卫生，制作认真严谨。只愿给顾客带来更好的体验。', 21, '重庆市渝中区长江支路11号(大坪地铁站5号口步行180米)', '18715441229', NULL, '1', 205, 99);
INSERT INTO `mer` VALUES (17, '楼兰新疆主题餐厅（渝中来福士店）', '2013年，喜茶HEYTEA起源于江边里的一条小巷，原名皇茶ROYALTEA为了与层出不穷的山寨品牌区分开来，故全面升级为注册品牌喜茶HEYTEA。', 21, '重庆市沙坪坝区大学城景苑路8号附38至41号', '13029756170', NULL, '1', 203, 98);
INSERT INTO `mer` VALUES (18, '泰香米泰国餐厅（北城天街店）', '我们的团队在这里北欧风格的后现代元素与奔放的埃及风会同重庆火锅的炽热，完美地融为一体！精致的产品、精细的服务又体现了过江龙对现代都市人消费观念的完全认同！我们完全有理由淡忘喧闹的码头传统，激情拥抱并体味这份全新的火锅感受；', 17, '重庆市沙坪坝区景和路青年文艺广场2-号', '15221708687', NULL, '1', 195, 94);
INSERT INTO `mer` VALUES (19, '渝都饭庄', '本店是正宗地道的香港美食品牌，自2006年成立以来一-直致力于传播原汁原味、独具特色的香港饮食文化。品牌承继传统港式茶餐厅特色，菜品丰富、口味独特。吃烧鹅，金翠河，享粵菜，可青睐。', 2, '沙坪坝区大学城龙湖U城天街B馆L3-24', '19830569553', NULL, '1', 46, 22);
INSERT INTO `mer` VALUES (20, '裕农饭馆', '我们的团队深度开发新派精品新疆菜，涵括疆内各地特色美食、民族糕点，以弘扬传统饮食文化为已任，令您足不出户尝遍地道新疆特色菜肴！主营以新疆稀有珍品烹煮之精品佳肴，品位常新，应有尽有！', 2, '重庆市九龙坡区谢家湾正街55号万象城4层86号', '14779436756', NULL, '1', 59, 28);

-- ----------------------------
-- Table structure for mertype
-- ----------------------------
DROP TABLE IF EXISTS `mertype`;
CREATE TABLE `mertype`  (
  `mt_id` int(11) NOT NULL AUTO_INCREMENT,
  `mt_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`mt_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 26 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of mertype
-- ----------------------------
INSERT INTO `mertype` VALUES (1, '茶餐厅');
INSERT INTO `mertype` VALUES (2, '早点');
INSERT INTO `mertype` VALUES (3, '东北菜');
INSERT INTO `mertype` VALUES (4, '豆腐花');
INSERT INTO `mertype` VALUES (5, '干锅/香锅');
INSERT INTO `mertype` VALUES (6, '河北菜');
INSERT INTO `mertype` VALUES (7, '家常菜');
INSERT INTO `mertype` VALUES (8, '快餐简餐');
INSERT INTO `mertype` VALUES (9, '面条');
INSERT INTO `mertype` VALUES (10, '牛排');
INSERT INTO `mertype` VALUES (11, '农家菜');
INSERT INTO `mertype` VALUES (12, '其他美食');
INSERT INTO `mertype` VALUES (13, '其他中餐');
INSERT INTO `mertype` VALUES (14, '私房菜');
INSERT INTO `mertype` VALUES (15, '素食');
INSERT INTO `mertype` VALUES (16, '酸菜鱼/水煮鱼');
INSERT INTO `mertype` VALUES (17, '泰国菜');
INSERT INTO `mertype` VALUES (18, '特色菜');
INSERT INTO `mertype` VALUES (19, '天津菜');
INSERT INTO `mertype` VALUES (20, '小吃快餐');
INSERT INTO `mertype` VALUES (21, '新疆菜');
INSERT INTO `mertype` VALUES (22, '意大利菜');
INSERT INTO `mertype` VALUES (23, '粤菜');
INSERT INTO `mertype` VALUES (24, '综合自助');
INSERT INTO `mertype` VALUES (25, '川菜');

-- ----------------------------
-- Table structure for orderdetails
-- ----------------------------
DROP TABLE IF EXISTS `orderdetails`;
CREATE TABLE `orderdetails`  (
  `od_id` int(11) NOT NULL AUTO_INCREMENT,
  `o_id` int(11) NULL DEFAULT NULL,
  `m_id` int(11) NULL DEFAULT NULL,
  `g_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`od_id`) USING BTREE,
  INDEX `o_id`(`o_id`) USING BTREE,
  INDEX `m_id`(`m_id`) USING BTREE,
  INDEX `g_id`(`g_id`) USING BTREE,
  CONSTRAINT `orderdetails_ibfk_1` FOREIGN KEY (`m_id`) REFERENCES `mer` (`m_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `orderdetails_ibfk_2` FOREIGN KEY (`g_id`) REFERENCES `goods` (`g_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `orderdetails_ibfk_3` FOREIGN KEY (`o_id`) REFERENCES `orderlist` (`o_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 601 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of orderdetails
-- ----------------------------
INSERT INTO `orderdetails` VALUES (1, 1, 1, 6);
INSERT INTO `orderdetails` VALUES (2, 1, 1, 4);
INSERT INTO `orderdetails` VALUES (3, 1, 1, 1);
INSERT INTO `orderdetails` VALUES (4, 2, 1, 7);
INSERT INTO `orderdetails` VALUES (5, 2, 1, 2);
INSERT INTO `orderdetails` VALUES (6, 2, 1, 3);
INSERT INTO `orderdetails` VALUES (7, 3, 1, 10);
INSERT INTO `orderdetails` VALUES (8, 3, 1, 3);
INSERT INTO `orderdetails` VALUES (9, 3, 1, 3);
INSERT INTO `orderdetails` VALUES (10, 4, 1, 6);
INSERT INTO `orderdetails` VALUES (11, 4, 1, 1);
INSERT INTO `orderdetails` VALUES (12, 4, 1, 9);
INSERT INTO `orderdetails` VALUES (13, 5, 1, 2);
INSERT INTO `orderdetails` VALUES (14, 5, 1, 10);
INSERT INTO `orderdetails` VALUES (15, 5, 1, 2);
INSERT INTO `orderdetails` VALUES (16, 6, 1, 9);
INSERT INTO `orderdetails` VALUES (17, 6, 1, 10);
INSERT INTO `orderdetails` VALUES (18, 6, 1, 10);
INSERT INTO `orderdetails` VALUES (19, 7, 1, 8);
INSERT INTO `orderdetails` VALUES (20, 7, 1, 8);
INSERT INTO `orderdetails` VALUES (21, 7, 1, 4);
INSERT INTO `orderdetails` VALUES (22, 8, 1, 4);
INSERT INTO `orderdetails` VALUES (23, 8, 1, 4);
INSERT INTO `orderdetails` VALUES (24, 8, 1, 10);
INSERT INTO `orderdetails` VALUES (25, 9, 1, 1);
INSERT INTO `orderdetails` VALUES (26, 9, 1, 9);
INSERT INTO `orderdetails` VALUES (27, 9, 1, 7);
INSERT INTO `orderdetails` VALUES (28, 10, 1, 7);
INSERT INTO `orderdetails` VALUES (29, 10, 1, 7);
INSERT INTO `orderdetails` VALUES (30, 10, 1, 6);
INSERT INTO `orderdetails` VALUES (31, 11, 2, 14);
INSERT INTO `orderdetails` VALUES (32, 11, 2, 17);
INSERT INTO `orderdetails` VALUES (33, 11, 2, 20);
INSERT INTO `orderdetails` VALUES (34, 12, 2, 18);
INSERT INTO `orderdetails` VALUES (35, 12, 2, 13);
INSERT INTO `orderdetails` VALUES (36, 12, 2, 16);
INSERT INTO `orderdetails` VALUES (37, 13, 2, 14);
INSERT INTO `orderdetails` VALUES (38, 13, 2, 16);
INSERT INTO `orderdetails` VALUES (39, 13, 2, 14);
INSERT INTO `orderdetails` VALUES (40, 14, 2, 11);
INSERT INTO `orderdetails` VALUES (41, 14, 2, 12);
INSERT INTO `orderdetails` VALUES (42, 14, 2, 20);
INSERT INTO `orderdetails` VALUES (43, 15, 2, 14);
INSERT INTO `orderdetails` VALUES (44, 15, 2, 13);
INSERT INTO `orderdetails` VALUES (45, 15, 2, 19);
INSERT INTO `orderdetails` VALUES (46, 16, 2, 20);
INSERT INTO `orderdetails` VALUES (47, 16, 2, 12);
INSERT INTO `orderdetails` VALUES (48, 16, 2, 19);
INSERT INTO `orderdetails` VALUES (49, 17, 2, 14);
INSERT INTO `orderdetails` VALUES (50, 17, 2, 18);
INSERT INTO `orderdetails` VALUES (51, 17, 2, 14);
INSERT INTO `orderdetails` VALUES (52, 18, 2, 12);
INSERT INTO `orderdetails` VALUES (53, 18, 2, 17);
INSERT INTO `orderdetails` VALUES (54, 18, 2, 15);
INSERT INTO `orderdetails` VALUES (55, 19, 2, 18);
INSERT INTO `orderdetails` VALUES (56, 19, 2, 14);
INSERT INTO `orderdetails` VALUES (57, 19, 2, 14);
INSERT INTO `orderdetails` VALUES (58, 20, 2, 16);
INSERT INTO `orderdetails` VALUES (59, 20, 2, 17);
INSERT INTO `orderdetails` VALUES (60, 20, 2, 11);
INSERT INTO `orderdetails` VALUES (61, 21, 3, 29);
INSERT INTO `orderdetails` VALUES (62, 21, 3, 22);
INSERT INTO `orderdetails` VALUES (63, 21, 3, 30);
INSERT INTO `orderdetails` VALUES (64, 22, 3, 30);
INSERT INTO `orderdetails` VALUES (65, 22, 3, 30);
INSERT INTO `orderdetails` VALUES (66, 22, 3, 23);
INSERT INTO `orderdetails` VALUES (67, 23, 3, 30);
INSERT INTO `orderdetails` VALUES (68, 23, 3, 25);
INSERT INTO `orderdetails` VALUES (69, 23, 3, 28);
INSERT INTO `orderdetails` VALUES (70, 24, 3, 23);
INSERT INTO `orderdetails` VALUES (71, 24, 3, 24);
INSERT INTO `orderdetails` VALUES (72, 24, 3, 23);
INSERT INTO `orderdetails` VALUES (73, 25, 3, 26);
INSERT INTO `orderdetails` VALUES (74, 25, 3, 22);
INSERT INTO `orderdetails` VALUES (75, 25, 3, 25);
INSERT INTO `orderdetails` VALUES (76, 26, 3, 21);
INSERT INTO `orderdetails` VALUES (77, 26, 3, 29);
INSERT INTO `orderdetails` VALUES (78, 26, 3, 26);
INSERT INTO `orderdetails` VALUES (79, 27, 3, 25);
INSERT INTO `orderdetails` VALUES (80, 27, 3, 23);
INSERT INTO `orderdetails` VALUES (81, 27, 3, 24);
INSERT INTO `orderdetails` VALUES (82, 28, 3, 29);
INSERT INTO `orderdetails` VALUES (83, 28, 3, 30);
INSERT INTO `orderdetails` VALUES (84, 28, 3, 23);
INSERT INTO `orderdetails` VALUES (85, 29, 3, 27);
INSERT INTO `orderdetails` VALUES (86, 29, 3, 25);
INSERT INTO `orderdetails` VALUES (87, 29, 3, 26);
INSERT INTO `orderdetails` VALUES (88, 30, 3, 21);
INSERT INTO `orderdetails` VALUES (89, 30, 3, 23);
INSERT INTO `orderdetails` VALUES (90, 30, 3, 22);
INSERT INTO `orderdetails` VALUES (91, 31, 4, 31);
INSERT INTO `orderdetails` VALUES (92, 31, 4, 36);
INSERT INTO `orderdetails` VALUES (93, 31, 4, 35);
INSERT INTO `orderdetails` VALUES (94, 32, 4, 35);
INSERT INTO `orderdetails` VALUES (95, 32, 4, 32);
INSERT INTO `orderdetails` VALUES (96, 32, 4, 31);
INSERT INTO `orderdetails` VALUES (97, 33, 4, 40);
INSERT INTO `orderdetails` VALUES (98, 33, 4, 40);
INSERT INTO `orderdetails` VALUES (99, 33, 4, 35);
INSERT INTO `orderdetails` VALUES (100, 34, 4, 38);
INSERT INTO `orderdetails` VALUES (101, 34, 4, 33);
INSERT INTO `orderdetails` VALUES (102, 34, 4, 35);
INSERT INTO `orderdetails` VALUES (103, 35, 4, 40);
INSERT INTO `orderdetails` VALUES (104, 35, 4, 36);
INSERT INTO `orderdetails` VALUES (105, 35, 4, 38);
INSERT INTO `orderdetails` VALUES (106, 36, 4, 36);
INSERT INTO `orderdetails` VALUES (107, 36, 4, 35);
INSERT INTO `orderdetails` VALUES (108, 36, 4, 34);
INSERT INTO `orderdetails` VALUES (109, 37, 4, 37);
INSERT INTO `orderdetails` VALUES (110, 37, 4, 34);
INSERT INTO `orderdetails` VALUES (111, 37, 4, 31);
INSERT INTO `orderdetails` VALUES (112, 38, 4, 34);
INSERT INTO `orderdetails` VALUES (113, 38, 4, 36);
INSERT INTO `orderdetails` VALUES (114, 38, 4, 34);
INSERT INTO `orderdetails` VALUES (115, 39, 4, 37);
INSERT INTO `orderdetails` VALUES (116, 39, 4, 38);
INSERT INTO `orderdetails` VALUES (117, 39, 4, 34);
INSERT INTO `orderdetails` VALUES (118, 40, 4, 32);
INSERT INTO `orderdetails` VALUES (119, 40, 4, 40);
INSERT INTO `orderdetails` VALUES (120, 40, 4, 39);
INSERT INTO `orderdetails` VALUES (121, 41, 5, 46);
INSERT INTO `orderdetails` VALUES (122, 41, 5, 43);
INSERT INTO `orderdetails` VALUES (123, 41, 5, 41);
INSERT INTO `orderdetails` VALUES (124, 42, 5, 46);
INSERT INTO `orderdetails` VALUES (125, 42, 5, 50);
INSERT INTO `orderdetails` VALUES (126, 42, 5, 43);
INSERT INTO `orderdetails` VALUES (127, 43, 5, 44);
INSERT INTO `orderdetails` VALUES (128, 43, 5, 42);
INSERT INTO `orderdetails` VALUES (129, 43, 5, 47);
INSERT INTO `orderdetails` VALUES (130, 44, 5, 48);
INSERT INTO `orderdetails` VALUES (131, 44, 5, 49);
INSERT INTO `orderdetails` VALUES (132, 44, 5, 48);
INSERT INTO `orderdetails` VALUES (133, 45, 5, 46);
INSERT INTO `orderdetails` VALUES (134, 45, 5, 44);
INSERT INTO `orderdetails` VALUES (135, 45, 5, 48);
INSERT INTO `orderdetails` VALUES (136, 46, 5, 43);
INSERT INTO `orderdetails` VALUES (137, 46, 5, 43);
INSERT INTO `orderdetails` VALUES (138, 46, 5, 47);
INSERT INTO `orderdetails` VALUES (139, 47, 5, 44);
INSERT INTO `orderdetails` VALUES (140, 47, 5, 49);
INSERT INTO `orderdetails` VALUES (141, 47, 5, 50);
INSERT INTO `orderdetails` VALUES (142, 48, 5, 46);
INSERT INTO `orderdetails` VALUES (143, 48, 5, 50);
INSERT INTO `orderdetails` VALUES (144, 48, 5, 48);
INSERT INTO `orderdetails` VALUES (145, 49, 5, 43);
INSERT INTO `orderdetails` VALUES (146, 49, 5, 45);
INSERT INTO `orderdetails` VALUES (147, 49, 5, 50);
INSERT INTO `orderdetails` VALUES (148, 50, 5, 43);
INSERT INTO `orderdetails` VALUES (149, 50, 5, 45);
INSERT INTO `orderdetails` VALUES (150, 50, 5, 48);
INSERT INTO `orderdetails` VALUES (151, 51, 6, 58);
INSERT INTO `orderdetails` VALUES (152, 51, 6, 53);
INSERT INTO `orderdetails` VALUES (153, 51, 6, 51);
INSERT INTO `orderdetails` VALUES (154, 52, 6, 60);
INSERT INTO `orderdetails` VALUES (155, 52, 6, 55);
INSERT INTO `orderdetails` VALUES (156, 52, 6, 59);
INSERT INTO `orderdetails` VALUES (157, 53, 6, 52);
INSERT INTO `orderdetails` VALUES (158, 53, 6, 60);
INSERT INTO `orderdetails` VALUES (159, 53, 6, 51);
INSERT INTO `orderdetails` VALUES (160, 54, 6, 53);
INSERT INTO `orderdetails` VALUES (161, 54, 6, 58);
INSERT INTO `orderdetails` VALUES (162, 54, 6, 56);
INSERT INTO `orderdetails` VALUES (163, 55, 6, 60);
INSERT INTO `orderdetails` VALUES (164, 55, 6, 51);
INSERT INTO `orderdetails` VALUES (165, 55, 6, 58);
INSERT INTO `orderdetails` VALUES (166, 56, 6, 54);
INSERT INTO `orderdetails` VALUES (167, 56, 6, 53);
INSERT INTO `orderdetails` VALUES (168, 56, 6, 59);
INSERT INTO `orderdetails` VALUES (169, 57, 6, 53);
INSERT INTO `orderdetails` VALUES (170, 57, 6, 57);
INSERT INTO `orderdetails` VALUES (171, 57, 6, 60);
INSERT INTO `orderdetails` VALUES (172, 58, 6, 52);
INSERT INTO `orderdetails` VALUES (173, 58, 6, 53);
INSERT INTO `orderdetails` VALUES (174, 58, 6, 54);
INSERT INTO `orderdetails` VALUES (175, 59, 6, 53);
INSERT INTO `orderdetails` VALUES (176, 59, 6, 55);
INSERT INTO `orderdetails` VALUES (177, 59, 6, 54);
INSERT INTO `orderdetails` VALUES (178, 60, 6, 51);
INSERT INTO `orderdetails` VALUES (179, 60, 6, 58);
INSERT INTO `orderdetails` VALUES (180, 60, 6, 55);
INSERT INTO `orderdetails` VALUES (181, 61, 7, 62);
INSERT INTO `orderdetails` VALUES (182, 61, 7, 67);
INSERT INTO `orderdetails` VALUES (183, 61, 7, 61);
INSERT INTO `orderdetails` VALUES (184, 62, 7, 65);
INSERT INTO `orderdetails` VALUES (185, 62, 7, 64);
INSERT INTO `orderdetails` VALUES (186, 62, 7, 65);
INSERT INTO `orderdetails` VALUES (187, 63, 7, 69);
INSERT INTO `orderdetails` VALUES (188, 63, 7, 61);
INSERT INTO `orderdetails` VALUES (189, 63, 7, 70);
INSERT INTO `orderdetails` VALUES (190, 64, 7, 69);
INSERT INTO `orderdetails` VALUES (191, 64, 7, 66);
INSERT INTO `orderdetails` VALUES (192, 64, 7, 64);
INSERT INTO `orderdetails` VALUES (193, 65, 7, 61);
INSERT INTO `orderdetails` VALUES (194, 65, 7, 70);
INSERT INTO `orderdetails` VALUES (195, 65, 7, 68);
INSERT INTO `orderdetails` VALUES (196, 66, 7, 63);
INSERT INTO `orderdetails` VALUES (197, 66, 7, 70);
INSERT INTO `orderdetails` VALUES (198, 66, 7, 69);
INSERT INTO `orderdetails` VALUES (199, 67, 7, 63);
INSERT INTO `orderdetails` VALUES (200, 67, 7, 65);
INSERT INTO `orderdetails` VALUES (201, 67, 7, 68);
INSERT INTO `orderdetails` VALUES (202, 68, 7, 61);
INSERT INTO `orderdetails` VALUES (203, 68, 7, 68);
INSERT INTO `orderdetails` VALUES (204, 68, 7, 62);
INSERT INTO `orderdetails` VALUES (205, 69, 7, 63);
INSERT INTO `orderdetails` VALUES (206, 69, 7, 64);
INSERT INTO `orderdetails` VALUES (207, 69, 7, 65);
INSERT INTO `orderdetails` VALUES (208, 70, 7, 62);
INSERT INTO `orderdetails` VALUES (209, 70, 7, 69);
INSERT INTO `orderdetails` VALUES (210, 70, 7, 63);
INSERT INTO `orderdetails` VALUES (211, 71, 8, 71);
INSERT INTO `orderdetails` VALUES (212, 71, 8, 75);
INSERT INTO `orderdetails` VALUES (213, 71, 8, 72);
INSERT INTO `orderdetails` VALUES (214, 72, 8, 71);
INSERT INTO `orderdetails` VALUES (215, 72, 8, 72);
INSERT INTO `orderdetails` VALUES (216, 72, 8, 73);
INSERT INTO `orderdetails` VALUES (217, 73, 8, 73);
INSERT INTO `orderdetails` VALUES (218, 73, 8, 75);
INSERT INTO `orderdetails` VALUES (219, 73, 8, 79);
INSERT INTO `orderdetails` VALUES (220, 74, 8, 78);
INSERT INTO `orderdetails` VALUES (221, 74, 8, 78);
INSERT INTO `orderdetails` VALUES (222, 74, 8, 74);
INSERT INTO `orderdetails` VALUES (223, 75, 8, 75);
INSERT INTO `orderdetails` VALUES (224, 75, 8, 78);
INSERT INTO `orderdetails` VALUES (225, 75, 8, 77);
INSERT INTO `orderdetails` VALUES (226, 76, 8, 77);
INSERT INTO `orderdetails` VALUES (227, 76, 8, 75);
INSERT INTO `orderdetails` VALUES (228, 76, 8, 75);
INSERT INTO `orderdetails` VALUES (229, 77, 8, 71);
INSERT INTO `orderdetails` VALUES (230, 77, 8, 77);
INSERT INTO `orderdetails` VALUES (231, 77, 8, 71);
INSERT INTO `orderdetails` VALUES (232, 78, 8, 77);
INSERT INTO `orderdetails` VALUES (233, 78, 8, 77);
INSERT INTO `orderdetails` VALUES (234, 78, 8, 80);
INSERT INTO `orderdetails` VALUES (235, 79, 8, 79);
INSERT INTO `orderdetails` VALUES (236, 79, 8, 74);
INSERT INTO `orderdetails` VALUES (237, 79, 8, 72);
INSERT INTO `orderdetails` VALUES (238, 80, 8, 79);
INSERT INTO `orderdetails` VALUES (239, 80, 8, 74);
INSERT INTO `orderdetails` VALUES (240, 80, 8, 71);
INSERT INTO `orderdetails` VALUES (241, 81, 9, 89);
INSERT INTO `orderdetails` VALUES (242, 81, 9, 81);
INSERT INTO `orderdetails` VALUES (243, 81, 9, 83);
INSERT INTO `orderdetails` VALUES (244, 82, 9, 86);
INSERT INTO `orderdetails` VALUES (245, 82, 9, 83);
INSERT INTO `orderdetails` VALUES (246, 82, 9, 84);
INSERT INTO `orderdetails` VALUES (247, 83, 9, 81);
INSERT INTO `orderdetails` VALUES (248, 83, 9, 81);
INSERT INTO `orderdetails` VALUES (249, 83, 9, 82);
INSERT INTO `orderdetails` VALUES (250, 84, 9, 90);
INSERT INTO `orderdetails` VALUES (251, 84, 9, 90);
INSERT INTO `orderdetails` VALUES (252, 84, 9, 82);
INSERT INTO `orderdetails` VALUES (253, 85, 9, 88);
INSERT INTO `orderdetails` VALUES (254, 85, 9, 83);
INSERT INTO `orderdetails` VALUES (255, 85, 9, 82);
INSERT INTO `orderdetails` VALUES (256, 86, 9, 83);
INSERT INTO `orderdetails` VALUES (257, 86, 9, 87);
INSERT INTO `orderdetails` VALUES (258, 86, 9, 86);
INSERT INTO `orderdetails` VALUES (259, 87, 9, 81);
INSERT INTO `orderdetails` VALUES (260, 87, 9, 88);
INSERT INTO `orderdetails` VALUES (261, 87, 9, 86);
INSERT INTO `orderdetails` VALUES (262, 88, 9, 85);
INSERT INTO `orderdetails` VALUES (263, 88, 9, 89);
INSERT INTO `orderdetails` VALUES (264, 88, 9, 87);
INSERT INTO `orderdetails` VALUES (265, 89, 9, 89);
INSERT INTO `orderdetails` VALUES (266, 89, 9, 88);
INSERT INTO `orderdetails` VALUES (267, 89, 9, 87);
INSERT INTO `orderdetails` VALUES (268, 90, 9, 88);
INSERT INTO `orderdetails` VALUES (269, 90, 9, 89);
INSERT INTO `orderdetails` VALUES (270, 90, 9, 81);
INSERT INTO `orderdetails` VALUES (271, 91, 10, 94);
INSERT INTO `orderdetails` VALUES (272, 91, 10, 95);
INSERT INTO `orderdetails` VALUES (273, 91, 10, 97);
INSERT INTO `orderdetails` VALUES (274, 92, 10, 94);
INSERT INTO `orderdetails` VALUES (275, 92, 10, 97);
INSERT INTO `orderdetails` VALUES (276, 92, 10, 96);
INSERT INTO `orderdetails` VALUES (277, 93, 10, 99);
INSERT INTO `orderdetails` VALUES (278, 93, 10, 98);
INSERT INTO `orderdetails` VALUES (279, 93, 10, 96);
INSERT INTO `orderdetails` VALUES (280, 94, 10, 91);
INSERT INTO `orderdetails` VALUES (281, 94, 10, 95);
INSERT INTO `orderdetails` VALUES (282, 94, 10, 99);
INSERT INTO `orderdetails` VALUES (283, 95, 10, 100);
INSERT INTO `orderdetails` VALUES (284, 95, 10, 99);
INSERT INTO `orderdetails` VALUES (285, 95, 10, 95);
INSERT INTO `orderdetails` VALUES (286, 96, 10, 100);
INSERT INTO `orderdetails` VALUES (287, 96, 10, 93);
INSERT INTO `orderdetails` VALUES (288, 96, 10, 93);
INSERT INTO `orderdetails` VALUES (289, 97, 10, 95);
INSERT INTO `orderdetails` VALUES (290, 97, 10, 92);
INSERT INTO `orderdetails` VALUES (291, 97, 10, 92);
INSERT INTO `orderdetails` VALUES (292, 98, 10, 91);
INSERT INTO `orderdetails` VALUES (293, 98, 10, 99);
INSERT INTO `orderdetails` VALUES (294, 98, 10, 93);
INSERT INTO `orderdetails` VALUES (295, 99, 10, 91);
INSERT INTO `orderdetails` VALUES (296, 99, 10, 94);
INSERT INTO `orderdetails` VALUES (297, 99, 10, 98);
INSERT INTO `orderdetails` VALUES (298, 100, 10, 94);
INSERT INTO `orderdetails` VALUES (299, 100, 10, 95);
INSERT INTO `orderdetails` VALUES (300, 100, 10, 95);
INSERT INTO `orderdetails` VALUES (301, 101, 11, 106);
INSERT INTO `orderdetails` VALUES (302, 101, 11, 106);
INSERT INTO `orderdetails` VALUES (303, 101, 11, 106);
INSERT INTO `orderdetails` VALUES (304, 102, 11, 102);
INSERT INTO `orderdetails` VALUES (305, 102, 11, 107);
INSERT INTO `orderdetails` VALUES (306, 102, 11, 110);
INSERT INTO `orderdetails` VALUES (307, 103, 11, 102);
INSERT INTO `orderdetails` VALUES (308, 103, 11, 108);
INSERT INTO `orderdetails` VALUES (309, 103, 11, 103);
INSERT INTO `orderdetails` VALUES (310, 104, 11, 104);
INSERT INTO `orderdetails` VALUES (311, 104, 11, 104);
INSERT INTO `orderdetails` VALUES (312, 104, 11, 102);
INSERT INTO `orderdetails` VALUES (313, 105, 11, 103);
INSERT INTO `orderdetails` VALUES (314, 105, 11, 101);
INSERT INTO `orderdetails` VALUES (315, 105, 11, 108);
INSERT INTO `orderdetails` VALUES (316, 106, 11, 101);
INSERT INTO `orderdetails` VALUES (317, 106, 11, 105);
INSERT INTO `orderdetails` VALUES (318, 106, 11, 103);
INSERT INTO `orderdetails` VALUES (319, 107, 11, 103);
INSERT INTO `orderdetails` VALUES (320, 107, 11, 107);
INSERT INTO `orderdetails` VALUES (321, 107, 11, 108);
INSERT INTO `orderdetails` VALUES (322, 108, 11, 110);
INSERT INTO `orderdetails` VALUES (323, 108, 11, 105);
INSERT INTO `orderdetails` VALUES (324, 108, 11, 104);
INSERT INTO `orderdetails` VALUES (325, 109, 11, 103);
INSERT INTO `orderdetails` VALUES (326, 109, 11, 102);
INSERT INTO `orderdetails` VALUES (327, 109, 11, 104);
INSERT INTO `orderdetails` VALUES (328, 110, 11, 104);
INSERT INTO `orderdetails` VALUES (329, 110, 11, 102);
INSERT INTO `orderdetails` VALUES (330, 110, 11, 109);
INSERT INTO `orderdetails` VALUES (331, 111, 12, 117);
INSERT INTO `orderdetails` VALUES (332, 111, 12, 118);
INSERT INTO `orderdetails` VALUES (333, 111, 12, 120);
INSERT INTO `orderdetails` VALUES (334, 112, 12, 112);
INSERT INTO `orderdetails` VALUES (335, 112, 12, 119);
INSERT INTO `orderdetails` VALUES (336, 112, 12, 118);
INSERT INTO `orderdetails` VALUES (337, 113, 12, 112);
INSERT INTO `orderdetails` VALUES (338, 113, 12, 115);
INSERT INTO `orderdetails` VALUES (339, 113, 12, 117);
INSERT INTO `orderdetails` VALUES (340, 114, 12, 111);
INSERT INTO `orderdetails` VALUES (341, 114, 12, 116);
INSERT INTO `orderdetails` VALUES (342, 114, 12, 120);
INSERT INTO `orderdetails` VALUES (343, 115, 12, 113);
INSERT INTO `orderdetails` VALUES (344, 115, 12, 117);
INSERT INTO `orderdetails` VALUES (345, 115, 12, 118);
INSERT INTO `orderdetails` VALUES (346, 116, 12, 114);
INSERT INTO `orderdetails` VALUES (347, 116, 12, 117);
INSERT INTO `orderdetails` VALUES (348, 116, 12, 120);
INSERT INTO `orderdetails` VALUES (349, 117, 12, 116);
INSERT INTO `orderdetails` VALUES (350, 117, 12, 116);
INSERT INTO `orderdetails` VALUES (351, 117, 12, 115);
INSERT INTO `orderdetails` VALUES (352, 118, 12, 117);
INSERT INTO `orderdetails` VALUES (353, 118, 12, 116);
INSERT INTO `orderdetails` VALUES (354, 118, 12, 116);
INSERT INTO `orderdetails` VALUES (355, 119, 12, 117);
INSERT INTO `orderdetails` VALUES (356, 119, 12, 120);
INSERT INTO `orderdetails` VALUES (357, 119, 12, 116);
INSERT INTO `orderdetails` VALUES (358, 120, 12, 113);
INSERT INTO `orderdetails` VALUES (359, 120, 12, 116);
INSERT INTO `orderdetails` VALUES (360, 120, 12, 116);
INSERT INTO `orderdetails` VALUES (361, 121, 13, 123);
INSERT INTO `orderdetails` VALUES (362, 121, 13, 126);
INSERT INTO `orderdetails` VALUES (363, 121, 13, 126);
INSERT INTO `orderdetails` VALUES (364, 122, 13, 121);
INSERT INTO `orderdetails` VALUES (365, 122, 13, 130);
INSERT INTO `orderdetails` VALUES (366, 122, 13, 127);
INSERT INTO `orderdetails` VALUES (367, 123, 13, 125);
INSERT INTO `orderdetails` VALUES (368, 123, 13, 125);
INSERT INTO `orderdetails` VALUES (369, 123, 13, 128);
INSERT INTO `orderdetails` VALUES (370, 124, 13, 121);
INSERT INTO `orderdetails` VALUES (371, 124, 13, 124);
INSERT INTO `orderdetails` VALUES (372, 124, 13, 123);
INSERT INTO `orderdetails` VALUES (373, 125, 13, 121);
INSERT INTO `orderdetails` VALUES (374, 125, 13, 128);
INSERT INTO `orderdetails` VALUES (375, 125, 13, 127);
INSERT INTO `orderdetails` VALUES (376, 126, 13, 122);
INSERT INTO `orderdetails` VALUES (377, 126, 13, 121);
INSERT INTO `orderdetails` VALUES (378, 126, 13, 129);
INSERT INTO `orderdetails` VALUES (379, 127, 13, 123);
INSERT INTO `orderdetails` VALUES (380, 127, 13, 124);
INSERT INTO `orderdetails` VALUES (381, 127, 13, 127);
INSERT INTO `orderdetails` VALUES (382, 128, 13, 127);
INSERT INTO `orderdetails` VALUES (383, 128, 13, 123);
INSERT INTO `orderdetails` VALUES (384, 128, 13, 122);
INSERT INTO `orderdetails` VALUES (385, 129, 13, 127);
INSERT INTO `orderdetails` VALUES (386, 129, 13, 123);
INSERT INTO `orderdetails` VALUES (387, 129, 13, 130);
INSERT INTO `orderdetails` VALUES (388, 130, 13, 126);
INSERT INTO `orderdetails` VALUES (389, 130, 13, 123);
INSERT INTO `orderdetails` VALUES (390, 130, 13, 125);
INSERT INTO `orderdetails` VALUES (391, 131, 14, 134);
INSERT INTO `orderdetails` VALUES (392, 131, 14, 134);
INSERT INTO `orderdetails` VALUES (393, 131, 14, 138);
INSERT INTO `orderdetails` VALUES (394, 132, 14, 132);
INSERT INTO `orderdetails` VALUES (395, 132, 14, 139);
INSERT INTO `orderdetails` VALUES (396, 132, 14, 139);
INSERT INTO `orderdetails` VALUES (397, 133, 14, 137);
INSERT INTO `orderdetails` VALUES (398, 133, 14, 138);
INSERT INTO `orderdetails` VALUES (399, 133, 14, 140);
INSERT INTO `orderdetails` VALUES (400, 134, 14, 135);
INSERT INTO `orderdetails` VALUES (401, 134, 14, 139);
INSERT INTO `orderdetails` VALUES (402, 134, 14, 134);
INSERT INTO `orderdetails` VALUES (403, 135, 14, 131);
INSERT INTO `orderdetails` VALUES (404, 135, 14, 131);
INSERT INTO `orderdetails` VALUES (405, 135, 14, 131);
INSERT INTO `orderdetails` VALUES (406, 136, 14, 139);
INSERT INTO `orderdetails` VALUES (407, 136, 14, 131);
INSERT INTO `orderdetails` VALUES (408, 136, 14, 139);
INSERT INTO `orderdetails` VALUES (409, 137, 14, 140);
INSERT INTO `orderdetails` VALUES (410, 137, 14, 139);
INSERT INTO `orderdetails` VALUES (411, 137, 14, 131);
INSERT INTO `orderdetails` VALUES (412, 138, 14, 133);
INSERT INTO `orderdetails` VALUES (413, 138, 14, 137);
INSERT INTO `orderdetails` VALUES (414, 138, 14, 134);
INSERT INTO `orderdetails` VALUES (415, 139, 14, 131);
INSERT INTO `orderdetails` VALUES (416, 139, 14, 136);
INSERT INTO `orderdetails` VALUES (417, 139, 14, 132);
INSERT INTO `orderdetails` VALUES (418, 140, 14, 138);
INSERT INTO `orderdetails` VALUES (419, 140, 14, 136);
INSERT INTO `orderdetails` VALUES (420, 140, 14, 136);
INSERT INTO `orderdetails` VALUES (421, 141, 15, 146);
INSERT INTO `orderdetails` VALUES (422, 141, 15, 148);
INSERT INTO `orderdetails` VALUES (423, 141, 15, 141);
INSERT INTO `orderdetails` VALUES (424, 142, 15, 144);
INSERT INTO `orderdetails` VALUES (425, 142, 15, 145);
INSERT INTO `orderdetails` VALUES (426, 142, 15, 148);
INSERT INTO `orderdetails` VALUES (427, 143, 15, 144);
INSERT INTO `orderdetails` VALUES (428, 143, 15, 147);
INSERT INTO `orderdetails` VALUES (429, 143, 15, 149);
INSERT INTO `orderdetails` VALUES (430, 144, 15, 141);
INSERT INTO `orderdetails` VALUES (431, 144, 15, 143);
INSERT INTO `orderdetails` VALUES (432, 144, 15, 149);
INSERT INTO `orderdetails` VALUES (433, 145, 15, 147);
INSERT INTO `orderdetails` VALUES (434, 145, 15, 143);
INSERT INTO `orderdetails` VALUES (435, 145, 15, 149);
INSERT INTO `orderdetails` VALUES (436, 146, 15, 144);
INSERT INTO `orderdetails` VALUES (437, 146, 15, 149);
INSERT INTO `orderdetails` VALUES (438, 146, 15, 149);
INSERT INTO `orderdetails` VALUES (439, 147, 15, 150);
INSERT INTO `orderdetails` VALUES (440, 147, 15, 144);
INSERT INTO `orderdetails` VALUES (441, 147, 15, 144);
INSERT INTO `orderdetails` VALUES (442, 148, 15, 143);
INSERT INTO `orderdetails` VALUES (443, 148, 15, 148);
INSERT INTO `orderdetails` VALUES (444, 148, 15, 146);
INSERT INTO `orderdetails` VALUES (445, 149, 15, 149);
INSERT INTO `orderdetails` VALUES (446, 149, 15, 148);
INSERT INTO `orderdetails` VALUES (447, 149, 15, 148);
INSERT INTO `orderdetails` VALUES (448, 150, 15, 141);
INSERT INTO `orderdetails` VALUES (449, 150, 15, 141);
INSERT INTO `orderdetails` VALUES (450, 150, 15, 144);
INSERT INTO `orderdetails` VALUES (451, 151, 16, 153);
INSERT INTO `orderdetails` VALUES (452, 151, 16, 151);
INSERT INTO `orderdetails` VALUES (453, 151, 16, 160);
INSERT INTO `orderdetails` VALUES (454, 152, 16, 153);
INSERT INTO `orderdetails` VALUES (455, 152, 16, 159);
INSERT INTO `orderdetails` VALUES (456, 152, 16, 153);
INSERT INTO `orderdetails` VALUES (457, 153, 16, 154);
INSERT INTO `orderdetails` VALUES (458, 153, 16, 160);
INSERT INTO `orderdetails` VALUES (459, 153, 16, 159);
INSERT INTO `orderdetails` VALUES (460, 154, 16, 154);
INSERT INTO `orderdetails` VALUES (461, 154, 16, 157);
INSERT INTO `orderdetails` VALUES (462, 154, 16, 156);
INSERT INTO `orderdetails` VALUES (463, 155, 16, 152);
INSERT INTO `orderdetails` VALUES (464, 155, 16, 159);
INSERT INTO `orderdetails` VALUES (465, 155, 16, 158);
INSERT INTO `orderdetails` VALUES (466, 156, 16, 154);
INSERT INTO `orderdetails` VALUES (467, 156, 16, 157);
INSERT INTO `orderdetails` VALUES (468, 156, 16, 160);
INSERT INTO `orderdetails` VALUES (469, 157, 16, 160);
INSERT INTO `orderdetails` VALUES (470, 157, 16, 158);
INSERT INTO `orderdetails` VALUES (471, 157, 16, 160);
INSERT INTO `orderdetails` VALUES (472, 158, 16, 153);
INSERT INTO `orderdetails` VALUES (473, 158, 16, 153);
INSERT INTO `orderdetails` VALUES (474, 158, 16, 158);
INSERT INTO `orderdetails` VALUES (475, 159, 16, 156);
INSERT INTO `orderdetails` VALUES (476, 159, 16, 155);
INSERT INTO `orderdetails` VALUES (477, 159, 16, 152);
INSERT INTO `orderdetails` VALUES (478, 160, 16, 153);
INSERT INTO `orderdetails` VALUES (479, 160, 16, 158);
INSERT INTO `orderdetails` VALUES (480, 160, 16, 152);
INSERT INTO `orderdetails` VALUES (481, 161, 17, 169);
INSERT INTO `orderdetails` VALUES (482, 161, 17, 168);
INSERT INTO `orderdetails` VALUES (483, 161, 17, 167);
INSERT INTO `orderdetails` VALUES (484, 162, 17, 170);
INSERT INTO `orderdetails` VALUES (485, 162, 17, 161);
INSERT INTO `orderdetails` VALUES (486, 162, 17, 162);
INSERT INTO `orderdetails` VALUES (487, 163, 17, 170);
INSERT INTO `orderdetails` VALUES (488, 163, 17, 161);
INSERT INTO `orderdetails` VALUES (489, 163, 17, 170);
INSERT INTO `orderdetails` VALUES (490, 164, 17, 167);
INSERT INTO `orderdetails` VALUES (491, 164, 17, 165);
INSERT INTO `orderdetails` VALUES (492, 164, 17, 164);
INSERT INTO `orderdetails` VALUES (493, 165, 17, 170);
INSERT INTO `orderdetails` VALUES (494, 165, 17, 169);
INSERT INTO `orderdetails` VALUES (495, 165, 17, 169);
INSERT INTO `orderdetails` VALUES (496, 166, 17, 170);
INSERT INTO `orderdetails` VALUES (497, 166, 17, 161);
INSERT INTO `orderdetails` VALUES (498, 166, 17, 170);
INSERT INTO `orderdetails` VALUES (499, 167, 17, 167);
INSERT INTO `orderdetails` VALUES (500, 167, 17, 166);
INSERT INTO `orderdetails` VALUES (501, 167, 17, 168);
INSERT INTO `orderdetails` VALUES (502, 168, 17, 162);
INSERT INTO `orderdetails` VALUES (503, 168, 17, 165);
INSERT INTO `orderdetails` VALUES (504, 168, 17, 167);
INSERT INTO `orderdetails` VALUES (505, 169, 17, 164);
INSERT INTO `orderdetails` VALUES (506, 169, 17, 163);
INSERT INTO `orderdetails` VALUES (507, 169, 17, 167);
INSERT INTO `orderdetails` VALUES (508, 170, 17, 162);
INSERT INTO `orderdetails` VALUES (509, 170, 17, 164);
INSERT INTO `orderdetails` VALUES (510, 170, 17, 165);
INSERT INTO `orderdetails` VALUES (511, 171, 18, 171);
INSERT INTO `orderdetails` VALUES (512, 171, 18, 179);
INSERT INTO `orderdetails` VALUES (513, 171, 18, 172);
INSERT INTO `orderdetails` VALUES (514, 172, 18, 179);
INSERT INTO `orderdetails` VALUES (515, 172, 18, 178);
INSERT INTO `orderdetails` VALUES (516, 172, 18, 174);
INSERT INTO `orderdetails` VALUES (517, 173, 18, 177);
INSERT INTO `orderdetails` VALUES (518, 173, 18, 180);
INSERT INTO `orderdetails` VALUES (519, 173, 18, 178);
INSERT INTO `orderdetails` VALUES (520, 174, 18, 172);
INSERT INTO `orderdetails` VALUES (521, 174, 18, 179);
INSERT INTO `orderdetails` VALUES (522, 174, 18, 176);
INSERT INTO `orderdetails` VALUES (523, 175, 18, 177);
INSERT INTO `orderdetails` VALUES (524, 175, 18, 177);
INSERT INTO `orderdetails` VALUES (525, 175, 18, 175);
INSERT INTO `orderdetails` VALUES (526, 176, 18, 174);
INSERT INTO `orderdetails` VALUES (527, 176, 18, 177);
INSERT INTO `orderdetails` VALUES (528, 176, 18, 178);
INSERT INTO `orderdetails` VALUES (529, 177, 18, 180);
INSERT INTO `orderdetails` VALUES (530, 177, 18, 178);
INSERT INTO `orderdetails` VALUES (531, 177, 18, 175);
INSERT INTO `orderdetails` VALUES (532, 178, 18, 179);
INSERT INTO `orderdetails` VALUES (533, 178, 18, 171);
INSERT INTO `orderdetails` VALUES (534, 178, 18, 177);
INSERT INTO `orderdetails` VALUES (535, 179, 18, 172);
INSERT INTO `orderdetails` VALUES (536, 179, 18, 178);
INSERT INTO `orderdetails` VALUES (537, 179, 18, 180);
INSERT INTO `orderdetails` VALUES (538, 180, 18, 175);
INSERT INTO `orderdetails` VALUES (539, 180, 18, 172);
INSERT INTO `orderdetails` VALUES (540, 180, 18, 178);
INSERT INTO `orderdetails` VALUES (541, 181, 19, 184);
INSERT INTO `orderdetails` VALUES (542, 181, 19, 183);
INSERT INTO `orderdetails` VALUES (543, 181, 19, 184);
INSERT INTO `orderdetails` VALUES (544, 182, 19, 184);
INSERT INTO `orderdetails` VALUES (545, 182, 19, 184);
INSERT INTO `orderdetails` VALUES (546, 182, 19, 184);
INSERT INTO `orderdetails` VALUES (547, 183, 19, 189);
INSERT INTO `orderdetails` VALUES (548, 183, 19, 189);
INSERT INTO `orderdetails` VALUES (549, 183, 19, 187);
INSERT INTO `orderdetails` VALUES (550, 184, 19, 182);
INSERT INTO `orderdetails` VALUES (551, 184, 19, 190);
INSERT INTO `orderdetails` VALUES (552, 184, 19, 190);
INSERT INTO `orderdetails` VALUES (553, 185, 19, 184);
INSERT INTO `orderdetails` VALUES (554, 185, 19, 182);
INSERT INTO `orderdetails` VALUES (555, 185, 19, 189);
INSERT INTO `orderdetails` VALUES (556, 186, 19, 187);
INSERT INTO `orderdetails` VALUES (557, 186, 19, 189);
INSERT INTO `orderdetails` VALUES (558, 186, 19, 185);
INSERT INTO `orderdetails` VALUES (559, 187, 19, 190);
INSERT INTO `orderdetails` VALUES (560, 187, 19, 187);
INSERT INTO `orderdetails` VALUES (561, 187, 19, 183);
INSERT INTO `orderdetails` VALUES (562, 188, 19, 187);
INSERT INTO `orderdetails` VALUES (563, 188, 19, 182);
INSERT INTO `orderdetails` VALUES (564, 188, 19, 190);
INSERT INTO `orderdetails` VALUES (565, 189, 19, 190);
INSERT INTO `orderdetails` VALUES (566, 189, 19, 189);
INSERT INTO `orderdetails` VALUES (567, 189, 19, 187);
INSERT INTO `orderdetails` VALUES (568, 190, 19, 181);
INSERT INTO `orderdetails` VALUES (569, 190, 19, 189);
INSERT INTO `orderdetails` VALUES (570, 190, 19, 186);
INSERT INTO `orderdetails` VALUES (571, 191, 20, 192);
INSERT INTO `orderdetails` VALUES (572, 191, 20, 200);
INSERT INTO `orderdetails` VALUES (573, 191, 20, 198);
INSERT INTO `orderdetails` VALUES (574, 192, 20, 197);
INSERT INTO `orderdetails` VALUES (575, 192, 20, 198);
INSERT INTO `orderdetails` VALUES (576, 192, 20, 193);
INSERT INTO `orderdetails` VALUES (577, 193, 20, 195);
INSERT INTO `orderdetails` VALUES (578, 193, 20, 197);
INSERT INTO `orderdetails` VALUES (579, 193, 20, 198);
INSERT INTO `orderdetails` VALUES (580, 194, 20, 195);
INSERT INTO `orderdetails` VALUES (581, 194, 20, 198);
INSERT INTO `orderdetails` VALUES (582, 194, 20, 192);
INSERT INTO `orderdetails` VALUES (583, 195, 20, 197);
INSERT INTO `orderdetails` VALUES (584, 195, 20, 193);
INSERT INTO `orderdetails` VALUES (585, 195, 20, 191);
INSERT INTO `orderdetails` VALUES (586, 196, 20, 200);
INSERT INTO `orderdetails` VALUES (587, 196, 20, 196);
INSERT INTO `orderdetails` VALUES (588, 196, 20, 191);
INSERT INTO `orderdetails` VALUES (589, 197, 20, 193);
INSERT INTO `orderdetails` VALUES (590, 197, 20, 199);
INSERT INTO `orderdetails` VALUES (591, 197, 20, 200);
INSERT INTO `orderdetails` VALUES (592, 198, 20, 194);
INSERT INTO `orderdetails` VALUES (593, 198, 20, 196);
INSERT INTO `orderdetails` VALUES (594, 198, 20, 192);
INSERT INTO `orderdetails` VALUES (595, 199, 20, 193);
INSERT INTO `orderdetails` VALUES (596, 199, 20, 199);
INSERT INTO `orderdetails` VALUES (597, 199, 20, 196);
INSERT INTO `orderdetails` VALUES (598, 200, 20, 192);
INSERT INTO `orderdetails` VALUES (599, 200, 20, 196);
INSERT INTO `orderdetails` VALUES (600, 200, 20, 196);

-- ----------------------------
-- Table structure for orderlist
-- ----------------------------
DROP TABLE IF EXISTS `orderlist`;
CREATE TABLE `orderlist`  (
  `o_id` int(11) NOT NULL AUTO_INCREMENT,
  `o_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `o_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `o_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `o_statue` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `o_isuse` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `d_couponnum` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `o_method` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `o_paustatue` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `m_id` int(11) NULL DEFAULT NULL,
  `u_id` int(11) NULL DEFAULT NULL,
  `o_begintime` datetime NULL DEFAULT NULL,
  `o_estimate` datetime NULL DEFAULT NULL,
  `o_endtime` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`o_id`) USING BTREE,
  INDEX `m_id`(`m_id`) USING BTREE,
  INDEX `u_id`(`u_id`) USING BTREE,
  INDEX `d_couponnum`(`d_couponnum`) USING BTREE,
  CONSTRAINT `orderlist_ibfk_1` FOREIGN KEY (`d_couponnum`) REFERENCES `discount` (`d_couponnum`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `orderlist_ibfk_2` FOREIGN KEY (`m_id`) REFERENCES `mer` (`m_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `orderlist_ibfk_3` FOREIGN KEY (`u_id`) REFERENCES `userinfo` (`u_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 201 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of orderlist
-- ----------------------------
INSERT INTO `orderlist` VALUES (1, 'HUQJ5B', '17250227769', '重庆市万州区天城镇塘坊还房B栋1幢二楼', '等待付款', '0', NULL, '支付宝', '未支付', 14, 139, '2022-04-30 20:37:08', '2022-04-30 22:02:11', NULL);
INSERT INTO `orderlist` VALUES (2, '6RSESW', '13856823919', '重庆市九龙坡区谢家湾正街55号万象城4层86号', '等待付款', '0', NULL, '云闪付', '未支付', 5, 169, '2022-03-01 03:54:06', '2022-03-01 05:11:24', NULL);
INSERT INTO `orderlist` VALUES (3, 'LQ2KKV', '18220851802', '重庆市沙坪坝区大学城中路虎曾南段虎溪便民夜市A区31号门面', '等待付款', '0', NULL, '支付宝', '未支付', 1, 61, '2022-03-13 22:49:33', '2022-03-14 00:07:51', NULL);
INSERT INTO `orderlist` VALUES (4, '0Z3SNS', '13089177654', '重庆市九龙坡区含谷镇含兴路24号', '等待付款', '0', NULL, '云闪付', '未支付', 2, 68, '2022-03-10 10:53:48', '2022-03-10 12:18:26', NULL);
INSERT INTO `orderlist` VALUES (5, 'R1O0QT', '16567471324', '重庆市沙坪坝区景和路42号', '等待付款', '0', NULL, '云闪付', '未支付', 7, 11, '2022-02-04 07:14:05', '2022-02-04 08:34:40', NULL);
INSERT INTO `orderlist` VALUES (6, 'N2JNLT', '13975202219', '重庆市渝中区长江支路11号(大坪地铁站5号口步行180米)', '等待付款', '0', NULL, '支付宝', '未支付', 16, 92, '2022-03-23 12:52:42', '2022-03-23 14:13:05', NULL);
INSERT INTO `orderlist` VALUES (7, 'LJYDUZ', '18794032710', '重庆市沙坪坝区陈家桥桥北路18号附10号', '等待付款', '0', NULL, '微信', '未支付', 10, 37, '2022-04-17 17:54:43', '2022-04-17 19:12:53', NULL);
INSERT INTO `orderlist` VALUES (8, 'LG5TU9', '16720345902', '重庆市沙坪坝区景苑路8号附236号', '等待付款', '0', NULL, '微信', '未支付', 8, 57, '2022-03-02 19:19:41', '2022-03-02 20:32:09', NULL);
INSERT INTO `orderlist` VALUES (9, 'II16FZ', '15684106290', '重庆市巫山县桐子坪巫山大酒店', '等待付款', '0', NULL, '支付宝', '未支付', 15, 128, '2022-04-04 19:03:43', '2022-04-04 20:19:31', NULL);
INSERT INTO `orderlist` VALUES (10, '300Z2S', '17897557975', '重庆市万州区天城镇塘坊还房B栋1幢二楼', '等待付款', '0', NULL, '支付宝', '未支付', 14, 18, '2022-02-18 14:20:19', '2022-02-18 15:46:02', NULL);
INSERT INTO `orderlist` VALUES (11, 'H4WA4X', '17187801814', '重庆市沙坪坝区景苑路8号附236号', '等待付款', '0', NULL, '云闪付', '未支付', 8, 175, '2022-01-12 13:22:16', '2022-01-12 14:45:57', NULL);
INSERT INTO `orderlist` VALUES (12, '2CZB14', '15096067247', '重庆市九龙坡区谢家湾正街55号万象城4层86号', '等待付款', '0', NULL, '云闪付', '未支付', 5, 191, '2022-04-30 02:44:52', '2022-04-30 04:02:05', NULL);
INSERT INTO `orderlist` VALUES (13, '60Y6HS', '19843407938', '重庆市巫山县桐子坪巫山大酒店', '等待付款', '0', NULL, '云闪付', '未支付', 15, 9, '2022-01-21 10:16:22', '2022-01-21 11:40:12', NULL);
INSERT INTO `orderlist` VALUES (14, 'WA4X7E', '15303563860', '重庆市沙坪坝区熙街11号楼1F-04', '等待付款', '0', NULL, '支付宝', '未支付', 9, 18, '2022-03-03 10:58:24', '2022-03-03 12:10:47', NULL);
INSERT INTO `orderlist` VALUES (15, 'RAO9Q2', '15309503363', '重庆市渝北区两江新区鸳鸯街道湖彩路118号光环购物公园L5层A-L5-03号', '等待付款', '0', NULL, '微信', '未支付', 3, 58, '2022-01-31 21:15:09', '2022-01-31 22:30:58', NULL);
INSERT INTO `orderlist` VALUES (16, 'B31W97', '15537993867', '重庆市沙坪坝区景苑路与大学城北路交叉口东南140米', '等待付款', '0', NULL, '云闪付', '未支付', 11, 28, '2022-05-01 10:53:44', '2022-05-01 12:16:49', NULL);
INSERT INTO `orderlist` VALUES (17, 'YX0GLQ', '17736681355', '重庆市沙坪坝区大学城中路虎曾南段虎溪便民夜市A区31号门面', '等待付款', '0', NULL, '云闪付', '未支付', 1, 146, '2022-01-15 14:11:49', '2022-01-15 15:36:24', NULL);
INSERT INTO `orderlist` VALUES (18, 'T389GW', '16631957082', '重庆市沙坪坝区景苑路与大学城北路交叉口东南140米', '等待付款', '0', '10EXCCES', '微信', '未支付', 11, 126, '2022-03-24 05:41:36', '2022-03-24 07:05:45', NULL);
INSERT INTO `orderlist` VALUES (19, 'IPED4V', '13179687420', '重庆市沙坪坝区陈家桥桥北路18号附10号', '等待付款', '0', NULL, '云闪付', '未支付', 10, 142, '2022-03-27 22:48:37', '2022-03-28 00:06:07', NULL);
INSERT INTO `orderlist` VALUES (20, 'BKKVXZ', '19175478965', '重庆市九龙坡区谢家湾正街55号万象城4层86号', '等待付款', '0', NULL, '微信', '未支付', 20, 72, '2022-02-22 20:29:47', '2022-02-22 21:45:11', NULL);
INSERT INTO `orderlist` VALUES (21, '9RZV7W', '15217485188', '沙坪坝区大学城龙湖U城天街B馆L3-24', '等待付款', '0', NULL, '支付宝', '未支付', 19, 71, '2022-04-13 21:10:54', '2022-04-13 22:37:13', NULL);
INSERT INTO `orderlist` VALUES (22, 'OH300Z', '13935244654', '重庆市九龙坡区谢家湾正街55号万象城4层86号', '等待付款', '0', NULL, '支付宝', '未支付', 20, 153, '2022-01-01 17:16:34', '2022-01-01 18:31:11', NULL);
INSERT INTO `orderlist` VALUES (23, '2SX2DW', '13058913436', '沙坪坝区大学城龙湖U城天街B馆L3-24', '等待付款', '0', NULL, '云闪付', '未支付', 19, 185, '2022-02-17 01:12:04', '2022-02-17 02:32:17', NULL);
INSERT INTO `orderlist` VALUES (24, 'FPG6P5', '18150139530', '渝中区邹容路100号重庆时代广场L6层L602', '等待付款', '0', NULL, '支付宝', '未支付', 4, 166, '2022-05-01 08:39:54', '2022-05-01 10:00:30', NULL);
INSERT INTO `orderlist` VALUES (25, 'TCZB24', '13437545766', '重庆市渝中区长江支路11号(大坪地铁站5号口步行180米)', '等待付款', '1', '04EXCCES', '微信', '未支付', 16, 93, '2022-03-14 17:44:15', '2022-03-14 19:00:08', NULL);
INSERT INTO `orderlist` VALUES (26, '6HVNTA', '15830165989', '重庆市沙坪坝区景和路青年文艺广场2-号', '等待付款', '1', '12EXCCES', '云闪付', '未支付', 18, 7, '2022-01-02 23:44:26', '2022-01-03 01:02:48', NULL);
INSERT INTO `orderlist` VALUES (27, 'X1Y6IS', '13328773784', '重庆市沙坪坝区大学城景苑路8号附38至41号', '等待付款', '1', '18EXCCES', '支付宝', '未支付', 17, 17, '2022-04-27 08:41:21', '2022-04-27 10:03:40', NULL);
INSERT INTO `orderlist` VALUES (28, 'FR0RQL', '16698547047', '重庆市沙坪坝区熙街11号楼1F-04', '等待付款', '1', '15EXCCES', '支付宝', '未支付', 9, 53, '2022-05-02 18:10:25', '2022-05-02 19:31:03', NULL);
INSERT INTO `orderlist` VALUES (29, 'GXJ4F1', '15898889820', '重庆市沙坪坝区大学城景苑路8号附38至41号', '等待付款', '1', '16EXCCES', '微信', '未支付', 17, 99, '2022-04-21 14:38:21', '2022-04-21 15:52:56', NULL);
INSERT INTO `orderlist` VALUES (30, 'VFQ3HU', '17556039281', '重庆市沙坪坝区景和路青年文艺广场2-号', '等待付款', '1', '09EXCCES', '支付宝', '未支付', 18, 127, '2022-03-04 08:32:26', '2022-03-04 09:44:50', NULL);
INSERT INTO `orderlist` VALUES (31, 'X2DWV6', '18224056017', '重庆市南岸区黄桷垭正街150号第四人民医院沿西北方往木子园方向前行200米老君洞南门牌坊处', '等待付款', '1', '20EXCCES', '支付宝', '未支付', 12, 193, '2022-01-23 03:40:23', '2022-01-23 05:04:03', NULL);
INSERT INTO `orderlist` VALUES (32, '6Q1ES5', '19912357511', '重庆市渝中区长江支路11号(大坪地铁站5号口步行180米)', '等待付款', '1', '10EXCCES', '支付宝', '未支付', 16, 184, '2022-04-29 01:03:57', '2022-04-29 02:27:15', NULL);
INSERT INTO `orderlist` VALUES (33, 'G6P54N', '14753676098', '重庆市沙坪坝区景和路42号', '等待付款', '1', '20EXCCES', '微信', '未支付', 7, 79, '2022-04-08 18:22:39', '2022-04-08 19:44:08', NULL);
INSERT INTO `orderlist` VALUES (34, 'GWTDE1', '15351688940', '沙坪坝区大学城龙湖U城天街B馆L3-24', '等待付款', '1', '12EXCCES', '支付宝', '未支付', 19, 167, '2022-01-17 17:02:52', '2022-01-17 18:18:00', NULL);
INSERT INTO `orderlist` VALUES (35, 'QCHU0S', '19812473299', '重庆市沙坪坝区陈家桥桥北路18号附10号', '等待付款', '1', '06EXCCES', '云闪付', '未支付', 10, 150, '2022-02-09 15:26:21', '2022-02-09 16:44:59', NULL);
INSERT INTO `orderlist` VALUES (36, 'Y3O7X8', '17501945542', '重庆市九龙坡区谢家湾正街55号万象城4层86号', '等待付款', '1', '14EXCCES', '云闪付', '未支付', 5, 51, '2022-04-11 09:10:05', '2022-04-11 10:35:40', NULL);
INSERT INTO `orderlist` VALUES (37, 'KVXZUB', '13228126563', '重庆市渝北区两江新区鸳鸯街道湖彩路118号光环购物公园L5层A-L5-03号', '等待付款', '1', '07EXCCES', '微信', '未支付', 3, 162, '2022-01-14 12:48:33', '2022-01-14 14:01:47', NULL);
INSERT INTO `orderlist` VALUES (38, 'E3Y3O7', '17632359110', '重庆市南岸区黄桷垭正街150号第四人民医院沿西北方往木子园方向前行200米老君洞南门牌坊处', '等待付款', '1', '09EXCCES', '云闪付', '未支付', 12, 160, '2022-03-28 08:12:42', '2022-03-28 09:31:07', NULL);
INSERT INTO `orderlist` VALUES (39, 'F9IPED', '17844301101', '重庆市南岸区黄桷垭正街150号第四人民医院沿西北方往木子园方向前行200米老君洞南门牌坊处', '等待付款', '1', '20EXCCES', '支付宝', '未支付', 12, 89, '2022-04-16 12:27:42', '2022-04-16 13:50:44', NULL);
INSERT INTO `orderlist` VALUES (40, 'P54NAM', '17016141679', '渝中区邹容路100号重庆时代广场L6层L602', '等待付款', '1', '10EXCCES', '支付宝', '未支付', 4, 152, '2022-04-15 05:14:49', '2022-04-15 06:30:42', NULL);
INSERT INTO `orderlist` VALUES (41, 'U9SV53', '15749791713', '重庆市沙坪坝区景苑路8号附236号', '等待付款', '1', '07EXCCES', '微信', '未支付', 8, 191, '2022-03-18 08:07:00', '2022-03-18 09:31:09', NULL);
INSERT INTO `orderlist` VALUES (42, 'V6Z1VD', '18991418907', '重庆市沙坪坝区景和路青年文艺广场2-号', '等待付款', '1', '10EXCCES', '支付宝', '未支付', 18, 122, '2022-01-28 08:02:43', '2022-01-28 09:27:55', NULL);
INSERT INTO `orderlist` VALUES (43, 'O9Q2B3', '13657737868', '重庆市沙坪坝区景和路青年文艺广场2-号', '等待付款', '1', '07EXCCES', '云闪付', '未支付', 18, 5, '2022-04-30 15:08:42', '2022-04-30 16:25:21', NULL);
INSERT INTO `orderlist` VALUES (44, 'NMPFAF', '15218082314', '重庆市南岸区黄桷垭正街150号第四人民医院沿西北方往木子园方向前行200米老君洞南门牌坊处', '等待付款', '1', '09EXCCES', '微信', '未支付', 12, 131, '2022-04-11 10:08:48', '2022-04-11 11:30:14', NULL);
INSERT INTO `orderlist` VALUES (45, 'HS7Y5L', '17302068425', '重庆市沙坪坝区大学城景苑路8号附38至41号', '等待付款', '1', '07EXCCES', '云闪付', '未支付', 17, 189, '2022-03-04 07:42:05', '2022-03-04 08:55:02', NULL);
INSERT INTO `orderlist` VALUES (46, 'Q2B31W', '13231902509', '重庆市渝中区长江支路11号(大坪地铁站5号口步行180米)', '等待取货', '0', NULL, '云闪付', '已支付', 16, 54, '2022-04-02 19:01:24', '2022-04-02 20:16:54', '2022-04-02 19:57:16');
INSERT INTO `orderlist` VALUES (47, '7WB08C', '17308601927', '沙坪坝区大学城龙湖U城天街B馆L3-24', '等待取货', '0', NULL, '支付宝', '已支付', 19, 39, '2022-04-05 10:35:32', '2022-04-05 11:49:14', '2022-04-05 11:22:40');
INSERT INTO `orderlist` VALUES (48, 'NCJNKT', '19991968016', '重庆市沙坪坝区景苑路与大学城北路交叉口东南140米', '等待取货', '0', NULL, '微信', '已支付', 11, 35, '2022-01-22 04:14:20', '2022-01-22 05:30:45', '2022-01-22 05:14:27');
INSERT INTO `orderlist` VALUES (49, 'VW3A6Q', '15296662153', '重庆市沙坪坝区熙街11号楼1F-04', '等待取货', '0', NULL, '微信', '已支付', 9, 48, '2022-04-20 09:31:14', '2022-04-20 10:47:54', '2022-04-20 10:19:18');
INSERT INTO `orderlist` VALUES (50, 'ET2CZB', '13588668408', '重庆市巴南区红光大道杰信华府广场东北侧约50米', '已出货', '0', NULL, '云闪付', '已支付', 13, 130, '2022-04-21 02:12:09', '2022-04-21 03:30:28', '2022-04-21 03:02:12');
INSERT INTO `orderlist` VALUES (51, '9HT389', '19943455528', '重庆市巫山县桐子坪巫山大酒店', '已出货', '0', NULL, '微信', '已支付', 15, 196, '2022-04-03 22:25:53', '2022-04-03 23:44:57', '2022-04-03 23:16:32');
INSERT INTO `orderlist` VALUES (52, '22TTCI', '15828047679', '重庆市沙坪坝区大学城景苑路8号附38至41号', '已出货', '0', NULL, '云闪付', '已支付', 17, 4, '2022-04-23 14:00:00', '2022-04-23 15:20:35', '2022-04-23 14:58:21');
INSERT INTO `orderlist` VALUES (53, 'JXHKU1', '15934479919', '重庆市渝中区长江支路11号(大坪地铁站5号口步行180米)', '已送达', '0', NULL, '云闪付', '已支付', 16, 114, '2022-02-19 18:05:42', '2022-02-19 19:32:04', '2022-02-19 19:06:59');
INSERT INTO `orderlist` VALUES (54, 'CIRAO9', '18737462366', '重庆市沙坪坝区景苑路与大学城北路交叉口东南140米', '已送达', '0', NULL, '微信', '已支付', 11, 130, '2022-03-11 13:00:07', '2022-03-11 14:17:05', '2022-03-11 13:53:33');
INSERT INTO `orderlist` VALUES (55, 'XZUBLG', '15370881079', '重庆市沙坪坝区陈家桥桥北路18号附10号', '已送达', '0', NULL, '微信', '已支付', 10, 186, '2022-01-21 10:23:52', '2022-01-21 11:42:55', '2022-01-21 11:26:11');
INSERT INTO `orderlist` VALUES (56, 'C8LJYD', '17000653056', '重庆市沙坪坝区景苑路与大学城北路交叉口东南140米', '已送达', '0', NULL, '支付宝', '已支付', 11, 120, '2022-02-22 13:32:04', '2022-02-22 14:56:43', '2022-02-22 14:37:41');
INSERT INTO `orderlist` VALUES (57, 'IF8MF9', '18638574008', '重庆市沙坪坝区熙街11号楼1F-04', '已送达', '0', NULL, '云闪付', '已支付', 9, 143, '2022-03-27 08:10:14', '2022-03-27 09:31:35', '2022-03-27 09:09:18');
INSERT INTO `orderlist` VALUES (58, 'IPED4V', '13442724500', '重庆市沙坪坝区熙街11号楼1F-04', '已送达', '0', NULL, '支付宝', '已支付', 9, 94, '2022-01-14 19:47:01', '2022-01-14 21:11:29', '2022-01-14 20:45:04');
INSERT INTO `orderlist` VALUES (59, '14MEC8', '13989163065', '重庆市沙坪坝区大学城景苑路8号附38至41号', '已送达', '0', NULL, '微信', '已支付', 17, 59, '2022-02-24 14:48:02', '2022-02-24 16:08:41', '2022-02-24 15:49:13');
INSERT INTO `orderlist` VALUES (60, 'D6RYYX', '13185678878', '重庆市万州区天城镇塘坊还房B栋1幢二楼', '已送达', '0', NULL, '微信', '已支付', 14, 46, '2022-04-21 05:35:19', '2022-04-21 06:58:03', '2022-04-21 06:40:07');
INSERT INTO `orderlist` VALUES (61, '0GLQBK', '18991715003', '重庆市沙坪坝区景和路青年文艺广场2-号', '已送达', '0', NULL, '支付宝', '已支付', 18, 136, '2022-03-15 21:03:06', '2022-03-15 22:15:58', '2022-03-15 21:59:15');
INSERT INTO `orderlist` VALUES (62, 'LG5TU9', '15187937849', '重庆市巫山县桐子坪巫山大酒店', '已送达', '0', NULL, '支付宝', '已支付', 15, 33, '2022-03-20 04:45:37', '2022-03-20 06:06:56', '2022-03-20 05:45:27');
INSERT INTO `orderlist` VALUES (63, 'M5C8LJ', '14519809379', '重庆市沙坪坝区景苑路8号附18号1F-25', '等待取货', '0', NULL, '云闪付', '已支付', 6, 141, '2022-04-30 21:15:13', '2022-04-30 22:29:39', '2022-04-30 22:11:08');
INSERT INTO `orderlist` VALUES (64, '17FZDY', '17543566881', '重庆市九龙坡区谢家湾正街55号万象城4层86号', '等待取货', '0', NULL, '云闪付', '已支付', 5, 125, '2022-04-20 01:11:33', '2022-04-20 02:37:32', '2022-04-20 02:10:40');
INSERT INTO `orderlist` VALUES (65, '3A6Q1E', '13327907166', '重庆市巫山县桐子坪巫山大酒店', '等待取货', '0', NULL, '云闪付', '已支付', 15, 37, '2022-02-02 03:22:14', '2022-02-02 04:43:00', '2022-02-02 04:26:33');
INSERT INTO `orderlist` VALUES (66, 'NMPFAF', '13975318371', '重庆市沙坪坝区景苑路与大学城北路交叉口东南140米', '等待取货', '0', NULL, '支付宝', '已支付', 11, 4, '2022-04-15 04:43:51', '2022-04-15 06:00:54', '2022-04-15 05:38:09');
INSERT INTO `orderlist` VALUES (67, 'SV53R0', '14505176852', '重庆市渝中区长江支路11号(大坪地铁站5号口步行180米)', '等待取货', '0', NULL, '支付宝', '已支付', 16, 101, '2022-05-10 22:37:11', '2022-05-10 23:58:17', '2022-05-10 23:37:23');
INSERT INTO `orderlist` VALUES (68, '8C9HT3', '15846056107', '重庆市沙坪坝区熙街11号楼1F-04', '等待取货', '0', NULL, '微信', '已支付', 9, 51, '2022-04-10 20:24:34', '2022-04-10 21:37:53', '2022-04-10 21:18:09');
INSERT INTO `orderlist` VALUES (69, 'R8VFQC', '18421638052', '重庆市沙坪坝区熙街11号楼1F-04', '等待取货', '0', NULL, '云闪付', '已支付', 9, 25, '2022-02-18 15:11:55', '2022-02-18 16:24:26', '2022-02-18 15:57:42');
INSERT INTO `orderlist` VALUES (70, 'U1FPG6', '13639373149', '重庆市沙坪坝区景苑路8号附18号1F-25', '等待取货', '0', NULL, '微信', '已支付', 6, 170, '2022-03-19 02:40:44', '2022-03-19 03:57:45', '2022-03-19 03:42:57');
INSERT INTO `orderlist` VALUES (71, 'TTCIRA', '17662453121', '重庆市九龙坡区含谷镇含兴路24号', '等待取货', '0', NULL, '云闪付', '已支付', 2, 116, '2022-01-26 18:25:33', '2022-01-26 19:43:25', '2022-01-26 19:28:22');
INSERT INTO `orderlist` VALUES (72, 'JNKT45', '17612576871', '重庆市沙坪坝区景苑路8号附18号1F-25', '等待取货', '0', NULL, '支付宝', '已支付', 6, 81, '2022-01-05 09:16:34', '2022-01-05 10:39:42', '2022-01-05 10:18:04');
INSERT INTO `orderlist` VALUES (73, '3A6Q1E', '13092313969', '重庆市沙坪坝区陈家桥桥北路18号附10号', '等待取货', '0', NULL, '支付宝', '已支付', 10, 189, '2022-03-01 13:00:37', '2022-03-01 14:14:55', '2022-03-01 13:59:39');
INSERT INTO `orderlist` VALUES (74, 'S51UGM', '17899663748', '重庆市九龙坡区谢家湾正街55号万象城4层86号', '等待取货', '0', NULL, '支付宝', '已支付', 5, 24, '2022-04-29 08:08:42', '2022-04-29 09:24:15', '2022-04-29 08:57:12');
INSERT INTO `orderlist` VALUES (75, '7E22TK', '14583485615', '重庆市沙坪坝区景苑路与大学城北路交叉口东南140米', '已出货', '0', NULL, '微信', '已支付', 11, 108, '2022-01-15 12:20:07', '2022-01-15 13:41:57', '2022-01-15 13:19:04');
INSERT INTO `orderlist` VALUES (76, 'ZEVPNV', '18751159499', '重庆市沙坪坝区景苑路8号附236号', '已出货', '0', NULL, '支付宝', '已支付', 8, 94, '2022-04-02 07:32:23', '2022-04-02 08:44:48', '2022-04-02 08:28:46');
INSERT INTO `orderlist` VALUES (77, 'WB4Y7E', '13486473961', '重庆市万州区天城镇塘坊还房B栋1幢二楼', '已出货', '0', NULL, '微信', '已支付', 14, 125, '2022-05-02 06:05:59', '2022-05-02 07:24:00', '2022-05-02 07:03:38');
INSERT INTO `orderlist` VALUES (78, '098JMO', '15296076472', '重庆市巴南区红光大道杰信华府广场东北侧约50米', '已出货', '0', NULL, '支付宝', '已支付', 13, 17, '2022-03-04 01:28:09', '2022-03-04 02:49:28', '2022-03-04 02:34:55');
INSERT INTO `orderlist` VALUES (79, 'IZA5UH', '17030604008', '重庆市巴南区红光大道杰信华府广场东北侧约50米', '已出货', '0', NULL, '支付宝', '已支付', 13, 15, '2022-03-14 12:45:51', '2022-03-14 14:07:15', '2022-03-14 13:40:48');
INSERT INTO `orderlist` VALUES (80, 'YGOJWU', '17565764588', '重庆市沙坪坝区熙街11号楼1F-04', '已出货', '0', NULL, '云闪付', '已支付', 9, 167, '2022-01-07 00:01:22', '2022-01-07 01:13:34', '2022-01-07 00:54:41');
INSERT INTO `orderlist` VALUES (81, '0GLQBK', '13967026850', '重庆市沙坪坝区陈家桥桥北路18号附10号', '已出货', '0', NULL, '支付宝', '已支付', 10, 23, '2022-01-30 10:02:49', '2022-01-30 11:21:23', '2022-01-30 10:52:44');
INSERT INTO `orderlist` VALUES (82, 'Z1VDXI', '13460925811', '重庆市沙坪坝区陈家桥桥北路18号附10号', '已出货', '0', NULL, '云闪付', '已支付', 10, 68, '2022-03-09 02:22:44', '2022-03-09 03:41:28', '2022-03-09 03:23:46');
INSERT INTO `orderlist` VALUES (83, '5TU9SV', '18339344355', '重庆市沙坪坝区景和路42号', '已出货', '0', NULL, '微信', '已支付', 7, 57, '2022-02-19 08:39:35', '2022-02-19 10:02:19', '2022-02-19 09:41:19');
INSERT INTO `orderlist` VALUES (84, 'AF098J', '13241359364', '重庆市沙坪坝区景和路青年文艺广场2-号', '已出货', '0', NULL, '支付宝', '已支付', 18, 58, '2022-01-07 22:42:23', '2022-01-07 23:54:30', '2022-01-07 23:26:17');
INSERT INTO `orderlist` VALUES (85, 'B08C9H', '13973747642', '重庆市沙坪坝区大学城景苑路8号附38至41号', '已出货', '0', NULL, '微信', '已支付', 17, 31, '2022-03-14 18:26:23', '2022-03-14 19:40:49', '2022-03-14 19:22:18');
INSERT INTO `orderlist` VALUES (86, '098JMO', '19855999393', '渝中区邹容路100号重庆时代广场L6层L602', '已出货', '0', NULL, '微信', '已支付', 4, 196, '2022-04-07 03:34:43', '2022-04-07 04:49:44', '2022-04-07 04:21:12');
INSERT INTO `orderlist` VALUES (87, '97N2JN', '18180243804', '重庆市沙坪坝区景和路42号', '已送达', '0', NULL, '微信', '已支付', 7, 195, '2022-05-10 06:58:54', '2022-05-10 08:11:44', '2022-05-10 07:46:44');
INSERT INTO `orderlist` VALUES (88, '9KMOI0', '18673681206', '重庆市沙坪坝区大学城景苑路8号附38至41号', '已送达', '0', NULL, '支付宝', '已支付', 17, 66, '2022-03-28 13:32:08', '2022-03-28 14:44:48', '2022-03-28 14:25:20');
INSERT INTO `orderlist` VALUES (89, '22TK3I', '15794715780', '重庆市万州区天城镇塘坊还房B栋1幢二楼', '已送达', '0', NULL, '微信', '已支付', 14, 45, '2022-04-23 04:04:37', '2022-04-23 05:30:39', '2022-04-23 05:05:52');
INSERT INTO `orderlist` VALUES (90, 'AP60Y6', '14737606880', '重庆市沙坪坝区大学城景苑路8号附38至41号', '已送达', '0', NULL, '微信', '已支付', 17, 69, '2022-05-10 05:01:03', '2022-05-10 06:20:54', '2022-05-10 05:52:08');
INSERT INTO `orderlist` VALUES (91, '7E22TT', '18531393353', '重庆市沙坪坝区陈家桥桥北路18号附10号', '已送达', '0', NULL, '云闪付', '已支付', 10, 164, '2022-02-21 08:06:11', '2022-02-21 09:19:28', '2022-02-21 08:55:28');
INSERT INTO `orderlist` VALUES (92, '6GVW3A', '15591241197', '渝中区邹容路100号重庆时代广场L6层L602', '已送达', '0', NULL, '支付宝', '已支付', 4, 61, '2022-01-13 12:29:50', '2022-01-13 13:53:14', '2022-01-13 13:34:57');
INSERT INTO `orderlist` VALUES (93, '53R0II', '18109473902', '重庆市沙坪坝区大学城中路虎曾南段虎溪便民夜市A区31号门面', '已送达', '0', NULL, '微信', '已支付', 1, 55, '2022-04-23 15:54:35', '2022-04-23 17:09:58', '2022-04-23 16:45:32');
INSERT INTO `orderlist` VALUES (94, '45KLR8', '14726723469', '重庆市渝北区两江新区鸳鸯街道湖彩路118号光环购物公园L5层A-L5-03号', '已送达', '0', NULL, '支付宝', '已支付', 3, 133, '2022-04-18 07:00:23', '2022-04-18 08:15:13', '2022-04-18 07:58:16');
INSERT INTO `orderlist` VALUES (95, '0SEBBA', '18426094594', '重庆市沙坪坝区熙街11号楼1F-04', '已送达', '0', NULL, '云闪付', '已支付', 9, 95, '2022-04-09 02:53:45', '2022-04-09 04:18:19', '2022-04-09 03:54:14');
INSERT INTO `orderlist` VALUES (96, 'AMDGYG', '13991325608', '渝中区邹容路100号重庆时代广场L6层L602', '等待取货', '1', '19EXCCES', '支付宝', '已支付', 4, 170, '2022-04-13 22:52:25', '2022-04-14 00:14:49', '2022-04-14 00:00:19');
INSERT INTO `orderlist` VALUES (97, 'GMNMPF', '18654195810', '重庆市巴南区红光大道杰信华府广场东北侧约50米', '等待取货', '1', '09EXCCES', '云闪付', '已支付', 13, 51, '2022-02-08 16:18:15', '2022-02-08 17:33:30', '2022-02-08 17:17:14');
INSERT INTO `orderlist` VALUES (98, 'JXHKU1', '15598162738', '重庆市沙坪坝区景苑路8号附18号1F-25', '等待取货', '1', '03EXCCES', '微信', '已支付', 6, 179, '2022-04-13 15:00:46', '2022-04-13 16:16:16', '2022-04-13 15:51:10');
INSERT INTO `orderlist` VALUES (99, 'YGOJWU', '13313499790', '重庆市沙坪坝区景和路青年文艺广场2-号', '等待取货', '1', '13EXCCES', '云闪付', '已支付', 18, 8, '2022-03-04 00:18:56', '2022-03-04 01:43:38', '2022-03-04 01:26:23');
INSERT INTO `orderlist` VALUES (100, '89GWTD', '15682072112', '沙坪坝区大学城龙湖U城天街B馆L3-24', '已出货', '1', '13EXCCES', '支付宝', '已支付', 19, 56, '2022-03-16 18:24:01', '2022-03-16 19:38:54', '2022-03-16 19:17:23');
INSERT INTO `orderlist` VALUES (101, 'KT45KL', '19904461573', '重庆市沙坪坝区熙街11号楼1F-04', '已出货', '1', '01EXCCES', '云闪付', '已支付', 9, 120, '2022-03-27 00:15:10', '2022-03-27 01:31:48', '2022-03-27 01:13:33');
INSERT INTO `orderlist` VALUES (102, '8MF9IP', '15941149164', '重庆市沙坪坝区大学城中路虎曾南段虎溪便民夜市A区31号门面', '已出货', '1', '14EXCCES', '支付宝', '已支付', 1, 173, '2022-01-23 00:31:13', '2022-01-23 01:47:21', '2022-01-23 01:29:43');
INSERT INTO `orderlist` VALUES (103, 'DWV6Z1', '17139648534', '重庆市巫山县桐子坪巫山大酒店', '已出货', '1', '06EXCCES', '微信', '已支付', 15, 83, '2022-02-16 04:50:49', '2022-02-16 06:10:00', '2022-02-16 05:48:56');
INSERT INTO `orderlist` VALUES (104, 'MOIZA5', '13442591755', '重庆市沙坪坝区景苑路8号附236号', '已出货', '1', '14EXCCES', '云闪付', '已支付', 8, 2, '2022-01-30 02:09:49', '2022-01-30 03:33:21', '2022-01-30 03:04:34');
INSERT INTO `orderlist` VALUES (105, 'R0II16', '18367315841', '重庆市渝北区两江新区鸳鸯街道湖彩路118号光环购物公园L5层A-L5-03号', '已出货', '1', '05EXCCES', '微信', '已支付', 3, 77, '2022-03-22 19:46:56', '2022-03-22 21:00:01', '2022-03-22 20:39:58');
INSERT INTO `orderlist` VALUES (106, 'FZCYFR', '16609914049', '重庆市渝中区长江支路11号(大坪地铁站5号口步行180米)', '已出货', '1', '18EXCCES', '云闪付', '已支付', 16, 185, '2022-04-28 09:19:24', '2022-04-28 10:45:44', '2022-04-28 10:30:51');
INSERT INTO `orderlist` VALUES (107, 'W46GVW', '13124875588', '重庆市沙坪坝区景苑路8号附18号1F-25', '已出货', '1', '08EXCCES', '云闪付', '已支付', 6, 33, '2022-04-27 13:29:18', '2022-04-27 14:50:03', '2022-04-27 14:24:28');
INSERT INTO `orderlist` VALUES (108, '4NAMDG', '17239452643', '重庆市沙坪坝区景和路42号', '已送达', '1', '14EXCCES', '支付宝', '已支付', 7, 48, '2022-04-11 12:43:52', '2022-04-11 14:09:49', '2022-04-11 13:45:19');
INSERT INTO `orderlist` VALUES (109, 'ZV7WB0', '15834149371', '重庆市沙坪坝区景和路青年文艺广场2-号', '已送达', '1', '01EXCCES', '微信', '已支付', 18, 84, '2022-01-17 19:20:12', '2022-01-17 20:39:40', '2022-01-17 20:17:12');
INSERT INTO `orderlist` VALUES (110, 'E15JOH', '18155697570', '重庆市渝中区长江支路11号(大坪地铁站5号口步行180米)', '已送达', '1', '05EXCCES', '支付宝', '已支付', 16, 83, '2022-01-14 03:31:17', '2022-01-14 04:51:11', '2022-01-14 04:24:59');
INSERT INTO `orderlist` VALUES (111, 'HKU1FP', '19818634403', '重庆市沙坪坝区景和路42号', '已送达', '1', '15EXCCES', '微信', '已支付', 7, 129, '2022-03-23 19:57:19', '2022-03-23 21:16:58', '2022-03-23 20:57:09');
INSERT INTO `orderlist` VALUES (112, '7Y5LH2', '13369063601', '渝中区邹容路100号重庆时代广场L6层L602', '已送达', '1', '18EXCCES', '支付宝', '已支付', 4, 42, '2022-03-03 09:43:42', '2022-03-03 11:09:10', '2022-03-03 10:50:14');
INSERT INTO `orderlist` VALUES (113, 'RYYX0G', '15343958677', '重庆市沙坪坝区景苑路8号附236号', '已送达', '1', '03EXCCES', '支付宝', '已支付', 8, 1, '2022-01-25 10:17:05', '2022-01-25 11:36:46', '2022-01-25 11:15:09');
INSERT INTO `orderlist` VALUES (114, '0Z2SX2', '19149143328', '重庆市万州区天城镇塘坊还房B栋1幢二楼', '已送达', '1', '14EXCCES', '微信', '已支付', 14, 63, '2022-03-31 04:21:32', '2022-03-31 05:44:58', '2022-03-31 05:21:42');
INSERT INTO `orderlist` VALUES (115, 'ET2CZB', '13493311622', '重庆市九龙坡区谢家湾正街55号万象城4层86号', '已送达', '1', '13EXCCES', '支付宝', '已支付', 20, 135, '2022-04-08 05:30:41', '2022-04-08 06:46:53', '2022-04-08 06:23:43');
INSERT INTO `orderlist` VALUES (116, '1N3GYG', '15007497166', '重庆市九龙坡区谢家湾正街55号万象城4层86号', '等待取货', '1', '20EXCCES', '云闪付', '已支付', 5, 126, '2022-03-03 16:52:25', '2022-03-03 18:12:25', '2022-03-03 17:55:23');
INSERT INTO `orderlist` VALUES (117, 'OQK2M7', '13770477431', '重庆市沙坪坝区景苑路8号附18号1F-25', '等待取货', '1', '15EXCCES', '云闪付', '已支付', 6, 163, '2022-02-05 13:10:14', '2022-02-05 14:32:05', '2022-02-05 14:09:59');
INSERT INTO `orderlist` VALUES (118, '9HTU9A', '13790943495', '重庆市九龙坡区谢家湾正街55号万象城4层86号', '等待取货', '1', '03EXCCES', '微信', '已支付', 5, 15, '2022-04-26 14:22:52', '2022-04-26 15:40:50', '2022-04-26 15:15:12');
INSERT INTO `orderlist` VALUES (119, 'DWMXZ1', '19161641309', '重庆市渝中区长江支路11号(大坪地铁站5号口步行180米)', '等待取货', '1', '13EXCCES', '支付宝', '已支付', 16, 95, '2022-05-04 23:59:37', '2022-05-05 01:16:44', '2022-05-05 00:59:27');
INSERT INTO `orderlist` VALUES (120, '8JMOIZ', '18279121363', '重庆市沙坪坝区景和路青年文艺广场2-号', '等待取货', '1', '12EXCCES', '云闪付', '已支付', 18, 118, '2022-01-15 00:21:52', '2022-01-15 01:47:59', '2022-01-15 01:21:52');
INSERT INTO `orderlist` VALUES (121, '16FZCY', '18163851822', '重庆市沙坪坝区景苑路8号附236号', '等待取货', '1', '04EXCCES', '微信', '已支付', 8, 51, '2022-03-30 00:03:23', '2022-03-30 01:16:12', '2022-03-30 01:01:19');
INSERT INTO `orderlist` VALUES (122, 'XIH4WA', '13085281342', '重庆市沙坪坝区景和路42号', '等待取货', '1', '17EXCCES', '云闪付', '已支付', 7, 139, '2022-03-08 08:33:10', '2022-03-08 09:59:05', '2022-03-08 09:43:35');
INSERT INTO `orderlist` VALUES (123, 'SYVFQ3', '15605705722', '重庆市巫山县桐子坪巫山大酒店', '已出货', '1', '21EXCCES', '云闪付', '已支付', 15, 123, '2022-03-05 23:14:52', '2022-03-06 00:33:14', '2022-03-06 00:13:13');
INSERT INTO `orderlist` VALUES (124, 'A5UIJX', '15018784700', '重庆市九龙坡区谢家湾正街55号万象城4层86号', '已出货', '1', '05EXCCES', '支付宝', '已支付', 5, 73, '2022-03-08 00:08:17', '2022-03-08 01:30:28', '2022-03-08 01:09:48');
INSERT INTO `orderlist` VALUES (125, 'WDXI74', '17729335465', '重庆市九龙坡区谢家湾正街55号万象城4层86号', '已出货', '1', '05EXCCES', '支付宝', '已支付', 5, 29, '2022-01-23 08:00:38', '2022-01-23 09:26:44', '2022-01-23 09:10:46');
INSERT INTO `orderlist` VALUES (126, 'V5KLSY', '18992777771', '重庆市巴南区红光大道杰信华府广场东北侧约50米', '已出货', '1', '17EXCCES', '云闪付', '已支付', 13, 8, '2022-02-07 17:38:13', '2022-02-07 18:51:09', '2022-02-07 18:30:10');
INSERT INTO `orderlist` VALUES (127, 'S51UGM', '15641695825', '重庆市万州区天城镇塘坊还房B栋1幢二楼', '已出货', '1', '14EXCCES', '云闪付', '已支付', 14, 193, '2022-03-17 02:36:55', '2022-03-17 03:50:54', '2022-03-17 03:28:12');
INSERT INTO `orderlist` VALUES (128, '3Q47D6', '18658327306', '重庆市沙坪坝区景苑路与大学城北路交叉口东南140米', '已出货', '1', '17EXCCES', '云闪付', '已支付', 11, 57, '2022-03-08 11:42:10', '2022-03-08 13:00:45', '2022-03-08 12:42:51');
INSERT INTO `orderlist` VALUES (129, 'VDXIH4', '17535533666', '重庆市巫山县桐子坪巫山大酒店', '已出货', '1', '05EXCCES', '微信', '已支付', 15, 55, '2022-01-12 20:11:47', '2022-01-12 21:31:37', '2022-01-12 21:04:20');
INSERT INTO `orderlist` VALUES (130, 'X8BC7O', '13742141657', '重庆市沙坪坝区景苑路8号附236号', '已出货', '1', '18EXCCES', '云闪付', '已支付', 8, 17, '2022-04-21 13:38:50', '2022-04-21 15:02:10', '2022-04-21 14:38:20');
INSERT INTO `orderlist` VALUES (131, '2UGNNM', '13932062056', '重庆市渝中区长江支路11号(大坪地铁站5号口步行180米)', '已送达', '1', '10EXCCES', '云闪付', '已支付', 16, 151, '2022-04-05 00:28:42', '2022-04-05 01:42:01', '2022-04-05 01:27:28');
INSERT INTO `orderlist` VALUES (132, '3QU8D6', '15349509086', '重庆市沙坪坝区大学城景苑路8号附38至41号', '已送达', '1', '07EXCCES', '支付宝', '已支付', 17, 90, '2022-04-24 01:20:46', '2022-04-24 02:46:34', '2022-04-24 02:31:46');
INSERT INTO `orderlist` VALUES (133, '5TLZTM', '18321505601', '重庆市沙坪坝区景苑路8号附18号1F-25', '已送达', '1', '16EXCCES', '云闪付', '已支付', 6, 23, '2022-05-04 05:31:02', '2022-05-04 06:47:26', '2022-05-04 06:21:32');
INSERT INTO `orderlist` VALUES (134, 'W3RRII', '15580161644', '重庆市渝北区两江新区鸳鸯街道湖彩路118号光环购物公园L5层A-L5-03号', '已送达', '1', '02EXCCES', '云闪付', '已支付', 3, 3, '2022-03-22 00:19:45', '2022-03-22 01:38:53', '2022-03-22 01:14:24');
INSERT INTO `orderlist` VALUES (135, 'YWC08C', '13688226538', '重庆市九龙坡区含谷镇含兴路24号', '已送达', '1', '07EXCCES', '微信', '已支付', 2, 196, '2022-02-22 07:20:18', '2022-02-22 08:34:23', '2022-02-22 08:12:51');
INSERT INTO `orderlist` VALUES (136, '14MEC8', '18877083055', '重庆市九龙坡区谢家湾正街55号万象城4层86号', '已送达', '1', '17EXCCES', '云闪付', '已支付', 5, 122, '2022-02-27 13:56:21', '2022-02-27 15:11:44', '2022-02-27 14:53:10');
INSERT INTO `orderlist` VALUES (137, 'O7X8BC', '18745651636', '重庆市沙坪坝区景苑路与大学城北路交叉口东南140米', '已送达', '1', '10EXCCES', '微信', '已支付', 11, 102, '2022-03-02 17:20:00', '2022-03-02 18:36:54', '2022-03-02 18:08:22');
INSERT INTO `orderlist` VALUES (138, '7O8TIF', '13946582884', '重庆市沙坪坝区景苑路8号附236号', '已送达', '1', '15EXCCES', '云闪付', '已支付', 8, 97, '2022-02-02 16:59:41', '2022-02-02 18:16:56', '2022-02-02 17:53:01');
INSERT INTO `orderlist` VALUES (139, 'ED4VET', '16554475614', '重庆市沙坪坝区景和路42号', '已送达', '1', '13EXCCES', '支付宝', '已支付', 7, 104, '2022-04-28 16:41:15', '2022-04-28 17:59:50', '2022-04-28 17:42:56');
INSERT INTO `orderlist` VALUES (140, 'OJWUAP', '14599253393', '重庆市沙坪坝区景苑路8号附236号', '已送达', '1', '21EXCCES', '支付宝', '已支付', 8, 192, '2022-04-16 09:33:16', '2022-04-16 10:58:44', '2022-04-16 10:30:35');
INSERT INTO `orderlist` VALUES (141, 'LJYDUZ', '15564906969', '重庆市沙坪坝区景苑路8号附236号', '已送达', '1', '02EXCCES', '支付宝', '已支付', 8, 4, '2022-04-12 13:00:48', '2022-04-12 14:19:19', '2022-04-12 13:52:17');
INSERT INTO `orderlist` VALUES (142, '74WB4Y', '19172291209', '重庆市沙坪坝区景和路青年文艺广场2-号', '等待付款', '0', NULL, '支付宝', '已支付', 18, 47, '2022-04-24 09:12:21', '2022-04-24 10:33:43', '2022-04-24 10:14:09');
INSERT INTO `orderlist` VALUES (143, 'LTV5KL', '15107314762', '重庆市渝中区长江支路11号(大坪地铁站5号口步行180米)', '等待付款', '0', NULL, '微信', '已支付', 16, 190, '2022-03-15 11:54:47', '2022-03-15 13:18:06', '2022-03-15 12:50:20');
INSERT INTO `orderlist` VALUES (144, 'PYX8BD', '13363507638', '重庆市沙坪坝区景和路42号', '等待付款', '0', NULL, '微信', '已支付', 7, 68, '2022-05-16 11:46:41', '2022-05-16 13:01:39', '2022-05-16 12:43:21');
INSERT INTO `orderlist` VALUES (145, '7OZUJ6', '17644307822', '重庆市九龙坡区谢家湾正街55号万象城4层86号', '等待付款', '0', NULL, '微信', '已支付', 5, 164, '2022-02-25 05:05:17', '2022-02-25 06:24:41', '2022-02-25 06:10:07');
INSERT INTO `orderlist` VALUES (146, '4E5VEU', '18401081746', '重庆市九龙坡区谢家湾正街55号万象城4层86号', '等待付款', '0', NULL, '云闪付', '已支付', 5, 185, '2022-02-18 08:25:49', '2022-02-18 09:46:04', '2022-02-18 09:21:57');
INSERT INTO `orderlist` VALUES (147, 'P5AF09', '16559972893', '重庆市万州区天城镇塘坊还房B栋1幢二楼', '等待付款', '0', NULL, '支付宝', '已支付', 14, 101, '2022-01-29 14:54:26', '2022-01-29 16:18:39', '2022-01-29 16:03:23');
INSERT INTO `orderlist` VALUES (148, '77PV4O', '18889965107', '重庆市沙坪坝区大学城景苑路8号附38至41号', '等待付款', '0', NULL, '云闪付', '已支付', 17, 142, '2022-01-25 17:48:09', '2022-01-25 19:04:57', '2022-01-25 18:43:02');
INSERT INTO `orderlist` VALUES (149, 'B31X97', '15885973310', '重庆市巫山县桐子坪巫山大酒店', '等待付款', '0', NULL, '支付宝', '已支付', 15, 175, '2022-01-29 14:58:47', '2022-01-29 16:24:28', '2022-01-29 15:57:10');
INSERT INTO `orderlist` VALUES (150, 'KVXZUB', '13501729133', '重庆市巴南区红光大道杰信华府广场东北侧约50米', '等待付款', '0', NULL, '微信', '已支付', 13, 161, '2022-03-03 01:47:29', '2022-03-03 03:02:18', '2022-03-03 02:36:05');
INSERT INTO `orderlist` VALUES (151, '4VET2C', '17715549576', '重庆市九龙坡区含谷镇含兴路24号', '等待付款', '0', NULL, '云闪付', '已支付', 2, 74, '2022-05-07 03:45:40', '2022-05-07 05:11:58', '2022-05-07 04:48:18');
INSERT INTO `orderlist` VALUES (152, 'IZA5UH', '17251178923', '重庆市沙坪坝区景和路青年文艺广场2-号', '等待付款', '0', NULL, '支付宝', '已支付', 18, 143, '2022-01-21 01:38:35', '2022-01-21 03:02:32', '2022-01-21 02:45:03');
INSERT INTO `orderlist` VALUES (153, 'H23Q47', '17265275281', '重庆市沙坪坝区景苑路与大学城北路交叉口东南140米', '等待付款', '0', NULL, '支付宝', '已支付', 11, 57, '2022-03-13 23:09:16', '2022-03-14 00:34:45', '2022-03-14 00:18:06');
INSERT INTO `orderlist` VALUES (154, 'CYFR9R', '17353456289', '重庆市沙坪坝区熙街11号楼1F-04', '等待取货', '0', NULL, '云闪付', '已支付', 9, 42, '2022-02-11 15:21:41', '2022-02-11 16:45:18', '2022-02-11 16:22:33');
INSERT INTO `orderlist` VALUES (155, 'YDUZW4', '18612283773', '重庆市沙坪坝区熙街11号楼1F-04', '等待取货', '0', NULL, '微信', '已支付', 9, 85, '2022-04-22 20:40:55', '2022-04-22 22:07:15', '2022-04-22 21:42:47');
INSERT INTO `orderlist` VALUES (156, '5JOH30', '18815492425', '重庆市沙坪坝区景苑路8号附18号1F-25', '等待取货', '0', NULL, '微信', '已支付', 6, 54, '2022-02-08 21:14:09', '2022-02-08 22:35:03', '2022-02-08 22:14:52');
INSERT INTO `orderlist` VALUES (157, 'ZB14ME', '18261397038', '重庆市九龙坡区谢家湾正街55号万象城4层86号', '等待取货', '0', NULL, '云闪付', '已支付', 5, 177, '2022-03-13 18:01:48', '2022-03-13 19:21:18', '2022-03-13 18:52:45');
INSERT INTO `orderlist` VALUES (158, 'DGYGOJ', '13315189576', '重庆市万州区天城镇塘坊还房B栋1幢二楼', '等待取货', '0', NULL, '支付宝', '已支付', 14, 152, '2022-03-16 02:14:04', '2022-03-16 03:27:50', '2022-03-16 03:11:46');
INSERT INTO `orderlist` VALUES (159, 'H23Q47', '15321842964', '沙坪坝区大学城龙湖U城天街B馆L3-24', '已出货', '0', NULL, '微信', '已支付', 19, 186, '2022-04-16 07:59:52', '2022-04-16 09:16:19', '2022-04-16 08:59:59');
INSERT INTO `orderlist` VALUES (160, 'D6RYYX', '18644714464', '沙坪坝区大学城龙湖U城天街B馆L3-24', '已出货', '0', NULL, '云闪付', '已支付', 19, 5, '2022-05-01 10:25:24', '2022-05-01 11:39:59', '2022-05-01 11:13:13');
INSERT INTO `orderlist` VALUES (161, 'A5UHJX', '18946441669', '渝中区邹容路100号重庆时代广场L6层L602', '已出货', '0', NULL, '微信', '已支付', 4, 14, '2022-03-11 18:16:13', '2022-03-11 19:29:50', '2022-03-11 19:14:43');
INSERT INTO `orderlist` VALUES (162, 'WUAP60', '15899121299', '重庆市沙坪坝区陈家桥桥北路18号附10号', '已出货', '0', NULL, '云闪付', '已支付', 10, 197, '2022-01-25 03:28:14', '2022-01-25 04:52:27', '2022-01-25 04:33:35');
INSERT INTO `orderlist` VALUES (163, 'W46GVW', '13735795624', '重庆市沙坪坝区景苑路与大学城北路交叉口东南140米', '已送达', '0', NULL, '微信', '已支付', 11, 92, '2022-04-26 19:17:55', '2022-04-26 20:31:51', '2022-04-26 20:13:45');
INSERT INTO `orderlist` VALUES (164, '97NCJN', '18481515757', '沙坪坝区大学城龙湖U城天街B馆L3-24', '已送达', '0', NULL, '微信', '已支付', 19, 49, '2022-02-08 21:57:41', '2022-02-08 23:12:01', '2022-02-08 22:49:10');
INSERT INTO `orderlist` VALUES (165, 'MEC8LJ', '18968155545', '渝中区邹容路100号重庆时代广场L6层L602', '已送达', '0', NULL, '云闪付', '已支付', 4, 185, '2022-04-09 11:49:24', '2022-04-09 13:15:23', '2022-04-09 12:49:35');
INSERT INTO `orderlist` VALUES (166, '1UGMNM', '19116512581', '渝中区邹容路100号重庆时代广场L6层L602', '已送达', '0', NULL, '支付宝', '已支付', 4, 156, '2022-04-30 22:35:59', '2022-04-30 23:51:44', '2022-04-30 23:30:36');
INSERT INTO `orderlist` VALUES (167, 'UHJXHK', '19823901286', '沙坪坝区大学城龙湖U城天街B馆L3-24', '已送达', '0', NULL, '支付宝', '已支付', 19, 2, '2022-01-16 04:41:13', '2022-01-16 05:58:13', '2022-01-16 05:30:20');
INSERT INTO `orderlist` VALUES (168, 'Y6HS7Y', '13918651557', '沙坪坝区大学城龙湖U城天街B馆L3-24', '已送达', '0', NULL, '支付宝', '已支付', 19, 181, '2022-01-18 15:08:48', '2022-01-18 16:24:57', '2022-01-18 16:09:14');
INSERT INTO `orderlist` VALUES (169, 'AP60Y6', '17170776060', '重庆市九龙坡区谢家湾正街55号万象城4层86号', '已送达', '0', NULL, '云闪付', '已支付', 20, 113, '2022-03-28 06:00:57', '2022-03-28 07:24:32', '2022-03-28 07:04:47');
INSERT INTO `orderlist` VALUES (170, '3IR1O0', '17368946530', '重庆市沙坪坝区大学城中路虎曾南段虎溪便民夜市A区31号门面', '等待付款', '1', '02EXCCES', '微信', '已支付', 1, 3, '2022-03-17 12:51:25', '2022-03-17 14:16:59', '2022-03-17 13:51:56');
INSERT INTO `orderlist` VALUES (171, 'QTB31X', '15254949667', '重庆市沙坪坝区景和路42号', '等待付款', '1', '08EXCCES', '云闪付', '已支付', 7, 134, '2022-04-19 23:40:40', '2022-04-20 01:05:04', '2022-04-20 00:45:46');
INSERT INTO `orderlist` VALUES (172, 'CAE4Z4', '13151369765', '重庆市沙坪坝区景和路青年文艺广场2-号', '等待付款', '1', '16EXCCES', '云闪付', '已支付', 18, 186, '2022-03-30 15:10:42', '2022-03-30 16:28:52', '2022-03-30 16:01:54');
INSERT INTO `orderlist` VALUES (173, '8M69JQ', '18302517655', '重庆市沙坪坝区景苑路8号附236号', '等待付款', '1', '08EXCCES', '微信', '已支付', 8, 71, '2022-03-11 20:08:02', '2022-03-11 21:33:00', '2022-03-11 21:18:33');
INSERT INTO `orderlist` VALUES (174, 'HKUSGP', '17396891556', '重庆市沙坪坝区景苑路8号附18号1F-25', '等待付款', '1', '06EXCCES', '微信', '已支付', 6, 85, '2022-03-29 14:36:46', '2022-03-29 16:02:32', '2022-03-29 15:44:22');
INSERT INTO `orderlist` VALUES (175, 'OKWL0P', '17199436417', '重庆市沙坪坝区大学城中路虎曾南段虎溪便民夜市A区31号门面', '等待付款', '1', '16EXCCES', '支付宝', '已支付', 1, 155, '2022-03-01 17:41:53', '2022-03-01 18:57:27', '2022-03-01 18:35:53');
INSERT INTO `orderlist` VALUES (176, 'XY5LI2', '15527765414', '重庆市万州区天城镇塘坊还房B栋1幢二楼', '等待付款', '1', '16EXCCES', '云闪付', '已支付', 14, 53, '2022-01-02 13:59:36', '2022-01-02 15:14:21', '2022-01-02 14:58:50');
INSERT INTO `orderlist` VALUES (177, 'SOPORH', '14753422223', '重庆市渝中区长江支路11号(大坪地铁站5号口步行180米)', '等待付款', '1', '21EXCCES', '云闪付', '已支付', 16, 42, '2022-01-08 00:00:21', '2022-01-08 01:14:36', '2022-01-08 00:56:11');
INSERT INTO `orderlist` VALUES (178, '6JPH30', '15720565587', '重庆市巫山县桐子坪巫山大酒店', '等待付款', '1', '03EXCCES', '支付宝', '已支付', 15, 45, '2022-01-10 20:30:46', '2022-01-10 21:43:50', '2022-01-10 21:29:03');
INSERT INTO `orderlist` VALUES (179, 'VFQCHU', '13707974171', '重庆市巫山县桐子坪巫山大酒店', '等待付款', '1', '17EXCCES', '微信', '已支付', 15, 26, '2022-01-31 01:51:10', '2022-01-31 03:17:21', '2022-01-31 02:51:29');
INSERT INTO `orderlist` VALUES (180, '4X7E22', '18130693581', '重庆市沙坪坝区大学城景苑路8号附38至41号', '等待付款', '1', '03EXCCES', '微信', '已支付', 17, 89, '2022-03-25 00:20:35', '2022-03-25 01:35:06', '2022-03-25 01:19:42');
INSERT INTO `orderlist` VALUES (181, 'BC7O8T', '18706118499', '重庆市沙坪坝区景苑路8号附236号', '等待付款', '1', '21EXCCES', '微信', '已支付', 8, 105, '2022-01-06 23:26:41', '2022-01-07 00:48:37', '2022-01-07 00:24:13');
INSERT INTO `orderlist` VALUES (182, 'FPG6P5', '15506241841', '重庆市九龙坡区含谷镇含兴路24号', '等待取货', '1', '15EXCCES', '云闪付', '已支付', 2, 94, '2022-04-01 03:59:37', '2022-04-01 05:14:09', '2022-04-01 04:47:01');
INSERT INTO `orderlist` VALUES (183, 'HS7Y5L', '19959445332', '重庆市南岸区黄桷垭正街150号第四人民医院沿西北方往木子园方向前行200米老君洞南门牌坊处', '等待取货', '1', '19EXCCES', '云闪付', '已支付', 12, 95, '2022-02-06 07:11:50', '2022-02-06 08:28:24', '2022-02-06 08:05:57');
INSERT INTO `orderlist` VALUES (184, 'HU0SEB', '17213367442', '重庆市万州区天城镇塘坊还房B栋1幢二楼', '等待取货', '1', '14EXCCES', '微信', '已支付', 14, 173, '2022-03-28 01:53:13', '2022-03-28 03:08:49', '2022-03-28 02:52:42');
INSERT INTO `orderlist` VALUES (185, 'PFAF09', '18649812710', '重庆市九龙坡区含谷镇含兴路24号', '等待取货', '1', '06EXCCES', '微信', '已支付', 2, 147, '2022-01-19 21:56:23', '2022-01-19 23:11:14', '2022-01-19 22:48:44');
INSERT INTO `orderlist` VALUES (186, 'FR9RZV', '15899389182', '重庆市南岸区黄桷垭正街150号第四人民医院沿西北方往木子园方向前行200米老君洞南门牌坊处', '等待取货', '1', '04EXCCES', '微信', '已支付', 12, 146, '2022-05-05 02:37:46', '2022-05-05 03:56:54', '2022-05-05 03:36:36');
INSERT INTO `orderlist` VALUES (187, '8TIF8M', '14559071684', '重庆市巫山县桐子坪巫山大酒店', '等待取货', '1', '19EXCCES', '支付宝', '已支付', 15, 174, '2022-04-07 12:29:29', '2022-04-07 13:44:03', '2022-04-07 13:16:30');
INSERT INTO `orderlist` VALUES (188, '1ES51U', '14701024272', '重庆市九龙坡区含谷镇含兴路24号', '等待取货', '1', '15EXCCES', '云闪付', '已支付', 2, 104, '2022-01-22 10:46:03', '2022-01-22 11:58:05', '2022-01-22 11:32:47');
INSERT INTO `orderlist` VALUES (189, '5LH23Q', '13557293724', '重庆市渝北区两江新区鸳鸯街道湖彩路118号光环购物公园L5层A-L5-03号', '等待取货', '1', '06EXCCES', '支付宝', '已支付', 3, 76, '2022-01-11 21:23:52', '2022-01-11 22:42:18', '2022-01-11 22:19:04');
INSERT INTO `orderlist` VALUES (190, 'TDE15J', '14534791814', '重庆市渝中区长江支路11号(大坪地铁站5号口步行180米)', '等待取货', '1', '09EXCCES', '支付宝', '已支付', 16, 123, '2022-02-13 04:11:39', '2022-02-13 05:35:06', '2022-02-13 05:12:13');
INSERT INTO `orderlist` VALUES (191, '1W97NC', '15064251524', '沙坪坝区大学城龙湖U城天街B馆L3-24', '等待取货', '1', '02EXCCES', '云闪付', '已支付', 19, 180, '2022-03-18 07:22:55', '2022-03-18 08:44:31', '2022-03-18 08:19:11');
INSERT INTO `orderlist` VALUES (192, '4NAMDG', '13187738843', '重庆市九龙坡区含谷镇含兴路24号', '等待取货', '1', '08EXCCES', '微信', '已支付', 2, 128, '2022-02-01 08:20:55', '2022-02-01 09:41:33', '2022-02-01 09:25:10');
INSERT INTO `orderlist` VALUES (193, 'BAE3Y3', '15676184367', '重庆市沙坪坝区景和路青年文艺广场2-号', '已出货', '1', '02EXCCES', '支付宝', '已支付', 18, 132, '2022-03-11 07:05:53', '2022-03-11 08:30:50', '2022-03-11 08:10:57');
INSERT INTO `orderlist` VALUES (194, 'UZW46G', '15112685990', '重庆市巫山县桐子坪巫山大酒店', '已出货', '1', '12EXCCES', '微信', '已支付', 15, 108, '2022-03-06 15:15:19', '2022-03-06 16:27:24', '2022-03-06 16:07:56');
INSERT INTO `orderlist` VALUES (195, 'KLR8VF', '18657244064', '重庆市巴南区红光大道杰信华府广场东北侧约50米', '已出货', '1', '06EXCCES', '支付宝', '已支付', 13, 22, '2022-03-30 07:01:01', '2022-03-30 08:19:38', '2022-03-30 08:03:39');
INSERT INTO `orderlist` VALUES (196, 'IF8MF9', '15664911095', '重庆市沙坪坝区景苑路与大学城北路交叉口东南140米', '已送达', '1', '07EXCCES', '云闪付', '已支付', 11, 172, '2022-03-30 12:14:45', '2022-03-30 13:31:08', '2022-03-30 13:10:50');
INSERT INTO `orderlist` VALUES (197, 'LQBKKV', '13933928725', '重庆市巴南区红光大道杰信华府广场东北侧约50米', '已送达', '1', '13EXCCES', '云闪付', '已支付', 13, 70, '2022-02-17 20:28:14', '2022-02-17 21:51:19', '2022-02-17 21:34:55');
INSERT INTO `orderlist` VALUES (198, '47D6RY', '17869901225', '重庆市沙坪坝区熙街11号楼1F-04', '已送达', '1', '20EXCCES', '云闪付', '已支付', 9, 64, '2022-02-05 01:14:30', '2022-02-05 02:35:36', '2022-02-05 02:14:29');
INSERT INTO `orderlist` VALUES (199, 'UBLG5T', '19802833560', '渝中区邹容路100号重庆时代广场L6层L602', '已送达', '1', '12EXCCES', '云闪付', '已支付', 4, 56, '2022-02-28 11:15:21', '2022-02-28 12:32:41', '2022-02-28 12:08:05');
INSERT INTO `orderlist` VALUES (200, 'EBBAE3', '18820008704', '重庆市沙坪坝区陈家桥桥北路18号附10号', '已送达', '1', '04EXCCES', '支付宝', '已支付', 10, 128, '2022-04-15 16:31:10', '2022-04-15 17:49:29', '2022-04-15 17:32:27');

-- ----------------------------
-- Table structure for prestige
-- ----------------------------
DROP TABLE IF EXISTS `prestige`;
CREATE TABLE `prestige`  (
  `p_id` int(11) NOT NULL AUTO_INCREMENT,
  `p_score` int(11) NULL DEFAULT NULL,
  `p_blacklist` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `p_details` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_id` int(11) NULL DEFAULT NULL,
  `a_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`p_id`) USING BTREE,
  INDEX `u_id`(`u_id`) USING BTREE,
  INDEX `a_id`(`a_id`) USING BTREE,
  INDEX `p_score`(`p_score`) USING BTREE,
  CONSTRAINT `prestige_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `userinfo` (`u_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `prestige_ibfk_2` FOREIGN KEY (`a_id`) REFERENCES `administrator` (`a_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 201 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of prestige
-- ----------------------------
INSERT INTO `prestige` VALUES (1, 100, '0', '优秀', 1, 1);
INSERT INTO `prestige` VALUES (2, 100, '0', '优秀', 2, 1);
INSERT INTO `prestige` VALUES (3, 100, '0', '优秀', 3, 1);
INSERT INTO `prestige` VALUES (4, 100, '0', '优秀', 4, 1);
INSERT INTO `prestige` VALUES (5, 100, '0', '优秀', 5, 1);
INSERT INTO `prestige` VALUES (6, 100, '0', '优秀', 6, 2);
INSERT INTO `prestige` VALUES (7, 100, '0', '优秀', 7, 2);
INSERT INTO `prestige` VALUES (8, 100, '0', '优秀', 8, 2);
INSERT INTO `prestige` VALUES (9, 100, '0', '优秀', 9, 2);
INSERT INTO `prestige` VALUES (10, 100, '0', '优秀', 10, 2);
INSERT INTO `prestige` VALUES (11, 100, '0', '优秀', 11, 2);
INSERT INTO `prestige` VALUES (12, 100, '0', '优秀', 12, 2);
INSERT INTO `prestige` VALUES (13, 100, '0', '优秀', 13, 2);
INSERT INTO `prestige` VALUES (14, 100, '0', '优秀', 14, 3);
INSERT INTO `prestige` VALUES (15, 100, '0', '优秀', 15, 3);
INSERT INTO `prestige` VALUES (16, 100, '0', '优秀', 16, 3);
INSERT INTO `prestige` VALUES (17, 100, '0', '优秀', 17, 3);
INSERT INTO `prestige` VALUES (18, 100, '0', '优秀', 18, 3);
INSERT INTO `prestige` VALUES (19, 100, '0', '优秀', 19, 3);
INSERT INTO `prestige` VALUES (20, 100, '0', '优秀', 20, 4);
INSERT INTO `prestige` VALUES (21, 100, '0', '优秀', 21, 4);
INSERT INTO `prestige` VALUES (22, 100, '0', '优秀', 22, 4);
INSERT INTO `prestige` VALUES (23, 100, '0', '优秀', 23, 4);
INSERT INTO `prestige` VALUES (24, 100, '0', '优秀', 24, 5);
INSERT INTO `prestige` VALUES (25, 100, '0', '优秀', 25, 4);
INSERT INTO `prestige` VALUES (26, 100, '0', '优秀', 26, 4);
INSERT INTO `prestige` VALUES (27, 100, '0', '优秀', 27, 5);
INSERT INTO `prestige` VALUES (28, 100, '0', '优秀', 28, 5);
INSERT INTO `prestige` VALUES (29, 100, '0', '优秀', 29, 6);
INSERT INTO `prestige` VALUES (30, 100, '0', '优秀', 30, 6);
INSERT INTO `prestige` VALUES (31, 100, '0', '优秀', 31, 6);
INSERT INTO `prestige` VALUES (32, 100, '0', '优秀', 32, 6);
INSERT INTO `prestige` VALUES (33, 100, '0', '优秀', 33, 5);
INSERT INTO `prestige` VALUES (34, 100, '0', '优秀', 34, 5);
INSERT INTO `prestige` VALUES (35, 100, '0', '优秀', 35, 7);
INSERT INTO `prestige` VALUES (36, 100, '0', '优秀', 36, 7);
INSERT INTO `prestige` VALUES (37, 100, '0', '优秀', 37, 7);
INSERT INTO `prestige` VALUES (38, 100, '0', '优秀', 38, 7);
INSERT INTO `prestige` VALUES (39, 100, '0', '优秀', 39, 8);
INSERT INTO `prestige` VALUES (40, 100, '0', '优秀', 40, 8);
INSERT INTO `prestige` VALUES (41, 100, '0', '优秀', 41, 6);
INSERT INTO `prestige` VALUES (42, 100, '0', '优秀', 42, 6);
INSERT INTO `prestige` VALUES (43, 100, '0', '优秀', 43, 8);
INSERT INTO `prestige` VALUES (44, 100, '0', '优秀', 44, 8);
INSERT INTO `prestige` VALUES (45, 100, '0', '优秀', 45, 9);
INSERT INTO `prestige` VALUES (46, 100, '0', '优秀', 46, 9);
INSERT INTO `prestige` VALUES (47, 100, '0', '优秀', 47, 9);
INSERT INTO `prestige` VALUES (48, 100, '0', '优秀', 48, 9);
INSERT INTO `prestige` VALUES (49, 100, '0', '优秀', 49, 7);
INSERT INTO `prestige` VALUES (50, 100, '0', '优秀', 50, 7);
INSERT INTO `prestige` VALUES (51, 100, '0', '优秀', 51, 10);
INSERT INTO `prestige` VALUES (52, 100, '0', '优秀', 52, 10);
INSERT INTO `prestige` VALUES (53, 100, '0', '优秀', 53, 10);
INSERT INTO `prestige` VALUES (54, 100, '0', '优秀', 54, 10);
INSERT INTO `prestige` VALUES (55, 100, '0', '优秀', 55, 11);
INSERT INTO `prestige` VALUES (56, 100, '0', '优秀', 56, 11);
INSERT INTO `prestige` VALUES (57, 100, '0', '优秀', 57, 8);
INSERT INTO `prestige` VALUES (58, 100, '0', '优秀', 58, 8);
INSERT INTO `prestige` VALUES (59, 100, '0', '优秀', 59, 11);
INSERT INTO `prestige` VALUES (60, 100, '0', '优秀', 60, 11);
INSERT INTO `prestige` VALUES (61, 100, '0', '优秀', 61, 12);
INSERT INTO `prestige` VALUES (62, 100, '0', '优秀', 62, 12);
INSERT INTO `prestige` VALUES (63, 100, '0', '优秀', 63, 12);
INSERT INTO `prestige` VALUES (64, 100, '0', '优秀', 64, 12);
INSERT INTO `prestige` VALUES (65, 100, '0', '优秀', 65, 9);
INSERT INTO `prestige` VALUES (66, 100, '0', '优秀', 66, 9);
INSERT INTO `prestige` VALUES (67, 100, '0', '优秀', 67, 13);
INSERT INTO `prestige` VALUES (68, 100, '0', '优秀', 68, 13);
INSERT INTO `prestige` VALUES (69, 100, '0', '优秀', 69, 13);
INSERT INTO `prestige` VALUES (70, 100, '0', '优秀', 70, 13);
INSERT INTO `prestige` VALUES (71, 100, '0', '优秀', 71, 14);
INSERT INTO `prestige` VALUES (72, 100, '0', '优秀', 72, 14);
INSERT INTO `prestige` VALUES (73, 100, '0', '优秀', 73, 10);
INSERT INTO `prestige` VALUES (74, 100, '0', '优秀', 74, 10);
INSERT INTO `prestige` VALUES (75, 100, '0', '优秀', 75, 14);
INSERT INTO `prestige` VALUES (76, 100, '0', '优秀', 76, 15);
INSERT INTO `prestige` VALUES (77, 100, '0', '优秀', 77, 15);
INSERT INTO `prestige` VALUES (78, 100, '0', '优秀', 78, 15);
INSERT INTO `prestige` VALUES (79, 100, '0', '优秀', 79, 15);
INSERT INTO `prestige` VALUES (80, 100, '0', '优秀', 80, 16);
INSERT INTO `prestige` VALUES (81, 100, '0', '优秀', 81, 11);
INSERT INTO `prestige` VALUES (82, 100, '0', '优秀', 82, 11);
INSERT INTO `prestige` VALUES (83, 100, '0', '优秀', 83, 16);
INSERT INTO `prestige` VALUES (84, 100, '0', '优秀', 84, 16);
INSERT INTO `prestige` VALUES (85, 100, '0', '优秀', 85, 16);
INSERT INTO `prestige` VALUES (86, 100, '0', '优秀', 86, 17);
INSERT INTO `prestige` VALUES (87, 100, '0', '优秀', 87, 17);
INSERT INTO `prestige` VALUES (88, 100, '0', '优秀', 88, 17);
INSERT INTO `prestige` VALUES (89, 100, '0', '优秀', 89, 12);
INSERT INTO `prestige` VALUES (90, 100, '0', '优秀', 90, 12);
INSERT INTO `prestige` VALUES (91, 100, '0', '优秀', 91, 17);
INSERT INTO `prestige` VALUES (92, 100, '0', '优秀', 92, 18);
INSERT INTO `prestige` VALUES (93, 100, '0', '优秀', 93, 18);
INSERT INTO `prestige` VALUES (94, 100, '0', '优秀', 94, 18);
INSERT INTO `prestige` VALUES (95, 100, '0', '优秀', 95, 18);
INSERT INTO `prestige` VALUES (96, 100, '0', '优秀', 96, 19);
INSERT INTO `prestige` VALUES (97, 100, '0', '优秀', 97, 13);
INSERT INTO `prestige` VALUES (98, 100, '0', '优秀', 98, 13);
INSERT INTO `prestige` VALUES (99, 100, '0', '优秀', 99, 19);
INSERT INTO `prestige` VALUES (100, 100, '0', '优秀', 100, 19);
INSERT INTO `prestige` VALUES (101, 100, '0', '优秀', 101, 19);
INSERT INTO `prestige` VALUES (102, 100, '0', '优秀', 102, 20);
INSERT INTO `prestige` VALUES (103, 100, '0', '优秀', 103, 20);
INSERT INTO `prestige` VALUES (104, 100, '0', '优秀', 104, 20);
INSERT INTO `prestige` VALUES (105, 100, '0', '优秀', 105, 14);
INSERT INTO `prestige` VALUES (106, 100, '0', '优秀', 106, 14);
INSERT INTO `prestige` VALUES (107, 100, '0', '优秀', 107, 20);
INSERT INTO `prestige` VALUES (108, 100, '0', '优秀', 108, 21);
INSERT INTO `prestige` VALUES (109, 100, '0', '优秀', 109, 21);
INSERT INTO `prestige` VALUES (110, 100, '0', '优秀', 110, 21);
INSERT INTO `prestige` VALUES (111, 100, '0', '优秀', 111, 21);
INSERT INTO `prestige` VALUES (112, 100, '0', '优秀', 112, 22);
INSERT INTO `prestige` VALUES (113, 100, '0', '优秀', 113, 15);
INSERT INTO `prestige` VALUES (114, 100, '0', '优秀', 114, 15);
INSERT INTO `prestige` VALUES (115, 100, '0', '优秀', 115, 22);
INSERT INTO `prestige` VALUES (116, 100, '0', '优秀', 116, 22);
INSERT INTO `prestige` VALUES (117, 100, '0', '优秀', 117, 22);
INSERT INTO `prestige` VALUES (118, 100, '0', '优秀', 118, 23);
INSERT INTO `prestige` VALUES (119, 100, '0', '优秀', 119, 23);
INSERT INTO `prestige` VALUES (120, 100, '0', '优秀', 120, 23);
INSERT INTO `prestige` VALUES (121, 100, '0', '优秀', 121, 16);
INSERT INTO `prestige` VALUES (122, 100, '0', '优秀', 122, 16);
INSERT INTO `prestige` VALUES (123, 100, '0', '优秀', 123, 24);
INSERT INTO `prestige` VALUES (124, 100, '0', '优秀', 124, 24);
INSERT INTO `prestige` VALUES (125, 100, '0', '优秀', 125, 24);
INSERT INTO `prestige` VALUES (126, 100, '0', '优秀', 126, 24);
INSERT INTO `prestige` VALUES (127, 100, '0', '优秀', 127, 25);
INSERT INTO `prestige` VALUES (128, 100, '0', '优秀', 128, 25);
INSERT INTO `prestige` VALUES (129, 100, '0', '优秀', 129, 17);
INSERT INTO `prestige` VALUES (130, 100, '0', '优秀', 130, 17);
INSERT INTO `prestige` VALUES (131, 100, '0', '优秀', 131, 25);
INSERT INTO `prestige` VALUES (132, 100, '0', '优秀', 132, 25);
INSERT INTO `prestige` VALUES (133, 100, '0', '优秀', 133, 26);
INSERT INTO `prestige` VALUES (134, 100, '0', '优秀', 134, 26);
INSERT INTO `prestige` VALUES (135, 100, '0', '优秀', 135, 26);
INSERT INTO `prestige` VALUES (136, 100, '0', '优秀', 136, 26);
INSERT INTO `prestige` VALUES (137, 100, '0', '优秀', 137, 18);
INSERT INTO `prestige` VALUES (138, 100, '0', '优秀', 138, 18);
INSERT INTO `prestige` VALUES (139, 100, '0', '优秀', 139, 27);
INSERT INTO `prestige` VALUES (140, 100, '0', '优秀', 140, 27);
INSERT INTO `prestige` VALUES (141, 100, '0', '优秀', 141, 27);
INSERT INTO `prestige` VALUES (142, 100, '0', '优秀', 142, 27);
INSERT INTO `prestige` VALUES (143, 100, '0', '优秀', 143, 28);
INSERT INTO `prestige` VALUES (144, 100, '0', '优秀', 144, 28);
INSERT INTO `prestige` VALUES (145, 100, '0', '优秀', 145, 19);
INSERT INTO `prestige` VALUES (146, 100, '0', '优秀', 146, 19);
INSERT INTO `prestige` VALUES (147, 100, '0', '优秀', 147, 28);
INSERT INTO `prestige` VALUES (148, 100, '0', '优秀', 148, 28);
INSERT INTO `prestige` VALUES (149, 100, '0', '优秀', 149, 29);
INSERT INTO `prestige` VALUES (150, 100, '0', '优秀', 150, 29);
INSERT INTO `prestige` VALUES (151, 100, '0', '优秀', 151, 29);
INSERT INTO `prestige` VALUES (152, 100, '0', '优秀', 152, 29);
INSERT INTO `prestige` VALUES (153, 100, '0', '优秀', 153, 20);
INSERT INTO `prestige` VALUES (154, 100, '0', '优秀', 154, 20);
INSERT INTO `prestige` VALUES (155, 100, '0', '优秀', 155, 30);
INSERT INTO `prestige` VALUES (156, 100, '0', '优秀', 156, 30);
INSERT INTO `prestige` VALUES (157, 100, '0', '优秀', 157, 30);
INSERT INTO `prestige` VALUES (158, 100, '0', '优秀', 158, 30);
INSERT INTO `prestige` VALUES (159, 100, '0', '优秀', 159, 31);
INSERT INTO `prestige` VALUES (160, 100, '0', '优秀', 160, 31);
INSERT INTO `prestige` VALUES (161, 100, '0', '优秀', 161, 21);
INSERT INTO `prestige` VALUES (162, 100, '0', '优秀', 162, 21);
INSERT INTO `prestige` VALUES (163, 100, '0', '优秀', 163, 31);
INSERT INTO `prestige` VALUES (164, 100, '0', '优秀', 164, 31);
INSERT INTO `prestige` VALUES (165, 100, '0', '优秀', 165, 32);
INSERT INTO `prestige` VALUES (166, 100, '0', '优秀', 166, 32);
INSERT INTO `prestige` VALUES (167, 100, '0', '优秀', 167, 32);
INSERT INTO `prestige` VALUES (168, 100, '0', '优秀', 168, 33);
INSERT INTO `prestige` VALUES (169, 100, '0', '优秀', 169, 22);
INSERT INTO `prestige` VALUES (170, 100, '0', '优秀', 170, 22);
INSERT INTO `prestige` VALUES (171, 100, '0', '优秀', 171, 33);
INSERT INTO `prestige` VALUES (172, 100, '0', '优秀', 172, 33);
INSERT INTO `prestige` VALUES (173, 100, '0', '优秀', 173, 33);
INSERT INTO `prestige` VALUES (174, 100, '0', '优秀', 174, 34);
INSERT INTO `prestige` VALUES (175, 100, '0', '优秀', 175, 34);
INSERT INTO `prestige` VALUES (176, 100, '0', '优秀', 176, 34);
INSERT INTO `prestige` VALUES (177, 100, '0', '优秀', 177, 23);
INSERT INTO `prestige` VALUES (178, 100, '0', '优秀', 178, 23);
INSERT INTO `prestige` VALUES (179, 100, '0', '优秀', 179, 34);
INSERT INTO `prestige` VALUES (180, 100, '0', '优秀', 180, 35);
INSERT INTO `prestige` VALUES (181, 100, '0', '优秀', 181, 35);
INSERT INTO `prestige` VALUES (182, 100, '0', '优秀', 182, 35);
INSERT INTO `prestige` VALUES (183, 100, '0', '优秀', 183, 35);
INSERT INTO `prestige` VALUES (184, 100, '0', '优秀', 184, 36);
INSERT INTO `prestige` VALUES (185, 100, '0', '优秀', 185, 24);
INSERT INTO `prestige` VALUES (186, 100, '0', '优秀', 186, 24);
INSERT INTO `prestige` VALUES (187, 100, '0', '优秀', 187, 36);
INSERT INTO `prestige` VALUES (188, 100, '0', '优秀', 188, 36);
INSERT INTO `prestige` VALUES (189, 100, '0', '优秀', 189, 36);
INSERT INTO `prestige` VALUES (190, 100, '0', '优秀', 190, 37);
INSERT INTO `prestige` VALUES (191, 100, '0', '优秀', 191, 37);
INSERT INTO `prestige` VALUES (192, 100, '0', '优秀', 192, 37);
INSERT INTO `prestige` VALUES (193, 100, '0', '优秀', 193, 25);
INSERT INTO `prestige` VALUES (194, 100, '0', '优秀', 194, 25);
INSERT INTO `prestige` VALUES (195, 100, '0', '优秀', 195, 37);
INSERT INTO `prestige` VALUES (196, 100, '0', '优秀', 196, 38);
INSERT INTO `prestige` VALUES (197, 100, '0', '优秀', 197, 38);
INSERT INTO `prestige` VALUES (198, 100, '0', '优秀', 198, 38);
INSERT INTO `prestige` VALUES (199, 100, '0', '优秀', 199, 38);
INSERT INTO `prestige` VALUES (200, 100, '0', '优秀', 200, 39);

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo`  (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_headimage` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `v_viprank` int(11) NULL DEFAULT NULL,
  `u_registertime` date NULL DEFAULT NULL,
  `u_email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `p_score` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`u_id`) USING BTREE,
  INDEX `v_viprank`(`v_viprank`) USING BTREE,
  INDEX `p_score`(`p_score`) USING BTREE,
  CONSTRAINT `userinfo_ibfk_1` FOREIGN KEY (`p_score`) REFERENCES `prestige` (`p_score`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `userinfo_ibfk_2` FOREIGN KEY (`v_viprank`) REFERENCES `vip` (`v_viprank`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 203 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES (1, '秃子默', '甘肃省白城市翠峦区白城路137号阳光翠竹苑', '14100212516', NULL, '14100212516', 'Pl$ti3BJtQfkP^', 3, '2021-04-02', 'kp3m@163.com', '韦陀新苗', 100);
INSERT INTO `userinfo` VALUES (2, '柴博远', '山东省白山市友好区安边路6号复华城市花园', '18366491884', NULL, '18366491884', '@5~_G5vllG', 2, '2022-02-20', 'imyiyyq6ovj@163.com', '冰心傲菡', 100);
INSERT INTO `userinfo` VALUES (3, '僧弘阔', '黑龙江省白银市新青区白渡路46号住友嘉馨名园', '17242007788', NULL, '17242007788', 'EZStv_KXYQF8', 4, '2021-10-05', 'hv2prug3ac0t6@163.com', '行云俊逸', 100);
INSERT INTO `userinfo` VALUES (4, '鞠嘉赐', '海南省安庆市带岭区鞍山路195号阳光翠竹苑', '13845298623', NULL, '13845298623', 'p%IfjLJ+', 1, '2022-04-17', '6umoc@163.com', '五轮夏海', 100);
INSERT INTO `userinfo` VALUES (5, '东玉成', '海南省白银市新青区宝杨路23号溢盈河畔别墅', '17241003610', NULL, '17241003610', '3t)Pe318oi', 3, '2021-12-03', 'mlhm2md@163.com', '傲寒茵茵', 100);
INSERT INTO `userinfo` VALUES (6, '巩博文', '贵州省蚌埠市五营区安顺路28号协通公寓', '13313159973', NULL, '13313159973', 'j4rcfOI6iR*s', 4, '2020-09-29', '6nxgg51z4uz1w@163.com', '蚀骨文赋', 100);
INSERT INTO `userinfo` VALUES (7, '难成益', '甘肃省百色市上甘岭区安化路44号溢盈河畔别墅', '19101454856', NULL, '19101454856', 'yK+8*^nw1U+&^%7', 2, '2021-03-02', 'vftfiqy2u@163.com', '黯然子瑜', 100);
INSERT INTO `userinfo` VALUES (8, '丰阳舒', '山东省宝鸡市汤旺河区宝昌路121号真新六街坊', '17733242809', NULL, '17733242809', 'Q5vr6bgQ', 4, '2020-09-23', 't6o3npufro4ultm@163.com', '北斗春枫', 100);
INSERT INTO `userinfo` VALUES (9, '全飞羽', '江西省蚌埠市五营区安仁路80号耀江花园', '19859927274', NULL, '19859927274', '%aRN!aSP8oJk!', 3, '2020-05-21', 'mgx@163.com', '杨家玉石', 100);
INSERT INTO `userinfo` VALUES (10, '岑才艺', '福建省巴中市乌马河区白渡桥125号博泰新苑', '15010446572', NULL, '15010446572', 'Hmhl303gF', 2, '2021-11-22', 'wiu3xc0wetbd@163.com', '金顶高懿', 100);
INSERT INTO `userinfo` VALUES (11, '秋文虹', '安徽省白山市友好区安仁路43号爱里舍花园', '15803978533', NULL, '15803978533', 'D2e@$x2(J4v2', 4, '2022-02-07', 'yugq5mo6ukisa@163.com', '逍遥以云', 100);
INSERT INTO `userinfo` VALUES (12, '栾嘉庆', '甘肃省百色市上甘岭区安澜路3号东新大厦', '15300467073', NULL, '15300467073', 'KZlqGs7UG8', 2, '2021-11-13', '6zgdrf2jllrfl@163.com', '风满问夏', 100);
INSERT INTO `userinfo` VALUES (13, '明永言', '贵州省白银市新青区宝源路148号溢盈河畔别墅', '13744423879', NULL, '13744423879', '3EEkjSnl9$V', 1, '2022-03-16', '5a5m01u6fsn@163.com', '无击瑜英', 100);
INSERT INTO `userinfo` VALUES (14, '谯凯歌', '江西省安庆市带岭区宝杨路71号菊园五街坊', '18688038580', NULL, '18688038580', 'pG#7KTGJsANH', 3, '2020-10-16', 'izc4mlwi144pq5@163.com', '芙蓉欣怡', 100);
INSERT INTO `userinfo` VALUES (15, '刚宏才', '福建省巴中市乌马河区百安路（方泰镇）105号协通公寓', '13261637753', NULL, '13261637753', 'pb^gqSYeq#Ncr3y', 3, '2021-05-02', 'oi250azbtm2ygg6@163.com', '般若夏旋', 100);
INSERT INTO `userinfo` VALUES (16, '乐安易', '海南省保山市榆次区安边路91号东新大厦', '15277456492', NULL, '15277456492', 'IzB3$hW@', 4, '2020-12-19', 'vxw3dhn6gp@163.com', '先天梦凝', 100);
INSERT INTO `userinfo` VALUES (17, '笔和怡', '贵州省安顺市南岔区包头南路29号菊园五街坊', '15651312209', NULL, '15651312209', '~+8SyQN(M6H8q', 2, '2022-02-23', '1bdp@163.com', '金顶正诚', 100);
INSERT INTO `userinfo` VALUES (18, '醋绍钧', '陕西省白山市友好区安业路24号溢盈河畔别墅', '18367264696', NULL, '18367264696', '&q)cvsIpsaC', 4, '2020-02-14', '23fyktu1pxqsqt@163.com', '飞月幻蓉', 100);
INSERT INTO `userinfo` VALUES (19, '靖良策', '甘肃省白山市友好区百安路（方泰镇）126号东新大厦', '15532467453', NULL, '15532467453', 'UE6rQhTb9o', 3, '2021-05-05', 'c2kiz1b1h@163.com', '销魂玮艺', 100);
INSERT INTO `userinfo` VALUES (20, '操弘毅', '云南省安阳市金山屯区安化路16号和亭佳苑', '16603574296', NULL, '16603574296', 'A)mPC237afMi', 1, '2022-02-16', '2yk45ap363kbii@163.com', '莲花访蝶', 100);
INSERT INTO `userinfo` VALUES (21, '郤建德', '山西省白山市友好区安业路138号金色家园', '15673944706', NULL, '15673944706', 'uV#pKDlks+', 1, '2020-08-13', '4pigczo@163.com', '如来英博', 100);
INSERT INTO `userinfo` VALUES (22, '丙文曜', '山东省保山市榆次区保屯路175号东新大厦', '17230999112', NULL, '17230999112', 'kS+O$TTkS', 3, '2021-06-18', 'c1n@163.com', '太极曼文', 100);
INSERT INTO `userinfo` VALUES (23, '沙宜然', '贵州省包头市红星区半淞园路34号真新六街坊', '19136772824', NULL, '19136772824', 'XI!5Y4g7Z4', 1, '2022-05-10', 'x2qt6a6x@163.com', '易筋冰珍', 100);
INSERT INTO `userinfo` VALUES (24, '呀自强', '广东省安阳市金山屯区宝昌路34号东新大厦', '18097376254', NULL, '18097376254', 'NT+_)%mSAwbBh', 4, '2020-12-13', 'xb0b42p1k3rxbv@163.com', '怀心培朵', 100);
INSERT INTO `userinfo` VALUES (25, '八飞翼', '广东省白银市新青区宝安路58号爱里舍花园', '18458608832', NULL, '18458608832', '~tla)(4%blP', 4, '2020-10-03', 'xgbtbfw6v@163.com', '白骨尔晴雪凝', 100);
INSERT INTO `userinfo` VALUES (26, '楚成天', '河北省巴彦淖尔市美溪区宝昌路79号耀江花园', '17101687960', NULL, '17101687960', 'LXOEGP*M', 2, '2020-04-08', 'ramfl46j@163.com', '傲寒南珍', 100);
INSERT INTO `userinfo` VALUES (27, '火德润', '河南省宝鸡市汤旺河区安远路12号博泰新苑', '18991851961', NULL, '18991851961', 'oDvQ!g_HfeuLS*', 3, '2020-08-22', 'g5cidm0hz5@163.com', '神照宏骞', 100);
INSERT INTO `userinfo` VALUES (28, '狗天禄', '贵州省白山市友好区安远路139号金色家园', '15021621527', NULL, '15021621527', 'bf62MqK5X91Q', 3, '2022-05-01', 'wwg63z6mwwabft@163.com', '无定舒畅', 100);
INSERT INTO `userinfo` VALUES (29, '应雨星', '四川省安庆市带岭区安德路193号和亭佳苑', '14797532050', NULL, '14797532050', 'z$3epl&Lh%Z$l!L', 1, '2020-04-05', '2dw56rno@163.com', '虚徒睿广', 100);
INSERT INTO `userinfo` VALUES (30, '续文耀', '安徽省安康市伊春区白城路3号金色家园', '13318224839', NULL, '13318224839', ')g8BcpWaNivh_qA', 3, '2020-06-14', 'tv54hi54@163.com', '玉景荷珠', 100);
INSERT INTO `userinfo` VALUES (31, '百光誉', '江西省安康市伊春区安波路128号复华城市花园', '13567974478', NULL, '13567974478', '&kP(dv$CZU8', 3, '2022-03-11', 'yz1@163.com', '千手幼凡', 100);
INSERT INTO `userinfo` VALUES (32, '衣宇航', '山东省鞍山市西林区宝联路136号东新大厦', '14644772549', NULL, '14644772549', '*FjCd35&v', 1, '2020-05-23', 'nis4uu4f33wxr@163.com', '火焰初夏', 100);
INSERT INTO `userinfo` VALUES (33, '应弘深', '河南省保山市榆次区百官街150号东新大厦', '14537794099', NULL, '14537794099', 'F3bDJTy+V&^DD', 2, '2020-06-11', 's05ljiymh1bf@163.com', '玉霄蕴藉', 100);
INSERT INTO `userinfo` VALUES (34, '秋成礼', '安徽省包头市红星区爱国路91号爱里舍花园', '14766628726', NULL, '14766628726', 'q44D^#wuigR', 4, '2021-05-20', 'yd6n1sbx@163.com', '天霜南芹', 100);
INSERT INTO `userinfo` VALUES (35, '秋景同', '甘肃省保山市榆次区宝通路4号阳光翠竹苑', '13837429111', NULL, '13837429111', 'VPvs_YbkL3_Q', 1, '2020-05-13', 'mc4zqjwy@163.com', '洗髓朋龙', 100);
INSERT INTO `userinfo` VALUES (36, '续睿思', '山东省包头市红星区安德路46号复华城市花园', '15232618118', NULL, '15232618118', 'QhTLlb^S1vMSTYT', 4, '2021-03-31', 'gwsndd@163.com', '北海梓宸', 100);
INSERT INTO `userinfo` VALUES (37, '桑乐游', '辽宁省安顺市南岔区包头路44号金色家园', '13915148568', NULL, '13915148568', '5$mYS~m8x%9fNX7', 3, '2022-04-23', 'ptcaay2p@163.com', '韦陀胜平', 100);
INSERT INTO `userinfo` VALUES (38, '笔嘉树', '山东省白城市翠峦区安业路15号东新大厦', '18476559822', NULL, '18476559822', '8K0STTSDC1mK', 3, '2021-02-04', 'gc3q2@163.com', '慈悲文石', 100);
INSERT INTO `userinfo` VALUES (39, '哀弘文', '福建省保定市乌伊岭区爱国路19号复华城市花园', '13178173954', NULL, '13178173954', 'B$#Wf^92', 2, '2021-09-03', 'q6en3@163.com', '乌龙志高', 100);
INSERT INTO `userinfo` VALUES (40, '敬浩穰', '广东省白银市新青区宝杨路98号真新六街坊', '13400229320', NULL, '13400229320', 'MQxN+h&&4~', 1, '2021-06-13', 'rypxqs2p@163.com', '玄虚璐莹', 100);
INSERT INTO `userinfo` VALUES (41, '穆项禹', '黑龙江省蚌埠市五营区宝山路193号东新大厦', '15968683950', NULL, '15968683950', '@7Ccf&7f0_', 3, '2022-04-02', 'l63al55wmvgprk@163.com', '混元爱武', 100);
INSERT INTO `userinfo` VALUES (42, '啊宏硕', '吉林省蚌埠市五营区板泉路15号菊园五街坊', '13932229325', NULL, '13932229325', '6uRPoR9HQ', 3, '2020-01-30', 'vh53v0m@163.com', '金刚以珊', 100);
INSERT INTO `userinfo` VALUES (43, '斟兴修', '安徽省安顺市南岔区安波路26号复华城市花园', '13130914298', NULL, '13130914298', '6ZyTwLrBNDU3', 3, '2022-05-11', '0inbf@163.com', '纯阳天亦', 100);
INSERT INTO `userinfo` VALUES (44, '尉和韵', '河北省包头市红星区白兰路188号金色家园', '14905778358', NULL, '14905778358', 'F^qWmm_aE', 4, '2020-11-11', 'ixh551ujrg@163.com', '拈花秋翠', 100);
INSERT INTO `userinfo` VALUES (45, '老睿明', '福建省巴彦淖尔市美溪区包头路196号溢盈河畔别墅', '18548366695', NULL, '18548366695', 'vYbJYrZ$IY0', 4, '2022-01-03', '6l2@163.com', '易筋栾诺', 100);
INSERT INTO `userinfo` VALUES (46, '日彭越', '甘肃省百色市上甘岭区安图路116号阳光翠竹苑', '15747971534', NULL, '15747971534', 'F4Gyl3b~XV57X+', 1, '2021-04-28', '6pqg@163.com', '疯魔诗兰', 100);
INSERT INTO `userinfo` VALUES (47, '巫泰然', '山西省保定市乌伊岭区百官街68号金色家园', '13689425386', NULL, '13689425386', 'l7s175Jq7clC', 3, '2021-11-29', 'kyzw66oi4@163.com', '天山寅骏', 100);
INSERT INTO `userinfo` VALUES (48, '郦景辉', '江苏省白城市翠峦区安图路179号和亭佳苑', '15903455989', NULL, '15903455989', 'Su&HLTflJ', 1, '2020-08-07', 'e1jjcj@163.com', '螳螂承恩', 100);
INSERT INTO `userinfo` VALUES (49, '西兴修', '黑龙江省蚌埠市五营区北艾路140号住友嘉馨名园', '16738017114', NULL, '16738017114', 'B$M8(Yss8*0L1Y6', 4, '2021-07-27', 'cnelm2pgpgp@163.com', '北冥莹雪', 100);
INSERT INTO `userinfo` VALUES (50, '延浩邈', '台湾省白山市友好区保德路89号菊园五街坊', '17823091802', NULL, '17823091802', 'xq(7VU(~qBD%', 3, '2020-03-23', '0z41@163.com', '太虚盼南', 100);
INSERT INTO `userinfo` VALUES (51, '东嘉容', '江苏省包头市红星区宝杨路155号协通公寓', '15686327347', NULL, '15686327347', 'JJ3gLWxN2!F#LAr', 4, '2021-11-08', 'iq4r65nmmib@163.com', '江南红娟', 100);
INSERT INTO `userinfo` VALUES (52, '呀博涛', '陕西省白城市翠峦区安澜路126号耀江花园', '18338065185', NULL, '18338065185', '(_CpbUzS', 1, '2022-03-26', 'wbz1k@163.com', '璃月仙仙', 100);
INSERT INTO `userinfo` VALUES (53, '死乐邦', '甘肃省保山市榆次区保德路190号阳光翠竹苑', '15555798815', NULL, '15555798815', 'R$xOqeRhjT#&y', 3, '2020-07-23', 'dcg43jqq@163.com', '中原乙卯', 100);
INSERT INTO `userinfo` VALUES (54, '全英喆', '河南省保定市乌伊岭区安远路171号和亭佳苑', '16527669312', NULL, '16527669312', 'EdJ6vQ_Ne4IU', 2, '2020-02-19', '5fdph6vbslfco@163.com', '魔都学名', 100);
INSERT INTO `userinfo` VALUES (55, '儇俊风', '湖北省巴彦淖尔市美溪区包头路66号复华城市花园', '15824996139', NULL, '15824996139', '_YIiY^!zsFotSf', 2, '2020-09-21', '66tna0ewiqm0@163.com', '留云喜儿', 100);
INSERT INTO `userinfo` VALUES (56, '桑安然', '山西省白银市新青区宝林路80号东新大厦', '14653038625', NULL, '14653038625', 'p5s#&Ue2', 1, '2022-01-05', 'pkuuaqfohj01@163.com', '北海奕声', 100);
INSERT INTO `userinfo` VALUES (57, '湛兴怀', '海南省宝鸡市汤旺河区白城南路175号金色家园', '13077271451', NULL, '13077271451', '#Q*QBd6p~$es73', 2, '2021-11-29', 'bagqe@163.com', '北风香双', 100);
INSERT INTO `userinfo` VALUES (58, '衣伟博', '吉林省保定市乌伊岭区白城路182号耀江花园', '19810585056', NULL, '19810585056', 'dst+~aiM9Qcen', 4, '2021-06-01', 'wkg4j3q@163.com', '四风驰鸿', 100);
INSERT INTO `userinfo` VALUES (59, '柴乐池', '江西省安康市伊春区保屯路170号复华城市花园', '17755058676', NULL, '17755058676', '8J5cNH2DbxX!', 4, '2021-11-16', 'wi3udnhfy5x@163.com', '风啸梓豪', 100);
INSERT INTO `userinfo` VALUES (60, '刚浩邈', '吉林省鞍山市西林区鞍山支路145号住友嘉馨名园', '13717177832', NULL, '13717177832', 'Wz(uiKSb6', 1, '2021-02-26', 'tikz@163.com', '京城孟菊', 100);
INSERT INTO `userinfo` VALUES (61, '妘子默', '陕西省白山市友好区保德路10号溢盈河畔别墅', '18785994652', NULL, '18785994652', '4wpyFBSpJ', 3, '2020-08-23', '0t1zdqzlbeoi@163.com', '金山飞槐', 100);
INSERT INTO `userinfo` VALUES (62, '保宏达', '台湾省包头市红星区北艾路59号金色家园', '13448814622', NULL, '13448814622', '&ND)8ywk$pUQ', 4, '2020-03-22', 'kyr0pfkv@163.com', '中原水风', 100);
INSERT INTO `userinfo` VALUES (63, '勤承安', '陕西省保定市乌伊岭区安仁路172号协通公寓', '15160512180', NULL, '15160512180', 'nzX*15(z6W$Q+V', 4, '2020-03-30', 'yvlh55@163.com', '长安永年', 100);
INSERT INTO `userinfo` VALUES (64, '见宏逸', '吉林省安阳市金山屯区鞍山支路48号溢盈河畔别墅', '13935791494', NULL, '13935791494', 'nyctbb3TEM&e0', 1, '2020-04-22', 'n52jizaynao@163.com', '墟散兴有', 100);
INSERT INTO `userinfo` VALUES (65, '妘嘉纳', '江苏省百色市上甘岭区八一路197号协通公寓', '17010153589', NULL, '17010153589', '2Bi(HkVyDI1F@mz', 3, '2020-04-10', 'qjw4s@163.com', '华清曼辞', 100);
INSERT INTO `userinfo` VALUES (66, '卞晗昱', '海南省白城市翠峦区宝祁路71号爱里舍花园', '18253012131', NULL, '18253012131', 'dLjVr(MH_Z$k', 3, '2021-03-16', 'djbj03ku5u0zf@163.com', '南川冰巧', 100);
INSERT INTO `userinfo` VALUES (67, '虎光霁', '云南省巴彦淖尔市美溪区安澜路133号住友嘉馨名园', '18009981599', NULL, '18009981599', 'zFOU%uD(KU8', 4, '2021-02-26', 'ceg241ha@163.com', '终幕孝涵', 100);
INSERT INTO `userinfo` VALUES (68, '竺成文', '云南省巴彦淖尔市美溪区百色路165号复华城市花园', '15799189255', NULL, '15799189255', 'ypPBQsd3z*L9f@', 4, '2021-03-15', 'kxn1g1p@163.com', '平原笑萍', 100);
INSERT INTO `userinfo` VALUES (69, '延嘉誉', '福建省包头市红星区安化路94号东新大厦', '18721491060', NULL, '18721491060', '+PQ4^Q01(9(E4&k', 4, '2022-04-03', '24mhmudf55u1m@163.com', '法慧伟毅', 100);
INSERT INTO `userinfo` VALUES (70, '秋飞虎', '江苏省巴彦淖尔市美溪区宝通路178号和亭佳苑', '15936683500', NULL, '15936683500', '@f5sXyimR3I', 4, '2021-01-03', 'u26emc0axrd4ytm@163.com', '碧水婵娟', 100);
INSERT INTO `userinfo` VALUES (71, '伯阳煦', '吉林省蚌埠市五营区宝源路69号和亭佳苑', '17840639970', NULL, '17840639970', 'c_iwIH8_x#yv(', 1, '2022-04-09', 'e0q@163.com', '百花芮雅', 100);
INSERT INTO `userinfo` VALUES (72, '水康成', '海南省白山市友好区安福路189号复华城市花园', '18876276416', NULL, '18876276416', 'hq&h4gPwnb^Ig6', 2, '2021-02-17', '42zgwqcx53uf5@163.com', '无冬恬默', 100);
INSERT INTO `userinfo` VALUES (73, '僧浩穰', '湖北省包头市红星区宝联路79号住友嘉馨名园', '13204462208', NULL, '13204462208', 'J@_CcjZdYHr', 3, '2022-01-21', 'cs1bpma@163.com', '法慧艺馨', 100);
INSERT INTO `userinfo` VALUES (74, '衣康顺', '浙江省巴彦淖尔市美溪区安边路154号真新六街坊', '15598442012', NULL, '15598442012', 'gL8U8A5gazHEQ5', 3, '2022-04-28', 'g1eo3rz200ltbz@163.com', '北国绮兰', 100);
INSERT INTO `userinfo` VALUES (75, '别成龙', '山西省安阳市金山屯区安波路166号阳光翠竹苑', '17567612621', NULL, '17567612621', 'U%2b+NyyjgGd(w', 4, '2020-02-11', '0o26@163.com', '珉林醉易', 100);
INSERT INTO `userinfo` VALUES (76, '延烨熠', '陕西省巴彦淖尔市美溪区板泉路31号耀江花园', '18700766344', NULL, '18700766344', 'eV%J3~IMh', 4, '2021-01-25', 'b144@163.com', '蒙德半雪', 100);
INSERT INTO `userinfo` VALUES (77, '狮德义', '四川省保山市榆次区宝山路22号博泰新苑', '16554633944', NULL, '16554633944', 'Kg(apZ^N&sM*%', 1, '2020-03-05', 'mq1hcldybv5cits@163.com', '太山恺乐', 100);
INSERT INTO `userinfo` VALUES (78, '官乐康', '安徽省白银市新青区北艾路111号复华城市花园', '15521169203', NULL, '15521169203', 'QCzb2Jr^YTv', 2, '2020-12-28', 'cc11lkkpbttm41m@163.com', '暴风依童', 100);
INSERT INTO `userinfo` VALUES (79, '靖斌斌', '青海省包头市红星区白城南路144号阳光翠竹苑', '15101201451', NULL, '15101201451', 'IMrhNpVdzUrJltr', 2, '2021-02-16', 'gpqa5vxph26deyg@163.com', '桃花雨玉', 100);
INSERT INTO `userinfo` VALUES (80, '狼睿德', '浙江省白银市新青区保屯路99号耀江花园', '15263029272', NULL, '15263029272', 'OabfUh*v@fXxdX', 3, '2021-01-31', 'of5ydd@163.com', '北国安天', 100);
INSERT INTO `userinfo` VALUES (81, '增坚成', '黑龙江省蚌埠市五营区白玉路29号和亭佳苑', '16551698904', NULL, '16551698904', 'eapb(qVD*xx!', 4, '2020-08-15', 'bglgqzy1gja@163.com', '上清香萱', 100);
INSERT INTO `userinfo` VALUES (82, '嫖元思', '广东省安康市伊春区爱国路175号菊园五街坊', '18383134672', NULL, '18383134672', 'B1SMY!reRf^', 3, '2021-02-22', 'zds6omluqkhkkm@163.com', '华清锦诗', 100);
INSERT INTO `userinfo` VALUES (83, '狐明旭', '吉林省保定市乌伊岭区安远路88号耀江花园', '18205818201', NULL, '18205818201', 'O*vzJ&6EaKImcEE', 1, '2020-06-22', '5z3u1d1@163.com', '仲夏殿薇', 100);
INSERT INTO `userinfo` VALUES (84, '嫖星洲', '陕西省安顺市南岔区安图路197号金色家园', '14613567933', NULL, '14613567933', 'VpGQ4YZSceT', 4, '2021-06-27', 'ad3fg4gsrnzby@163.com', '削月子硕', 100);
INSERT INTO `userinfo` VALUES (85, '己英光', '吉林省百色市上甘岭区爱国路9号博泰新苑', '17790479247', NULL, '17790479247', 'gl8Q1t(0$', 4, '2021-06-25', '1uphxpb0@163.com', '天际惜珊', 100);
INSERT INTO `userinfo` VALUES (86, '亢星阑', '河北省白银市新青区爱国路121号耀江花园', '18805443856', NULL, '18805443856', '0702f&MErb(d', 2, '2020-11-05', 'e2of2fqlyqdx6@163.com', '震雷成风', 100);
INSERT INTO `userinfo` VALUES (87, '老志国', '云南省包头市红星区宝山路105号住友嘉馨名园', '18630011386', NULL, '18630011386', 'k(ulHXPUzWM', 2, '2020-09-15', '2do@163.com', '明冠兴兴', 100);
INSERT INTO `userinfo` VALUES (88, '滕宏富', '浙江省鞍山市西林区白渡路7号东新大厦', '17843661075', NULL, '17843661075', 'e059oLqrE', 4, '2021-07-10', 'bjvgy4vxm6fve@163.com', '雾都红翔', 100);
INSERT INTO `userinfo` VALUES (89, '才嘉祥', '湖南省安康市伊春区保屯路77号复华城市花园', '15349156164', NULL, '15349156164', '2n^pD*ifx', 3, '2020-05-24', 'rngo5ectn@163.com', '震雷晨朗', 100);
INSERT INTO `userinfo` VALUES (90, '您安澜', '甘肃省鞍山市西林区八一路61号金色家园', '15835506603', NULL, '15835506603', 'yd9O9WGC', 2, '2021-11-30', 'duyy2t@163.com', '璃沙其倩', 100);
INSERT INTO `userinfo` VALUES (91, '姬俊贤', '贵州省鞍山市西林区保德路135号和亭佳苑', '17063865848', NULL, '17063865848', 'u*jsYX@_hd', 1, '2021-04-13', 'eiw6qf4eqr@163.com', '通幽永芬', 100);
INSERT INTO `userinfo` VALUES (92, '续立人', '河北省安庆市带岭区白水路77号爱里舍花园', '18583207451', NULL, '18583207451', 'b%SSWamsfdejl$', 3, '2020-02-01', '0qgc@163.com', '白云春兰', 100);
INSERT INTO `userinfo` VALUES (93, '风咏德', '安徽省包头市红星区包头路85号东新大厦', '18648914127', NULL, '18648914127', '~LI%7y80', 4, '2022-01-10', 'vgs0oek@163.com', '东海淑惠', 100);
INSERT INTO `userinfo` VALUES (94, '栗兴言', '吉林省安顺市南岔区板泉路198号复华城市花园', '15299448498', NULL, '15299448498', 'G!s3i+CzDR', 1, '2020-11-03', 'o3mddg32znbn@163.com', '水月景浩', 100);
INSERT INTO `userinfo` VALUES (95, '干子平', '吉林省包头市红星区安澜路164号爱里舍花园', '15050985176', NULL, '15050985176', 'cNp0NU1ogDSm', 3, '2022-02-02', 'qaiikpu4@163.com', '奉天秀艳', 100);
INSERT INTO `userinfo` VALUES (96, '保天泽', '江西省百色市上甘岭区百官街37号住友嘉馨名园', '18648196919', NULL, '18648196919', 'C7p2tJbhsjt&(2', 2, '2020-02-29', '3caicsjze655r@163.com', '北风雪山', 100);
INSERT INTO `userinfo` VALUES (97, '鸡永怡', '福建省安庆市带岭区爱国路92号金色家园', '17594224425', NULL, '17594224425', 'pBi9KtWfVA', 4, '2021-06-14', 'z1ajujadfw@163.com', '京城昭阳', 100);
INSERT INTO `userinfo` VALUES (98, '嵇建木', '吉林省安庆市带岭区宝通路43号耀江花园', '15987919144', NULL, '15987919144', 'Bjq&17ZHEqu05d', 4, '2021-10-31', 'efkrewx0vakc2dl@163.com', '坠星康裕', 100);
INSERT INTO `userinfo` VALUES (99, '脱志义', '广东省安顺市南岔区白玉路107号爱里舍花园', '17341561635', NULL, '17341561635', '#QbLl_Lc7ndME', 3, '2020-04-02', 'ajbpp5npnj@163.com', '白云昌黎', 100);
INSERT INTO `userinfo` VALUES (100, '明睿明', '台湾省白山市友好区半淞园路52号耀江花园', '17210676891', NULL, '17210676891', '7o_aSM3KT05Z*$j', 2, '2021-06-05', '6uz03@163.com', '筑阳天才', 100);
INSERT INTO `userinfo` VALUES (101, '萧雨安', '河南省白山市友好区八一路140号阳光翠竹苑', '15288764295', NULL, '15288764295', 'uj!CMPKeZ', 1, '2021-05-12', 'k4m6hak@163.com', '和安小姐姐', 100);
INSERT INTO `userinfo` VALUES (102, '何千怡', '四川省安顺市南岔区安义路152号耀江花园', '18772235752', NULL, '18772235752', '3kE1wG0z1SDG', 3, '2021-12-17', 'e2upzf@163.com', '一只痴云呀', 100);
INSERT INTO `userinfo` VALUES (103, '方芬璇', '青海省巴彦淖尔市美溪区白水路110号金色家园', '15947729346', NULL, '15947729346', 'loDGMlq*', 3, '2020-05-09', 'jxa1e@163.com', '力强小公主', 100);
INSERT INTO `userinfo` VALUES (104, '蔡雅寒', '福建省蚌埠市五营区包头路40号真新六街坊', '17195569788', NULL, '17195569788', 'ZtIzBmVe', 2, '2021-01-25', 'ogz1d@163.com', '是你的从易呀', 100);
INSERT INTO `userinfo` VALUES (105, '史云心', '江西省巴彦淖尔市美溪区安波路123号阳光翠竹苑', '13198214895', NULL, '13198214895', 'XIgYYu%tWX', 3, '2020-12-19', 'jzdjapmhl6ocf31@163.com', '雨巷少年怜容', 100);
INSERT INTO `userinfo` VALUES (106, '梁水芸', '河北省安顺市南岔区百安路（方泰镇）51号和亭佳苑', '15044373047', NULL, '15044373047', 'yYAFB&5+Dw', 1, '2020-08-04', 'qyf2gnyrf6tzi@163.com', '小惜香吖', 100);
INSERT INTO `userinfo` VALUES (107, '傅未步', '湖南省百色市上甘岭区保屯路29号和亭佳苑', '17315823073', NULL, '17315823073', '64ufBkkP2', 2, '2020-10-05', 'hkc0ave6x4z6@163.com', '一条小彦峰', 100);
INSERT INTO `userinfo` VALUES (108, '江长英', '江西省保山市榆次区宝联路28号阳光翠竹苑', '18760279150', NULL, '18760279150', 'BlIlbi(pDX2zic', 4, '2022-04-25', 'e3yuedf1q5an@163.com', '江胜大叔', 100);
INSERT INTO `userinfo` VALUES (109, '秦元冬', '云南省白银市新青区八一路61号博泰新苑', '13768861465', NULL, '13768861465', 'Kf7D~yaNIt2c8r$', 3, '2020-06-29', 'bua@163.com', '曦哲小仙女', 100);
INSERT INTO `userinfo` VALUES (110, '吴映天', '云南省巴中市乌马河区安汾路48号菊园五街坊', '18334965188', NULL, '18334965188', 'm0%TxR1E%SNv21', 4, '2020-11-25', 'dhsn6e@163.com', '是竹韵吖', 100);
INSERT INTO `userinfo` VALUES (111, '朱盼香', '黑龙江省白银市新青区安德路40号金色家园', '15294003197', NULL, '15294003197', '4rlFOQhvNbYfSh', 1, '2020-02-16', '61px@163.com', '长霞小哥哥', 100);
INSERT INTO `userinfo` VALUES (112, '汤秋芸', '湖南省安阳市金山屯区北艾路11号东新大厦', '19862545141', NULL, '19862545141', 'M25KMHvLtaoy*', 1, '2020-01-09', 'aidhvtvnm@163.com', '和光小哥哥', 100);
INSERT INTO `userinfo` VALUES (113, '薛静丹', '河南省包头市红星区半淞园路105号和亭佳苑', '18237504030', NULL, '18237504030', 'E0JsB$58%q~LV', 2, '2021-05-05', 'vd3xlcm5u@163.com', '忻畅公子', 100);
INSERT INTO `userinfo` VALUES (114, '吴梓美', '甘肃省包头市红星区百花街18号协通公寓', '13215577649', NULL, '13215577649', 'Oz)xmsBIbE', 1, '2022-02-22', '6n0rolfyv@163.com', '新良超级甜', 100);
INSERT INTO `userinfo` VALUES (115, '杜贞芳', '辽宁省包头市红星区北艾路194号住友嘉馨名园', '18284849792', NULL, '18284849792', 'yCZl29w3t#bf', 2, '2020-03-15', 'jvpkpx4fmo6@163.com', '梦琪来了', 100);
INSERT INTO `userinfo` VALUES (116, '叶安蕾', '浙江省安康市伊春区北艾路46号阳光翠竹苑', '17405161133', NULL, '17405161133', '@lpBEHF@l', 4, '2020-05-14', '4vtoqizat2@163.com', '玉涵baby', 100);
INSERT INTO `userinfo` VALUES (117, '龚友蕊', '吉林省巴中市乌马河区白玉路19号真新六街坊', '15127344088', NULL, '15127344088', '5DEd)v1q', 3, '2021-03-11', 'grups0ko3zyf6@163.com', '启峰丶小可爱', 100);
INSERT INTO `userinfo` VALUES (118, '叶春雨', '江苏省巴中市乌马河区安波路65号复华城市花园', '15996193429', NULL, '15996193429', 'hT%Q+uEe0n', 3, '2020-09-30', 'sivfhtgrmpf@163.com', '寻阳来了', 100);
INSERT INTO `userinfo` VALUES (119, '李淳静', '江西省百色市上甘岭区宝通路183号阳光翠竹苑', '17637964554', NULL, '17637964554', 'G$$63bS_uT5#', 1, '2020-02-17', '6136ubo0i02hlmc@163.com', '一吃就胖小永亮', 100);
INSERT INTO `userinfo` VALUES (120, '邱雪艳', '陕西省安康市伊春区宝林路59号菊园五街坊', '16537543015', NULL, '16537543015', '(rUaLXe4qu3pt', 2, '2021-06-26', 'c0gpt04ad2ljvwe@163.com', '猫巷少女含香', 100);
INSERT INTO `userinfo` VALUES (121, '郝婧芸', '浙江省蚌埠市五营区安化路47号真新六街坊', '13978894877', NULL, '13978894877', '4~Wp$UJvk%84da', 1, '2020-04-04', 'ku0p@163.com', '努力啊大统赫', 100);
INSERT INTO `userinfo` VALUES (122, '石尔槐', '广东省宝鸡市汤旺河区鞍山路153号耀江花园', '13825967501', NULL, '13825967501', 'RXJxJ97tPJR&m7p', 1, '2021-08-18', '4fwyfmzno@163.com', '晓灵小郎君', 100);
INSERT INTO `userinfo` VALUES (123, '余竹韵', '江西省白城市翠峦区百色路111号东新大厦', '18930033971', NULL, '18930033971', 'V7OLBRu3', 3, '2021-10-26', '2qgosjwlg332y@163.com', '书生尔竹', 100);
INSERT INTO `userinfo` VALUES (124, '董芬芬', '河北省安康市伊春区白水路90号博泰新苑', '15359944431', NULL, '15359944431', 'U9+zTqq3hZ3H2o', 3, '2022-05-08', 'eftvx3ysuofv@163.com', '沛山酱大魔王', 100);
INSERT INTO `userinfo` VALUES (125, '龙初月', '四川省百色市上甘岭区八一路108号阳光翠竹苑', '18284272898', NULL, '18284272898', 'L!%omB#bDsgl', 2, '2021-11-17', 'xnnftwbq0@163.com', '凌香小郎君', 100);
INSERT INTO `userinfo` VALUES (126, '金白筠', '河南省宝鸡市汤旺河区安福路112号协通公寓', '13563138375', NULL, '13563138375', 'xCVUpmtHYg$qZ', 3, '2021-10-01', 'qibz0@163.com', '寻绿小娘子', 100);
INSERT INTO `userinfo` VALUES (127, '宋白曼', '山东省保山市榆次区鞍山路36号阳光翠竹苑', '18061612222', NULL, '18061612222', '$h$NjWU*X4', 4, '2022-04-08', 'is2uiusu@163.com', '是思晨吖', 100);
INSERT INTO `userinfo` VALUES (128, '周寒天', '安徽省鞍山市西林区宝山路44号耀江花园', '19189593968', NULL, '19189593968', 'd~B@ow2Ow&~l$Z1', 1, '2021-10-20', 'n6u@163.com', '铭晨少女', 100);
INSERT INTO `userinfo` VALUES (129, '黄梦竹', '贵州省蚌埠市五营区安仁路84号金色家园', '15871339441', NULL, '15871339441', 'H$92NTb*XM&', 2, '2020-04-09', '0ex@163.com', '琳芳mio', 100);
INSERT INTO `userinfo` VALUES (130, '罗夜春', '广东省蚌埠市五营区白城南路176号耀江花园', '13817188993', NULL, '13817188993', '^p4CmR7cRtMKgSE', 2, '2021-01-26', 'cj2yi4y64@163.com', '晴美可爱吗', 100);
INSERT INTO `userinfo` VALUES (131, '蔡绮琴', '广东省白山市友好区安龙路40号耀江花园', '19836068713', NULL, '19836068713', 'W~hoxpDRFl', 2, '2020-01-31', 'yjgwglxkc1jp4@163.com', '鸿畅酱吖', 100);
INSERT INTO `userinfo` VALUES (132, '江宜春', '贵州省蚌埠市五营区百安路（方泰镇）65号菊园五街坊', '15201914882', NULL, '15201914882', 'BqWoph2ye69^fh', 1, '2020-06-19', '1eh@163.com', '山亦少爷', 100);
INSERT INTO `userinfo` VALUES (133, '谢隽美', '江苏省白山市友好区宝林路123号博泰新苑', '13601674205', NULL, '13601674205', 'KyAB#fLHLGma!', 1, '2020-01-21', 'cnta3f6g4x@163.com', '是你的丹翠呀', 100);
INSERT INTO `userinfo` VALUES (134, '江暖姝', '吉林省安康市伊春区白渡路175号复华城市花园', '13172066488', NULL, '13172066488', 'MtlxOe15JM~n&E1', 3, '2022-03-25', 'vdvl11k2xzikqc2@163.com', '努力啊大淳雅', 100);
INSERT INTO `userinfo` VALUES (135, '谭宛畅', '河南省保山市榆次区包头路10号菊园五街坊', '15010787660', NULL, '15010787660', 'XpaqK&qWK', 1, '2020-01-26', 'tm04ew@163.com', '小雅柔吖', 100);
INSERT INTO `userinfo` VALUES (136, '周天巧', '青海省白银市新青区白渡路164号耀江花园', '18646985166', NULL, '18646985166', 'k&Ix+Pgyj1', 1, '2020-01-05', '3rgxn@163.com', '一只炎昊呀', 100);
INSERT INTO `userinfo` VALUES (137, '宋春芳', '安徽省巴中市乌马河区百花街31号博泰新苑', '13952441726', NULL, '13952441726', 'amCYtJl*d', 4, '2021-04-23', 'x6o@163.com', '邻家令雪', 100);
INSERT INTO `userinfo` VALUES (138, '刘会雯', '四川省安庆市带岭区白渡桥89号溢盈河畔别墅', '14921527358', NULL, '14921527358', 'vVpvZR1C0f', 4, '2022-03-30', 'lnxvedhqjrz1cd5@163.com', '一只智超呀', 100);
INSERT INTO `userinfo` VALUES (139, '曹迎梦', '青海省巴中市乌马河区宝林路152号耀江花园', '13584597671', NULL, '13584597671', '^i1yfG8+BRl', 1, '2021-11-23', '4n1@163.com', '昊宇mm丶', 100);
INSERT INTO `userinfo` VALUES (140, '石韦柔', '河南省保定市乌伊岭区安福路48号真新六街坊', '15961448887', NULL, '15961448887', 'UTl5YRIvQ!Ywrj1', 3, '2021-04-12', '0264@163.com', '邻家福跃', 100);
INSERT INTO `userinfo` VALUES (141, '邓柔煦', '陕西省蚌埠市五营区安化路103号住友嘉馨名园', '18644923417', NULL, '18644923417', 'ChGC@VIRREY6O', 3, '2021-05-08', '1ud41az1levf@163.com', '秀雅来了', 100);
INSERT INTO `userinfo` VALUES (142, '戴若彤', '江西省安阳市金山屯区宝通路0号协通公寓', '13083049554', NULL, '13083049554', 'QKRSzkfklqw', 2, '2021-08-16', 'pito1focod@163.com', '天帅姑娘', 100);
INSERT INTO `userinfo` VALUES (143, '张代丝', '四川省保定市乌伊岭区保屯路174号耀江花园', '17791238133', NULL, '17791238133', 'iGRi~bLj!d', 3, '2020-05-10', 'mdjflgpo03jp@163.com', '努力啊大树鹤', 100);
INSERT INTO `userinfo` VALUES (144, '邹智敏', '甘肃省包头市红星区宝源路140号协通公寓', '15821462268', NULL, '15821462268', 's^I7us_dptxm3%4', 2, '2020-02-17', 'soqa@163.com', '是你的迁迁呀', 100);
INSERT INTO `userinfo` VALUES (145, '谢谷蓝', '湖南省包头市红星区安亭路189号真新六街坊', '15910127984', NULL, '15910127984', 'pwPUtaY^J', 1, '2021-12-09', 'y5k2k4srla0qvmq@163.com', '春竹三岁啦', 100);
INSERT INTO `userinfo` VALUES (146, '董雁枫', '湖北省宝鸡市汤旺河区宝安公路40号阳光翠竹苑', '19155972409', NULL, '19155972409', 'eD@hKk#C~', 4, '2020-11-23', 'syxuqew@163.com', '青容小姐姐', 100);
INSERT INTO `userinfo` VALUES (147, '韩佳思', '河南省安庆市带岭区北艾路129号东新大厦', '13836239289', NULL, '13836239289', 'oe44Jl5LreM*', 4, '2021-08-05', 'qibz0@163.com', '盼山酱吖', 100);
INSERT INTO `userinfo` VALUES (148, '余贞芳', '青海省安康市伊春区白城南路195号博泰新苑', '17086757964', NULL, '17086757964', 'lfDaU2pN2k', 2, '2020-03-18', 'mwfzo@163.com', '一条小高邈', 100);
INSERT INTO `userinfo` VALUES (149, '方慕梅', '江苏省宝鸡市汤旺河区白城南路110号爱里舍花园', '17189551387', NULL, '17189551387', 'abVT+zI(3dCHPx', 4, '2021-02-10', 'nvncxforzmt01o@163.com', '是歌飞吖', 100);
INSERT INTO `userinfo` VALUES (150, '赵访云', '台湾省安阳市金山屯区宝杨路24号博泰新苑', '14585889636', NULL, '14585889636', 't!6%wyL~SILi', 4, '2020-07-30', 'jh4606xznpt@163.com', '宛亦公子', 100);
INSERT INTO `userinfo` VALUES (151, '孟语晨', '江西省白山市友好区安亭路88号住友嘉馨名园', '17076268047', NULL, '17076268047', 'hOBdz_JLccCF', 3, '2021-05-12', 'dpuz0c@163.com', '嘉懿Sama', 100);
INSERT INTO `userinfo` VALUES (152, '石鹤梦', '福建省巴中市乌马河区宝林路31号协通公寓', '18738837363', NULL, '18738837363', 'FxQ0UR!H%', 2, '2021-04-06', 'uecswl4b5@163.com', '名哲桑', 100);
INSERT INTO `userinfo` VALUES (153, '万秀如', '河北省白山市友好区安龙路16号博泰新苑', '13078027028', NULL, '13078027028', '~+Q8m@IV&#C', 2, '2021-04-12', 'awjhsco@163.com', '蓬莱山永年', 100);
INSERT INTO `userinfo` VALUES (154, '王小雨', '安徽省白城市翠峦区白城南路196号东新大厦', '15360834534', NULL, '15360834534', '2_N@LYURy!G', 1, '2021-10-27', '0v3w3a@163.com', '犬走元槐', 100);
INSERT INTO `userinfo` VALUES (155, '徐盼香', '四川省白山市友好区巴林路41号复华城市花园', '18407466322', NULL, '18407466322', 'Gj2nMp_UF$', 3, '2021-01-08', 'd2kbet0ym1@163.com', '天神院绮风', 100);
INSERT INTO `userinfo` VALUES (156, '唐恬雅', '湖北省包头市红星区保屯路51号博泰新苑', '17634658350', NULL, '17634658350', 'uovg0j(DKy3', 3, '2022-03-12', 'hwhu25znm@163.com', '風見静卉', 100);
INSERT INTO `userinfo` VALUES (157, '杜夏蓉', '甘肃省百色市上甘岭区白兰路118号金色家园', '13000413316', NULL, '13000413316', 'nyRm_SNV#E', 1, '2020-09-23', 'kbsmfq6os4ib5@163.com', '坂田虹星', 100);
INSERT INTO `userinfo` VALUES (158, '赵孟夏', '河南省百色市上甘岭区安汾路53号金色家园', '17787971001', NULL, '17787971001', '*#Z3HRmB2ADcoJ', 3, '2021-02-23', 'pta0yg54nc@163.com', '蓬莱山梓欣', 100);
INSERT INTO `userinfo` VALUES (159, '任丽泽', '江苏省蚌埠市五营区安顺路93号真新六街坊', '17111224879', NULL, '17111224879', 'j9%4I!3&', 4, '2021-08-29', 'zagz54pu0z1zv5@163.com', '子楠Sama', 100);
INSERT INTO `userinfo` VALUES (160, '彭玉萍', '山东省蚌埠市五营区宝安公路117号爱里舍花园', '16522083137', NULL, '16522083137', 'ZPd&JmlpfFOA0Ic', 1, '2020-09-06', '1k03@163.com', '幽花涵畅', 100);
INSERT INTO `userinfo` VALUES (161, '崔许弋', '江苏省巴彦淖尔市美溪区鞍山支路185号真新六街坊', '18945173242', NULL, '18945173242', 'J^6~SLB^ry18f', 1, '2021-10-17', 'fxvei5@163.com', '藤原雅丹', 100);
INSERT INTO `userinfo` VALUES (162, '钱朗然', '江西省百色市上甘岭区宝联路17号耀江花园', '13167474167', NULL, '13167474167', '27RQADD)3weLt', 2, '2021-09-03', 'vg2nvprnq0vuazn@163.com', '矢泽盼枫', 100);
INSERT INTO `userinfo` VALUES (163, '易奥雅', '贵州省安庆市带岭区宝山路82号耀江花园', '15274897192', NULL, '15274897192', 'eXFaVw0W5wG', 4, '2022-04-18', '0v1l1@163.com', '冬马俊贤', 100);
INSERT INTO `userinfo` VALUES (164, '汪博雅', '山东省安顺市南岔区宝山路161号协通公寓', '13407145632', NULL, '13407145632', 'j)ZAbiFr', 4, '2021-03-02', 'mvdr2wclbq6@163.com', '风见阳曜', 100);
INSERT INTO `userinfo` VALUES (165, '孔冰彦', '江苏省安阳市金山屯区宝通路183号金色家园', '17067236320', NULL, '17067236320', 'H*geuwt4v%5Oj', 1, '2021-12-15', '0o5mgjdstavf2pz@163.com', '骞泽殿下', 100);
INSERT INTO `userinfo` VALUES (166, '康访烟', '吉林省白山市友好区宝昌路71号住友嘉馨名园', '16559493868', NULL, '16559493868', 'R(lQY3S+XIxzy', 1, '2020-08-21', '2qotea0hjd@163.com', '魂魄佩杉', 100);
INSERT INTO `userinfo` VALUES (167, '文莉娜', '四川省巴彦淖尔市美溪区安仁路22号溢盈河畔别墅', '18439507774', NULL, '18439507774', 'al+5qp5S^l%pJ7', 2, '2022-04-12', '2kezeuc56go@163.com', '天神院嘉许', 100);
INSERT INTO `userinfo` VALUES (168, '石从雪', '福建省巴中市乌马河区包头南路98号耀江花园', '18428712797', NULL, '18428712797', 'WJF046r8', 1, '2020-03-10', 'xe1hve4l@163.com', '水桥天籁', 100);
INSERT INTO `userinfo` VALUES (169, '任俊英', '台湾省安阳市金山屯区白城南路103号菊园五街坊', '14601919609', NULL, '14601919609', 'G!yQS9BkIY+#X(', 1, '2020-09-18', 'siibl64v@163.com', '泄矢正青', 100);
INSERT INTO `userinfo` VALUES (170, '唐傲芙', '辽宁省百色市上甘岭区百安路（方泰镇）39号协通公寓', '15892444902', NULL, '15892444902', 'Gm108&nzk3', 2, '2022-02-15', '4rqrcn10@163.com', '凤凰院华美', 100);
INSERT INTO `userinfo` VALUES (171, '彭元风', '贵州省安庆市带岭区保屯路57号博泰新苑', '18578253310', NULL, '18578253310', '8f+6a#8sjE^@', 1, '2020-11-03', 'yccwhioirr0@163.com', '風見盼波', 100);
INSERT INTO `userinfo` VALUES (172, '陆夏初', '甘肃省安康市伊春区白渡路181号住友嘉馨名园', '13320137411', NULL, '13320137411', '0iXMNv(&48', 2, '2022-03-06', 'zlob2l25p@163.com', '七濑香莲', 100);
INSERT INTO `userinfo` VALUES (173, '蔡司辰', '四川省白银市新青区安业路141号耀江花园', '14511577480', NULL, '14511577480', '7*K3B0LCVfg7Po', 1, '2022-01-30', 'moh5zv@163.com', '小野寺之薇', 100);
INSERT INTO `userinfo` VALUES (174, '龚米莱', '海南省宝鸡市汤旺河区保屯路177号溢盈河畔别墅', '18094915075', NULL, '18094915075', 'bGBIaJ^@yTnCc4C', 4, '2022-04-23', 'bhhfl@163.com', '矢泽书雪', 100);
INSERT INTO `userinfo` VALUES (175, '卢娴静', '陕西省安阳市金山屯区安边路6号溢盈河畔别墅', '17004541689', NULL, '17004541689', '#*3c8%g*Qgsb', 3, '2020-10-16', 'lm2aaudo@163.com', '暗月寺半芹', 100);
INSERT INTO `userinfo` VALUES (176, '马寻真', '四川省百色市上甘岭区宝源路5号菊园五街坊', '19967297389', NULL, '19967297389', 'KX)_n2oyD!twl$', 1, '2020-09-27', '23egbqgc@163.com', '星熊思琳', 100);
INSERT INTO `userinfo` VALUES (177, '贾溪儿', '四川省安阳市金山屯区白渡桥107号耀江花园', '17768924243', NULL, '17768924243', 'frDg(5t&%Gv', 2, '2020-06-12', '2fqxuojpzapkslo@163.com', '云居雪瑞', 100);
INSERT INTO `userinfo` VALUES (178, '石湛恩', '安徽省保定市乌伊岭区包头南路199号溢盈河畔别墅', '18261768859', NULL, '18261768859', 'zoA*4EsST0', 4, '2021-12-26', 'cw6l2llz6tk1tt@163.com', '西行寺凌雪', 100);
INSERT INTO `userinfo` VALUES (179, '袁欣彩', '黑龙江省白城市翠峦区安边路0号和亭佳苑', '13014606579', NULL, '13014606579', 'oyD4H&ZOy3', 3, '2020-03-06', '1fjjf5vyoxr1@163.com', '幽香辛丑', 100);
INSERT INTO `userinfo` VALUES (180, '苏瑜敏', '浙江省保山市榆次区巴林路171号金色家园', '15159388846', NULL, '15159388846', 'o+h3CUeC#P0CwV!', 3, '2021-04-24', '6ck@163.com', '冬马以冬', 100);
INSERT INTO `userinfo` VALUES (181, '戴雪柳', '海南省百色市上甘岭区宝山路159号爱里舍花园', '13649903901', NULL, '13649903901', 'Ss$6qrkDU5', 3, '2020-04-12', 'wk61gxcr0y@163.com', '五河俊捷', 100);
INSERT INTO `userinfo` VALUES (182, '王雅可', '吉林省保山市榆次区安澜路115号住友嘉馨名园', '15912294312', NULL, '15912294312', '2IfEbc$nbxe_', 2, '2020-09-29', 'bdp3gjuejbi5@163.com', '云居传禄', 100);
INSERT INTO `userinfo` VALUES (183, '罗继红', '河南省巴彦淖尔市美溪区保定路79号复华城市花园', '13117217244', NULL, '13117217244', '2_t1aCi7Nc%vZ$9', 1, '2021-06-08', '4sulrj03@163.com', '御阪浩淼', 100);
INSERT INTO `userinfo` VALUES (184, '卢璎玑', '山西省蚌埠市五营区保定路119号博泰新苑', '17271756605', NULL, '17271756605', 'qz0RPH5pMLMvav', 1, '2021-05-19', 'zeju4u@163.com', '玉刚子', 100);
INSERT INTO `userinfo` VALUES (185, '孙虹英', '江苏省白城市翠峦区安化路72号住友嘉馨名园', '17380257095', NULL, '17380257095', 'wvi%_b6_5XP', 3, '2022-03-29', 'gzlh4wki@163.com', '泄矢书亮', 100);
INSERT INTO `userinfo` VALUES (186, '吕银柳', '浙江省安顺市南岔区保屯路90号东新大厦', '14908237082', NULL, '14908237082', 'EGj3g%UW_k%nA~', 3, '2020-04-17', 'uzl5aqnls3@163.com', '五河海逸', 100);
INSERT INTO `userinfo` VALUES (187, '赖秋柏', '台湾省安顺市南岔区白水路156号阳光翠竹苑', '16511041810', NULL, '16511041810', 'gvqn651&D', 1, '2020-04-22', 'dyaq41zklus@163.com', '七濑蕊珠', 100);
INSERT INTO `userinfo` VALUES (188, '谢连英', '黑龙江省百色市上甘岭区宝安公路68号菊园五街坊', '17659142635', NULL, '17659142635', 'NNHb1d*~_9F1', 1, '2020-05-29', 'awci4yq@163.com', '八坂暖暖', 100);
INSERT INTO `userinfo` VALUES (189, '邓芮欢', '甘肃省巴彦淖尔市美溪区鞍山路199号菊园五街坊', '18508497147', NULL, '18508497147', 'Xd5_9y@)uo', 4, '2021-09-20', 'fhaoor6@163.com', '阳晖君', 100);
INSERT INTO `userinfo` VALUES (190, '曹芷荷', '辽宁省鞍山市西林区北艾路146号菊园五街坊', '19803693556', NULL, '19803693556', 'l8f9+xnU9M@wH2', 3, '2022-02-15', 'imy3ro@163.com', '西行寺汀兰', 100);
INSERT INTO `userinfo` VALUES (191, '丁迷伤', '甘肃省百色市上甘岭区鞍山支路45号阳光翠竹苑', '15363754154', NULL, '15363754154', '_ns)*~6U', 3, '2020-07-29', 'ijx4ba6lpz1jd46@163.com', '犬走永福', 100);
INSERT INTO `userinfo` VALUES (192, '武米兰', '陕西省安顺市南岔区安国路152号爱里舍花园', '17648068671', NULL, '17648068671', 'PF5uNTt0huTX#)', 4, '2020-01-19', '6cnli5hqucvmx6@163.com', '香风曼凡', 100);
INSERT INTO `userinfo` VALUES (193, '贺芹悦', '山西省巴彦淖尔市美溪区安边路40号阳光翠竹苑', '18021671977', NULL, '18021671977', '*Y$T&Au1E*F^zg', 2, '2022-01-27', '6p2r@163.com', '魂魄绮晴', 100);
INSERT INTO `userinfo` VALUES (194, '方燕楠', '贵州省保定市乌伊岭区安德路180号爱里舍花园', '16618607789', NULL, '16618607789', 'DGNLNa8Rej&', 2, '2021-07-30', 'vxq@163.com', '子宁酱', 100);
INSERT INTO `userinfo` VALUES (195, '孙恬美', '福建省白山市友好区百安路（方泰镇）135号协通公寓', '18924768767', NULL, '18924768767', 'hTnDycv^_1mH(', 4, '2020-03-08', 'aluqcom@163.com', '香风代珊', 100);
INSERT INTO `userinfo` VALUES (196, '黄龙梅', '云南省宝鸡市汤旺河区百色路97号阳光翠竹苑', '17336097756', NULL, '17336097756', 'dDTiblZ*Kb5J4', 2, '2021-03-13', 'ipy0ddx@163.com', '风见芬芬', 100);
INSERT INTO `userinfo` VALUES (197, '汪海燕', '河南省宝鸡市汤旺河区宝安公路20号博泰新苑', '16506628132', NULL, '16506628132', 'V4$yZ!Kx+R@$w', 2, '2021-02-17', 'bgj6mt@163.com', '宫古俊能', 100);
INSERT INTO `userinfo` VALUES (198, '康幻珊', '安徽省巴彦淖尔市美溪区安仁路47号东新大厦', '17550671565', NULL, '17550671565', 'KqW+^dR9#Y_$', 4, '2020-04-21', 'pv20hm4iisc@163.com', '星熊青寒', 100);
INSERT INTO `userinfo` VALUES (199, '贺水香', '青海省蚌埠市五营区宝昌路62号和亭佳苑', '13347976027', NULL, '13347976027', 'uv5MJA54KLTrN', 2, '2022-05-06', '3kyngwl@163.com', '东风谷如旋', 100);
INSERT INTO `userinfo` VALUES (200, '龙冬莲', '吉林省百色市上甘岭区宝通路130号金色家园', '13473987018', NULL, '13473987018', 'r17otBp%U6', 4, '2022-03-23', 'ihk2@163.com', '山亦氏', 100);
INSERT INTO `userinfo` VALUES (201, NULL, NULL, '13988888888', NULL, '13988888888', '1234567', 1, '2022-05-25', 'emi@qq.com', '艾米', 100);
INSERT INTO `userinfo` VALUES (202, NULL, NULL, '12312345678', NULL, '12312345678', '0000000', 1, '2022-05-25', '123@gmail.com', '王玉凤', 100);

-- ----------------------------
-- Table structure for vip
-- ----------------------------
DROP TABLE IF EXISTS `vip`;
CREATE TABLE `vip`  (
  `v_viprank` int(11) NOT NULL AUTO_INCREMENT,
  `v_levelup` int(11) NULL DEFAULT NULL,
  `v_discount` decimal(8, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`v_viprank`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of vip
-- ----------------------------
INSERT INTO `vip` VALUES (1, 10, 0.99);
INSERT INTO `vip` VALUES (2, 100, 0.98);
INSERT INTO `vip` VALUES (3, 500, 0.97);
INSERT INTO `vip` VALUES (4, 2000, 0.95);
INSERT INTO `vip` VALUES (5, 5000, 0.93);
INSERT INTO `vip` VALUES (6, 10000, 0.92);
INSERT INTO `vip` VALUES (7, 20000, 0.88);
INSERT INTO `vip` VALUES (8, 50000, 0.85);
INSERT INTO `vip` VALUES (9, 100000, 0.80);
INSERT INTO `vip` VALUES (10, 188888, 0.70);

SET FOREIGN_KEY_CHECKS = 1;
