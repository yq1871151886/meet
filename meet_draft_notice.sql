/*
Navicat MySQL Data Transfer

Source Server         : 193.168.5.144_3306
Source Server Version : 50528
Source Host           : 193.168.5.144:3306
Source Database       : meet

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2020-01-07 22:43:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `meet_draft_notice`
-- ----------------------------
DROP TABLE IF EXISTS `meet_draft_notice`;
CREATE TABLE `meet_draft_notice` (
  `draftNoticeId` int(11) NOT NULL AUTO_INCREMENT COMMENT '起草通知ID',
  `headline` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '标题',
  `noticeTheTemplate` int(3) DEFAULT NULL COMMENT '通知模板 1：取急件通知 2：一般通知模板（有文号） 3：一般通知模板（无文号）',
  `feedback` int(3) DEFAULT NULL COMMENT '是否需要反馈 1：是 2：否',
  `dispatchTime` datetime DEFAULT NULL COMMENT '取急件时间',
  `linkman` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '取急件联系人',
  `content` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '内容',
  `accessory` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '附件',
  `unitId` int(11) DEFAULT NULL COMMENT '接收单位',
  PRIMARY KEY (`draftNoticeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of meet_draft_notice
-- ----------------------------

-- ----------------------------
-- Table structure for `meet_institutional_framework`
-- ----------------------------
DROP TABLE IF EXISTS `meet_institutional_framework`;
CREATE TABLE `meet_institutional_framework` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '组织机构ID',
  `organization` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '组织机构',
  `pid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of meet_institutional_framework
-- ----------------------------
INSERT INTO `meet_institutional_framework` VALUES ('1', '市政府办公厅', '0');
INSERT INTO `meet_institutional_framework` VALUES ('2', '特设机构', '1');
INSERT INTO `meet_institutional_framework` VALUES ('3', '直属机构', '1');
INSERT INTO `meet_institutional_framework` VALUES ('4', '议事协调机构', '1');
INSERT INTO `meet_institutional_framework` VALUES ('5', '部门管理机构', '1');
INSERT INTO `meet_institutional_framework` VALUES ('6', '其他', '1');
INSERT INTO `meet_institutional_framework` VALUES ('7', '公司', '1');
INSERT INTO `meet_institutional_framework` VALUES ('8', '区县政府', '1');
INSERT INTO `meet_institutional_framework` VALUES ('9', '部委办', '1');
INSERT INTO `meet_institutional_framework` VALUES ('10', '工作部门', '1');
INSERT INTO `meet_institutional_framework` VALUES ('11', '区县委', '1');
INSERT INTO `meet_institutional_framework` VALUES ('12', '东城区委', '11');
INSERT INTO `meet_institutional_framework` VALUES ('13', '东城区委管理员', '12');
INSERT INTO `meet_institutional_framework` VALUES ('14', '西城区委', '11');
INSERT INTO `meet_institutional_framework` VALUES ('15', '西城区委管理员', '14');
INSERT INTO `meet_institutional_framework` VALUES ('16', '朝阳区委', '11');
INSERT INTO `meet_institutional_framework` VALUES ('17', '海淀区委', '11');
INSERT INTO `meet_institutional_framework` VALUES ('18', '朝阳区委管理员', '16');
INSERT INTO `meet_institutional_framework` VALUES ('19', '海淀区委管理员', '17');

-- ----------------------------
-- Table structure for `meet_meeting_registration`
-- ----------------------------
DROP TABLE IF EXISTS `meet_meeting_registration`;
CREATE TABLE `meet_meeting_registration` (
  `regularMeetingId` int(11) NOT NULL AUTO_INCREMENT COMMENT '例会ID',
  `meetingId` int(11) DEFAULT NULL COMMENT '会议类型ID',
  `meetingTime` datetime DEFAULT NULL COMMENT '会议时间',
  `securityClassification` int(3) DEFAULT NULL COMMENT '密级',
  `emcee` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '主持人',
  `venueId` int(11) DEFAULT NULL COMMENT '会议地点',
  `undertaker` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '承办人',
  `notification` int(3) DEFAULT NULL COMMENT '是否发送通知1：是 2：否',
  `feedbackTime` datetime DEFAULT NULL COMMENT '反馈时间',
  `materialNote` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '材料备注',
  `topicId` int(11) DEFAULT NULL COMMENT '议题名称ID',
  `reporter` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '汇报人',
  `meetingMaterial` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '会议材料',
  `userId` int(11) DEFAULT NULL COMMENT '参加议题讨论人员',
  PRIMARY KEY (`regularMeetingId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of meet_meeting_registration
-- ----------------------------

-- ----------------------------
-- Table structure for `meet_meetingname`
-- ----------------------------
DROP TABLE IF EXISTS `meet_meetingname`;
CREATE TABLE `meet_meetingname` (
  `meetingId` int(11) NOT NULL AUTO_INCREMENT COMMENT '会议ID',
  `meetingName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '会议名称',
  PRIMARY KEY (`meetingId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of meet_meetingname
-- ----------------------------
INSERT INTO `meet_meetingname` VALUES ('1', '市政府常务会');
INSERT INTO `meet_meetingname` VALUES ('2', '市长办公会');
INSERT INTO `meet_meetingname` VALUES ('3', '市政府专题会');
INSERT INTO `meet_meetingname` VALUES ('4', '市长碰头会');
INSERT INTO `meet_meetingname` VALUES ('5', '市政府党组会');
INSERT INTO `meet_meetingname` VALUES ('6', '市政府全会');
INSERT INTO `meet_meetingname` VALUES ('7', '其他会议');
INSERT INTO `meet_meetingname` VALUES ('8', '电视电话会');
INSERT INTO `meet_meetingname` VALUES ('9', '以市政府名义召开的大会');

-- ----------------------------
-- Table structure for `meet_permissions`
-- ----------------------------
DROP TABLE IF EXISTS `meet_permissions`;
CREATE TABLE `meet_permissions` (
  `permissionsId` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限ID',
  `permissionsName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '权限名称',
  `pid` int(11) DEFAULT NULL,
  PRIMARY KEY (`permissionsId`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of meet_permissions
-- ----------------------------
INSERT INTO `meet_permissions` VALUES ('1', '会议管理模块权限', '0');
INSERT INTO `meet_permissions` VALUES ('2', '通知下发模块权限', '0');
INSERT INTO `meet_permissions` VALUES ('3', '其他通知模块权限', '0');
INSERT INTO `meet_permissions` VALUES ('4', '基础工作数据管理模块权限', '0');
INSERT INTO `meet_permissions` VALUES ('5', '通讯录管理模块权限', '0');
INSERT INTO `meet_permissions` VALUES ('6', '会议室管理模块权限', '0');
INSERT INTO `meet_permissions` VALUES ('7', '系统管理_基础权限维护权限', '0');
INSERT INTO `meet_permissions` VALUES ('8', '会议管理_会议登记权限', '1');
INSERT INTO `meet_permissions` VALUES ('9', '会议管理_全部会议权限', '1');
INSERT INTO `meet_permissions` VALUES ('10', '会议管理_会议统计权限', '1');
INSERT INTO `meet_permissions` VALUES ('11', '通知下发_起草通知权限', '2');
INSERT INTO `meet_permissions` VALUES ('12', '通知下发_审核通知权限', '2');
INSERT INTO `meet_permissions` VALUES ('13', '通知下发_待发通知权限', '2');
INSERT INTO `meet_permissions` VALUES ('14', '通知下发_全部通知权限', '2');
INSERT INTO `meet_permissions` VALUES ('15', '通知下发_会议材料权限', '2');
INSERT INTO `meet_permissions` VALUES ('16', '其他通知_起草通知权限', '3');
INSERT INTO `meet_permissions` VALUES ('17', '其他通知_全部通知权限', '3');
INSERT INTO `meet_permissions` VALUES ('18', '其他通知_通知查询权限', '3');
INSERT INTO `meet_permissions` VALUES ('19', '会议室管理_会议室预定情况权限', '6');
INSERT INTO `meet_permissions` VALUES ('20', '会议室管理_会议室查询权限', '6');
INSERT INTO `meet_permissions` VALUES ('21', '会议室管理_会议室统计权限', '6');
INSERT INTO `meet_permissions` VALUES ('22', '会议室管理_会议室介绍权限', '6');
INSERT INTO `meet_permissions` VALUES ('23', '会议室管理_会议室类型维护权限', '6');
INSERT INTO `meet_permissions` VALUES ('24', '会议室管理_申请部门维护权限', '6');

-- ----------------------------
-- Table structure for `meet_plan_topic`
-- ----------------------------
DROP TABLE IF EXISTS `meet_plan_topic`;
CREATE TABLE `meet_plan_topic` (
  `planId` int(11) NOT NULL AUTO_INCREMENT COMMENT '计划议题ID',
  `meetingId` int(11) DEFAULT NULL COMMENT '拟上会议',
  `planTopicName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '议题名称',
  `unitId` int(11) DEFAULT NULL COMMENT '责任单位',
  `minDate` date DEFAULT NULL COMMENT '开始时间安排',
  `maxDate` date DEFAULT NULL COMMENT '结束时间',
  `issueStatus` int(3) DEFAULT NULL COMMENT '议题状态1:待上会 2：已上会 3：不上会',
  `material` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '相关材料',
  `note` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`planId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of meet_plan_topic
-- ----------------------------

-- ----------------------------
-- Table structure for `meet_role`
-- ----------------------------
DROP TABLE IF EXISTS `meet_role`;
CREATE TABLE `meet_role` (
  `roleId` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `roleName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`roleId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of meet_role
-- ----------------------------
INSERT INTO `meet_role` VALUES ('1', '日志审计员');
INSERT INTO `meet_role` VALUES ('2', '安全管理员');
INSERT INTO `meet_role` VALUES ('3', '系统管理员');
INSERT INTO `meet_role` VALUES ('4', '会议管理员');
INSERT INTO `meet_role` VALUES ('5', '会议通知管理员');
INSERT INTO `meet_role` VALUES ('6', '部分会议管理员');
INSERT INTO `meet_role` VALUES ('7', '会议室管理员');
INSERT INTO `meet_role` VALUES ('8', 'ls-测试角色');

-- ----------------------------
-- Table structure for `meet_role_permissions`
-- ----------------------------
DROP TABLE IF EXISTS `meet_role_permissions`;
CREATE TABLE `meet_role_permissions` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色和权限关联ID',
  `roleId` int(11) DEFAULT NULL COMMENT '角色ID',
  `permissionsId` int(11) DEFAULT NULL COMMENT '权限ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of meet_role_permissions
-- ----------------------------

-- ----------------------------
-- Table structure for `meet_topic_register`
-- ----------------------------
DROP TABLE IF EXISTS `meet_topic_register`;
CREATE TABLE `meet_topic_register` (
  `topicId` int(11) NOT NULL AUTO_INCREMENT COMMENT '议题ID',
  `topicTypeId` int(11) DEFAULT NULL COMMENT '议题类型ID',
  `topicName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '议题名称',
  `meetingId` int(11) DEFAULT NULL COMMENT '拟上会议',
  `undertaker` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '承办人',
  `issueStatus` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '议题状态',
  `planId` int(11) DEFAULT NULL COMMENT '计划议题',
  `issueNote` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '议题备注',
  `unitId` int(11) DEFAULT NULL COMMENT '参加单位',
  `files` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '相关文件',
  `registrant` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '登记人',
  `registrationTime` date DEFAULT NULL COMMENT '登记时间',
  PRIMARY KEY (`topicId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of meet_topic_register
-- ----------------------------

-- ----------------------------
-- Table structure for `meet_topic_type`
-- ----------------------------
DROP TABLE IF EXISTS `meet_topic_type`;
CREATE TABLE `meet_topic_type` (
  `topicTypeId` int(11) NOT NULL AUTO_INCREMENT COMMENT '议题类型ID',
  `topicTypeName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '议题类型',
  PRIMARY KEY (`topicTypeId`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of meet_topic_type
-- ----------------------------
INSERT INTO `meet_topic_type` VALUES ('1', '经济管理');
INSERT INTO `meet_topic_type` VALUES ('2', '工业');
INSERT INTO `meet_topic_type` VALUES ('3', '交通');
INSERT INTO `meet_topic_type` VALUES ('4', '能源');
INSERT INTO `meet_topic_type` VALUES ('5', '邮电');
INSERT INTO `meet_topic_type` VALUES ('6', '旅游');
INSERT INTO `meet_topic_type` VALUES ('7', '土地');
INSERT INTO `meet_topic_type` VALUES ('8', '服务业');
INSERT INTO `meet_topic_type` VALUES ('9', '城乡建设');
INSERT INTO `meet_topic_type` VALUES ('10', '环保');
INSERT INTO `meet_topic_type` VALUES ('11', '农业');
INSERT INTO `meet_topic_type` VALUES ('12', '林业');
INSERT INTO `meet_topic_type` VALUES ('13', '水利');
INSERT INTO `meet_topic_type` VALUES ('14', '气象');
INSERT INTO `meet_topic_type` VALUES ('15', '财政');
INSERT INTO `meet_topic_type` VALUES ('16', '金融');
INSERT INTO `meet_topic_type` VALUES ('17', '商业');
INSERT INTO `meet_topic_type` VALUES ('18', '外贸');
INSERT INTO `meet_topic_type` VALUES ('19', '外交');
INSERT INTO `meet_topic_type` VALUES ('20', '外事');
INSERT INTO `meet_topic_type` VALUES ('21', '公安');
INSERT INTO `meet_topic_type` VALUES ('22', '司法');
INSERT INTO `meet_topic_type` VALUES ('23', '监察');
INSERT INTO `meet_topic_type` VALUES ('24', '民政');
INSERT INTO `meet_topic_type` VALUES ('25', '机构');
INSERT INTO `meet_topic_type` VALUES ('26', '人事');
INSERT INTO `meet_topic_type` VALUES ('27', '劳动');
INSERT INTO `meet_topic_type` VALUES ('28', '工资');
INSERT INTO `meet_topic_type` VALUES ('29', '科技');
INSERT INTO `meet_topic_type` VALUES ('30', '教育');
INSERT INTO `meet_topic_type` VALUES ('31', '文化');
INSERT INTO `meet_topic_type` VALUES ('32', '卫生');
INSERT INTO `meet_topic_type` VALUES ('33', '体育');
INSERT INTO `meet_topic_type` VALUES ('34', '军事');
INSERT INTO `meet_topic_type` VALUES ('35', '文秘工作');
INSERT INTO `meet_topic_type` VALUES ('36', '行政事务');
INSERT INTO `meet_topic_type` VALUES ('37', '党派团体');
INSERT INTO `meet_topic_type` VALUES ('38', '统战');
INSERT INTO `meet_topic_type` VALUES ('39', '民族');
INSERT INTO `meet_topic_type` VALUES ('40', '宗教');
INSERT INTO `meet_topic_type` VALUES ('41', '侨务');
INSERT INTO `meet_topic_type` VALUES ('42', '港澳台');
INSERT INTO `meet_topic_type` VALUES ('43', '综合');
INSERT INTO `meet_topic_type` VALUES ('44', '安全生产');
INSERT INTO `meet_topic_type` VALUES ('45', '奥运');

-- ----------------------------
-- Table structure for `meet_unit`
-- ----------------------------
DROP TABLE IF EXISTS `meet_unit`;
CREATE TABLE `meet_unit` (
  `unitId` int(11) NOT NULL AUTO_INCREMENT COMMENT '单位ID',
  `unitName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '单位名称',
  PRIMARY KEY (`unitId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of meet_unit
-- ----------------------------
INSERT INTO `meet_unit` VALUES ('1', '奥运办事处');
INSERT INTO `meet_unit` VALUES ('2', '西城区政府');
INSERT INTO `meet_unit` VALUES ('3', '东城区政府');
INSERT INTO `meet_unit` VALUES ('4', '朝阳区政府');
INSERT INTO `meet_unit` VALUES ('5', '海淀区政府');
INSERT INTO `meet_unit` VALUES ('6', '昌平区政府');
INSERT INTO `meet_unit` VALUES ('7', '顺义区政府');

-- ----------------------------
-- Table structure for `meet_user`
-- ----------------------------
DROP TABLE IF EXISTS `meet_user`;
CREATE TABLE `meet_user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `loginName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '登录名称',
  `userName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户名称',
  `passWord` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户密码',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of meet_user
-- ----------------------------

-- ----------------------------
-- Table structure for `meet_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `meet_user_role`;
CREATE TABLE `meet_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户和角色关联ID',
  `roleId` int(11) DEFAULT NULL COMMENT '角色ID',
  `userId` int(11) DEFAULT NULL COMMENT '用户ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of meet_user_role
-- ----------------------------

-- ----------------------------
-- Table structure for `meet_venue`
-- ----------------------------
DROP TABLE IF EXISTS `meet_venue`;
CREATE TABLE `meet_venue` (
  `venueId` int(11) NOT NULL AUTO_INCREMENT COMMENT '会议地址ID',
  `venueName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '会议地址',
  `
roomNumber` int(11) DEFAULT NULL COMMENT '房间号',
  `seating` int(30) DEFAULT NULL COMMENT '标准座位数',
  `maxSeating` int(30) DEFAULT NULL COMMENT '最多座位数',
  `equipment` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '会议室功能',
  `other` longtext COLLATE utf8_unicode_ci COMMENT '其他说明',
  PRIMARY KEY (`venueId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of meet_venue
-- ----------------------------
INSERT INTO `meet_venue` VALUES ('1', '1号楼电视电话会议', null, null, null, null, null);
INSERT INTO `meet_venue` VALUES ('2', '市政府5号大楼会议室', null, null, null, null, null);
INSERT INTO `meet_venue` VALUES ('3', '市政府北楼一会议室', null, null, null, null, null);
INSERT INTO `meet_venue` VALUES ('4', '市政府北楼29会议室', null, null, null, null, null);
INSERT INTO `meet_venue` VALUES ('5', '市政府5号楼103会议室', null, null, null, null, null);
INSERT INTO `meet_venue` VALUES ('6', '市政府5号楼106会议室', null, null, null, null, null);
INSERT INTO `meet_venue` VALUES ('7', '北京会议中心二层十九会议室', null, null, null, null, null);
