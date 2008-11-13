<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Page1
    Created on : 04/11/2008, 11:31:00 PM
    Author     : itachi
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" imageURL="/resources/Akatsuki_logo.bmp" style="background-color: rgb(0, 0, 0); -rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:staticText id="staticText1"
                            style="color: #009900; font-size: 24px; height: 22px; left: 312px; top: 48px; position: absolute; width: 240px" text="Bienvenido a FastLine"/>
                        <webuijsf:staticText id="staticText2"
                            style="color: #cccccc; font-size: 24px; height: 142px; left: 144px; top: 96px; position: absolute; width: 622px" text="FastLine es un sistema Web para venta y reserva de pasajes así como para brindar servicios de seguimiento de estado de encomiendas y seguimiento en ruta de los buses vía GPS. Estamos a su servicio. "/>
                        <webuijsf:button actionExpression="#{Page1.login_action}" id="login"
                            style="color: navy; font-size: 18px; height: 24px; left: 359px; top: 288px; position: absolute; width: 96px" text="Sing In"/>
                        <webuijsf:textField id="textField1" style="height: 24px; left: 216px; top: 264px; position: absolute; width: 96px"/>
                        <webuijsf:image height="360" id="image1" style="left: 72px; top: 384px; position: absolute" url="/resources/busAkat.jpg" width="683"/>
                        <webuijsf:textField id="textField2" style="left: 216px; top: 288px; position: absolute"/>
                        <webuijsf:hyperlink actionExpression="#{Page1.nuevoUsuario_action}" id="nuevoUsuario"
                            style="left: 360px; top: 336px; position: absolute" text="aqui"/>
                        <webuijsf:label id="label1" style="color: rgb(255, 255, 255); left: 96px; top: 336px; position: absolute" text="Para registrarte y obtener tu cuenta has click"/>
                        <webuijsf:label id="label2" style="color: rgb(255, 255, 255); height: 24px; left: 168px; top: 264px; position: absolute; width: 48px" text="Login"/>
                        <webuijsf:label id="label3" style="color: rgb(255, 255, 255); left: 144px; top: 288px; position: absolute" text="Password"/>
                        <br/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
