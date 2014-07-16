<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of TodoList
 *
 * @author Aymen
 */

class TodoList {
    
        private  $id;
	private $customer;
	private $label;
        
        function __construct($id, $customer, $label) {
            $this->id = $id;
            $this->customer = $customer;
            $this->label = $label;
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

        public function getLabel() {
            return $this->label;
        }

        public function setLabel($label) {
            $this->label = $label;
        }

}

?>
