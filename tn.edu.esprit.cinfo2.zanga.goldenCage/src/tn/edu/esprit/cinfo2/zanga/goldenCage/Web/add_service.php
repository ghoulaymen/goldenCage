<?php
require_once (__DIR__ . '/daoImp/CategoryDao.class.php');
require_once (__DIR__ . '/model/Category.class.php');
$categoriedao = new CategoryDao();
$categories = $categoriedao->findAll();
?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />

        <title>Add Service</title>
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
                                        <a href="AjouterService.html" class="nav-top-item current">
                                            Add Service
                                        </a>
                                    </li>

                                    <li>
                                        <a href="ModifierService.html" class="nav-top-item ">
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

                                    <h3>Add Service</h3>

                                    <ul class="content-box-tabs">
                                        <li><a href="" class="default-tab">Table</a></li> <!-- href must be unique and match the id of target div -->

                                    </ul>

                                    <div class="clear"></div>

                                </div> <!-- End .content-box-header -->

                                <div class="content-box-content">

                                    <div class="tab-content default-tab" id="tab1"> <!-- This is the target div. id must match the href of this div's tab -->

                                        <div class="notification attention png_bg">
                                            <a href="#" class="close"><img src="resources/images/icons/cross_grey_small.png" title="Close this notification" alt="close" /></a>
                                            <div>
                                                This box lets you add a Service, you can close this notification with the cross on the top right.
                                            </div>
                                        </div>

                                        <form id="monform" name="form1" method="post" enctype="multipart/form-data" action="./controller/addService.php">
                                            <table>

                                                <thead>
                                                    <tr>       
                                                        <th>Name Service</th>
                                                        <td><input type="text" name="name_service" required /></td>
                                                    </tr>   
                                                    <tr>  
                                                        <th>Description</th>
                                                        <td><TEXTAREA rows="5" name="desc_service" onfocus="if(this.value=='Write your description...')this.value='';" onBlur="if(this.value=='')this.value='Write your description...'; ">Write your description...</TEXTAREA></td>
                                                    </tr>
                                                    <tr>								
                                                        <th> Price </th>
                                                        <td><input type="text" name="price_service" required />DT</td>
                                                    </tr>
                                                    <tr>								
                                                        <th>Stock </th>
                                                        <td><input type="text" name="stock_service" required /></td>
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


                                                                        <option value="<?php echo $categorie->getId() ?>"><?php echo $categorie->getName() ?></option>
                                                                    <?php }endif; ?>
                                                            </select>  
                                                        </td>
                                                    </tr>


                                                </thead>

                                                <tfoot>
                                                    <tr>
                                                        <td colspan="6">
                                                            <div class="bulk-actions align-left">
                                                                <input class="button" type="submit" name="add_service"  value="Add" />
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
