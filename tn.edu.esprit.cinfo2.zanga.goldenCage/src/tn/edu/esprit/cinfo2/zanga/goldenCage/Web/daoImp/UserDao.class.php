<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of UserDao
 *
 * @author Aymen
 */

class UserDao implements DaoGenerique{
    //put your code here
    private static $instancesof;
    private  $_db;
    
    private function __construct() {
        $this->setDb($db);
    }
    
    public static function getInstanceof() {

            if ($instancesof == null) {
                    $instancesof = new ProviderDao();
            }
            return $instancesof;
    }

        
    public function add($user) {
        
		return false;
        
        
        
        
    }

    public function findById(int $id) {
        
    }

    public function findAll() {
        
    }

    public function insert($user) {
        
    }

    public function remove($user) {
        
    }

    public function update($user) {
        
    }


}

?>
