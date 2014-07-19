<?php

/**
 * 
 *  asma3 nfassarlik !
 * bech ta3mel test 3al $_Get['id_service'] w 3al id_user = $service ->UserId si c bon tjib les valeur fil les champ sinon redirect add service aya riguel jawik w ki tou7il kalamni fil facebook :o bech t5allini wa 7di nn am:ap mich bech no6zorlik barcha bech na3mil 7aja en paralelle behi ok 
 * chniya mochkoltik!
 * behi s7i7a loulanin les fichiers?
 *  __dir__ ta3tik position de ton fichier bset ma tod5olich b3ath'ha ki t3ayit lel les fichier min kol blasa t7ot __dir__ bset dima yi7sib mil position du fichier original mich mnin 3ayatlou
 * 
 * t7ib ta3rif les fichier s7a7 wallé : 
 * require 'Ctrl + espace' (tu parcours ton fichier w ba3ed tzid __dir__ ;)  w ma tansach el / 
 * 
 */
require_once (__DIR__.'/../daoImp/CategoryDao.class.php');
require_once (__DIR__.'/../model/Category.class.php');
require_once (__DIR__.'/../daoImp/ProviderDao.class.php');
require_once (__DIR__.'/../model/Provider.class.php');
require_once (__DIR__.'/../daoImp/ServiceDao.class.php');
require_once (__DIR__.'/../model/Services.class.php');


$categoriedao = new CategoryDao();
$servicedao = new ServiceDao();
$providerdao = new ProviderDao();

if (!isset($_POST["id_service"])){
    header("location: ../liste_service.php");
    exit();
}

$id_service=$_POST["id_service"];
$id_user= 23; //$_SESSION['id_user'];
$service =  $servicedao->findById($id_service);

if (!(($servicedao->isExist($service)) and ($service->getProvider()->getId() == $id_user))){
    
    header("location: ../addService.php");
}

    // il faut initialiser les valeur à null;
        $name_service = null;


    if (!empty($_POST['name_service']))
        $service->setName($_POST['name_service']) ;
    
    if (!empty($_POST['desc_service']))
        $service->setDescription($_POST['desc_service'] );
    
    if (!empty($_POST['price_service']))
        $service->setPrice($_POST['price_service'] );
    
    if (!empty($_POST['stock_service']))
        $service->setStock($_POST['stock_service']) ;
    
    if (!empty($_POST['categorie'])){
        
        $categorie = $categoriedao->findById($_POST['categorie'] );
        $service->setCategory($categorie);     
    }
   
if ($servicedao->update($service))    
        header("location: ../liste_service.php?edit=succes");
    else
        header("location: ../edit_service.php?edit=echec&id=".$service->getId());
    
?>