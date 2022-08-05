package com.sagarkhurana.quizforfun.other;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;

import com.sagarkhurana.quizforfun.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class Utils {

    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

    public static String formatDate(long time){
        SimpleDateFormat formatter = new SimpleDateFormat(Constants.DATE_FORMAT, Locale.getDefault());

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return formatter.format(calendar.getTime());
    }

    public static Map<String,String> getMathQuestions(){
        HashMap<String,String> questions = new HashMap<>();
        questions.put("1+1","2");
        questions.put("2+2","4");
        questions.put("3+3","6");
        questions.put("4+4","8");
        questions.put("5+5","10");
        questions.put("6+6","12");
        questions.put("7+7","14");
        questions.put("8+8","16");
        questions.put("9+9","18");
        questions.put("10+10","20");
        questions.put("11+11","22");
        questions.put("12+12","24");
        questions.put("13+13","26");
        questions.put("14+14","28");
        questions.put("15+15","30");

        return questions;
    }

    public static Map<String,String> getRandomMathQuestions(int SIZE){
        HashMap<String,String> questionsMap = new HashMap<>();
        Map<String,String> originalQuestion = getMathQuestions();
        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }



    public static Map<String,Map<String,Boolean>> getLiteratureQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("Highest Potential Return",true);
        answer1.put("Regular Income And Marginal Capital Appreciation",false);
        answer1.put("Regular Income",false);
        answer1.put("Preservation Of Capital",false);
        questions.put("What factor is most important for you while choosing an investment?",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("Less Than 5%",true);
        answer2.put("5 To 10%",false);
        answer2.put("10 To 20%",false);
        answer2.put("More Than 20%",false);
        questions.put("What percentage of your monthly income can you save?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("20 To 35",true);
        answer3.put("35 To 50",false);
        answer3.put("50 To 60",false);
        answer3.put("Above 60",false);
        questions.put("What is your age group ?",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("Less Than 1 Year",true);
        answer4.put("1 To 3 Years",false);
        answer4.put("3 To 5 Years",false);
        answer4.put("More Than 5 Years",false);
        questions.put("What would be your ideal time horizon for mutual fund investment?",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("Liquid Funds FD, PPF",true);
        answer5.put("Debt Mutual Funds, Bonds",false);
        answer5.put("Shares, Equity Oriented Funds",false);
        answer5.put("Alternate Assets",false);
        questions.put("In which of the following options have you made highest investment till date?",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("Sell Your Investments And Put The Proceeds In Fixed Deposits",true);
        answer6.put("Sell Some Investments And Continue To Hold The Rest\n" +
                "Do Nothing",false);
        answer6.put("Take Advantage Of The Correction And Invest Some More Money",false);
        answer6.put("Sell your investments and put in mutual funds",false);
        questions.put("If your investment make 10% losses next year will you?",answer6);

        return questions;
    }

    public static Map<String,Map<String,Boolean>> getGeographyQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("Mustard",false);
        answer1.put("Linseed",false);
        answer1.put("Groundnut ",true);
        answer1.put("coconut",false);
        questions.put("The scarcity or crop failure of which of the following can cause a serious edible oil crisis in India?",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("old mountains",true);
        answer2.put("young mountains",false);
        answer2.put("fold mountains",false);
        answer2.put("block mountains",false);
        questions.put("The pennines (Europe), Appalachians (America) and the Aravallis (India) are examples of",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("5",false);
        answer3.put("13",true);
        answer3.put("8",false);
        answer3.put("10",false);
        questions.put("The number of major ports in India is",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("Gondak",false);
        answer4.put("Kosi",false);
        answer4.put("Sutlej",false);
        answer4.put("Krishna",true);
        questions.put("Which of the following is a peninsular river of India?",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("1730 hours",false);
        answer5.put("0630 hours",true);
        answer5.put("midnight ,GMT",false);
        answer5.put("None of the above",false);
        questions.put("When it is noon IST at Allahabad in India, the time at Greenwich, London, will be",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("USA",false);
        answer6.put("Canada",true);
        answer6.put("Australia",false);
        answer6.put("India",false);
        questions.put("Which country has the largest coast line?",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("Alluvial soils",true);
        answer7.put("Black soils",false);
        answer7.put("Laterite soils",false);
        answer7.put("Red soils",false);
        questions.put("Which of the following types of soil are mostly confined to river basins and coastal plains of India?",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("USA",true);
        answer8.put("India",false);
        answer8.put("Australia",false);
        answer8.put("France",false);
        questions.put("Which of the following countries leads in the production of aluminium and its products in the world?",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("Coconut",true);
        answer9.put("Cotton",false);
        answer9.put("Sugarcane",false);
        answer9.put("Rice",false);
        questions.put("Which of the following crops is regarded as a plantation crop?",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("33.3%",true);
        answer10.put("30.3%",false);
        answer10.put("38.3%",false);
        answer10.put("42.3%",false);
        questions.put("The proportion of forest to the total national geographical area of India as envisaged by National Forest Policy is",answer10);

        HashMap<String,Boolean> answer11 = new HashMap<>();
        answer11.put("Gandhi Sagar",true);
        answer11.put("Hirakud",false);
        answer11.put("Periyar",false);
        answer11.put("Tungabhadra",false);
        questions.put("Which of the following dams has generations of power more than irrigation as its main purpose?",answer11);

        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("The lease Himalayas and the Indo Gangetic plain",true);
        answer12.put("The foot hills and the Indo Gangetic plain",false);
        answer12.put("The greater Himalayas and the lesser Himalayas",false);
        answer12.put("Indo-Gangetic plains and the peninsula",false);
        questions.put("The outer Himalayas lie between",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("Aravalis",true);
        answer13.put("Vindhyas",false);
        answer13.put("Satpuras",false);
        answer13.put("Nilgiri hills",false);
        questions.put("The oldest mountains in India are",answer13);

        HashMap<String,Boolean> answer14 = new HashMap<>();
        answer14.put("1/6",true);
        answer14.put("1/3",false);
        answer14.put("1/10",false);
        answer14.put("1/50",false);
        questions.put("Approximately what fraction of the world’s population lives in India?",answer14);

        HashMap<String,Boolean> answer15 = new HashMap<>();
        answer15.put("Second",true);
        answer15.put("Third",false);
        answer15.put("Fourth",false);
        answer15.put("Fifth",false);
        questions.put("India has the _________ largest population on Earth",answer15);

        return questions;
    }

    public static Map<String,Map<String,Boolean>> getRandomLiteratureAndGeographyQuestions(Context context, String subject, int SIZE){
        Map<String,Map<String,Boolean>> questionsMap = new HashMap<>();
        Map<String, Map<String, Boolean>> originalQuestion;
        if (subject.equals(context.getString(R.string.geography))){
            originalQuestion = getGeographyQuestions();
        }else{
            originalQuestion = getLiteratureQuestions();
        }

        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }

}
