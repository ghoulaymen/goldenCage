
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
require_once (__DIR__.'/daoImp/CategoryDao.class.php');
require_once (__DIR__.'/model/Category.class.php');
require_once (__DIR__.'/daoImp/ProviderDao.class.php');
require_once (__DIR__.'/model/Provider.class.php');
require_once (__DIR__.'/daoImp/ServiceDao.class.php');
require_once (__DIR__.'/model/Services.class.php');


$categoriedao = new CategoryDao();
$servicedao = new ServiceDao();
$providerdao = new ProviderDao();

if (!isset($_GET["id_service"])){
    header("location: ../liste_service.php");
    exit();
}

$id_service=$_GET["id_service"];

$id_user= 23; //$_SESSION['id_user'];
$service =  $servicedao->findById($id_service);
echo __line__;
if (!(($servicedao->isExist($service)) and ($service->getProvider()->getId() == $id_user))){
   
    header("location: ../addService.php");
    exit();
}

$categories = $categoriedao->findAll();
?>



<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
 
 	<head>
		
		<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
		
		<title>Update Service</title>
		<link rel="shortcut icon" href="favicon.ico" >
   <link rel="icon" type="image/gif" href="animated_favicon1.gif" >
		<!--                       CSS                       -->
	  
		<!-- Reset Stylesheet -->
		<link rel="stylesheet" href="resources/css/reset.css" type="text/css" media="screen" /> 
	  
		<!-- Main Stylesheet -->
		<link rel="stylesheet" href="resources/css/style.css" type="text/css" media="screen" /> 
		
		<!-- Invalid Stylesheet. This makes stuff look pretty. Remove it if you want the CSS completely valid -->
		 <link rel="stylesheet" href="resources/css/invalid.css" type="text/css" media="screen" />	 
		
		<!-- Colour Schemes -->
	  
		<!--Default colour scheme is green. Uncomment prefered stylesheet to use it. -->
		
		<link rel="stylesheet" href="resources/css/blue.css" type="text/css" media="screen" />
		
		<!-- <link rel="stylesheet" href="resources/css/red.css" type="text/css" media="screen" />  -->
	 
		
		
		<!-- Internet Explorer Fixes Stylesheet -->
		
		<!--[if lte IE 7] -->
			<link rel="stylesheet" href="resources/css/ie.css" type="text/css" media="screen" />
		<!-- [endif] -->
		
		<!--                       Javascripts                       -->
  
		<!-- jQuery -->
		<script type="text/javascript" src="resources/scripts/jquery-1.3.2.min.js"></script>
		
		<!-- jQuery Configuration -->
		<script type="text/javascript" src="resources/scripts/simpla.jquery.configuration.js"></script>
		
		<!-- Facebox jQuery Plugin -->
		<script type="text/javascript" src="resources/scripts/facebox.js"></script>
		
		<!-- jQuery WYSIWYG Plugin -->
		<script type="text/javascript" src="resources/scripts/jquery.wysiwyg.js"></script>
		
		<!-- Internet Explorer .png-fix -->
		
		<!--[if IE 6]>
			<script type="text/javascript" src="resources/scripts/DD_belatedPNG_0.0.7a.js"></script>
			<script type="text/javascript">
				DD_belatedPNG.fix('.png_bg, img, li');
			</script>
		<![endif]-->
		
	</head>
	
	
	<body><div id="body-wrapper"> <!-- Wrapper for the radial gradient background -->
		
		<div id="sidebar"><div id="sidebar-wrapper"> <!-- Sidebar with logo and menu -->
		  
			<!-- Logo (221px wide) -->
			<a href="#"><img id="logo" src="images\Logo.png" alt="" /></a>
		    <br/><br/><br/><br/><br/><br/>
			<!-- Sidebar Profile links -->
			<div id="profile-links">
				
				
				<a href="index.html" title="Sign Out" > <img  src="resources\images\icons\SignOut.png"  /> Sign Out</a>
			   
			</div>       
			
			<ul id="main-nav">  <!-- Accordion Menu -->
				
				
				<li> 
					<a href="GestionService.html" class="nav-top-item "> <!-- Add the class "current" to current menu item -->
					 Management Service
					</a>
				</li>
				
				<li>
					<a href="AjouterService.html" class="nav-top-item">
						Add Service
					</a>
				</li>
				
				<li>
					<a href="#" class="nav-top-item current">
						Update Service
					</a>
				</li>
				
				<li>
					<a href="Demande_cart.html" class="nav-top-item ">
						Management of Cart
					</a>
				</li>
				     
				
			</ul> <!-- End #main-nav -->
			
		</div></div> <!-- End #sidebar -->
		
		<div id="main-content"> <!-- Main Content Section with everything -->
			
			
			
			<!-- Page Head -->
			<h2>Welcome  <FONT COLOR="#3366FF">Admin </FONT></h2>
			<p id="page-intro">What do you want ?</p>
			
			<div class="clear"></div> <!-- End .clear -->
			
			
			<div class="clear"></div>
			<!--********************************************************** -->
			<div class="content-box"><!-- Start Content Box -->
				
				<div class="content-box-header">
					
					<h3>Update Service</h3>
					
					<ul class="content-box-tabs">
						<li><a href="#tab1" class="default-tab">Table</a></li> <!-- href must be unique and match the id of target div -->
						
					</ul>
					
					<div class="clear"></div>
					
				</div> <!-- End .content-box-header -->
				
				<div class="content-box-content">
			   
					<div class="tab-content default-tab" id="tab1"> <!-- This is the target div. id must match the href of this div's tab -->
					<?php if (!empty($_GET['edit'])) : ?>
						<div class="notification attention png_bg">
							<a href="#" class="close"><img src="resources/images/icons/cross_grey_small.png" title="Close this notification" alt="close" /></a>
							<div>
                                                            <?php
                                                                if ($_GET['edit']=='succes')
                                                                        echo "Succes Edit Service";
                                                                else 
                                                                if ($_GET['edit']=='error')
                                                                        echo "Error Edit Service";    
                                                                
                                                                    
                                                            
                                                            ?>
								
							</div>
						</div>
                                            <?php endif; ?>
						 <form id="monform" name="form1" method="post" enctype="multipart/form-data" action="controller/editService.php">
                                                                <input type="hidden" name="id_service" value="<?php echo $service->getId()?>"/>
                                                     
                                                     <table>
							
							<thead>
								<tr>
								<th>Name Service</th>
								<td><input type="text" name="name_service" value="<?php echo $service->getName()  ?> " required /></td>
								</tr>
								<tr>
								<th>Description</th>
								<td><textarea rows="5" name="desc_service" required><?php echo $service->getDescription()  ?></textarea></td>         
								</tr>
								<tr>
								<th> Price </th>
							    <td><input type="text" name="price_service" value="<?php echo $service->getPrice()  ?>" required /></td>
                                </tr>
                                <tr>								
								<th>Stock </th>
								<td><input type="text" name="stock_service" value=" <?php echo $service->getStock()  ?>" required /></td>
								</tr>
                                <tr> 
								<th>Image </th>
								<td><input type="file" name="image_service"></td>
								</tr>
								<tr>
								<th>Category </th>
								<td>
                                                               <select name="categorie" >
                                                                   
                                                                <?php if (count($categories)):foreach ($categories as $categorie) { ?>


                                                                        <option value="<?php echo $categorie->getId() ?>"   <?php if ($categorie->getId() == $service->getCategory()->getId()) echo "selected" ?>><?php echo $categorie->getName() ?></option>
                                                                    <?php }endif; ?>
                                                                 </select> 
								</td>
								</tr>
								
								
							</thead>
						 
							<tfoot>
								<tr>
									<td colspan="6">
										<div class="bulk-actions align-left">
										<input class="button" type="submit" name="bouton"  value="update_service" />
										<input class="button_annuler" type="button" value="Cancel" name="Annuler" onclick="window.location='liste_service.php';">
										</div>
										<div class="clear"></div>
									</td>
								</tr>
							</tfoot>
							
						</table>
					    </form>	
					</div> <!-- End #tab1 -->
					
					        
					
				</div> <!-- End .content-box-content -->
				
			</div> <!-- End .content-box -->
			
			<!--********************************************************** -->
			<div id="footer">
				<small>
						&#169; Copyright 2014 | Design by <FONT COLOR="#00cccc">GoldenCage</font>
				</small>
			</div><!-- End #footer -->
			
		</div> <!-- End #main-content -->
		
	</div></body>
  
</html>
