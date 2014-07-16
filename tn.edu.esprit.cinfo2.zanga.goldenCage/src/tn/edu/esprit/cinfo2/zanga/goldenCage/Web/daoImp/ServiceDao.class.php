<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of ServiceDao
 *
 * @author Aymen
 */
require_once (__DIR__ . '/../utilities/DataBaseConnection.class.php');
require_once (__DIR__ . '/../daoInterface/DaoGenerique.Interface.php');
require_once (__DIR__ . '/../daoInterface/DaoSpecific.Interface.php');
require_once (__DIR__ . '/../model/Services.class.php');
require_once (__DIR__ . '/ProviderDao.class.php');
require_once (__DIR__ . '/CategoryDao.class.php');

class ServiceDao implements DaoGenerique,  DaoSpecific {

    public function __construct() {
        
    }

    public function add($service) {

        $connection = DataBaseConnection::giveMyconnection();


        try {
            $sql = "INSERT INTO `service`(`name`, `description`, `price`, `stock`, `image`, `Category_id`, `User_id`) VALUES( "
                    . "'"
                    . $service->getName()
                    . "','"
                    . $service->getDescription()
                    . "','"
                    . $service->getPrice()
                    . "','"
                    . $service->getStock()
                    . "','"
                    . $service->getImage()
                    . "','"
                    . $service->getCategory()->getId()
                    . "','"
                    . $service->getProvider()->getId()
                    . "')";

            $connection->prepare($sql)->execute();

            $service->setId($connection->lastInsertId());
            return $service;
        } catch (PDOException $e) {
            echo "Echec de Connection au serveur de base de donnée: " . $e->getMessage();
            die();
        }

        try {
            $connection->closeCursor();
        } catch (PDOException $e) {
            $e->getMessage();
        }
        return null;
    }

    public function findAll() {
        $connection = DataBaseConnection::giveMyconnection();
        $services = array();
        try {


            $sql = "SELECT `id`, `name`, `description`, `price`, `stock`, `image`, `Category_id`, `User_id` FROM `service`  ";

            $statement = $connection->prepare($sql);
            $statement->execute();
            while ($resultSet = $statement->fetch(PDO::FETCH_ASSOC)) {
                $providerDao = new ProviderDao();
                $categoryDao = new CategoryDao();
                $category = $categoryDao->findById($resultSet['Category_id']);
                $provider = $providerDao->findById($resultSet['User_id']);
                $service = new Services($resultSet['id'], $resultSet['name'], $resultSet['description'], $resultSet['price'], $resultSet['stock'], $resultSet['image'], $provider, $category);
                $services[] = $service;
            }
            return $services;
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


            $sql = "SELECT `id`, `name`, `description`, `price`, `stock`, `image`, `Category_id`, `User_id` FROM `service` WHERE `id` =  " . $id;

            $statement = $connection->prepare($sql);
            $statement->execute();
            $resultSet = $statement->fetch(PDO::FETCH_ASSOC);
            if (count($resultSet)) {
                $providerDao = new ProviderDao();
                $categoryDao = new CategoryDao();
                $category = $categoryDao->findById($resultSet['Category_id']);
                $provider = $providerDao->findById($resultSet['User_id']);
                $service = new Services($resultSet['id'], $resultSet['name'], $resultSet['description'], $resultSet['price'], $resultSet['stock'], $resultSet['image'], $provider, $category);
                return $service;
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

    public function isExist($service) {
        $connection = DataBaseConnection::giveMyconnection();

        try {


            $sql = "SELECT `id` FROM `service` WHERE `id` =  " . $service->getId();

            $statement = $connection->prepare($sql);
            $statement->execute();
            $resultSet = $statement->fetch(PDO::FETCH_ASSOC);
            if (count($resultSet)) {
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

    public function remove($service) {
        $connection = DataBaseConnection::giveMyconnection();

        try {

            $sql = "DELETE FROM `service` WHERE `id` = " . $service->getId();

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

    public function update($service) {
        $connection = DataBaseConnection::giveMyconnection();

        try {

            $sql = "UPDATE `service` SET " . "`id`='" . $service->getId()
                    . "',`name`='" . $service->getName() . "', `description` ='"
                    . $service->getDescription() . "', `price` ='"
                    . $service->getPrice() . "', `stock` ='" . $service->getStock()
                    . "', `image` ='" . $service->getImage()
                    . "', `Category_id` ='" . $service->getCategory()->getId()
                    . "', `User_id` ='" . $service->getProvider()->getId()
                    . "' WHERE `id`='" . $service->getId() . "'";

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
    
    public function findAllByCategory($category){
         $connection = DataBaseConnection::giveMyconnection();
        $services = array();
        try {


            $sql = "SELECT `id`, `name`, `description`, `price`, `stock`, `image`, `Category_id`, `User_id` FROM `service` WHERE `Category_id` =  ". $category->getId();

            $statement = $connection->prepare($sql);
            $statement->execute();
            while ($resultSet = $statement->fetch(PDO::FETCH_ASSOC)) {
                $providerDao = new ProviderDao();
                $categoryDao = new CategoryDao();
                $category = $categoryDao->findById($resultSet['Category_id']);
                $provider = $providerDao->findById($resultSet['User_id']);
                $service = new Services($resultSet['id'], $resultSet['name'], $resultSet['description'], $resultSet['price'], $resultSet['stock'], $resultSet['image'], $provider, $category);
                $services[] = $service;
            }
            return $services;
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
    
    public function findAllByProvider($provider){
         $connection = DataBaseConnection::giveMyconnection();
        $services = array();
        try {

            $sql = "SELECT `id`, `name`, `description`, `price`, `stock`, `image`, `Category_id`, `User_id` FROM `service` WHERE `User_id` =  ". $provider->getId();

            $statement = $connection->prepare($sql);
            $statement->execute();
            while ($resultSet = $statement->fetch(PDO::FETCH_ASSOC)) {
                $providerDao = new ProviderDao();
                $categoryDao = new CategoryDao();
                $category = $categoryDao->findById($resultSet['Category_id']);
                $provider = $providerDao->findById($resultSet['User_id']);
                $service = new Services($resultSet['id'], $resultSet['name'], $resultSet['description'], $resultSet['price'], $resultSet['stock'], $resultSet['image'], $provider, $category);
                $services[] = $service;
            }
            return $services;
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
}

?>
