import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame{

//TextField tf();
Button empty;
Button inverse;
Button log;
Button leftBracket;
Button rightBracket;
Button arrow;
Button cancel;
Button clear;
Button plusMines;
Button radi;
// *******  row two start here *****

Button integer;
Button sineh;
Button sine;
Button xSquare;
Button nfac;
Button seven;
Button eight;
Button nine;
Button divide;
Button percent;


// *******  row three start here *****
Button Dms;
Button coseh;
Button cose;
Button Xpowery;
Button XradiY;
Button four;
Button five;
Button six;
Button star;
Button onex;


// *******  row four start here *****

Button pie;
Button taneh;
Button tane;
Button Xpower3;
Button threeradiX;
Button one;
Button two;
Button three;
Button mines;
Button equalTo;


// *******  row five start here *****

Button fe;
Button expo;
Button modulus;
Button logrithm;
Button tenX;
Button zero;
Button decimal;
Button plus;


Calculator (){
	
	setLayout(null);
	setBounds(0,0,900,900);

	//tf = new TextField();
	//tf.setBounds(0,0,200,50);
	//add(tf); 
	
	
	empty =  new Button("");
	empty.setBounds(50,200,50,50);
	add(empty);
	setVisible(true);

	inverse =  new Button("inv");
	inverse.setBounds(100,200,50,50);
	add(inverse);

	
	log =  new Button("ln");
	log.setBounds(150,200,50,50);
	add(log);


	leftBracket =  new Button("(");
	leftBracket.setBounds(200,200,50,50);
	add(leftBracket);


	rightBracket =  new Button(")");
	rightBracket.setBounds(250,200,50,50);
	add(rightBracket);
	setVisible(true);


	
	arrow =  new Button("<-");
	arrow.setBounds(300,200,50,50);
	add(arrow);
	setVisible(true);

	
	cancel =  new Button("CE");
	cancel.setBounds(350,200,50,50);
	add(cancel);
	setVisible(true);

	
	clear =  new Button("C");
	clear.setBounds(400,200,50,50);
	add(clear);
	setVisible(true);


	
	plusMines =  new Button("+,_");
	plusMines.setBounds(450,200,50,50);
	add(plusMines);
	setVisible(true);	

	radi =  new Button("radical");
	radi.setBounds(500,200,50,50);
	add(radi);
	setVisible(true);
	

        // ********** row two starts here .*******
	

	integer =  new Button("int");
	integer.setBounds(50,250,50,50);
	add(integer);
	setVisible(true);


	
	sineh =  new Button("sinh");
	sineh.setBounds(100,250,50,50);
	add(sineh);
	setVisible(true);

	
	sine =  new Button("sin");
	sine.setBounds(150,250,50,50);
	add(sine);
	setVisible(true);

	
	xSquare =  new Button("x2");
	xSquare.setBounds(200,250,50,50);
	add(xSquare);
	setVisible(true);



	
	nfac =  new Button("n!");
	nfac.setBounds(250,250,50,50);
	add(nfac);
	setVisible(true);

	
	seven =  new Button("7");
	seven.setBounds(300,250,50,50);
	add(seven);
	setVisible(true);


	eight =  new Button("8");
	eight.setBounds(350,250,50,50);
	add(eight);
	setVisible(true);	


	
	nine =  new Button("9");
	nine.setBounds(400,250,50,50);
	add(nine);
	setVisible(true);

	
	divide =  new Button("/");
	divide.setBounds(450,250,50,50);
	add(divide);
	setVisible(true);
	
	
	percent =  new Button("%");
	percent.setBounds(500,250,50,50);
	add(percent);
	setVisible(true);



	// *******  row three start here *****


	Dms =  new Button("dms");
	Dms.setBounds(50,300,50,50);
	add(Dms);
	setVisible(true);


	coseh =  new Button("cosh");
	coseh.setBounds(100,300,50,50);
	add(coseh);
	setVisible(true);


	cose =  new Button("cos");
	cose.setBounds(150,300,50,50);
	add(cose);
	setVisible(true);


	Xpowery =  new Button("Xy");
	Xpowery.setBounds(200,300,50,50);
	add(Xpowery);
	setVisible(true);


	XradiY =  new Button("Xrady");
	XradiY.setBounds(250,300,50,50);
	add(XradiY);
	setVisible(true);


	four =  new Button("4");
	four.setBounds(300,300,50,50);
	add(four);
	setVisible(true);


	five =  new Button("5");
	five.setBounds(350,300,50,50);
	add(five);
	setVisible(true);


	six =  new Button("6");
	six.setBounds(400,300,50,50);
	add(six);
	setVisible(true);


	star =  new Button("*");
	star.setBounds(450,300,50,50);
	add(star);
	setVisible(true);


	onex =  new Button("1/X");
	onex.setBounds(500,300,50,50);
	add(onex);
	setVisible(true);


	// *******  row four start here *****


	pie =  new Button("Pie");
	pie.setBounds(50,350,50,50);
	add(pie);
	setVisible(true);


	taneh =  new Button("tanh");
	taneh.setBounds(100,350,50,50);
	add(taneh);
	setVisible(true);


	tane =  new Button("tan");
	tane.setBounds(150,350,50,50);
	add(tane);
	setVisible(true);


	Xpower3 =  new Button("X3");
	Xpower3.setBounds(200,350,50,50);
	add(Xpower3);
	setVisible(true);


	threeradiX =  new Button("3radX");
	threeradiX.setBounds(250,350,50,50);
	add(threeradiX);
	setVisible(true);


	one =  new Button("1");
	one.setBounds(300,350,50,50);
	add(one);
	setVisible(true);


	two =  new Button("2");
	two.setBounds(350,350,50,50);
	add(two);
	setVisible(true);


	three =  new Button("3");
	three.setBounds(400,350,50,50);
	add(three);
	setVisible(true);


	mines =  new Button("-");
	mines.setBounds(450,350,50,50);
	add(mines);
	setVisible(true);


	equalTo =  new Button("=");
	equalTo.setBounds(500,350,50,100);
	add(equalTo);
	setVisible(true);


// *******  row five start here *****


	fe =  new Button("F-E");
	fe.setBounds(50,400,50,50);
	add(fe);
	setVisible(true);

	expo =  new Button("EXP");
	expo.setBounds(100,400,50,50);
	add(expo);
	setVisible(true);

	modulus =  new Button("MOD");
	modulus.setBounds(150,400,50,50);
	add(modulus);
	setVisible(true);

	logrithm =  new Button("Log");
	logrithm.setBounds(200,400,50,50);
	add(logrithm);
	setVisible(true);

	tenX =  new Button("10x");
	tenX.setBounds(250,400,50,50);
	add(tenX);
	setVisible(true);

	zero =  new Button("0");
	zero.setBounds(300,400,100,50);
	add(zero);
	setVisible(true);

	plus =  new Button("+");
	plus.setBounds(350,400,40,50);
	add(plus);
	setVisible(true);

	plus =  new Button("+");
	plus.setBounds(400,400,50,50);
	add(plus);
	setVisible(true);


	}          //*********end of constructor ******
public static void main(String args[]){

Calculator ob = new Calculator ();

   }
}
