<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Administracion
    Created on : 16-nov-2008, 18:01:43
    Author     : Huachani
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="FastLine - Administración">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="background-color: rgb(139, 175, 228); -rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1"
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 46px; left: 72px; top: 0px; position: absolute; width: 166px" text="FastLine"/>
                        <webuijsf:label id="label2" style="left: 24px; top: 72px; position: absolute" text="Seleccione que aspecto de FastLine desea administrar"/>
                        <webuijsf:hyperlink actionExpression="#{Administracion.busesYChoferes_action}" id="busesYChoferes"
                            style="left: 24px; top: 96px; position: absolute" text="Buses y Choferes"/>
                        <webuijsf:hyperlink actionExpression="#{Administracion.rutasYSalidas_action}" id="rutasYSalidas"
                            style="left: 24px; top: 120px; position: absolute" text="Rutas y Salidas"/>
                        <webuijsf:hyperlink actionExpression="#{Administracion.encomiendas_action}" id="encomiendas"
                            style="left: 24px; top: 144px; position: absolute" text="Encomiendas"/>
                        <webuijsf:hyperlink actionExpression="#{Administracion.pagoBoletos_action}" id="pagoBoletos"
                            style="left: 24px; top: 168px; position: absolute" text="Pago de Boletos"/>
                        <webuijsf:image height="72" id="image1" style="left: 0px; top: 0px; position: absolute" url="/resources/utilities.png" width="72"/>
                        <webuijsf:hyperlink actionExpression="#{Administracion.home_action}" id="home"
                            style="height: 24px; left: 48px; top: 264px; position: absolute" text="Home"/>
                        <webuijsf:image height="24" id="image3" style="left: 24px; top: 264px; position: absolute" url="/resources/folder_home.png" width="24"/>
                        <webuijsf:staticText binding="#{Administracion.nomusuario}" id="nomusuario" style="color: blue; height: 24px; left: 408px; top: 24px; position: absolute; width: 96px"/>
                        <webuijsf:hyperlink actionExpression="#{Administracion.cerrarsesion_action}" id="cerrarsesion"
                            style="left: 528px; top: 24px; position: absolute" text="Cerrar sesion"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
