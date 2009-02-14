<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : registrarNuevoUsuario
    Created on : 12-nov-2008, 20:27:08
    Author     : Huachani
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="FastLine - Registro de Nuevo Usuario">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="background-color: rgb(139, 175, 228); -rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1" style="left: 120px; top: 264px; position: absolute; text-align: right; width: 70px" text="Nombre:"/>
                        <webuijsf:label id="label2" style="left: 72px; top: 216px; position: absolute; text-align: right; width: 118px" text="Apellido Paterno:"/>
                        <webuijsf:label id="label3" style="left: 72px; top: 288px; position: absolute; text-align: right" text="Fecha de Nacimiento:"/>
                        <webuijsf:label id="label4" style="left: 24px; top: 312px; position: absolute; text-align: right; width: 168px" text="Documentos de Identidad:"/>
                        <webuijsf:label id="label5" style="left: 72px; top: 336px; position: absolute; text-align: right; width: 120px" text="Correo Electrónico:"/>
                        <webuijsf:textField id="apellPaterno" style="height: 24px; left: 192px; top: 216px; position: absolute; width: 144px"/>
                        <webuijsf:textField id="nombres" style="left: 192px; top: 264px; position: absolute"/>
                        <webuijsf:textField id="DNI" style="left: 192px; top: 312px; position: absolute"/>
                        <webuijsf:textField id="email" style="left: 192px; top: 336px; position: absolute"/>
                        <webuijsf:dropDown id="dia" items="#{registrarNuevoUsuario.diaDefaultOptions.options}" onChange=""
                            style="left: 216px; top: 288px; position: absolute" valueChangeListenerExpression="#{registrarNuevoUsuario.dropDown2_processValueChange}"/>
                        <webuijsf:dropDown id="año" items="#{registrarNuevoUsuario.añoDefaultOptions.options}"
                            style="left: 408px; top: 288px; position: absolute" valueChangeListenerExpression="#{registrarNuevoUsuario.dropDown3_processValueChange}"/>
                        <webuijsf:dropDown id="mes" items="#{registrarNuevoUsuario.mesDefaultOptions.options}" style="left: 288px; top: 288px; position: absolute"/>
                        <webuijsf:staticText id="staticText1" style="left: 192px; top: 288px; position: absolute" text="Día"/>
                        <webuijsf:staticText id="staticText2" style="left: 264px; top: 288px; position: absolute" text="Mes"/>
                        <webuijsf:staticText id="staticText3" style="left: 384px; top: 288px; position: absolute" text="Año"/>
                        <webuijsf:label id="label6" style="left: 48px; top: 360px; position: absolute; text-align: right; width: 142px" text="Nombre de Usuario:"/>
                        <webuijsf:label for="pass" id="label7" style="left: 120px; top: 384px; position: absolute; text-align: right; width: 70px" text="Contraseña:"/>
                        <webuijsf:textField id="userName" style="left: 192px; top: 360px; position: absolute"/>
                        <webuijsf:textField id="pass" style="height: 24px; left: 192px; top: 384px; position: absolute; width: 168px"/>
                        <webuijsf:label id="label8"
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 70px; left: 0px; top: 72px; position: absolute; width: 838px" text="Registro de Nuevo Usuario de FastLine"/>
                        <webuijsf:label id="label9" style="left: 72px; top: 168px; position: absolute" text="Ingrese sus datos"/>
                        <webuijsf:button actionExpression="#{registrarNuevoUsuario.verificarUserName_action}" id="verificarUserName"
                            style="left: 335px; top: 360px; position: absolute" text="Verificar Disponibilidad"/>
                        <webuijsf:button actionExpression="#{registrarNuevoUsuario.crearCuenta_action}" id="crearCuenta"
                            style="height: 24px; left: 191px; top: 456px; position: absolute; width: 144px" text="Crear Cuenta"/>
                        <webuijsf:image height="72" id="image1" style="left: 0px; top: 0px; position: absolute" url="/resources/Community%20Help.png" width="72"/>
                        <webuijsf:label id="label10"
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 46px; left: 72px; top: 0px; position: absolute; width: 166px" text="FastLine"/>
                        <webuijsf:label id="label11" style="left: 72px; top: 240px; position: absolute; text-align: right; width: 118px" text="Apellido Materno:"/>
                        <webuijsf:textField id="apellMaterno" style="left: 192px; top: 240px; position: absolute"/>
                        <webuijsf:label for="pass" id="label12" style="left: 48px; top: 408px; position: absolute; text-align: right; width: 142px" text="Confirme su Contraseña:"/>
                        <webuijsf:textField id="confirmPass" style="left: 192px; top: 408px; position: absolute"/>
                        <webuijsf:image height="24" id="image2" style="left: 336px; top: 456px; position: absolute" url="/resources/apply.png" width="24"/>
                        <webuijsf:image height="24" id="image3" style="left: 48px; top: 504px; position: absolute" url="/resources/back.png" width="24"/>
                        <webuijsf:image height="24" id="image4" style="left: 168px; top: 504px; position: absolute" url="/resources/folder_home.png" width="24"/>
                        <webuijsf:hyperlink actionExpression="#{registrarNuevoUsuario.home_action}" id="home"
                            style="height: 24px; left: 192px; top: 504px; position: absolute" text="Home"/>
                        <webuijsf:hyperlink actionExpression="#{registrarNuevoUsuario.regresar_action}" id="regresar"
                            style="height: 24px; left: 72px; top: 504px; position: absolute; width: 48px" text="Regresar"/>
                        <webuijsf:image height="48" id="image5" style="left: 24px; top: 168px; position: absolute" url="/resources/db_add.png" width="48"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>