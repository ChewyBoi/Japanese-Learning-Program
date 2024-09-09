import java.util.ArrayList;
import java.util.Scanner;

public class logic {
    public static int dec1 = -1;
    public static int tokenvar = 0;
    public static void nlr2(int z, ArrayList<String> arrjap, ArrayList<String> arr, String name, Integer token, int x){
        Scanner scan = new Scanner(System.in);
        int dec = -1;
        StringBuilder currentsyl = new StringBuilder();
        boolean checker = true;
        if(z>arr.size()){
            System.out.println("not enough syllables in list, 3 chances.");
            for(int g=0;g<3;g++){
                z = scan.nextInt();
                if(z<=arr.size()){
                    checker = true;
                    break;
                }
                else{
                    checker = false;
                    if(g==0){
                        System.out.println("Try again.");
                    }
                    else if(g==1){
                        System.out.println("Last chance.");
                    }
                    else if (g==2){
                        System.exit(0);
                    }
                }
            }
        }
        else if(z<1){
            System.out.println("get real "+name+".");
            System.exit(0);
        }
        int counter = 0;
        while(x==2&&checker==true) {
            int y = (int)(Math.random() * (arr.size() - 0)+0);
            String printing = "";
            if(z!=1){
                if(!(counter==z-1)){
                    printing = arr.get(y);
                    System.out.print(printing+"-->");
                    currentsyl.append(arrjap.get(y));
                    counter++;
                }
                else{
                    System.out.print(arr.get(y));
                    counter++;
                    currentsyl.append(arrjap.get(y));
                }
            }
            else if(z==1){
                printing = arr.get(y);
                System.out.print(printing);
                currentsyl.append(arrjap.get(y));
                counter++;
            }
            if(counter==z){
                break;
            }
        }
        System.out.println("\nWant to see the japanese translation? 1 to view, 0 to continue");
        int counter3 = 0;
        int chancenum = 3;
        String plural = "s";
        while(true){
            if (counter3==4){
                System.exit(0);
            }
            int trans = scan.nextInt();
            if(trans==1){
                System.out.println(currentsyl);
                break;
            }
            else if (trans==0){
                break;
            }
            else if(counter3!=3){
                if(counter3==2){
                    plural = "";
                }
                System.out.println("Try again, "+chancenum+" more chance"+plural+".");
            }
            counter3++;
            chancenum--;
        }
        currentsyl = new StringBuilder();
        if(checker==true){
            System.out.println("\nwanna go again?\nenter 3 to go to mode select.\nenter 2 to repeat syllable amt.\nenter 1 to change syllable amt.\nenter 0 to end program.");
            dec = scan.nextInt();
            dec1 = dec;
        }
        int counter2 = 0;
        while(checker==true){
            if(dec==1){
                break;
            }
            else if (dec==0){
                System.exit(0);
            }
            else if(dec==2){
                while(dec==2){
                    counter = 0;
                    while(dec==2){
                        int y1 = (int)(Math.random() * (arr.size() - 0)+0);
                        String printing2 = "";
                        if(z!=1){
                            if(!(counter==z-1)){
                                printing2 = arr.get(y1);
                                System.out.print(printing2+"-->");
                                counter++;
                                currentsyl.append(arrjap.get(y1));
                            }
                            else{
                                printing2 = arr.get(y1);
                                System.out.print(printing2);
                                currentsyl.append(arrjap.get(y1));
                                break;
                            }
                        }
                        else if(z==1){
                            printing2 = arr.get(y1);
                            System.out.print(printing2);
                            currentsyl.append(arrjap.get(y1));
                            break;
                        }
                    }
                    System.out.println("\nWant to see the japanese translation? 1 to view, 0 to continue");
                    int counter4 = 0;
                    int chancenum2 = 3;
                    String plural2 = "s";
                    while(true){
                        if (counter4== 4){
                            System.exit(0);
                        }
                        int trans = scan.nextInt();
                        if(trans==1){
                            System.out.println(currentsyl);
                            break;
                        }
                        else if (trans==0){
                            break;
                        }
                        else if(counter4!=3){
                            if(counter4==2){
                                plural2 = "";
                            }
                            System.out.println("Try again, "+chancenum2+" more chance"+plural2+".");
                        }
                        counter4++;
                        chancenum2--;
                    }
                    currentsyl = new StringBuilder();
                    System.out.println("\nwanna go again?\nenter 3 to go to mode select.\nenter 2 to repeat syllable amt.\nenter 1 to change syllable amt.\nenter 0 to end program.");
                    dec = scan.nextInt();
                    dec1 = dec;
                    if (dec==2){
                        continue;
                    }
                    else if(dec==0){
                        System.exit(0);
                    }
                    else if(dec==1){
                        break;
                    }
                    else if(dec==3){
                        token++;
                        tokenvar = token;
                        break;
                    }
                }
            }
            else if(dec==3){
                token++;
                tokenvar = token;
            }
            else {
                counter2++;
                if(counter2>0&&counter2<3){
                    System.out.println("Remember\nenter 3 to go to mode select.\nenter 2 to repeat syllable amt.\nenter 1 to change syllable amt.\nenter 0 to end program.");
                    dec = scan.nextInt();
                }
                if(counter2==3){
                    System.out.println("Last chance.\nenter 3 to go to mode select.\nenter 2 to repeat syllable amt.\nenter 1 to change syllable amt.\nenter 0 to end program.");
                    dec = scan.nextInt();
                }
                if(counter2==4){
                    System.out.println("ending.");
                    System.exit(0);
                }
            }
            if(dec==3){
                break;
            }
        }
    }
    //word constructor
    public static ArrayList<String> seriesarreng1 = new ArrayList();
    public static ArrayList<String> seriesarrjap1 = new ArrayList();
    //series
    public static ArrayList<String> seriesarreng = new ArrayList();
    public static ArrayList<String> seriesarrjap = new ArrayList();
    //master
    public static ArrayList<String> seriesarrengmaster = new ArrayList();
    public static ArrayList<String> seriesarrjapmaster = new ArrayList();

