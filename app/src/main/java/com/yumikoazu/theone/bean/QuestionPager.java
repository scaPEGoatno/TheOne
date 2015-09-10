package com.yumikoazu.theone.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by joker on 2015/9/2.
 */
public class QuestionPager implements Parcelable {
    /**
     * result : SUCCESS
     * questionAdEntity : {"sEditor":"锛堣矗浠荤紪杈戯細鍚戝彲锛�","strAnswerTitle":"@姹熻タ鍛ㄥ啿 绛旀湪鏈ㄥ噷锛�","sWebLk":"http://m.wufazhuce.com/question/2015-09-02","strDayDiffer":"","strAnswerContent":"鍘诲勾鍙傚姞浜嗕竴娆\u2033井鍨嬪悓瀛﹁仛浼氥\u20ac傞妗屼笂瑙ョ浜ら敊锛屾\u20ac\u20ac鏃т笌鍚圭墰榻愰锛屽嬀鎼叡璇曟帰涓\u20ac鑹层\u20ac備竴涓コ浜鸿锛氣\u20ac滃綋骞存垜浠帺寰楅偅涔堝ソ锛屼綘杩樿寰楀悧锛熲\u20ac�<br><br>濂瑰潗鍦ㄥ闈紝鑲夌悆鐞冪殑鎵嬫寚鐫\u20ac鎴戙\u20ac�<br><br>鎴戠湅浜嗗ス涓\u20ac浼氬効锛屾病鏈夊お娣卞嵃璞★紝鍙寰楁浘缁忓悓瀛︿竴骞达紝浜ゆ儏澶氭繁锛岀湡鐨勫繕浜嗭紝浣嗕緷绋\u20ac浠夸經搴旇鏄惂銆�<br><br>鎴戣锛屽棷锛屽銆�<br><br>濂规槸涓や釜瀛╁瓙鐨勬瘝浜诧紝娌℃湁宸ヤ綔锛屽湪闀囧瓙閲岀粓骞翠覆闂ㄦ墦楹诲皢锛屼笌浜轰氦璋堟椂锛岃█璇噷鎬诲す鏉傜潃N绉嶇敓娈栧櫒鍚嶇О銆�<br><br>鈥滈偅鏃跺\u20ac欙紝鎴戝拰浣犲拰XX鏄帺寰楁渶濂界殑锛屽悆楗湪涓\u20ac璧凤紝鐫¤鍦ㄤ竴璧�......鈥�<br><br>璁板繂鐨勬瘺鐜荤拑娓愭笎鎷傚幓娴皹锛屾垜鐪嬪埌浜嗗線鏄斻\u20ac傚澶╃殑澶滐紝鎴戜滑涓嬩簡鏅氳嚜涔狅紝璧颁簡鍗侀噷灞辫矾锛屽埌鏉戣惤閲岀殑濂瑰锛屾嬁浜嗙偣鐗╀粈锛屽悆浜嗙偣绾㈣柉锛屽張鍘熻矾杩斿洖鏉ャ\u20ac傛湀鍏夌収寰楄矾闈㈡竻娓呯櫧鐧斤紝鍥涢噹瀵傞潤锛岃悿铏捣浼忥紝鎴戜滑鎯冲埌涓\u20ac鐢熴\u20ac�<br><br>鈥滀竴杈堝瓙閮借鍋氬ソ鏈嬪弸锛佲\u20ac�<br>鈥滃棷锛屼竴杈堝瓙銆傗\u20ac�<br> <br>涓\u20ac杈堝瓙鐨勫敖澶达紝鍘熸潵灏辨槸姣曚笟銆�<br><br>浠庢锛屽ス鎵戝叆濂圭殑鑺辫姳涓栫晫锛屾垜璺屽叆鎴戠殑婊氭粴绾㈠皹锛屽ス鍏冲績濂圭殑鏌寸背娌圭洂锛屾垜鍦ㄦ剰鎴戠殑鍠滀箰鎮叉銆傞亾涓嶅悓涓嶇浉涓鸿皨锛岃\u20ac岀枏绂诲氨姝ゅ紑濮嬨\u20ac�<br><br>鍦ㄣ\u20ac婁翰鐖辩殑瀹夊痉鐑堛\u20ac嬮噷锛岄緳搴斿彴瀵瑰効瀛愯锛�<br>浜虹敓锛屽叾瀹炲儚涓\u20ac鏉\u2032粠瀹介様鐨勫钩鍘熻蛋杩涙．鏋楃殑璺\u20ac�<br><br>鍦ㄥ钩鍘熶笂鍚屼即鍙互缁撲紮鑰岃锛屾涔愬湴鍓嶆帹鍚庢尋銆佺浉婵\u2032互娌紱涓\u20ac鏃﹁繘鍏ユ．鏋楋紝鑽変笡鍜岃崋妫樻尅璺紝鎯呭舰灏卞彉浜嗭紝鍚勪汉涓撳績璧板悇浜虹殑璺紝瀵绘壘鍚勪汉鐨勬柟鍚戙\u20ac�<br><br>閭ｆ帹鎺ㄦ尋鎸ゅ悓鍞卞悓涔愮殑缇や綋鎯呮劅锛岄偅鏃犲咖鏃犺檻鏃犵寽蹇岀殑鍚屽儦娣辨儏锛屽湪浜虹殑涓\u20ac鐢熶箣涓篃鍙湁灏戝勾鏈熸湁銆�<br><br>浜哄彉寰楁垚鐔熴\u20ac佽嚜瑙変互鍚庯紝閫愭笎浼氭剰璇嗗埌鑷繁鏄皝锛屼綑鐢熸兂鑾峰緱浠\u20ac涔堬紝骞跺湪涓\u20ac瀹氱▼搴︿笂鏄庣\u2018浜嗗摢浜涙湅鍙嬪\u20ac煎緱鍏ㄥ姏鍏虫敞锛屽摢浜涘彧鏄湪娑堣\u20ac楃簿鍔涖\u20ac�<br><br>杩欑绛涢\u20ac夎繃绋嬫湁涓鍚嶏紝鍙ぞ浼氭儏缁\u20ac夋嫨鐞嗚銆�<br><br>浣犲皢涓\u20ac涓湅鍙嬫媺鍏ラ粦鍚嶅崟锛屽繀鐒朵篃灏嗗彟涓\u20ac涓汉鈥滈\u20ac氳繃濂藉弸鐢宠鈥濄\u20ac� <br>浣犺涓\u20ac涓湅鍙嬪湀鈥滃ソ璧帮紝涓嶉\u20ac佲\u20ac濓紝涔熶唬琛ㄧ潃琚彟涓\u20ac涓湅鍙嬪湀鈥滄杩庡厜涓粹\u20ac濄\u20ac�<br><br>鐢熸椿鐨勪笉鍚岋紝鐜鐨勫樊寮傦紝鎬濇兂瑙傚康涓庣敓娲绘\u20ac佸害鐨勫ぉ澹や箣鍒紝閮戒細璁╂晠鍙嬩綔楦熷吔鍥涙暎銆�<br>杩欎竴鐐癸紝鐪嬩技娈嬮叿锛屼絾閬挎棤鍙伩锛屼篃鏃犻渶閬裤\u20ac�<br><br>寮犵埍鐜插湪棣欐腐澶у涓庣値妯辩粨璇嗭紝鍚庢潵瑕佸ソ锛屽嚑涔庤琚\u20ac\u20ac鐤戝悓鎬ф亱銆� 寮犵埍鐜茬殑涔︿腑鎻掔敾锛屽鐢辩値妯卞垱浣滅潃鑹诧紝鐓х墖鎷嶆憚鑰咃紝浜﹀涓哄ス銆傚拰骞冲勾浠ｏ紝濂逛滑璋堝涓氥\u20ac佹湇瑁呫\u20ac侀鐗┿\u20ac佹皵鐭儏闀夸互鍙婁贡涓冨叓绯燂紝鎴樹簤鏉ヤ复鏃讹紝鍒欎竴璧烽伩鎴樼伀銆�1944骞�8鏈堬紝鑳\u2033叞鎴愪笌绗簩浠诲瀛愮濠氾紝涓庡紶鐖辩幉缁撳銆傜値妯辨槸璇佸浜恒\u20ac�<br><br>鍙儨锛岄潚鏄ョ殑姘磋姳鍐插紑浠ュ悗锛屾箥鎬ョ殑鏃堕棿閲岋紝鍙湅寰楀埌鏈夊幓鏃犲洖鐨勪汉銆�<br><br>骞撮暱鍚庯紝濂逛滑閫愭笎鐤忕锛屽悗鏉ユ柇浜わ紝鍑犱箮鑰佹涓嶇浉寰\u20ac鏉ャ\u20ac備竴涓湪缇庡浗瀛ょ嫭搴︽棩锛屼竴涓湪鏃ユ湰蹇剰浜虹敓銆� <br><br>鐐庢ū鏇惧湪淇￠噷闂紝涓轰粈涔堣帿鍚嶅叾濡欎笉鍐嶇悊鎴戯紵寮犵埍鐜茶锛氭垜涓嶅枩娆竴涓汉鍜屾垜鑰佹槸鑱婂嚑鍗佸勾鍓嶇殑浜嬶紝濂藉儚鎴戞槸涓浜轰竴鏍枫\u20ac�<br><br>杩欎娇鎴戞兂鍒颁竴涓笓鏍忎綔瀹讹紝浠栬锛屾湁涓\u20ac鍥烇紝浠栬鎷夊叆涓\u20ac涓垵涓悓瀛︾兢锛屽彂鐜板畬鍏ㄩ\u20ac傚簲涓嶄簡锛岄偅浜涚啛鎮夊張闄岀敓鐨勪汉锛岀粓鏃ュ湪缇ら噷杞彂璋ｈ█銆佸吇鐢熸枃銆併\u20ac婂崄鎷涜鐢蜂汉褰诲簳鐖变笂浣犮\u20ac嬧\u20ac︹\u20ac�<br><br>浠栬瘯鍥惧憡璇夊ぇ瀹讹紝璋ｈ█浣曚互涓鸿埃瑷\u20ac锛屼腑鍖诲吇鐢熶笉鍙叏淇★紝鍗佹嫑璁╃敺浜虹埍涓婁竴涓コ浜哄彧鏄彲绗戠殑鑺辨嫑銆�<br>濡傛槸鍑犲ぉ锛屼粬鏀跺埌鎻愮ず锛氫綘琚涪鍑虹兢鑱娿\u20ac�<br>浠栨棤濂堬紝鎰熷徆璇达紝骞村皯鏃剁殑鏈嬪弸锛屽彧閫傚悎鎬\u20ac蹇点\u20ac�<br><br>鎺ㄦ鍙婂郊銆傚洜鎭╂儏鑰岀粨缂樼殑浜猴紝涔熷彧閫傚悎鎶ユ仼锛涗竴璧峰枬閰掋\u20ac並姝屻\u20ac佹场鍚с\u20ac佺害P鐨勪汉锛屼篃鍙\u20ac傚悎浜箰鍋锋銆�<br><br>鐪熸鐨勬湅鍙嬶紝璧勬簮銆佸湴浣嶃\u20ac佽璇嗕竴瀹氱浉褰撱\u20ac傚嵆渚挎湁浜涘弸璋婏紝鐪嬭捣鏉ヨ秴瓒婇樁绾э紝浣嗚蹇电殑姘翠綅锛屼篃涓\u20ac瀹氭槸鐩歌繎鐨勩\u20ac傛湅鍙嬫槸鍒嗕韩瑙傜偣鐨勪汉锛岃\u20ac屼笉浠呬粎鏄氦鎹㈡劅鎯呫\u20ac�<br><br>鍚庢潵锛屽紶鐖辩幉涓庨倽鏂囩編缁撲负鑷充氦銆傞倽鏂囩編鏄炕璇戝锛屼篃鏄綔瀹躲\u20ac佽瘎璁哄瀹嬫穱鐨勫か浜猴紝瀛﹁瘑杩囦汉锛屽痉琛屼害鐒躲\u20ac傚畫缇庨緞鏇鹃個閭濇枃缇庡綋濂圭殑绉佷汉绉樹功锛岃閭濇枃缇庡鎷掋\u20ac傚紶鐖辩幉璇达紝鈥滄垜鍚戞潵瑙佸埌鏈夋墠寰风殑濂充汉鎬绘嬁Mae姣斾竴姣旓紝娌\u2032竴涓湁鐐瑰強寰椾笂濂圭殑銆傗\u20ac�<br><br>1995骞达紝寮犵埍鐜插湪娲涙潐鐭跺幓涓栵紝姝诲墠鐣欎笅绠\u20ac鍗曠殑閬楀槺锛屽彧鏈変笁鏉★紝绗竴灏辨槸锛氭垜鍘讳笘鍚庯紝鎴戝皢鎴戞嫢鏈夌殑鎵\u20ac鏈変竴鍒囬兘鐣欑粰瀹嬫穱澶銆�<br><br>鎯呬箟涔嬬瑑锛屼俊浠讳箣鍒囷紝鍫О鍙嬫儏鐨勬ā鑼冩暀鏈\u20ac�<br><br>鍥炲綊浜庡綋涓嬨\u20ac�<br><br>鍦ㄥ悇绉嶇ぞ浜ゅ獟浣撲腑锛岄殢澶勫彲瑙佸浣曟尳鍥炲弸鎯呯殑姹傚姪锛屾晠鍙嬩笉鍐嶇殑鍝\u20ac鍙癸紝涓\u20ac涓釜鐨勨\u20ac滐紵鈥濓紝涓\u20ac涓釜鐨勨\u20ac滐紒\"锛岄亶鍙婅鐣屻\u20ac�<br><br>鎴戠悊瑙ｈ繖绉嶅け鎰忥紝涔熷皾杩囧弸灏界殑閰告鐏板績锛屼害瑙夊緱锛屾浘缁忎翰瀵嗙殑浜洪檯鍏崇郴涔嬫墍浠ョ粓缁擄紝绌跺叾鏍规湰锛屾槸鎴戜滑閮界湅娓呬簡锛岄偅鏉\u2032粠鍓嶅井寮变絾鍚庢潵瀹芥繁鐨勬矡銆傝蹇电殑娌熴\u20ac�<br><br>鍙湅鐪熶汉绉\u20ac涓庢姉鏃ョ鍓х殑浜猴紝涓庨槄璇婚樋浼︾壒鍗\u2033か鍗＄殑浜猴紝鑷劧闅句互璧板埌涓\u20ac璧凤紱<br><br>娌夎糠浜庨夯灏嗙殑浜猴紝涓庝竴涓懆娓镐笘鐣岀殑浜猴紝鑷劧闅句互鎴愪负鏈嬪弸锛�<br>...... <br>鎵\u20ac浠ワ紝鍙嬭皧璧拌嚦鏈矾鐨勬椂鍊欙紝涓嶈寮烘眰锛屼笉瑕佸埢鑸熸眰鍓戯紝涓嶈姘翠腑鎹炴湀锛屼笉瑕佷互鏃ф棩鎯呮剰鏉ユ尳鍥烇紝涓嶈鍙ｅ嚭鎭惰█銆�<br><br>鍙渶鍧︾劧鎵胯锛氬畠缁撴潫浜嗐\u20ac�<br><br>鐒跺悗锛岄夯鍙嬬户缁幓瀵昏鐗屽弸锛屽珫瀹㈠幓鍜屾福鐢风粨鐩燂紝涔﹁糠涓庡奖杩锋垚涓鸿嚦浜わ紝鐜父涓栫晫鐨勯┐鍙嬪幓閬囪鐣欏鐢燂紝鍝堜經MBA鍘荤粨浜よ\u20ac堕瞾娉曞闄㈢澹紝浼墮鍜屽瓙鏈熸兒鎯虹浉鎯滐紝璋㈣\u20ac虫湹涓庤幈绾冲痉浜掔垎浜掔偢锛屽皬S鍜岃寖鐜惇銆侀樋闆呫\u20ac佸惔浣╂厛绛夊コ鏄庢槦缁勬垚濮愬娣樸\u20ac�<br><br>濡傛灉浣犺锛屾垜杩樻槸娌℃湁鏈嬪弸锛屾\u20ac庝箞鍔炲憿锛�<br><br>浣欏崕鍦ㄣ\u20ac婂湪缁嗛洦涓懠鍠娿\u20ac嬩腑璇磋繃锛�<br>鎴戜笉鍐嶈妯\u2032綔鏍峰湴鎷ユ湁寰堝鍙嬩汉锛岃\u20ac屾槸鍥炲埌浜嗗鍗曚箣涓紝浠ョ湡姝ｇ殑鎴戝紑濮嬩簡鐙嚜鐨勭敓娲汇\u20ac傛湁鏃舵垜涔熶細鍥犱负瀵傚癁鑰岄毦浠ュ繊鍙楃┖铏氱殑鎶樼（锛屼絾鎴戝畞鎰夸互杩欐牱鐨勬柟寮忔潵缁存姢鑷繁鐨勮嚜灏婏紝涔熶笉鎰夸互鑰昏颈涓轰唬浠峰幓鎹㈠彇閭ｇ琛ㄩ潰鐨勬湅鍙嬨\u20ac�<br><br>瓒婃槸娌℃湁搴曠嚎鐨勪汉锛屸\u20ac滄湅鍙嬧\u20ac濊秺澶氥\u20ac傗\u20ac滆繖鏄垜鏈嬪弸锛岄偅鏄垜鏈嬪弸锛屽摝锛屼粬鍛\u20ac锛屾垜涔熻璇嗭紝鎴戞湅鍙嬧\u20ac濄\u20ac�<br><br>瓒婃槸鑷垜灏婇噸鐨勪汉锛岃秺鎱庨噸璁ら鏈嬪弸銆傚洜涓轰粬鐭ラ亾锛屼竴鏉ュ弻鏂归兘瑕佹湁杩欎唤鎯呮劅璁ょ煡锛屼簩鏉ユ櫤璇嗕笌寰疯涓\u20ac瀹氱浉褰撱\u20ac�<br><br>鐪熸鐨勭煡宸卞彲閬囪\u20ac屼笉鍙眰锛屾垨璁哥粓鍏朵竴鐢燂紝鎴戜滑涔熼亣瑙佷笉浜嗛倽鏂囩編锛岄亣瑙佷笉浜嗗瓙鏈燂紝閬囪涓嶄簡鑾辩撼寰枫\u20ac傝繖鐪熸槸閬楁喚銆�<br><br>浣嗗湪閬楁喚涔嬪墠锛屼綘涓\u20ac瀹氳闂竴鍙ヨ嚜宸憋細閭ｄ簺鏄庝寒鐨勪汉锛屽鏋滀笌浣犵浉閬囷紝浣犳槸鍚︽湁涓庝箣鐩稿尮閰嶇殑鍒嗛噺锛熶笉鑷充簬鎴愪负寤変环鐨勪俊寰掞紙涔熷繀鎴愪负寤変环鐨勫彌寰掞級锛岃\u20ac屾槸缁堣韩鐨勮嚦浜ゃ\u20ac�","strQuestionContent":"鏈ㄦ湪鍑岄棶锛氭浘缁忕殑濂芥湅鍙嬫\u20ac绘槸涓嶅彲閬垮厤鍦颁細鎱㈡參鐤忚繙锛岄毦閬撴湅鍙嬫案杩滃彧鑳介櫔浼磋嚜宸辫蛋涓\u20ac娈碉紝閭ｈ鐢ㄦ\u20ac庢牱鐨勫績鎯呭幓缁撲氦涓\u20ac涓敞瀹氫細鐤忚繙鐨勬湅鍙嬪憿锛�","strQuestionTitle":"濂芥湅鍙嬫槸濡備綍鍒嗛亾鎵暢鐨勶紵","strQuestionMarketTime":"2015-09-02","strPraiseNumber":"8858","strLastUpdateDate":"2015-09-02 14:24:16","entQNCmt":{"upFg":"","pNum":"","strCnt":"","strD":"","strId":""},"strQuestionId":"1089"}
     */
    private String result;
    private QuestionAdEntityEntity questionAdEntity;

