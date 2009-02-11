<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     
        <script src="http://maps.google.com/maps?file=api&amp;v=2&amp;key=ABQIAAAASSGl_izfUowx6JE1QGdX_BRxmEMFNWkFyOXteSm4R2a8j6JoEBQekgoAuSKncG3CU2gczYsRhOhJCw" type="text/javascript"></script>

 
        </head>
        
            
     <body >
             <table border=1>
      <tr>
        <td width = 100 valign="top" style="text-decoration: underline; color: #1124ff;">
           <div id="side_bar"></div>
        </td>
        <td>
           <div id="map2" style="width: 550px; height: 450px"></div>
        </td>
        
      </tr>

    </table>
         <script type="text/javascript">
                    //<![CDATA[
                    
          if (GBrowserIsCompatible()) {
                        
                    var side_bar_html = "";
                    var gmarkers = [];

                    function createMarker(point,name,html) {
                        var marker = new GMarker(point);
                        GEvent.addListener(marker, "click", function() {
                          marker.openInfoWindowHtml(html); });
                      // guardamos la info q necesitamos usar despues para el side_bar
                        gmarkers.push(marker);
                      // poner una linea a la barra side_bar html
                         side_bar_html += '<a href="javascript:myclick(' + (gmarkers.length-1) + ')">' + name + '<\/a><br>';
                         return marker;
                       
                    }
                    function myclick(i) {
                        GEvent.trigger(gmarkers[i], "click");
                    }

                    
                    var map2r = new GMap2(document.getElementById("map2"));
                    map2r.setCenter(new GLatLng(-9.18887, -74.443359), 5);
                    map2r.addMapType(G_SATELLITE_3D_MAP);
                    map2r.addControl(new GLargeMapControl());
                    map2r.addControl(new GMapTypeControl());
                    var point;
                    var marker;
                    <%@include file="DatosDepartamentos.jsp"%>
                    <%
                   
                    
                    //debo tener almacenado en un arreglo de strings 
                    //las direcciones de los KMLs
                    int numDepart=2;
                    String[] items= new String[numDepart];
                    //int[] arreglo = new int[numDepart];
                    items[0]="http://www.velchsalud.com/fastlinephp/Departamentos/AREQUIPA.kml";
                    //items[1]="http://www.velchsalud.com/fastlinephp/Departamentos/IQUITOS.KML";
                    out.println("var kml2r;");
                    for(int cont=0;cont<2;cont++)
                     {   


                            String dir=items[cont];

                            out.print(" kml2r = new GGeoXml(");
                            out.print(comi);
                            out.print(dir);
                            out.print(comi);
                            out.print(");");
                            out.println("map2r.addOverlay(kml2r);");
                      }
                     for(int cont=0;cont<24;cont++)//el limite debe se el numero de dep
                     { 
                            //String dir=items[cont];
                             //point = new GLatLng(43.65654,-79.90138);
                            out.print("var point = new GLatLng("+depll[cont][0]+","+depll[cont][1]+");"); 
                            out.print(" marker = createMarker(point,");
                            out.print(comi+departamentos[cont]+comi+",");
                            //out.print(" 'Oficina principal FastLine Arequipa <img src=");
                            //out.print(comi+"images/aqp.jpeg"+comi+"width=150 height=100> ');");
                           out.println(" 'Bienvenido a "+departamentos[cont]+" FastLine <img src="+comi+"departamentosImages/"+departamentos[cont]+".jpeg"+comi+" width=150 height=100> ');");
                            //out.println(depInfo[0]);
                            out.println("map2r.addOverlay(marker);");
                      }
                    
                  


                    
                    
                    
                    %>
                    document.getElementById("side_bar").innerHTML = side_bar_html;

          }

                    //]]>
        </script>
 
       
    </body>
</html>
