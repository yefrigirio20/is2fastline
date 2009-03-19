<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : BusesyChoferes
    Created on : 16-nov-2008, 18:55:12
    Author     : Huachani
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <f:loadBundle basename="fastline.Bundle" var="mensajes"/>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="FastLine  Gestion de Buses y Choferes">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="background-color: rgb(139, 175, 228); -rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1"
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 46px; left: 72px; top: 1px; position: absolute; width: 166px" text="FastLine"/>
                        <webuijsf:image height="72" id="image1" style="left: 0px; top: 0px; position: absolute" url="/resources/utilities.png" width="72"/>
                        <webuijsf:label id="label2"
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 70px; left: 0px; top: 72px; position: absolute; width: 718px" text="#{mensajes.literal_Titulo_Pagina}"/>
                        <webuijsf:label id="label5"
                            style="color: rgb(204, 204, 0); font-size: 14px; height: 22px; left: 72px; top: 144px; position: absolute; width: 142px" text="#{mensajes.literal_Agregar_Buses}"/>
                        <webuijsf:label for="matricula" id="lblMatricula" style="left: 48px; top: 192px; position: absolute; text-align: right; width: 72px" text="#{mensajes.literal_Matricula}"/>
                        <webuijsf:label for="capacidad" id="lblCapacidad" style="left: 48px; top: 216px; position: absolute; text-align: right; width: 72px" text="#{mensajes.literal_Capacidad}"/>
                        <webuijsf:textField binding="#{BusesyChoferes.matricula}" id="matricula" required="true"
                            style="left: 120px; top: 192px; position: absolute" validatorExpression="#{BusesyChoferes.matricula_validate}"/>
                        <webuijsf:textField binding="#{BusesyChoferes.capacidad}" converter="#{BusesyChoferes.integerConverter2}" id="capacidad" required="true"
                            style="left: 120px; top: 216px; position: absolute" validatorExpression="#{BusesyChoferes.capacidad_validate}"/>
                        <webuijsf:button actionExpression="#{BusesyChoferes.agregarBus_action}" id="agregarBus"
                            style="height: 24px; left: 167px; top: 240px; position: absolute; width: 72px" text="#{mensajes.literal_Agregar_Buses}"/>
                        <webuijsf:pageSeparator id="pageSeparator1" style="left: 0px; top: 264px; position: absolute; width: 720px"/>
                        <webuijsf:label id="label6"
                            style="color: rgb(204, 204, 0); font-size: 14px; height: 22px; left: 72px; top: 312px; position: absolute; width: 190px" text="#{mensajes.literal_Eliminar_Bus}"/>
                        <webuijsf:label id="label7" style="left: 24px; top: 360px; position: absolute; text-align: right; width: 96px" text="#{mensajes.literal_Matricula}"/>
                        <webuijsf:dropDown id="dropDown1" items="#{BusesyChoferes.dropDown1DefaultOptions.options}" style="left: 120px; top: 360px; position: absolute"/>
                        <webuijsf:button actionExpression="#{BusesyChoferes.eliminarBus_action}" id="eliminarBus"
                            style="height: 24px; left: 216px; top: 360px; position: absolute; width: 71px" text="#{mensajes.literal_Eliminar_Bus}"/>
                        <webuijsf:pageSeparator id="pageSeparator2" style="left: 0px; top: 384px; position: absolute; width: 720px"/>
                        <webuijsf:label id="label8"
                            style="color: rgb(204, 204, 0); font-size: 14px; height: 22px; left: 72px; top: 432px; position: absolute; width: 166px" text="#{mensajes.literal_Agregar_Choferes}"/>
                        <webuijsf:label for="apellPaterno" id="lblApellidoPaterno"
                            style="left: 24px; top: 480px; position: absolute; text-align: right; width: 118px" text="#{mensajes.literal_ApellidoPaterno}"/>
                        <webuijsf:label for="apellMaterno" id="lblApellidoMaterno"
                            style="left: 24px; top: 504px; position: absolute; text-align: right; width: 118px" text="#{mensajes.literal_ApellidoMaterno}"/>
                        <webuijsf:label for="nombres" id="lblNombres" style="left: 72px; top: 528px; position: absolute; text-align: right; width: 72px" text="#{mensajes.literal_Nombres}"/>
                        <webuijsf:label for="DNI" id="lblDNI" style="left: 120px; top: 576px; position: absolute; text-align: right; width: 24px" text="#{mensajes.literal_DNI}"/>
                        <webuijsf:label id="label14" style="left: 0px; top: 552px; position: absolute; text-align: right; width: 142px" text="#{mensajes.literal_Fecha_Nacimiento}"/>
                        <webuijsf:dropDown id="dia" items="#{BusesyChoferes.diaDefaultOptions.options}" onChange=""
                            style="left: 168px; top: 552px; position: absolute" valueChangeListenerExpression="#{BusesyChoferes.dia_processValueChange}"/>
                        <webuijsf:staticText id="staticText1" style="left: 144px; top: 552px; position: absolute" text="#{mensajes.literal_Dia}"/>
                        <webuijsf:staticText id="staticText2" style="left: 216px; top: 552px; position: absolute" text="#{mensajes.literal_Mes}"/>
                        <webuijsf:staticText id="staticText3" style="left: 360px; top: 552px; position: absolute" text="#{mensajes.literal_Ano}"/>
                        <webuijsf:dropDown id="mes" items="#{BusesyChoferes.mesDefaultOptions.options}" style="left: 264px; top: 552px; position: absolute"/>
                        <webuijsf:dropDown id="año" items="#{BusesyChoferes.añoDefaultOptions.options}" style="left: 384px; top: 552px; position: absolute"/>
                        <webuijsf:textField id="apellPaterno" required="true" style="left: 144px; top: 480px; position: absolute" valueChangeListenerExpression="#{BusesyChoferes.apellPaterno_processValueChange}"/>
                        <webuijsf:textField id="apellMaterno" required="true" style="left: 144px; top: 504px; position: absolute"/>
                        <webuijsf:textField id="nombres" required="true" style="position: absolute; left: 144px; top: 528px"/>
                        <webuijsf:textField converter="#{BusesyChoferes.integerConverter1}" id="DNI" required="true"
                            style="left: 144px; top: 576px; position: absolute" validatorExpression="#{BusesyChoferes.DNI_validate}"/>
                        <webuijsf:image height="24" id="image2" style="left: 240px; top: 240px; position: absolute" url="/resources/apply.png" width="24"/>
                        <webuijsf:button actionExpression="#{BusesyChoferes.agregarChofer_action}" id="agregarChofer"
                            style="height: 24px; left: 143px; top: 600px; position: absolute; width: 96px" text="#{mensajes.literal_Agregar_Choferes}"/>
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
                        <webuijsf:message for="apellPaterno" id="msgApellidoPaterno" showDetail="false" showSummary="true" style="height: 24px; left: 288px; top: 480px; position: absolute; width: 190px"/>
                        <webuijsf:message for="apellMaterno" id="message1" showDetail="false" showSummary="true" style="position: absolute; left: 288px; top: 504px; width: 192px; height: 24px"/>
                        <webuijsf:message for="nombres" id="message2" showDetail="false" showSummary="true" style="position: absolute; left: 288px; top: 528px; width: 192px; height: 24px"/>
                        <webuijsf:message for="DNI" id="message3" showDetail="false" showSummary="true" style="position: absolute; left: 288px; top: 576px; width: 192px; height: 24px"/>
                        <webuijsf:message for="capacidad" id="message4" showDetail="false" showSummary="true" style="position: absolute; left: 264px; top: 216px; width: 120px; height: 24px"/>
                        <webuijsf:message for="matricula" id="message5" showDetail="false" showSummary="true" style="position: absolute; left: 264px; top: 192px; width: 120px; height: 24px"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