    public void setResult(String result) {
        this.result = result;
    }

    public void setQuestionAdEntity(QuestionAdEntityEntity questionAdEntity) {
        this.questionAdEntity = questionAdEntity;
    }

    public String getResult() {
        return result;
    }

    public QuestionAdEntityEntity getQuestionAdEntity() {
        return questionAdEntity;
    }

    public static class QuestionAdEntityEntity implements Parcelable {
        /**
         * sEditor : 锛堣矗浠荤紪杈戯細鍚戝彲锛�
         * strAnswerTitle : @姹熻タ鍛ㄥ啿 绛旀湪鏈ㄥ噷锛�
         * sWebLk : http://m.wufazhuce.com/question/2015-09-02
         * strDayDiffer :
         * strAnswerContent : 鍘诲勾鍙傚姞浜嗕竴娆″井鍨嬪悓瀛﹁仛浼氥€傞妗屼笂瑙ョ浜ら敊锛屾€€鏃т笌鍚圭墰榻愰锛屽嬀鎼叡璇曟帰涓€鑹层€備竴涓コ浜鸿锛氣€滃綋骞存垜浠帺寰楅偅涔堝ソ锛屼綘杩樿寰楀悧锛熲€�<br><br>濂瑰潗鍦ㄥ闈紝鑲夌悆鐞冪殑鎵嬫寚鐫€鎴戙€�<br><br>鎴戠湅浜嗗ス涓€浼氬効锛屾病鏈夊お娣卞嵃璞★紝鍙寰楁浘缁忓悓瀛︿竴骞达紝浜ゆ儏澶氭繁锛岀湡鐨勫繕浜嗭紝浣嗕緷绋€浠夸經搴旇鏄惂銆�<br><br>鎴戣锛屽棷锛屽銆�<br><br>濂规槸涓や釜瀛╁瓙鐨勬瘝浜诧紝娌℃湁宸ヤ綔锛屽湪闀囧瓙閲岀粓骞翠覆闂ㄦ墦楹诲皢锛屼笌浜轰氦璋堟椂锛岃█璇噷鎬诲す鏉傜潃N绉嶇敓娈栧櫒鍚嶇О銆�<br><br>鈥滈偅鏃跺€欙紝鎴戝拰浣犲拰XX鏄帺寰楁渶濂界殑锛屽悆楗湪涓€璧凤紝鐫¤鍦ㄤ竴璧�......鈥�<br><br>璁板繂鐨勬瘺鐜荤拑娓愭笎鎷傚幓娴皹锛屾垜鐪嬪埌浜嗗線鏄斻€傚澶╃殑澶滐紝鎴戜滑涓嬩簡鏅氳嚜涔狅紝璧颁簡鍗侀噷灞辫矾锛屽埌鏉戣惤閲岀殑濂瑰锛屾嬁浜嗙偣鐗╀粈锛屽悆浜嗙偣绾㈣柉锛屽張鍘熻矾杩斿洖鏉ャ€傛湀鍏夌収寰楄矾闈㈡竻娓呯櫧鐧斤紝鍥涢噹瀵傞潤锛岃悿铏捣浼忥紝鎴戜滑鎯冲埌涓€鐢熴€�<br><br>鈥滀竴杈堝瓙閮借鍋氬ソ鏈嬪弸锛佲€�<br>鈥滃棷锛屼竴杈堝瓙銆傗€�<br> <br>涓€杈堝瓙鐨勫敖澶达紝鍘熸潵灏辨槸姣曚笟銆�<br><br>浠庢锛屽ス鎵戝叆濂圭殑鑺辫姳涓栫晫锛屾垜璺屽叆鎴戠殑婊氭粴绾㈠皹锛屽ス鍏冲績濂圭殑鏌寸背娌圭洂锛屾垜鍦ㄦ剰鎴戠殑鍠滀箰鎮叉銆傞亾涓嶅悓涓嶇浉涓鸿皨锛岃€岀枏绂诲氨姝ゅ紑濮嬨€�<br><br>鍦ㄣ€婁翰鐖辩殑瀹夊痉鐑堛€嬮噷锛岄緳搴斿彴瀵瑰効瀛愯锛�<br>浜虹敓锛屽叾瀹炲儚涓€鏉′粠瀹介様鐨勫钩鍘熻蛋杩涙．鏋楃殑璺€�<br><br>鍦ㄥ钩鍘熶笂鍚屼即鍙互缁撲紮鑰岃锛屾涔愬湴鍓嶆帹鍚庢尋銆佺浉婵′互娌紱涓€鏃﹁繘鍏ユ．鏋楋紝鑽変笡鍜岃崋妫樻尅璺紝鎯呭舰灏卞彉浜嗭紝鍚勪汉涓撳績璧板悇浜虹殑璺紝瀵绘壘鍚勪汉鐨勬柟鍚戙€�<br><br>閭ｆ帹鎺ㄦ尋鎸ゅ悓鍞卞悓涔愮殑缇や綋鎯呮劅锛岄偅鏃犲咖鏃犺檻鏃犵寽蹇岀殑鍚屽儦娣辨儏锛屽湪浜虹殑涓€鐢熶箣涓篃鍙湁灏戝勾鏈熸湁銆�<br><br>浜哄彉寰楁垚鐔熴€佽嚜瑙変互鍚庯紝閫愭笎浼氭剰璇嗗埌鑷繁鏄皝锛屼綑鐢熸兂鑾峰緱浠€涔堬紝骞跺湪涓€瀹氱▼搴︿笂鏄庣‘浜嗗摢浜涙湅鍙嬪€煎緱鍏ㄥ姏鍏虫敞锛屽摢浜涘彧鏄湪娑堣€楃簿鍔涖€�<br><br>杩欑绛涢€夎繃绋嬫湁涓鍚嶏紝鍙ぞ浼氭儏缁€夋嫨鐞嗚銆�<br><br>浣犲皢涓€涓湅鍙嬫媺鍏ラ粦鍚嶅崟锛屽繀鐒朵篃灏嗗彟涓€涓汉鈥滈€氳繃濂藉弸鐢宠鈥濄€� <br>浣犺涓€涓湅鍙嬪湀鈥滃ソ璧帮紝涓嶉€佲€濓紝涔熶唬琛ㄧ潃琚彟涓€涓湅鍙嬪湀鈥滄杩庡厜涓粹€濄€�<br><br>鐢熸椿鐨勪笉鍚岋紝鐜鐨勫樊寮傦紝鎬濇兂瑙傚康涓庣敓娲绘€佸害鐨勫ぉ澹や箣鍒紝閮戒細璁╂晠鍙嬩綔楦熷吔鍥涙暎銆�<br>杩欎竴鐐癸紝鐪嬩技娈嬮叿锛屼絾閬挎棤鍙伩锛屼篃鏃犻渶閬裤€�<br><br>寮犵埍鐜插湪棣欐腐澶у涓庣値妯辩粨璇嗭紝鍚庢潵瑕佸ソ锛屽嚑涔庤琚€€鐤戝悓鎬ф亱銆� 寮犵埍鐜茬殑涔︿腑鎻掔敾锛屽鐢辩値妯卞垱浣滅潃鑹诧紝鐓х墖鎷嶆憚鑰咃紝浜﹀涓哄ス銆傚拰骞冲勾浠ｏ紝濂逛滑璋堝涓氥€佹湇瑁呫€侀鐗┿€佹皵鐭儏闀夸互鍙婁贡涓冨叓绯燂紝鎴樹簤鏉ヤ复鏃讹紝鍒欎竴璧烽伩鎴樼伀銆�1944骞�8鏈堬紝鑳″叞鎴愪笌绗簩浠诲瀛愮濠氾紝涓庡紶鐖辩幉缁撳銆傜値妯辨槸璇佸浜恒€�<br><br>鍙儨锛岄潚鏄ョ殑姘磋姳鍐插紑浠ュ悗锛屾箥鎬ョ殑鏃堕棿閲岋紝鍙湅寰楀埌鏈夊幓鏃犲洖鐨勪汉銆�<br><br>骞撮暱鍚庯紝濂逛滑閫愭笎鐤忕锛屽悗鏉ユ柇浜わ紝鍑犱箮鑰佹涓嶇浉寰€鏉ャ€備竴涓湪缇庡浗瀛ょ嫭搴︽棩锛屼竴涓湪鏃ユ湰蹇剰浜虹敓銆� <br><br>鐐庢ū鏇惧湪淇￠噷闂紝涓轰粈涔堣帿鍚嶅叾濡欎笉鍐嶇悊鎴戯紵寮犵埍鐜茶锛氭垜涓嶅枩娆竴涓汉鍜屾垜鑰佹槸鑱婂嚑鍗佸勾鍓嶇殑浜嬶紝濂藉儚鎴戞槸涓浜轰竴鏍枫€�<br><br>杩欎娇鎴戞兂鍒颁竴涓笓鏍忎綔瀹讹紝浠栬锛屾湁涓€鍥烇紝浠栬鎷夊叆涓€涓垵涓悓瀛︾兢锛屽彂鐜板畬鍏ㄩ€傚簲涓嶄簡锛岄偅浜涚啛鎮夊張闄岀敓鐨勪汉锛岀粓鏃ュ湪缇ら噷杞彂璋ｈ█銆佸吇鐢熸枃銆併€婂崄鎷涜鐢蜂汉褰诲簳鐖变笂浣犮€嬧€︹€�<br><br>浠栬瘯鍥惧憡璇夊ぇ瀹讹紝璋ｈ█浣曚互涓鸿埃瑷€锛屼腑鍖诲吇鐢熶笉鍙叏淇★紝鍗佹嫑璁╃敺浜虹埍涓婁竴涓コ浜哄彧鏄彲绗戠殑鑺辨嫑銆�<br>濡傛槸鍑犲ぉ锛屼粬鏀跺埌鎻愮ず锛氫綘琚涪鍑虹兢鑱娿€�<br>浠栨棤濂堬紝鎰熷徆璇达紝骞村皯鏃剁殑鏈嬪弸锛屽彧閫傚悎鎬€蹇点€�<br><br>鎺ㄦ鍙婂郊銆傚洜鎭╂儏鑰岀粨缂樼殑浜猴紝涔熷彧閫傚悎鎶ユ仼锛涗竴璧峰枬閰掋€並姝屻€佹场鍚с€佺害P鐨勪汉锛屼篃鍙€傚悎浜箰鍋锋銆�<br><br>鐪熸鐨勬湅鍙嬶紝璧勬簮銆佸湴浣嶃€佽璇嗕竴瀹氱浉褰撱€傚嵆渚挎湁浜涘弸璋婏紝鐪嬭捣鏉ヨ秴瓒婇樁绾э紝浣嗚蹇电殑姘翠綅锛屼篃涓€瀹氭槸鐩歌繎鐨勩€傛湅鍙嬫槸鍒嗕韩瑙傜偣鐨勪汉锛岃€屼笉浠呬粎鏄氦鎹㈡劅鎯呫€�<br><br>鍚庢潵锛屽紶鐖辩幉涓庨倽鏂囩編缁撲负鑷充氦銆傞倽鏂囩編鏄炕璇戝锛屼篃鏄綔瀹躲€佽瘎璁哄瀹嬫穱鐨勫か浜猴紝瀛﹁瘑杩囦汉锛屽痉琛屼害鐒躲€傚畫缇庨緞鏇鹃個閭濇枃缇庡綋濂圭殑绉佷汉绉樹功锛岃閭濇枃缇庡鎷掋€傚紶鐖辩幉璇达紝鈥滄垜鍚戞潵瑙佸埌鏈夋墠寰风殑濂充汉鎬绘嬁Mae姣斾竴姣旓紝娌′竴涓湁鐐瑰強寰椾笂濂圭殑銆傗€�<br><br>1995骞达紝寮犵埍鐜插湪娲涙潐鐭跺幓涓栵紝姝诲墠鐣欎笅绠€鍗曠殑閬楀槺锛屽彧鏈変笁鏉★紝绗竴灏辨槸锛氭垜鍘讳笘鍚庯紝鎴戝皢鎴戞嫢鏈夌殑鎵€鏈変竴鍒囬兘鐣欑粰瀹嬫穱澶銆�<br><br>鎯呬箟涔嬬瑑锛屼俊浠讳箣鍒囷紝鍫О鍙嬫儏鐨勬ā鑼冩暀鏈€�<br><br>鍥炲綊浜庡綋涓嬨€�<br><br>鍦ㄥ悇绉嶇ぞ浜ゅ獟浣撲腑锛岄殢澶勫彲瑙佸浣曟尳鍥炲弸鎯呯殑姹傚姪锛屾晠鍙嬩笉鍐嶇殑鍝€鍙癸紝涓€涓釜鐨勨€滐紵鈥濓紝涓€涓釜鐨勨€滐紒"锛岄亶鍙婅鐣屻€�<br><br>鎴戠悊瑙ｈ繖绉嶅け鎰忥紝涔熷皾杩囧弸灏界殑閰告鐏板績锛屼害瑙夊緱锛屾浘缁忎翰瀵嗙殑浜洪檯鍏崇郴涔嬫墍浠ョ粓缁擄紝绌跺叾鏍规湰锛屾槸鎴戜滑閮界湅娓呬簡锛岄偅鏉′粠鍓嶅井寮变絾鍚庢潵瀹芥繁鐨勬矡銆傝蹇电殑娌熴€�<br><br>鍙湅鐪熶汉绉€涓庢姉鏃ョ鍓х殑浜猴紝涓庨槄璇婚樋浼︾壒鍗″か鍗＄殑浜猴紝鑷劧闅句互璧板埌涓€璧凤紱<br><br>娌夎糠浜庨夯灏嗙殑浜猴紝涓庝竴涓懆娓镐笘鐣岀殑浜猴紝鑷劧闅句互鎴愪负鏈嬪弸锛�<br>...... <br>鎵€浠ワ紝鍙嬭皧璧拌嚦鏈矾鐨勬椂鍊欙紝涓嶈寮烘眰锛屼笉瑕佸埢鑸熸眰鍓戯紝涓嶈姘翠腑鎹炴湀锛屼笉瑕佷互鏃ф棩鎯呮剰鏉ユ尳鍥烇紝涓嶈鍙ｅ嚭鎭惰█銆�<br><br>鍙渶鍧︾劧鎵胯锛氬畠缁撴潫浜嗐€�<br><br>鐒跺悗锛岄夯鍙嬬户缁幓瀵昏鐗屽弸锛屽珫瀹㈠幓鍜屾福鐢风粨鐩燂紝涔﹁糠涓庡奖杩锋垚涓鸿嚦浜わ紝鐜父涓栫晫鐨勯┐鍙嬪幓閬囪鐣欏鐢燂紝鍝堜經MBA鍘荤粨浜よ€堕瞾娉曞闄㈢澹紝浼墮鍜屽瓙鏈熸兒鎯虹浉鎯滐紝璋㈣€虫湹涓庤幈绾冲痉浜掔垎浜掔偢锛屽皬S鍜岃寖鐜惇銆侀樋闆呫€佸惔浣╂厛绛夊コ鏄庢槦缁勬垚濮愬娣樸€�<br><br>濡傛灉浣犺锛屾垜杩樻槸娌℃湁鏈嬪弸锛屾€庝箞鍔炲憿锛�<br><br>浣欏崕鍦ㄣ€婂湪缁嗛洦涓懠鍠娿€嬩腑璇磋繃锛�<br>鎴戜笉鍐嶈妯′綔鏍峰湴鎷ユ湁寰堝鍙嬩汉锛岃€屾槸鍥炲埌浜嗗鍗曚箣涓紝浠ョ湡姝ｇ殑鎴戝紑濮嬩簡鐙嚜鐨勭敓娲汇€傛湁鏃舵垜涔熶細鍥犱负瀵傚癁鑰岄毦浠ュ繊鍙楃┖铏氱殑鎶樼（锛屼絾鎴戝畞鎰夸互杩欐牱鐨勬柟寮忔潵缁存姢鑷繁鐨勮嚜灏婏紝涔熶笉鎰夸互鑰昏颈涓轰唬浠峰幓鎹㈠彇閭ｇ琛ㄩ潰鐨勬湅鍙嬨€�<br><br>瓒婃槸娌℃湁搴曠嚎鐨勪汉锛屸€滄湅鍙嬧€濊秺澶氥€傗€滆繖鏄垜鏈嬪弸锛岄偅鏄垜鏈嬪弸锛屽摝锛屼粬鍛€锛屾垜涔熻璇嗭紝鎴戞湅鍙嬧€濄€�<br><br>瓒婃槸鑷垜灏婇噸鐨勪汉锛岃秺鎱庨噸璁ら鏈嬪弸銆傚洜涓轰粬鐭ラ亾锛屼竴鏉ュ弻鏂归兘瑕佹湁杩欎唤鎯呮劅璁ょ煡锛屼簩鏉ユ櫤璇嗕笌寰疯涓€瀹氱浉褰撱€�<br><br>鐪熸鐨勭煡宸卞彲閬囪€屼笉鍙眰锛屾垨璁哥粓鍏朵竴鐢燂紝鎴戜滑涔熼亣瑙佷笉浜嗛倽鏂囩編锛岄亣瑙佷笉浜嗗瓙鏈燂紝閬囪涓嶄簡鑾辩撼寰枫€傝繖鐪熸槸閬楁喚銆�<br><br>浣嗗湪閬楁喚涔嬪墠锛屼綘涓€瀹氳闂竴鍙ヨ嚜宸憋細閭ｄ簺鏄庝寒鐨勪汉锛屽鏋滀笌浣犵浉閬囷紝浣犳槸鍚︽湁涓庝箣鐩稿尮閰嶇殑鍒嗛噺锛熶笉鑷充簬鎴愪负寤変环鐨勪俊寰掞紙涔熷繀鎴愪负寤変环鐨勫彌寰掞級锛岃€屾槸缁堣韩鐨勮嚦浜ゃ€�
         * strQuestionContent : 鏈ㄦ湪鍑岄棶锛氭浘缁忕殑濂芥湅鍙嬫€绘槸涓嶅彲閬垮厤鍦颁細鎱㈡參鐤忚繙锛岄毦閬撴湅鍙嬫案杩滃彧鑳介櫔浼磋嚜宸辫蛋涓€娈碉紝閭ｈ鐢ㄦ€庢牱鐨勫績鎯呭幓缁撲氦涓€涓敞瀹氫細鐤忚繙鐨勬湅鍙嬪憿锛�
         * strQuestionTitle : 濂芥湅鍙嬫槸濡備綍鍒嗛亾鎵暢鐨勶紵
         * strQuestionMarketTime : 2015-09-02
         * strPraiseNumber : 8858
         * strLastUpdateDate : 2015-09-02 14:24:16
         * entQNCmt : {"upFg":"","pNum":"","strCnt":"","strD":"","strId":""}
         * strQuestionId : 1089
         */
        private String sEditor;
        private String strAnswerTitle;
        private String sWebLk;
        private String strDayDiffer;
        private String strAnswerContent;
        private String strQuestionContent;
        private String strQuestionTitle;
        private String strQuestionMarketTime;
        private String strPraiseNumber;
        private String strLastUpdateDate;
        private EntQNCmtEntity entQNCmt;
        private String strQuestionId;

