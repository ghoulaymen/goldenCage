<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


class DataBaseConnection {

    public static function giveMyconnection() {
        // Connection au serveur
        $bd = "goldencage";
        $host = "localhost";
        $utilisateur = 'root';
        $motDePasse = '';
        $dns = "mysql:host=" . $host . ";dbname=" . $bd;


        try {

            // Options de connection
            $options = array(PDO::MYSQL_ATTR_INIT_COMMAND => "SET NAMES utf8");

            // Initialisation de la connection
            $db = new PDO($dns, $utilisateur, $motDePasse,$options);
            $db->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_WARNING);
            
            return $db;
        } catch (PDOException $e) {
            echo "Echec de Connection au serveur de base de donnée: ", $e->gettMessage();
            die();
        }
    }

}

?>
