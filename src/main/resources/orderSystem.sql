create database orderSystem;

use orderSystem;

--用户管理

--------------------
--1、用户表
--------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL COMMENT '用户名',
  `password` varchar(32) NOT NULL COMMENT '密码，加密存储',
  `nickname` varchar(20) NOT NULL COMMENT '昵称',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `created` datetime NOT NULL COMMENT '创建时间',
  `updated` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`) ,
  UNIQUE KEY `phone` (`phone`) ,
  UNIQUE KEY `email` (`email`) 
) ENGINE=InnoDB CHARSET=utf8 COMMENT='用户表';
INSERT INTO `user` VALUES(1,'admin','21232f297a57a5a743894a0e4a801fc3','shizumine','13805927313','610801272@qq.com','2018-03-30 17:03:55','2018-03-30 17:03:55');

--------------------
--2、角色表
--------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
	`id` int NOT NULL AUTO_INCREMENT,
	`name` varchar(50) NOT NULL COMMENT '角色名称',
	`description` varchar(255) DEFAULT NULL COMMENT '角色描述',
	PRIMARY KEY (`id`),
	UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB CHARSET=utf8 COMMENT='角色表';

INSERT INTO `role` VALUES(1,'后台管理员','能进行所有操作');
INSERT INTO `role` VALUES(2,'顾客','订餐，订座，注册默认设置为顾客');

--------------------
--3、权限表
--------------------
DROP TABLE IF EXISTS `authority`;
CREATE TABLE `authority`(
	`id` int NOT NULL AUTO_INCREMENT,
	`name` varchar(20) NOT NULL COMMENT '权限名称',
	`url` varchar(255) NOT NULL COMMENT '权限地址',
	`description` varchar(255) DEFAULT NULL COMMENT '权限描述',
	PRIMARY KEY(`id`),
	UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB CHARSET=utf8 COMMENT='权限表';

--------------------
--4、用户角色表
--------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`(
	`id` int NOT NULL AUTO_INCREMENT,
	`uid` int NOT NULL,
	`rid` int NOT NULL,
	PRIMARY KEY(`id`),
	CONSTRAINT user_role_fk1 FOREIGN KEY(`uid`) REFERENCES user(`id`),
	CONSTRAINT user_role_fk2 FOREIGN KEY(`rid`) REFERENCES role(`id`)
) ENGINE=InnoDB CHARSET=utf8 COMMENT='用户角色表';

--------------------
--5、角色权限表
--------------------
DROP TABLE IF EXISTS `role_authority`;
CREATE TABLE `role_authority`(
	`id` int NOT NULL AUTO_INCREMENT,
	`rid` int NOT NULL,
	`aid` int NOT NULL,
	PRIMARY KEY(`id`),
	CONSTRAINT role_authority_fk1 FOREIGN KEY(`aid`) REFERENCES authority(`id`),
	CONSTRAINT role_authority_fk2 FOREIGN KEY(`rid`) REFERENCES role(`id`)
);

--/用户管理

--菜品管理


--------------------
--1、菜品种类
--------------------
CREATE TABLE `item_type`(
	`id` int NOT NULL AUTO_INCREMENT COMMENT '菜品种类编号',
	`name` varchar(20) NOT NULL COMMENT '菜品种类名称',
	PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜品种类表';

INSERT INTO `item_type` VALUES(1,'主食类');
INSERT INTO `item_type` VALUES(2,'炒菜类');
INSERT INTO `item_type` VALUES(3,'凉菜');
INSERT INTO `item_type` VALUES(4,'汤类');
INSERT INTO `item_type` VALUES(5,'饮料类');

--------------------
--2、菜品表
--------------------
CREATE TABLE `item`(
	`id` int NOT NULL AUTO_INCREMENT,
	`name` varchar(20) NOT NULL COMMENT '菜品名称',
	`discount` int DEFAULT NULL COMMENT '折扣 1-9折',
	`price` float(5,2) NOT NULL COMMENT '价格',
	`vipprice` float(5,2) NOT NULL COMMENT '会员价',
	`cost` float(5,2) NOT NULL COMMENT '成本',
	`sale` int DEFAULT NULL COMMENT '销售数量',
	`filename` varchar(255) DEFAULT NULL COMMENT '图片文件名称',
	`path` varchar(255) DEFAULT NULL COMMENT '图片文件地址',
	PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜品表';

------------------------------------
--3、菜品菜品种类关联表 多对多
------------------------------------
CREATE TABLE `item_item_type`(
	`id` int NOT NULL AUTO_INCREMENT,
	`typeId` int NOT NULL COMMENT '菜品种类编号',
	`itemId` int NOT NULL COMMENT '菜品编号',
	PRIMARY KEY(`id`),
	CONSTRAINT item_item_type_fk1 FOREIGN KEY(typeId) REFERENCES item_type(id),
	CONSTRAINT item_item_type_fk2 FOREIGN KEY(itemId) REFERENCES item(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜品菜品种类关联表';

INSERT INTO `item_item_type` VALUES(1,2,1);
--------------------
--4、配料表
--------------------
CREATE TABLE `item_material`(
	`id` int NOT NULL AUTO_INCREMENT,
	`name` varchar(20) NOT NULL COMMENT '配料名称',
	`stock` int NOT NULL COMMENT '库存',
	`unit` varchar(10) NOT NULL COMMENT '单位',
	`price` float(5,2) NOT NULL COMMENT '单价',
	PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='配料表';

INSERT INTO `item_material` VALUES (1,'鸡蛋',10,'个',1.0);
INSERT INTO `item_material` VALUES (2,'西红柿',10,'颗',2.5);
INSERT INTO `item_material` VALUES (3,'小油菜',10,'斤',1.5);

------------------
--5、菜品配料关联表 一对多
------------------
CREATE TABLE `item_item_material`(
	`id` int NOT NULL AUTO_INCREMENT,
	`itemId` int NOT NULL COMMENT '菜品编号',
	`materialId` int NOT NULL COMMENT '原料编号',
	`num` int NOT NULL COMMENT '原料的数量',
	PRIMARY KEY(`id`),
	CONSTRAINT item_item_material_fk1 FOREIGN KEY(materialId) REFERENCES item_material(id),
	CONSTRAINT item_item_material_fk2 FOREIGN KEY(itemId) REFERENCES item(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜品配料关联表';

--------------------
--6、商品评价表
--------------------
CREATE TABLE `item_comment`(
	`id` int NOT NULL AUTO_INCREMENT,
	`itemId` int NOT NULL COMMENT '商品编号',
	`userId` int NOT NULL COMMENT '用户编号',
	`comment` varchar(255) DEFAULT NULL COMMENT '评价',
	`time` datetime NOT NULL COMMENT '创建时间',
	PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品评价表';

--/菜品管理