$wnd.showcase.runAsyncCallback24("function yDb(a){this.b=a}\nfunction BDb(a){this.b=a}\nfunction EDb(a){this.b=a}\nfunction LDb(a,b){this.b=a;this.c=b}\nfunction ut(a,b){a.remove(b)}\nfunction gbc(a,b){$ac(a,b);ut((iZb(),a.hb),b)}\nfunction _Yb(){var a;if(!YYb||bZb()){a=new vBc;aZb(a);YYb=a}return YYb}\nfunction bZb(){var a=$doc.cookie;if(a!=ZYb){ZYb=a;return true}else{return false}}\nfunction cZb(a){a=encodeURIComponent(a);$doc.cookie=a+'=;expires=Fri, 02-Jan-1970 00:00:00 GMT'}\nfunction tDb(a,b){var c,d,e,f;tt(bbc(a.d));f=0;e=VJ(_Yb());for(d=yyc(e);d.b.Je();){c=rW(Eyc(d),1);dbc(a.d,c);$tc(c,b)&&(f=bbc(a.d).options.length-1)}rp((kp(),jp),new LDb(a,f))}\nfunction uDb(a){var b,c,d,e;if(bbc(a.d).options.length<1){Mdc(a.b,sGc);Mdc(a.c,sGc);return}d=bbc(a.d).selectedIndex;b=cbc(a.d,d);c=(e=_Yb(),rW(e.ye(b),1));Mdc(a.b,b);Mdc(a.c,c)}\nfunction aZb(b){var c=$doc.cookie;if(c&&c!=sGc){var d=c.split(XHc);for(var e=0;e<d.length;++e){var f,g;var i=d[e].indexOf(hIc);if(i==-1){f=d[e];g=sGc}else{f=d[e].substring(0,i);g=d[e].substring(i+1)}if($Yb){try{f=decodeURIComponent(f)}catch(a){}try{g=decodeURIComponent(g)}catch(a){}}b.Ae(f,g)}}}\nfunction sDb(a){var b,c,d;c=new M8b(3,3);a.d=new ibc;b=new e1b('Supprimer');Aj((iZb(),b.hb),BNc,true);$7b(c,0,0,'<b><b>Cookies existants:<\\/b><\\/b>');b8b(c,0,1,a.d);b8b(c,0,2,b);a.b=new Wdc;$7b(c,1,0,'<b><b>Nom:<\\/b><\\/b>');b8b(c,1,1,a.b);a.c=new Wdc;d=new e1b('Sauvegarder Cookie');Aj(d.hb,BNc,true);$7b(c,2,0,'<b><b>Valeur:<\\/b><\\/b>');b8b(c,2,1,a.c);b8b(c,2,2,d);Hj(d,new yDb(a),(qz(),qz(),pz));Hj(a.d,new BDb(a),(gz(),gz(),fz));Hj(b,new EDb(a),pz);tDb(a,null);return c}\nTgb(734,1,IEc,yDb);_.Rc=function zDb(a){var b,c,d;c=Js(_i(this.b.b),AMc);d=Js(_i(this.b.c),AMc);b=new JV(pgb(tgb((new HV).q.getTime()),REc));if(c.length<1){c$b('Vous devez indiquer un nom de cookie');return}dZb(c,d,b);tDb(this.b,c)};Tgb(735,1,JEc,BDb);_.Qc=function CDb(a){uDb(this.b)};Tgb(736,1,IEc,EDb);_.Rc=function FDb(a){var b,c;c=bbc(this.b.d).selectedIndex;if(c>-1&&c<bbc(this.b.d).options.length){b=cbc(this.b.d,c);cZb(b);gbc(this.b.d,c);uDb(this.b)}};Tgb(737,1,LEc);_.xc=function JDb(){xjb(this.c,sDb(this.b))};Tgb(738,1,{},LDb);_.zc=function MDb(){this.c<bbc(this.b.d).options.length&&hbc(this.b.d,this.c);uDb(this.b)};_.c=0;var YYb=null,ZYb,$Yb=true;var k5=Wsc(HLc,'CwCookies$1',734),l5=Wsc(HLc,'CwCookies$2',735),m5=Wsc(HLc,'CwCookies$3',736),o5=Wsc(HLc,'CwCookies$5',738);yFc(lo)(24);\n//# sourceURL=showcase-24.js\n")
