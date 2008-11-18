<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Encomiendas
    Created on : 16-nov-2008, 20:36:11
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
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 46px; left: 0px; top: 72px; position: absolute; width: 454px" text="Gestion de Encomiendas"/>
                        <webuijsf:label id="label2"
                            style="color: rgb(51, 153, 0); font-size: 36px; height: 46px; left: 72px; top: 0px; position: absolute; width: 166px" text="FastLine"/>
                        <webuijsf:image height="48" id="image1" style="left: 432px; top: 72px; position: absolute" url="/resources/blockdevice.png" width="48"/>
                        <webuijsf:image height="72" id="image2" style="left: 0px; top: 0px; position: absolute" url="/resources/utilities.png" width="72"/>
                        <webuijsf:label id="label3"
                            style="color: rgb(204, 204, 0); font-size: 14px; height: 22px; left: 72px; top: 144px; position: absolute; width: 166px" text="Nueva Encomienda"/>
                        <webuijsf:label id="label4" style="left: 96px; top: 216px; position: absolute; text-align: right; width: 67px" text="Origen:"/>
                        <webuijsf:label id="label5" style="left: 288px; top: 216px; position: absolute" text="Destino:"/>
                        <webuijsf:dropDown id="origenEncomienda" items="#{Encomiendas.origenEncomiendaDefaultOptions.options}" style="left: 168px; top: 216px; position: absolute"/>
                        <webuijsf:dropDown id="destinoEncomienda" items="#{Encomiendas.destinoEncomiendaDefaultOptions.options}" style="left: 336px; top: 216px; position: absolute"/>
                        <webuijsf:label id="label6" style="left: 48px; top: 240px; position: absolute; text-align: right; width: 118px" text="Fecha de Embarque:"/>
                        <webuijsf:calendar id="fechaEncomienda" readOnly="true" style="left: 168px; top: 240px; position: absolute"/>
                        <webuijsf:label id="label7" style="left: 96px; top: 480px; position: absolute; text-align: right; width: 70px" text="Nombre:"/>
                        <webuijsf:label id="label8" style="left: 48px; top: 432px; position: absolute; text-align: right; width: 118px" text="Apellido Paterno:"/>
                        <webuijsf:label id="label10" style="left: 144px; top: 504px; position: absolute; text-align: right; width: 24px" text="DNI:"/>
                        <webuijsf:textField id="apellPaterno1" style="height: 24px; left: 168px; top: 432px; position: absolute; width: 144px"/>
                        <webuijsf:textField id="nombres1" style="left: 168px; top: 480px; position: absolute"/>
                        <webuijsf:textField id="DNI1" style="left: 168px; top: 504px; position: absolute"/>
                        <webuijsf:label id="label11" style="left: 48px; top: 456px; position: absolute; text-align: right; width: 118px" text="Apellido Materno:"/>
                        <webuijsf:textField id="apellMaterno1" style="left: 168px; top: 456px; position: absolute"/>
                        <webuijsf:label id="label9" style="left: 48px; top: 408px; position: absolute" text="DATOS DE QUIEN ENVÍA"/>
                        <webuijsf:label id="label12" style="left: 408px; top: 480px; position: absolute; text-align: right; width: 70px" text="Nombre:"/>
                        <webuijsf:label id="label13" style="left: 360px; top: 432px; position: absolute; text-align: right; width: 118px" text="Apellido Paterno:"/>
                        <webuijsf:label id="label14" style="left: 456px; top: 504px; position: absolute; text-align: right; width: 24px" text="DNI:"/>
                        <webuijsf:textField id="apellPaterno2" style="height: 24px; left: 480px; top: 432px; position: absolute; width: 144px"/>
                        <webuijsf:textField id="nombres2" style="left: 480px; top: 480px; position: absolute"/>
                        <webuijsf:textField id="DNI2" style="left: 480px; top: 504px; position: absolute"/>
                        <webuijsf:label id="label15" style="left: 360px; top: 456px; position: absolute; text-align: right; width: 118px" text="Apellido Materno:"/>
                        <webuijsf:textField id="apellMaterno2" style="left: 480px; top: 456px; position: absolute"/>
                        <webuijsf:label id="label16" style="left: 360px; top: 408px; position: absolute" text="DATOS DE QUIEN RECIBE"/>
                        <webuijsf:label id="label17" style="left: 48px; top: 312px; position: absolute" text="CARACTERISTICAS DE LA ENCOMIENDA"/>
                        <webuijsf:label id="label18" style="height: 22px; left: 96px; top: 336px; position: absolute; text-align: right; width: 72px" text="Categoría:"/>
                        <webuijsf:dropDown id="categoriaEnc" items="#{Encomiendas.categoriaEncDefaultOptions.options}" style="left: 168px; top: 336px; position: absolute"/>
                        <webuijsf:label id="label19" style="height: 22px; left: 96px; top: 360px; position: absolute; text-align: right; width: 72px" text="Peso (Kg):"/>
                        <webuijsf:textField id="textField1" style="left: 168px; top: 360px; position: absolute"/>
                        <webuijsf:checkbox id="checkbox1" label="Frágil" style="left: 312px; top: 336px; position: absolute"/>
                        <webuijsf:label id="label20" style="height: 22px; left: 48px; top: 264px; position: absolute; text-align: right; width: 120px" text="Horarios Disponibles:"/>
                        <webuijsf:dropDown id="dropDown1" items="#{Encomiendas.dropDown1DefaultOptions.options}" style="left: 168px; top: 264px; position: absolute"/>
                        <webuijsf:label id="label21" style="height: 22px; left: 96px; top: 696px; position: absolute; text-align: right; width: 72px" text="Nro Recibo:"/>
                        <webuijsf:textField id="nroRecibo" style="left: 168px; top: 696px; position: absolute"/>
                        <webuijsf:label id="label22" style="left: 48px; top: 552px; position: absolute" text="OPCIONES DE PAGO"/>
                        <webuijsf:radioButtonGroup id="tipoPago" items="#{Encomiendas.tipoPagoDefaultOptions.options}" style="height: 24px; left: 48px; top: 576px; position: absolute"/>
                        <webuijsf:label id="label24" style="height: 22px; left: 48px; top: 648px; position: absolute; text-align: right; width: 120px" text="Monto Cancelado:"/>
                        <webuijsf:textField id="montoCancelado" style="left: 168px; top: 648px; position: absolute"/>
                        <webuijsf:button actionExpression="#{Encomiendas.registrarEncomienda_action}" id="registrarEncomienda"
                            style="height: 24px; left: 167px; top: 744px; position: absolute; width: 119px" text="Registrar Encomienda"/>
                        <webuijsf:image height="24" id="image3" style="left: 24px; top: 1440px; position: absolute" url="/resources/back.png" width="24"/>
                        <webuijsf:hyperlink actionExpression="#{Encomiendas.regresar_action}" id="regresar"
                            style="height: 24px; left: 48px; top: 1440px; position: absolute; width: 48px" text="Regresar"/>
                        <webuijsf:image height="24" id="image4" style="left: 288px; top: 744px; position: absolute" url="/resources/apply.png" width="24"/>
                        <webuijsf:hyperlink actionExpression="#{Encomiendas.home_action}" id="home"
                            style="height: 22px; left: 168px; top: 1440px; position: absolute" text="Home"/>
                        <webuijsf:image height="24" id="image5" style="left: 144px; top: 1440px; position: absolute" url="/resources/folder_home.png" width="24"/>
                        <webuijsf:image height="48" id="image6" style="left: 24px; top: 144px; position: absolute" url="/resources/db_add.png" width="48"/>
                        <webuijsf:label id="label23"
                            style="color: rgb(204, 204, 0); font-size: 14px; height: 22px; left: 72px; top: 816px; position: absolute; width: 238px" text="Actualizar Estado de Encomienda"/>
                        <webuijsf:image height="48" id="image7" style="left: 24px; top: 816px; position: absolute" url="/resources/db_comit.png" width="48"/>
                        <webuijsf:pageSeparator id="pageSeparator1" style="height: 7px; left: 0px; top: 768px; position: absolute; width: 624px"/>
                        <webuijsf:label id="label25" style="height: 22px; left: 48px; top: 864px; position: absolute; text-align: right; width: 72px" text="Nro Recibo:"/>
                        <webuijsf:textField id="nroReciboMod" style="left: 120px; top: 864px; position: absolute"/>
                        <webuijsf:button actionExpression="#{Encomiendas.buscarEncomienda1_action}" id="buscarEncomienda1"
                            style="height: 24px; left: 264px; top: 864px; position: absolute" text="Buscar"/>
                        <webuijsf:label id="label26" style="height: 22px; left: 24px; top: 912px; position: absolute; text-align: right; width: 190px" text="Estado Actual de la Encomienda:"/>
                        <webuijsf:textField id="textField2" readOnly="true" style="left: 216px; top: 912px; position: absolute"/>
                        <webuijsf:label id="label27" style="left: 24px; top: 936px; position: absolute; text-align: right; width: 190px" text="Nuevo Estado de la Encomienda:"/>
                        <webuijsf:dropDown id="dropDown2" items="#{Encomiendas.dropDown2DefaultOptions.options}" style="left: 216px; top: 936px; position: absolute"/>
                        <webuijsf:pageSeparator id="pageSeparator2" style="height: 7px; left: 0px; top: 984px; position: absolute; width: 624px"/>
                        <webuijsf:button actionExpression="#{Encomiendas.registrarEncomienda_action}" id="registrarEncomienda1"
                            style="height: 24px; left: 167px; top: 984px; position: absolute; width: 119px" text="Actualizar Encomienda"/>
                        <webuijsf:image height="24" id="image8" style="left: 288px; top: 984px; position: absolute" url="/resources/apply.png" width="24"/>
                        <webuijsf:label id="label28"
                            style="color: rgb(204, 204, 0); font-size: 14px; height: 22px; left: 72px; top: 1056px; position: absolute; width: 238px" text="Entrega y Pago de Encomienda"/>
                        <webuijsf:image height="48" id="image9" style="left: 24px; top: 1056px; position: absolute" url="/resources/db_comit.png" width="48"/>
                        <webuijsf:label id="label29" style="height: 22px; left: 48px; top: 1104px; position: absolute; text-align: right; width: 72px" text="Nro Recibo:"/>
                        <webuijsf:textField id="nroReciboPago" style="left: 120px; top: 1104px; position: absolute"/>
                        <webuijsf:label id="label30" style="height: 22px; left: 48px; top: 1152px; position: absolute; text-align: right; width: 190px" text="Estado Actual de la Encomienda:"/>
                        <webuijsf:textField id="estadoEnc" readOnly="true" style="left: 240px; top: 1152px; position: absolute"/>
                        <webuijsf:button actionExpression="#{Encomiendas.buscarEncomienda_action}" id="buscarEncomienda"
                            style="left: 263px; top: 1104px; position: absolute" text="Buscar"/>
                        <webuijsf:label id="label31" style="height: 22px; left: 120px; top: 1176px; position: absolute; text-align: right; width: 118px" text="Forma de Pago:"/>
                        <webuijsf:textField id="formaPago" readOnly="true" style="left: 240px; top: 1176px; position: absolute"/>
                        <webuijsf:label id="label32" style="height: 22px; left: 336px; top: 1176px; position: absolute; text-align: right; width: 118px" text="Monto Pagado:"/>
                        <webuijsf:textField id="monstoPagado" readOnly="true" style="left: 456px; top: 1176px; position: absolute"/>
                        <webuijsf:label id="label33" style="height: 22px; left: 552px; top: 1176px; position: absolute; text-align: right; width: 118px" text="Monto a Pagar:"/>
                        <webuijsf:textField id="montoAPagar" readOnly="true" style="left: 672px; top: 1176px; position: absolute"/>
                        <webuijsf:label id="label34" style="left: 96px; top: 1296px; position: absolute; text-align: right; width: 70px" text="Nombre:"/>
                        <webuijsf:label id="label35" style="left: 48px; top: 1248px; position: absolute; text-align: right; width: 118px" text="Apellido Paterno:"/>
                        <webuijsf:label id="label36" style="left: 144px; top: 1320px; position: absolute; text-align: right; width: 24px" text="DNI:"/>
                        <webuijsf:textField id="apellPaternoEntr" readOnly="true" style="height: 24px; left: 168px; top: 1248px; position: absolute; width: 144px"/>
                        <webuijsf:textField id="nombresEntr" readOnly="true" style="left: 168px; top: 1296px; position: absolute"/>
                        <webuijsf:textField id="DNIEntr" readOnly="true" style="left: 168px; top: 1320px; position: absolute"/>
                        <webuijsf:label id="label37" style="left: 48px; top: 1272px; position: absolute; text-align: right; width: 118px" text="Apellido Materno:"/>
                        <webuijsf:textField id="apellMaternoEntr" readOnly="true" style="left: 168px; top: 1272px; position: absolute"/>
                        <webuijsf:label id="label38" style="left: 48px; top: 1224px; position: absolute" text="ESTA ENCOMINDA DEBE SER ENTRAGADA A:"/>
                        <webuijsf:label id="label39" style="left: 408px; top: 1224px; position: absolute" text="CARACTERISTICAS DE LA ENCOMIENDA"/>
                        <webuijsf:label id="label40" style="height: 22px; left: 456px; top: 1248px; position: absolute; text-align: right; width: 72px" text="Categoría:"/>
                        <webuijsf:label id="label41" style="height: 22px; left: 456px; top: 1272px; position: absolute; text-align: right; width: 72px" text="Peso (Kg):"/>
                        <webuijsf:textField id="pesoEntr" readOnly="true" style="left: 528px; top: 1272px; position: absolute"/>
                        <webuijsf:textField id="categoriaEntr" readOnly="true" style="left: 528px; top: 1248px; position: absolute"/>
                        <webuijsf:button actionExpression="#{Encomiendas.regEncEntregada_action}" id="regEncEntregada"
                            style="height: 24px; left: 119px; top: 1368px; position: absolute" text="Registrar Encomienda Entregada"/>
                        <webuijsf:image height="24" id="image10" style="left: 288px; top: 1368px; position: absolute" url="/resources/apply.png" width="24"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
