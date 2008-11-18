<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : pagoBoletos
    Created on : 17-nov-2008, 19:15:29
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
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 46px; left: 0px; top: 72px; position: absolute; width: 502px" text="Pago de Boletos Reservados"/>
                        <webuijsf:label id="label2"
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 46px; left: 72px; top: 0px; position: absolute; width: 166px" text="FastLine"/>
                        <webuijsf:image height="72" id="image2" style="left: 0px; top: 0px; position: absolute" url="/resources/utilities.png" width="72"/>
                        <webuijsf:label id="label3"
                            style="color: rgb(204, 204, 0); font-size: 14px; height: 22px; left: 72px; top: 144px; position: absolute; width: 142px" text="Pago de Reserva"/>
                        <webuijsf:label id="label4" style="left: 96px; top: 216px; position: absolute; text-align: right; width: 67px" text="Ruta:"/>
                        <webuijsf:dropDown id="ruta" items="#{pagoBoletos.rutaDefaultOptions.options}" style="left: 168px; top: 216px; position: absolute"/>
                        <webuijsf:label id="label6" style="left: 48px; top: 240px; position: absolute; text-align: right; width: 118px" text="Fecha de Salida:"/>
                        <webuijsf:calendar id="fechaEncomienda1" readOnly="true" style="left: 168px; top: 240px; position: absolute"/>
                        <webuijsf:dropDown id="horarios" items="#{pagoBoletos.horariosDefaultOptions.options}" style="left: 168px; top: 264px; position: absolute"/>
                        <webuijsf:image height="48" id="image1" style="left: 24px; top: 144px; position: absolute" url="/resources/db_comit.png" width="48"/>
                        <webuijsf:label id="label5" style="left: 48px; top: 264px; position: absolute; text-align: right; width: 118px" text="Horario:"/>
                        <webuijsf:label id="label7" style="left: 48px; top: 336px; position: absolute; text-align: right; width: 118px" text="Precio del Boleto:"/>
                        <webuijsf:textField id="textField1" readOnly="true" style="left: 168px; top: 336px; position: absolute"/>
                        <webuijsf:label id="label8" style="left: 24px; top: 288px; position: absolute; text-align: right; width: 142px" text="Reserva a nombre de:"/>
                        <webuijsf:dropDown id="horarios1" items="#{pagoBoletos.horarios1DefaultOptions.options}" style="left: 168px; top: 288px; position: absolute"/>
                        <webuijsf:image height="24" id="image3" style="left: 24px; top: 480px; position: absolute" url="/resources/back.png" width="24"/>
                        <webuijsf:hyperlink actionExpression="#{pagoBoletos.regresar_action}" id="regresar"
                            style="height: 24px; left: 48px; top: 480px; position: absolute; width: 48px" text="Regresar"/>
                        <webuijsf:hyperlink actionExpression="#{pagoBoletos.home_action}" id="home"
                            style="height: 22px; left: 168px; top: 480px; position: absolute" text="Home"/>
                        <webuijsf:image height="24" id="image4" style="left: 144px; top: 480px; position: absolute" url="/resources/folder_home.png" width="24"/>
                        <webuijsf:button actionExpression="#{pagoBoletos.regEncEntregada_action}" id="regPagoRes"
                            style="height: 24px; left: 95px; top: 384px; position: absolute; width: 168px" text="Registrar pago de reservación"/>
                        <webuijsf:image height="24" id="image5" style="left: 264px; top: 384px; position: absolute" url="/resources/apply.png" width="24"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
