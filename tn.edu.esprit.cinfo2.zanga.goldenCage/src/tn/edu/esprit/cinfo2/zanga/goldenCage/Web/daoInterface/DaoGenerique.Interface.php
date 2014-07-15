<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of DaoGenerique
 *
 * @author Aymen
 */

require_once (__DIR__.'/../utilities/DataBaseConnection.class.php');


interface DaoGenerique  {
    //put your code here
    
    public function add($o);
    
    public function update($o);
    
    public function remove($o);
    
    public function isExist($o);
    
    public function findAll();
    
    public function findById($id);
    
    
}

?>
