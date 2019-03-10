DROP TABLE IF EXISTS `users`;
CREATE TABLE "users" (
  "id" bigint(20) NOT NULL AUTO_INCREMENT,
  "email" varchar(30) DEFAULT NULL,
  "name" varchar(50) DEFAULT NULL,
  PRIMARY KEY ("id")
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'c@c.com', 'chc');
