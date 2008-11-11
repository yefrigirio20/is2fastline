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
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1" style="position: absolute; left: 48px; top: 24px; width: 336px; height: 48px" text="Su nombre de usuario o su contraseña son incorrectos"/>
                        <webuijsf:hyperlink actionExpression="#{LoginIncorrecto.hyperlink1_action}" id="hyperlink1"
                            style="height: 0px; left: 72px; top: 120px; position: absolute; width: 144px" text="Quiero intentarlo otra vez"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
