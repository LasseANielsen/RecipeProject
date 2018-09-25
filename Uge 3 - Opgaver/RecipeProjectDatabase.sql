-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema recipeProject
-- -----------------------------------------------------
DROP TABLE IF EXISTS `User`;
DROP TABLE IF EXISTS `Recipe`;
DROP TABLE IF EXISTS `Image`;
-- -----------------------------------------------------
-- Schema recipeProject
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `recipeproject` DEFAULT CHARACTER SET utf8 ;
USE `recipeproject` ;

-- -----------------------------------------------------
-- Table `recipeProject`.`Image`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `recipeproject`.`Image` (
  `id` INT NOT NULL,
  `url` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `recipeProject`.`Recipe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `recipeproject`.`Recipe` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `ingredients` VARCHAR(200) NOT NULL,
  `instructions` VARCHAR(2000) NOT NULL,
  `image_id` INT NULL,
  `rating` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `recipe_image_FK_idx` (`image_id` ASC),
  CONSTRAINT `recipe_image_FK`
    FOREIGN KEY (`image_id`)
    REFERENCES `recipeproject`.`Image` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `recipeProject`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `recipeproject`.`User` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `recipe_id` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `users_recipes_FK_idx` (`recipe_id` ASC),
  CONSTRAINT `users_recipes_FK`
    FOREIGN KEY (`recipe_id`)
    REFERENCES `recipeproject`.`Recipe` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
