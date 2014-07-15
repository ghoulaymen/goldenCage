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


interface Authentification {
    //put your code here
    public function signUp($email, $password);
    
    public function signOut();
    
}

?>
