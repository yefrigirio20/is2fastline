<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : LogIn
    Created on : 16-nov-2008, 17:49:57
    Author     : Huachani
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="background-color: rgb(139, 175, 228); -rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1"
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 46px; left: 72px; top: 0px; position: absolute; width: 166px" text="FastLine"/>
                        <webuijsf:label id="label2" style="left: 48px; top: 96px; position: absolute; text-align: right; width: 72px" text="Usuario:"/>
                        <webuijsf:label id="label3" style="left: 24px; top: 120px; position: absolute; text-align: right; width: 96px" text="Contraseña:"/>
                        <webuijsf:textField id="userName" style="left: 120px; top: 96px; position: absolute"/>
                        <webuijsf:passwordField id="pass" style="left: 120px; top: 120px; position: absolute"/>
                        <webuijsf:staticText id="staticText1" style="height: 22px; left: 24px; top: 72px; position: absolute; width: 262px" text="Ingrese su nombre de usuario y su contraseña"/>
                        <webuijsf:button actionExpression="#{LogIn.iniciarSesion_action}" id="iniciarSesion"
                            style="height: 24px; left: 167px; top: 144px; position: absolute" text="Iniciar Sesión"/>
                        <webuijsf:staticText id="staticText2" style="left: 24px; top: 192px; position: absolute; width: 142px" text="Para    registrarte has click"/>
                        <webuijsf:hyperlink actionExpression="#{LogIn.nuevoUsuario_action}" id="nuevoUsuario"
                            style="position: absolute; left: 168px; top: 192px" text="aqui"/>
                        <webuijsf:image height="72" id="image1" style="left: 0px; top: 0px; position: absolute" url="/resources/Community%20Help.png" width="72"/>
                        <webuijsf:hyperlink id="home1" style="height: 24px; left: 48px; top: 240px; position: absolute" text="Home"/>
                        <webuijsf:image height="24" id="image3" style="left: 24px; top: 240px; position: absolute" url="/resources/folder_home.png" width="24"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
