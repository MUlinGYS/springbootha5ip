/*
Navicat MySQL Data Transfer

Source Server         : 高版本
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : springbootha5ip

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2023-08-13 23:47:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for config
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';

-- ----------------------------
-- Records of config
-- ----------------------------
INSERT INTO `config` VALUES ('1', 'picture1', 'upload/picture1.jpg');
INSERT INTO `config` VALUES ('2', 'picture2', 'upload/picture2.jpg');
INSERT INTO `config` VALUES ('3', 'picture3', 'upload/picture3.jpg');

-- ----------------------------
-- Table structure for dangfeijiaona
-- ----------------------------
DROP TABLE IF EXISTS `dangfeijiaona`;
CREATE TABLE `dangfeijiaona` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhibuzhanghao` varchar(200) DEFAULT NULL COMMENT '支部账号',
  `zhibumingcheng` varchar(200) DEFAULT NULL COMMENT '支部名称',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `yingjiaofeijine` varchar(200) NOT NULL COMMENT '应缴费金额',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1651817743483 DEFAULT CHARSET=utf8 COMMENT='党费缴纳';

-- ----------------------------
-- Records of dangfeijiaona
-- ----------------------------
INSERT INTO `dangfeijiaona` VALUES ('91', '2023-05-06 14:09:58', '支部账号1', '支部名称1', '学号1', '姓名1', '班级1', '联系方式1', '应缴费金额1', '2023-05-06', '未支付');
INSERT INTO `dangfeijiaona` VALUES ('92', '2023-05-06 14:09:58', '支部账号2', '支部名称2', '学号2', '姓名2', '班级2', '联系方式2', '应缴费金额2', '2023-05-06', '未支付');
INSERT INTO `dangfeijiaona` VALUES ('93', '2023-05-06 14:09:58', '支部账号3', '支部名称3', '学号3', '姓名3', '班级3', '联系方式3', '应缴费金额3', '2023-05-06', '未支付');
INSERT INTO `dangfeijiaona` VALUES ('94', '2023-05-06 14:09:58', '支部账号4', '支部名称4', '学号4', '姓名4', '班级4', '联系方式4', '应缴费金额4', '2023-05-06', '未支付');
INSERT INTO `dangfeijiaona` VALUES ('95', '2023-05-06 14:09:58', '支部账号5', '支部名称5', '学号5', '姓名5', '班级5', '联系方式5', '应缴费金额5', '2023-05-06', '未支付');
INSERT INTO `dangfeijiaona` VALUES ('96', '2023-05-06 14:09:58', '支部账号6', '支部名称6', '学号6', '姓名6', '班级6', '联系方式6', '应缴费金额6', '2023-05-06', '未支付');
INSERT INTO `dangfeijiaona` VALUES ('1651817743482', '2023-05-06 14:15:42', '111', 'A支部', '222', '姓名1', '班级1', '13823888881', '200', '2023-05-06', '已支付');

-- ----------------------------
-- Table structure for dangwuxinxi
-- ----------------------------
DROP TABLE IF EXISTS `dangwuxinxi`;
CREATE TABLE `dangwuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhibuzhanghao` varchar(200) NOT NULL COMMENT '支部账号',
  `weiyuanxingming` varchar(200) DEFAULT NULL COMMENT '委员姓名',
  `zhibumingcheng` varchar(200) NOT NULL COMMENT '支部名称',
  `shenfen` varchar(200) DEFAULT NULL COMMENT '身份',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `minzu` varchar(200) DEFAULT NULL COMMENT '民族',
  `jiguan` varchar(200) DEFAULT NULL COMMENT '籍贯',
  `shenfenzhenghao` varchar(200) DEFAULT NULL COMMENT '身份证号',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `peiyanglianxiren` varchar(200) DEFAULT NULL COMMENT '培养联系人',
  `rudangjieshaoren` varchar(200) DEFAULT NULL COMMENT '入党介绍人',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `quedingnifazhanduixiangshijian` date DEFAULT NULL COMMENT '确定拟发展对象时间',
  `shenqingrudangshijian` date DEFAULT NULL COMMENT '申请入党时间',
  `quedingjijifenzishijian` date DEFAULT NULL COMMENT '确定积极分子时间',
  `jieshouweiyubeidangyuanshijian` date DEFAULT NULL COMMENT '接收为预备党员时间',
  `zhuanzhengshijian` date DEFAULT NULL COMMENT '转正时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1651817648203 DEFAULT CHARSET=utf8 COMMENT='党务信息';

-- ----------------------------
-- Records of dangwuxinxi
-- ----------------------------
INSERT INTO `dangwuxinxi` VALUES ('31', '2023-05-06 14:09:58', '支部账号1', '委员姓名1', '支部名称1', '积极分子', '学号1', '姓名1', '班级1', '性别1', '民族1', '籍贯1', '身份证号1', '联系方式1', '培养联系人1', '入党介绍人1', 'upload/dangwuxinxi_touxiang1.jpg', '2023-05-06', '2023-05-06', '2023-05-06', '2023-05-06', '2023-05-06');
INSERT INTO `dangwuxinxi` VALUES ('32', '2023-05-06 14:09:58', '支部账号2', '委员姓名2', '支部名称2', '积极分子', '学号2', '姓名2', '班级2', '性别2', '民族2', '籍贯2', '身份证号2', '联系方式2', '培养联系人2', '入党介绍人2', 'upload/dangwuxinxi_touxiang2.jpg', '2023-05-06', '2023-05-06', '2023-05-06', '2023-05-06', '2023-05-06');
INSERT INTO `dangwuxinxi` VALUES ('33', '2023-05-06 14:09:58', '支部账号3', '委员姓名3', '支部名称3', '积极分子', '学号3', '姓名3', '班级3', '性别3', '民族3', '籍贯3', '身份证号3', '联系方式3', '培养联系人3', '入党介绍人3', 'upload/dangwuxinxi_touxiang3.jpg', '2023-05-06', '2023-05-06', '2023-05-06', '2023-05-06', '2023-05-06');
INSERT INTO `dangwuxinxi` VALUES ('34', '2023-05-06 14:09:58', '支部账号4', '委员姓名4', '支部名称4', '积极分子', '学号4', '姓名4', '班级4', '性别4', '民族4', '籍贯4', '身份证号4', '联系方式4', '培养联系人4', '入党介绍人4', 'upload/dangwuxinxi_touxiang4.jpg', '2023-05-06', '2023-05-06', '2023-05-06', '2023-05-06', '2023-05-06');
INSERT INTO `dangwuxinxi` VALUES ('35', '2023-05-06 14:09:58', '支部账号5', '委员姓名5', '支部名称5', '积极分子', '学号5', '姓名5', '班级5', '性别5', '民族5', '籍贯5', '身份证号5', '联系方式5', '培养联系人5', '入党介绍人5', 'upload/dangwuxinxi_touxiang5.jpg', '2023-05-06', '2023-05-06', '2023-05-06', '2023-05-06', '2023-05-06');
INSERT INTO `dangwuxinxi` VALUES ('36', '2023-05-06 14:09:58', '支部账号6', '委员姓名6', '支部名称6', '积极分子', '学号6', '姓名6', '班级6', '性别6', '民族6', '籍贯6', '身份证号6', '联系方式6', '培养联系人6', '入党介绍人6', 'upload/dangwuxinxi_touxiang6.jpg', '2023-05-06', '2023-05-06', '2023-05-06', '2023-05-06', '2023-05-06');
INSERT INTO `dangwuxinxi` VALUES ('1651817648202', '2023-05-06 14:14:07', '111', '委员姓名1', 'A支部', '预备党员', '222', '姓名1', '班级1', '男', '民族1', '籍贯1', '440300199101010001', '13823888881', '测试', '测试', 'upload/yonghu_touxiang1.jpg', '2023-05-04', '2023-05-11', '2023-05-25', '2023-05-17', '2023-05-17');

-- ----------------------------
-- Table structure for dangzhibu
-- ----------------------------
DROP TABLE IF EXISTS `dangzhibu`;
CREATE TABLE `dangzhibu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhibumingcheng` varchar(200) NOT NULL COMMENT '支部名称',
  `zhibuchenglishijian` date NOT NULL COMMENT '支部成立时间',
  `zhibujieshao` longtext NOT NULL COMMENT '支部介绍',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1651817598729 DEFAULT CHARSET=utf8 COMMENT='党支部';

-- ----------------------------
-- Records of dangzhibu
-- ----------------------------
INSERT INTO `dangzhibu` VALUES ('61', '2023-05-06 14:09:58', '支部名称1', '2023-05-06', '支部介绍1');
INSERT INTO `dangzhibu` VALUES ('62', '2023-05-06 14:09:58', '支部名称2', '2023-05-06', '支部介绍2');
INSERT INTO `dangzhibu` VALUES ('63', '2023-05-06 14:09:58', '支部名称3', '2023-05-06', '支部介绍3');
INSERT INTO `dangzhibu` VALUES ('64', '2023-05-06 14:09:58', '支部名称4', '2023-05-06', '支部介绍4');
INSERT INTO `dangzhibu` VALUES ('65', '2023-05-06 14:09:58', '支部名称5', '2023-05-06', '支部介绍5');
INSERT INTO `dangzhibu` VALUES ('66', '2023-05-06 14:09:58', '支部名称6', '2023-05-06', '支部介绍6');
INSERT INTO `dangzhibu` VALUES ('1651817598728', '2023-05-06 14:13:18', 'A支部', '2023-05-03', '测试11');

-- ----------------------------
-- Table structure for gonggao
-- ----------------------------
DROP TABLE IF EXISTS `gonggao`;
CREATE TABLE `gonggao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gonggaozhuti` varchar(200) NOT NULL COMMENT '公告主题',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `xiangqing` longtext COMMENT '详情',
  `fujian` varchar(200) NOT NULL COMMENT '附件',
  `zhibuzhanghao` varchar(200) DEFAULT NULL COMMENT '支部账号',
  `weiyuanxingming` varchar(200) DEFAULT NULL COMMENT '委员姓名',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `zhibumingcheng` varchar(200) DEFAULT NULL COMMENT '支部名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='公告';

-- ----------------------------
-- Records of gonggao
-- ----------------------------
INSERT INTO `gonggao` VALUES ('101', '2023-05-06 14:09:58', '公告主题1', '2023-05-06 14:09:58', '详情1', '', '支部账号1', '委员姓名1', '联系电话1', '支部名称1');
INSERT INTO `gonggao` VALUES ('102', '2023-05-06 14:09:58', '公告主题2', '2023-05-06 14:09:58', '详情2', '', '支部账号2', '委员姓名2', '联系电话2', '支部名称2');
INSERT INTO `gonggao` VALUES ('103', '2023-05-06 14:09:58', '公告主题3', '2023-05-06 14:09:58', '详情3', '', '支部账号3', '委员姓名3', '联系电话3', '支部名称3');
INSERT INTO `gonggao` VALUES ('104', '2023-05-06 14:09:59', '公告主题4', '2023-05-06 14:09:59', '详情4', '', '支部账号4', '委员姓名4', '联系电话4', '支部名称4');
INSERT INTO `gonggao` VALUES ('105', '2023-05-06 14:09:59', '公告主题5', '2023-05-06 14:09:59', '详情5', '', '支部账号5', '委员姓名5', '联系电话5', '支部名称5');
INSERT INTO `gonggao` VALUES ('106', '2023-05-06 14:09:59', '公告主题6', '2023-05-06 14:09:59', '详情6', '', '支部账号6', '委员姓名6', '联系电话6', '支部名称6');

-- ----------------------------
-- Table structure for lishidangyuan
-- ----------------------------
DROP TABLE IF EXISTS `lishidangyuan`;
CREATE TABLE `lishidangyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhibumingcheng` varchar(200) DEFAULT NULL COMMENT '支部名称',
  `shenfen` varchar(200) DEFAULT NULL COMMENT '身份',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `minzu` varchar(200) DEFAULT NULL COMMENT '民族',
  `jiguan` varchar(200) DEFAULT NULL COMMENT '籍贯',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `shenfenzhenghao` varchar(200) DEFAULT NULL COMMENT '身份证号',
  `zhibuzhanghao` varchar(200) DEFAULT NULL COMMENT '支部账号',
  `weiyuanxingming` varchar(200) DEFAULT NULL COMMENT '委员姓名',
  `zhuanchushijian` datetime DEFAULT NULL COMMENT '转出时间',
  `crossuserid` bigint(20) DEFAULT NULL COMMENT '跨表用户id',
  `crossrefid` bigint(20) DEFAULT NULL COMMENT '跨表主键id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1651817864068 DEFAULT CHARSET=utf8 COMMENT='历史党员';

-- ----------------------------
-- Records of lishidangyuan
-- ----------------------------
INSERT INTO `lishidangyuan` VALUES ('51', '2023-05-06 14:09:58', '支部名称1', '身份1', '学号1', '姓名1', '班级1', '性别1', '民族1', '籍贯1', 'upload/lishidangyuan_touxiang1.jpg', '身份证号1', '支部账号1', '委员姓名1', '2023-05-06 14:09:58', '1', '1');
INSERT INTO `lishidangyuan` VALUES ('52', '2023-05-06 14:09:58', '支部名称2', '身份2', '学号2', '姓名2', '班级2', '性别2', '民族2', '籍贯2', 'upload/lishidangyuan_touxiang2.jpg', '身份证号2', '支部账号2', '委员姓名2', '2023-05-06 14:09:58', '2', '2');
INSERT INTO `lishidangyuan` VALUES ('53', '2023-05-06 14:09:58', '支部名称3', '身份3', '学号3', '姓名3', '班级3', '性别3', '民族3', '籍贯3', 'upload/lishidangyuan_touxiang3.jpg', '身份证号3', '支部账号3', '委员姓名3', '2023-05-06 14:09:58', '3', '3');
INSERT INTO `lishidangyuan` VALUES ('54', '2023-05-06 14:09:58', '支部名称4', '身份4', '学号4', '姓名4', '班级4', '性别4', '民族4', '籍贯4', 'upload/lishidangyuan_touxiang4.jpg', '身份证号4', '支部账号4', '委员姓名4', '2023-05-06 14:09:58', '4', '4');
INSERT INTO `lishidangyuan` VALUES ('55', '2023-05-06 14:09:58', '支部名称5', '身份5', '学号5', '姓名5', '班级5', '性别5', '民族5', '籍贯5', 'upload/lishidangyuan_touxiang5.jpg', '身份证号5', '支部账号5', '委员姓名5', '2023-05-06 14:09:58', '5', '5');
INSERT INTO `lishidangyuan` VALUES ('56', '2023-05-06 14:09:58', '支部名称6', '身份6', '学号6', '姓名6', '班级6', '性别6', '民族6', '籍贯6', 'upload/lishidangyuan_touxiang6.jpg', '身份证号6', '支部账号6', '委员姓名6', '2023-05-06 14:09:58', '6', '6');
INSERT INTO `lishidangyuan` VALUES ('1651817864067', '2023-05-06 14:17:43', 'A支部', '预备党员', '222', '姓名1', '班级1', '男', '民族1', '籍贯1', 'upload/yonghu_touxiang1.jpg', '440300199101010001', '111', '委员姓名1', '2023-05-06 14:17:43', '1', '1651817737361');

-- ----------------------------
-- Table structure for lishidangzhibu
-- ----------------------------
DROP TABLE IF EXISTS `lishidangzhibu`;
CREATE TABLE `lishidangzhibu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhibumingcheng` varchar(200) DEFAULT NULL COMMENT '支部名称',
  `zhibuchenglishijian` varchar(200) DEFAULT NULL COMMENT '支部成立时间',
  `jiesanshijian` date DEFAULT NULL COMMENT '解散时间',
  `zhibujieshao` longtext COMMENT '支部介绍',
  `crossuserid` bigint(20) DEFAULT NULL COMMENT '跨表用户id',
  `crossrefid` bigint(20) DEFAULT NULL COMMENT '跨表主键id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1651817607906 DEFAULT CHARSET=utf8 COMMENT='历史党支部';

-- ----------------------------
-- Records of lishidangzhibu
-- ----------------------------
INSERT INTO `lishidangzhibu` VALUES ('71', '2023-05-06 14:09:58', '支部名称1', '支部成立时间1', '2023-05-06', '支部介绍1', '1', '1');
INSERT INTO `lishidangzhibu` VALUES ('72', '2023-05-06 14:09:58', '支部名称2', '支部成立时间2', '2023-05-06', '支部介绍2', '2', '2');
INSERT INTO `lishidangzhibu` VALUES ('73', '2023-05-06 14:09:58', '支部名称3', '支部成立时间3', '2023-05-06', '支部介绍3', '3', '3');
INSERT INTO `lishidangzhibu` VALUES ('74', '2023-05-06 14:09:58', '支部名称4', '支部成立时间4', '2023-05-06', '支部介绍4', '4', '4');
INSERT INTO `lishidangzhibu` VALUES ('75', '2023-05-06 14:09:58', '支部名称5', '支部成立时间5', '2023-05-06', '支部介绍5', '5', '5');
INSERT INTO `lishidangzhibu` VALUES ('76', '2023-05-06 14:09:58', '支部名称6', '支部成立时间6', '2023-05-06', '支部介绍6', '6', '6');
INSERT INTO `lishidangzhibu` VALUES ('1651817607905', '2023-05-06 14:13:27', 'A支部', '2023-05-03', '2023-05-06', '测试11', '1', '1651817598728');

-- ----------------------------
-- Table structure for shenqingyijiao
-- ----------------------------
DROP TABLE IF EXISTS `shenqingyijiao`;
CREATE TABLE `shenqingyijiao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shiwuzhuti` varchar(200) DEFAULT NULL COMMENT '事务主题',
  `shenqingyuanyou` longtext COMMENT '申请缘由',
  `fujian` varchar(200) DEFAULT NULL COMMENT '附件',
  `yijiaoshijian` datetime DEFAULT NULL COMMENT '移交时间',
  `zhibuzhanghao` varchar(200) DEFAULT NULL COMMENT '支部账号',
  `zhibumingcheng` varchar(200) DEFAULT NULL COMMENT '支部名称',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `crossuserid` bigint(20) DEFAULT NULL COMMENT '跨表用户id',
  `crossrefid` bigint(20) DEFAULT NULL COMMENT '跨表主键id',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1651817783606 DEFAULT CHARSET=utf8 COMMENT='申请移交';

-- ----------------------------
-- Records of shenqingyijiao
-- ----------------------------
INSERT INTO `shenqingyijiao` VALUES ('121', '2023-05-06 14:09:59', '事务主题1', '申请缘由1', '', '2023-05-06 14:09:59', '支部账号1', '支部名称1', '学号1', '姓名1', '联系方式1', '班级1', '1', '1', '是', '');
INSERT INTO `shenqingyijiao` VALUES ('122', '2023-05-06 14:09:59', '事务主题2', '申请缘由2', '', '2023-05-06 14:09:59', '支部账号2', '支部名称2', '学号2', '姓名2', '联系方式2', '班级2', '2', '2', '是', '');
INSERT INTO `shenqingyijiao` VALUES ('123', '2023-05-06 14:09:59', '事务主题3', '申请缘由3', '', '2023-05-06 14:09:59', '支部账号3', '支部名称3', '学号3', '姓名3', '联系方式3', '班级3', '3', '3', '是', '');
INSERT INTO `shenqingyijiao` VALUES ('124', '2023-05-06 14:09:59', '事务主题4', '申请缘由4', '', '2023-05-06 14:09:59', '支部账号4', '支部名称4', '学号4', '姓名4', '联系方式4', '班级4', '4', '4', '是', '');
INSERT INTO `shenqingyijiao` VALUES ('125', '2023-05-06 14:09:59', '事务主题5', '申请缘由5', '', '2023-05-06 14:09:59', '支部账号5', '支部名称5', '学号5', '姓名5', '联系方式5', '班级5', '5', '5', '是', '');
INSERT INTO `shenqingyijiao` VALUES ('126', '2023-05-06 14:09:59', '事务主题6', '申请缘由6', '', '2023-05-06 14:09:59', '支部账号6', '支部名称6', '学号6', '姓名6', '联系方式6', '班级6', '6', '6', '是', '');
INSERT INTO `shenqingyijiao` VALUES ('1651817783605', '2023-05-06 14:16:23', '事务申请11', '事务申请11事务申请11', 'upload/1651817696875.docx', '2023-05-06 14:16:23', '111', 'A支部', '222', '姓名1', '13823888881', '班级1', '21', '1651817699389', '是', '11');

-- ----------------------------
-- Table structure for shiwushenqing
-- ----------------------------
DROP TABLE IF EXISTS `shiwushenqing`;
CREATE TABLE `shiwushenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shiwuzhuti` varchar(200) NOT NULL COMMENT '事务主题',
  `shenqingyuanyou` longtext NOT NULL COMMENT '申请缘由',
  `fujian` varchar(200) NOT NULL COMMENT '附件',
  `shenqingshijian` datetime DEFAULT NULL COMMENT '申请时间',
  `zhibuzhanghao` varchar(200) DEFAULT NULL COMMENT '支部账号',
  `zhibumingcheng` varchar(200) DEFAULT NULL COMMENT '支部名称',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1651817699390 DEFAULT CHARSET=utf8 COMMENT='事务申请';

-- ----------------------------
-- Records of shiwushenqing
-- ----------------------------
INSERT INTO `shiwushenqing` VALUES ('111', '2023-05-06 14:09:59', '事务主题1', '申请缘由1', '', '2023-05-06 14:09:59', '支部账号1', '支部名称1', '学号1', '姓名1', '联系方式1', '班级1', '是', '');
INSERT INTO `shiwushenqing` VALUES ('112', '2023-05-06 14:09:59', '事务主题2', '申请缘由2', '', '2023-05-06 14:09:59', '支部账号2', '支部名称2', '学号2', '姓名2', '联系方式2', '班级2', '是', '');
INSERT INTO `shiwushenqing` VALUES ('113', '2023-05-06 14:09:59', '事务主题3', '申请缘由3', '', '2023-05-06 14:09:59', '支部账号3', '支部名称3', '学号3', '姓名3', '联系方式3', '班级3', '是', '');
INSERT INTO `shiwushenqing` VALUES ('114', '2023-05-06 14:09:59', '事务主题4', '申请缘由4', '', '2023-05-06 14:09:59', '支部账号4', '支部名称4', '学号4', '姓名4', '联系方式4', '班级4', '是', '');
INSERT INTO `shiwushenqing` VALUES ('115', '2023-05-06 14:09:59', '事务主题5', '申请缘由5', '', '2023-05-06 14:09:59', '支部账号5', '支部名称5', '学号5', '姓名5', '联系方式5', '班级5', '是', '');
INSERT INTO `shiwushenqing` VALUES ('116', '2023-05-06 14:09:59', '事务主题6', '申请缘由6', '', '2023-05-06 14:09:59', '支部账号6', '支部名称6', '学号6', '姓名6', '联系方式6', '班级6', '是', '');
INSERT INTO `shiwushenqing` VALUES ('1651817699389', '2023-05-06 14:14:59', '事务申请11', '事务申请11事务申请11', 'upload/1651817696875.docx', '2023-05-06 14:14:51', '111', 'A支部', '222', '姓名1', '13823888881', '班级1', '是', '通过11');

-- ----------------------------
-- Table structure for token
-- ----------------------------
DROP TABLE IF EXISTS `token`;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';

-- ----------------------------
-- Records of token
-- ----------------------------
INSERT INTO `token` VALUES ('1', '1', 'abo', 'users', '管理员', 'ff0cqxd4ur7gdlpowdgb8b486glcru78', '2023-05-06 14:12:25', '2023-08-13 01:24:43');
INSERT INTO `token` VALUES ('2', '11', '222', 'yonghu', '用户', '0p3uoa9k23b9g100h0len06nowk9fw5b', '2023-05-06 14:14:44', '2023-05-06 15:16:55');
INSERT INTO `token` VALUES ('3', '21', '111', 'zhibuweiyuan', '支部委员', 'ro8nawcs5is7hnj7ug4tw6j8ujbhljqm', '2023-05-06 14:15:26', '2023-05-06 15:15:26');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'abo', 'abo', '管理员', '2023-05-06 14:09:59');

-- ----------------------------
-- Table structure for yonghu
-- ----------------------------
DROP TABLE IF EXISTS `yonghu`;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) NOT NULL COMMENT '学号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `minzu` varchar(200) DEFAULT NULL COMMENT '民族',
  `jiguan` varchar(200) DEFAULT NULL COMMENT '籍贯',
  `shenfenzhenghao` varchar(200) DEFAULT NULL COMMENT '身份证号',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xuehao` (`xuehao`)
) ENGINE=InnoDB AUTO_INCREMENT=1651817929183 DEFAULT CHARSET=utf8 COMMENT='用户';

-- ----------------------------
-- Records of yonghu
-- ----------------------------
INSERT INTO `yonghu` VALUES ('1651817928557', '2023-05-06 14:18:48', '学号1', '123456', '姓名1', '男', '13899999999', '班级1', '民族1', '籍贯1', '441455555555555551', 'upload/1651817935231.jpg');
INSERT INTO `yonghu` VALUES ('1651817928608', '2023-05-06 14:18:48', '学号2', '123456', '姓名2', '女', '联系方式2', '班级2', '民族2', '籍贯2', '身份证号2', null);
INSERT INTO `yonghu` VALUES ('1651817928918', '2023-05-06 14:18:48', '学号4', '123456', '姓名4', '女', '联系方式4', '班级4', '民族4', '籍贯4', '身份证号4', null);
INSERT INTO `yonghu` VALUES ('1651817929130', '2023-05-06 14:18:48', '学号3', '123456', '姓名3', '女', '联系方式3', '班级3', '民族3', '籍贯3', '身份证号3', null);
INSERT INTO `yonghu` VALUES ('1651817929182', '2023-05-06 14:18:48', '学号5', '123456', '姓名5', '男', '联系方式5', '班级5', '民族5', '籍贯5', '身份证号5', null);

-- ----------------------------
-- Table structure for zhibugongzuohuodong
-- ----------------------------
DROP TABLE IF EXISTS `zhibugongzuohuodong`;
CREATE TABLE `zhibugongzuohuodong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gongzuohuodongzhuti` varchar(200) NOT NULL COMMENT '工作活动主题',
  `gongzuohuodongshijian` date NOT NULL COMMENT '工作活动时间',
  `zhuchiren` varchar(200) NOT NULL COMMENT '主持人',
  `tupian` varchar(200) NOT NULL COMMENT '图片',
  `fujian` varchar(200) NOT NULL COMMENT '附件',
  `leixing` varchar(200) NOT NULL COMMENT '类型',
  `xiangqing` longtext COMMENT '详情',
  `zhibuzhanghao` varchar(200) DEFAULT NULL COMMENT '支部账号',
  `weiyuanxingming` varchar(200) DEFAULT NULL COMMENT '委员姓名',
  `zhibumingcheng` varchar(200) DEFAULT NULL COMMENT '支部名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1651817761676 DEFAULT CHARSET=utf8 COMMENT='支部工作活动';

-- ----------------------------
-- Records of zhibugongzuohuodong
-- ----------------------------
INSERT INTO `zhibugongzuohuodong` VALUES ('81', '2023-05-06 14:09:58', '工作活动主题1', '2023-05-06', '主持人1', 'upload/zhibugongzuohuodong_tupian1.jpg', '', '支部工作', '详情1', '支部账号1', '委员姓名1', '支部名称1');
INSERT INTO `zhibugongzuohuodong` VALUES ('82', '2023-05-06 14:09:58', '工作活动主题2', '2023-05-06', '主持人2', 'upload/zhibugongzuohuodong_tupian2.jpg', '', '支部工作', '详情2', '支部账号2', '委员姓名2', '支部名称2');
INSERT INTO `zhibugongzuohuodong` VALUES ('83', '2023-05-06 14:09:58', '工作活动主题3', '2023-05-06', '主持人3', 'upload/zhibugongzuohuodong_tupian3.jpg', '', '支部工作', '详情3', '支部账号3', '委员姓名3', '支部名称3');
INSERT INTO `zhibugongzuohuodong` VALUES ('84', '2023-05-06 14:09:58', '工作活动主题4', '2023-05-06', '主持人4', 'upload/zhibugongzuohuodong_tupian4.jpg', '', '支部工作', '详情4', '支部账号4', '委员姓名4', '支部名称4');
INSERT INTO `zhibugongzuohuodong` VALUES ('85', '2023-05-06 14:09:58', '工作活动主题5', '2023-05-06', '主持人5', 'upload/zhibugongzuohuodong_tupian5.jpg', '', '支部工作', '详情5', '支部账号5', '委员姓名5', '支部名称5');
INSERT INTO `zhibugongzuohuodong` VALUES ('86', '2023-05-06 14:09:58', '工作活动主题6', '2023-05-06', '主持人6', 'upload/zhibugongzuohuodong_tupian6.jpg', '', '支部工作', '详情6', '支部账号6', '委员姓名6', '支部名称6');
INSERT INTO `zhibugongzuohuodong` VALUES ('1651817761675', '2023-05-06 14:16:01', '测试测试', '2023-05-17', '测试', 'upload/1651817754774.jpg', 'upload/1651817756825.docx', '支部工作', '<h1>测试测试测试</h1><p>测试测试</p>', '111', '委员姓名1', 'A支部');

-- ----------------------------
-- Table structure for zhibuweiyuan
-- ----------------------------
DROP TABLE IF EXISTS `zhibuweiyuan`;
CREATE TABLE `zhibuweiyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhibuzhanghao` varchar(200) NOT NULL COMMENT '支部账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `weiyuanxingming` varchar(200) DEFAULT NULL COMMENT '委员姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `zhiwu` varchar(200) DEFAULT NULL COMMENT '职务',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `zhibumingcheng` varchar(200) NOT NULL COMMENT '支部名称',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhibuzhanghao` (`zhibuzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='支部委员';

-- ----------------------------
-- Records of zhibuweiyuan
-- ----------------------------
INSERT INTO `zhibuweiyuan` VALUES ('21', '2023-05-06 14:09:58', '111', '111', '委员姓名1', '男', '职务1', '13823888881', '773890001@qq.com', 'A支部');
INSERT INTO `zhibuweiyuan` VALUES ('22', '2023-05-06 14:09:58', '支部账号2', '123456', '委员姓名2', '男', '职务2', '13823888882', '773890002@qq.com', '支部名称2');
INSERT INTO `zhibuweiyuan` VALUES ('23', '2023-05-06 14:09:58', '支部账号3', '123456', '委员姓名3', '男', '职务3', '13823888883', '773890003@qq.com', '支部名称3');
INSERT INTO `zhibuweiyuan` VALUES ('24', '2023-05-06 14:09:58', '支部账号4', '123456', '委员姓名4', '男', '职务4', '13823888884', '773890004@qq.com', '支部名称4');
INSERT INTO `zhibuweiyuan` VALUES ('25', '2023-05-06 14:09:58', '支部账号5', '123456', '委员姓名5', '男', '职务5', '13823888885', '773890005@qq.com', '支部名称5');
INSERT INTO `zhibuweiyuan` VALUES ('26', '2023-05-06 14:09:58', '支部账号6', '123456', '委员姓名6', '男', '职务6', '13823888886', '773890006@qq.com', '支部名称6');

-- ----------------------------
-- Table structure for zhuanchushenqing
-- ----------------------------
DROP TABLE IF EXISTS `zhuanchushenqing`;
CREATE TABLE `zhuanchushenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhibumingcheng` varchar(200) DEFAULT NULL COMMENT '支部名称',
  `shenfen` varchar(200) DEFAULT NULL COMMENT '身份',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `minzu` varchar(200) DEFAULT NULL COMMENT '民族',
  `jiguan` varchar(200) DEFAULT NULL COMMENT '籍贯',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `shenfenzhenghao` varchar(200) DEFAULT NULL COMMENT '身份证号',
  `zhibuzhanghao` varchar(200) DEFAULT NULL COMMENT '支部账号',
  `weiyuanxingming` varchar(200) DEFAULT NULL COMMENT '委员姓名',
  `shenqingshijian` datetime DEFAULT NULL COMMENT '申请时间',
  `shenqingneirong` longtext COMMENT '申请内容',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1651817737362 DEFAULT CHARSET=utf8 COMMENT='转出申请';

-- ----------------------------
-- Records of zhuanchushenqing
-- ----------------------------
INSERT INTO `zhuanchushenqing` VALUES ('41', '2023-05-06 14:09:58', '支部名称1', '身份1', '学号1', '姓名1', '班级1', '性别1', '民族1', '籍贯1', 'upload/zhuanchushenqing_touxiang1.jpg', '身份证号1', '支部账号1', '委员姓名1', '2023-05-06 14:09:58', '申请内容1', '是', '');
INSERT INTO `zhuanchushenqing` VALUES ('42', '2023-05-06 14:09:58', '支部名称2', '身份2', '学号2', '姓名2', '班级2', '性别2', '民族2', '籍贯2', 'upload/zhuanchushenqing_touxiang2.jpg', '身份证号2', '支部账号2', '委员姓名2', '2023-05-06 14:09:58', '申请内容2', '是', '');
INSERT INTO `zhuanchushenqing` VALUES ('43', '2023-05-06 14:09:58', '支部名称3', '身份3', '学号3', '姓名3', '班级3', '性别3', '民族3', '籍贯3', 'upload/zhuanchushenqing_touxiang3.jpg', '身份证号3', '支部账号3', '委员姓名3', '2023-05-06 14:09:58', '申请内容3', '是', '');
INSERT INTO `zhuanchushenqing` VALUES ('44', '2023-05-06 14:09:58', '支部名称4', '身份4', '学号4', '姓名4', '班级4', '性别4', '民族4', '籍贯4', 'upload/zhuanchushenqing_touxiang4.jpg', '身份证号4', '支部账号4', '委员姓名4', '2023-05-06 14:09:58', '申请内容4', '是', '');
INSERT INTO `zhuanchushenqing` VALUES ('45', '2023-05-06 14:09:58', '支部名称5', '身份5', '学号5', '姓名5', '班级5', '性别5', '民族5', '籍贯5', 'upload/zhuanchushenqing_touxiang5.jpg', '身份证号5', '支部账号5', '委员姓名5', '2023-05-06 14:09:58', '申请内容5', '是', '');
INSERT INTO `zhuanchushenqing` VALUES ('46', '2023-05-06 14:09:58', '支部名称6', '身份6', '学号6', '姓名6', '班级6', '性别6', '民族6', '籍贯6', 'upload/zhuanchushenqing_touxiang6.jpg', '身份证号6', '支部账号6', '委员姓名6', '2023-05-06 14:09:58', '申请内容6', '是', '');
INSERT INTO `zhuanchushenqing` VALUES ('1651817737361', '2023-05-06 14:15:36', 'A支部', '预备党员', '222', '姓名1', '班级1', '男', '民族1', '籍贯1', 'upload/yonghu_touxiang1.jpg', '440300199101010001', '111', '委员姓名1', '2023-05-06 14:15:33', '转出11', '是', '转出成功');
