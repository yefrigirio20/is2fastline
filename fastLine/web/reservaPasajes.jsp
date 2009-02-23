<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : reservaPasajes
    Created on : 10-nov-2008, 17:42:37
    Author     : Huachani
-->
<jsp:root version="2.1" xmlns:a="http://jmaki/v1.0/jsf" xmlns:df="http://java.sun.com/jsf/dynamicfaces" xmlns:f="http://java.sun.com/jsf/core"
    xmlns:h="http://java.sun.com/jsf/html" xmlns:jsfExt="http://java.sun.com/jsf/extensions/dynafaces" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="FastLine - Reserva de Pasajes">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                    <df:ajaxTransaction id="ajaxTransaction1" inputs="page1:html1:body1:form1:depOrigen" render="page1:html1:body1:form1:staticText1,page1:html1:body1:form1:errorRuta"/>
                    <df:ajaxTransaction id="ajaxTransaction2" inputs="page1:html1:body1:form1:depDestino" render="page1:html1:body1:form1:errorRuta"/>
                    <df:ajaxTransaction id="ajaxTransaction3" inputs="page1:html1:body1:form1:consultarHorarios" render="page1:html1:body1:form1:errorGnrl"/>
                    <df:ajaxTransaction id="ajaxTransaction4" render="page1:html1:body1:form1:precio"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="background-color: rgb(255, 255, 255); -rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1"
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 70px; left: 0px; top: 24px; position: absolute; width: 358px" text="Bienvenido a la Reserva de Pasajes de FastLine"/>
                        <webuijsf:label id="label2" style="left: 48px; top: 240px; position: absolute" text=" Origen"/>
                        <webuijsf:label id="label4" style="left: 192px; top: 240px; position: absolute" text=" Destino"/>
                        <webuijsf:dropDown binding="#{reservaPasajes.depOrigen}" id="depOrigen" items="#{reservaPasajes.depOrigenDefaultOptions.options}"
                            onChange="" style="left: 48px; top: 264px; position: absolute" valueChangeListenerExpression="#{reservaPasajes.depOrigen_processValueChange}"/>
                        <webuijsf:dropDown binding="#{reservaPasajes.depDestino}" id="depDestino" items="#{reservaPasajes.depDestinoDefaultOptions.options}"
                            onChange="" style="left: 192px; top: 264px; position: absolute" valueChangeListenerExpression="#{reservaPasajes.depDestino_processValueChange}"/>
                        <webuijsf:button actionExpression="#{reservaPasajes.reservar_action}" id="reservar"
                            style="height: 24px; left: 47px; top: 528px; position: absolute; width: 72px" text="Reservar"/>
                        <webuijsf:label id="label7" style="left: 24px; top: 408px; position: absolute" text="Horarios Disponibles:"/>
                        <webuijsf:dropDown binding="#{reservaPasajes.horarios}" id="horarios" items="#{reservaPasajes.horariosDefaultOptions.options}"
                            onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'horarios');" style="left: 144px; top: 408px; position: absolute" valueChangeListenerExpression="#{reservaPasajes.horarios_processValueChange}"/>
                        <webuijsf:image height="48" id="image3" style="left: 24px; top: 144px; position: absolute" url="/resources/db_add.png" width="48"/>
                        <webuijsf:image height="24" id="image4" style="left: 120px; top: 528px; position: absolute" url="/resources/apply.png" width="24"/>
                        <webuijsf:image height="24" id="image5" style="left: 48px; top: 576px; position: absolute" url="/resources/folder_home.png" width="24"/>
                        <webuijsf:hyperlink actionExpression="#{reservaPasajes.home_action}" id="home1"
                            style="height: 24px; left: 72px; top: 576px; position: absolute" text="Home"/>
                        <webuijsf:label id="label5" style="height: 22px; left: 24px; top: 432px; position: absolute; text-align: right; width: 118px" text="Precio del Boleto:"/>
                        <webuijsf:staticText binding="#{reservaPasajes.errorRuta}" id="errorRuta" style="color: red; left: 48px; top: 288px; position: absolute; width: 240px"/>
                        <webuijsf:staticText binding="#{reservaPasajes.precio}" id="precio" style="color: blue; left: 168px; top: 432px; position: absolute"/>
                        <webuijsf:button actionExpression="#{reservaPasajes.consultarHorarios_action}" binding="#{reservaPasajes.consultarHorarios}"
                            id="consultarHorarios" style="height: 24px; left: 167px; top: 360px; position: absolute" text="Consultar Horarios"/>
                        <webuijsf:calendar binding="#{reservaPasajes.startCalendar}" dateFormatPatternHelp="MM/dd/yyyy" id="startCalendar"
                            label="Fecha de Salida" onChange="" required="true" style="left: 72px; top: 312px; position: absolute" valueChangeListenerExpression="#{reservaPasajes.startCalendar_processValueChange}"/>
                        <webuijsf:staticText id="staticText1"
                            style="color: rgb(0, 51, 255); font-size: 24px; height: 24px; left: 24px; top: 624px; position: absolute" text="Blanco:Asiento Libre"/>
                        <webuijsf:staticText id="staticText2" style="color: rgb(0, 51, 204); font-size: 24px; left: 24px; top: 672px; position: absolute" text="Verde: Asiento Ocupado"/>
                        <webuijsf:textField binding="#{reservaPasajes.asiento}" id="asiento" style="left: 144px; top: 480px; position: absolute"/>
                    </webuijsf:form>
                    <div style="height: 670px; left: 384px; top: 24px; position: absolute; width: 478px">
                        <jsp:directive.include file="FragmentoBuses.jspf"/>
                    </div>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
