<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Product
 *
 * @author Aymen
 */
class Product extends Services{
    //put your code here
    
    private $stock;
    
    function __construct($stock) {
        
    $this->stock = (int)$stock;
    }
    public function getStock() {
        return $this->stock;
    }

    public function setStock($stock) {
        $this->stock = $stock;
    }

    public function __toString() {
        return parent::__clone();   
    }


}

?>
