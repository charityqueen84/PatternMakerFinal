package com.company;
import java.util.ArrayList;
public class TapestryController {

    public static void main(String[] args) {


        ArrayList<Pattern> patternLog = new ArrayList<>();

        Pattern newPattern = new CrossStitchWigglePattern();
        patternLog.add(newPattern);

        Pattern zzlp = new ZigZagLinesPattern();
        patternLog.add(zzlp);


        Pattern bbp = new BaublePattern();
        patternLog.add(bbp);

        Pattern bbp2 = new BlockyBaublePattern();
        patternLog.add(bbp2);


        for (int i = 0; i < patternLog.size(); i++) {
            for (int j = 0; j < 24; j++) {
                if (j % 8 == 0) {
                    System.out.println(" ");
                }
                patternLog.get(i).pattern();
            }
        }
        System.out.println(" ");
        System.out.println(" ");

        for (int i =0; i < patternLog.size(); i++ ){
            for (int j =0; j < 48; j++) {
                if (j % 6 == 0) {
                    System.out.println(" ");
                }
                patternLog.get(i).pattern();
            }
        }

    }
}


