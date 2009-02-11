<%
char comi='"';
 String[] departamentos= new String[25];
//departamentos[1]="";  
departamentos[0]="Amazonas";
departamentos[1]="Ancash"; 
departamentos[2]="Apurimac";
departamentos[3]="Arequipa";
departamentos[4]="Ayacucho";  
departamentos[5]="Cajamarca";  
//departamentos[6]="Callao";  
departamentos[6]="Cusco";  
departamentos[7]="Huancavelica";  
departamentos[8]="Huanuco";  
departamentos[9]="Ica";  
departamentos[10]="Junin";
departamentos[11]="La Libertad";  
departamentos[12]="Lambayeque";  
departamentos[13]="Lima";  
departamentos[14]="Loreto";  
departamentos[15]="Madre De Dios";  
departamentos[16]="Moquegua";  
departamentos[17]="Pasco";
departamentos[18]="Piura";
departamentos[19]="Puno";
departamentos[20]="San Martin";
departamentos[21]="Tacna";
departamentos[22]="Tumbes";
departamentos[23]="Ucayali";
//departamentos[1]="";
//String[] depInfo= new String[24];
//depInfo[0]=" 'Bienvenido a Amazonas <img src="+comi+"departamentosImages/aqp.jpeg"+comi+" width=150 height=100> ');";
//http://www.perucontact.com/es/conozca/amazonas.php
double [][] depll= new double[24][2];
//    * Amazonas chachapoyas ll=-6.20609,-77.76123
depll[0][0]=-6.20609;
depll[0][1]=-77.76123;

//    * Ancash ciudad de huaraz ll=-9.340672,-77.860107
depll[1][0]=-9.340672;
depll[1][1]=-77.860107;
//    * Apurimac Ciudad de Abancay (-13.389619591747595, -72.894287109375)
depll[2][0]=-13.389619591747595;
depll[2][1]=-72.894287109375;

//   * Arequipa Arequipa (-16.372850601795864, -71.510009765625)
depll[3][0]=-16.372850601795864;
depll[3][1]= -71.510009765625;
//    * Ayacucho Ciudad de Ayacucho (-12.597454504832003, -74.2236328125)
depll[4][0]=-12.597454504832003;
depll[4][1]= -74.2236328125;
//    * Cajamarca Ciudad de Cajamarca  (-6.664607562172572, -78.5302734375)
depll[5][0]=-6.664607562172572;
depll[5][1]=-78.5302734375;
//   * Callao
//depll[1][0]=45; 
//depll[1][1]=45;
//   * Cusco Ciudad de Cusco  (-12.940322128384613, -72.00439453125)
depll[6][0]=-12.940322128384613;
depll[6][1]=-72.00439453125;
//   * Huancavelica Ciudad de Huancavelica   (-12.554563528593656, -74.959716796875)
depll[7][0]=-12.554563528593656;
depll[7][1]=-74.959716796875;
//   * Huanuco Ciudad de Huánuco  (-9.67656858750112, -76.2890625)
depll[8][0]=-9.67656858750112;
depll[8][1]=-76.2890625;
//   * Ica   Ciudad de Ica  (-13.838079936422462, -75.7177734375)
depll[9][0]=-13.838079936422462;
depll[9][1]=-75.7177734375;
//    * Junin Ciudad de Huancayo (-11.587669416896203, -75.146484375)
depll[10][0]=-11.587669416896203;
depll[10][1]=-75.146484375;
//    * La Libertad Ciudad de Trujillo (-7.667441482726056, -79.1455078125)
depll[11][0]=-7.667441482726056;
depll[11][1]=-79.1455078125;
//    * Lambayeque Ciudad de Chiclayo (-6.762806474971467, -79.82666015625)
depll[12][0]=-6.762806474971467;
depll[12][1]=-79.82666015625;
//    * Lima  La ciudad de Lima  (-12.060809058367294, -77.047119140625)
depll[13][0]=-12.060809058367294;
depll[13][1]=-77.047119140625;
//    * Loreto Ciudad de Iquitos (-3.7491527000118814, -73.2623291015625)
depll[14][0]=-3.7491527000118814;
depll[14][1]=-73.2623291015625;
//    * Madre De Dios Ciudad de Puerto Maldonado (-12.576009912063787, -69.14794921875)
depll[15][0]=-12.576009912063787;
depll[15][1]=-69.14794921875;
//    * Moquegua Ciudad de Moquegua (-17.193274736612807, -70.916748046875)
depll[16][0]=-17.193274736612807;
depll[16][1]=-70.916748046875;
//    * Pasco Cerro de Pasco (-10.660607953624762, -76.256103515625)
depll[17][0]=-10.660607953624762;
depll[17][1]=-76.256103515625;
//    * Piura Ciudad de Piura (-5.156598738411155, -80.606689453125)
depll[18][0]=-5.156598738411155;
depll[18][1]=-80.606689453125;
//    * Puno Ciudad de Puno  (-15.834535741221552, -70.02685546875)
depll[19][0]=-15.834535741221552;
depll[19][1]=-70.02685546875;
//    * San Martin Ciudad de Moyobamba (-5.943899579425587, -76.92626953125)
depll[20][0]=-5.943899579425587;
depll[20][1]=-76.92626953125;
//    * Tacna tacna (-18.020527657852327, -70.224609375)
depll[21][0]=-18.020527657852327;
depll[21][1]=-70.224609375;
//    * Tumbes Ciudad de Tumbes  (-3.513421045640032, -80.419921875)
depll[22][0]=-3.513421045640032;
depll[22][1]=-80.419921875;
//    * Ucayali Ciudad de Pucallpa (-8.363692651835823, -74.4873046875)
depll[23][0]=-8.363692651835823;
depll[23][1]=-74.4873046875;


%>