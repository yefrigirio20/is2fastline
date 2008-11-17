<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : gestionarRutas
    Created on : 15-nov-2008, 15:29:12
    Author     : Huachani
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="FastLine - Gestion de Rutas">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="background-color: rgb(139, 175, 228); -rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1"
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 70px; left: 0px; top: 72px; position: absolute; width: 694px" text="Gestion de Salidas y Rutas  de FastLine"/>
                        <webuijsf:label id="label2" style="left: 48px; top: 192px; position: absolute" text="Partida:"/>
                        <webuijsf:label id="label4" style="left: 216px; top: 192px; position: absolute" text="Llegada:"/>
                        <webuijsf:dropDown id="regionOrigen1" items="#{gestionarRutas.regionOrigen1DefaultOptions.options}"
                            style="left: 48px; top: 216px; position: absolute" valueChangeListenerExpression="#{gestionarRutas.regionOrigen_processValueChange}"/>
                        <webuijsf:dropDown id="regionDestino1" items="#{gestionarRutas.regionDestino1DefaultOptions.options}"
                            onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'regionDestino');"
                            style="left: 216px; top: 216px; position: absolute" valueChangeListenerExpression="#{gestionarRutas.dropDown1_processValueChange}"/>
                        <webuijsf:button actionExpression="#{gestionarRutas.agregarRuta_action}" id="agregarRuta"
                            style="height: 24px; left: 239px; top: 240px; position: absolute; width: 72px" text="Agregar Ruta"/>
                        <webuijsf:pageSeparator id="pageSeparator1" style="height: 0px; left: 0px; top: 240px; position: absolute; width: 672px"/>
                        <webuijsf:label id="label5"
                            style="color: rgb(204, 204, 0); font-size: 14px; height: 22px; left: 72px; top: 144px; position: absolute; width: 166px" text="Agregar Nueva Ruta"/>
                        <webuijsf:label id="label6"
                            style="color: rgb(204, 204, 0); font-size: 14px; height: 22px; left: 72px; top: 288px; position: absolute; width: 118px" text="Eliminar Ruta"/>
                        <webuijsf:label id="label7" style="left: 48px; top: 336px; position: absolute" text="Ruta:"/>
                        <webuijsf:dropDown id="regionOrigen2" items="#{gestionarRutas.regionOrigen2DefaultOptions.options}"
                            style="left: 96px; top: 336px; position: absolute" valueChangeListenerExpression="#{gestionarRutas.regionOrigen_processValueChange}"/>
                        <webuijsf:button actionExpression="#{gestionarRutas.eliminarRuta_action}" id="eliminarRuta"
                            style="height: 24px; left: 239px; top: 336px; position: absolute; width: 72px" text="Eliminar Ruta"/>
                        <webuijsf:pageSeparator id="pageSeparator2" style="left: 0px; top: 360px; position: absolute; width: 672px"/>
                        <webuijsf:label id="label3"
                            style="color: rgb(204, 204, 0); font-size: 14px; height: 22px; left: 72px; top: 408px; position: absolute; width: 118px" text="Nueva Salida"/>
                        <webuijsf:dropDown id="rutaNuevaSalida" items="#{gestionarRutas.rutaNuevaSalidaDefaultOptions.options}"
                            style="left: 120px; top: 456px; position: absolute" valueChangeListenerExpression="#{gestionarRutas.regionOrigen_processValueChange}"/>
                        <webuijsf:label id="label9" style="left: 48px; top: 504px; position: absolute; text-align: right; width: 72px" text="Chofer 1:"/>
                        <webuijsf:label id="label10" style="left: 48px; top: 528px; position: absolute; text-align: right; width: 72px" text="Chofer 2:"/>
                        <webuijsf:dropDown id="busNuevaSalida" items="#{gestionarRutas.busNuevaSalidaDefaultOptions.options}" style="left: 120px; top: 480px; position: absolute"/>
                        <webuijsf:dropDown id="chofer2NuevaSalida" items="#{gestionarRutas.chofer2NuevaSalidaDefaultOptions.options}" style="left: 120px; top: 528px; position: absolute"/>
                        <webuijsf:label id="label8" style="height: 24px; left: 48px; top: 456px; position: absolute; text-align: right; width: 72px" text="Ruta:"/>
                        <webuijsf:label id="label11" style="left: 72px; top: 480px; position: absolute; text-align: right; width: 51px" text="Bus:"/>
                        <webuijsf:dropDown id="chofer1NuevaSalida" items="#{gestionarRutas.chofer1NuevaSalidaDefaultOptions.options}" style="left: 120px; top: 504px; position: absolute"/>
                        <webuijsf:label id="label12" style="left: 72px; top: 576px; position: absolute; text-align: right; width: 48px" text="Hora:"/>
                        <webuijsf:label id="label13" style="left: 72px; top: 552px; position: absolute; text-align: right; width: 48px" text="Fecha:"/>
                        <webuijsf:calendar id="calendar1" style="left: 120px; top: 552px; position: absolute"/>
                        <webuijsf:button actionExpression="#{gestionarRutas.agregarNuevaSalida_action}" id="agregarNuevaSalida"
                            style="left: 191px; top: 624px; position: absolute" text="Agregar Nueva Salida"/>
                        <webuijsf:label id="label14"
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 46px; left: 72px; top: 0px; position: absolute; width: 166px" text="FastLine"/>
                        <webuijsf:image height="72" id="image1" style="left: 0px; top: 0px; position: absolute" url="/resources/utilities.png" width="72"/>
                        <webuijsf:image height="24" id="image2" style="left: 312px; top: 240px; position: absolute" url="/resources/apply.png" width="24"/>
                        <webuijsf:image height="24" id="image3" style="left: 312px; top: 624px; position: absolute" url="/resources/apply.png" width="24"/>
                        <webuijsf:image height="24" id="image4" style="left: 24px; top: 648px; position: absolute" url="/resources/back.png" width="24"/>
                        <webuijsf:image height="24" id="image5" style="left: 144px; top: 648px; position: absolute" url="/resources/folder_home.png" width="24"/>
                        <webuijsf:hyperlink actionExpression="#{gestionarRutas.home_action}" id="home"
                            style="height: 24px; left: 168px; top: 648px; position: absolute" text="Home"/>
                        <webuijsf:hyperlink actionExpression="#{gestionarRutas.regresar_action}" id="regresar"
                            style="height: 24px; left: 48px; top: 648px; position: absolute; width: 48px" text="Regresar"/>
                        <webuijsf:image height="48" id="image6" style="left: 24px; top: 144px; position: absolute" url="/resources/db_add.png" width="48"/>
                        <webuijsf:image height="48" id="image8" style="left: 24px; top: 288px; position: absolute" url="/resources/db_remove.png" width="48"/>
                        <webuijsf:image height="24" id="image9" style="left: 312px; top: 336px; position: absolute" url="/resources/button_cancel.png" width="24"/>
                        <webuijsf:image height="48" id="image10" style="left: 24px; top: 408px; position: absolute" url="/resources/db_add.png" width="48"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
