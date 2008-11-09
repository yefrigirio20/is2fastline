<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<title>Mi primer Mapa</title>
<script src="http://maps.google.com/maps?file=api&v=1&key=ABQIAAAASSGl_izfUowx6JE1QGdX_BQ3N8-5BmYkxEbTWz8WOJAHMTKz6BQnR_O-DPINGU9gCkvOiH0_5HeJ9w" type="text/javascript"></script>
</head>
<body>
<?= 
echo("La primera prueba si se puede usar google earth en nuestro proyecto\n");
echo("Se muestra una consulta de los limites de selva alegre- Arequipa :)");
echo("archivo KML generado por Huachani Villas, Raul");
    
    

    

<div id="map" style="width: 500px; height: 500px"></div>
<script type="text/javascript">
//< ![CDATA[
if (GBrowserIsCompatible()) { 

      // A function to create the marker and set up the event window
      // Dont try to unroll this function. It has to be here for the function closure
      // Each instance of the function preserves the contends of a different instance
      // of the "marker" and "html" variables which will be needed later when the event triggers.    
      function createMarker(point,html) {
        var marker = new GMarker(point);
        GEvent.addListener(marker, "click", function() {
          marker.openInfoWindowHtml(html);
        });
        return marker;
      }

      // Display the map, with some controls and set the initial location 
      var map = new GMap2(document.getElementById("map"));
      map.addMapType(G_SATELLITE_3D_MAP);
      map.addControl(new GLargeMapControl());
      map.addControl(new GMapTypeControl());
      map.setCenter(new GLatLng(-15.685368,-72.298941),8);
    
      // Set up three markers with info windows 
    
      var point = new GLatLng(-15.685368,-72.298941);
      var marker = createMarker(point,'<div style="width:240px">Some stuff to display in the First Info Window. With a <a href="http://www.econym.demon.co.uk">Link<\/a> to my home page<\/div>')
      map.addOverlay(marker);

      var point = new GLatLng(-15.685368,-70.298941);
      var marker = createMarker(point,'Some stuff to display in the<br>Second Info Window')
      map.addOverlay(marker);

      var point = new GLatLng(-16.82589,-73.10040);
      var marker = createMarker(point,'Some stuff to display in the<br>Third Info Window')
      map.addOverlay(marker);
      var kml = new GGeoXml("http://fastline.velchsalud.com/Jacobo%20Hunter.kml");
      map.addOverlay(kml)

    }
    
    // display a warning if the browser was not compatible
    else {
      alert("Lo siento pero su navegador no soporta Google Maps API :( ");
    }

    // This Javascript is based on code provided by the
    // Blackpool Community Church Javascript Team
    // http://www.commchurch.freeserve.co.uk/   
    // http://econym.googlepages.com/index.htm




//]]>
</script>
</body>
</html> 