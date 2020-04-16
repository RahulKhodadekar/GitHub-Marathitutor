package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.login.R;
import com.example.login.view;

import static android.media.AudioAttributes.USAGE_ASSISTANCE_SONIFICATION;

public class barakhadi extends AppCompatActivity {
    private SoundPool soundPool;
    private int क,का,कि,की,कु,कू,के,कै,को,कौ,कं,कः,ख,खा,खि,खी,खु,खू,खे,खै,खो,खौ,खं,खः,ग,गा,गि,गी,गु,गू,गे,गै,गो,गौ,गं,गः,घ,घा,घि,घी,घु,घू,घे,घै,घो,घौ,घं,घः,च,चा,चि,ची,चु,चू,चे,चै,चो,चौ,चं,चः,छ,छा,छि,छी,छु,छू,छे,छै,छो,छौ,छं,छः,ज,जा,जि,जी,जु,जू,जे,जै,जो,जौ,जं,जः,झ,झा,झि,झी,झु,झू,झे,झै,झो,झौ,झं,झः,ट,टा,टि,टी,टु,टू,टे,टै,टो,टौ,टं,टः,ठ,ठा,ठि,ठी,ठु,ठू,ठे,ठै,ठो,ठौ,ठं,ठः,ड,डा,डि,डी,डु,डू,डे,डै,डो,डौ,डं,डः,ढ,ढा,ढि,ढी,ढु,ढू,ढे,ढै,ढो,ढौ,ढं,ढः,ण,णा,णि,णी,णु,णू,णे,णै,णो,णौ,णं,णः,त,ता,ति,ती,तु,तू,ते,तै,तो,तौ,तं,तः,थ,था,थि,थी,थु,थू,थे,थै,थो,थौ,थं,थः,द,दा,दि,दी,दु,दू,दे,दै,दो,दौ,दं,दः;
    private int ध,धा,धि,धी,धु,धू,धे,धै,धो,धौ,धं,धः,न,ना,नि,नी,नु,नू,ने,नै,नो,नौ,नं,नः,प,पा,पि,पी,पु,पू,पे,पै,पो,पौ,पं,पः,फ,फा,फि,फी,फु,फू,फे,फै,फो,फौ,फं,फः,ब,बा,बि,बी,बु,बू,बे,बै,बो,बौ,बं,बः,भ,भा,भि,भी,भु,भू,भे,भै,भो,भौ,भं,भः,म,मा,मि,मी,मु,मू,मे,मै,मो,मौ,मं,मः,य,या,यि,यी,यु,यू,ये,यै,यो,यौ,यं,यः,र,रा,रि,री,रु,रू,रे,रै,रो,रौ,रं,रः,ल,ला,लि,ली,लु,लू,ले,लै,लो,लौ,लं,लः,व ,वा,वि,वी,वु,वू,वे,वै,वो,वौ,वं,वः,श,शा,शि,शी,शु,शू,शे,शै,शो,शौ,शं,शः,ष,षा,षि,षी,षु,षू,षे,षै,षो,षौ,षं,षः,स,सा,सि,सी,सु,सू,से,सै,सो,सौ,सं,सः,ह,हा,हि,ही,हु,हू,हे,है,हो,हौ,क्षं,क्षः,क्ष,क्षा,क्षि,क्षी,क्षु,क्षू,क्षे,क्षै,क्षो,क्षौ,त्र,त्रा,त्रि,त्री,त्रु,त्रू,त्रे,त्रै,त्रो,त्रौ,त्रं,त्रः,हं,हः;


