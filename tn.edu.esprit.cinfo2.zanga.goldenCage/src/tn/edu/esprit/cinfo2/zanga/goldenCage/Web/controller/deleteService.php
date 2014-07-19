<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// jib les fichier nécéssaires ici provider et services ..
require_once (__DIR__.'/../daoImp/ServiceDao.class.php');
require_once (__DIR__.'/../daoImp/ProviderDao.class.php');

require_once (__DIR__.'/../model/Services.class.php');
require_once (__DIR__.'/../model/Provider.class.php');


$servicedao = new ServiceDao();
$providerdao = new ProviderDao();


$id = $_GET['id'];


$provider = $providerdao->findById(23);

$service =  $servicedao->findById($id);
echo __LINE__;
if (($service!= NULL)  and ($provider->getId() == $service->getProvider()->getId()))
  
   if( $servicedao->remove($service) ) echo "delete succes" ; else echo "error delete";

header ("location: ../liste_service.php?succes=1");
    
?>
