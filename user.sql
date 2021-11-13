/*
SQLyog Professional v13.1.1 (64 bit)
MySQL - 5.7.31-log : Database - user
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`user` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `user`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `fakename` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

/*Data for the table `admin` */

insert  into `admin`(`id`,`name`,`fakename`,`sex`,`username`,`password`,`telephone`,`email`) values 
(2,'李四','法外小图','女','zzz','zzz','17393116565','11111222@163.com'),
(3,'王五','青年志愿者','男','aaa','aaa','17162639999','3502203239@qq.com'),
(29,'张三','张三三','男','admin','admin','14253696855','2682981480@qq.com'),
(30,'李四5','法外小图','男','zxzx','zzz','17393116565','11111222@163.com'),
(31,'郑晓东','晓东','男','268298','268298','17393116265','2682981480@qq.com'),
(32,'小刘','安迪','女','Andy','andy','15846135404','1721975441@qq.com');

/*Table structure for table `goods` */

DROP TABLE IF EXISTS `goods`;

CREATE TABLE `goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `in_price` double(8,2) DEFAULT NULL,
  `sale_price` double(8,2) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `discription` varchar(255) DEFAULT NULL,
  `discount` double(8,2) DEFAULT NULL,
  `product_place` varchar(255) DEFAULT NULL,
  `unit` varchar(255) DEFAULT NULL,
  `standard` varchar(255) DEFAULT NULL,
  `sale_num` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL COMMENT '0 下架 1  上架',
  `picture` varchar(255) DEFAULT NULL,
  `good_type` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `good_type` (`good_type`),
  CONSTRAINT `goods_ibfk_1` FOREIGN KEY (`good_type`) REFERENCES `goodstype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `goods` */

insert  into `goods`(`id`,`name`,`in_price`,`sale_price`,`num`,`discription`,`discount`,`product_place`,`unit`,`standard`,`sale_num`,`status`,`picture`,`good_type`) values 
(1,'黑松',40.00,90.00,100,'黑松（Pinus thunbergii Parl.）是松科、松属植物。别名白芽松，常绿乔木，高可达30公尺，树皮带灰黑色。四月开花，花单，雌花生于新芽的顶端，呈紫色，多数种鳞（心皮）相重而排成球形。成熟时，多数花粉随风飘出。球果至翌年秋天成，鳞片裂开而散出种子，种子有薄翅。果鳞的麟脐具有短刺。原产日本及朝鲜南部海岸地区。',0.90,'兰州市','颗','3000g',0,1,'/files/details-item-3.jpg',1),
(4,'五针松',50.00,100.00,100,'五针松（学名：Pinus parviflora）是松科松属的植物，乔木，在原产地高10-30米，胸径0.6-1.5米；幼树树皮淡灰色，平滑，大树树皮暗灰色，裂成鳞状块片脱落；枝平展，树冠圆锥形；一年生枝幼嫩时绿色，后呈黄褐色。针叶5针一束，微弯曲，长3.5-5.5厘米。球果卵圆形或卵状椭圆形，几无梗，熟时种鳞张开；种子为不规则倒卵圆形，近褐色，具黑色斑纹，长8-10毫米，径约7毫米，种翅宽6-8毫米，连种子长1.8-2厘米',1.00,'兰州','颗','一颗',10,1,'/files/cart-item-1.jpg',2),
(5,'赤松',20.00,30.00,50,'赤松（Pinus densiflora Sieb. et Zucc.）是松科松属植物，乔木，高达30米，胸径达1.5米；树皮桔红色，树干上部树皮红褐色；枝平展形成伞状树冠；一年生枝淡黄色或红黄色。雄球花淡红黄色，圆筒形；雌球花淡红紫色。球果成熟时暗黄褐色或淡褐黄色，种鳞张开，不久即脱落，卵圆形或卵状圆锥形；种鳞薄，鳞盾扁菱形，通常扁平；种子倒卵状椭圆形或卵圆形，长4-7毫米；连翅长1.5-2厘米，种翅宽5-7毫米；子叶5-8枚，长2.5-4厘米，边缘有细锯齿。花期4月，球果第二年9月下旬至10月成熟',1.00,'北京市海淀区','盆','3000g',5,1,'/files/cart-item-2.jpg',2),
(6,'真柏',30.00,50.00,100,'刺形叶三叶交叉轮生，条状披针形，先端渐尖成角质锐尖头，长6-8毫米，上面凹，有两条白粉气孔带，气孔带常在上部汇合，绿色中脉仅下部明显，不达叶之先端，下面凸起，蓝绿色，沿中脉有细纵槽。球果近球形，被白粉，成熟时黑色，径8-9毫米，有2-3粒种子；种子长约4毫米，有棱脊。',1.00,'上海市黄浦区','颗','5000g',50,1,'/files/details-item-2.jpg',2),
(15,'多肉',10.00,20.00,NULL,'能储藏可利用的水，在土壤含水状况恶化、植物根系不能再从土壤中吸收和提供必要的水分时，它能使植物暂时脱离外界水分供应而独立生存。据粗略统计，全世界共有多肉植物一万余种，在分类上隶属100余科，多肉还能净化空气',0.60,'北京','盆','1盆',0,1,'/files/product-item-22.jpg',4);

/*Table structure for table `goodstype` */

DROP TABLE IF EXISTS `goodstype`;

CREATE TABLE `goodstype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `typename` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `goodstype` */

insert  into `goodstype`(`id`,`typename`) values 
(1,'松柏盆景'),
(2,'杂木盆景'),
(3,'落叶杂木'),
(4,'花果盆景'),
(5,'山野草盆景'),
(6,'其他');

/*Table structure for table `roles` */

DROP TABLE IF EXISTS `roles`;

CREATE TABLE `roles` (
  `id` int(20) NOT NULL,
  `roles_name` char(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `roles` */

insert  into `roles`(`id`,`roles_name`) values 
(1,'超级管理员'),
(2,'管理员'),
(3,'管理员'),
(4,'用户'),
(5,'用户');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `name` char(20) DEFAULT NULL,
  `username` char(20) DEFAULT NULL,
  `pw` char(20) DEFAULT NULL,
  `tel` char(20) DEFAULT NULL,
  `email` char(20) DEFAULT NULL,
  `state` char(20) DEFAULT NULL,
  `role` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  KEY `role` (`role`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`role`) REFERENCES `roles` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`username`,`pw`,`tel`,`email`,`state`,`role`) values 
(1,'张三三','张三丰','123456','17393116265','2682981480@qq.com','1',1),
(2,'许燕','P172115023','3213132','1321321321','231321321','1',2),
(3,'阿达','撒大地','2313212312312','141414125','43586355@qq.com','1',3),
(4,'李四','李思','dasdadsa','1995858669','17679182910@163.com','1',4),
(13,'赵六','老六','88888','17936255263','3089279854@qq.com','1',5),
(14,'李四','lisi','123123','13513','268298','1',5);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
