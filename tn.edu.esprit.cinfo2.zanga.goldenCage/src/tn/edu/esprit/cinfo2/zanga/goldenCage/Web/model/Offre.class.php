<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Offre
 *
 * @author Aymen
 */
require_once (__DIR__.'/services.class.php');

class Offre extends Services{
    //put your code here
    
    private $status ;
    public function __construct($id, $name, $description, $price, $Image, $provider, $category,$status) {
        parent::__construct($id, $name, $description, $price, $Image, $provider, $category);
        $this->status = $status;   
    }
    public function getStatus() {
        return $this->status;
    }

    public function setStatus($status) {
        $this->status = $status;
    }

    public function __toString() {
         return parent::__clone();
    }

    
    
}

?>
