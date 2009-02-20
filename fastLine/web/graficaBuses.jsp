<%-- 
    Document   : graficaBuses
    Created on : 20/02/2009, 06:52:44 AM
    Author     : Rene
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


        <link href="themes/default.css" rel="stylesheet" type="text/css"/>
          <link href="themes/theme1.css" rel="stylesheet" type="text/css" >	 </link>
          <link href="themes/alphacube.css" rel="stylesheet" type="text/css"/>
          <link href="themes/spread.css" rel="stylesheet" type="text/css" >	 </link>
          <link href="themes/darkX.css" rel="stylesheet" type="text/css" >	 </link>
          <link href="themes/mac_os_x.css" rel="stylesheet" type="text/css" >	 </link>
          <link href="themes/alert.css" rel="stylesheet" type="text/css" >	 </link>
            <link href="themes/alert_lite.css" rel="stylesheet" type="text/css" >	 </link>
          <script type="text/javascript" src="javascripts/prototype.js"> </script>
          <script type="text/javascript" src="javascripts/effects.js"> </script>
          <script type="text/javascript" src="javascripts/window.js"> </script>
          <script type="text/javascript" src="javascripts/window_effects.js"> </script>
          <script type="text/javascript" src="javascripts/debug.js"> </script>
          <!--los de proto -->
          <script type='text/javascript' src='js/prototype.js'></script>
        <script type='text/javascript' src='js/scriptaculous.js?load=effects'></script>
        <script type='text/javascript' src='js/prototip.js'></script>
        <script type='text/javascript' >
        function openConfirmDialog() {
                Dialog.confirm("Confirme usted que desea viajar con las opciones elegidas",
                                {windowParameters: {width:340, height:100}, okLabel: "Comprar",
                                    cancel:function(win) {debug("cancel confirm panel")},
                                    ok:function(win) {debug("validate confirm panel");
                                    top.close();
                                    open('despedida.htm', '',"")
                                    return true}
                                    });
            }
        </script>
        <link rel="stylesheet" type="text/css" href="css/prototip.css" />
        <!--los mios -->

        <style type="text/css">
            <!--
            #borderForm {  position:inherit;
              top:918px;
              left:11px;
              width:330px;
              height:500px;
              border: 1px solid #000;
              overflow:hidden;
            }
            #border {  position:inherit;
              top:421px;
              left:17px;
              width:866px;
              height:548px;
              border: 1px solid #000;
              overflow:hidden;
            }
            #container {  position:absolute;
              top:25px;
              left:20px;
              width:787px;
              height:500px;
              overflow:hidden;
              background:#DAEE9B;
              z-index:0;
            }
            -->
        </style>

  
        <%
        //System.out.print("hola");
        int numNodos=8; int cont=0;
        int x=0; int y=0;
        String estilo="style2";
        int w=58;
        int h=34;
        char comi='"';
        out.print("<script>var win=new Array("+numNodos+")</script>;");
        while(cont<numNodos)
         {
                out.print(" <script>");
                //out.print("win["+cont+"]=new Window({id:"+comi+"win"+cont+comi+", title: Ruta");
                out.print("win["+cont+"]=new Window({id:"+comi+"win"+cont+comi+", title: "+comi+"Ruta"+cont+comi+",className: "+comi+"spread"+comi+", resizable:false, closable: false,draggable:false, width:200, height:150});"+"\n");
                out.print("win["+cont+"].getContent().innerHTML ="+comi+"<p class="+estilo+"><font color=#0000FF  size=2>Bus:De Casa A Terminal</font><br><font color=#0000FF  size=2>Avion:De Terminal A Ayacucho</font><br><font color=#0000FF  size=2>Tiempo:fecha </font><font color=#0000FF  size=2>Precio:precio </font></p><br><br><br><br><p><img src=imagens/bus.gif width="+w+" height="+h+"><font color=#0000FF  size=2>Bus:De Casa A Terminal</font><br><img src=imagens/avion2.jpg width=65 height=47><font color=#0000FF  size=2>Avion:De Terminal A Ayacucho</font><br><img src=imagens/reloj.jpg width=62 height=49><font color=#0000FF  size=2>Tiempo:fecha </font><br><br></p>Opciones de ruta: seleccione una de las rutas posibles y el medio<br>"+comi+";");
                out.print("win["+cont+"].setDestroyOnClose();"+"\n");
                out.print("win["+cont+"].setLocation("+x+","+y+");"+"\n");
                out.print("win["+cont+"].show();"+"\n");
                out.print("win["+cont+"].toFront();"+"\n");
                out.print("</script>");
                

                cont=cont+1;
                x=x+100;
                y=y+215;
         }
               /*out.print( "alert(\"".$cont."\" )"."\n   ";*/
               //posicion resultado 150+
               int posResultado=x+150;
               out.print( "<script>");
               out.print( "var winc=new Window({id:"+comi+"re"+cont+comi+", title: "+comi+"Resultado"+comi+",resizable:false, closable: false,draggable:false, width:900, height:100});"+"\n");
               out.print( "winc.getContent().innerHTML ="+comi+"<font size=2>Los resultados se su consulta son </font><br><input type=button name=Detalles value=Comprar onClick=openConfirmDialog() >"+comi+";");
               out.print("winc.setDestroyOnClose();");
               out.print("winc.setLocation("+posResultado+","+0+");");
               out.print("winc.show();");
               out.print("winc.toFront();");
               out.print("</script>");
               out.print("<br>");







        %>





















