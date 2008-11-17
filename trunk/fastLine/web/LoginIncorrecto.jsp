<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : LoginIncorrecto
    Created on : 10-nov-2008, 17:47:55
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
                        <webuijsf:label id="label1" style="height: 22px; left: 72px; top: 72px; position: absolute; width: 336px" text="Su nombre de usuario o su contraseña son incorrectos"/>
                        <webuijsf:hyperlink actionExpression="#{LoginIncorrecto.logIn_action}" id="logIn"
                            style="height: 0px; left: 240px; top: 96px; position: absolute; width: 144px" text="Quiero intentarlo otra vez"/>
                        <webuijsf:hyperlink actionExpression="#{LoginIncorrecto.home_action}" id="home" style="left: 96px; top: 96px; position: absolute" text="Home"/>
                        <webuijsf:image height="72" id="image1" style="left: 0px; top: 0px; position: absolute" url="/resources/Community%20Help.png" width="72"/>
                        <webuijsf:label id="label2"
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 46px; left: 72px; top: 0px; position: absolute; width: 166px" text="FastLine"/>
                        <webuijsf:image height="48" id="image2" style="left: 24px; top: 72px; position: absolute" url="/resources/error.png" width="48"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
