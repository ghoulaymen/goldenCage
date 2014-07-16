<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of CategoryDao
 *
 * @author Aymen
 */
require_once (__DIR__ . '/../daoInterface/DaoGenerique.Interface.php');
require_once (__DIR__ . '/../utilities/DataBaseConnection.class.php');
require_once (__DIR__ . '/../model/Category.class.php');
class CategoryDao implements DaoGenerique {

    public function __construct() {
        
    }

    public function add($category) {

        $connection = DataBaseConnection::giveMyconnection();


        try {
            $sql = "INSERT INTO `category`( `name`) VALUES ( " . "'". $category->geName(). "')";

            $connection->prepare($sql)->execute();
            $category->setId($connection->lastInsertId());
            return $category;
        } catch (\PDOException $e) {
            echo "Echec de Connection au serveur de base de donnée: ". $e->getMessage();
            die();
        }

        try {
            $connection->closeCursor();
        } catch (PDOException $e) {
            // TODO Auto-generated catch block
            $e->getMessage();
        }
        return null;
    }

    public function findAll() {
        $connection = DataBaseConnection::giveMyconnection();
        $categorys = array();
        try {


            $sql = "SELECT `id`, `name` FROM `category`  ";

            $statement = $connection->prepare($sql);
            $statement->execute();
            while ($resultSet = $statement->fetch(PDO::FETCH_ASSOC)) {
                $category = new Category($resultSet["id"], $resultSet["name"]);

                $categorys[] = $category;
            }
            return $categorys;
        } catch (PDOException $e) {
            // TODO Auto-generated catch block
            $e->getMessage();
        }

        try {
            $connection->closeCursor();
        } catch (PDOException $e) {
            // TODO Auto-generated catch block
            $e->getMessage();
        }


        return false;
    }

    public function findById($id) {
        $connection = DataBaseConnection::giveMyconnection();

        try {


            $sql = "SELECT `id`, `name` FROM `category` WHERE `id`=  " . $id;

            $statement = $connection->prepare($sql);
            $statement->execute();
            $resultSet = $statement->fetch(PDO::FETCH_ASSOC);
            $category = new Category($resultSet["id"], $resultSet["name"]);

            return $category;
        } catch (PDOException $e) {
            // TODO Auto-generated catch block
            $e->getMessage();
        }

        try {
            $connection->closeCursor();
        } catch (PDOException $e) {
            // TODO Auto-generated catch block
            $e->getMessage();
        }


        return false;
    }

    public function isExist($category) {
        $connection = DataBaseConnection::giveMyconnection();

        try {


            $sql = "SELECT `id`, `name` FROM `category` WHERE `id`=  " . $category->getId();

            $statement = $connection->prepare($sql);
            $statement->execute();
            $resultSet = $statement->fetch(PDO::FETCH_ASSOC);
            if (count($resultSet)){
                return TRUE;
            }
        } catch (PDOException $e) {
            // TODO Auto-generated catch block
            $e->getMessage();
        }

        try {
            $connection->closeCursor();
        } catch (PDOException $e) {
            // TODO Auto-generated catch block
            $e->getMessage();
        }


        return false;
    }

    public function remove($category) {
        $connection = DataBaseConnection::giveMyconnection();

        try {

            $sql = "DELETE FROM `category` WHERE `id` =".$category->getId();

            $statement = $connection->prepare($sql);
            $statement->execute();
            return true;
        } catch (PDOException $e) {
            // TODO Auto-generated catch block
            $e->getMessage();
        }

        try {
            $connection->closeCursor();
        } catch (PDOException $e) {
            // TODO Auto-generated catch block
            $e->getMessage();
        }


        return false;
        
        
    }

    public function update($category) {
        $connection = DataBaseConnection::giveMyconnection();

        try {

            $sql = "UPDATE `category` SET " 
                    . "`id`='". $category->getId()
                    . "',`name`='". $category->getName()
                    . "' WHERE `id`='". $category->getId()
            . "'";

            $connection->prepare($sql)->execute();
            return true;
        } catch (PDOException $e) {
            // TODO Auto-generated catch block
            $e->getMessage();
        }

        try {
            $connection->closeCursor();
        } catch (PDOException $e) {
            // TODO Auto-generated catch block
            $e->getMessage();
        }


        return null;
    }

}

?>
