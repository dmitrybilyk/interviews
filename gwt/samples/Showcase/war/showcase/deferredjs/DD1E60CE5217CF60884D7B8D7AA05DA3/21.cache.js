$wnd.showcase.runAsyncCallback21("function uDb(a){this.a=a}\nfunction xDb(a){this.a=a}\nfunction BBc(a){this.a=a}\nfunction HBc(a){this.c=a;this.b=a.a.b.a}\nfunction yBc(a){zBc.call(this,a,null,null)}\nfunction cBc(a,b){return a.c.ne(b)}\nfunction fBc(a,b){if(a.a){xBc(b);wBc(b)}}\nfunction xBc(a){a.a.b=a.b;a.b.a=a.a;a.a=a.b=null}\nfunction wBc(a){var b;b=a.c.b.b;a.b=b;a.a=a.c.b;b.a=a.c.b.b=a}\nfunction GBc(a){if(a.b==a.c.a.b){throw new OBc}a.a=a.b;a.b=a.b.a;return a.a}\nfunction dBc(a,b){var c;c=LV(a.c.qe(b),155);if(c){fBc(a,c);return c.e}return null}\nfunction zBc(a,b,c){this.c=a;sBc.call(this,b,c);this.a=this.b=null}\nfunction gBc(){LAc.call(this);this.b=new yBc(this);this.c=new LAc;this.b.b=this.b;this.b.a=this.b}\nfunction $jb(a){var b,c;b=LV(a.a.qe(mNc),147);if(b==null){c=BV(afb,mDc,1,['Bonjour le monde',nNc,oNc]);a.a.se(mNc,c);return c}else{return b}}\nfunction eBc(a,b,c){var d,e,f;e=LV(a.c.qe(b),155);if(!e){d=new zBc(a,b,c);a.c.se(b,d);wBc(d);return null}else{f=e.e;rBc(e,c);fBc(a,e);return f}}\nfunction hDb(b){var c,d,e,f;e=wac(b.d,vac(b.d).selectedIndex);c=LV(dBc(b.f,e),118);try{f=ysc(cs(Pi(b.e),DLc));d=ysc(cs(Pi(b.c),DLc));B_b(b.a,c,d,f)}catch(a){a=kfb(a);if(NV(a,143)){return}else throw jfb(a)}}\nfunction fDb(a){var b,c,d,e;d=new E7b;a.e=new odc;cj(a.e,pNc);edc(a.e,'100');a.c=new odc;cj(a.c,pNc);edc(a.c,'60');a.d=new Cac;t7b(d,0,0,'<b>Points \\xE0 circuler:<\\/b>');w7b(d,0,1,a.d);t7b(d,1,0,'<b>Bord du dessus:<\\/b>');w7b(d,1,1,a.e);t7b(d,2,0,'<b>Bord gauche:<\\/b>');w7b(d,2,1,a.c);for(c=Oxc(nJ(a.f));c.a.Be();){b=LV(Uxc(c),1);xac(a.d,b)}vj(a.d,new uDb(a),(zy(),zy(),yy));e=new xDb(a);vj(a.e,e,(mz(),mz(),lz));vj(a.c,e,lz);return d}\nfunction gDb(a){var b,c,d,e,f,g,i,j;a.f=new gBc;a.a=new D_b;$i(a.a,qNc,qNc);Ti(a.a,rNc);j=$jb(a.b);i=new X4b('Hello World');w_b(a.a,i,10,20);eBc(a.f,j[0],i);c=new z0b('Cliquez-moi!');w_b(a.a,c,80,45);eBc(a.f,j[1],c);d=new d8b(2,3);ns(d.o,wIc,HJc);for(e=0;e<3;e++){t7b(d,0,e,e+GFc);w7b(d,1,e,new PXb((Xkb(),Mkb)))}w_b(a.a,d,60,100);eBc(a.f,j[2],d);b=new g4b;Wj(b,a.a);g=new g4b;Wj(g,fDb(a));f=new v9b;ms(f.e,PJc,10);s9b(f,g);s9b(f,b);return f}\nvar pNc='3em',mNc='cwAbsolutePanelWidgetNames';fgb(740,1,$Dc);_.sc=function sDb(){Qib(this.b,gDb(this.a))};fgb(741,1,YDc,uDb);_.Ic=function vDb(a){iDb(this.a)};fgb(742,1,IDc,xDb);_.Lc=function yDb(a){hDb(this.a)};fgb(1332,1330,LEc,gBc);_.Oh=function hBc(){this.c.Oh();this.b.b=this.b;this.b.a=this.b};_.ne=function iBc(a){return cBc(this,a)};_.oe=function jBc(a){var b;b=this.b.a;while(b!=this.b){if(fDc(b.e,a)){return true}b=b.a}return false};_.pe=function kBc(){return new BBc(this)};_.qe=function lBc(a){return dBc(this,a)};_.se=function mBc(a,b){return eBc(this,a,b)};_.te=function nBc(a){var b;b=LV(this.c.te(a),155);if(b){xBc(b);return b.e}return null};_.ue=function oBc(){return this.c.ue()};_.a=false;fgb(1333,1334,{155:1,158:1},yBc,zBc);fgb(1335,368,NDc,BBc);_.xe=function CBc(a){var b,c,d;if(!NV(a,158)){return false}b=LV(a,158);c=b.Ee();if(cBc(this.a,c)){d=dBc(this.a,c);return fDc(b.Rc(),d)}return false};_.bc=function DBc(){return new HBc(this)};_.ue=function EBc(){return this.a.c.ue()};fgb(1336,1,{},HBc);_.Be=function IBc(){return this.b!=this.c.a.b};_.Ce=function JBc(){return GBc(this)};_.De=function KBc(){if(!this.a){throw new Esc('No current entry')}xBc(this.a);this.c.a.c.te(this.a.d);this.a=null};var I4=lsc(FKc,'CwAbsolutePanel$3',741),J4=lsc(FKc,'CwAbsolutePanel$4',742),ceb=lsc(SKc,'LinkedHashMap',1332),_db=lsc(SKc,'LinkedHashMap$ChainEntry',1333),beb=lsc(SKc,'LinkedHashMap$EntrySet',1335),aeb=lsc(SKc,'LinkedHashMap$EntrySet$EntryIterator',1336);NEc($n)(21);\n//# sourceURL=showcase-21.js\n")
