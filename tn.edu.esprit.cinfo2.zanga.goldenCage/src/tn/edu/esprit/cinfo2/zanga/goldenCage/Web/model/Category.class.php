<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Category
 *
 * @author Aymen
 */
class Category {

    private $id, $name;

    public function __construct($id, $name){
        
        $this->id = $id;
        $this->name = $name;
        
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
        $this->name = (String) $name;
    }

    public function __toString() {

        return $this->getName();
    }

}

?>
