<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Cart
 *
 * @author Aymen
 */

class Cart {
    //put your code here
    
    	private $id;
	private $customer;
        
        function __construct($id, $customer) {
            $this->id = $id;
            $this->customer = $customer;
        }
        public function __toString() {
            
        }
        public function getId() {
            return $this->id;
        }

        public function setId($id) {
            $this->id = $id;
        }

        public function getCustomer() {
            return $this->customer;
        }

        public function setCustomer($customer) {
            $this->customer = $customer;
        }


}

?>
