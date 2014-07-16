<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Customer
 *
 * @author Aymen
 */


class Customer extends User{
    //put your code here
    private $dateWedding;
    
    public function User() {
        parent::User();
    }
    
    public function __construct($id, $firstname, $lastname, $password, $email, $image, $role,$dateWedding) {
        parent::__construct($id, $firstname, $lastname, $password, $email, $image, $role);
        $this->dateWedding = $dateWedding;
    }
    public function __toString() {
        parent::__toString();
    }
    
    public function getDateWedding() {
        return $this->dateWedding;
    }

    public function setDateWedding($dateWedding) {
        $this->dateWedding = $dateWedding;
    }


}

?>
