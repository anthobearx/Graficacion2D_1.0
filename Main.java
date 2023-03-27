import javax.swing.*;
import java.awt.*;
public class Main extends JPanel {
    public static void main(String[] args) {
        //Ventana programa
        Main a = new Main();
        JFrame graphics = new JFrame("TIENDA");
        graphics.setResizable(false);
        graphics.setSize(750,800);
        graphics.add(a);
        graphics.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graphics.setVisible(true);
    }
    //paint
    public void paint(Graphics g) {
        super.paint(g);//g
        Graphics2D g2 = (Graphics2D) g;//g2 (degradados)
        int xMax = 750, yMax = 750;
        //fondo
        //cielo
        //0,0 - xMax, 452
        GradientPaint deg_cielo = new GradientPaint(0, 0, new Color(1,
                87, 145), 0, 83, new Color(0, 178, 205), false);
        g2.setPaint(deg_cielo); //elegir color
        g2.fillRect(0, 0, xMax, yMax); //rellenar el fondo del cielo
        GradientPaint deg_cielo2 = new GradientPaint(0, 83, new Color(0,
                178, 205), 0, 452, new Color(255, 250, 241), false);
        g2.setPaint(deg_cielo2);
        g2.fillRect(0, 90, xMax, yMax);
        //avion
        int[] poligavionx;
        int[] poligaviony;
        g.setColor(Color.WHITE);
        for (int i = 297; i < 530; i++) {
            g.fillRect(i, 144, 11, 1);
            i += 17;
        }
        poligavionx = new int[]{545, 543, 547, 560, 561, 555, 564, 568,
                578, 580, 578, 568, 564, 556, 560, 547, 543};
        poligaviony = new int[]{144, 138, 143, 143, 140, 127, 136, 141,
                142, 144, 146, 146, 152, 164, 147, 147, 151};
        g.fillPolygon(poligavionx, poligaviony, 17);
        //nubes
        //nube 1
        g.fillArc(295, 98, 11, 5, 0, 180);
        g.fillArc(304, 86, 34, 29, 0, 180);
        g.fillArc(334, 97, 13, 7, 0, 180);
        //nube 2
        g.fillArc(327, 100, 11, 12, 0, 180);
        g.fillArc(336, 89, 34, 33, 0, 180);
        g.fillArc(366, 98, 17, 16, 0, 180);
        //calle
        //0, 704 - xMax, 750
        g.setColor(new Color(164, 166, 165));//borde calle
        g.fillRect(0, 704, xMax, 7);
        g.setColor(new Color(126, 127, 129));//linea
        g.fillRect(0, 710, xMax, 3);
        g.setColor(new Color(141, 142, 144));//pavimento calle
        g.fillRect(0, 712, xMax, 38);
        g.setColor(new Color(165, 167, 169));//separado linea
        for (int i = 0; i < xMax; i++) { //hace cuadros en y 730 con un ancho de 43 y altura de 2, cada 53 px hace otro
            g.fillRect(i, 730, 43, 2);
            i += 53;
        }
        //edificios
        int[] edifpoligx;
        int[] edifpoligy;
        //0,453 - xMax, 704
        //degradado edificios
        GradientPaint deg_edif = new GradientPaint(0, 332, new Color(89,
                181, 198), 0, 461, new Color(170, 220, 233), false); //deg. edificios
        g2.setPaint(deg_edif);
        //n. edificios
        //edificio 1
        g2.fillRect(0, 284, 14, 170);
        g2.fillRect(0, 250, 3, 29);
        //edificio 2
        g2.fillRect(40, 332, 53, 129);
        g2.fillArc(40, 308, 53, 50, 0, 180);
        g2.drawLine(67, 308, 67, 290);
        g2.drawLine(68, 308, 68, 290);
        //edificio 3
        g2.fillRect(114, 215, 66, 238);
        edifpoligx = new int[]{114, 114, 178};
        edifpoligy = new int[]{215, 195, 215};
        g.fillPolygon(edifpoligx, edifpoligy, 3);
        //edificio 4
        g2.fillRect(189, 298, 31, 158);
        //edificio 5
        g2.fillRect(295, 230, 77, 223);//princ.
        g2.fillRect(308, 227, 8, 5);
        g2.fillRect(311, 221, 4, 9);
        g2.fillRect(315, 165, 42, 66);
        g2.fillRect(357, 189, 13, 42);
        //edificio 6
        g2.fillRect(402, 206, 69, 247);
        //edificio 7
        g2.fillRect(530, 267, 70, 186);
        //edificio 8
        g2.fillRect(617, 224, 63, 229);
        edifpoligx = new int[]{617, 682, 617};
        edifpoligy = new int[]{224, 224, 201};
        g.fillPolygon(edifpoligx, edifpoligy, 3);
        //edificio 9
        g2.fillRect(694, 304, 30, 149);
        g2.fillRect(724, 336, 26, 117);
        //base edificios (0,453 - xMax, 703)
        GradientPaint deg_baseedificios = new GradientPaint(0, 453, new
                Color(170, 220, 233), 0, 704, new Color(195, 238, 244), false); //deg.base edificios
        g2.setPaint(deg_baseedificios);
        g2.fillRect(0, 453, xMax, 251);
        //arboles
        //arbol 1
        //hojas arbol 1
        g.setColor(new Color(158,240,0));
        g.fillArc(-5,545,30,30,0,360);
        g.fillArc(-10,540,30,30,0,360);
        g.fillArc(-13,520,30,30,0,360);
        g.fillArc(-3,510,30,30,0,360);//
        g.fillArc(12,560,20,20,0,360);
        g.fillArc(-15,560,20,20,0,360);
        g.fillArc(12,520,20,20,0,360);
        g.fillArc(14,467,30,30,0,360);//
        g.fillArc(25,480,20,20,0,360);
        g.fillArc(27,470,20,20,0,360);
        g.fillArc(10,470,20,20,0,360);
        g.fillArc(5,438,25,25,0,360);
        g.fillArc(12,425,25,25,0,360);
        g.fillArc(0,420,32,32,0,360);
        g.fillArc(2,390,40,40,0,360);
        g.fillArc(17, 415,35,35,0,360);//
        g.fillArc(17,446,20,20,0,360);
        g.fillArc(0,441,20,20,0,360);
        g.fillArc(36,432,20,20,0,360);
        g.fillArc(36,412,20,20,0,360);
        //
        g.fillArc(50, 320,40,40,0,360);
        g.fillArc(0, 330,75,75,0,360);
        g.fillArc(70, 330,75,75,0,360);//
        g.fillArc(35,390,20,20,0,360);
        g.fillArc(0,345,20,20,0,360);
        g.fillArc(8,331,20,20,0,360);
        g.fillArc(28,317,20,20,0,360);
        g.fillArc(44,317,22,22,0,360);
        g.fillArc(72,314,28,28,0,360);
        g.fillArc(97,316,30,28,0,360);
        g.fillArc(110,332,30,28,0,360);
        g.fillArc(128,344,20,20,0,360);
        g.fillArc(128,365,20,20,0,360);
        g.fillArc(124,376,20,30,0,360);
        g.fillArc(110,389,20,20,0,360);
        g.fillArc(110,389,20,20,0,360);
        g.fillArc(99,393,20,20,0,360);
        g.fillArc(82,396,25,20,0,360);
        g.fillArc(98, 418,70,50,0,360);//
        g.fillArc(95,422,20,20,0,360);
        g.fillArc(110,415,20,20,0,360);
        g.fillArc(122,416,20,20,0,360);
        g.fillArc(138,415,20,20,0,360);
        g.fillArc(148,418,20,20,0,360);
        g.fillArc(154,429,20,20,0,360);
        g.fillArc(164,439,20,20,0,360);
        g.fillArc(167,445,20,20,0,360);
        g.fillArc(155,447,20,20,0,360);
        g.fillArc(145,457,15,15,0,360);
        g.fillArc(130,453,20,20,0,360);
        g.fillArc(115,455,20,20,0,360);
        g.fillArc(105,450,20,20,0,360);
        g.fillArc(98, 475,35,35,0,360);//
        g.fillArc(96, 497,15,20,0,360);
        g.fillArc(93,486,20,20,0,360);
        g.fillArc(95,478,20,20,0,360);
        g.fillArc(105,470,20,25,0,360);
        g.fillArc(115,475,20,20,0,360);
        g.fillArc(116,493,20,20,0,360);
        g.fillArc(140, 480,30,30,0,360);//
        g.fillArc(158,475,20,20,0,360);
        g.fillArc(156,495,20,20,0,360);
        g.fillArc(146, 512,30,30,0,360);//
        g.fillArc(146, 526,20,20,0,360);
        g.fillArc(159, 530,20,20,0,360);
        g.fillArc(94, 547,40,40,0,360);
        g.fillArc(94, 545,20,20,0,360);
        g.fillArc(106, 545,20,20,0,360);
        g.fillArc(116, 547,20,20,0,360);
        g.fillArc(120, 551,20,20,0,360);
        g.fillArc(116, 567,20,20,0,360);
        g.fillArc(94, 581,15,15,0,360);
        g.fillArc(90, 580,10,10,0,360);
        //tronco arbol 1
        g.setColor(new Color(206, 111, 70));
        int[] puntarbolx = {57, 59, 25, 18, 16, 23, 18, 24, 28, 59, 61,
                0, 0, 27, 28, 30, 30, 60, 60, 41, 37, 27, 27,
                37, 32, 35, 40, 41, 44, 43, 62, 62, 50, 55, 65, 65, 70,
                70, 85, 88, 71, 71, 97, 103, 104, 101, 108,
                110, 102, 112, 113, 100, 73, 73, 113, 113, 115, 116, 143,
                146, 150, 148, 160, 158, 147, 73, 73, 98, 102, 102, 73,
                74};
        int[] puntarboly = {704, 574, 551, 557, 554, 549, 536, 536, 547,
                565, 525, 501, 493, 503, 493, 493, 503, 516, 484, 459, 457, 456, 454,
                454, 446, 446, 453, 443, 445, 455, 477, 419, 402, 395,
                414, 387, 387, 414, 399, 403, 420, 456, 444, 441, 433, 442, 441,
                444, 446, 450, 455, 449, 462, 537, 521, 505, 503, 520,
                508, 493, 499, 511, 517, 522, 516, 545, 569, 561, 562, 569,
                579, 704};
        g.fillPolygon(puntarbolx, puntarboly, 72);
        //arbol 2 [+632]
        //hojas arbol 2
        g.setColor(new Color(158,240,0));
        g.fillArc(627,545,30,30,0,360);
        g.fillArc(622,540,30,30,0,360);
        g.fillArc(619,520,30,30,0,360);
        g.fillArc(629,510,30,30,0,360);//
        g.fillArc(644,560,20,20,0,360);
        g.fillArc(617,560,20,20,0,360);
        g.fillArc(644,520,20,20,0,360);
        g.fillArc(646,467,30,30,0,360);//
        g.fillArc(657,480,20,20,0,360);
        g.fillArc(659,470,20,20,0,360);
        g.fillArc(642,470,20,20,0,360);
        g.fillArc(637,438,25,25,0,360);
        g.fillArc(644,425,25,25,0,360);
        g.fillArc(632,420,32,32,0,360);
        g.fillArc(634,390,40,40,0,360);
        g.fillArc(649, 415,35,35,0,360);//
        g.fillArc(649,446,20,20,0,360);
        g.fillArc(632,441,20,20,0,360);
        g.fillArc(668,432,20,20,0,360);
        g.fillArc(668,412,20,20,0,360);
        //
        g.fillArc(682, 320,40,40,0,360);
        g.fillArc(632, 330,75,75,0,360);
        g.fillArc(702, 330,75,75,0,360);//
        g.fillArc(667,390,20,20,0,360);
        g.fillArc(632,345,20,20,0,360);
        g.fillArc(640,331,20,20,0,360);
        g.fillArc(660,317,20,20,0,360);
        g.fillArc(676,317,22,22,0,360);
        g.fillArc(704,314,28,28,0,360);
        g.fillArc(729,316,30,28,0,360);
        g.fillArc(742,332,30,28,0,360);
        g.fillArc(760,344,20,20,0,360);
        g.fillArc(760,365,20,20,0,360);
        g.fillArc(756,376,20,30,0,360);
        g.fillArc(742,389,20,20,0,360);
        g.fillArc(742,389,20,20,0,360);
        g.fillArc(731,393,20,20,0,360);
        g.fillArc(714,396,25,20,0,360);
        g.fillArc(730, 418,70,50,0,360);//
        g.fillArc(95,422,20,20,0,360);
        g.fillArc(727,415,20,20,0,360);
        g.fillArc(754,416,20,20,0,360);
        g.fillArc(770,415,20,20,0,360);
        g.fillArc(780,418,20,20,0,360);
        g.fillArc(786,429,20,20,0,360);
        g.fillArc(796,439,20,20,0,360);
        g.fillArc(799,445,20,20,0,360);
        g.fillArc(787,447,20,20,0,360);
        g.fillArc(777,457,15,15,0,360);
        g.fillArc(762,453,20,20,0,360);
        g.fillArc(747,455,20,20,0,360);
        g.fillArc(737,450,20,20,0,360);
        g.fillArc(730, 475,35,35,0,360);//
        g.fillArc(728, 497,15,20,0,360);
        g.fillArc(725,486,20,20,0,360);
        g.fillArc(727,478,20,20,0,360);
        g.fillArc(737,470,20,25,0,360);
        g.fillArc(747,475,20,20,0,360);
        g.fillArc(748,493,20,20,0,360);
        g.fillArc(772, 480,30,30,0,360);//
        g.fillArc(790,475,20,20,0,360);
        g.fillArc(788,495,20,20,0,360);
        g.fillArc(778, 512,30,30,0,360);//
        g.fillArc(778, 526,20,20,0,360);
        g.fillArc(791, 530,20,20,0,360);
        g.fillArc(726, 547,40,40,0,360);
        g.fillArc(726, 545,20,20,0,360);
        g.fillArc(738, 545,20,20,0,360);
        g.fillArc(748, 547,20,20,0,360);
        g.fillArc(752, 551,20,20,0,360);
        g.fillArc(748, 567,20,20,0,360);
        g.fillArc(726, 581,15,15,0,360);
        g.fillArc(722, 580,10,10,0,360);
        //tronco arbol 2
        //restante parte hojas de arbol 2
        g.fillArc(575,427,50,50,0,360);
        g.fillArc(605, 470,15,15,0,360);
        g.fillArc(615, 460,15,15,0,360);
        g.fillArc(615, 445,15,15,0,360);
        g.fillArc(615, 440,30,15,0,360);
        g.fillArc(620, 430,30,30,0,360);
        g.fillArc(585, 495,30,30,0,360);
        g.setColor(new Color(206, 111, 70));
        puntarbolx = new int[]{689, 691, 657, 650, 648, 655, 650, 656,
                660, 691, 693, 635, 635, 659, 660, 662, 662, 692, 692, 673, 669, 659,
                659,
                669, 664, 667, 672, 673, 676, 675, 694, 694, 682, 687,
                697,692, 700, 702, 717, 720, 703, 703, 729, 735, 736, 733, 740,
                742, 734, 744, 745, 732, 705, 705, 745, 745, 747, 748,
                775, 778, 782, 780, 792, 790, 779, 705, 705, 730, 734, 734, 705,
                706};
        g.fillPolygon(puntarbolx,puntarboly,72);
        //parte restante del arbol 2
        puntarbolx = new
                int[]{637,623,609,608,620,606,605,622,620,624,628,637};
        puntarboly = new
                int[]{499,497,499,495,492,489,482,488,468,467,490,493};
        g.fillPolygon(puntarbolx,puntarboly,12);
        //tienda
        //anuncio blanco
        g.setColor(new Color(255,255,255));
        g.fillRect(232,255,309,69);
        //anuncio morado
        g.setColor(new Color(82,95,111));//princ
        g.fillRect(270,266,234,49);
        //circulos blancos
        g.setColor(Color.white);
        g.fillOval(268,265,8,8);
        g.fillOval(498,265,8,8);
        g.fillOval(268,307,8,8);
        g.fillOval(498,307,8,8);
        //circulitos
        g.fillOval(273,275,3,3);
        g.fillOval(278,268,3,3);
        g.fillOval(492,268,3,3);
        g.fillOval(497,275,3,3);
        g.fillOval(272,303,3,3);
        g.fillOval(280,310,3,3);
        g.fillOval(497,303,3,3);
        g.fillOval(493,310,3,3);
        //letras
        g.setFont(new Font("Verdana ", Font.BOLD,40));
        g.drawString("SHOP",335,305);
        //barra gris
        g.setColor(new Color(201,201,201));
        g.fillRect(168,324,430,38);
        //cuadro morado
        g.setColor(new Color(81,93,109));
        g.fillRect(176,361,414,343);
        //sombra
        g.setColor(new Color(32,37,48));
        g.fillRect(176,361,414,4);
        //cuadros blancos
        g.setColor(Color.WHITE);
        g.fillRect(170,670,143,34);
        g.fillRect(468,670,143,34);
        //ventana 1
        g.setColor(new Color(149,131,114));
        g.fillRect(198,505,84,149);
        g.setColor(new Color(254,254,251));//c. white
        //for para poner ventanas
        int x,y=477;//(se ponen esos valores para que queden bien)
 /*Nota para el antho del futuro: no se que hice, pero funciono,
NO LE MUEVAS**/
        for (int i = 0; i <4 ; i++) {
            x=209;
            y+=35;
            for (int j = 0; j <3 ; j++) {
                g.fillRect(x,y,17,30);
                x+=23;
            }
        }
        //ventana 2
        g.setColor(new Color(149,131,114));
        g.fillRect(484,505,84,149);
        g.setColor(new Color(254,254,251));//c. white
        //for para poner ventanas
        y=477;
        for (int i = 0; i <4 ; i++) {
            x=494;
            y+=35;
            for (int j = 0; j <3 ; j++) {
                g.fillRect(x,y,17,30);
                x+=23;
            }
        }
        //puerta
        g.setColor(new Color(149,131,114));
        g.fillRect(348,485,84,190);
        g.setColor(new Color(254,254,251));//c. white
        //for para poner ventanas en la puerta
        y=430;
        for (int i = 0; i <3 ; i++) {
            x=360;
            y+=60;
            for (int j = 0; j <2 ; j++) {
                g.fillRect(x,y,25,55);
                x+=34;
            }
        }
        //manija
        g.setColor(new Color(198,175,95));
        g.fillRect(423,577,6,26);
        g.setColor(new Color(161,130,51));
        g.fillArc(428,580,3,3,0,360);
        g.fillArc(428,590,3,3,0,360);
        g.fillArc(428,600,3,3,0,360);
        //piso debajo de puerta
        int[] puntosx={312,348,432,467};
        int[] puntosy={704,671,671,704};
        g.setColor(new Color(83,95,105));
        g.fillPolygon(puntosx,puntosy,4);
        //pisos con sombra de bajo de la puerta
        puntosx= new int[]{312, 348, 348, 312};
        puntosy= new int[]{704, 671, 645, 670};
        g.setColor(new Color(199,201,200));
        g.fillPolygon(puntosx,puntosy,4);
        //pisos con sombra de bajo de la puerta 2
        puntosx= new int[]{468, 432, 432, 468};
        puntosy= new int[]{705, 671, 645, 670};
        g.fillPolygon(puntosx,puntosy,4);
        //sombra derecha de la puerta
        puntosx= new int[]{348, 312,312,348};
        puntosy= new int[]{645, 670,490,485};
        g.setColor(new Color(49,51,65));
        g.fillPolygon(puntosx,puntosy,4);
        //sombra izquierda de la puerta
        puntosx= new int[]{468, 432,432,468};
        puntosy= new int[]{670, 644,485,490};
        g.fillPolygon(puntosx,puntosy,4);

        //malla roja-blanca
        int x1=106,x2=189,x3=236,x4=162,y1=497,y2=400; //iniciales
        //106+ 56= [162]+56= [218] || x1 y x4 suman 56 pixeles en cada poligono
        //x2 y x3(189,236[54],236,290[47],290,337[51],337,388[40],388,428[51],428,479[47],479,526[57]526,583
        int[] difx2x3={0,54,47,51,40,51,47,57};
        for (int i = 0; i < 8; i++) {
            x1+=56;x4+=56;
            //sombre de ruedas malla
            g.setColor(new Color(38,42,51,200));
            g.fillArc(x1,y1-40,58,90,180,180);
            //malla princ
            if (i!=0){//si no es la primera vez x3, queda con su primer valor, si no, obtiene el de x2
                        x2=x3;
                x3=x3+difx2x3[i];//x2 va a ser igual a su valor + el valor del arreglo
            }
            if (i%2==0){
                g.setColor(new Color(252,67,66));
            }else {
                g.setColor(new Color(254,255,254));
            }
            puntosx= new int[]{x1, x2,x3,x4};
            puntosy= new int[]{y1, y2,y2,y1};
            g.fillPolygon(puntosx,puntosy,4);
            //ruedas mallas
            if (i%2==0){
                g.setColor(new Color(192,42,38));
            }else {
                g.setColor(new Color(218,218,219));
            }
            g.fillArc(x1,y1-26,56,52,180,180);
        }
    }
}