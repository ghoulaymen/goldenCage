<?php


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

require_once (__DIR__.'/daoImp/CategoryDao.class.php');
require_once (__DIR__.'/model/Category.class.php');
require_once (__DIR__.'/daoImp/ProviderDao.class.php');
require_once (__DIR__.'/model/Provider.class.php');
require_once (__DIR__.'/daoImp/ServiceDao.class.php');
require_once (__DIR__.'/model/Services.class.php');

$categoriedao = new CategoryDao();
$servicedao = new ServiceDao();
$providerdao = new ProviderDao();
if (isset($_POST['add_service'])): // si le forumlaire a envoyé des données par le bouton submit
    // il faut initialiser les valeur à null;
        $name_service = null;


    if (!empty($_POST['name_service']))
        $name_service = $_POST['name_service'] ;
    
    if (!empty($_POST['desc_service']))
        $desc_service = $_POST['desc_service'] ;
    
    if (!empty($_POST['price_service']))
        $price_service = $_POST['price_service'] ;
    
    if (!empty($_POST['stock_service']))
        $stock_service = $_POST['stock_service'] ;
    
    if (!empty($_POST['categorie'])){
        $id_categorie = $_POST['categorie'] ;
        $categorie = $categoriedao->findById($id_categorie);
    }
    $provider = $providerdao->findById(23);
    
    $service = new Services(null, $name_service, $desc_service, $price_service, $stock_service, null, $provider, $categorie, 'service');
     
    if ($servicedao->add($service))
        header ("location: ../liste_service.php?succes=1");
endif;


?>
