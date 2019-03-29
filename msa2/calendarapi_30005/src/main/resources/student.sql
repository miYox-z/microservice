CREATE TABLE `student` (
  `id` bigint(255) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `age` int(2) DEFAULT NULL,
  `sex` int(1) DEFAULT NULL,
  `class_id` bigint(255) DEFAULT NULL,
  `card_number` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
