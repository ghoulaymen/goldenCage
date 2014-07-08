SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `goldenCage` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `goldenCage` ;

-- -----------------------------------------------------
-- Table `goldenCage`.`User`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `goldenCage`.`User` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `lastname` VARCHAR(128) NULL ,
  `firstname` VARCHAR(128) NULL ,
  `email` VARCHAR(128) NOT NULL ,
  `password` VARCHAR(128) NULL ,
  `dateWedding` DATE NULL ,
  `role` VARCHAR(128) NULL ,
  `reasonSocial` VARCHAR(255) NULL ,
  `adresse` VARCHAR(255) NULL ,
  `tel` VARCHAR(128) NULL ,
  `image` VARCHAR(255) NULL ,
  PRIMARY KEY (`id`) ,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `goldenCage`.`Category`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `goldenCage`.`Category` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(128) NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `goldenCage`.`Service`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `goldenCage`.`Service` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(255) NULL ,
  `description` TEXT NULL ,
  `price` DOUBLE(10,3) NULL ,
  `stock` INT NULL ,
  `image` VARCHAR(255) NULL ,
  `Category_id` INT NULL ,
  `User_id` INT NOT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `fk_Service_Category1_idx` (`Category_id` ASC) ,
  INDEX `fk_Service_User1_idx` (`User_id` ASC) ,
  CONSTRAINT `fk_Service_Category1`
    FOREIGN KEY (`Category_id` )
    REFERENCES `goldenCage`.`Category` (`id` )
    ON DELETE SET NULL
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Service_User1`
    FOREIGN KEY (`User_id` )
    REFERENCES `goldenCage`.`User` (`id` )
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `goldenCage`.`Comment`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `goldenCage`.`Comment` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `User_id` INT NOT NULL ,
  `comment` TEXT NULL ,
  `published_at` DATE NULL ,
  `Service_id` INT NOT NULL ,
  PRIMARY KEY (`id`, `User_id`) ,
  INDEX `fk_Comment_User_idx` (`User_id` ASC) ,
  INDEX `fk_Comment_Service1_idx` (`Service_id` ASC) ,
  CONSTRAINT `fk_Comment_User`
    FOREIGN KEY (`User_id` )
    REFERENCES `goldenCage`.`User` (`id` )
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Comment_Service1`
    FOREIGN KEY (`Service_id` )
    REFERENCES `goldenCage`.`Service` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `goldenCage`.`ToDoList`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `goldenCage`.`ToDoList` (
  `id` INT NOT NULL ,
  `label` VARCHAR(255) NULL ,
  `User_id` INT NOT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `fk_ToDoList_User1_idx` (`User_id` ASC) ,
  CONSTRAINT `fk_ToDoList_User1`
    FOREIGN KEY (`User_id` )
    REFERENCES `goldenCage`.`User` (`id` )
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `goldenCage`.`Itemtodolist`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `goldenCage`.`Itemtodolist` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `state` VARCHAR(255) NULL ,
  `Category_id` INT NULL ,
  `ToDoList_id` INT NOT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `fk_Itemtodolist_Category1_idx` (`Category_id` ASC) ,
  INDEX `fk_Itemtodolist_ToDoList1_idx` (`ToDoList_id` ASC) ,
  CONSTRAINT `fk_Itemtodolist_Category1`
    FOREIGN KEY (`Category_id` )
    REFERENCES `goldenCage`.`Category` (`id` )
    ON DELETE SET NULL
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Itemtodolist_ToDoList1`
    FOREIGN KEY (`ToDoList_id` )
    REFERENCES `goldenCage`.`ToDoList` (`id` )
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `goldenCage`.`Cart`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `goldenCage`.`Cart` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `User_id` INT NOT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `fk_Cart_User1_idx` (`User_id` ASC) ,
  CONSTRAINT `fk_Cart_User1`
    FOREIGN KEY (`User_id` )
    REFERENCES `goldenCage`.`User` (`id` )
    ON DELETE SET NULL
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `goldenCage`.`ItemCart`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `goldenCage`.`ItemCart` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `Cart_id` INT NOT NULL ,
  `Service_id` INT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `fk_ItemCart_Cart1_idx` (`Cart_id` ASC) ,
  INDEX `fk_ItemCart_Service1_idx` (`Service_id` ASC) ,
  CONSTRAINT `fk_ItemCart_Cart1`
    FOREIGN KEY (`Cart_id` )
    REFERENCES `goldenCage`.`Cart` (`id` )
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_ItemCart_Service1`
    FOREIGN KEY (`Service_id` )
    REFERENCES `goldenCage`.`Service` (`id` )
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB;

USE `goldenCage` ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