    public static void seriesselection(String[] arreng, String[] arrjap, ArrayList<String> listeng, ArrayList<String> listjap){
        Scanner scan = new Scanner(System.in);
       while(true){
           boolean mask = true;
           System.out.println("consonant n(hiragana) is automatically added, if any katakana series are chosen, consonant n(katakana) will be added.\nHiragana Selection:\n0 - All Hiragana:\n1 - a series\n2 - k series\n3 - s series\n4 - t series\n5 - n series\n6 - h series\n7 - m series\n8 - y series\n9 - r series\n10 - w series");
           System.out.println("Katakana Selection[Katakana syllables will be marked with an Asterisk(*)]:\n11 - All Katakana\n12 - a series\n13 - k series\n14 - s series\n15 - t series\n16 - n series\n17 - h series\n18 - m series\n19 - y series\nSeparate numbers using commas");
           boolean[] testvar =  new boolean[20];
           for(int testrun=0;testrun<testvar.length;testrun++){
               testvar[testrun] = true;
           }
           String test = scan.nextLine();
           String num = "";
           for(int run2=0;run2<test.length();run2++){
               if(!(test.substring(run2,run2+1).equals(","))){
                   num+=test.substring(run2,run2+1);
               }
               if(run2<test.length()-1&&(test.substring(run2+1,run2+2).equals(",")||test.substring(run2+1,run2+2).equals(" "))){
                   if(Integer.parseInt(num)<0||Integer.parseInt(num)>testvar.length-1){
                       mask = false;
                   }
               }
               if(run2==test.length()-1){
                   if(Integer.parseInt(num)<0||Integer.parseInt(num)>testvar.length-1){
                       mask = false;
                   }
               }
               if(run2<test.length()-1&&(test.substring(run2+1,run2+2).equals(",")||test.substring(run2+1,run2+2).equals(" "))){
                   num = "";

               }
           }
           if(mask==false){
               System.out.println("One or more of the numbers entered are not serviceable, please re-enter values.");
               continue;
           }
           String breakrun = "";
           boolean ncheck = false;
           listeng.add(arreng[70]);
           listjap.add(arrjap[70]);
           for(int run = 0;run<test.length();run++){
               breakrun += test.substring(run, run+1);
               if(run!=test.length()-1){
                   if(!(test.substring(run+1,run+2).equals(","))&&!(test.substring(run,run+1).equals(","))){
                       continue;
                   }
               }
               if(breakrun.equals("0") && (testvar[0] == true)){
                       for(int aseries=0;aseries<70;aseries++){
                           listeng.add(arreng[aseries]);
                           listjap.add(arrjap[aseries]);
                       }
                       for(int cr=1;cr<11;cr++){
                           testvar[cr] = false;
                       }
               }
               if(breakrun.equals("1")&& (testvar[1]==true)){
                   for(int aseries=0;aseries<5;aseries++){
                       listeng.add(arreng[aseries]);
                       listjap.add(arrjap[aseries]);
                   }
                   testvar[1] = false;
               }
               if(breakrun.equals("2")&&(testvar[2]==true)){
                   for(int aseries=5;aseries<15;aseries++){
                       listeng.add(arreng[aseries]);
                       listjap.add(arrjap[aseries]);
                   }
                   testvar[2] = false;
               }
               if(breakrun.equals("3")&&(testvar[3]==true)){
                   for(int aseries=15;aseries<25;aseries++){
                       listeng.add(arreng[aseries]);
                       listjap.add(arrjap[aseries]);
                   }
                   testvar[3] = false;
               }
               if(breakrun.equals("4")&&(testvar[4]==true)){
                   for(int aseries=25;aseries<35;aseries++){
                       listeng.add(arreng[aseries]);
                       listjap.add(arrjap[aseries]);
                   }
                   testvar[4] = false;
               }
               if(breakrun.equals("5")&&(testvar[5]==true)){
                   for(int aseries=35;aseries<40;aseries++){
                       listeng.add(arreng[aseries]);
                       listjap.add(arrjap[aseries]);
                   }
                   testvar[5] = false;
               }
               if(breakrun.equals("6")&&(testvar[6]==true)){
                   for(int aseries=40;aseries<55;aseries++){
                       listeng.add(arreng[aseries]);
                       listjap.add(arrjap[aseries]);
                   }
                   testvar[6] = false;
               }
               if(breakrun.equals("7")&&(testvar[7]==true)){
                   for(int aseries=55;aseries<60;aseries++){
                       listeng.add(arreng[aseries]);
                       listjap.add(arrjap[aseries]);
                   }
                   testvar[7] = false;
               }
               if(breakrun.equals("8")&&(testvar[8]==true)){
                   for(int aseries=60;aseries<63;aseries++){
                       listeng.add(arreng[aseries]);
                       listjap.add(arrjap[aseries]);
                   }
                   testvar[8] = false;
               }
               if(breakrun.equals("9")&&(testvar[9]==true)){
                   for(int aseries=63;aseries<68;aseries++){
                       listeng.add(arreng[aseries]);
                       listjap.add(arrjap[aseries]);
                   }
                   testvar[9] = false;
               }
               if(breakrun.equals("10")&&(testvar[10]==true)){
                   for(int aseries=68;aseries<70;aseries++){
                       listeng.add(arreng[aseries]);
                       listjap.add(arrjap[aseries]);
                   }
                   testvar[10] = false;
               }
               if(breakrun.equals("11") && (testvar[11] == true)){
                   for(int aseries=71;aseries<arrjap.length;aseries++){
                       if(aseries!=96){
                           listeng.add(arreng[aseries]);
                           listjap.add(arrjap[aseries]);
                       }
                   }
                   for(int cr=11;cr<testvar.length;cr++){
                       testvar[cr] = false;
                   }
                   ncheck = true;
               }
               if(breakrun.equals("12")&&(testvar[12]==true)){
                   for(int aseries=71;aseries<76;aseries++){
                       listeng.add(arreng[aseries]);
                       listjap.add(arrjap[aseries]);
                   }
                   testvar[12] = false;
                   ncheck = true;
               }
               if(breakrun.equals("13")&&(testvar[13]==true)){
                   for(int aseries=76;aseries<86;aseries++){
                       listeng.add(arreng[aseries]);
                       listjap.add(arrjap[aseries]);
                   }
                   testvar[13] = false;
                   ncheck = true;
               }
               if(breakrun.equals("14")&&(testvar[14]==true)){
                   for(int aseries=86;aseries<96;aseries++){
                       listeng.add(arreng[aseries]);
                       listjap.add(arrjap[aseries]);
                   }
                   testvar[14] = false;
                   ncheck = true;
               }
               if(breakrun.equals("15")&&(testvar[15]==true)){
                   for(int aseries=97;aseries<107;aseries++){
                       listeng.add(arreng[aseries]);
                       listjap.add(arrjap[aseries]);
                   }
                   testvar[15] = false;
                   ncheck = true;
               }
               if(breakrun.equals("16")&&(testvar[16]==true)){
                   for(int aseries=107;aseries<112;aseries++){
                       listeng.add(arreng[aseries]);
                       listjap.add(arrjap[aseries]);
                   }
                   testvar[16] = false;
                   ncheck = true;
               }
               if(breakrun.equals("17")&&(testvar[17]==true)){
                   for(int aseries=112;aseries<127;aseries++){
                       listeng.add(arreng[aseries]);
                       listjap.add(arrjap[aseries]);
                   }
                   testvar[17] = false;
                   ncheck = true;
               }
               if(breakrun.equals("18")&&(testvar[18]==true)){
                   for(int aseries=127;aseries<132;aseries++){
                       listeng.add(arreng[aseries]);
                       listjap.add(arrjap[aseries]);
                   }
                   testvar[18] = false;
                   ncheck = true;
               }
               if(breakrun.equals("19")&&(testvar[19]==true)){
                   for(int aseries=132;aseries<135;aseries++){
                       listeng.add(arreng[aseries]);
                       listjap.add(arrjap[aseries]);
                   }
                   testvar[19] = false;
                   ncheck = true;
               }
               if(test.substring(run,run+1).equals(",")){
                   breakrun = "";
               }
           }
           if(ncheck==true){
               listeng.add(arreng[96]);
               listjap.add(arrjap[96]);
           }
           ncheck = false;
           System.out.println("Your List:");
           System.out.println("Japanese: "+listjap);
           System.out.println("English: "+listeng+"\n\n\n\n\n\n");
           break;
       }
    }
    public static void seriesselectioncom(String[] arrcom, String[] arrjapcom, ArrayList<String> arrcom1, ArrayList<String> arrjapcom1){
        Scanner scan = new Scanner(System.in);
        for(int y = 0; y<arrjapcom.length;y++){
            System.out.println(y+" - "+arrjapcom[y]+" - "+arrcom[y]);
        }
        System.out.println("Here is a list of all words paired with their designation numbers.\nPlease choose which words you would like to be tested on by typing the number of the starting word, followed by a comma, followed by the number of the ending word.\ne.g:'4,5' or '0,12'.");
        int a=0, b=0;
        String ch = scan.nextLine();
        if(ch.substring(1,2).equals(",")){
            a = Integer.valueOf(ch.substring(0,1));
            b = Integer.valueOf(ch.substring(2));
        }
        else if(ch.substring(2,3).equals(",")){
            a = Integer.valueOf(ch.substring(0,2));
            b = Integer.valueOf(ch.substring(3));
        }
        else if(ch.substring(3,4).equals(",")){
            a = Integer.valueOf(ch.substring(0,3));
            b = Integer.valueOf(ch.substring(4));
        }
        for(int u = a;u <= b;u++){
            arrcom1.add(arrcom[u]);
            arrjapcom1.add(arrjapcom[u]);
        }
    }
}
