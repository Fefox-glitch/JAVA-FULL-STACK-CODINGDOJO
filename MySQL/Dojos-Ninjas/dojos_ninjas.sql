-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema dojos_ninjas
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `dojos_ninjas` ;

-- -----------------------------------------------------
-- Schema dojos_ninjas
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dojos_ninjas` DEFAULT CHARACTER SET utf8 ;
USE `dojos_ninjas` ;

-- -----------------------------------------------------
-- Table `dojos_ninjas`.`dojos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dojos_ninjas`.`dojos` ;

CREATE TABLE IF NOT EXISTS `dojos_ninjas`.`dojos` (
  `id_dojo` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `ubicacion` VARCHAR(45) NULL,
  `created_at` DATETIME NULL DEFAULT NOW(),
  `updated_at` DATETIME NULL DEFAULT NOW(),
  PRIMARY KEY (`id_dojo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dojos_ninjas`.`ninjas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dojos_ninjas`.`ninjas` ;

CREATE TABLE IF NOT EXISTS `dojos_ninjas`.`ninjas` (
  `id_ninja` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `habilidad` VARCHAR(45) NULL,
  `created_at` DATETIME NULL DEFAULT NOW(),
  `updated_at` DATETIME NULL DEFAULT NOW(),
  `dojos_id_dojo` INT NOT NULL,
  PRIMARY KEY (`id_ninja`),
  INDEX `fk_ninjas_dojos_idx` (`dojos_id_dojo` ASC) VISIBLE,
  CONSTRAINT `fk_ninjas_dojos`
    FOREIGN KEY (`dojos_id_dojo`)
    REFERENCES `dojos_ninjas`.`dojos` (`id_dojo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
