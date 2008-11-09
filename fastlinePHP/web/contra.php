<html>
<head>
<script>
function abrir()
{
 window.open("consulta.php","","");
close();
}

function atras()
{
window.history.back();
}
</script>
</head>
<?php
$c="fastline";
if($c==$valor)
{echo "<center><BR><BR><BR><img src="../imagenes/feliz.jpg" width="112" height="107">Contraseña correcta<br></center>";
 echo "<center><input name=back type=button value=Ingresar onClick=abrir(); ></center>";
}
else
{echo "<center><BR><BR><BR><img src="../imagenes/triste.jpg" width="145" height="125">Contraseña incorrecta <BR></center>";
 echo "<center>Si desea intentelo de nuevo<BR></center>";
 echo "<center><input name=back type=button value=Atras onClick=atras(); ></center>";
 }
?>

</html>