    Button button,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,button23,button24,button25,button26,button27,button28,button29,button30,button31,button32,button33,button34,button35,button36,button37,button38,button39,button40,button41,button42,button43,button44,button45,button46,button47,button48,button49,button50,button51,button52,button53,button54,button55,button56,button57,button58,button59,button60,button61,button62,button63,button64,button65,button66,button67,button68,button69,button70,button71,button72,button73,button74,button75,button76,button77,button78,button79,button80,button81,button82,button83,button84,button85,button86,button87,button88,button89,button90,button91,button92,button93,button94,button95,button96,button97,button98,button99,button100,button101,button102,button103,button104,button105;
    Button button106,button107,button108,button109,button110,button111,button112,button113,button114,button115,button116,button117,button118,button119,button120,button121,button122,button123,button124,button125,button126,button127,button128,button129,button130,button131,button132,button133,button134,button135,button136,button137,button138,button139,button140,button141,button142,button143,button144,button145,button146,button147,button148,button149,button150,button151,button152,button153,button154,button155,button156,button157,button158,button159,button160,button161,button162,button163,button164,button165,button166,button167,button168,button169,button170,button171,button172,button173,button174,button175,button176,button177,button178,button179,button180,button181,button182,button183,button184,button185,button186,button187,button188,button189,button190,button191,button192,button193,button194,button195,button196,button197,button198,button199,button200,button201,button202,button203,button204,button205;
    Button button206,button207,button208,button209,button210,button211,button212,button213,button214,button215,button216,button217,button218,button219,button220,button221,button222,button223,button224,button225,button226,button227,button228,button229,button230,button231,button232,button233,button234,button235,button236,button237,button238,button239,button240,button241,button242,button243,button244,button245,button246,button247,button248,button249,button250,button251,button252,button253,button254,button255,button256,button257,button258,button259,button260,button261,button262,button263,button264,button265,button266,button267,button268,button269,button270,button271,button272,button273,button274,button275,button276,button277,button278,button279,button280,button281,button282,button283,button284,button285,button286,button287,button288,button289,button290,button291,button292,button293,button294,button295,button296,button297,button298,button299,button300,button301,button302,button303,button304,button305;
    Button button306,button307,button308,button309,button310,button311,button312,button313,button314,button315,button316,button317,button318,button319,button320,button321,button322,button323,button324,button325,button326,button327,button328,button329,button330,button331,button332,button333,button334,button335,button336,button337,button338,button339,button340,button341,button342,button343,button344,button345,button346,button347,button348,button349,button350,button351,button352,button353,button354,button355,button356,button357,button358,button359,button360,button361,button362,button363,button364,button365,button366,button367,button368,button369,button370,button371,button372,button373,button374,button375,button376,button377,button378,button379,button380,button381,button382,button383,button384,button385;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vyanjan);
        Button button=(Button)findViewById(R.id.button);
        Button button2=(Button)findViewById(R.id.button2);
        Button button3=(Button)findViewById(R.id.button3);
        Button button4=(Button)findViewById(R.id.button4);
        Button button5=(Button)findViewById(R.id.button5);
        Button button6=(Button)findViewById(R.id.button6);
        Button button7=(Button)findViewById(R.id.button7);
        Button button8=(Button)findViewById(R.id.button8);
        Button button9=(Button)findViewById(R.id.button9);
        Button button10=(Button)findViewById(R.id.button10);
        Button button11=(Button)findViewById(R.id.button11);
        Button button12=(Button)findViewById(R.id.button12);
        Button button13=(Button)findViewById(R.id.button13);
        Button button14=(Button)findViewById(R.id.button14);
        Button button15=(Button)findViewById(R.id.button15);
        Button button16=(Button)findViewById(R.id.button16);
        Button button17=(Button)findViewById(R.id.button17);
        Button button18=(Button)findViewById(R.id.button18);
        Button button19=(Button)findViewById(R.id.button19);
        Button button20=(Button)findViewById(R.id.button20);
        Button button21=(Button)findViewById(R.id.button21);
        Button button22=(Button)findViewById(R.id.button22);
        Button button23=(Button)findViewById(R.id.button23);
        Button button24=(Button)findViewById(R.id.button24);
        Button button25=(Button)findViewById(R.id.button25);
        Button button26=(Button)findViewById(R.id.button26);
        Button button27=(Button)findViewById(R.id.button27);
        Button button28=(Button)findViewById(R.id.button28);
        Button button29=(Button)findViewById(R.id.button29);
        Button button30=(Button)findViewById(R.id.button30);
        Button button31=(Button)findViewById(R.id.button31);
        Button button32=(Button)findViewById(R.id.button32);
        Button button33=(Button)findViewById(R.id.button33);
        Button button34=(Button)findViewById(R.id.button34);
        Button button35=(Button)findViewById(R.id.button35);
        Button button36=(Button)findViewById(R.id.button36);
        Button button37=(Button)findViewById(R.id.button37);
        Button button38=(Button)findViewById(R.id.button38);
        Button button39=(Button)findViewById(R.id.button39);
        Button button40=(Button)findViewById(R.id.button40);
        Button button41=(Button)findViewById(R.id.button41);
        Button button42=(Button)findViewById(R.id.button42);
        Button button43=(Button)findViewById(R.id.button43);
        Button button44=(Button)findViewById(R.id.button44);
        Button button45=(Button)findViewById(R.id.button45);
        Button button46=(Button)findViewById(R.id.button46);
        Button button47=(Button)findViewById(R.id.button47);
        Button button48=(Button)findViewById(R.id.button48);
        Button button49=(Button)findViewById(R.id.button49);
        Button button50=(Button)findViewById(R.id.button50);
        Button button51=(Button)findViewById(R.id.button51);
        Button button52=(Button)findViewById(R.id.button52);
        Button button53=(Button)findViewById(R.id.button53);
        Button button54=(Button)findViewById(R.id.button54);
        Button button55=(Button)findViewById(R.id.button55);
        Button button56=(Button)findViewById(R.id.button56);
        Button button57=(Button)findViewById(R.id.button57);
        Button button58=(Button)findViewById(R.id.button58);
        Button button59=(Button)findViewById(R.id.button59);
        Button button60=(Button)findViewById(R.id.button60);
        Button button61=(Button)findViewById(R.id.button61);
        Button button62=(Button)findViewById(R.id.button62);
        Button button63=(Button)findViewById(R.id.button63);
        Button button64=(Button)findViewById(R.id.button64);
        Button button65=(Button)findViewById(R.id.button65);
        Button button66=(Button)findViewById(R.id.button66);
        Button button67=(Button)findViewById(R.id.button67);
        Button button68=(Button)findViewById(R.id.button68);
        Button button69=(Button)findViewById(R.id.button69);
        Button button70=(Button)findViewById(R.id.button70);
        Button button71=(Button)findViewById(R.id.button71);
        Button button72=(Button)findViewById(R.id.button72);
        Button button73=(Button)findViewById(R.id.button73);
        Button button74=(Button)findViewById(R.id.button74);
        Button button75=(Button)findViewById(R.id.button75);
        Button button76=(Button)findViewById(R.id.button76);
        Button button77=(Button)findViewById(R.id.button77);
        Button button78=(Button)findViewById(R.id.button78);
        Button button79=(Button)findViewById(R.id.button79);
        Button button80=(Button)findViewById(R.id.button80);
        Button button81=(Button)findViewById(R.id.button81);
        Button button82=(Button)findViewById(R.id.button82);
        Button button83=(Button)findViewById(R.id.button83);
        Button button84=(Button)findViewById(R.id.button84);
        Button button85=(Button)findViewById(R.id.button85);
        Button button86=(Button)findViewById(R.id.button86);
        Button button87=(Button)findViewById(R.id.button87);
        Button button88=(Button)findViewById(R.id.button88);
        Button button89=(Button)findViewById(R.id.button89);
        Button button90=(Button)findViewById(R.id.button90);
        Button button91=(Button)findViewById(R.id.button91);
        Button button92=(Button)findViewById(R.id.button92);
        Button button93=(Button)findViewById(R.id.button93);
        Button button94=(Button)findViewById(R.id.button94);
        Button button95=(Button)findViewById(R.id.button95);
        Button button96=(Button)findViewById(R.id.button96);
        Button button97=(Button)findViewById(R.id.button97);
        Button button98=(Button)findViewById(R.id.button98);
        Button button99=(Button)findViewById(R.id.button99);
        Button button100=(Button)findViewById(R.id.button100);
        Button button101=(Button)findViewById(R.id.button101);
        Button button102=(Button)findViewById(R.id.button102);
        Button button103=(Button)findViewById(R.id.button103);
        Button button104=(Button)findViewById(R.id.button104);
        Button button105=(Button)findViewById(R.id.button105);
        Button button106=(Button)findViewById(R.id.button106);
        Button button107=(Button)findViewById(R.id.button107);
        Button button108=(Button)findViewById(R.id.button108);
        Button button109=(Button)findViewById(R.id.button109);
        Button button110=(Button)findViewById(R.id.button110);
        Button button111=(Button)findViewById(R.id.button111);
        Button button112=(Button)findViewById(R.id.button112);
        Button button113=(Button)findViewById(R.id.button113);
        Button button114=(Button)findViewById(R.id.button114);
        Button button115=(Button)findViewById(R.id.button115);
        Button button116=(Button)findViewById(R.id.button116);
        Button button117=(Button)findViewById(R.id.button117);
        Button button118=(Button)findViewById(R.id.button118);
        Button button119=(Button)findViewById(R.id.button119);
        Button button120=(Button)findViewById(R.id.button120);
        Button button121=(Button)findViewById(R.id.button121);
        Button button122=(Button)findViewById(R.id.button122);
        Button button123=(Button)findViewById(R.id.button123);
        Button button124=(Button)findViewById(R.id.button124);
        Button button125=(Button)findViewById(R.id.button125);
        Button button126=(Button)findViewById(R.id.button126);
        Button button127=(Button)findViewById(R.id.button127);
        Button button128=(Button)findViewById(R.id.button128);
        Button button129=(Button)findViewById(R.id.button129);
        Button button130=(Button)findViewById(R.id.button130);
        Button button131=(Button)findViewById(R.id.button131);
        Button button132=(Button)findViewById(R.id.button132);
        Button button133=(Button)findViewById(R.id.button133);
        Button button134=(Button)findViewById(R.id.button134);
        Button button135=(Button)findViewById(R.id.button135);
        Button button136=(Button)findViewById(R.id.button136);
        Button button137=(Button)findViewById(R.id.button137);
        Button button138=(Button)findViewById(R.id.button138);
        Button button139=(Button)findViewById(R.id.button139);
        Button button140=(Button)findViewById(R.id.button140);
        Button button141=(Button)findViewById(R.id.button141);
        Button button142=(Button)findViewById(R.id.button142);
        Button button143=(Button)findViewById(R.id.button143);
        Button button144=(Button)findViewById(R.id.button144);
        Button button145=(Button)findViewById(R.id.button145);
        Button button146=(Button)findViewById(R.id.button146);
        Button button147=(Button)findViewById(R.id.button147);
        Button button148=(Button)findViewById(R.id.button148);
        Button button149=(Button)findViewById(R.id.button149);
        Button button150=(Button)findViewById(R.id.button150);
        Button button151=(Button)findViewById(R.id.button151);
        Button button152=(Button)findViewById(R.id.button152);
        Button button153=(Button)findViewById(R.id.button153);
        Button button154=(Button)findViewById(R.id.button154);
        Button button155=(Button)findViewById(R.id.button155);
        Button button156=(Button)findViewById(R.id.button156);
        Button button157=(Button)findViewById(R.id.button157);
        Button button158=(Button)findViewById(R.id.button158);
        Button button159=(Button)findViewById(R.id.button159);
        Button button160=(Button)findViewById(R.id.button160);
        Button button161=(Button)findViewById(R.id.button161);
        Button button162=(Button)findViewById(R.id.button162);
        Button button163=(Button)findViewById(R.id.button163);
        Button button164=(Button)findViewById(R.id.button164);
        Button button165=(Button)findViewById(R.id.button165);
        Button button166=(Button)findViewById(R.id.button166);
        Button button167=(Button)findViewById(R.id.button167);
        Button button168=(Button)findViewById(R.id.button168);
        Button button169=(Button)findViewById(R.id.button169);
        Button button170=(Button)findViewById(R.id.button170);
        Button button171=(Button)findViewById(R.id.button171);
        Button button172=(Button)findViewById(R.id.button172);
        Button button173=(Button)findViewById(R.id.button173);
        Button button174=(Button)findViewById(R.id.button174);
        Button button175=(Button)findViewById(R.id.button175);
        Button button176=(Button)findViewById(R.id.button176);
        Button button177=(Button)findViewById(R.id.button177);
        Button button178=(Button)findViewById(R.id.button178);
        Button button179=(Button)findViewById(R.id.button179);
        Button button180=(Button)findViewById(R.id.button180);
        Button button181=(Button)findViewById(R.id.button181);
        Button button182=(Button)findViewById(R.id.button182);
        Button button183=(Button)findViewById(R.id.button183);
        Button button184=(Button)findViewById(R.id.button184);
        Button button185=(Button)findViewById(R.id.button185);
        Button button186=(Button)findViewById(R.id.button186);
        Button button187=(Button)findViewById(R.id.button187);
        Button button188=(Button)findViewById(R.id.button188);
        Button button189=(Button)findViewById(R.id.button189);
        Button button190=(Button)findViewById(R.id.button190);
        Button button191=(Button)findViewById(R.id.button191);
        Button button192=(Button)findViewById(R.id.button192);
        Button button193=(Button)findViewById(R.id.button193);
        Button button194=(Button)findViewById(R.id.button194);
        Button button195=(Button)findViewById(R.id.button195);
        Button button196=(Button)findViewById(R.id.button196);
        Button button197=(Button)findViewById(R.id.button197);
        Button button198=(Button)findViewById(R.id.button198);
        Button button199=(Button)findViewById(R.id.button199);
        Button button200=(Button)findViewById(R.id.button200);
        Button button201=(Button)findViewById(R.id.button201);
        Button button202=(Button)findViewById(R.id.button202);
        Button button203=(Button)findViewById(R.id.button203);
        Button button204=(Button)findViewById(R.id.button204);
        Button button205=(Button)findViewById(R.id.button205);
        Button button206=(Button)findViewById(R.id.button206);
        Button button207=(Button)findViewById(R.id.button207);
        Button button208=(Button)findViewById(R.id.button208);
        Button button209=(Button)findViewById(R.id.button209);
        Button button210=(Button)findViewById(R.id.button210);
        Button button211=(Button)findViewById(R.id.button211);
        Button button212=(Button)findViewById(R.id.button212);
        Button button213=(Button)findViewById(R.id.button213);
        Button button214=(Button)findViewById(R.id.button214);
        Button button215=(Button)findViewById(R.id.button215);
        Button button216=(Button)findViewById(R.id.button216);
        Button button217=(Button)findViewById(R.id.button217);
        Button button218=(Button)findViewById(R.id.button218);
        Button button219=(Button)findViewById(R.id.button219);
        Button button220=(Button)findViewById(R.id.button220);
        Button button221=(Button)findViewById(R.id.button221);
        Button button222=(Button)findViewById(R.id.button222);
        Button button223=(Button)findViewById(R.id.button223);
        Button button224=(Button)findViewById(R.id.button224);
        Button button225=(Button)findViewById(R.id.button225);
        Button button226=(Button)findViewById(R.id.button226);
        Button button227=(Button)findViewById(R.id.button227);
        Button button228=(Button)findViewById(R.id.button228);
        Button button229=(Button)findViewById(R.id.button229);
        Button button230=(Button)findViewById(R.id.button230);
        Button button231=(Button)findViewById(R.id.button231);
        Button button232=(Button)findViewById(R.id.button232);
        Button button233=(Button)findViewById(R.id.button233);
        Button button234=(Button)findViewById(R.id.button234);
        Button button235=(Button)findViewById(R.id.button235);
        Button button236=(Button)findViewById(R.id.button236);
        Button button237=(Button)findViewById(R.id.button237);
        Button button238=(Button)findViewById(R.id.button238);
        Button button239=(Button)findViewById(R.id.button239);
        Button button240=(Button)findViewById(R.id.button240);
        Button button241=(Button)findViewById(R.id.button241);
        Button button242=(Button)findViewById(R.id.button242);
        Button button243=(Button)findViewById(R.id.button243);
        Button button244=(Button)findViewById(R.id.button244);
        Button button245=(Button)findViewById(R.id.button245);
        Button button246=(Button)findViewById(R.id.button246);
        Button button247=(Button)findViewById(R.id.button247);
        Button button248=(Button)findViewById(R.id.button248);
        Button button249=(Button)findViewById(R.id.button249);
        Button button250=(Button)findViewById(R.id.button250);
        Button button251=(Button)findViewById(R.id.button251);
        Button button252=(Button)findViewById(R.id.button252);
        Button button253=(Button)findViewById(R.id.button253);
        Button button254=(Button)findViewById(R.id.button254);
        Button button255=(Button)findViewById(R.id.button255);
        Button button256=(Button)findViewById(R.id.button256);
        Button button257=(Button)findViewById(R.id.button257);
        Button button258=(Button)findViewById(R.id.button258);
        Button button259=(Button)findViewById(R.id.button259);
        Button button260=(Button)findViewById(R.id.button260);
        Button button261=(Button)findViewById(R.id.button261);
        Button button262=(Button)findViewById(R.id.button262);
        Button button263=(Button)findViewById(R.id.button263);
        Button button264=(Button)findViewById(R.id.button264);
        Button button265=(Button)findViewById(R.id.button265);
        Button button266=(Button)findViewById(R.id.button266);
        Button button267=(Button)findViewById(R.id.button267);
        Button button268=(Button)findViewById(R.id.button268);
        Button button269=(Button)findViewById(R.id.button269);
        Button button270=(Button)findViewById(R.id.button270);
        Button button271=(Button)findViewById(R.id.button271);
        Button button272=(Button)findViewById(R.id.button272);
        Button button273=(Button)findViewById(R.id.button273);
        Button button274=(Button)findViewById(R.id.button274);
        Button button275=(Button)findViewById(R.id.button275);
        Button button276=(Button)findViewById(R.id.button276);
        Button button277=(Button)findViewById(R.id.button277);
        Button button278=(Button)findViewById(R.id.button278);
        Button button279=(Button)findViewById(R.id.button279);
        Button button280=(Button)findViewById(R.id.button280);
        Button button281=(Button)findViewById(R.id.button281);
        Button button282=(Button)findViewById(R.id.button282);
        Button button283=(Button)findViewById(R.id.button283);
        Button button284=(Button)findViewById(R.id.button284);
        Button button285=(Button)findViewById(R.id.button285);
        Button button286=(Button)findViewById(R.id.button286);
        Button button287=(Button)findViewById(R.id.button287);
        Button button288=(Button)findViewById(R.id.button288);
        Button button289=(Button)findViewById(R.id.button289);
        Button button290=(Button)findViewById(R.id.button290);
        Button button291=(Button)findViewById(R.id.button291);
        Button button292=(Button)findViewById(R.id.button292);
        Button button293=(Button)findViewById(R.id.button293);
        Button button294=(Button)findViewById(R.id.button294);
        Button button295=(Button)findViewById(R.id.button295);
        Button button296=(Button)findViewById(R.id.button296);
        Button button297=(Button)findViewById(R.id.button297);
        Button button298=(Button)findViewById(R.id.button298);
        Button button299=(Button)findViewById(R.id.button299);
        Button button300=(Button)findViewById(R.id.button300);
        Button button301=(Button)findViewById(R.id.button301);
        Button button302=(Button)findViewById(R.id.button302);
        Button button303=(Button)findViewById(R.id.button303);
        Button button304=(Button)findViewById(R.id.button304);
        Button button305=(Button)findViewById(R.id.button305);
        Button button306=(Button)findViewById(R.id.button306);
        Button button307=(Button)findViewById(R.id.button307);
        Button button308=(Button)findViewById(R.id.button308);
        Button button309=(Button)findViewById(R.id.button309);
        Button button310=(Button)findViewById(R.id.button310);
        Button button311=(Button)findViewById(R.id.button311);
        Button button312=(Button)findViewById(R.id.button312);
        Button button313=(Button)findViewById(R.id.button313);
        Button button314=(Button)findViewById(R.id.button314);
        Button button315=(Button)findViewById(R.id.button315);
        Button button316=(Button)findViewById(R.id.button316);
        Button button317=(Button)findViewById(R.id.button317);
        Button button318=(Button)findViewById(R.id.button318);
        Button button319=(Button)findViewById(R.id.button319);
        Button button320=(Button)findViewById(R.id.button320);
        Button button321=(Button)findViewById(R.id.button321);
        Button button322=(Button)findViewById(R.id.button322);
        Button button323=(Button)findViewById(R.id.button323);
        Button button324=(Button)findViewById(R.id.button324);
        Button button325=(Button)findViewById(R.id.button325);
        Button button326=(Button)findViewById(R.id.button326);
        Button button327=(Button)findViewById(R.id.button327);
        Button button328=(Button)findViewById(R.id.button328);
        Button button329=(Button)findViewById(R.id.button329);
        Button button330=(Button)findViewById(R.id.button330);
        Button button331=(Button)findViewById(R.id.button331);
        Button button332=(Button)findViewById(R.id.button332);
        Button button333=(Button)findViewById(R.id.button333);
        Button button334=(Button)findViewById(R.id.button334);
        Button button335=(Button)findViewById(R.id.button335);
        Button button336=(Button)findViewById(R.id.button336);
        Button button337=(Button)findViewById(R.id.button337);
        Button button338=(Button)findViewById(R.id.button338);
        Button button339=(Button)findViewById(R.id.button339);
        Button button340=(Button)findViewById(R.id.button340);
        Button button341=(Button)findViewById(R.id.button341);
        Button button342=(Button)findViewById(R.id.button342);
        Button button343=(Button)findViewById(R.id.button343);
        Button button344=(Button)findViewById(R.id.button344);
        Button button345=(Button)findViewById(R.id.button345);
        Button button346=(Button)findViewById(R.id.button346);
        Button button347=(Button)findViewById(R.id.button347);
        Button button348=(Button)findViewById(R.id.button348);
        Button button349=(Button)findViewById(R.id.button349);
        Button button350=(Button)findViewById(R.id.button350);
        Button button351=(Button)findViewById(R.id.button351);
        Button button352=(Button)findViewById(R.id.button352);
        Button button353=(Button)findViewById(R.id.button353);
        Button button354=(Button)findViewById(R.id.button354);
        Button button355=(Button)findViewById(R.id.button355);
        Button button356=(Button)findViewById(R.id.button356);
        Button button357=(Button)findViewById(R.id.button357);
        Button button358=(Button)findViewById(R.id.button358);
        Button button359=(Button)findViewById(R.id.button359);
        Button button360=(Button)findViewById(R.id.button360);
        Button button361=(Button)findViewById(R.id.button361);
        Button button362=(Button)findViewById(R.id.button362);
        Button button363=(Button)findViewById(R.id.button363);
        Button button364=(Button)findViewById(R.id.button364);
        Button button365=(Button)findViewById(R.id.button365);
        Button button366=(Button)findViewById(R.id.button366);
        Button button367=(Button)findViewById(R.id.button367);
        Button button368=(Button)findViewById(R.id.button368);
        Button button369=(Button)findViewById(R.id.button369);
        Button button370=(Button)findViewById(R.id.button370);
        Button button371=(Button)findViewById(R.id.button371);
        Button button372=(Button)findViewById(R.id.button372);
        Button button373=(Button)findViewById(R.id.button373);
        Button button374=(Button)findViewById(R.id.button374);
        Button button375=(Button)findViewById(R.id.button375);
        Button button376=(Button)findViewById(R.id.button376);
        Button button377=(Button)findViewById(R.id.button377);
        Button button378=(Button)findViewById(R.id.button378);
        Button button379=(Button)findViewById(R.id.button379);
        Button button380=(Button)findViewById(R.id.button380);
        Button button381=(Button)findViewById(R.id.button381);
        Button button382=(Button)findViewById(R.id.button382);
        Button button383=(Button)findViewById(R.id.button383);
        Button button384=(Button)findViewById(R.id.button384);
        Button button385=(Button)findViewById(R.id.button385);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button क Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(क,1,1,0,0,1);
            }
        });



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button का Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(का,1,1,0,0,1);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button कि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(कि,1,1,0,0,1);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button की Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(की,1,1,0,0,1);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button कु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(कु,1,1,0,0,1);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button कू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(कू,1,1,0,0,1);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button के Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(के,1,1,0,0,1);
            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button कै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(कै,1,1,0,0,1);
            }
        });


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button को Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(को,1,1,0,0,1);
            }
        });


        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button कौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(कौ,1,1,0,0,1);
            }
        });


        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button कं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(कं,1,1,0,0,1);
            }
        });


        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button कः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(क,1,1,0,0,1);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ख Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ख,1,1,0,0,1);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button खा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(खा,1,1,0,0,1);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button खि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(खि,1,1,0,0,1);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button खी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(खी,1,1,0,0,1);
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button खु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(खु,1,1,0,0,1);
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button खू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(खू,1,1,0,0,1);
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button खे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(खे,1,1,0,0,1);
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button खै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(खै,1,1,0,0,1);
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button खो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(खो,1,1,0,0,1);
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button खौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(खौ,1,1,0,0,1);
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button खं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(खं,1,1,0,0,1);
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button खः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(खः,1,1,0,0,1);
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ग Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ग,1,1,0,0,1);
            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button गा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(गा,1,1,0,0,1);
            }
        });

        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button गि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(गि,1,1,0,0,1);
            }
        });

        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button गी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(गी,1,1,0,0,1);
            }
        });

        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button गु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(गु,1,1,0,0,1);
            }
        });

        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button गू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(गू,1,1,0,0,1);
            }
        });

        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button गे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(गे,1,1,0,0,1);
            }
        });

        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button गै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(गै,1,1,0,0,1);
            }
        });

        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button गो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(गो,1,1,0,0,1);
            }
        });


        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button गौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(गौ,1,1,0,0,1);
            }
        });

        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button गं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(गं,1,1,0,0,1);
            }
        });

        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button गः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(की,1,1,0,0,1);
            }
        });

        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button घ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(घ,1,1,0,0,1);
            }
        });

        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button घा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(घा,1,1,0,0,1);
            }
        });

        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button घि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(घि,1,1,0,0,1);
            }
        });


        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button घी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(घी,1,1,0,0,1);
            }
        });


        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button घु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(घु,1,1,0,0,1);
            }
        });


        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button घू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(घू,1,1,0,0,1);
            }
        });


        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button घे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(घे,1,1,0,0,1);
            }
        });


        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button घै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(घै,1,1,0,0,1);
            }
        });

        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button घो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(घो,1,1,0,0,1);
            }
        });

        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button घौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(घौ,1,1,0,0,1);
            }
        });

        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button घं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(घं,1,1,0,0,1);
            }
        });

        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button घः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(घः,1,1,0,0,1);
            }
        });

        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button च Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(च,1,1,0,0,1);
            }
        });

        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button चा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(चा,1,1,0,0,1);
            }
        });

        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button चि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(चि,1,1,0,0,1);
            }
        });

        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button चु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(चु,1,1,0,0,1);
            }
        });

        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button चू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(चू,1,1,0,0,1);
            }
        });

        button55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button चे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(चे,1,1,0,0,1);
            }
        });

        button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button चै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(चै,1,1,0,0,1);
            }
        });

        button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button चो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(चो,1,1,0,0,1);
            }
        });

        button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button चौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(चौ,1,1,0,0,1);
            }
        });

        button59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button चं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(चं,1,1,0,0,1);
            }
        });

        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button चः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(गि,1,1,0,0,1);
            }
        });

        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button छ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(छ,1,1,0,0,1);
            }
        });

        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button छा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(छा,1,1,0,0,1);
            }
        });

        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button छि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(छि,1,1,0,0,1);
            }
        });

        button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button छी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(छी,1,1,0,0,1);
            }
        });

        button65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button छु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(छु,1,1,0,0,1);
            }
        });


        button66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button छू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(छू,1,1,0,0,1);
            }
        });



        button67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button छे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(छे,1,1,0,0,1);
            }
        });

        button68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button छै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(छै,1,1,0,0,1);
            }
        });

        button69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button छो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(छो,1,1,0,0,1);
            }
        });

        button70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button छौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(छौ,1,1,0,0,1);
            }
        });

        button71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button छं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(छं,1,1,0,0,1);
            }
        });

        button72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button छः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(छः,1,1,0,0,1);
            }
        });


        button73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ज Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ज,1,1,0,0,1);
            }
        });


        button74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button जा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(जा,1,1,0,0,1);
            }
        });


        button75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button जि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(जि,1,1,0,0,1);
            }
        });


        button76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button जी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(जी,1,1,0,0,1);
            }
        });


        button77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button जु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(जु,1,1,0,0,1);
            }
        });

        button78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button जू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(जू,1,1,0,0,1);
            }
        });

        button79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button जे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(जे,1,1,0,0,1);
            }
        });

        button80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button जै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(जै,1,1,0,0,1);
            }
        });

        button81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button जो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(जो,1,1,0,0,1);
            }
        });

        button82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button जौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(जौ,1,1,0,0,1);
            }
        });

        button83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button जं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(जं,1,1,0,0,1);
            }
        });

        button84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button जः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(जः,1,1,0,0,1);
            }
        });

        button85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button झ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(झ,1,1,0,0,1);
            }
        });

        button86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button झा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(झा,1,1,0,0,1);
            }
        });

        button87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button झि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(झि,1,1,0,0,1);
            }
        });

        button88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button झी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(झी,1,1,0,0,1);
            }
        });

        button89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button झु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(झु,1,1,0,0,1);
            }
        });

        button90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button झू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(झू,1,1,0,0,1);
            }
        });

        button91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button झे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(झे,1,1,0,0,1);
            }
        });

        button92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button झै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(झै,1,1,0,0,1);
            }
        });

        button93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button झो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(झो,1,1,0,0,1);
            }
        });

        button94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button झौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(झौ,1,1,0,0,1);
            }
        });

        button95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button झं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(झं,1,1,0,0,1);
            }
        });

        button96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button झः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(झः,1,1,0,0,1);
            }
        });

        button97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ट Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ट,1,1,0,0,1);
            }
        });

        button98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button टा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(टा,1,1,0,0,1);
            }
        });


        button99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button टि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(टि,1,1,0,0,1);
            }
        });

        button100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button टी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(टी,1,1,0,0,1);
            }
        });

        button101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button टु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(टु,1,1,0,0,1);
            }
        });

        button102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button टू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(टू,1,1,0,0,1);
            }
        });

        button103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button टे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(टे,1,1,0,0,1);
            }
        });

        button104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button टै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(टै,1,1,0,0,1);
            }
        });


        button105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button टो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(टो,1,1,0,0,1);
            }
        });


        button106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button टौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(टौ,1,1,0,0,1);
            }
        });


        button107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button टं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(टं,1,1,0,0,1);
            }
        });


        button108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button टः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(टः,1,1,0,0,1);
            }
        });


        button109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ठ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ठ,1,1,0,0,1);
            }
        });

        button110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ठा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ठा,1,1,0,0,1);
            }
        });

        button111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ठि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ठि,1,1,0,0,1);
            }
        });

        button112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ठु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ठु,1,1,0,0,1);
            }
        });

        button113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ठू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ठू,1,1,0,0,1);
            }
        });

        button114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ठे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ठे,1,1,0,0,1);
            }
        });

        button115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ठै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ठै,1,1,0,0,1);
            }
        });

        button116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ठो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ठो,1,1,0,0,1);
            }
        });

        button117.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ठौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ठौ,1,1,0,0,1);
            }
        });

        button118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ठं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ठं,1,1,0,0,1);
            }
        });

        button119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ठः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ठः,1,1,0,0,1);
            }
        });

        button120.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ड Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ड,1,1,0,0,1);
            }
        });

        button121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button डा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(डा,1,1,0,0,1);
            }
        });

        button122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button डि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(डि,1,1,0,0,1);
            }
        });

        button123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button डी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(डी,1,1,0,0,1);
            }
        });

        button124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button डु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(डु,1,1,0,0,1);
            }
        });

        button125.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button डू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(डु,1,1,0,0,1);
            }
        });

        button126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button डे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(डे,1,1,0,0,1);
            }
        });

        button127.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button डै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(डै,1,1,0,0,1);
            }
        });

        button128.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button डो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(डो,1,1,0,0,1);
            }
        });

        button129.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button डौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(डौ,1,1,0,0,1);
            }
        });


        button130.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button डं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(डं,1,1,0,0,1);
            }
        });



        button131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button डः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(डः,1,1,0,0,1);
            }
        });

        button132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ढ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ढ,1,1,0,0,1);
            }
        });

        button133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ढा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ढा,1,1,0,0,1);
            }
        });

        button134.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ढि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ढि,1,1,0,0,1);
            }
        });

        button135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ढी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ढि,1,1,0,0,1);
            }
        });

        button136.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ढु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ढु,1,1,0,0,1);
            }
        });


        button137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ढू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ढू,1,1,0,0,1);
            }
        });


        button138.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ढे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ढे,1,1,0,0,1);
            }
        });


        button139.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ढै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ढै,1,1,0,0,1);
            }
        });


        button140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ढो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ढो,1,1,0,0,1);
            }
        });


        button141.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ढौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ढौ,1,1,0,0,1);
            }
        });

        button142.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ढं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ढं,1,1,0,0,1);
            }
        });

        button143.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ढः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ढः,1,1,0,0,1);
            }
        });

        button144.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ण Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ण,1,1,0,0,1);
            }
        });

        button145.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button णा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(णा,1,1,0,0,1);
            }
        });

        button146.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button णि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(णि,1,1,0,0,1);
            }
        });

        button147.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button णी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(णी,1,1,0,0,1);
            }
        });

        button148.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button णु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(णु,1,1,0,0,1);
            }
        });

        button149.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button णू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(णू,1,1,0,0,1);
            }
        });

        button150.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button णे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(णे,1,1,0,0,1);
            }
        });

        button151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button णै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(णै,1,1,0,0,1);
            }
        });

        button152.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button णो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(णो,1,1,0,0,1);
            }
        });

        button153.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button णौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(णौ,1,1,0,0,1);
            }
        });

        button154.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button णं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(णं,1,1,0,0,1);
            }
        });

        button155.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button णः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(णः,1,1,0,0,1);
            }
        });

        button156.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button त Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(त,1,1,0,0,1);
            }
        });

        button157.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ता Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ता,1,1,0,0,1);
            }
        });

        button158.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ति Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ति,1,1,0,0,1);
            }
        });

        button159.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ती Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ती,1,1,0,0,1);
            }
        });

        button160.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button तु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(तु,1,1,0,0,1);
            }
        });

        button161.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button तू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(तू,1,1,0,0,1);
            }
        });

        button162.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ते Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ते,1,1,0,0,1);
            }
        });


        button163.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button तै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(तै,1,1,0,0,1);
            }
        });

        button164.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button तो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(तो,1,1,0,0,1);
            }
        });

        button165.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button तौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(तौ,1,1,0,0,1);
            }
        });

        button166.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button तं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(तं,1,1,0,0,1);
            }
        });

        button167.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button तः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(तः,1,1,0,0,1);
            }
        });

        button168.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button थ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(थ,1,1,0,0,1);
            }
        });

        button169.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button था Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(था,1,1,0,0,1);
            }
        });

        button170.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button थि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(थि,1,1,0,0,1);
            }
        });

        button171.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button थी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(थी,1,1,0,0,1);
            }
        });

        button172.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button थु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(थु,1,1,0,0,1);
            }
        });

        button173.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button थू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(थू,1,1,0,0,1);
            }
        });

        button174.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button थे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(थे,1,1,0,0,1);
            }
        });


        button175.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button थै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(थै,1,1,0,0,1);
            }
        });

        button176.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button थो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(थो,1,1,0,0,1);
            }
        });

        button177.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button थौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(थौ,1,1,0,0,1);
            }
        });

        button178.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button थं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(थं,1,1,0,0,1);
            }
        });

        button179.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button थः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(थः,1,1,0,0,1);
            }
        });

        button180.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button द Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(द,1,1,0,0,1);
            }
        });

        button181.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button दा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(दा,1,1,0,0,1);
            }
        });

        button182.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button दि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(दि,1,1,0,0,1);
            }
        });

        button183.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button दी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(दी,1,1,0,0,1);
            }
        });

        button184.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button दु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(दु,1,1,0,0,1);
            }
        });

        button185.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button दू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(दू,1,1,0,0,1);
            }
        });

        button186.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button दे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(दे,1,1,0,0,1);
            }
        });


        button187.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button दै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(दै,1,1,0,0,1);
            }
        });

        button188.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button दो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(दो,1,1,0,0,1);
            }
        });

        button189.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button दौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(दौ,1,1,0,0,1);
            }
        });

        button190.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button दं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(दं,1,1,0,0,1);
            }
        });

        button191.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button दः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(दः,1,1,0,0,1);
            }
        });

        button192.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ध Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ध,1,1,0,0,1);
            }
        });

        button193.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button धा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(धा,1,1,0,0,1);
            }
        });

        button194.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button धि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(धि,1,1,0,0,1);
            }
        });

        button195.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button धी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(धी,1,1,0,0,1);
            }
        });

        button196.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button धु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(धु,1,1,0,0,1);
            }
        });

        button197.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button धू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(धू,1,1,0,0,1);
            }
        });

        button198.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button धे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(धे,1,1,0,0,1);
            }
        });


        button199.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button धै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(धै,1,1,0,0,1);
            }
        });

        button200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button धो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(धो,1,1,0,0,1);
            }
        });

        button201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button धौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(धौ,1,1,0,0,1);
            }
        });

        button202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button धं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(धं,1,1,0,0,1);
            }
        });

        button203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button धः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(धः,1,1,0,0,1);
            }
        });

        button204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button न Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(न,1,1,0,0,1);
            }
        });

        button205.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ना Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ना,1,1,0,0,1);
            }
        });

        button206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button नि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(नि,1,1,0,0,1);
            }
        });

        button207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button नी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(नी,1,1,0,0,1);
            }
        });

        button208.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button नु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(नु,1,1,0,0,1);
            }
        });

        button209.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button नू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(नू,1,1,0,0,1);
            }
        });

        button210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ने Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ने,1,1,0,0,1);
            }
        });


        button211.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button नै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(नै,1,1,0,0,1);
            }
        });

        button212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button नो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(नो,1,1,0,0,1);
            }
        });

        button213.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button नौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(नौ,1,1,0,0,1);
            }
        });

        button214.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button नं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(नं,1,1,0,0,1);
            }
        });

        button215.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button नः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(नः,1,1,0,0,1);
            }
        });

        button216.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button प Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(प,1,1,0,0,1);
            }
        });

        button217.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button पा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(पा,1,1,0,0,1);
            }
        });

        button218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button पि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(पि,1,1,0,0,1);
            }
        });

        button219.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button पी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(पी,1,1,0,0,1);
            }
        });

        button220.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button पु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(पु,1,1,0,0,1);
            }
        });

        button221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button पू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(पू,1,1,0,0,1);
            }
        });

        button222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button पे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(पे,1,1,0,0,1);
            }
        });


        button223.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button पै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(पै,1,1,0,0,1);
            }
        });

        button224.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button पो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(पो,1,1,0,0,1);
            }
        });

        button225.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button पौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(पौ,1,1,0,0,1);
            }
        });

        button226.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button पं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(पं,1,1,0,0,1);
            }
        });

        button227.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button पः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(पः,1,1,0,0,1);
            }
        });

        button228.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button फ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(फ,1,1,0,0,1);
            }
        });

        button229.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button फा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(फा,1,1,0,0,1);
            }
        });

        button230.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button फि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(फि,1,1,0,0,1);
            }
        });

        button231.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button फी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(फी,1,1,0,0,1);
            }
        });

        button232.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button फु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(फु,1,1,0,0,1);
            }
        });

        button233.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button फू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(फू,1,1,0,0,1);
            }
        });

        button234.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button फे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(फे,1,1,0,0,1);
            }
        });


        button235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button फै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(फै,1,1,0,0,1);
            }
        });

        button236.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button फो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(फो,1,1,0,0,1);
            }
        });

        button237.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button फौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(फौ,1,1,0,0,1);
            }
        });

        button238.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button फं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(फं,1,1,0,0,1);
            }
        });

        button239.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button फः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(फः,1,1,0,0,1);
            }
        });

        button240.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ब Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ब,1,1,0,0,1);
            }
        });

        button241.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button बा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(बा,1,1,0,0,1);
            }
        });

        button242.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button बि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(बि,1,1,0,0,1);
            }
        });

        button243.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button बी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(बी,1,1,0,0,1);
            }
        });

        button244.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button बु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(बु,1,1,0,0,1);
            }
        });

        button245.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button बू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(बू,1,1,0,0,1);
            }
        });

        button246.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button बे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(बे,1,1,0,0,1);
            }
        });


        button247.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button बै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(बै,1,1,0,0,1);
            }
        });

        button248.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button बो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(बो,1,1,0,0,1);
            }
        });

        button249.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button बौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(बौ,1,1,0,0,1);
            }
        });

        button250.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button बं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(बं,1,1,0,0,1);
            }
        });

        button251.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button बः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(बः,1,1,0,0,1);
            }
        });

        button252.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button भ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(भ,1,1,0,0,1);
            }
        });

        button253.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button भा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(भा,1,1,0,0,1);
            }
        });

        button254.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button भि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(भि,1,1,0,0,1);
            }
        });

        button255.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button भी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(भी,1,1,0,0,1);
            }
        });

        button256.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button भु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(भु,1,1,0,0,1);
            }
        });

        button257.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button भू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(भू,1,1,0,0,1);
            }
        });

        button258.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button भे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(भे,1,1,0,0,1);
            }
        });


        button259.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button भै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(भै,1,1,0,0,1);
            }
        });

        button260.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button भो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(भो,1,1,0,0,1);
            }
        });

        button261.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button भौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(भौ,1,1,0,0,1);
            }
        });

        button262.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button भं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(भं,1,1,0,0,1);
            }
        });

        button263.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button भः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(भः,1,1,0,0,1);
            }
        });


        button264.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button म Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(म,1,1,0,0,1);
            }
        });

        button265.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button मा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(मा,1,1,0,0,1);
            }
        });

        button266.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button मि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(मि,1,1,0,0,1);
            }
        });

        button267.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button मी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(मी,1,1,0,0,1);
            }
        });

        button268.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button मु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(मु,1,1,0,0,1);
            }
        });

        button269.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button मू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(मू,1,1,0,0,1);
            }
        });

        button270.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button मे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(मे,1,1,0,0,1);
            }
        });


        button271.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button मै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(मै,1,1,0,0,1);
            }
        });

        button272.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button मो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(मो,1,1,0,0,1);
            }
        });

        button273.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button मौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(मौ,1,1,0,0,1);
            }
        });

        button274.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button मं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(मं,1,1,0,0,1);
            }
        });

        button275.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button मः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(मः,1,1,0,0,1);
            }
        });

        button276.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button य Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(य,1,1,0,0,1);
            }
        });

        button277.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button या Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(या,1,1,0,0,1);
            }
        });

        button278.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button यि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(यि,1,1,0,0,1);
            }
        });

        button279.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button यी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(यी,1,1,0,0,1);
            }
        });

        button280.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button यु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(यु,1,1,0,0,1);
            }
        });

        button281.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button यू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(यू,1,1,0,0,1);
            }
        });

        button282.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ये Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ये,1,1,0,0,1);
            }
        });


        button283.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button यै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(यै,1,1,0,0,1);
            }
        });

        button284.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button यो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(यो,1,1,0,0,1);
            }
        });

        button285.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button यौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(यौ,1,1,0,0,1);
            }
        });

        button286.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button यं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(यं,1,1,0,0,1);
            }
        });

        button287.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button यः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(यः,1,1,0,0,1);
            }
        });

        button288.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button र Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(र,1,1,0,0,1);
            }
        });

        button289.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button रा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(रा,1,1,0,0,1);
            }
        });

        button290.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button रि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(रि,1,1,0,0,1);
            }
        });

        button291.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button री Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(री,1,1,0,0,1);
            }
        });

        button292.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button रु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(रु,1,1,0,0,1);
            }
        });

        button293.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button रू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(रू,1,1,0,0,1);
            }
        });

        button294.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button रे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(रे,1,1,0,0,1);
            }
        });


        button295.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button रै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(रै,1,1,0,0,1);
            }
        });

        button296.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button रो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(रो,1,1,0,0,1);
            }
        });

        button297.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button रौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(रौ,1,1,0,0,1);
            }
        });

        button298.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button रं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(रं,1,1,0,0,1);
            }
        });

        button299.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button रः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(रः,1,1,0,0,1);
            }
        });

        button300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ल Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ल,1,1,0,0,1);
            }
        });

        button301.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ला Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ला,1,1,0,0,1);
            }
        });

        button302.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button लि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(लि,1,1,0,0,1);
            }
        });

        button303.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ली Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ली,1,1,0,0,1);
            }
        });

        button304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button लु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(लु,1,1,0,0,1);
            }
        });

        button305.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button लू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(लू,1,1,0,0,1);
            }
        });

        button306.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ले Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ले,1,1,0,0,1);
            }
        });


        button307.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button लै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(लै,1,1,0,0,1);
            }
        });

        button308.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button लो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(लो,1,1,0,0,1);
            }
        });

        button309.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button लौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(लौ,1,1,0,0,1);
            }
        });

        button310.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button लं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(लं,1,1,0,0,1);
            }
        });

        button311.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button लः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(लः,1,1,0,0,1);
            }
        });

        button312.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button व Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(व,1,1,0,0,1);
            }
        });

        button313.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button वा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(वा,1,1,0,0,1);
            }
        });

        button314.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button वि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(वि,1,1,0,0,1);
            }
        });

        button315.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button वी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(वी,1,1,0,0,1);
            }
        });

        button316.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button वु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(वु,1,1,0,0,1);
            }
        });

        button317.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button वू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(वू,1,1,0,0,1);
            }
        });

        button318.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button वे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(वे,1,1,0,0,1);
            }
        });


        button319.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button वै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(वै,1,1,0,0,1);
            }
        });

        button320.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button वो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(वो,1,1,0,0,1);
            }
        });

        button321.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button वौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(वौ,1,1,0,0,1);
            }
        });

        button322.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button वं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(वं,1,1,0,0,1);
            }
        });

        button323.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button वः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(वः,1,1,0,0,1);
            }
        });

        button324.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button श Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(श,1,1,0,0,1);
            }
        });

        button325.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button शा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(शा,1,1,0,0,1);
            }
        });

        button326.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button शि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(शि,1,1,0,0,1);
            }
        });

        button327.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button शी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(शी,1,1,0,0,1);
            }
        });

        button328.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button शु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(शु,1,1,0,0,1);
            }
        });

        button329.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button शू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(शू,1,1,0,0,1);
            }
        });

        button330.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button शे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(शे,1,1,0,0,1);
            }
        });


        button331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button शै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(शै,1,1,0,0,1);
            }
        });

        button332.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button शो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(शो,1,1,0,0,1);
            }
        });

        button333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button शौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(शौ,1,1,0,0,1);
            }
        });

        button334.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button शं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(शं,1,1,0,0,1);
            }
        });

        button335.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button शः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(शः,1,1,0,0,1);
            }
        });

        button336.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ष Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ष,1,1,0,0,1);
            }
        });

        button337.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button षा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(षा,1,1,0,0,1);
            }
        });

        button338.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button षि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(षि,1,1,0,0,1);
            }
        });

        button339.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button षी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(षी,1,1,0,0,1);
            }
        });

        button340.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button षु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(षु,1,1,0,0,1);
            }
        });

        button341.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button षू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(षू,1,1,0,0,1);
            }
        });

        button342.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button षे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(षे,1,1,0,0,1);
            }
        });


        button343.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button षै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(षै,1,1,0,0,1);
            }
        });

        button344.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button षो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(षो,1,1,0,0,1);
            }
        });

        button345.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button षौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(षौ,1,1,0,0,1);
            }
        });

        button346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button षं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(षं,1,1,0,0,1);
            }
        });

        button347.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button षः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(षः,1,1,0,0,1);
            }
        });

        button348.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button स Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(स,1,1,0,0,1);
            }
        });

        button349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button सा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(सा,1,1,0,0,1);
            }
        });

        button350.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button सि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(सि,1,1,0,0,1);
            }
        });

        button351.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button सी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(सी,1,1,0,0,1);
            }
        });

        button352.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button सु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(सु,1,1,0,0,1);
            }
        });

        button353.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button सू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(सू,1,1,0,0,1);
            }
        });

        button354.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button से Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(से,1,1,0,0,1);
            }
        });


        button355.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button सै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(सै,1,1,0,0,1);
            }
        });

        button356.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button सो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(सो,1,1,0,0,1);
            }
        });

        button357.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button सौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(सौ,1,1,0,0,1);
            }
        });

        button358.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button सं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(सं,1,1,0,0,1);
            }
        });

        button359.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button सः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(सः,1,1,0,0,1);
            }
        });


        button360.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ह Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ह,1,1,0,0,1);
            }
        });

        button361.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button हा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(हा,1,1,0,0,1);
            }
        });

        button362.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button हि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(हि,1,1,0,0,1);
            }
        });

        button363.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button ही Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(ही,1,1,0,0,1);
            }
        });

        button364.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button हु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(हु,1,1,0,0,1);
            }
        });

        button365.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button हू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(हू,1,1,0,0,1);
            }
        });

        button366.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button हे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(हे,1,1,0,0,1);
            }
        });


        button367.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button है Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(है,1,1,0,0,1);
            }
        });

        button368.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button हो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(हो,1,1,0,0,1);
            }
        });

        button369.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button हौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(हौ,1,1,0,0,1);
            }
        });

        button370.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button हं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(हं,1,1,0,0,1);
            }
        });

        button371.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button हः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(हः,1,1,0,0,1);
            }
        });


        button372.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button क्ष Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(क्ष,1,1,0,0,1);
            }
        });

        button373.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button क्षा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(क्षा,1,1,0,0,1);
            }
        });

        button374.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button क्षि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(क्षि,1,1,0,0,1);
            }
        });

        button375.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button क्षी Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(क्षी,1,1,0,0,1);
            }
        });

        button376.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button क्षु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(क्षु,1,1,0,0,1);
            }
        });

        button377.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button क्षू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(क्षू,1,1,0,0,1);
            }
        });

        button378.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button क्षे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(क्षे,1,1,0,0,1);
            }
        });


        button379.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button क्षै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(क्षै,1,1,0,0,1);
            }
        });

        button380.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button क्षो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(क्षो,1,1,0,0,1);
            }
        });

        button381.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button क्षौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(क्षौ,1,1,0,0,1);
            }
        });

        button382.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button क्षं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(क्षं,1,1,0,0,1);
            }
        });

        button383.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button क्षः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(क्षः,1,1,0,0,1);
            }
        });


        button384.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button त्र Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(त्र,1,1,0,0,1);
            }
        });

        button385.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button त्रा Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(त्रा,1,1,0,0,1);
            }
        });

        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button त्रि Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(त्रि,1,1,0,0,1);
            }
        });

        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button त्री Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(त्री,1,1,0,0,1);
            }
        });

        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button त्रु Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(त्रु,1,1,0,0,1);
            }
        });

        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button त्रू Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(त्रू,1,1,0,0,1);
            }
        });

        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button त्रे Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(त्रे,1,1,0,0,1);
            }
        });


        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button त्रै Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(त्रै,1,1,0,0,1);
            }
        });

        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button त्रो Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(त्रो,1,1,0,0,1);
            }
        });

        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button त्रौ Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(त्रौ,1,1,0,0,1);
            }
        });

        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button त्रं Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(त्रं,1,1,0,0,1);
            }
        });

        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Button त्रः Clicked", Toast.LENGTH_SHORT).show();
                soundPool.play(त्रः,1,1,0,0,1);
            }
        });

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setMaxStreams(2)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        }

        क = soundPool.load(this,R.raw.sound3,1);
        ख = soundPool.load(this,R.raw.sound3,1);
        ग = soundPool.load(this,R.raw.sound3,1);
        घ = soundPool.load(this,R.raw.sound3,1);
        छ = soundPool.load(this,R.raw.sound3,1);
        ज = soundPool.load(this,R.raw.sound3,1);
        झ = soundPool.load(this,R.raw.sound3,1);
        त्र = soundPool.load(this,R.raw.sound3,1);
        ट = soundPool.load(this,R.raw.sound3,1);
        ठ = soundPool.load(this,R.raw.sound3,1);
        ड = soundPool.load(this,R.raw.sound3,1);
        ढ = soundPool.load(this,R.raw.sound3,1);
        ण = soundPool.load(this,R.raw.sound3,1);
        त = soundPool.load(this,R.raw.sound3,1);
        थ = soundPool.load(this,R.raw.sound3,1);
        द = soundPool.load(this,R.raw.sound3,1);
        ध = soundPool.load(this,R.raw.sound3,1);
        न = soundPool.load(this,R.raw.sound3,1);
        प = soundPool.load(this,R.raw.sound3,1);
        फ = soundPool.load(this,R.raw.sound3,1);
        ब = soundPool.load(this,R.raw.sound3,1);
        भ = soundPool.load(this,R.raw.sound3,1);
        म = soundPool.load(this,R.raw.sound3,1);
        य = soundPool.load(this,R.raw.sound3,1);
        र = soundPool.load(this,R.raw.sound3,1);
        ल = soundPool.load(this,R.raw.sound3,1);
        व = soundPool.load(this,R.raw.sound3,1);
        श = soundPool.load(this,R.raw.sound3,1);
        ष = soundPool.load(this,R.raw.sound3,1);
        स = soundPool.load(this,R.raw.sound3,1);
        ह = soundPool.load(this,R.raw.sound3,1);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }

    public void playsound(View view) {
    }
}
