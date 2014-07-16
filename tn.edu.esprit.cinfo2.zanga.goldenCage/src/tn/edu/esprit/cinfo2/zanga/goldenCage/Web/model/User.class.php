<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of User
 *
 * @author Aymen
 */



class User  {
    //put your code here
    
        private $id;
	private $firstname;
	private $lastname;
	private $password;
	private $email;
	private $image;
	private $role;
    
    
        function __construct($id, $firstname, $lastname, $password, $email, $image) {
            $this->id = $id;
            $this->firstname = $firstname;
            $this->lastname = $lastname;
            $this->password = md5($password);
            $this->email = $email;
            $this->image = $image;
            $this->role = strtolower(get_class($this));
        }
        
        
        public function __toString() {
            return $this->lastname.' '.$this->firstname;
        }
        
        public function getId() {
            return $this->id;
        }

        public function setId($id) {
            $this->id = $id;
        }

        public function getFirstname() {
            return $this->firstname;
        }

        public function setFirstname($firstname) {
            $this->firstname = $firstname;
        }

        public function getLastname() {
            return $this->lastname;
        }

        public function setLastname($lastname) {
            $this->lastname = $lastname;
        }

        public function getPassword() {
            return $this->password;
        }

        public function setPassword($password) {
            $this->password = md5($password);
        }

        public function getEmail() {
            return $this->email;
        }

        public function setEmail($email) {
            $this->email = $email;
        }

        public function getImage() {
            return $this->image;
        }

        public function setImage($image) {
            $this->image = $image;
        }

        public function getRole() {
            return $this->role;
        }

        public function setRole($role) {
            $this->role = $role;
        }



}

?>
