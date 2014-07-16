<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of ItemCart
 *
 * @author Aymen
 */

class ItemCart {
    //put your code here
        private $id;
	private $service;
	private $cart;
        private $quantite;
        private $date_reservation;
        private $status;
        
        function __construct($id, $service, $cart) {
            $this->id = $id;
            $this->service = $service;
            $this->cart = $cart;
        }
        
        public function __toString() {
            
        }
        public function getId() {
            return $this->id;
        }

        public function setId($id) {
            $this->id = $id;
        }

        public function getService() {
            return $this->service;
        }

        public function setService($service) {
            $this->service = $service;
        }

        public function getCart() {
            return $this->cart;
        }

        public function setCart($cart) {
            $this->cart = $cart;
        }



}

?>
