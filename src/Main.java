//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static String[] arrjap = {"あ", "い", "え", "お", "う", "か", "き", "く", "け", "こ", "が", "ぎ", "ぐ", "げ", "ご", "さ", "し", "す", "せ",
            "そ", "ざ", "じ", "ず", "ぜ", "ぞ", "た", "ち", "つ", "て", "と", "だ", "ぢ", "づ", "で", "ど", "な", "に", "ぬ", "ね",
            "の", "は", "ひ", "ふ", "へ", "ほ", "ば", "び", "ぶ", "べ", "ぼ", "ぱ", "ぴ", "ぷ", "ぺ", "ぽ","ま","み","む","め","も","や","ゆ","よ","ら","る","れ","り","ろ","わ","を","ん","ア","イ","ウ","エ","オ","カ","キ","ク","ケ","コ",
            "ガ","ギ","グ","ゲ","ゴ","サ","シ","ス","セ","ソ","ザ","ジ","ズ","ゼ","ゾ","ン","タ","チ","ツ","テ","ト","ダ","ヂ","ヅ","デ","ド","ナ","ニ","ヌ","ネ","ノ","ハ","ヒ","フ","ヘ","ホ","バ","ビ","ブ","ベ","ボ","パ","ピ","プ","ペ","ポ",
    "マ","ミ","ム","メ","モ","ヤ","ユ","ヨ"};
    public static String[] arr = {"A", "I", "E", "O", "U", "KA", "KI", "KU", "KE", "KO", "GA", "GI", "GU", "GE", "GO", "SA", "SHI", "SU", "SE", "SO", "ZA", "JI(z-series)", "ZU(z-series)", "ZE", "ZO", "TA", "CHI", "TSU", "TE", "TO", "DA", "JI(d-series)", "ZU(d-series)", "DE", "DO", "NA", "NI", "NU", "NE",
            "NO", "HA", "HI", "FU", "HE", "HO", "BA", "BI", "BU", "BE", "BO", "PA", "PI", "PU", "PE", "PO","MA","MI","MU","ME","MO","YA","YU","YO","RA","RU","RE","RI","RO","WA","(W)O","N","*A","*I","*U","*E","*O","*KA","*KI","*KU","*KE","*KO",
            "*GA","*GI","*GU","*GE","*GO","*SA","*SHI","*SU","*SE","*SO","*ZA","*JI(z-series)","*ZU(z-series)","*ZE","*ZO","*N","*TA","*CHI","*TSU","*TE","*TO","*DA","*JI(d-series)","*ZU(d-series)","*DE","*DO","*NA","*NI"
    ,"*NU","*NE","*NO","*HA","*HI","*FU","*HE","*HO","*BA","*BI","*BU","*BE","*BO","*PA","*PI","*PU","*PE","*PO","*MA","*MI","*MU","*ME","*MO","*YA","*YU","*YO"};
    public static String[] arrcom = {"water","apple","pencil","house","room","living room","kitchen","refrigerator","bathroom(toilet)(polite)","bathroom(toilet)","sink","bath","bathing-room","roof","ceiling","wall","hardwood-floor", "door","window","book","bookshelf",
            "chair","table","bed","tatami","sliding-paper-door","futon","tv","radio","clock/watch","air-conditioning","plate","bowl","cup/glass","chopsticks","fork","spoon","knife","couch","computer","today","yesterday","tomorrow"
    ,"the day before yesterday","the day after tomorrow","this morning","night","last night","sunday","monday","tuesday","wednesday","thursday","friday","saturday","last week","this week","next week","the week before last",
    "the week after next","last month","this month","next month","the month before last","the month after next","suffix for month","january","february","march","april","may","june","july","august","september","october","november"
    ,"december","last year","this year","next year","the year before last","the year after next","every- (prefix)","every day","every week","every month","every year","winter","spring","summer","autumn","good","weather",
            "park","(agreement seeker)"};
    public static String[] arrjapcom = {"みず","りんご","えんぴつ","いえ","へや","いま","だいどころ","れいぞうこ","おてあらい","といれ","ながしだい","おふろ","おふろば","やね","てんじょう","かべ","ゆか","どあ","まど","ほん","ほんだな",
            "いす","てえぶる","べっど","たたみ","しょうじ","ふとん","てれび","らじお","とけい","えあこん","さら","ちゃわん","こうぷ","おはし","ほうく","すぷうん","ないふ","かうち","こんぴゅうたあ","きょう","きのう","あした"
            ,"おととい","あさって","けさ","よる","ゆうべ","にちようび","げつようび","かようび","すいようび","もくようび","きんょうび(pronounced kii-yoo-bi)","どようび","せんしゅう","こんしゅう","らいしゅう","せんせんしゅう","さらいしゅう",
            "せんげつ","こんげつ","らいげつ","せんせんげつ","さらいげつ","-がつ","いちがつ","にがつ","さんがつ","しがつ","ごがつ","ろくがつ","しちがつ","はちがつ","くがつ","じゅがつ","じゅいちがつ","じゅにがつ",
            "さくねん","ことし","らいねん","おととし","さらいねん","まい- (prefix)","まいにち","まいしゅう","まいつき","まいとし","ふゆ","はる","なつ","あき","いい","おてんき","こうえん","ね"};

    public static ArrayList<String> arrcom1 = new ArrayList();
    public static ArrayList<String> arrjapcom1 = new ArrayList();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Initiating Weeb Simulator... Credits: JasonSR\nWhat is your name, user?");
        String name = "";
        while (true) {
            name = scan.nextLine();
            if (name.length() <= 10) {
                break;
            } else {
                System.out.println("Please keep the name 10 characters or under.");
            }
        }
        System.out.println("\nExcellent, Welcome " + name + ".\nWeeb Simulator is a Japanese Learning Program for English speakers\\writers hoping to improve their Japanese writing, the main target audience being very new learners. " +
                "\nIn most modes, English text will be displayed to represent how Japanese symbols would sound in English; however, some modes have japanese to english options, vise versa.\nUpdates will be weekly(hopefully), " +
                "meaning perhaps in the future katakana(In the works as of 6/11/2024) and kanji functionality options will be added.");
        // mode select below
        Integer token1 = 0;
        Integer token2 = 0;

        for (int start = 0; start <= token1; start++) {
            System.out.println("\nMode Select!\nenter 1 for word constructor mode.\nenter 2 for series selection mode.\nenter 3 for master mode.\nenter 4 for common vocab list mode\nenter 5 to exit program.");
            int x = scan.nextInt();
            //word constructor mode below
            if (x == 1) {
                while (true) {
                    int choice = 0;
                    boolean gcheck = true;
                    boolean gcheck1 = true;
                    boolean gcheck2 = true;
                    boolean gcheck3 = true;
                    while(true){
                        System.out.println("Sub-Mode Select\n1 - traditional\n2 - english meaning");
                        choice = scan.nextInt();
                        if(choice==1||choice==2){
                            break;
                        }
                        System.out.println("number entered is not serviceable, please re-enter value.");
                    }
                    while(true){
                        String[] smalljap = {"ゃ", " ゅ", "ょ", "っ"};
                        int counter6 = 0;
                        logic.seriesselection(arr, arrjap, logic.seriesarreng1, logic.seriesarrjap1);
                        for (int search = 0; search < logic.seriesarrjap1.size(); search++) {
                            if (logic.seriesarrjap1.get(search).equals("よ")) {
                                for (int x1 = 0; x1 < 3; x1++) {
                                    logic.seriesarrjap1.add(smalljap[x1]);
                                }
                            }
                            if (logic.seriesarrjap1.get(search).equals("つ")) {
                                logic.seriesarrjap1.add(smalljap[3]);
                            }
                        }
                        for (int arrstart = 0; arrstart < Database.hiraganajap.length; arrstart++) {
                            for (int specword = 0; specword < Database.hiraganajap[arrstart].length(); specword++) {
                                for (int i = 0; i < logic.seriesarrjap1.size(); i++) {
                                    if (Database.hiraganajap[arrstart].substring(specword, specword + 1).equals(logic.seriesarrjap1.get(i))) {
                                        counter6++;
                                    }
                                }
                            }
                            if (counter6 == Database.hiraganajap[arrstart].length()) {
                                Database.hiraganajap1.add(Database.hiraganajap[arrstart]);
                                Database.hiraganaeng1.add(Database.hiraganaeng[arrstart]);
                                Database.hiraganasyl1.add(Database.hiraganasyl[arrstart]);
                            }
                            counter6 = 0;
                        }
                        if(Database.hiraganajap1.size()==0){
                            System.out.println("No words were found, please choose a new set of values.");
                            Database.hiraganajap1.clear();
                            Database.hiraganaeng1.clear();
                            Database.hiraganasyl1.clear();
                            logic.seriesarreng1.clear();
                            logic.seriesarrjap1.clear();
                            continue;
                        }
                        break;
                    }
                    System.out.println(Database.hiraganajap1.size() + " words found.\n");
                    if (choice == 1) {
                        while (true) {
                            int y1 = (int) (Math.random() * (Database.hiraganasyl1.size() - 0) + 0);
                            System.out.println("word: "+Database.hiraganasyl1.get(y1));
                            System.out.println("Want to see the japanese translation and english meaning? 1 to view, 0 to continue");
                            while (true) {
                                int choice2 = scan.nextInt();
                                if (choice2 == 0) {
                                    break;
                                } else if (choice2 == 1) {
                                    System.out.println("original japanese word: " + Database.hiraganajap1.get(y1));
                                    System.out.println("english translation: " + Database.hiraganaeng1.get(y1));
                                    break;
                                } else {
                                    System.out.println("number entered is not serviceable, please re-enter value.");
                                }
                            }
                            while(true){
                                System.out.println("\nwanna go again?\nenter 1 to repeat.\nenter 2 to go to Sub-Mode Select.\nenter 3 to go to Mode Select.\nenter 4 to end program.");
                                int choice3 = scan.nextInt();
                                if (choice3 == 1) {
                                    break;
                                } else if (choice3 == 2) {
                                    Database.hiraganajap1.clear();
                                    Database.hiraganaeng1.clear();
                                    Database.hiraganasyl1.clear();
                                    logic.seriesarreng1.clear();
                                    logic.seriesarrjap1.clear();
                                    gcheck1 = false;
                                    break;
                                } else if (choice3 == 3) {
                                    Database.hiraganajap1.clear();
                                    Database.hiraganaeng1.clear();
                                    Database.hiraganasyl1.clear();
                                    logic.seriesarreng1.clear();
                                    logic.seriesarrjap1.clear();
                                    gcheck = false;
                                    break;
                                } else if (choice3 == 4){
                                    System.exit(0);
                                } else {
                                    System.out.println("number entered is not serviceable, please re-enter value.");
                                }
                            }
                            if(gcheck==false||gcheck1==false){
                                break;
                            }
                        }
                    } else if (choice == 2) {
                        gcheck2 = true;
                        gcheck3 = true;
                        while(true){
                            int y1 = (int) (Math.random() * (Database.hiraganajap1.size() - 0) + 0);
                            System.out.println("word: "+Database.hiraganajap1.get(y1));
                            System.out.println("Want to see the english translation? 1 to view, 0 to continue");
                            while (true) {
                                int choice2 = scan.nextInt();
                                if (choice2 == 0) {
                                    break;
                                } else if (choice2 == 1) {
                                    System.out.println("english translation: " + Database.hiraganaeng1.get(y1));
                                    break;
                                } else {
                                    System.out.println("number entered is not serviceable, please re-enter value.");
                                }
                            }
                            while(true){
                                System.out.println("\nwanna go again?\nenter 1 to repeat.\nenter 2 to go to Sub-Mode Select.\nenter 3 to go to Mode Select.\nenter 4 to end program.");
                                int choice3 = scan.nextInt();
                                if (choice3 == 1) {
                                    break;
                                } else if (choice3 == 2) {
                                    Database.hiraganajap1.clear();
                                    Database.hiraganaeng1.clear();
                                    Database.hiraganasyl1.clear();
                                    logic.seriesarreng1.clear();
                                    logic.seriesarrjap1.clear();
                                    gcheck2 = false;
                                    break;
                                } else if (choice3 == 3) {
                                    Database.hiraganajap1.clear();
                                    Database.hiraganaeng1.clear();
                                    Database.hiraganasyl1.clear();
                                    logic.seriesarreng1.clear();
                                    logic.seriesarrjap1.clear();
                                    gcheck3 = false;
                                    break;
                                } else if (choice3 == 4){
                                    System.exit(0);
                                } else {
                                    System.out.println("number entered is not serviceable, please re-enter value.");
                                }
                            }
                            if(gcheck2==false){
                                break;
                            }
                            if(gcheck3==false){
                                break;
                            }
                        }
                    }
                    if(gcheck==false){
                        token1++;
                        break;
                    }
                    if(gcheck3==false){
                        token1++;
                        break;
                    }
                }
            }
            //master mode below
            else if (x == 3) {
                while (true) {
                    int repeatdec = -1;
                    int masdec = -1;
                    System.out.println("Entering Master Mode...");
                    logic.seriesselection(arr, arrjap, logic.seriesarrengmaster, logic.seriesarrjapmaster);
                    for (int mas = 0; mas < logic.seriesarrjapmaster.size(); mas++) {
                        System.out.println(logic.seriesarrengmaster.get(mas));
                        System.out.println("Want to see the Japanese translation? 1 to view, 0 to continue");
                        //translation code below
                        int counter5 = 0;
                        int chancenum3 = 3;
                        String plural3 = "s";
                        while (true) {
                            if (counter5 == 4) {
                                return;
                            }
                            int trans = scan.nextInt();
                            if (trans == 1) {
                                System.out.println(logic.seriesarrjapmaster.get(mas));
                                break;
                            } else if (trans == 0) {
                                break;
                            } else if (counter5 != 3) {
                                if (counter5 == 2) {
                                    plural3 = "";
                                }
                                System.out.println("Try again, " + chancenum3 + " more chance" + plural3 + ".");
                            }
                            counter5++;
                            chancenum3--;
                        }
                        if (!(mas == logic.seriesarrjapmaster.size() - 1)) {
                            System.out.println("\nenter 1 to continue master mode\nenter 2 to end early");
                            while (true) {
                                masdec = scan.nextInt();
                                if (masdec == 1) {
                                    break;
                                } else if (masdec == 2) {
                                    break;
                                } else {
                                    System.out.println("Try again");
                                }
                            }
                        } else if (mas == logic.seriesarrjapmaster.size() - 1) {
                            break;
                        }
                        if (masdec == 2) {
                            System.out.println("");
                            break;
                        }
                        System.out.println("");
                    }
                    System.out.println("Excellent Work " + name + ". Would you like to view final answers? 1 is yes, 0 is no");
                    while (true) {
                        int fadec = scan.nextInt();
                        if (fadec == 1) {
                            for (int fa = 0; fa < logic.seriesarrjapmaster.size(); fa++) {
                                System.out.println(logic.seriesarrjapmaster.get(fa) + " - " + logic.seriesarrengmaster.get(fa));
                            }
                            break;
                        } else if (fadec == 0) {
                            break;
                        } else {
                            System.out.println("Try again");
                        }
                    }
                    System.out.println("\n1 - repeat master mode\n2 - go to mode select\n3 - end program");
                    while (true) {
                        logic.seriesarrjapmaster.clear();
                        logic.seriesarrengmaster.clear();
                        repeatdec = scan.nextInt();
                        if (repeatdec == 1) {
                            break;
                        } else if (repeatdec == 2) {
                            token1++;
                            break;
                        } else if (repeatdec == 3) {
                            return;
                        } else {
                            System.out.println("Try again");
                        }
                    }
                    if (repeatdec == 2) {
                        break;
                    }
                }
                //series selection mode below
            } else if (x == 2) {
                logic.seriesselection(arr, arrjap, logic.seriesarreng, logic.seriesarrjap);
                while(true) {
                    System.out.println("How many syllables do you want printed?");
                    int z1 = scan.nextInt();
                    logic.nlr2(z1, logic.seriesarrjap, logic.seriesarreng, name, token1, x);
                    token1 = logic.tokenvar;
                    if (logic.dec1 == 3) {
                        logic.seriesarrjap.clear();
                        logic.seriesarreng.clear();
                        break;
                    }
                }
            } else if (x == 4) {
                int choicescarf = 0;
                while(true) {
                    boolean gcheck3 = true;
                    boolean gcheck4 = true;
                    System.out.println("Sub-Mode Select\n1 - given-Japanese\n2 - given-English");
                    choicescarf = scan.nextInt();
                    if (!(choicescarf == 1 || choicescarf == 2)) {
                        System.out.println("number entered is not serviceable, please re-enter value.");
                        continue;
                    }
                    logic.seriesselectioncom(arrcom, arrjapcom, arrcom1, arrjapcom1);
                    System.out.println("\nYour List:");
                    for(int u=0;u<arrjapcom1.size();u++){
                        System.out.println(arrjapcom1.get(u)+" - "+arrcom1.get(u));
                    }
                    int hint2 = -1;
                    if(choicescarf==2){
                        System.out.println("\nWould you like to enable hint mode(option to voluntarily view hint every question)? 1 is yes, 0 is no");
                        while(true){
                            hint2 = scan.nextInt();
                            if(hint2==1||hint2==0){
                                break;
                            }
                            System.out.println("number entered is not serviceable, please re-enter value.");
                        }
                    }
                    if (choicescarf == 1) {
                        while (true) {
                            int y1 = (int) (Math.random() * (arrjapcom1.size() - 0) + 0);
                            System.out.println("\n\n\n\nword: "+arrjapcom1.get(y1));
                            System.out.println("Want to see the english translation? 1 to view, 0 to continue");
                            while (true) {
                                int choice2 = scan.nextInt();
                                if (choice2 == 0) {
                                    break;
                                } else if (choice2 == 1) {
                                    System.out.println("english translation: " + arrcom1.get(y1));
                                    break;
                                } else {
                                    System.out.println("number entered is not serviceable, please re-enter value.");
                                }
                            }
                            while (true) {
                                System.out.println("\nwanna go again?\nenter 1 to repeat.\nenter 2 to go to Sub-Mode Select.\nenter 3 to go to Mode Select.\nenter 4 to end program.\nenter 5 for quick list display.");
                                int choice3 = scan.nextInt();
                                if (choice3 == 1) {
                                    break;
                                } else if (choice3 == 2) {
                                    Database.hiraganajap1.clear();
                                    Database.hiraganaeng1.clear();
                                    Database.hiraganasyl1.clear();
                                    logic.seriesarreng1.clear();
                                    logic.seriesarrjap1.clear();
                                    gcheck3 = false;
                                    break;
                                } else if (choice3 == 3) {
                                    Database.hiraganajap1.clear();
                                    Database.hiraganaeng1.clear();
                                    Database.hiraganasyl1.clear();
                                    logic.seriesarreng1.clear();
                                    logic.seriesarrjap1.clear();
                                    gcheck4 = false;
                                    break;
                                } else if (choice3 == 4) {
                                    System.exit(0);
                                } else if (choice3 == 5) {
                                    for(int u=0;u<arrjapcom1.size()-1;u++){
                                        System.out.println(arrjapcom1.get(u)+" - "+arrcom1.get(u));
                                    }
                                } else {
                                    System.out.println("number entered is not serviceable, please re-enter value.");
                                }
                            }
                            if(gcheck3==false||gcheck4==false){
                                break;
                            }
                        }
                    } else if (choicescarf == 2) {
                        while (true) {
                            int y1 = (int) (Math.random() * (arrcom1.size() - 0) + 0);
                            System.out.println("\n\n\n\nword: "+arrcom1.get(y1));
                            if(arrjapcom1.get(y1).length()==1&&hint2==1){
                                System.out.println("Hint not available due to short word length");
                            }
                            else if(arrjapcom1.get(y1).length()>1&&arrjapcom1.get(y1).length()<4&&hint2==1){
                                System.out.println("Want to see a hint? press 1 to view, press 0 to continue");
                                int hint = scan.nextInt();
                                if(hint==1){
                                    String first = arrjapcom1.get(y1).substring(0,1);
                                    String last = arrjapcom1.get(y1).substring(arrjapcom1.get(y1).length()-1);
                                    int y2 = 1 + (int)(Math.random() * ((2 - 1) + 1));
                                    if(y2==1){
                                        System.out.println(first+"-");
                                    }
                                    if(y2==2){
                                        System.out.println("-"+last);
                                    }
                                }
                                else if(hint==0){
                                }
                                else{
                                    while(true){
                                        System.out.println("number entered is not serviceable, please re-enter value.");
                                        hint = scan.nextInt();
                                        if(hint==1){
                                            String first = arrjapcom1.get(y1).substring(0,1);
                                            String last = arrjapcom1.get(y1).substring(arrjapcom1.get(y1).length()-1);
                                            int y2 = 1 + (int)(Math.random() * ((2 - 1) + 1));
                                            if(y2==1){
                                                System.out.println(first+"-");
                                            }
                                            if(y2==2){
                                                System.out.println("-"+last);
                                            }
                                            break;
                                        }
                                        else if(hint==0){
                                            break;
                                        }
                                    }
                                }
                            }
                            else if (hint2==1){
                                System.out.println("Want to see a hint? press 1 to view, press 0 to continue");
                                int hint = scan.nextInt();
                                if(hint==1){
                                    String first = arrjapcom1.get(y1).substring(0,2);
                                    String last = arrjapcom1.get(y1).substring(arrjapcom1.get(y1).length()-2);
                                    int y2 = 1 + (int)(Math.random() * ((2 - 1) + 1));
                                    if(y2==1){
                                        System.out.println(first+"-");
                                    }
                                    if(y2==2){
                                        System.out.println("-"+last);
                                    }
                                }
                                else if(hint==0){
                                }
                                else{
                                    while(true){
                                        System.out.println("number entered is not serviceable, please re-enter value.");
                                        hint = scan.nextInt();
                                        if(hint==1){
                                            String first = arrjapcom1.get(y1).substring(0,2);
                                            String last = arrjapcom1.get(y1).substring(arrjapcom1.get(y1).length()-2);
                                            int y2 = 1 + (int)(Math.random() * ((2 - 1) + 1));
                                            if(y2==1){
                                                System.out.println(first+"-");
                                            }
                                            if(y2==2){
                                                System.out.println("-"+last);
                                            }
                                            break;
                                        }
                                        else if(hint==0){
                                            break;
                                        }
                                    }
                                }
                            }

                            System.out.println("Want to see the japanese translation? 1 to view, 0 to continue");
                            while (true) {
                                int choice2 = scan.nextInt();
                                if (choice2 == 0) {
                                    break;
                                } else if (choice2 == 1) {
                                    System.out.println("japanese translation: " + arrjapcom1.get(y1));
                                    break;
                                } else {
                                    System.out.println("number entered is not serviceable, please re-enter value.");
                                }
                            }
                            while (true) {
                                System.out.println("\nwanna go again?\nenter 1 to repeat.\nenter 2 to go to Sub-Mode Select.\nenter 3 to go to Mode Select.\nenter 4 to end program.\nenter 5 for quick list display.");
                                int choice3 = scan.nextInt();
                                if (choice3 == 1) {
                                    break;
                                } else if (choice3 == 2) {
                                    Database.hiraganajap1.clear();
                                    Database.hiraganaeng1.clear();
                                    Database.hiraganasyl1.clear();
                                    logic.seriesarreng1.clear();
                                    logic.seriesarrjap1.clear();
                                    gcheck3 = false;
                                    break;
                                } else if (choice3 == 3) {
                                    Database.hiraganajap1.clear();
                                    Database.hiraganaeng1.clear();
                                    Database.hiraganasyl1.clear();
                                    logic.seriesarreng1.clear();
                                    logic.seriesarrjap1.clear();
                                    gcheck4 = false;
                                    break;
                                } else if (choice3 == 4) {
                                    System.exit(0);
                                } else if (choice3 == 5){
                                    for(int u=0;u<arrjapcom1.size()-1;u++){
                                        System.out.println(arrjapcom1.get(u)+" - "+arrcom1.get(u));
                                    }
                                } else {
                                    System.out.println("number entered is not serviceable, please re-enter value.");
                                }
                            }
                            if(gcheck3==false||gcheck4==false){
                                break;
                            }
                        }
                    }
                    if(gcheck4==false){
                        arrcom1.clear();
                        arrjapcom1.clear();
                        token1++;
                        break;
                    }
                    arrcom1.clear();
                    arrjapcom1.clear();
                }

            } else if (x == 5){
                System.exit(0);
            } else {
                System.out.println("Try again, program will reset if input is unserviceable");
                token1++;
            }
        }
    }
}
