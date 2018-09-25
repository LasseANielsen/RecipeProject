-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema recipeproject
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema recipeproject
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `recipeproject` DEFAULT CHARACTER SET utf8 ;
USE `recipeproject` ;

-- -----------------------------------------------------
-- Table `recipeproject`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `recipeproject`.`User` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `Username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `recipeproject`.`Recipe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `recipeproject`.`Recipe` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NOT NULL,
  `Description` VARCHAR(200) NOT NULL,
  `To_do` VARCHAR(2000) NOT NULL,
  `Cookingtime` INT NOT NULL,
  `User_Id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Recipe_User_idx` (`User_Id` ASC),
  CONSTRAINT `fk_Recipe_User`
    FOREIGN KEY (`User_Id`)
    REFERENCES `recipeproject`.`User` (`Id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `recipeproject`.`Ingredient`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `recipeproject`.`Ingredient` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `recipeproject`.`Recipe_has_ingredient`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `recipeproject`.`Recipe_has_ingredient` (
  `Recipe_Id` INT NOT NULL,
  `Ingredient_Id` INT NOT NULL,
  `Amount` INT NOT NULL,
  `Measure` VARCHAR(45) NOT NULL,
  INDEX `fk_Recipe_has_ingredient_Ingredient1_idx` (`Ingredient_Id` ASC),
  INDEX `fk_Recipe_has_ingredient_Recipe1_idx` (`Recipe_Id` ASC),
  CONSTRAINT `fk_Recipe_has_ingredient_Ingredient1`
    FOREIGN KEY (`Ingredient_Id`)
    REFERENCES `recipeproject`.`Ingredient` (`Id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Recipe_has_ingredient_Recipe1`
    FOREIGN KEY (`Recipe_Id`)
    REFERENCES `recipeproject`.`Recipe` (`Id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