        public void setSEditor(String sEditor) {
            this.sEditor = sEditor;
        }

        public void setStrAnswerTitle(String strAnswerTitle) {
            this.strAnswerTitle = strAnswerTitle;
        }

        public void setSWebLk(String sWebLk) {
            this.sWebLk = sWebLk;
        }

        public void setStrDayDiffer(String strDayDiffer) {
            this.strDayDiffer = strDayDiffer;
        }

        public void setStrAnswerContent(String strAnswerContent) {
            this.strAnswerContent = strAnswerContent;
        }

        public void setStrQuestionContent(String strQuestionContent) {
            this.strQuestionContent = strQuestionContent;
        }

        public void setStrQuestionTitle(String strQuestionTitle) {
            this.strQuestionTitle = strQuestionTitle;
        }

        public void setStrQuestionMarketTime(String strQuestionMarketTime) {
            this.strQuestionMarketTime = strQuestionMarketTime;
        }

        public void setStrPraiseNumber(String strPraiseNumber) {
            this.strPraiseNumber = strPraiseNumber;
        }

        public void setStrLastUpdateDate(String strLastUpdateDate) {
            this.strLastUpdateDate = strLastUpdateDate;
        }

        public void setEntQNCmt(EntQNCmtEntity entQNCmt) {
            this.entQNCmt = entQNCmt;
        }

