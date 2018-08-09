CREATE TABLE `properties` (
  `id` int(11) NOT NULL,
  `key` varchar(50) DEFAULT NULL,
  `value` varchar(500) DEFAULT NULL,
  `application` varchar(50) DEFAULT NULL COMMENT '应用名称',
  `profile` varchar(50) DEFAULT NULL COMMENT '应用环境：dev,test,pre,online',
  `label` varchar(50) DEFAULT NULL COMMENT '应用模块:master,dev,test',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO properties VALUES(9, 'logging.path', '/varttttt/myerror', 'izhbg-demo-web', 'dev', 'master');