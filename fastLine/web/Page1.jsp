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
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:staticText id="staticText1"
                            style="color: rgb(0, 51, 255); font-size: 24px; height: 22px; left: 312px; top: 48px; position: absolute; width: 240px" text="Bienvenido a FastLine"/>
                        <webuijsf:staticText id="staticText2"
                            style="color: rgb(51, 51, 255); font-size: 24px; height: 142px; left: 144px; top: 96px; position: absolute; width: 622px" text="FastLine es un sistema Web para venta y reserva de pasajes así como para brindar servicios de seguimiento de estado de encomiendas y seguimiento en ruta de los buses vía GPS. Estamos a su servicio. "/>
                        <webuijsf:button actionExpression="#{Page1.button1_action}" id="button1"
                            style="color: navy; font-size: 18px; height: 24px; left: 407px; top: 312px; position: absolute; width: 96px" text="Sing In"/>
                        <webuijsf:staticText id="staticText3"
                            style="color: navy; font-size: 24px; height: 22px; left: 96px; top: 240px; position: absolute; width: 70px" text="Login:"/>
                        <webuijsf:textField id="textField1" style="height: 24px; left: 264px; top: 264px; position: absolute; width: 96px"/>
                        <webuijsf:image height="360" id="image1" style="left: 144px; top: 408px; position: absolute" url="/resources/busAkat.jpg" width="683"/>
                        <webuijsf:staticText id="staticText4" style="color: navy; font-size: 24px; left: 96px; top: 288px; position: absolute" text="Passsword:"/>
                        <webuijsf:textField id="textField2" style="position: absolute; left: 264px; top: 312px"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
