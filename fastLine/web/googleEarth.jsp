<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="a" uri="http://jmaki/v1.0/jsp" %>
<html>
    <head>
        <link rel="stylesheet" href="jmaki-standard.css" type="text/css"></link>
        <title>Page Title</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    </head>
    <body>
        <div id="outerBorder">
            
            <div id="header">
                <div id="banner">Application Name
               
                </div>
                
                <div id="subheader">
                    
                    <div>
                        <a href="mailto:feedback@youraddress">Feedback</a> |
                        <a href="#">Site Map</a> |
                        <a href="#">Home</a>
                        <a:widget name="dojo.dijit.button" value="{label: 'Click Me'}" />

                    </div>
                    
                </div> <!-- sub-header -->
            </div> <!-- header -->

            <div id="main">
                <div id="leftSidebar">
                    
                    Sidebar Content Here
                    
                </div> <!-- leftSidebar -->

                <div id="content" style="height:400px">
                    
                  <a:widget name="google.map"
 args="{centerLat:-9.18887, zoom:13, mapType:'REGULAR', centerLon:-74.443359}"/>
                                   
</div> <!-- content -->
        
            </div> <!-- main -->
        </div> <!-- outerborder -->
    </body>
</html>
