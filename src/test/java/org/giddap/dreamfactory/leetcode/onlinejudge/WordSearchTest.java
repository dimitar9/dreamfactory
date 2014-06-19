package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.WordSearchBacktrackingImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.WordSearchDfsIterativeImpl;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WordSearchTest {
//    private WordSearch solution = new WordSearchDfsIterativeImpl();

    private WordSearch solution = new WordSearchBacktrackingImpl();
    @Test
    public void small01() {
        char[] a = {'a'};
        char[][] input = new char[1][1];
        input[0] = a;

        assertTrue(solution.exist(input, "a"));
    }

    @Test
    public void small02() {
        char[] aa = {'a', 'a'};
        char[][] input = new char[1][2];
        input[0] = aa;

        assertFalse(solution.exist(input, "aaa"));
    }

    @Test
    public void small03() {
        char[] aa = {'a', 'b'};
        char[][] input = new char[1][2];
        input[0] = aa;

        assertTrue(solution.exist(input, "ba"));
    }

    @Test
    public void small04() {
        char[] row0 = {'a', 'b'};
        char[] row1 = {'c', 'd'};
        char[][] input = new char[2][2];
        input[0] = row0;
        input[1] = row1;

        assertFalse(solution.exist(input, "abcd"));
    }

    @Test
    public void small05() {
        char[] row0 = {'A', 'B', 'C', 'E'};
        char[] row1 = {'S', 'F', 'C', 'S'};
        char[] row2 = {'A', 'D', 'E', 'E'};
        char[][] input = new char[3][4];
        input[0] = row0;
        input[1] = row1;
        input[2] = row2;

        assertTrue(solution.exist(input, "ABCCED"));
    }

    @Test
    public void small06() {
        char[] a = {'a', 'b'};
        char[][] input = new char[1][2];
        input[0] = a;

        assertTrue(solution.exist(input, "ab"));
    }

    @Test
    public void small07() {
        char[][] input = {  "ABCE".toCharArray(),
                            "SFES".toCharArray(),
                            "ADEE".toCharArray()};

        assertTrue(solution.exist(input, "ABCESEEEFS"));
    }

    @Test
    public void large01() {
        char[][] input = {
                "elxllvxegzmvgnhrypvagxrgwktiqnyuavfnsfsbgewnrferubrcykjwveenrfhtamhvtzwafspzxvqtwkxwwgttkzgdenzhcgcvhyxosonrjgmhsjeo".toCharArray(),
                "qxkcyqidehkipofwofmgtazfilocwuqotatstbvzkhhzvmxjrjrnlsutdixbdoqwqjolklkwstvpgsyzdropjikoriquygsqphcbuoxniucoodpruegg".toCharArray(),
                "mrudzkzxsupjbrmxgjkofpetutnoztwmmrrndtmwncfqtsnbdaplrvglptbqpycdpwrspdqehyudsjevjwictpnkkpbznfdebwysbpwjnsmfcscnqnqk".toCharArray(),
                "cdumuvojbtnepmxqdvbsopzskdfaqxkudhhxexhfqwkfkjxnezhuqgmamsbcrnxuwgsbdbgtxsaidxxiyfcplrpxlqccgzxchrdksmfpgfxkexudcysp".toCharArray(),
                "phnaarfisckztqllcqckxcubzqebpyqgifjkwosqqeplucyysajreftfwzgnazvkgeufsovisnvpptnkwybagwgeyotypokwteblsywmlrbbnrljrmlx".toCharArray(),
                "ltbjiujxjtvczwprvlfifhjsaubrjmpugsfqnopyjlcijrbgfgpkpacpvfhgtwczohrdxhbgudqfxroczdopdqeavliojkqarjdqshwomoujfinhnbws".toCharArray(),
                "tatoobfxmxzfidwbkupwjlgqtvxgxvzqyuhmxollnltvqpyalowwbepvcmdzkeriaauyohjducbktzkhpjdrpsorhrstykbykxwbeigzmhlihwpwhupw".toCharArray(),
                "pdoyxirvsuvfrsivcowqwiydgpbnmrlbwbbtkuqcomjfgrckgbaejzjrqkgcdrfctgxfcojqctvkkausbuymvhdmsjqxcwzxezchnmzrfxbrxvmapkmn".toCharArray(),
                "srbmcrleplcukgdzscszbtraofafpmujdvxfnjmcwoygubhpgzojuhkkmkrexmnchlkuuwzqmxyibhxhioqcvcmindmmrbozoyvkwuciscrvlqcteuxa".toCharArray(),
                "zlkmryyibmhqndcjzfutjnovdsokpomozyaqwyzxmipbnslnxhgguxbzpslegxsfxuytuztjhikvaxkzesgypjahdllllgticrexqxgzfqwiqghubpvq".toCharArray(),
                "bxxeilsvtleveksuhatotswjygfzvasyxrficxdvijtmtniaodrhvnswtxvrappxhuhjtlhduarqnzsdfjmcxeyscwlcldbszjetwnwspoiepbiukuzj".toCharArray(),
                "zxedtrfhuiburhpnulilbqqttypgsoptmvwhnbqhmuddbstygbjjtzcnzstsiknwgkgvnwczqgfuyysgbdqwfslemgyvrmtzwzujwyjoeqifoclrgdnl".toCharArray(),
                "ybrkhqhycbzyatjysspyizfycrrkwhxuiofpeoogrpeujosdijbtjhtlalxwsutciarpohvgxcaisulcgovpvrcxezwyvpafprufzqlysngmkroqfkfd".toCharArray(),
                "djchkyhfphkeafkbxxzrnfdxyrngdulgfnppowufdgkgnwhkvhbiogfpyuxdqkkvzbknygtdnfjadtnaaojqvqhvleydokzomldmsyrhfbhkuulwluoi".toCharArray(),
                "mwfzcddtoejcpmojnfqsiafewqchmtrypwytcdmqhxuwmkizrytcaygxqlgceabvwboyedqnamlowtnoujqujytajacnafkyizxoepbgcnvygkoatgxf".toCharArray(),
                "fqfqsjgsrqtzrsoxhpgjcbklnaljhkoobvetemovfjxwblwiccuffgssgddnqrbrmimtwcobllamywvbargfxyzdddttwwmjgbcddsgpegbeeyfernlo".toCharArray(),
                "nlutqnomlbxsczvhubwakaeoakvsxgiltcejrswdvtxzvshpvdrhfvygftafbisvnyeeqcjoygntawkycbfhwdpeyplaadvnbbttgdhelxzmtjkxmrfk".toCharArray(),
                "xwovozvocsdfwwzcbigphfbbqnacgfmdedbsewgjrjonhprlyzafediwsjyyqmeurfmwdufufvjnlcalbaqhfbdxkdxaqbxjgjfkgmglisavuagwcydh".toCharArray(),
                "zjglmeoeflomwtycigosyqnvrvttvydvhjgupwyvhmjgijiqpykqpzliugdpegmmsvihriezvnhfwpxoqhefgrpcxstbzgptbxaugfvduckrujhkqlry".toCharArray(),
                "cgcbyvczdusgttbbaweubqnvzufrfypjetkcrpcujwbcpeepakmddzycufubdlnhhzmyoqszmveezkvcwhfzheedjygnltwstiqjallngptizokxyrxh".toCharArray(),
                "vbkhbswomujhfbqfmduvsndtenrceojcrvlsnjizdriitbofekcxafseujgbzrdsmqmzzvbcmjlfkbnpnponvgrrszsrqxkcnwcmtdrgoenbfaquqgin".toCharArray(),
                "obegbxatumwkkawefpmvtzwaamvsudfjglrhirbffzpqbnwididyhazhowbjbguhslrcfujmtaewoaetkhtshsbwqdhrldzfqqixktkfuodkrhfboyvy".toCharArray(),
                "tzwjcfdpicvyufwgyinsyqcpxjtnioldnjmropjwtexnjvvjdicbygtxsmlacydsirlyjuxcausjrnvuyzxyhqwzehbhhebrymqhhnljjdvatqwtptrw".toCharArray(),
                "kpyqyzzggaxenpnwcyfneanzsjshdlgpbefzdhfjhfpuucszbamfcagvjycojkfmonmuurfbyvytxssysefvglqslugxfmjtbvpvpvypqwinpcohjtep".toCharArray(),
                "huhuporucbpfyfapayfsxpfostvbpcqywysnomjspbxnizfkxmcwbhktdiwukpuinmwdahxpiufqtkaswepxmbtrjrntghettcywjvlurqmkapfytwyh".toCharArray(),
                "xtyhklcruimqklmuixoaoamqprrlppsnitwsgalbjyrtldntadvqgijxbairpbgzwctccfdndwhozwjcafuipdfqdojurptptpryuxlztspvraztftbw".toCharArray(),
                "xipawyxpqqgjhyhbxvcsprpguozbicyhlpjjngbfzhrghakgvmzlgotafvbpxbwiqfugovlneetmfdscstnyijapebebdamthibxdnkhrgvylobdhqdr".toCharArray(),
                "zdgdhmhmmvfwdhtiwgpponozbrfkhkehommxzvjnqojvxfdvnvnbibclujxbubkiqzhpuqcngoievobijolrrnelxbptfzdvykkvaoigesmzgojpcwiw".toCharArray(),
                "kohjqwcvyfqwpctrqbxxukwcyiscecaqrizjgdgekydbawssaqpwcoycwseavftopuxvydckbhmddgxfypbadacbsjdpqwdhrccrhgbknpntynywcczf".toCharArray(),
                "ediymloeitlbwqsfwvqmlfhlshhujibnmjmavcffvsitiazhxptkuavnhfjtnlizuucpyhwuzenkgoredkoamkpvpyoejxeetgvspsoqydafsrjxdxxr".toCharArray(),
                "jmnandfwclcytyskqgaqldvdwebaeatppiqcoxaqidqdbintqnjcqfhnliprlijatbehyezihqlkaydtnpxgwevjpmdawmcppgwpmyxwokgqkmjzdghz".toCharArray(),
                "nckcqnenbgcqobfczeypohhavtcabjbomlsczwraewtszyxadxptgywdrydthehvqaaryrtdnmxoluoqsflaejevjhqroyoeaoxaiqdxdbmqxagrgtsm".toCharArray(),
                "fyhofyfvywbamyaupguujgkgisaqlscsqmhxmovmkwmxvotmungdvsmekmwxgzqylxvxlsjwpxvmnoyiegnzybfinchtdxroupnihygyvbkirksxqizq".toCharArray(),
                "jeaxiislfmbcdqkkoqjltvwkgqkyyjrkprjybbljpnlsfxfupqhildutweuwplgfepdgtqrkdedjbifsymalswfqdbmsmtxskcaftrqyvtjydoqddsox".toCharArray(),
                "pvnuwzmkumdhqfmjxcisvrtaijdneukvrxpqydavrfcilorktbeqvxrdjwqnqciibxyzcawuiacvrvfkxjashtvsqnfgpnqqmqrorokbqmwhibrhmuzv".toCharArray(),
                "nwndlumahesvvjmozwpqlnzvqrecndaabngmiuoryiptrbhtzylmlkjbdngqsgtttbhdvxxvfmpzpysozfdkrmovcunuciqxjzbgxaeemvdbtxruewhw".toCharArray(),
                "lvtnrgjtrzqcztjytpehkikfhcamahilcbyvjkoajgdkcokvfpdpznugrusubcffdgcpqqpbzuobkyypnbgmrbvkvngzqogvujkmbcpaydblcacrdjgw".toCharArray(),
                "kbjhqpiidpezyqnzudctgfgkhientkjfnupdmxorostmkgoflsasxgehqiumufrhainogbfuvyjfhzksrkmqsrxjztxuzodbxqpftwboxmuelgyetlxl".toCharArray(),
                "cwwdqtzpkfsjxjorfrfeebkrkjwduvqyrpdhkdyuiqffzvyhnglrhwitfgwbbpzteccohblrtqzvoxcbdpsnlcgsjftmuuhazkoinbaiuzdiyfjcvdpi".toCharArray(),
                "hxbscwfwtmwuyncnqewkfzuehfieizmswpkzorxheudejfszmomrpgvwmdawepobebassxbytgdeoxgansrcapboubnzsdazectzbvxxdabrzhrmblpc".toCharArray(),
                "cqswtfxmjznpbgofdmchodyolsaodrqfhlddqbrbaetekhjovlxmqvadncsqukxdvbimezpgfikssvinifzzabeqewiahgfejosnpitxqgpibzymexng".toCharArray(),
                "brwhqfhzlmdwcwjseerwkghofhalenrhgoowtvxgkbemxngdrzbehkuoruzyjrfrhuqcrnkdoosnbasuauahguwyqvwbodtvxjxrwhunvmaynvvprxwx".toCharArray(),
                "ssviqtmexfawqzpojkbgyehnzccqzbpttnelgqqfxsenrtbaffjgjqtkuycvbrpuevgnlyukqyxjsamxfvdqlzahzccawrwcmepzcmjukiecjqcqnhhy".toCharArray(),
                "ijfjojjkbgopmgrrsclclrhwhlowuvwdhdmvnyhqgvhsbyjtdxyoofmyqaukyrpfucchcjxiefaifmbijzyxgmvwnsjnjasfeupgfmojtprbdvlmwkjd".toCharArray(),
                "whblbkaklsrpogwvvmfodyrgvdsspexnnyzolzawurnkylgtynjdnbklecdtiagvahjljjjfdxrbkzwkohoeiypocujlwsiwbsimdrriqljbkhnbpbfz".toCharArray(),
                "buqgoztktbgvvohzibhymtzycnzrqetuajaoityeuhzqxirfjaexvfyyuzrnekhevhvecviwcjoarhhdklcftcfpczcillohujnwfxtjgjjzrrebejiz".toCharArray(),
                "lornpvvahkjbvwyattmbcvdtohwvqfwevnrkjpmsbwtwsrzomlppiskzchwuosyjisvtjhlkdeiwyhkkubbdwmeyvaujuvucnpxywiiapqypakbuldzh".toCharArray(),
                "rdfmfcxaxremickemsgbkeskouhcxijqorcttbvssceaeogsinwstofkkomjwxzkobgjcbbwdfyjvfcduyypofbztpipnicdlipqjqopynyvucbqcbht".toCharArray(),
                "gjsbacqpmutacisoagfavfwrixhmyrfgczhcezsqulsyvkoxrtyozugjtpxtgdzkegnihfbdstcpeqmxmklngtwzltstytedbrnjyomskohohvnvgaio".toCharArray(),
                "ueohziaacefdvsovjbnvrwlysyvaadoujedjnelriqwgkldtorqfnbgfzbfafwwqaazpgkiqcfwnsaigtzngavoaxvcerauucwjiiszlzxarzizuhobi".toCharArray(),
                "krkhooniojctfndqfcdecdxdlyytnbdxungidtqrcumkiqcnufuwitcvuaqhbtgvimflhyflsrxahzqcgmaohcmbecihwqegckslixzcowfwwvacjatq".toCharArray(),
                "fhujjcrhvvoxhglrfkutgzrewrjhuezzltkuydetbssiadcfnwawxscvllcfrbgcvtzvwdozxgizkmezigvhyackngrfhahetizpnnrmwzlgnrhvyfew".toCharArray(),
                "fgismcxvchcvrbmfrdrnefvrweoujstqadjofimjroejrtqiyjxdouwnbnjkhcdkioypwkzqafzsyrcxccctyagznpmxuphcdhrbusruysowlrvotzhr".toCharArray(),
                "cntrefoawvezfyczqutooinabkoukvnokifqnurlrvkwtpvmjrazbnzcypykmnyywdplzgxtdjrzynljgnjhdilbajnmwnluqagsidlnmemltzuzndiq".toCharArray(),
                "ottqcicbvpvnrbfzgsptxdgqdassgaiwudmylqbggxtxabzhtoasrilwidoqfyobbacorduzcqwdrvmmloffwsdgxsxcslgwoikflfgovctoafanthsp".toCharArray(),
                "zwvyqubkihgwrrdcyjsvnljnsldntveutatlwwwefeawvfavotqcgbrznwmgurcntvbrtzyydawbgxwwqpayquzfqmnkfqyanbtharhfsegyddwvsxtk".toCharArray(),
                "rtqhhdsotsqjtjsvbzavfjtimrdgoxsfsinzohnjzfsuokprmrmrahcozfwneptyzixnpmxqrrkicbzoumhxtjnsrkivbducltscipubgejkhjybvgaq".toCharArray(),
                "roliatgdwafjvxndohhxnqhuzixwqyphoaqovwrryycvwpbkyihlyrhazgypgnwupoikkbdkahgywhkwpujplsrkzqbffxavokhymnjourmtywppqzgd".toCharArray(),
                "rynsoqytqaqemaeynpohgaagzqvpretkcidqbdlrfevrezqrpeaxhbegtbxmfqwhbbzcglvlpqdvrvoibogirmomnmyvexchaelhrgsiyxdqsrauhgcz".toCharArray(),
                "stnihodnnhvnniweprmnopfjigdqohrjcetjsyxfhutvcrztimjzdoimwnenuvwxzrisphxwdsrgmrbwfkvkbfyzscmnxkmxburqcqnflgnxxptebppe".toCharArray(),
                "unensqcpdooekfxoykujqjgqazweqninbmctfekiuzogglvexrnqavidxehnspcveeqjkctgdjnkviquzgmbbugabpqtfsqlziwjkpsoyfavpqsqyeta".toCharArray(),
                "zacapsvwlnhkvdvhunvvuvsjokzmrtoqvrsklpjwcqixwggsvcpqzibpudclysbtlvfxkovmhglfmsxjwpbxxdnrirfilidxeiwozrdixqplkovgdwga".toCharArray(),
                "bvujozrzhuynfuegmhqlzfxktssxoyxsttbhuvjcrhrwcveqeubezyqtsisjhpbclemfzvjrcbpgywydqcjsczlvjdesufvhjhnlcwegztpyppbirmau".toCharArray(),
                "nnpwqvpmamulvjwzfaffwwfnmivduvzhiofajwplklzfuxebamiwinlwvhcrebapsgpdegrprqunnzpnlzlvnxukgwckzczrkrvrxogrecetbtjovumi".toCharArray(),
                "tguzewmdblxnesecgktmpxhqtqhonvygdsihrumuhjhmdmqlylxnkhgfxptkkttpobyfxkzguiuzukltvkggrolrdhbpcweqzcxwpyflhzkbkxwhifpb".toCharArray(),
                "tdsxmwoosthsxeqmfvxmvkphhmortetmjllvjajcvsusxmhcigqfqfmytcpmgkbryomhqyjlqfgpsptcvjhmrvmkxdxgoaxookvfkhsaoyqinjklvrxm".toCharArray(),
                "olwmovsevpskbqrlxjmnkewzngkiajwoutalospmkkylapxzajmknimcrwntgjhceknvcfhopfarwxsyggjvrvxitmbbwkeautvzyenplnihkcisjrpa".toCharArray(),
                "onkhznlxxpaukvtlaialylvknddywsamhmvjzgizxitieotgyvtwiqhwvmwrgzfolbzlhhmhqhpwvicvfvsoobmjnidthijvjkgtsuaibreybitgfnwt".toCharArray(),
                "oiddtgzcqkxavfvnzxxaodyrluxshuoyetbxbcarnztifoxeluhbzhsmbselosjunmsopugevzmaqjhdfqfexzqbtwmjrxeejytauzepassqdzuirboo".toCharArray(),
                "cgryddhuanymlrofstxtnplrofbfiqvnynlbssxvgwjtpxzkswfgnqxbyaigsftrugunzsihqrafobrjzwpmnoploztjfpazvuowowdepgmghdpjaevn".toCharArray(),
                "unaimvtrmttiqhgegklvsxdbaskayipsvpdhnwbzswjkfqqlabjuymvzhibhqranifwvdxxxvghbwymybxsamqbvyecovedgjzbpxamshuvfukevhyxv".toCharArray(),
                "qaqofteaxhgjhkygmmatgwbcghaphxlyybmfwrhwaofhafnotokcmlessehzeuzeymjufqqfgxpiecxyshaeugymngnrcnvabgvgynnflcprhmpzvrep".toCharArray(),
                "ycdlkrepgbpjhmphaemnhceqqwpopvdpahcmagbihrrqfiyhmmuvqbljzdxoyceyjgnlpotyfkrnupuhdpewssfrvehvglwsujdjxzjflasgrmpvdtrx".toCharArray(),
                "lyogcycilacfjgqghalsafysunpxjixugndklhuxhxeqfvymxkgzrhtlwklfsiaavfkjmfgtemljhjxgvdinkbahmnogvohtvtehymceynpixmossyfc".toCharArray(),
                "ailovawtqdomxsvxeyecltkigbbyzicbqqrosohitvwsnsstqwvbpimxjpxizcmqsdektnunirfvjzqbxlcntqmefmnfobxieduyqqnyhuvsultryygs".toCharArray(),
                "ovwuhlzxowhtbdtrtgrdcovwzpqznytbtsxcfybuwipxniohqhksvhrwwjwlhppdhofnnjjjtyhhgxoyfaschlzguxteokhyzonmxwxrueyceoalqunx".toCharArray(),
                "gofalzgclnakenyblwufaujgklraffaltfohgulskleqadrlzosbkbivmbvrgxfcfvllrwfbjkrjplwqbotlrdgffewnddpiycwqabtjnnueyqubgqmz".toCharArray(),
                "tveybdoegdphilxiossefoifffgnvvnosrptwdzdiqmqdlbsdvwjjgqolxegurxmkofjrgmbzyucjvuoqsxzzoqmnwvhpstzgaiziwahwukhrgwjbvja".toCharArray(),
                "lboaxjhmbcnjeyinulwthgczpaiqwtsjugktqtftwvdatnppymkgsnhhnpxllpvhyfboaijwdozweomcawktlrczjckuthbroehpntlqhknlbbqbzcwl".toCharArray(),
                "wzmfdybwgequlzjysxocjdpkgfmiikvgjhlohonnudkfetdxsuzezooiwcqgplmauzpbpcrlhbrnwwkrslvuclcaqsgffufbvwekavvhyoxxnhofvjzz".toCharArray(),
                "wbzmvhtcbzdwvkiwfffgucdhmrojcqiytjnrqgttfzrdjzbqeiwanbjzsykwqsvjbictowmwvdbeccuiktjzusynsklieguhqwahumfprgvviseulpuf".toCharArray(),
                "juuchgmloithftozitrzzmvjebfrqbxbytdfzsqqajxffnhngaoholstmxmebjgzdleeduuegtllguamuovjcpeqpqvqcdpfqvlwriazbnkiimwcdulf".toCharArray(),
                "jrvyisqkvfrocckummtqzgyhuwmxszceryczqvjocccfeobtawjzejjzhvwauzelzikrdvfgxjnezoxzkizpriqydmaznglmpxeutlcsxpwwfvysdxjw".toCharArray(),
                "hzvmnxlbewpvuvrphuhglgerbclhbudivawiyijcgzzcuqtdkblyhqpkucrwyxgtxfdxnnzvoyakrtqbwbzftqqoujmsiulgzpdoefkufmewhuaeyzlr".toCharArray(),
                "sbhmntfvosdpjjepoojtcqsjmspktbelclarhfpxzsmjbqyrgkniafumxjzqkdepqegxlxwmqjvtbwliiasifmwewvwgycvpgeotblgtwdpxbchjcath".toCharArray(),
                "mqnknjromodustowewpczeadghoijiryaeipqbdeqiykcogikylmclrlufvepncrtmhjqkngtosxczfpzqdbduoyzkerziisupekctsxhnummbbnseqv".toCharArray(),
                "afvbrzsqhbkesqqwklvtyrfmtiznopkqwgsnhkdrnqvigneqyamwrtkmcjzsbkjxsblznqsbgpjndpfdprcjlmvpyxhzjswbvhcjavmgkvvpmbtesvnd".toCharArray(),
                "jkshjcgsudvsmybovnvhkqxwrsampprycmiloogktbcibfwystgekfddzfrovjozvwmjnsviuasxfrwakcewjhciptwmcmlxlxiasgimgdlluhnelsdu".toCharArray(),
                "bfeqyacdppcaplahtkvzngmhqaoburyxycqydubukgwzrwikidlwlzfbzvdvmbtmdlnifoerwasnwazhfmdrmksngxjuyejepwmwmrojtgyqjyzomefy".toCharArray(),
                "oamuxxrwdaauwoqiherbnqtwqsmcwsbmspjpmanrcplygbipicqxslvkfhodzrqtgbludylfqwdwanlkpehjrctxjiclzugivrcysqdioieqypanvhxn".toCharArray(),
                "jsmvcoielomggqhyimgxxmnvbokzxjmjcyegookzcwikppixdquackxgyifxttgvrmcfaofdlnnaeyxhqukvejbetibnbkkuwozxdgcqvrszprjilvdr".toCharArray(),
                "ggxaqbptlznhoogtvijqabsrudzgaezgkzicaxvnxiwnxdgulpknsehmjgujnwszvacvyxkvggifjqzxflmzstlbcgnpcfozfqwfqgcymkdyaevhpjgh".toCharArray(),
                "dujfcwugdifibbqrjspxduvfyspncxxftimvegbjqirtljmucduhxpovidlmdktwsfsynvhdgazrklompitozhmjlxvqhombvgziegokgndqarcpbveb".toCharArray(),
                "dqkqpigyyuzudychgstmfwdiqfxtddwgvjymrgkpallflqorihgqgjyyqxrtdqbyzzlqfxhiltnylcstlylrhjrzhltkbwkawxsdvzniubgffybswmmf".toCharArray(),
                "wdhfoarrwdrubjaylngfqonxpoqlcctahafycypachxdsxddkjldzaaoqscsuxtexacbzrbdyaitxlwkwjnvjpmziouelniknkloeorepzxmkuygflep".toCharArray(),
                "dqqlekrrzabpmodscxxrwugjqerwsvnvnditqbkrdngqbmiejhxfcdoskgocddzrhjkzkxqokzgmlqsuypzcvqufyljdqkwzvjyhgrxsqdebwyxwoyyl".toCharArray(),
                "ouqohbsylqxgzynfrnyhqekodjmthmeyjwmqxgqixqqwqfehseqlicbnloiuaoslkhehnurmmjleppnjtdwdhytuobpqqhccogkecdspndvesjpnmmtw".toCharArray(),
                "moqaphqhrsmhayldbesqjnueymrlymjmabmsjebaznhzlvcnbwdkmaokmixmugyximptqqtpecrpxteaqknekboylmmiukfeyuxomqgqvziusmvkyiok".toCharArray(),
                "lfiztwhniosgirxwifndexxylujkezuqgfpzbynkmhswypsiuhnaenzqhkamlwesbvrdvgphnhdoxxytfmujzvbifdwqacibxaeugvbwdgmcekvlyrwx".toCharArray(),
                "myitbgkbjsfiulddhgbmpnovzlgyfcxrcflgoxjzpohmamphvsvkfjfewlcbpctuhgcxdlwucgicuzlprgzyrednrhpjjkftqhsvuprwvcypblhtrgri".toCharArray(),
                "nwwgglrrxwmnffkaudwrfvihipcaytklsityvlrsjefpjrpfxnwckgltwnvujfhbocbjnsezylohdfoaumeftqyrdtnmaupqyqcmlgnjrdtukhweubjn".toCharArray(),
                "tjewctlfnavntxbgdopvrirbqqimrrbmbfkfavknyiatfczjsogkzxnrnvdgpessldxlakaasctxgsizjolkoabdygknmehzjekmqmmkqgixasyjjlvx".toCharArray(),
                "nyanemcqtjpeqbqgpdrglbflvfxeqsdfrgtxuvqpfhuvlkdapugcxlovsnzihfqyljyheoxlvrgidkjvgrxgflbxycgihwguhgcnuzzsqfavrlqadoii".toCharArray(),
                "zlfannkxlsrsztgvufpmmqigdyigmsoodwqsjapxshrtcxpxeeltwtbasligdzwgvoygqodjxvebutabamwwfxyzihilggtdvtjljpwgkbkgwkhwwdte".toCharArray(),
                "crfkanxguslrmvcvkbewcocyymvxpqdujiekwesswejibngnokjsanrazozrgclplrbjvwbucmcdzkqowbgwozxopwfvzsnmjqvfmwzqkdtjolzkmgjd".toCharArray(),
                "hirxgyufqhtbyoimmhdwnygdmfpanydviwupuowmyqoyewmtgppvqxycfpcuqgryclnzcknccbagambietduqdyxucskijlnxaobkbdmffvhryrxrwti".toCharArray(),
                "bthvwziglttitjjgnoustrbmqskhofrpzzmvaublpxvliervunpnfqaxkmgararszenbarnqqibypuwjhlxoezlqlureuixvokwpdlftuiulcqwlbvah".toCharArray(),
                "unyhhrmdzjyqvvfzimucuopyemjijlrezpligzmiikyehffsrzunomnuawejkwnjlbtuafcjscpbhutytqnjcagcykliibtwenqeuupmwgqfajfwbshf".toCharArray(),
                "unhsavdiywgclwigsauqgkvjwahxsqdmgmhgjkqjixluvwaoyweehcpfcyevphjvwqdhatrjsefqaheydkfmmwrpvwmkfxfboijqdcbwggmhpshtemft".toCharArray(),
                "jzkevyqcvxglfrektfizowidqqyveeopdavaylctiihpzlassiugfcmvsksxqiovikxivaegklvmwvgogaxndlkxxdwonllwvjeqjiwvvuhrroixohkt".toCharArray(),
                "svrraphnatlvcsoncmkygsryizxyiiscfluhabwbwiyyaoncbyajsujavhyersiydcfggbjcjhdlwqqzqsiimskizjosdwqjzvphyyjkhovfhlexepiq".toCharArray(),
                "jsaidoahlsqmnhtlfevovtuceabkpjdycfifukohcetrlofsucjrvftcfvmxerxixiqtueazlvqylvthaczvjsxqpmpwfngcxwxrdxsqulofijninmew".toCharArray(),
                "gdnwpcuvrazozxicwcsrniwwslefxicgmredtyalycbzblbxovqbenxwacdymfgawkesigdiigijslhihzjnmjlpnonzwvcufgmporzxyhgsvpaeplrd".toCharArray(),
                "uesjshlqcnljvxyjrygrhplegnixybdvfveafrqjebtzbtlurtlbiwfrjoojrrexplxucpfjryiustolpzoxxuoikfrdwyanlzhppnyinjchesvttjrq".toCharArray(),
                "fhyrorvnpxaaziqoxqymzcweurxncqfkadbouybmwcovmellxjzwlvchmaurszbuecjadmmbqdyejjrgurdhmfobhkscjvwpzhrcugdmjbrsmizgbenq".toCharArray(),
                "ldrvnlxwgvnhdfkzlpluteofpnoqrdgdhzaumxtuugcxnoyadkwyqlefyuysxgxegxbuwupqcrqqfoqkapjrapyajwuidrplqqfmkwfmpvewlxhmmsdm".toCharArray(),
                "hbosyjadcpqtfxhruoejjkgvhphthmhqnyinhisjaiehgmzcaflmptjxissrechtapjjabscmzjslkwnphbhdkgneyfkcoeeenngqikchtwseshvcjcf".toCharArray(),
                "viuajzkloqqufdcwlmauhxonrwjvhncewxefyrsojikpomnbanwkmkxgiibrwewubabbttqdeauunhvpwtzjgzpqhsifwezzgabcwrfatzuiiryenznt".toCharArray(),
                "yejiztnvzpxgraintppmqlvyfvesusnvywdxssvrhuzbujqpygbqtyqytvqqpflpconwiknqgnrawjpxpsplrgjmdccshnhldwhmixeomxqkghjyazjt".toCharArray(),
                "hsfkwkcgxlrdibpqavhmsxyyfiwfjhaqafayreeppyuxzlqbgxpyunybxxigeiwgqyfhclyujsrkdjllialdomgljpupxswnrdxvqvpaqjkvswhbwugm".toCharArray(),
                "goapduhbmfqfipdansadblawjjzhehukvwczqjceoumykpyxhbclocjxmigqpcckyglqpnvfkjfuygthhvuxxdullabcdgpdmcuesrlcarwyzphimcfj".toCharArray(),
                "hbvvdyxieomtrgxjxknzdjzcagkokrxssunwtmezdquuytfvesuhdtmfcytmqsgkptgkillldghczozfiwpnrbutbpirhocwkkiuxufbaofbcehkcyzu".toCharArray(),
                "ztpcizurqyqaiywgsdjsrowvuffzdgtezkgjkcaacqclrytjbeesuapohunkciqbtymfbmfdfjqwhlhkrlelntaupperawuvvgayuhdzquxzhflzqpkg".toCharArray(),
                "kmazehsedmbaubyqkcscypbhwogpdtvnhvolcgriusiqvhgflyhjokqkyzbduwsbsgpwogeibpawyhejfnsvakialjefgyhahwwvedgfsgespkbvzvqz".toCharArray(),
                "faatkgysgfsndqlkvtrpbxhrhiohdeilhkersejzmdoptbzrutgwqopyydhejrpqevhwzsxlvodrpeimxqiqexqdczhlqycuvjtwesizgnsytaktrujx".toCharArray(),
                "tzcvylgolilgugdyynxhcqfvsrollxjewnzwzhnkqytmgykeljlpbskwjbhuasazgbvhjitbimnomztzigokzzgkcpfcihbqjxzsfsvqhketjztrgjdh".toCharArray(),
                "ilrmbyplgqbppajvuendqrxzrsszbwimhzykypvggyvvagsvmfyczxbsrtrvrbhbahlaxhgfhdaijvfvcfxdfavwuornpaoskashjboqeoaolflqnjts".toCharArray(),
                "jpqfdktvmhnwjffsitlnkldvtolgzfalwqsbcnwpvjlgrrzzkkowxtsqifyjmauitpkvcgmzsyglrfmdrbaqwujgzhqoimwdbiyerldlllwcsihjljci".toCharArray(),
                "dlofugtctrfwagattgeeraikkpvwbxgekwlfdgjwyrsaxvtqdxwuzegjvehwbndokotnvclvtfvsaokfngamkivimdeqsjecaxrvbesxmnpodauqguct".toCharArray(),
                "cxbrchhvrlzrkrolxgkjvayycsokosfspijuqqpjdocnhsbfalqvnovrglcudhpsqymipdtssxizpjgrwxmknjbuufqxpfrhegrvjkpbhxdyilpfkdry".toCharArray(),
                "muugakdpsuyyapvkzkniisiqgxxqaoomjiulvxcptanwrkisuvaeqixyhuqhlfvwpphmoldjnsfecnwxlyddgabnxrwiyteqineyyihnanrdcncnlhqt".toCharArray(),
                "iriflgpjzvbjighioqvqfovibzvohohphrwsxnewiffsnocbezumnpuqrreyhnppenjbanxivecisemyfgksxgioaomjbdyfqkgqxfaujcdbgrzlzmfw".toCharArray(),
                "upludzeedejtormowmkfppgxgilfwqeqgrnlstqvzbrotferroxggfgmprunjyepptbhotfnwydrdjjwaidgpluhcouloadftgpjzwxxuapzkyvmgasx".toCharArray(),
                "lmepdzdrzgxvoogpkdmggbfszcehfwfqklinklfmtejhspwevikbmrtlvzvavctfnbtaoaohgxoyomejwomihhwcgtddvylkzgkngywmxmmoyqzwgohp".toCharArray(),
                "vfreawhvushvyukguguusiisajrgxyxtfpxflgcizjdzfogawcurlejlnculcrghifowlqemcjmhzujwwdnhjyvxdpkfisprxdniwtvycjhedrabwplg".toCharArray(),
                "pgdsxpyfhnyesnooglmlwwpznrdlgorvuwqrloyudzyvopkxcyizuzajqdvyrovnllgybhtegtauimrnkbmfcoqusnslcqznbfldmehuyjrivkvgmjno".toCharArray(),
                "yfjstddvtcixkvawajtatkiqugyipnzptkhmnljjptgzogyqrrqmdbdxjbiyphqkrxyeihnaavbodzhvszhvcmvlodmfmcrdzpjkwzmyunoynvthvcfx".toCharArray(),
                "pclffzmrbdwcsfoqeaozoczdyukvwpulrfsyeerhhpmbvarbdfcrkbuivgfuyzhrhasnglxqbjrwjlzmscfcfbmbkrxirebaetnnfkdgvuefhdtahbcn".toCharArray(),
                "cpominwbrybytrlybogzkmesqzszcwmfnctwpszhqbfjsqkvgsuqfaixccwebjlolfmdxmkpprahjmepfbfkbqhfsfktovkccwfbkrszitirfnikonwr".toCharArray(),
                "dfxwljrbgbfjymmkdfknasghfouveqphwofhzzkfaqqacdlikvvmpetxsnuygjiczplyovernwrqbeylbvxrztouiisouaqtsdsgbyxourewvejxajqz".toCharArray(),
                "cetkooziqrcixwpyuooohvmdzwczfsbjywvmkwxbozlnxclrtzhawwfwshxzbykzvfohclismwhjyscrtjsqfxozhlakkkkhsaownzozvxkvpmnkxhcf".toCharArray(),
                "gsenehyorkxlmlhzkxafukblwqytxayftftzmtpffmtrxaqiyqpucsgyiethgunbzicndruidnzdorlojcilxqlfwepfyegzmlmpchzguyjkrwaaalnx".toCharArray(),
                "byfacwfdancoypfbyejueuhvqhxsskqwivwmrbptouhpjoqjsbdyvktnuqfmcvikseylhqgyknnvdfexgjvdwqqqivcktnwltxzbnfzxvmsytyybjtef".toCharArray(),
                "muvupahkpdyiaxjpekmzwgargysqtwxfqvcixjsmosurpgguqvvpdxgmvbcrxzwqwaatjufancrekzaawwratamrbqiyrgqojqhslpuatlednffjdxjy".toCharArray(),
                "xxpynzyhipvrheluvguqtztigzsjydjvbbvqavzkkudubpoyxjpskibqjvbjykgblbuoxtajqedtvurudgmnrpfckimlssmgwguvcugsamnvgepjneyg".toCharArray(),
                "tfignwrhrdnpmjmqgsigevekbttoztwtafbndsvwxkljuxbcsjiwgmhkicahyxcyedmhvjgvvterrgtlrehaqokatmirjmpnqdxnodikwpdpxxaqbiqt".toCharArray(),
                "ycutpekaqcoihlwyqgimvneukelnodhpidizjvzbznkiaigqoodmejgonreexnvfqfebadcbtmktuqklhpxlyfbnxftwsobkwhlwkqafcmzzclmlcjwc".toCharArray(),
                "oyrnfnjybmkxtywgoylqkmrozdadowffwzuemgcpsopmmnualftvumlvqlzgkglgfgkrmojgfyurlouwwntszenrsmyctliytvshlboqzkkmzekvtfpu".toCharArray(),
                "jcmbpmdkzokvlecyfspgdbuehebajqwvskyjyctysgtfkxdssuyvvtbezcgjsdemncwmgrmaxhfkgjcyfcvbvwfxamgsrmhgofsxwgxwpfgwokutmswk".toCharArray(),
                "oehpsnjjbqppvkousmsiraehkacwsbijhpazelkfebxbnlvgznqspwzzyeytfgcmyenerzkvajxquuywkoozkqziuzdbhhpflckfbwadfxtburzehodt".toCharArray(),
                "eeeadhblpqscuehxcicjhynbpmfzalsepwetghgvxaxtfhshpvryteckqjjtuezkcefinlfnlfgsmzcbwvbpbdbtnnmhtmtvsygfllszqbrcctfyqhpr".toCharArray(),
                "mslzfxjalcwddelopfnighmkcsitbzkpuxpbxacicyofczwtgjdnqqxtkimnjycdwtfttjdyhrflsbgzlkodcnwovkbhldmhzrcsafqjxywrzfqmreqt".toCharArray(),
                "sohpzkwmpltocvjfcbqbzptzullnqdgkspbtbafqlahpxqwzrnbtcwuyhflzltjdknylnddydkpccmbuzepdajdkqojbjvgtiegxjjvowmqyysuxyjcz".toCharArray(),
                "sfjjvumgptzxxhwhtrvpempegkcevgfomqzjllqcgrcebynuskjywacekglgnqwbjxkwkcyrwcxxbkrvucttcxxpeixtbvumsgielixhnueqgvlbzgwb".toCharArray(),
                "dtsjepchkwtefdlqnizaddqjadmzjicnevykmbrxzmderowezvheaxnadcbmkebqbaanbtmcfshwifdhdkldjbgmdhzplcioeichcqkjitgryjabvohe".toCharArray(),
                "pnruusliutwbcaigtspblxumixpdlwicjbygtjopfmqjpzpitglhegtofisqfcuqdswydmpizitqjkycrjjxrclwnfosjikochoiveswmmmvwkxpwjmn".toCharArray(),
                "namahaurlfhnowxjaqgmcsjyfiobrcofeahmdcfojmdxibikroyvjhvoqlrjofqsiygnalbjagikjqvcftxqbtetexcuctpmtxztjcellmvueqzjmwbp".toCharArray(),
                "rhiyemujhjvahxtsbzfmnajstidfgfuameyrqucyexynwuhyvmmjoxbhhgoqlkqaqqthkvhquhfrdmrzadkrdnaktpafbsfsiabtvklprrgxfzyidizi".toCharArray(),
                "vzsoqvvsncmwcprxzepsvxpdxplcxkkujclczgwnlklpzenaiesebkjyzuazektppetonpdyzonyscabgthkfqigmlfqxzhmfbdssgssvgspktstobdt".toCharArray(),
                "tnbfahxygfmlipgayyuvgpkrkdmyertygufhbdhjivxslfuldrgmgqfqvrqcklcqfhzjkguuctopyjceciqiavawmsawdcoklovwwssylhpksroubeec".toCharArray(),
                "zganyaldcznpnllkdgkopcajvqfxujzvrzkpbvsfxhuksiwvojmdlmogdtfzcexvfhkifencnioiqndgwrlhezpjsviwbfrjpdrwjfywnoefbklxdwgh".toCharArray(),
                "vwsnrbjuicdzfvvoavmpktulfflibrswpklinudywgzdbvtdqfscamofrbqsuiqkubskxxivehahetlvzdzzqphjqxclhuxbyrlvpvtvftcjnpgotgpl".toCharArray(),
                "vwuovybctyerrroinhdsbidqxkesstdnsybnyesrcwkwpzeciiwlsabrmhkednrvnvkmzcfeasaqtgubotpitsahakldzeapbmddpkjrcjhvrezixoqs".toCharArray(),
                "iqzickneqptscyxriginpskgwjovzhnizmscyigoxbizzfsjlbwcvjltsbouibeipymngsdevodwvwhhzglwpwpjafdigjsxiemqyruvfarbyzkzhvvw".toCharArray(),
                "umfurlezuzwefivgzpbhrvipwuodrlzlxghqropmpnquvlaxdeeubomzkacbmdpljwcbmtpbhhwevybyehufxgehjijxnyixwmajgpmpykttjxtpeove".toCharArray(),
                "wblfmwezwnwvbyejpsyodshmpbbvryzncnvolznkomfqmlzcdasguzujcygtwijaxeqidgssszkgkliolauhcpqgnzalhloepeoukjoeialtmvjzwdha".toCharArray(),
                "uzgjaixhtlnkpehcnvgxwtskpblnfunbuvlueiezvtmmxtomoxmmqeyfgksnehqadbxjlbigwutupjiegusxbtchdxwjemmhqjqbmbkixfenoptvlnsm".toCharArray(),
                "gwvltrvyejhwsaxgdjqaovpdmkaxyskeqhqkznkfwtbqvawykmbyjsdvddvbxhhqoxcpmmuihxydyubijeisxoqatldrskjiilywxufgsfjqanalrkfq".toCharArray(),
                "yvquitncewlohjkgfrmxxwpzlpkecpvcnnwvhjynfjdmupubjhzgfohqgtwikrkxfjvostdaeioazjbiscqxrxpzslhdftcmexczsfzwppyoacxsenrv".toCharArray(),
                "niuhudkbzpndopchwdfltezvgyokohibqeikivnhmamarphnsnantzjbyxnmexpuczgmwvvivhjowsdrhdeadnddkrrroinsjwegrzqphbffujwbmber".toCharArray(),
                "ohubylupvjhfhmlbndswfxczgyavbemsohtoupdqanxibkjonblsaprhpucraqjoxefuvimvxjdytmpgpcbqruzgodzrtihtomnjxzfukivdxklommed".toCharArray(),
                "hdlxilocvyvkkkthjyevjzaijlwxabajgngpyxtuxoghyzrjavglugtdrratuccdrlusknmhduodthovcuiwadbtvdnphpszcmtmbfvebmhwtxswrcur".toCharArray(),
                "gynbbaslrlmwzfibmgfnspjlmdjggezmcmpfohsgsgcslmvzscokryygdhojnnxrcmzqurwoaainpdnhgbuzbuhfbvqrloipcjfwdendgvqvzddhhzgi".toCharArray(),
                "tqpuninyyynahvzkzmnfhebijgpqfybyosubaicyirbpmaanmntvtwedevtjtwjjpflppnqxernttngfcbcwxizbeumztvjibwzqlporidkbqrissnqs".toCharArray(),
                "vpvbmidffmpikobvgrmquzsmqagkpxeloaoakrhrfwapldmtuzjqybcqeictfhgujvwtmemuamjnryglzqbxtfpzotvvabrlyogluthwhskzqskpkooe".toCharArray(),
                "tfdhzafbcwnamtngmufupptfhfxutlynrdwsebtiagioawxmscihrbpajmuczurqaqketemtkwimuhbnjjwcnnewzzazvsrvkcbdipzsmjhiqivzrubg".toCharArray(),
                "hhejgfiezbbjfdonupigyppqxmpqiszsadbiilohmqssvjhpypyxepnbdfumztebwhmhsaogsjansifqxdpcsffvmzjlupprwbyqdoxyzzlthqkhvbjp".toCharArray(),
                "gqlsswgmmvfkyfbbwazvznpjfbqdcbsltfdlclaogfaelbijbjedyvogwejbhbmajroldobltbsgfarglwlktzqsfbtochplafyftbrodjxiloqymcig".toCharArray(),
                "dayjdtxgcotctuiovbdakakxodvbhgjkghvmatsejngfjqthrwhdyuapxwsecbokkmwmfqqqgwvrnrygngkoakdzivdmytzifxumqkdwianxroehuovw".toCharArray(),
                "aavlxaxvtwfzwznmlqittxrklxthlqfnqcypcymyurxsskefdozwmsizpehcuoplrqctoprkgqdbdhgiwhgkzojqsssphkayactqtnacdddinjqlrwvs".toCharArray(),
                "ngjhzdwinyipdbfwqiywldeanxlgtiaiplsopoyengusjboajpwxsczhzlpvtqdibxysmwxbettowjqiyofrqeasrqnngsvjqweeubfzwapujhckvhdn".toCharArray(),
                "odfftusbnqnforjiuqjssambhpleyqsmuzupuotjgiquzbfvronjrzmyoafpqxbmwxcsovbwdtreuyznooyfnlgenltdiwqgwuzmrciwwzaszbgopete".toCharArray(),
                "pzkckfiueabaucolgwheyjxxmdldhhhziudtzlpdnsfhutsdsbhqkepwjbztkjssdxneldkyvrgsnavfccxojmnuponzzhsefhjskvqgmyyzzvgdzdri".toCharArray(),
                "qgffvshucbzhikbtfrbrqztrwzuvfngvwlcrfjnhmoqvarqflrzbsuuovojadpvzcasilipyyitzzlgkehnwbhmxxxzdpverxzzihrghzbiampnqyaoa".toCharArray(),
                "kczhaampvrgssidbzjiylrazinsgoiialhjliwcfpiahqdirosrbjsdrfvyvfgvqqfdadfhsqjbiojaddtgnljgtegqkpmcftghylqqdarmocmtffaut".toCharArray(),
                "jboqjecysefnmmlafbdfupvydrgltaecdsunyylrfrerfqrktvrompoqgudzxjdadapbybsduzvbromklfaywpqcjvdgejjhlyijbdpxekzvanfmsgmp".toCharArray()};

        assertTrue(solution.exist(input, "oajgdkcokvfpdaslnmomrpgwitwdoku"));
    }
}
