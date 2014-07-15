<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of ProviderDao
 *
 * @author Aymen
 */
require_once (__DIR__ . '/../daoInterface/DaoGenerique.Interface.php');
require_once (__DIR__ . '/../daoInterface/Authentification.Interface.php');
require_once (__DIR__ . '/../model/Provider.class.php');

class ProviderDao implements DaoGenerique, Authentification {

    public function __construct() {
        
    }

    public function add($provider) {

        $connection = DataBaseConnection::giveMyconnection();


        try {
            $sql = "INSERT INTO `user` ( lastname, firstname, email, password,reasonSocial, adresse, tel, image, role) VALUES("
                    . "'"
                    . $provider->getLastname()
                    . "','"
                    . $provider->getFirstname()
                    . "','"
                    . $provider->getEmail()
                    . "','"
                    . $provider->getPassword()
                    . "','"
                    . $provider->getReason_social()
                    . "','"
                    . $provider->getAdresse()
                    . "','"
                    . $provider->getTel()
                    . "','"
                    . $provider->getImage()
                    . "','"
                    . $provider->getRole()
                    . "')";

            $connection->prepare($sql)->execute();
            $provider->setId($connection->lastInsertId());
            return $provider;
        } catch (\PDOException $e) {
            echo "Echec de Connection au serveur de base de donnée: ", $e->getMessage();
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

    public function update($provider) {
        $connection = DataBaseConnection::giveMyconnection();

        try {

            $sql = "UPDATE `user` SET "
                    . "`lastname`='" . $provider->getLastname()
                    . "',`firstname`='" . $provider->getFirstname()
                    . "',`email`='" . $provider->getEmail()
                    . "',`password`='" . $provider->getPassword()
                    . "',`role`='" . $provider->getRole()
                    . "',`reasonSocial`='" . $provider->getReason_social()
                    . "',`adresse`='" . $provider->getAdresse()
                    . "',`tel`='" . $provider->getTel()
                    . "',`image`='" . $provider->getImage()
                    . "' WHERE id='" . $provider->getId() . "'";

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

    public function findAll() {
        $connection = DataBaseConnection::giveMyconnection();
        $providers = array();
        try {


            $sql = "select * from user where role = 'provider' ";

            $statement = $connection->prepare($sql);
            $statement->execute();
            while ($resultSet = $statement->fetch(PDO::FETCH_ASSOC)) {
                $provider = new Provider(
                        $resultSet["id"], $resultSet["firstname"], $resultSet["lastname"], $resultSet["password"], $resultSet["email"], $resultSet["image"], $resultSet["role"], $resultSet["reasonSocial"], $resultSet["adresse"], $resultSet["tel"]);

                $providers[] = $provider;
            }
            return $providers;
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


            $sql = "select * from user where id= " . $id . "and role = 'provider' ";

            $statement = $connection->prepare($sql);
            $statement->execute();
            $resultSet = $statement->fetch(PDO::FETCH_ASSOC);
            $provider = new Provider(
                    $resultSet["id"], $resultSet["firstname"], $resultSet["lastname"], $resultSet["password"], $resultSet["email"], $resultSet["image"], $resultSet["role"], $resultSet["reasonSocial"], $resultSet["adresse"], $resultSet["tel"]);

            return $provider;
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

    public function isExist($provider) {
        $connection = DataBaseConnection::giveMyconnection();

        try {


            $sql = "select * from user where id= " . $$provider->getId() . "and role = 'provider' ";

            $statement = $connection->prepare($sql);
            $statement->execute();
            $resultSet = $statement->fetch(PDO::FETCH_ASSOC);
            if (count($resultSet))
                return TRUE;
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

    public function remove($provider) {
        $connection = DataBaseConnection::giveMyconnection();

        try {

            $sql = "delete from user where id = ". $provider->getId();

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

    public function signOut() {
        
        return false;
    }

    public function signUp($email, $password) {
        $connection = DataBaseConnection::giveMyconnection();

        try {


            $sql = "select * from user where email= " . $email . " password= " . $password . "and role = 'provider' ";

            $statement = $connection->prepare($sql);
            $statement->execute();
            $resultSet = $statement->fetch(PDO::FETCH_ASSOC);
            $provider = new Provider(
                    $resultSet["id"], $resultSet["firstname"], $resultSet["lastname"], $resultSet["password"], $resultSet["email"], $resultSet["image"], $resultSet["role"], $resultSet["reasonSocial"], $resultSet["adresse"], $resultSet["tel"]);

            return $provider;
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
