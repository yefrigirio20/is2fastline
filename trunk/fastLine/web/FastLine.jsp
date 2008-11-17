<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : FastLine
    Created on : 16-nov-2008, 17:24:25
    Author     : Huachani
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="FastLine - Bienvenido !!!">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="background-color: rgb(139, 175, 228); -rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1"
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 22px; left: 0px; top: 0px; position: absolute; width: 406px" text="Bienvenido a FastLine"/>
                        <webuijsf:hyperlink actionExpression="#{FastLine.login_action}" id="login"
                            style="height: 22px; left: 576px; top: 96px; position: absolute; width: 22px" text="Login"/>
                        <webuijsf:hyperlink actionExpression="#{FastLine.administracion_action}" id="administracion"
                            style="left: 576px; top: 144px; position: absolute" text="Administración"/>
                        <webuijsf:image height="265" id="image1" style="left: 24px; top: 96px; position: absolute" url="/resources/busAkat.jpg" width="504"/>
                        <webuijsf:hyperlink actionExpression="#{FastLine.quienSomos_action}" id="quienSomos" style="left: 48px; top: 72px; position: absolute" text="Quienes Somos?"/>
                        <webuijsf:staticText id="staticText1"
                            style="color: rgb(255, 255, 51); font-family: serif; font-size: 18px; height: 94px; left: 24px; top: 360px; position: absolute; width: 502px" text="FastLine es un sistema Web para venta y reserva de pasajes así como para brindar servicios de seguimiento de estado de encomiendas y seguimiento en ruta de los buses vía GPS. Estamos a su servicio. "/>
                        <webuijsf:hyperlink actionExpression="#{FastLine.reservarPasajes_action}" id="reservarPasajes"
                            style="left: 576px; top: 120px; position: absolute" text="Reservar Pasajes"/>
                        <webuijsf:image height="24" id="image2" style="left: 552px; top: 144px; position: absolute" url="/resources/utilities.png" width="24"/>
                        <webuijsf:image height="24" id="image3" style="left: 552px; top: 96px; position: absolute" url="/resources/Community%20Help.png" width="24"/>
                        <webuijsf:image height="24" id="image4" style="left: 552px; top: 120px; position: absolute" url="/resources/lassists.png" width="24"/>
                        <webuijsf:image height="24" id="image5" style="left: 24px; top: 72px; position: absolute" url="/resources/xeyes.png" width="24"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
