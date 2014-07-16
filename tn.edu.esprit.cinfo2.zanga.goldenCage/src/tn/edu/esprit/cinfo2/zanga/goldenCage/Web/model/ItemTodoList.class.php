<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of ItemTodoList
 *
 * @author Aymen
 */
 
class ItemTodoList {
    //put your code here
        private $id;
	private $todolist;
	private $state;
	private $category;
        
        function __construct($id, $todolist, $state, $category) {
            $this->id = $id;
            $this->todolist = $todolist;
            $this->state = $state;
            $this->category = $category;
            
        }
        
        public function __toString() {
            
        }
        public function getId() {
            return $this->id;
        }

        public function setId($id) {
            $this->id = $id;
        }

        public function getTodolist() {
            return $this->todolist;
        }

        public function setTodolist($todolist) {
            $this->todolist = $todolist;
        }

        public function getState() {
            return $this->state;
        }

        public function setState($state) {
            $this->state = $state;
        }

        public function getCategory() {
            return $this->category;
        }

        public function setCategory($category) {
            $this->category = $category;
        }



}

?>
