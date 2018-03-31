create database orderSystem;

use orderSystem;

--�û�����

--------------------
--1���û���
--------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL COMMENT '�û���',
  `password` varchar(32) NOT NULL COMMENT '���룬���ܴ洢',
  `nickname` varchar(20) NOT NULL COMMENT '�ǳ�',
  `phone` varchar(20) DEFAULT NULL COMMENT '�ֻ���',
  `email` varchar(50) DEFAULT NULL COMMENT '����',
  `created` datetime NOT NULL COMMENT '����ʱ��',
  `updated` datetime NOT NULL COMMENT '����ʱ��',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`) ,
  UNIQUE KEY `phone` (`phone`) ,
  UNIQUE KEY `email` (`email`) 
) ENGINE=InnoDB CHARSET=utf8 COMMENT='�û���';
INSERT INTO `user` VALUES(1,'admin','21232f297a57a5a743894a0e4a801fc3','shizumine','13805927313','610801272@qq.com','2018-03-30 17:03:55','2018-03-30 17:03:55');

--------------------
--2����ɫ��
--------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
	`id` int NOT NULL AUTO_INCREMENT,
	`name` varchar(50) NOT NULL COMMENT '��ɫ����',
	`description` varchar(255) DEFAULT NULL COMMENT '��ɫ����',
	PRIMARY KEY (`id`),
	UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB CHARSET=utf8 COMMENT='��ɫ��';

INSERT INTO `role` VALUES(1,'��̨����Ա','�ܽ������в���');
INSERT INTO `role` VALUES(2,'�˿�','���ͣ�������ע��Ĭ������Ϊ�˿�');

--------------------
--3��Ȩ�ޱ�
--------------------
DROP TABLE IF EXISTS `authority`;
CREATE TABLE `authority`(
	`id` int NOT NULL AUTO_INCREMENT,
	`name` varchar(20) NOT NULL COMMENT 'Ȩ������',
	`url` varchar(255) NOT NULL COMMENT 'Ȩ�޵�ַ',
	`description` varchar(255) DEFAULT NULL COMMENT 'Ȩ������',
	PRIMARY KEY(`id`),
	UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB CHARSET=utf8 COMMENT='Ȩ�ޱ�';

--------------------
--4���û���ɫ��
--------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`(
	`id` int NOT NULL AUTO_INCREMENT,
	`uid` int NOT NULL,
	`rid` int NOT NULL,
	PRIMARY KEY(`id`),
	CONSTRAINT user_role_fk1 FOREIGN KEY(`uid`) REFERENCES user(`id`),
	CONSTRAINT user_role_fk2 FOREIGN KEY(`rid`) REFERENCES role(`id`)
) ENGINE=InnoDB CHARSET=utf8 COMMENT='�û���ɫ��';

--------------------
--5����ɫȨ�ޱ�
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

--/�û�����

--��Ʒ����


--------------------
--1����Ʒ����
--------------------
CREATE TABLE `item_type`(
	`id` int NOT NULL AUTO_INCREMENT COMMENT '��Ʒ������',
	`name` varchar(20) NOT NULL COMMENT '��Ʒ��������',
	PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��Ʒ�����';

INSERT INTO `item_type` VALUES(1,'��ʳ��');
INSERT INTO `item_type` VALUES(2,'������');
INSERT INTO `item_type` VALUES(3,'����');
INSERT INTO `item_type` VALUES(4,'����');
INSERT INTO `item_type` VALUES(5,'������');

--------------------
--2����Ʒ��
--------------------
CREATE TABLE `item`(
	`id` int NOT NULL AUTO_INCREMENT,
	`name` varchar(20) NOT NULL COMMENT '��Ʒ����',
	`discount` int DEFAULT NULL COMMENT '�ۿ� 1-9��',
	`price` float(5,2) NOT NULL COMMENT '�۸�',
	`vipprice` float(5,2) NOT NULL COMMENT '��Ա��',
	`cost` float(5,2) NOT NULL COMMENT '�ɱ�',
	`sale` int DEFAULT NULL COMMENT '��������',
	`filename` varchar(255) DEFAULT NULL COMMENT 'ͼƬ�ļ�����',
	`path` varchar(255) DEFAULT NULL COMMENT 'ͼƬ�ļ���ַ',
	PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��Ʒ��';

------------------------------------
--3����Ʒ��Ʒ��������� ��Զ�
------------------------------------
CREATE TABLE `item_item_type`(
	`id` int NOT NULL AUTO_INCREMENT,
	`typeId` int NOT NULL COMMENT '��Ʒ������',
	`itemId` int NOT NULL COMMENT '��Ʒ���',
	PRIMARY KEY(`id`),
	CONSTRAINT item_item_type_fk1 FOREIGN KEY(typeId) REFERENCES item_type(id),
	CONSTRAINT item_item_type_fk2 FOREIGN KEY(itemId) REFERENCES item(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��Ʒ��Ʒ���������';

INSERT INTO `item_item_type` VALUES(1,2,1);
--------------------
--4�����ϱ�
--------------------
CREATE TABLE `item_material`(
	`id` int NOT NULL AUTO_INCREMENT,
	`name` varchar(20) NOT NULL COMMENT '��������',
	`stock` int NOT NULL COMMENT '���',
	`unit` varchar(10) NOT NULL COMMENT '��λ',
	`price` float(5,2) NOT NULL COMMENT '����',
	PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='���ϱ�';

INSERT INTO `item_material` VALUES (1,'����',10,'��',1.0);
INSERT INTO `item_material` VALUES (2,'������',10,'��',2.5);
INSERT INTO `item_material` VALUES (3,'С�Ͳ�',10,'��',1.5);

------------------
--5����Ʒ���Ϲ����� һ�Զ�
------------------
CREATE TABLE `item_item_material`(
	`id` int NOT NULL AUTO_INCREMENT,
	`itemId` int NOT NULL COMMENT '��Ʒ���',
	`materialId` int NOT NULL COMMENT 'ԭ�ϱ��',
	`num` int NOT NULL COMMENT 'ԭ�ϵ�����',
	PRIMARY KEY(`id`),
	CONSTRAINT item_item_material_fk1 FOREIGN KEY(materialId) REFERENCES item_material(id),
	CONSTRAINT item_item_material_fk2 FOREIGN KEY(itemId) REFERENCES item(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��Ʒ���Ϲ�����';

--------------------
--6����Ʒ���۱�
--------------------
CREATE TABLE `item_comment`(
	`id` int NOT NULL AUTO_INCREMENT,
	`itemId` int NOT NULL COMMENT '��Ʒ���',
	`userId` int NOT NULL COMMENT '�û����',
	`comment` varchar(255) DEFAULT NULL COMMENT '����',
	`time` datetime NOT NULL COMMENT '����ʱ��',
	PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��Ʒ���۱�';

--/��Ʒ����