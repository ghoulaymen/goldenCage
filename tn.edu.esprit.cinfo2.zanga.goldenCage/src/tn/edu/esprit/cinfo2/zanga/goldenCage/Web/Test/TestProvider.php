<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



require_once '../model/Provider.class.php';

require_once '../daoImp/ProviderDao.class.php';




$provider = new Provider(null, null, null,null, "Aymen", "Ghoul", "123456", "ghoeolaymen@gmail.com", null, null);
  
$providerdao = new ProviderDao();
echo $providerdao->add($provider)->getId();
$provider->setEmail("email@email.com");

?>
