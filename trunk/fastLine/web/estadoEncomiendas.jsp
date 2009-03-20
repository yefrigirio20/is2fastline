<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : estadoEncomiendas
    Created on : 20/03/2009, 03:00:08 PM
    Author     : Rene
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
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 46px; left: 0px; top: 72px; position: absolute; width: 502px" text="Estado de Encomiendas"/>
                        <webuijsf:label id="label2"
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 46px; left: 72px; top: 0px; position: absolute; width: 166px" text="FastLine"/>
                        <webuijsf:image height="72" id="image1" style="left: 0px; top: 0px; position: absolute" url="/resources/utilities.png" width="72"/>
                        <webuijsf:label id="label3" style="left: 72px; top: 288px; position: absolute; text-align: right; width: 70px" text="Nombre:"/>
                        <webuijsf:label id="label4" style="left: 24px; top: 240px; position: absolute; text-align: right; width: 118px" text="Apellido Paterno:"/>
                        <webuijsf:label id="label5" style="left: 120px; top: 312px; position: absolute; text-align: right; width: 24px" text="DNI:"/>
                        <webuijsf:label id="label6" style="left: 24px; top: 264px; position: absolute; text-align: right; width: 118px" text="Apellido Materno:"/>
                        <webuijsf:label id="label7" style="left: 24px; top: 216px; position: absolute" text="DATOS DE QUIEN ENVÍA"/>
                        <webuijsf:label id="label8" style="left: 384px; top: 288px; position: absolute; text-align: right; width: 70px" text="Nombre:"/>
                        <webuijsf:label id="label9" style="left: 336px; top: 240px; position: absolute; text-align: right; width: 118px" text="Apellido Paterno:"/>
                        <webuijsf:label id="label10" style="left: 432px; top: 312px; position: absolute; text-align: right; width: 24px" text="DNI:"/>
                        <webuijsf:label id="label11" style="left: 336px; top: 264px; position: absolute; text-align: right; width: 118px" text="Apellido Materno:"/>
                        <webuijsf:label id="label12" style="left: 336px; top: 216px; position: absolute" text="DATOS DE QUIEN RECIBE"/>
                        <webuijsf:label id="label13" style="left: 24px; top: 168px; position: absolute; text-align: right; width: 46px" text="Origen:"/>
                        <webuijsf:label id="label14" style="left: 288px; top: 168px; position: absolute; text-align: right; width: 70px" text="Destino:"/>
                        <webuijsf:staticText binding="#{estadoEncomiendas.origen}" id="origen" style="color: blue; left: 72px; top: 168px; position: absolute"/>
                        <webuijsf:staticText binding="#{estadoEncomiendas.destino}" id="destino" style="color: blue; left: 360px; top: 168px; position: absolute"/>
                        <webuijsf:staticText binding="#{estadoEncomiendas.envAP}" id="envAP" style="color: blue; height: 24px; left: 144px; top: 240px; position: absolute; width: 72px"/>
                        <webuijsf:staticText binding="#{estadoEncomiendas.envN}" id="envN" style="color: blue; height: 24px; left: 144px; top: 288px; position: absolute; width: 72px"/>
                        <webuijsf:staticText binding="#{estadoEncomiendas.envAM}" id="envAM" style="color: blue; height: 24px; left: 144px; top: 264px; position: absolute; width: 72px"/>
                        <webuijsf:staticText binding="#{estadoEncomiendas.envDNI}" id="envDNI" style="color: blue; height: 24px; left: 144px; top: 312px; position: absolute; width: 72px"/>
                        <webuijsf:staticText binding="#{estadoEncomiendas.recAP}" id="recAP" style="color: blue; height: 24px; left: 456px; top: 240px; position: absolute; width: 72px"/>
                        <webuijsf:staticText binding="#{estadoEncomiendas.recAM}" id="recAM" style="color: blue; height: 24px; left: 456px; top: 264px; position: absolute; width: 72px"/>
                        <webuijsf:staticText binding="#{estadoEncomiendas.recN}" id="recN" style="color: blue; height: 24px; left: 456px; top: 288px; position: absolute; width: 72px"/>
                        <webuijsf:staticText binding="#{estadoEncomiendas.recDNI}" id="recDNI" style="color: blue; height: 24px; left: 456px; top: 312px; position: absolute; width: 72px"/>
                        <webuijsf:staticText binding="#{estadoEncomiendas.estado}" id="estado" style="color: blue; height: 24px; left: 144px; top: 384px; position: absolute; width: 72px"/>
                        <webuijsf:label id="label15" style="left: 72px; top: 384px; position: absolute; text-align: right; width: 70px" text="Estado:"/>
                        <webuijsf:staticText binding="#{estadoEncomiendas.fecha}" id="fecha" style="color: blue; height: 24px; left: 144px; top: 360px; position: absolute; width: 72px"/>
                        <webuijsf:label id="label16" style="left: 72px; top: 360px; position: absolute; text-align: right; width: 70px" text="Fecha:"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
