package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.EditDistanceBottomUpDpImpl;
import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.EditDistanceRecursiveImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EditDistanceTest {
    private EditDistance solution = new EditDistanceBottomUpDpImpl();
    private EditDistance solution1 = new EditDistanceRecursiveImpl();

    @Test
    public void small01() {
        assertEquals(1, solution.minDistance("b", ""));
    }

    @Test
    public void small02() {
        assertEquals(3, solution.minDistance("kitten", "sitting"));
    }

    @Test
    public void small03() {
        assertEquals(3, solution.minDistance("Sunday", "Saturday"));
    }

    @Test
    public void small04() {
        assertEquals(1, solution.minDistance("a", "ab"));
    }

    @Test
    public void small05() {
        assertEquals(3, solution.minDistance("sea", "ate"));
    }

    @Test
    public void large01() {
        assertEquals(2, solution.minDistance("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdef", "bcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefg"));
    }
}

/*
Test cases
Input	 Output	 Expected
"", ""	0	0
"", "a"	1	1
"b", ""	1	1
"a", "a"	0	0
"a", "b"	1	1
"a", "ab"	1	1
"ab", "a"	1	1
"ab", "bc"	2	2
"sea", "ate"	3	3
"sea", "eat"	2	2
"mart", "karma"	3	3
"park", "spake"	3	3
"food", "money"	4	4
"horse", "ros"	3	3
"spartan", "part"	3	3
"plasma", "altruism"	6	6
"kitten", "sitting"	3	3
"islander", "islander"	0	0
"islander", "slander"	1	1
"industry", "interest"	6	6
"intention", "execution"	5	5
"prosperity", "properties"	4	4
"algorithm", "altruistic"	6	6
"dinitrophenylhydrazine", "acetylphenylhydrazine"	6	6
"dinitrophenylhydrazine", "benzalphenylhydrazone"	7	7
"dinitrophenylhydrazine", "dimethylhydrazine"	7	7
"dinitrophenylhydrazine", "phenylhydrazine"	7	7
"trinitrophenylmethylnitramine", "dinitrophenylhydrazine"	10	10
"zoologicoarchaeologist", "zoogeologist"	10	10
"zoologicoarchaeologist", "zoopathologist"	10	10
"zoologicoarchaeologist", "zoopsychologist"	10	10
"pneumonoultramicroscopicsilicovolcanoconiosis", "ultramicroscopically"	27	27
"pneumonoultramicroscopicsilicovolcanoconiosis", "ultramicroscopical"	28	28
"pneumonoultramicroscopicsilicovolcanoconiosis", "ultramicroscopic"	29	29
"pneumonoultramicroscopicsilicovolcanoconiosis", "pneumonoconiosis"	29	29
"pneumonoultramicroscopicsilicovolcanoconiosis", "stereomicroscopically"	30	30
"pneumonoultramicroscopicsilicovolcanoconiosis", "unmicroscopically"	30	30
"trinitrophenylmethylnitramine", "dinitrophenylhydrazine"	10	10
"teacher", "beacher"	1	1
"teacher", "leacher"	1	1
"teacher", "peacher"	1	1
"teacher", "reacher"	1	1
"teacher", "teache"	1	1
"teacher", "teached"	1	1
"teacher", "teachers"	1	1
"teacher", "teachery"	1	1
"teacher", "teaches"	1	1
"teacher", "teather"	1	1
"teacher", "teicher"	1	1
"teacher", "treacher"	1	1
"teacher", "acher"	2	2
"teacher", "attacher"	2	2
"teacher", "beached"	2	2
"teacher", "beaches"	2	2
"teacher", "beachier"	2	2
"teacher", "becher"	2	2
"teacher", "beecher"	2	2
"teacher", "belcher"	2	2
"teacher", "bencher"	2	2
"teacher", "bleacher"	2	2
"teacher", "breacher"	2	2
"teacher", "coacher"	2	2
"teacher", "detacher"	2	2
"teacher", "etcher"	2	2
"teacher", "feather"	2	2
"teacher", "fetcher"	2	2
"teacher", "heather"	2	2
"teacher", "kercher"	2	2
"teacher", "leached"	2	2
"teacher", "leachers"	2	2
"teacher", "leaches"	2	2
"teacher", "leachier"	2	2
"teacher", "leather"	2	2
"teacher", "lecher"	2	2
"teacher", "leecher"	2	2
"teacher", "meecher"	2	2
"teacher", "peached"	2	2
"teacher", "peachen"	2	2
"teacher", "peachers"	2	2
"teacher", "peachery"	2	2
"teacher", "peaches"	2	2
"teacher", "peachier"	2	2
"teacher", "percher"	2	2
"teacher", "pleacher"	2	2
"teacher", "poacher"	2	2
"teacher", "preacher"	2	2
"teacher", "reached"	2	2
"teacher", "reachers"	2	2
"teacher", "reaches"	2	2
"teacher", "searcher"	2	2
"teacher", "stacher"	2	2
"teacher", "tache"	2	2
"teacher", "taches"	2	2
"teacher", "tacker"	2	2
"teacher", "teach"	2	2
"teacher", "teacherly"	2	2
"teacher", "teachy"	2	2
"teacher", "teaer"	2	2
"teacher", "teamer"	2	2
"teacher", "tearer"	2	2
"teacher", "tearier"	2	2
"teacher", "teaser"	2	2
"teacher", "teasler"	2	2
"teacher", "teathe"	2	2
"teacher", "teazer"	2	2
"teacher", "teched"	2	2
"teacher", "techier"	2	2
"teacher", "teether"	2	2
"teacher", "telpher"	2	2
"teacher", "tenches"	2	2
"teacher", "tepache"	2	2
"teacher", "tercer"	2	2
"teacher", "tetched"	2	2
"teacher", "tetchier"	2	2
"teacher", "tether"	2	2
"teacher", "thacker"	2	2
"teacher", "thatcher"	2	2
"teacher", "tocher"	2	2
"teacher", "torcher"	2	2
"teacher", "toucher"	2	2
"teacher", "tracer"	2	2
"teacher", "trachea"	2	2
"teacher", "tracker"	2	2
"teacher", "treachery"	2	2
"teacher", "trencher"	2	2
"teacher", "weather"	2	2
"teacher", "welcher"	2	2
"teacher", "wencher"	2	2
"teacher", "yeather"	2	2
"teacher", "achar"	3	3
"teacher", "ache"	3	3
"teacher", "ached"	3	3
"teacher", "acheer"	3	3
"teacher", "aches"	3	3
"teacher", "achier"	3	3
"teacher", "achor"	3	3
"teacher", "achter"	3	3
"teacher", "acier"	3	3
"teacher", "acker"	3	3
"teacher", "aether"	3	3
"teacher", "apache"	3	3
"teacher", "apaches"	3	3
"teacher", "appeacher"	3	3
"teacher", "arache"	3	3
"teacher", "archer"	3	3
"teacher", "ascher"	3	3
"teacher", "asher"	3	3
"teacher", "attache"	3	3
"teacher", "attached"	3	3
"teacher", "attachers"	3	3
"teacher", "attaches"	3	3
"teacher", "attacker"	3	3
"teacher", "aweather"	3	3
"teacher", "bache"	3	3
"teacher", "bached"	3	3
"teacher", "bachel"	3	3
"teacher", "baches"	3	3
"teacher", "backer"	3	3
"teacher", "basher"	3	3
"teacher", "batcher"	3	3
"teacher", "bather"	3	3
"teacher", "beach"	3	3
"teacher", "beachie"	3	3
"teacher", "beachmen"	3	3
"teacher", "beachwear"	3	3
"teacher", "beachy"	3	3
"teacher", "beader"	3	3
"teacher", "beadier"	3	3
"teacher", "beaker"	3	3
"teacher", "beakier"	3	3
"teacher", "beamer"	3	3
"teacher", "beamier"	3	3
"teacher", "beaner"	3	3
"teacher", "beanier"	3	3
"teacher", "bearder"	3	3
"teacher", "bearer"	3	3
"teacher", "bearherd"	3	3
"teacher", "beater"	3	3
"teacher", "beaver"	3	3
"teacher", "beche"	3	3
"teacher", "bechern"	3	3
"teacher", "becker"	3	3
"teacher", "beechen"	3	3
"teacher", "beeches"	3	3
"teacher", "beechier"	3	3
"teacher", "belched"	3	3
"teacher", "belchers"	3	3
"teacher", "belches"	3	3
"teacher", "benched"	3	3
"teacher", "benchers"	3	3
"teacher", "benches"	3	3
"teacher", "berther"	3	3
"teacher", "bircher"	3	3
"teacher", "blacker"	3	3
"teacher", "blancher"	3	3
"teacher", "blather"	3	3
"teacher", "bleached"	3	3
"teacher", "bleachers"	3	3
"teacher", "bleachery"	3	3
"teacher", "bleaches"	3	3
"teacher", "blencher"	3	3
"teacher", "blucher"	3	3
"teacher", "bocher"	3	3
"teacher", "botcher"	3	3
"teacher", "boucher"	3	3
"teacher", "bracer"	3	3
"teacher", "brache"	3	3
"teacher", "braches"	3	3
"teacher", "brachet"	3	3
"teacher", "bracker"	3	3
"teacher", "brancher"	3	3
"teacher", "brasher"	3	3
"teacher", "breached"	3	3
"teacher", "breachers"	3	3
"teacher", "breaches"	3	3
"teacher", "breather"	3	3
"teacher", "broacher"	3	3
"teacher", "buncher"	3	3
"teacher", "butcher"	3	3
"teacher", "cache"	3	3
"teacher", "cached"	3	3
"teacher", "caches"	3	3
"teacher", "cachet"	3	3
"teacher", "casher"	3	3
"teacher", "catcher"	3	3
"teacher", "chacker"	3	3
"teacher", "cher"	3	3
"teacher", "cincher"	3	3
"teacher", "clacker"	3	3
"teacher", "clasher"	3	3
"teacher", "clencher"	3	3
"teacher", "clocher"	3	3
"teacher", "coached"	3	3
"teacher", "coachee"	3	3
"teacher", "coachers"	3	3
"teacher", "coaches"	3	3
"teacher", "cocher"	3	3
"teacher", "concher"	3	3
"teacher", "coucher"	3	3
"teacher", "cracker"	3	3
"teacher", "crasher"	3	3
"teacher", "cutcher"	3	3
"teacher", "dacker"	3	3
"teacher", "dasher"	3	3
"teacher", "deader"	3	3
"teacher", "deafer"	3	3
"teacher", "dealer"	3	3
"teacher", "deaner"	3	3
"teacher", "dearer"	3	3
"teacher", "deashed"	3	3
"teacher", "deashes"	3	3
"teacher", "debaucher"	3	3
"teacher", "decker"	3	3
"teacher", "defacer"	3	3
"teacher", "dehache"	3	3
"teacher", "deicer"	3	3
"teacher", "densher"	3	3
"teacher", "detache"	3	3
"teacher", "detached"	3	3
"teacher", "detachers"	3	3
"teacher", "detaches"	3	3
"teacher", "devchar"	3	3
"teacher", "ditcher"	3	3
"teacher", "drachen"	3	3
"teacher", "drencher"	3	3
"teacher", "each"	3	3
"teacher", "eager"	3	3
"teacher", "earner"	3	3
"teacher", "easer"	3	3
"teacher", "easier"	3	3
"teacher", "easter"	3	3
"teacher", "eatche"	3	3
"teacher", "eater"	3	3
"teacher", "eaver"	3	3
"teacher", "echar"	3	3
"teacher", "eche"	3	3
"teacher", "echea"	3	3
"teacher", "eched"	3	3
"teacher", "eches"	3	3
"teacher", "echoer"	3	3
"teacher", "either"	3	3
"teacher", "elchee"	3	3
"teacher", "encheer"	3	3
"teacher", "eschar"	3	3
"teacher", "eschel"	3	3
"teacher", "eschew"	3	3
"teacher", "esther"	3	3
"teacher", "etched"	3	3
"teacher", "etchers"	3	3
"teacher", "etches"	3	3
"teacher", "ether"	3	3
"teacher", "exacter"	3	3
"teacher", "facer"	3	3
"teacher", "facier"	3	3
"teacher", "fasher"	3	3
"teacher", "father"	3	3
"teacher", "fearer"	3	3
"teacher", "feaster"	3	3
"teacher", "feater"	3	3
"teacher", "feathers"	3	3
"teacher", "feathery"	3	3
"teacher", "fecche"	3	3
"teacher", "feigher"	3	3
"teacher", "fencer"	3	3
"teacher", "feroher"	3	3
"teacher", "ferther"	3	3
"teacher", "fetched"	3	3
"teacher", "fetchers"	3	3
"teacher", "fetches"	3	3
"teacher", "filcher"	3	3
"teacher", "fitcher"	3	3
"teacher", "flachery"	3	3
"teacher", "flacker"	3	3
"teacher", "flasher"	3	3
"teacher", "fletcher"	3	3
"teacher", "frache"	3	3
"teacher", "fratcher"	3	3
"teacher", "gasher"	3	3
"teacher", "gather"	3	3
"teacher", "gaucher"	3	3
"teacher", "gether"	3	3
"teacher", "glacier"	3	3
"teacher", "gracer"	3	3
"teacher", "grather"	3	3
"teacher", "hache"	3	3
"teacher", "hacker"	3	3
"teacher", "hasher"	3	3
"teacher", "hatcher"	3	3
"teacher", "header"	3	3
"teacher", "headier"	3	3
"teacher", "healder"	3	3
"teacher", "healer"	3	3
"teacher", "heaper"	3	3
"teacher", "hearer"	3	3
"teacher", "heater"	3	3
"teacher", "heathen"	3	3
"teacher", "heathers"	3	3
"teacher", "heathery"	3	3
"teacher", "heathier"	3	3
"teacher", "heaumer"	3	3
"teacher", "heaver"	3	3
"teacher", "heavier"	3	3
"teacher", "hetchel"	3	3
"teacher", "hitcher"	3	3
"teacher", "hutcher"	3	3
"teacher", "impeacher"	3	3
"teacher", "incher"	3	3
"teacher", "jacker"	3	3
"teacher", "kasher"	3	3
"teacher", "keach"	3	3
"teacher", "kechel"	3	3
"teacher", "kenches"	3	3
"teacher", "ketches"	3	3
"teacher", "knacker"	3	3
"teacher", "lacer"	3	3
"teacher", "lache"	3	3
"teacher", "laches"	3	3
"teacher", "lacier"	3	3
"teacher", "lacker"	3	3
"teacher", "larcher"	3	3
"teacher", "lasher"	3	3
"teacher", "latcher"	3	3
"teacher", "lather"	3	3
"teacher", "leach"	3	3
"teacher", "leachmen"	3	3
"teacher", "leachy"	3	3
"teacher", "leader"	3	3
"teacher", "leadier"	3	3
"teacher", "leafer"	3	3
"teacher", "leafier"	3	3
"teacher", "leaguer"	3	3
"teacher", "leaker"	3	3
"teacher", "leakier"	3	3
"teacher", "leamer"	3	3
"teacher", "leander"	3	3
"teacher", "leaner"	3	3
"teacher", "leaper"	3	3
"teacher", "learier"	3	3
"teacher", "learner"	3	3
"teacher", "leaser"	3	3
"teacher", "leashed"	3	3
"teacher", "leashes"	3	3
"teacher", "leathern"	3	3
"teacher", "leathers"	3	3
"teacher", "leathery"	3	3
"teacher", "leaver"	3	3
"teacher", "leavier"	3	3
"teacher", "leche"	3	3
"teacher", "leched"	3	3
"teacher", "lechers"	3	3
"teacher", "lechery"	3	3
"teacher", "leches"	3	3
"teacher", "lecker"	3	3
"teacher", "leeched"	3	3
"teacher", "leechery"	3	3
"teacher", "leeches"	3	3
"teacher", "lesche"	3	3
"teacher", "letched"	3	3
"teacher", "letches"	3	3
"teacher", "loaches"	3	3
"teacher", "loather"	3	3
"teacher", "luncher"	3	3
"teacher", "lurcher"	3	3
"teacher", "lyncher"	3	3
"teacher", "macer"	3	3
"teacher", "machar"	3	3
"teacher", "mache"	3	3
"teacher", "macheer"	3	3
"teacher", "machera"	3	3
"teacher", "maches"	3	3
"teacher", "marcher"	3	3
"teacher", "masher"	3	3
"teacher", "matcher"	3	3
"teacher", "mather"	3	3
"teacher", "meach"	3	3
"teacher", "meader"	3	3
"teacher", "meager"	3	3
"teacher", "mealer"	3	3
"teacher", "mealier"	3	3
"teacher", "meander"	3	3
"teacher", "meaner"	3	3
"teacher", "meathe"	3	3
"teacher", "meatier"	3	3
"teacher", "menacer"	3	3
"teacher", "mercer"	3	3
"teacher", "merchet"	3	3
"teacher", "mether"	3	3
"teacher", "micher"	3	3
"teacher", "milcher"	3	3
"teacher", "misteacher"	3	3
"teacher", "moocher"	3	3
"teacher", "mulcher"	3	3
"teacher", "muncher"	3	3
"teacher", "nache"	3	3
"teacher", "naches"	3	3
"teacher", "nather"	3	3
"teacher", "nearer"	3	3
"teacher", "neater"	3	3
"teacher", "neatherd"	3	3
"teacher", "necker"	3	3
"teacher", "neigher"	3	3
"teacher", "neither"	3	3
"teacher", "nether"	3	3
"teacher", "nicher"	3	3
"teacher", "nonteacher"	3	3
"teacher", "notcher"	3	3
"teacher", "ocher"	3	3
"teacher", "orache"	3	3
"teacher", "oraches"	3	3
"teacher", "oracler"	3	3
"teacher", "pacer"	3	3
"teacher", "packer"	3	3
"teacher", "parcher"	3	3
"teacher", "patcher"	3	3
"teacher", "peace"	3	3
"teacher", "peaced"	3	3
"teacher", "peaces"	3	3
"teacher", "peach"	3	3
"teacher", "peachlet"	3	3
"teacher", "peachy"	3	3
"teacher", "peahen"	3	3
"teacher", "peaker"	3	3
"teacher", "peakier"	3	3
"teacher", "pealer"	3	3
"teacher", "pearler"	3	3
"teacher", "pearter"	3	3
"teacher", "peatier"	3	3
"teacher", "peauder"	3	3
"teacher", "peched"	3	3
"teacher", "pecker"	3	3
"teacher", "penche"	3	3
"teacher", "perche"	3	3
"teacher", "perched"	3	3
"teacher", "perchers"	3	3
"teacher", "perches"	3	3
"teacher", "pether"	3	3
"teacher", "piache"	3	3
"teacher", "pilcher"	3	3
"teacher", "pincher"	3	3
"teacher", "pitcher"	3	3
"teacher", "placer"	3	3
"teacher", "plancher"	3	3
"teacher", "plasher"	3	3
"teacher", "pleached"	3	3
"teacher", "pleaches"	3	3
"teacher", "poached"	3	3
"teacher", "poachers"	3	3
"teacher", "poaches"	3	3
"teacher", "poachier"	3	3
"teacher", "potcher"	3	3
"teacher", "preached"	3	3
"teacher", "preachers"	3	3
"teacher", "preaches"	3	3
"teacher", "preachier"	3	3
"teacher", "puncher"	3	3
"teacher", "putcher"	3	3
"teacher", "quasher"	3	3
"teacher", "queachier"	3	3
"teacher", "quencher"	3	3
"teacher", "racer"	3	3
"teacher", "rache"	3	3
"teacher", "raches"	3	3
"teacher", "rachet"	3	3
"teacher", "racier"	3	3
"teacher", "racker"	3	3
"teacher", "rancher"	3	3
"teacher", "rasher"	3	3
"teacher", "ratcher"	3	3
"teacher", "rather"	3	3
"teacher", "reach"	3	3
"teacher", "reachy"	3	3
"teacher", "reacted"	3	3
"teacher", "reactor"	3	3
"teacher", "reader"	3	3
"teacher", "readhere"	3	3
"teacher", "readier"	3	3
"teacher", "realer"	3	3
"teacher", "realter"	3	3
"teacher", "reamer"	3	3
"teacher", "reanchor"	3	3
"teacher", "reaper"	3	3
"teacher", "rearer"	3	3
"teacher", "reaver"	3	3
"teacher", "recche"	3	3
"teacher", "rechar"	3	3
"teacher", "recheer"	3	3
"teacher", "rechew"	3	3
"teacher", "reechier"	3	3
"teacher", "regather"	3	3
"teacher", "relache"	3	3
"teacher", "repacker"	3	3
"teacher", "reracker"	3	3
"teacher", "rescuer"	3	3
"teacher", "retched"	3	3
"teacher", "retches"	3	3
"teacher", "reteaches"	3	3
"teacher", "rether"	3	3
"teacher", "richer"	3	3
"teacher", "roached"	3	3
"teacher", "roaches"	3	3
"teacher", "rocher"	3	3
"teacher", "sachem"	3	3
"teacher", "sachet"	3	3
"teacher", "sacker"	3	3
"teacher", "seagoer"	3	3
"teacher", "sealer"	3	3
"teacher", "seamer"	3	3
"teacher", "seamier"	3	3
"teacher", "searcer"	3	3
"teacher", "searched"	3	3
"teacher", "searchers"	3	3
"teacher", "searches"	3	3
"teacher", "searer"	3	3
"teacher", "seater"	3	3
"teacher", "seathe"	3	3
"teacher", "seether"	3	3
"teacher", "seiche"	3	3
"teacher", "seiches"	3	3
"teacher", "shacker"	3	3
"teacher", "sheather"	3	3
"teacher", "sketcher"	3	3
"teacher", "slacker"	3	3
"teacher", "slasher"	3	3
"teacher", "slather"	3	3
"teacher", "smacker"	3	3
"teacher", "smasher"	3	3
"teacher", "snatcher"	3	3
"teacher", "snicher"	3	3
"teacher", "snocher"	3	3
"teacher", "spacer"	3	3
"teacher", "spacier"	3	3
"teacher", "speecher"	3	3
"teacher", "stacker"	3	3
"teacher", "stancher"	3	3
"teacher", "starcher"	3	3
"teacher", "staucher"	3	3
"teacher", "steadier"	3	3
"teacher", "stealer"	3	3
"teacher", "steamer"	3	3
"teacher", "steamier"	3	3
"teacher", "stenchel"	3	3
"teacher", "stenches"	3	3
"teacher", "stenchier"	3	3
"teacher", "stitcher"	3	3
"teacher", "stomacher"	3	3
"teacher", "stretcher"	3	3
"teacher", "swasher"	3	3
"teacher", "swatcher"	3	3
"teacher", "swather"	3	3
"teacher", "tabber"	3	3
"teacher", "taber"	3	3
"teacher", "tabler"	3	3
"teacher", "tace"	3	3
"teacher", "taces"	3	3
"teacher", "tacet"	3	3
"teacher", "tach"	3	3
"teacher", "tachi"	3	3
"teacher", "tachs"	3	3
"teacher", "tacked"	3	3
"teacher", "tackers"	3	3
"teacher", "tacket"	3	3
"teacher", "tackey"	3	3
"teacher", "tackier"	3	3
"teacher", "tackler"	3	3
"teacher", "tactor"	3	3
"teacher", "tagger"	3	3
"teacher", "tahar"	3	3
"teacher", "tahr"	3	3
"teacher", "tailer"	3	3
"teacher", "taiver"	3	3
"teacher", "taker"	3	3
"teacher", "talcer"	3	3
"teacher", "taler"	3	3
"teacher", "talker"	3	3
"teacher", "taller"	3	3
"teacher", "talter"	3	3
"teacher", "tamber"	3	3
"teacher", "tamer"	3	3
"teacher", "tamper"	3	3
"teacher", "tanger"	3	3
"teacher", "tanier"	3	3
"teacher", "tanker"	3	3
"teacher", "tanner"	3	3
"teacher", "taper"	3	3
"teacher", "tapper"	3	3
"teacher", "targer"	3	3
"teacher", "tarrer"	3	3
"teacher", "tarter"	3	3
"teacher", "tasker"	3	3
"teacher", "tasser"	3	3
"teacher", "taster"	3	3
"teacher", "tater"	3	3
"teacher", "tatler"	3	3
"teacher", "tatter"	3	3
"teacher", "tatther"	3	3
"teacher", "tauter"	3	3
"teacher", "taver"	3	3
"teacher", "tawer"	3	3
"teacher", "tawyer"	3	3
"teacher", "taxer"	3	3
"teacher", "tayer"	3	3
"teacher", "tche"	3	3
"teacher", "tchr"	3	3
"teacher", "teacake"	3	3
"teacher", "teacakes"	3	3
"teacher", "teacart"	3	3
"teacher", "teacherage"	3	3
"teacher", "teacherdom"	3	3
"teacher", "teacheress"	3	3
"teacher", "teacherish"	3	3
"teacher", "teaching"	3	3
"teacher", "teachless"	3	3
"teacher", "teachment"	3	3
"teacher", "teacup"	3	3
"teacher", "teacups"	3	3
"teacher", "teaey"	3	3
"teacher", "teagle"	3	3
"teacher", "teague"	3	3
"teacher", "tealery"	3	3
"teacher", "teamaker"	3	3
"teacher", "teamed"	3	3
"teacher", "teameo"	3	3
"teacher", "teamster"	3	3
"teacher", "tear"	3	3
"teacher", "teared"	3	3
"teacher", "tearers"	3	3
"teacher", "tearlet"	3	3
"teacher", "tease"	3	3
"teacher", "teased"	3	3
"teacher", "teasel"	3	3
"teacher", "teaseler"	3	3
"teacher", "teasers"	3	3
"teacher", "teases"	3	3
"teacher", "teashop"	3	3
"teacher", "teasle"	3	3
"teacher", "teated"	3	3
"teacher", "teave"	3	3
"teacher", "teaze"	3	3
"teacher", "teazel"	3	3
"teacher", "teazle"	3	3
"teacher", "teazled"	3	3
"teacher", "teazles"	3	3
"teacher", "tech"	3	3
"teacher", "techie"	3	3
"teacher", "techies"	3	3
"teacher", "techne"	3	3
"teacher", "techy"	3	3
"teacher", "tedder"	3	3
"teacher", "teemer"	3	3
"teacher", "teener"	3	3
"teacher", "teenier"	3	3
"teacher", "teer"	3	3
"teacher", "teerer"	3	3
"teacher", "teeter"	3	3
"teacher", "teethe"	3	3
"teacher", "teethed"	3	3
"teacher", "teethers"	3	3
"teacher", "teethes"	3	3
"teacher", "teethier"	3	3
"teacher", "tehee"	3	3
"teacher", "teinder"	3	3
"teacher", "telfer"	3	3
"teacher", "teller"	3	3
"teacher", "telphers"	3	3
"teacher", "temacha"	3	3
"teacher", "temper"	3	3
"teacher", "tempter"	3	3
"teacher", "temser"	3	3
"teacher", "tenace"	3	3
"teacher", "tenaces"	3	3
"teacher", "tenacle"	3	3
"teacher", "tenanter"	3	3
"teacher", "tench"	3	3
"teacher", "tender"	3	3
"teacher", "tenner"	3	3
"teacher", "tenoner"	3	3
"teacher", "tenser"	3	3
"teacher", "tenter"	3	3
"teacher", "tentier"	3	3
"teacher", "terce"	3	3
"teacher", "tercel"	3	3
"teacher", "terces"	3	3
"teacher", "tercet"	3	3
"teacher", "termer"	3	3
"teacher", "terner"	3	3
"teacher", "terracer"	3	3
"teacher", "terrier"	3	3
"teacher", "terser"	3	3
"teacher", "tester"	3	3
"teacher", "testier"	3	3
"teacher", "tetch"	3	3
"teacher", "tetchy"	3	3
"teacher", "tethers"	3	3
"teacher", "tethery"	3	3
"teacher", "tetter"	3	3
"teacher", "teuch"	3	3
"teacher", "teuchit"	3	3
"teacher", "tewer"	3	3
"teacher", "tewter"	3	3
"teacher", "thacked"	3	3
"teacher", "thaler"	3	3
"teacher", "thanker"	3	3
"teacher", "thatched"	3	3
"teacher", "thatchers"	3	3
"teacher", "thatches"	3	3
"teacher", "thawer"	3	3
"teacher", "thawier"	3	3
"teacher", "theater"	3	3
"teacher", "thicker"	3	3
"teacher", "thither"	3	3
"teacher", "thrasher"	3	3
"teacher", "thwacker"	3	3
"teacher", "ticchen"	3	3
"teacher", "ticer"	3	3
"teacher", "tichel"	3	3
"teacher", "ticker"	3	3
"teacher", "tinchel"	3	3
"teacher", "tither"	3	3
"teacher", "toader"	3	3
"teacher", "toadier"	3	3
"teacher", "toaster"	3	3
"teacher", "tochers"	3	3
"teacher", "toher"	3	3
"teacher", "toother"	3	3
"teacher", "torched"	3	3
"teacher", "torchere"	3	3
"teacher", "torches"	3	3
"teacher", "torchet"	3	3
"teacher", "torchier"	3	3
"teacher", "tosher"	3	3
"teacher", "tother"	3	3
"teacher", "touche"	3	3
"teacher", "touched"	3	3
"teacher", "touchers"	3	3
"teacher", "touches"	3	3
"teacher", "touchier"	3	3
"teacher", "tougher"	3	3
"teacher", "trace"	3	3
"teacher", "traced"	3	3
"teacher", "tracers"	3	3
"teacher", "tracery"	3	3
"teacher", "traces"	3	3
"teacher", "tracheae"	3	3
"teacher", "tracheal"	3	3
"teacher", "trachean"	3	3
"teacher", "tracheary"	3	3
"teacher", "tracheas"	3	3
"teacher", "tracheid"	3	3
"teacher", "trachle"	3	3
"teacher", "trachled"	3	3
"teacher", "trachles"	3	3
"teacher", "tracked"	3	3
"teacher", "trackers"	3	3
"teacher", "tractor"	3	3
"teacher", "trader"	3	3
"teacher", "trailer"	3	3
"teacher", "trainer"	3	3
"teacher", "trammer"	3	3
"teacher", "tramper"	3	3
"teacher", "tranche"	3	3
"teacher", "tranches"	3	3
"teacher", "tranchet"	3	3
"teacher", "tranker"	3	3
"teacher", "tranter"	3	3
"teacher", "trapper"	3	3
"teacher", "trashed"	3	3
"teacher", "trashery"	3	3
"teacher", "trashes"	3	3
"teacher", "trashier"	3	3
"teacher", "tratler"	3	3
"teacher", "trawler"	3	3
"teacher", "treacle"	3	3
"teacher", "treacles"	3	3
"teacher", "treader"	3	3
"teacher", "treadler"	3	3
"teacher", "treater"	3	3
"teacher", "trenched"	3	3
"teacher", "trenchers"	3	3
"teacher", "trenches"	3	3
"teacher", "tresche"	3	3
"teacher", "tricker"	3	3
"teacher", "trochar"	3	3
"teacher", "troche"	3	3
"teacher", "troched"	3	3
"teacher", "trochee"	3	3
"teacher", "troches"	3	3
"teacher", "trucker"	3	3
"teacher", "truncher"	3	3
"teacher", "tucker"	3	3
"teacher", "tusche"	3	3
"teacher", "tusches"	3	3
"teacher", "tusher"	3	3
"teacher", "twagger"	3	3
"teacher", "twanger"	3	3
"teacher", "twanker"	3	3
"teacher", "twatchel"	3	3
"teacher", "tweaker"	3	3
"teacher", "tweakier"	3	3
"teacher", "twicer"	3	3
"teacher", "twitcher"	3	3
"teacher", "unteaches"	3	3
"teacher", "vache"	3	3
"teacher", "vealer"	3	3
"teacher", "vealier"	3	3
"teacher", "vetches"	3	3
"teacher", "vetchier"	3	3
"teacher", "voucher"	3	3
"teacher", "wacker"	3	3
"teacher", "washer"	3	3
"teacher", "watcher"	3	3
"teacher", "wather"	3	3
"teacher", "weaker"	3	3
"teacher", "weaner"	3	3
"teacher", "weanyer"	3	3
"teacher", "wearer"	3	3
"teacher", "wearier"	3	3
"teacher", "weaser"	3	3
"teacher", "weathers"	3	3
"teacher", "weathery"	3	3
"teacher", "weaver"	3	3
"teacher", "wecche"	3	3
"teacher", "weigher"	3	3
"teacher", "welched"	3	3
"teacher", "welchers"	3	3
"teacher", "welches"	3	3
"teacher", "welsher"	3	3
"teacher", "wenched"	3	3
"teacher", "wenchel"	3	3
"teacher", "wenchers"	3	3
"teacher", "wenches"	3	3
"teacher", "wetched"	3	3
"teacher", "wetchet"	3	3
"teacher", "wether"	3	3
"teacher", "whacker"	3	3
"teacher", "wincher"	3	3
"teacher", "witcher"	3	3
"teacher", "wracker"	3	3
"teacher", "wreather"	3	3
"teacher", "wrencher"	3	3
"teacher", "yachter"	3	3
"teacher", "yearner"	3	3
"teacher", "yether"	3	3
"distance", "springbok"	9	9
"distance", "beholder"	8	8
"distance", "aerobate"	7	7
"distance", "testier"	6	6
"distance", "purtenance"	5	5
"distance", "distanced"	1	1
"distance", "distances"	1	1
"distance", "distancy"	1	1
"distance", "desistance"	2	2
"distance", "dispace"	2	2
"distance", "dispence"	2	2
"distance", "disrange"	2	2
"distance", "distale"	2	2
"distance", "distant"	2	2
"distance", "distaste"	2	2
"distance", "distinct"	2	2
"distance", "distune"	2	2
"distance", "disusance"	2	2
"distance", "indistance"	2	2
"distance", "instance"	2	2
"distance", "pittance"	2	2
"distance", "sistence"	2	2
"distance", "stance"	2	2
"distance", "acutance"	3	3
"distance", "admittance"	3	3
"distance", "aidance"	3	3
"distance", "askance"	3	3
"distance", "assistance"	3	3
"distance", "beisance"	3	3
"distance", "biddance"	3	3
"distance", "bistable"	3	3
"distance", "bistate"	3	3
"distance", "brisance"	3	3
"distance", "captance"	3	3
"distance", "castane"	3	3
"distance", "cistae"	3	3
"distance", "constance"	3	3
"distance", "daliance"	3	3
"distance", "dance"	3	3
"distance", "defiance"	3	3
"distance", "desistence"	3	3
"distance", "destine"	3	3
"distance", "devance"	3	3
"distance", "deviance"	3	3
"distance", "diamante"	3	3
"distance", "diane"	3	3
"distance", "diastase"	3	3
"distance", "dibranch"	3	3
"distance", "dibstone"	3	3
"distance", "dictate"	3	3
"distance", "dietine"	3	3
"distance", "dilatancy"	3	3
"distance", "dimane"	3	3
"distance", "dimuence"	3	3
"distance", "dioxane"	3	3
"distance", "disable"	3	3
"distance", "disadvance"	3	3
"distance", "disannex"	3	3
"distance", "disanney"	3	3
"distance", "disavaunce"	3	3
"distance", "disbalance"	3	3
"distance", "disband"	3	3
"distance", "disbanded"	3	3
"distance", "disbands"	3	3
"distance", "disbase"	3	3
"distance", "disbench"	3	3
"distance", "disbranch"	3	3
"distance", "discage"	3	3
"distance", "discalced"	3	3
"distance", "discandy"	3	3
"distance", "discant"	3	3
"distance", "discanted"	3	3
"distance", "discanter"	3	3
"distance", "discants"	3	3
"distance", "discase"	3	3
"distance", "discinct"	3	3
"distance", "disease"	3	3
"distance", "disentrance"	3	3
"distance", "disfame"	3	3
"distance", "disgage"	3	3
"distance", "disgrace"	3	3
"distance", "dishable"	3	3
"distance", "disilane"	3	3
"distance", "disjunct"	3	3
"distance", "disjune"	3	3
"distance", "dislade"	3	3
"distance", "disman"	3	3
"distance", "dismantle"	3	3
"distance", "dismarch"	3	3
"distance", "dispand"	3	3
"distance", "dispatch"	3	3
"distance", "dispeace"	3	3
"distance", "dispense"	3	3
"distance", "dispiece"	3	3
"distance", "displace"	3	3
"distance", "dispone"	3	3
"distance", "disponee"	3	3
"distance", "disponge"	3	3
"distance", "disprince"	3	3
"distance", "dispunct"	3	3
"distance", "dispunge"	3	3
"distance", "disrank"	3	3
"distance", "disrate"	3	3
"distance", "dissave"	3	3
"distance", "dissonance"	3	3
"distance", "disstate"	3	3
"distance", "distad"	3	3
"distance", "distaff"	3	3
"distance", "distaffs"	3	3
"distance", "distain"	3	3
"distance", "distained"	3	3
"distance", "distains"	3	3
"distance", "distal"	3	3
"distance", "distalia"	3	3
"distance", "distally"	3	3
"distance", "distancing"	3	3
"distance", "distannic"	3	3
"distance", "distantly"	3	3
"distance", "distasted"	3	3
"distance", "distastes"	3	3
"distance", "distater"	3	3
"distance", "distaves"	3	3
"distance", "distend"	3	3
"distance", "distended"	3	3
"distance", "distender"	3	3
"distance", "distends"	3	3
"distance", "distent"	3	3
"distance", "disthene"	3	3
"distance", "distich"	3	3
"distance", "distincter"	3	3
"distance", "distingu"	3	3
"distance", "distingue"	3	3
"distance", "distitle"	3	3
"distance", "distn"	3	3
"distance", "distome"	3	3
"distance", "distract"	3	3
"distance", "distrainee"	3	3
"distance", "distraite"	3	3
"distance", "district"	3	3
"distance", "disturbance"	3	3
"distance", "distyle"	3	3
"distance", "disvalue"	3	3
"distance", "disvoice"	3	3
"distance", "diswench"	3	3
"distance", "ditone"	3	3
"distance", "dittander"	3	3
"distance", "dittanies"	3	3
"distance", "dittany"	3	3
"distance", "doleance"	3	3
"distance", "doubtance"	3	3
"distance", "durance"	3	3
"distance", "elastance"	3	3
"distance", "emittance"	3	3
"distance", "ensuance"	3	3
"distance", "existence"	3	3
"distance", "exitance"	3	3
"distance", "extance"	3	3
"distance", "fiance"	3	3
"distance", "finance"	3	3
"distance", "firmance"	3	3
"distance", "hesitance"	3	3
"distance", "histone"	3	3
"distance", "inhance"	3	3
"distance", "instanced"	3	3
"distance", "instances"	3	3
"distance", "instancy"	3	3
"distance", "issuance"	3	3
"distance", "istana"	3	3
"distance", "jactance"	3	3
"distance", "laitance"	3	3
"distance", "ligeance"	3	3
"distance", "listable"	3	3
"distance", "medisance"	3	3
"distance", "meditance"	3	3
"distance", "mischance"	3	3
"distance", "mistake"	3	3
"distance", "mistaste"	3	3
"distance", "mistone"	3	3
"distance", "mistrace"	3	3
"distance", "mistune"	3	3
"distance", "naissance"	3	3
"distance", "noisance"	3	3
"distance", "nuisance"	3	3
"distance", "obstancy"	3	3
"distance", "obstante"	3	3
"distance", "omittance"	3	3
"distance", "outdistance"	3	3
"distance", "piquance"	3	3
"distance", "pisistance"	3	3
"distance", "pistache"	3	3
"distance", "pittancer"	3	3
"distance", "pittances"	3	3
"distance", "portance"	3	3
"distance", "potance"	3	3
"distance", "pristane"	3	3
"distance", "puissance"	3	3
"distance", "quittance"	3	3
"distance", "resiance"	3	3
"distance", "resistance"	3	3
"distance", "riddance"	3	3
"distance", "scance"	3	3
"distance", "seance"	3	3
"distance", "signance"	3	3
"distance", "sistency"	3	3
"distance", "sistine"	3	3
"distance", "skance"	3	3
"distance", "sortance"	3	3
"distance", "stances"	3	3
"distance", "stanch"	3	3
"distance", "stane"	3	3
"distance", "stanze"	3	3
"distance", "substance"	3	3
"distance", "tisane"	3	3
"distance", "undistanced"	3	3
"distance", "unstanch"	3	3
"distance", "usance"	3	3
"distance", "vibrance"	3	3
"fisherman", "fishermen"	1	1
"fisherman", "filterman"	2	2
"fisherman", "fisherwoman"	2	2
"fisherman", "fishman"	2	2
"fisherman", "fishwoman"	2	2
"fisherman", "flusherman"	2	2
"fisherman", "washerman"	2	2
"fisherman", "bushelman"	3	3
"fisherman", "cinderman"	3	3
"fisherman", "dusterman"	3	3
"fisherman", "featherman"	3	3
"fisherman", "filtermen"	3	3
"fisherman", "fireman"	3	3
"fisherman", "firman"	3	3
"fisherman", "fisher"	3	3
"fisherman", "fisherboat"	3	3
"fisherman", "fisherboy"	3	3
"fisherman", "fisheress"	3	3
"fisherman", "fisheries"	3	3
"fisherman", "fishers"	3	3
"fisherman", "fishery"	3	3
"fisherman", "fishmen"	3	3
"fisherman", "flushermen"	3	3
"fisherman", "gopherman"	3	3
"fisherman", "herman"	3	3
"fisherman", "isleman"	3	3
"fisherman", "islesman"	3	3
"fisherman", "jiggerman"	3	3
"fisherman", "lighterman"	3	3
"fisherman", "listerian"	3	3
"fisherman", "masterman"	3	3
"fisherman", "nonfisherman"	3	3
"fisherman", "oysterman"	3	3
"fisherman", "pitcherman"	3	3
"fisherman", "ripperman"	3	3
"fisherman", "riverman"	3	3
"fisherman", "shearman"	3	3
"fisherman", "shedman"	3	3
"fisherman", "tillerman"	3	3
"fisherman", "timberman"	3	3
"fisherman", "usherian"	3	3
"fisherman", "viseman"	3	3
"fisherman", "washermen"	3	3
"fisherman", "washeryman"	3	3
"fisherman", "wiseman"	3	3
"abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdef", "bcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefg"	2	2
*/