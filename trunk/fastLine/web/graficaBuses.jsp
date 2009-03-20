<%-- 
    Document   : graficaBuses
    Created on : 20/02/2009, 06:52:44 AM
    Author     : Rene
--%>

   <HTML>
<HEAD>
      

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
              width:600px;
              height:900px;
              overflow:hidden;
              background:#DAEE9B;
              z-index:0;
            }
            -->
        </style>
 </HEAD>
 <BODY>
 <div id="container"></div>
            
      
      

<jsp:useBean id="datosAsiento" class="fastline.ConseguirDatosbase" scope="session"/>

        <%
        //ConseguirDatosbase datosAsiento= new ConseguirDatosbase();
        //System.out.print("hola");
        //out.print(datosAsiento.getApplicationBean1().getNombreusuario());
        int asientos[]=datosAsiento.getApplicationBean1().getEstadoAsientos();
        if(asientos!=null)
        {
             String estilo="style2";
        int numeroAsientos=asientos.length-1;//siempre impar y(numeroAsientos-1) multiplo de 4
        int totalFilas=(int)(numeroAsientos-1)/4;
        int untimaFila=1;
        int w=10;
        int h=20;
        int cont=1;//contador de asientos
        int x=0; int y=0;
        int vspace=35;
        int hspace=120;
        char comi='"';
        int contColumna=1;
        String className="alphacube";
        out.print("<script>var win=new Array("+numeroAsientos+");</script>");
        for(int asiento=1;asiento<=numeroAsientos;asiento++)
        {   //-----------------------
            //extraigo la los valores de la base: estadoAsiento el numero de
            //asiento se genera de 1 a numeroAsientos
            //int numeroAsiento=1 + (int)(Math.random() * 6); //produce los enteros 1 a 6
            int numeroAsiento=cont;
            //int estadoAsiento=(int)(Math.random() * 2);///produce cero o uno
            int estadoAsiento=asientos[cont];///produce cero o uno
            //-------------------------


            if(contColumna==6)
                {    y=0;
                     x=x+h+vspace;
                     untimaFila=untimaFila+1;
                     contColumna=1;
                }
            if(contColumna==3 && untimaFila==totalFilas)
               {             if(estadoAsiento==1)
                                    className="spread";
                            out.print(" <script>");
                            //out.print("win["+cont+"]=new Window({id:"+comi+"win"+cont+comi+", title: Ruta");
                            //class :alphacube spread
                            out.print("win["+cont+"]=new Window({id:"+comi+"win"+cont+comi+", title: "+comi+cont+"____"+comi+",className: "+comi+className+comi+", resizable:false, closable: false,draggable:false, minimizable: false, width:"+w+", height:"+h+", top:0, left: 1, parent:$('container') });"+"\n");
                            //<p class="+estilo+"><font color=#0000FF  size=2>Bus:De Casa A Terminal</font><br><font color=#0000FF  size=2>Avion:De Terminal A Ayacucho</font><br><font color=#0000FF  size=2>Tiempo:fecha </font><font color=#0000FF  size=2>Precio:precio </font></p><br><br><br><br><p><img src=imagens/bus.gif width="+w+" height="+h+"><font color=#0000FF  size=2>Bus:De Casa A Terminal</font><br><img src=imagens/avion2.jpg width=65 height=47><font color=#0000FF  size=2>Avion:De Terminal A Ayacucho</font><br><img src=imagens/reloj.jpg width=62 height=49><font color=#0000FF  size=2>Tiempo:fecha </font><br><br></p>Opciones de ruta: seleccione una de las rutas posibles y el medio<br>
                            out.print("win["+cont+"].getContent().innerHTML ="+comi+"<font color=#0000FF  size=4>"+cont+"</font>"+comi+";");
                            // win.setContent("content");
                            out.print("win["+cont+"].setDestroyOnClose();"+"\n");
                            out.print("win["+cont+"].setLocation("+x+","+y+");"+"\n");
                            out.print("win["+cont+"].show();"+"\n");
                            out.print("win["+cont+"].toFront();"+"\n");
                            out.print("</script>");
                            y=y+hspace;
                            contColumna=contColumna+1;
                            cont=cont+1;
                            className="alphacube";

               }
               else
               {     if(contColumna==3)
                        {   y=y+hspace;
                            contColumna=contColumna+1;
                            asiento--;


                        }
                    else{
                            if(estadoAsiento==1)
                                    className="spread";
                            out.print(" <script>");
                            //out.print("win["+cont+"]=new Window({id:"+comi+"win"+cont+comi+", title: Ruta");
                            //class :alphacube spread
                            out.print("win["+cont+"]=new Window({id:"+comi+"win"+cont+comi+", title: "+comi+cont+"____"+comi+",className: "+comi+className+comi+", resizable:false, closable: false,draggable:false, minimizable: false, width:"+w+", height:"+h+", top:0, left: 1, parent:$('container') });"+"\n");
                            //<p class="+estilo+"><font color=#0000FF  size=2>Bus:De Casa A Terminal</font><br><font color=#0000FF  size=2>Avion:De Terminal A Ayacucho</font><br><font color=#0000FF  size=2>Tiempo:fecha </font><font color=#0000FF  size=2>Precio:precio </font></p><br><br><br><br><p><img src=imagens/bus.gif width="+w+" height="+h+"><font color=#0000FF  size=2>Bus:De Casa A Terminal</font><br><img src=imagens/avion2.jpg width=65 height=47><font color=#0000FF  size=2>Avion:De Terminal A Ayacucho</font><br><img src=imagens/reloj.jpg width=62 height=49><font color=#0000FF  size=2>Tiempo:fecha </font><br><br></p>Opciones de ruta: seleccione una de las rutas posibles y el medio<br>
                            out.print("win["+cont+"].getContent().innerHTML ="+comi+"<font color=#0000FF  size=4>"+cont+"</font>"+comi+";");
                            // win.setContent("content");
                            out.print("win["+cont+"].setDestroyOnClose();"+"\n");
                            out.print("win["+cont+"].setLocation("+x+","+y+");"+"\n");
                            out.print("win["+cont+"].show();"+"\n");
                            out.print("win["+cont+"].toFront();"+"\n");
                            out.print("</script>");
                            y=y+hspace;
                            contColumna=contColumna+1;
                            cont=cont+1;
                            className="alphacube";
                            //x=x+100;
                    }
               }




         }

        }
        else
        {
        out.print(datosAsiento.getApplicationBean1().getNombreusuario());
        }
        
      

        //graficamos la ultima fila del bus
        


                                  /*out.print( "alert(\"".$cont."\" )"."\n   ";*/
               //posicion resultado 150+
               /*int posResultado=x+150;
               out.print( "<script>");
               out.print( "var winc=new Window({id:"+comi+"re"+cont+comi+", title: "+comi+"Resultado"+comi+",resizable:false, closable: false,draggable:false, width:900, height:100});"+"\n");
               out.print( "winc.getContent().innerHTML ="+comi+"<font size=2>Los resultados se su consulta son </font><br><input type=button name=Detalles value=Comprar onClick=openConfirmDialog() >"+comi+";");
               out.print("winc.setDestroyOnClose();");
               out.print("winc.setLocation("+posResultado+","+0+");");
               out.print("winc.show();");
               out.print("winc.toFront();");
               out.print("</script>");
               out.print("<br>");*/







        %>

</BODY>
</HTML>
