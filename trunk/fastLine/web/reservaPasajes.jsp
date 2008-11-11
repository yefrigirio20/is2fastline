<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : reservaPasajes
    Created on : 10-nov-2008, 17:42:37
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
                        <webuijsf:label id="label1"
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 70px; left: 24px; top: 24px; position: absolute; width: 838px" text="Bienvenido a la Reserva de Pasajes de FastLine"/>
                        <webuijsf:label id="label2" style="position: absolute; left: 48px; top: 144px" text="Region de Origen"/>
                        <webuijsf:label id="regionDestino" style="left: 264px; top: 144px; position: absolute" text="Region de Destino"/>
                        <webuijsf:dropDown id="regionOrigen" items="#{reservaPasajes.regionOrigenDefaultOptions.options}"
                            style="left: 48px; top: 168px; position: absolute" valueChangeListenerExpression="#{reservaPasajes.regionOrigen_processValueChange}"/>
                        <webuijsf:dropDown id="dropDown2" items="#{reservaPasajes.dropDown2DefaultOptions.options}"
                            onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'dropDown2');" style="left: 264px; top: 168px; position: absolute" valueChangeListenerExpression="#{reservaPasajes.dropDown1_processValueChange}"/>
                        <webuijsf:label id="ciudadOrigen" style="left: 48px; top: 192px; position: absolute" text="Ciudad de Origen"/>
                        <webuijsf:label id="ciudadDestino" style="left: 264px; top: 192px; position: absolute" text="Ciudad de Destino"/>
                        <webuijsf:radioButton id="radioButton1" label="Ida y vuelta" name="radioButton-group-form1" style="left: 48px; top: 264px; position: absolute"/>
                        <webuijsf:radioButton id="radioButton2" label="Sólo ida" name="radioButton-group-form1" style="left: 168px; top: 264px; position: absolute"/>
                        <webuijsf:dropDown id="dropDown1" items="#{reservaPasajes.dropDown1DefaultOptions.options}" style="left: 48px; top: 216px; position: absolute"/>
                        <webuijsf:dropDown id="dropDown3" items="#{reservaPasajes.dropDown3DefaultOptions.options}" style="left: 264px; top: 216px; position: absolute"/>
                        <webuijsf:label id="label3" style="left: 48px; top: 312px; position: absolute" text="Fecha"/>
                        <webuijsf:calendar id="calendar1" style="left: 96px; top: 312px; position: absolute"/>
                        <webuijsf:button id="reservar" style="left: 48px; top: 552px; position: absolute" text="Reservar"/>
                        <webuijsf:image height="176" id="image1" style="left: 432px; top: 96px; position: absolute" url="/resources/busAkat.jpg" width="264"/>
                        <webuijsf:radioButtonGroup id="radioButtonGroup1" items="#{reservaPasajes.radioButtonGroup1DefaultOptions.options}" style="border: 1px solid #006666; left: 48px; top: 408px; position: absolute"/>
                        <webuijsf:label id="ciudadOrigen1"
                            style="border-width: 2px; border-color: rgb(153, 153, 255); left: 48px; top: 384px; position: absolute" text="Preferencias"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
