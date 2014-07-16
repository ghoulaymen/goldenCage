<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Provider
 *
 * @author Aymen
 */
require_once (__DIR__ . '/User.class.php');

class Provider extends User {

    //put your code here
    private $reason_social;
    private $adresse;
    private $tel;

    public function __construct($reason_social, $adresse, $tel, $id, $firstname, $lastname, $password, $email, $image, $role) {
        parent::__construct($id, $firstname, $lastname, $password, $email, $image, $role);
        $this->reason_social = $reason_social;
        $this->adresse = $adresse;
        $this->tel = $tel;
    }

    public function __toString() {
        parent::__toString();
    }

    public function getReason_social() {
        return $this->reason_social;
    }

    public function setReason_social($reason_social) {
        $this->reason_social = $reason_social;
    }

    public function getAdresse() {
        return $this->adresse;
    }

    public function setAdresse($adresse) {
        $this->adresse = $adresse;
    }

    public function getTel() {
        return $this->tel;
    }

    public function setTel($tel) {
        $this->tel = $tel;
    }

}

?>
