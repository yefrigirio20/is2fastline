<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : BusesyChoferes
    Created on : 16-nov-2008, 18:55:12
    Author     : Huachani
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="FastLine - Gestion de Buses y Choferes">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="background-color: rgb(139, 175, 228); -rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1"
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 46px; left: 72px; top: 0px; position: absolute; width: 166px" text="FastLine"/>
                        <webuijsf:image height="72" id="image1" style="left: 0px; top: 0px; position: absolute" url="/resources/utilities.png" width="72"/>
                        <webuijsf:label id="label2"
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 70px; left: 0px; top: 72px; position: absolute; width: 718px" text="Gestion de Buses y Choferes de FastLine"/>
                        <webuijsf:label id="label5"
                            style="color: rgb(204, 204, 0); font-size: 14px; height: 22px; left: 72px; top: 144px; position: absolute; width: 142px" text="Agregar Nuevo Bus"/>
                        <webuijsf:label id="label3" style="left: 48px; top: 192px; position: absolute; text-align: right; width: 72px" text="Matrícula:"/>
                        <webuijsf:label id="label4" style="left: 48px; top: 216px; position: absolute; text-align: right; width: 72px" text="Capacidad:"/>
                        <webuijsf:textField binding="#{BusesyChoferes.matricula}" id="matricula" style="left: 120px; top: 192px; position: absolute"/>
                        <webuijsf:textField binding="#{BusesyChoferes.capacidad}" id="capacidad" style="left: 120px; top: 216px; position: absolute"/>
                        <webuijsf:button actionExpression="#{BusesyChoferes.agregarBus_action}" id="agregarBus"
                            style="height: 24px; left: 167px; top: 240px; position: absolute; width: 72px" text="Agregar Bus"/>
                        <webuijsf:pageSeparator id="pageSeparator1" style="left: 0px; top: 264px; position: absolute; width: 720px"/>
                        <webuijsf:label id="label6"
                            style="color: rgb(204, 204, 0); font-size: 14px; height: 22px; left: 72px; top: 312px; position: absolute; width: 190px" text="Eliminar Bus del Sistema"/>
                        <webuijsf:label id="label7" style="left: 24px; top: 360px; position: absolute; text-align: right; width: 96px" text="Matricula Bus:"/>
                        <webuijsf:dropDown id="dropDown1" items="#{BusesyChoferes.dropDown1DefaultOptions.options}" style="left: 120px; top: 360px; position: absolute"/>
                        <webuijsf:button actionExpression="#{BusesyChoferes.eliminarBus_action}" id="eliminarBus"
                            style="height: 24px; left: 216px; top: 360px; position: absolute; width: 71px" text="Eliminar Bus"/>
                        <webuijsf:pageSeparator id="pageSeparator2" style="left: 0px; top: 384px; position: absolute; width: 720px"/>
                        <webuijsf:label id="label8"
                            style="color: rgb(204, 204, 0); font-size: 14px; height: 22px; left: 72px; top: 432px; position: absolute; width: 166px" text="Agregar Nuevo Chofer"/>
                        <webuijsf:label id="label9" style="left: 24px; top: 480px; position: absolute; text-align: right; width: 118px" text="Apellido Paterno:"/>
                        <webuijsf:label id="label10" style="left: 24px; top: 504px; position: absolute; text-align: right; width: 118px" text="Apellido Materno:"/>
                        <webuijsf:label id="label11" style="left: 72px; top: 528px; position: absolute; text-align: right; width: 72px" text="Nombres:"/>
                        <webuijsf:label id="label12" style="left: 120px; top: 576px; position: absolute; text-align: right; width: 24px" text="DNI:"/>
                        <webuijsf:label id="label14" style="left: 0px; top: 552px; position: absolute; text-align: right; width: 142px" text="Fecha de Nacimiento:"/>
                        <webuijsf:dropDown id="dia" items="#{BusesyChoferes.diaDefaultOptions.options}" onChange=""
                            style="left: 168px; top: 552px; position: absolute" valueChangeListenerExpression="#{BusesyChoferes.dia_processValueChange}"/>
                        <webuijsf:staticText id="staticText1" style="left: 144px; top: 552px; position: absolute" text="Día"/>
                        <webuijsf:staticText id="staticText2" style="left: 216px; top: 552px; position: absolute" text="Mes"/>
                        <webuijsf:staticText id="staticText3" style="left: 336px; top: 552px; position: absolute" text="Año"/>
                        <webuijsf:dropDown id="mes" items="#{BusesyChoferes.mesDefaultOptions.options}" style="position: absolute; left: 240px; top: 552px"/>
                        <webuijsf:dropDown id="año" items="#{BusesyChoferes.añoDefaultOptions.options}" style="left: 360px; top: 552px; position: absolute"/>
                        <webuijsf:textField id="apellPaterno" style="left: 144px; top: 480px; position: absolute" valueChangeListenerExpression="#{BusesyChoferes.apellPaterno_processValueChange}"/>
                        <webuijsf:textField id="apellMaterno" style="left: 144px; top: 504px; position: absolute"/>
                        <webuijsf:textField id="nombres" style="position: absolute; left: 144px; top: 528px"/>
                        <webuijsf:textField id="DNI" style="left: 144px; top: 576px; position: absolute"/>
                        <webuijsf:image height="24" id="image2" style="left: 240px; top: 240px; position: absolute" url="/resources/apply.png" width="24"/>
                        <webuijsf:button actionExpression="#{BusesyChoferes.agregarChofer_action}" id="agregarChofer"
                            style="height: 24px; left: 143px; top: 600px; position: absolute; width: 96px" text="Agregar Chofer"/>
                        <webuijsf:image height="24" id="image3" style="left: 240px; top: 600px; position: absolute" url="/resources/apply.png" width="24"/>
                        <webuijsf:image height="24" id="image4" style="left: 24px; top: 648px; position: absolute" url="/resources/back.png" width="24"/>
                        <webuijsf:image height="24" id="image5" style="left: 144px; top: 648px; position: absolute" url="/resources/folder_home.png" width="24"/>
                        <webuijsf:hyperlink actionExpression="#{BusesyChoferes.home1_action}" id="home1"
                            style="height: 24px; left: 168px; top: 648px; position: absolute" text="Home"/>
                        <webuijsf:hyperlink actionExpression="#{BusesyChoferes.regresar1_action}" id="regresar1"
                            style="height: 24px; left: 48px; top: 648px; position: absolute; width: 48px" text="Regresar"/>
                        <webuijsf:image height="48" id="image6" style="left: 24px; top: 144px; position: absolute" url="/resources/db_add.png" width="48"/>
                        <webuijsf:image height="48" id="image7" style="left: 24px; top: 432px; position: absolute" url="/resources/db_add.png" width="48"/>
                        <webuijsf:image height="48" id="image8" style="left: 24px; top: 312px; position: absolute" url="/resources/db_remove.png" width="48"/>
                        <webuijsf:image height="24" id="image9" style="left: 288px; top: 360px; position: absolute" url="/resources/button_cancel.png" width="24"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
