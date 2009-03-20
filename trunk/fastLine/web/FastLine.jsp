<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : FastLine
    Created on : 16-nov-2008, 17:24:25
    Author     : Huachani
-->
<jsp:root version="2.1" xmlns:a="http://jmaki/v1.0/jsf" xmlns:df="http://java.sun.com/jsf/dynamicfaces" xmlns:f="http://java.sun.com/jsf/core"
    xmlns:h="http://java.sun.com/jsf/html" xmlns:jsfExt="http://java.sun.com/jsf/extensions/dynafaces" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <f:loadBundle basename="fastline.Bundle" var="mensajes"/>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="FastLine - Bienvenido !!!">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                    <df:ajaxTransaction id="ajaxTransaction1" inputs="page1:html1:body1:form1:userName1,page1:html1:body1:form1:iniciarSesion1" render="page1:html1:body1:form1:error,page1:html1:body1:form1:userAccount,page1:html1:body1:form1:reservarPasajes,page1:html1:body1:form1:imageReservar"/>
                    <df:ajaxTransaction id="ajaxTransaction2" inputs="page1:html1:body1:form1:verificarEncomienda" render="page1:html1:body1:form1:errorEnc"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="background-color: rgb(255, 255, 255); -rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1"
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 22px; left: 0px; top: 0px; position: absolute; width: 406px" text="#{mensajes.index_Titulo}"/>
                        <webuijsf:hyperlink actionExpression="#{FastLine.administracion_action}" id="administracion"
                            style="left: 24px; top: 576px; position: absolute" text="Administración" visible="false"/>
                        <webuijsf:image height="192" id="image1" style="left: 24px; top: 216px; position: absolute" url="/resources/busAkat.jpg" width="365"/>
                        <webuijsf:hyperlink actionExpression="#{FastLine.quienSomos_action}" id="quienSomos" style="left: 24px; top: 48px; position: absolute" text="#{mensajes.index_Quienes}"/>
                        <webuijsf:staticText id="staticText1"
                            style="color: #000000; font-family: serif; font-size: 18px; height: 94px; left: 0px; top: 408px; position: absolute; width: 406px" text="#{mensajes.index_Mensaje_Final}"/>
                        <webuijsf:hyperlink actionExpression="#{FastLine.reservarPasajes_action}" binding="#{FastLine.reservarPasajes}" id="reservarPasajes" style="left: 24px; top: 144px; position: absolute"/>
                        <webuijsf:image height="24" id="image2" style="left: 0px; top: 576px; position: absolute" url="/resources/utilities.png" visible="false" width="24"/>
                        <webuijsf:image binding="#{FastLine.imageReservar}" height="24" id="imageReservar" style="left: 0px; top: 144px; position: absolute"
                            url="/resources/lassists.png" width="24"/>
                        <webuijsf:image height="24" id="image5" style="left: 0px; top: 48px; position: absolute" url="/resources/xeyes.png" width="24"/>
                        <webuijsf:label binding="#{FastLine.userLabel}" id="userLabel"
                            style="left: 96px; top: 96px; position: absolute; text-align: right; width: 72px" text="#{mensajes.index_Usuario}"/>
                        <webuijsf:label binding="#{FastLine.passLabel}" id="passLabel"
                            style="left: 72px; top: 120px; position: absolute; text-align: right; width: 96px" text="#{mensajes.index_Contraseña}"/>
                        <webuijsf:textField binding="#{FastLine.userName1}" id="userName1"
                            onKeyUp="DynaFaces.Tx.fire(&quot;ajaxTransaction1&quot;, &quot;userName1&quot;) " style="left: 168px; top: 96px; position: absolute" valueChangeListenerExpression="#{FastLine.userName1_processValueChange}"/>
                        <webuijsf:passwordField binding="#{FastLine.pass1}" id="pass1" style="left: 168px; top: 120px; position: absolute"/>
                        <webuijsf:staticText binding="#{FastLine.mensajelogginLabel}" id="mensajelogginLabel"
                            style="height: 22px; left: 72px; top: 72px; position: absolute; width: 262px" text="#{mensajes.index_Ingrese_Mensaje}"/>
                        <webuijsf:button actionExpression="#{FastLine.iniciarSesion_action}" binding="#{FastLine.iniciarSesion}" id="iniciarSesion"
                            onClick="DynaFaces.Tx.fire(&quot;ajaxTransaction1&quot;, &quot;iniciarSesion&quot;) "
                            style="height: 24px; left: 167px; top: 144px; position: absolute; width: 96px" text="#{mensajes.index_Iniciar}"/>
                        <webuijsf:staticText binding="#{FastLine.registrarseClick}" id="registrarseClick"
                            style="left: 24px; top: 192px; position: absolute; text-align: right; width: 142px" text="#{mensajes.index_Registrarse_mensaje}"/>
                        <webuijsf:hyperlink actionExpression="#{FastLine.nuevoUsuario_action}" binding="#{FastLine.nuevoUsuarioAqui}" id="nuevoUsuarioAqui"
                            style="left: 168px; top: 192px; position: absolute" text="#{mensajes.index_AquiLink}"/>
                        <webuijsf:staticText binding="#{FastLine.error}" id="error" style="color: red; font-size: 14px; height: 24px; left: 216px; top: 168px; position: absolute; width: 168px"/>
                        <webuijsf:staticText binding="#{FastLine.userAccount}" id="userAccount" style="color: blue; font-size: 14px; height: 24px; left: 408px; top: 24px; position: absolute; width: 288px"/>
                        <div style="height: 478px; left: 408px; top: 72px; position: absolute; width: 574px">
                            <jsp:directive.include file="FragmentoFastLine.jspf"/>
                        </div>
                        <webuijsf:label id="label2" style="left: 24px; top: 552px; position: absolute" text="Verifique el estado de su encomienda "/>
                        <webuijsf:textField binding="#{FastLine.idEnc}" id="idEnc" style="left: 216px; top: 576px; position: absolute"/>
                        <webuijsf:button actionExpression="#{FastLine.verificarEncomienda_action}" id="verificarEncomienda"
                            style="height: 24px; left: 215px; top: 600px; position: absolute; width: 120px" text="Verificar estado"/>
                        <webuijsf:label id="label3" style="left: 24px; top: 576px; position: absolute; text-align: right; width: 190px" text="Identificador de la Encomienda:"/>
                        <webuijsf:staticText binding="#{FastLine.errorEnc}" id="errorEnc" style="color: red; left: 360px; top: 576px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
