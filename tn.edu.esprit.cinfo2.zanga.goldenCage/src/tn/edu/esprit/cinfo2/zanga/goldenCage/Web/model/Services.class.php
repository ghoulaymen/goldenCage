<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Services
 *
 * @author Aymen
 */

require_once (__DIR__.'/Category.class.php');
require_once (__DIR__.'/Provider.class.php');

class Services {
    //put your code here
    
        private $id;
	private $name;
	private $description;
	private $price;
	private $stock;
	private $Image;
	private $provider;
	private $category;
        private $type= null;
        
        function __construct($id, $name, $description, $price, $stock, $Image, $provider, $category) {
            $this->id = $id;
            $this->name = (String)$name;
            $this->description = (String) $description;
            $this->price = (double) $price;
            $this->stock = (int)$stock;
            $this->Image = (String)$Image;
            $this->provider = $provider;
            $this->category = $category;
            
        }
        
        public function __toString() {
            return $this->getName();
        }

        public function getId() {
            return $this->id;
        }

        public function setId($id) {
            $this->id = $id;
        }

        public function getName() {
            return $this->name;
        }

        public function setName($name) {
            $this->name = (String)$name;
        }

        public function getDescription() {
            return $this->description;
        }

        public function setDescription($description) {
            $this->description = (String) $description;
        }

        public function getPrice() {
            return $this->price;
        }

        public function setPrice($price) {
            $this->price = (double) $price;
        }

        public function getStock() {
            return $this->stock;
        }

        public function setStock(  $stock) {
            $this->stock = (int) $stock;
        }

        public function getImage() {
            return $this->Image;
        }

        public function setImage($Image) {
            $this->Image = (String) $Image;
        }

        public function getProvider() {
            return $this->provider;
        }

        public function setProvider(Provider $provider) {
            $this->provider = $provider;
        }

        public function getCategory() {
            return $this->category;
        }

        public function setCategory(Category $category) {
            $this->category = $category;
        }

        public function getType() {
            return $this->type;
        }

        public function setType($type) {
            $this->type = $type;
        }


}

?>
