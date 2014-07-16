<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aymen
 */



require_once (__DIR__.'/../utilities/DataBaseConnection.class.php');

interface DaoSpecific {
    //put your code here
     public function findAllByCategory($o);
     
     public function findAllByProvider($o);
     
     
}

?>