        public void setStrQuestionId(String strQuestionId) {
            this.strQuestionId = strQuestionId;
        }

        public String getSEditor() {
            return sEditor;
        }

        public String getStrAnswerTitle() {
            return strAnswerTitle;
        }

        public String getSWebLk() {
            return sWebLk;
        }

        public String getStrDayDiffer() {
            return strDayDiffer;
        }

        public String getStrAnswerContent() {
            return strAnswerContent;
        }

        public String getStrQuestionContent() {
            return strQuestionContent;
        }

        public String getStrQuestionTitle() {
            return strQuestionTitle;
        }

        public String getStrQuestionMarketTime() {
            return strQuestionMarketTime;
        }

        public String getStrPraiseNumber() {
            return strPraiseNumber;
        }

        public String getStrLastUpdateDate() {
            return strLastUpdateDate;
        }

        public EntQNCmtEntity getEntQNCmt() {
            return entQNCmt;
        }

        public String getStrQuestionId() {
            return strQuestionId;
        }

        public static class EntQNCmtEntity implements Parcelable {
            /**
             * upFg :
             * pNum :
             * strCnt :
             * strD :
             * strId :
             */
            private String upFg;
            private String pNum;
            private String strCnt;
            private String strD;
            private String strId;

            public void setUpFg(String upFg) {
                this.upFg = upFg;
            }

