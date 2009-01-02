<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : FastLine
    Created on : 16-nov-2008, 17:24:25
    Author     : Huachani
-->
<jsp:root version="2.1" xmlns:a="http://jmaki/v1.0/jsf" xmlns:df="http://java.sun.com/jsf/dynamicfaces" xmlns:f="http://java.sun.com/jsf/core"
    xmlns:h="http://java.sun.com/jsf/html" xmlns:jsfExt="http://java.sun.com/jsf/extensions/dynafaces" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="FastLine - Bienvenido !!!">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                    <df:ajaxTransaction id="ajaxTransaction1" inputs="page1:html1:body1:form1:userName1,page1:html1:body1:form1:iniciarSesion1" render="page1:html1:body1:form1:error,page1:html1:body1:form1:userAccount"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="background-color: rgb(139, 175, 228); -rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1"
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 22px; left: 0px; top: 0px; position: absolute; width: 406px" text="Bienvenido a FastLine"/>
                        <webuijsf:hyperlink actionExpression="#{FastLine.administracion_action}" id="administracion"
                            style="left: 576px; top: 336px; position: absolute" text="Administración"/>
                        <webuijsf:image height="265" id="image1" style="left: 24px; top: 96px; position: absolute" url="/resources/busAkat.jpg" width="504"/>
                        <webuijsf:hyperlink actionExpression="#{FastLine.quienSomos_action}" id="quienSomos" style="left: 48px; top: 72px; position: absolute" text="Quienes Somos?"/>
                        <webuijsf:staticText id="staticText1"
                            style="color: rgb(255, 255, 51); font-family: serif; font-size: 18px; height: 94px; left: 24px; top: 360px; position: absolute; width: 502px" text="FastLine es un sistema Web para venta y reserva de pasajes así como para brindar servicios de seguimiento de estado de encomiendas y seguimiento en ruta de los buses vía GPS. Estamos a su servicio. "/>
                        <webuijsf:hyperlink actionExpression="#{FastLine.reservarPasajes_action}" id="reservarPasajes"
                            style="left: 576px; top: 312px; position: absolute" text="Reservar Pasajes"/>
                        <webuijsf:image height="24" id="image2" style="left: 552px; top: 336px; position: absolute" url="/resources/utilities.png" width="24"/>
                        <webuijsf:image height="24" id="image4" style="left: 552px; top: 312px; position: absolute" url="/resources/lassists.png" width="24"/>
                        <webuijsf:image height="24" id="image5" style="left: 24px; top: 72px; position: absolute" url="/resources/xeyes.png" width="24"/>
                        <webuijsf:image height="264" id="image6" style="left: 24px; top: 456px; position: absolute" url="/resources/bitybyte48.png" width="792"/>
                        <webuijsf:label binding="#{FastLine.userLabel}" id="userLabel"
                            style="left: 576px; top: 120px; position: absolute; text-align: right; width: 72px" text="Usuario:"/>
                        <webuijsf:label binding="#{FastLine.passLabel}" id="passLabel"
                            style="left: 552px; top: 144px; position: absolute; text-align: right; width: 96px" text="Contraseña:"/>
                        <webuijsf:textField binding="#{FastLine.userName1}" id="userName1"
                            onKeyUp="DynaFaces.Tx.fire(&quot;ajaxTransaction1&quot;, &quot;userName1&quot;) "
                            style="left: 648px; top: 120px; position: absolute" valueChangeListenerExpression="#{FastLine.userName1_processValueChange}"/>
                        <webuijsf:passwordField binding="#{FastLine.pass1}" id="pass1" style="left: 648px; top: 144px; position: absolute"/>
                        <webuijsf:staticText binding="#{FastLine.mensajelogginLabel}" id="mensajelogginLabel"
                            style="height: 22px; left: 552px; top: 96px; position: absolute; width: 262px" text="Ingrese su nombre de usuario y su contraseña"/>
                        <webuijsf:button actionExpression="#{FastLine.iniciarSesion_action}" binding="#{FastLine.iniciarSesion}" id="iniciarSesion"
                            onClick="DynaFaces.Tx.fire(&quot;ajaxTransaction1&quot;, &quot;iniciarSesion&quot;) "
                            style="height: 24px; left: 695px; top: 168px; position: absolute" text="Iniciar Sesión"/>
                        <webuijsf:staticText id="staticText3" style="left: 552px; top: 216px; position: absolute; width: 142px" text="Para    registrarte has click"/>
                        <webuijsf:hyperlink actionExpression="#{FastLine.nuevoUsuario_action}" id="nuevoUsuario1"
                            style="left: 696px; top: 216px; position: absolute" text="aqui"/>
                        <webuijsf:staticText binding="#{FastLine.error}" id="error" style="color: red; font-size: 14px; height: 24px; left: 576px; top: 264px; position: absolute; width: 168px"/>
                        <webuijsf:staticText binding="#{FastLine.userAccount}" id="userAccount"
                            style="color: blue; font-size: 14px; height: 24px; left: 528px; top: 24px; position: absolute; width: 288px" visible="false"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
