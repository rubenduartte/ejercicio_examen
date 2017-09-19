/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE IF NOT EXISTS `ejercicio_ruben` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ejercicio_ruben`;

CREATE TABLE IF NOT EXISTS `empleado` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `apellido` varchar(100) DEFAULT NULL,
  `usuario` varchar(20) DEFAULT NULL,
  `clave` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` (`id`, `nombre`, `apellido`, `usuario`, `clave`) VALUES
	(1, 'ruben', 'duarte', 'sdasd', 'asdsadsad'),
	(2, 'miguel', 'ortega', 'sdfdsf', '2321323'),
	(3, 'victor', 'gonzalez', 'asdsad', 'sdfdsfdsfsdf'),
	(4, 'juan', 'cardoso', 'fdfd', 'fdfdf');
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