            public void setPNum(String pNum) {
                this.pNum = pNum;
            }

            public void setStrCnt(String strCnt) {
                this.strCnt = strCnt;
            }

            public void setStrD(String strD) {
                this.strD = strD;
            }

            public void setStrId(String strId) {
                this.strId = strId;
            }

            public String getUpFg() {
                return upFg;
            }

            public String getPNum() {
                return pNum;
            }

            public String getStrCnt() {
                return strCnt;
            }

            public String getStrD() {
                return strD;
            }

            public String getStrId() {
                return strId;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.upFg);
                dest.writeString(this.pNum);
                dest.writeString(this.strCnt);
                dest.writeString(this.strD);
                dest.writeString(this.strId);
            }

            public EntQNCmtEntity() {
            }

            protected EntQNCmtEntity(Parcel in) {
                this.upFg = in.readString();
                this.pNum = in.readString();
                this.strCnt = in.readString();
                this.strD = in.readString();
                this.strId = in.readString();
            }

            public static final Creator<EntQNCmtEntity> CREATOR = new Creator<EntQNCmtEntity>() {
                public EntQNCmtEntity createFromParcel(Parcel source) {
                    return new EntQNCmtEntity(source);
                }

                public EntQNCmtEntity[] newArray(int size) {
                    return new EntQNCmtEntity[size];
                }
            };
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.sEditor);
            dest.writeString(this.strAnswerTitle);
            dest.writeString(this.sWebLk);
            dest.writeString(this.strDayDiffer);
            dest.writeString(this.strAnswerContent);
            dest.writeString(this.strQuestionContent);
            dest.writeString(this.strQuestionTitle);
            dest.writeString(this.strQuestionMarketTime);
            dest.writeString(this.strPraiseNumber);
            dest.writeString(this.strLastUpdateDate);
            dest.writeParcelable(this.entQNCmt, flags);
            dest.writeString(this.strQuestionId);
        }

        public QuestionAdEntityEntity() {
        }

        protected QuestionAdEntityEntity(Parcel in) {
            this.sEditor = in.readString();
            this.strAnswerTitle = in.readString();
            this.sWebLk = in.readString();
            this.strDayDiffer = in.readString();
            this.strAnswerContent = in.readString();
            this.strQuestionContent = in.readString();
            this.strQuestionTitle = in.readString();
            this.strQuestionMarketTime = in.readString();
            this.strPraiseNumber = in.readString();
            this.strLastUpdateDate = in.readString();
            this.entQNCmt = in.readParcelable(EntQNCmtEntity.class.getClassLoader());
            this.strQuestionId = in.readString();
        }

        public static final Parcelable.Creator<QuestionAdEntityEntity> CREATOR = new Parcelable.Creator<QuestionAdEntityEntity>() {
            public QuestionAdEntityEntity createFromParcel(Parcel source) {
                return new QuestionAdEntityEntity(source);
            }

            public QuestionAdEntityEntity[] newArray(int size) {
                return new QuestionAdEntityEntity[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.result);
        dest.writeParcelable(this.questionAdEntity, 0);
    }

    public QuestionPager() {
    }

    protected QuestionPager(Parcel in) {
        this.result = in.readString();
        this.questionAdEntity = in.readParcelable(QuestionAdEntityEntity.class.getClassLoader());
    }

    public static final Parcelable.Creator<QuestionPager> CREATOR = new Parcelable.Creator<QuestionPager>() {
        public QuestionPager createFromParcel(Parcel source) {
            return new QuestionPager(source);
        }

        public QuestionPager[] newArray(int size) {
            return new QuestionPager[size];
        }
    };
}
