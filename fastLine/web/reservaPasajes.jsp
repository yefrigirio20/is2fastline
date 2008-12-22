<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : reservaPasajes
    Created on : 10-nov-2008, 17:42:37
    Author     : Huachani
-->
<jsp:root version="2.1" xmlns:a="http://jmaki/v1.0/jsf" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html"
    xmlns:jsfExt="http://java.sun.com/jsf/extensions/dynafaces" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="FastLine - Reserva de Pasajes">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="background-color: rgb(139, 175, 228); -rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1"
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 70px; left: 0px; top: 72px; position: absolute; width: 838px" text="Bienvenido a la Reserva de Pasajes de FastLine"/>
                        <webuijsf:label id="label2" style="left: 48px; top: 192px; position: absolute" text="Region de Origen"/>
                        <webuijsf:label id="label4" style="left: 264px; top: 192px; position: absolute" text="Region de Destino"/>
                        <webuijsf:dropDown id="regionOrigen" items="#{reservaPasajes.regionOrigenDefaultOptions.options}"
                            style="left: 48px; top: 216px; position: absolute" valueChangeListenerExpression="#{reservaPasajes.regionOrigen_processValueChange}"/>
                        <webuijsf:dropDown id="regionDestino" items="#{reservaPasajes.regionDestinoDefaultOptions.options}"
                            onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'regionDestino');"
                            style="left: 264px; top: 216px; position: absolute" valueChangeListenerExpression="#{reservaPasajes.dropDown1_processValueChange}"/>
                        <webuijsf:radioButton id="radioButton1" label="Ida y vuelta" name="radioButton-group-form1" style="left: 48px; top: 264px; position: absolute"/>
                        <webuijsf:radioButton id="radioButton2" label="Sólo ida" name="radioButton-group-form1" style="left: 168px; top: 264px; position: absolute"/>
                        <webuijsf:label id="label3" style="left: 72px; top: 312px; position: absolute; text-align: right; width: 70px" text="Fecha:"/>
                        <webuijsf:button actionExpression="#{reservaPasajes.reservar_action}" id="reservar"
                            style="height: 24px; left: 47px; top: 528px; position: absolute; width: 72px" text="Reservar"/>
                        <webuijsf:radioButtonGroup id="radioButtonGroup1" items="#{reservaPasajes.radioButtonGroup1DefaultOptions.options}" style="border-width: 1px; border-style: solid; border-color: rgb(0, 102, 102) rgb(0, 102, 102) rgb(0, 102, 102) rgb(0, 102, 102); left: 48px; top: 432px; position: absolute"/>
                        <webuijsf:label id="ciudadOrigen1"
                            style="border-width: 2px; border-color: rgb(153, 153, 255) rgb(153, 153, 255) rgb(153, 153, 255) rgb(153, 153, 255); left: 48px; top: 408px; position: absolute" text="Preferencias"/>
                        <webuijsf:label id="label7" style="left: 48px; top: 384px; position: absolute" text="Horarios Disponibles:"/>
                        <webuijsf:dropDown id="dropDown1" items="#{reservaPasajes.dropDown1DefaultOptions.options}" style="left: 168px; top: 384px; position: absolute"/>
                        <webuijsf:image height="72" id="image2" style="left: 0px; top: 0px; position: absolute" url="/resources/lassists.png" width="72"/>
                        <webuijsf:label id="label8"
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 46px; left: 72px; top: 0px; position: absolute; width: 166px" text="FastLine"/>
                        <webuijsf:image height="48" id="image3" style="left: 24px; top: 144px; position: absolute" url="/resources/db_add.png" width="48"/>
                        <webuijsf:image height="24" id="image4" style="left: 120px; top: 528px; position: absolute" url="/resources/apply.png" width="24"/>
                        <webuijsf:image height="24" id="image5" style="left: 48px; top: 576px; position: absolute" url="/resources/folder_home.png" width="24"/>
                        <webuijsf:hyperlink actionExpression="#{reservaPasajes.home_action}" id="home1"
                            style="height: 24px; left: 72px; top: 576px; position: absolute" text="Home"/>
                        <webuijsf:label id="label5" style="height: 22px; left: 0px; top: 336px; position: absolute; text-align: right; width: 142px" text="Precio del Boleto:"/>
                        <webuijsf:textField id="precioBoleto" readOnly="true" style="border: 1px solid black; left: 144px; top: 336px; position: absolute"/>
                        <webuijsf:calendar id="calendar1" readOnly="true" style="left: 144px; top: 312px; position: absolute"/>
                        <jsfExt:ajaxZone id="ajaxZone1" style="height: 430px; left: 408px; top: 168px; position: absolute; width: 526px; -rave-layout: grid">
                            <a:widget name="google.map" args="{centerLat:-9.18887, zoom:5, mapType:'REGULAR', centerLon:-74.443359}"/>
                        </jsfExt:ajaxZone>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
