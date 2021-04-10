package org.goiteens;
import java.util.*;
public class ChatBot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String botAnswer = process(message);
        System.out.println(botAnswer);
    }
    public static String process(String message) {
        Random random = new Random();
        List<String> greetings = new ArrayList<>(
                Arrays.asList(
                        "Я Гусь ой Гусейн Гасанов ака Скамер",
                        "привет",
                        "здравствуй" ,
                        "нет" ,
                        "тест",
                        "bune zima",
                        "прив ботяра" ,
                        "хай"
                )
        );
        if (isHelloMessage(message)== true) {
            String botName = "ChatBot";
            int index = random.nextInt(greetings.size());
            String greeting = greetings.get(index);
            return greeting + " aka " + botName + "\uD83E\uDD16";
        }
            return "Ти окунь?";
        }

    public static int find(String message, Map<String, Integer> data) {
        message = message.toLowerCase();

        for(String word: data.keySet()) {
            String lowerCasedWord = word.toLowerCase();

            if (message.contains(lowerCasedWord)) {
                return data.get(word);
            }
        }
        return -1;
    }
    public static int calculateMonthCount(int dreamCost, int professionSalary) {
        int monthCount = dreamCost / professionSalary;
        monthCount = validateMonthCount(monthCount);
        return monthCount;
    }
    public static int validateMonthCount(int monthCount) {
        if (monthCount == 0) {
            return 1;
        }
        return monthCount;
    }
    private static boolean isHelloMessage(String message) {
        message = message.toLowerCase();
        List<String> list = new ArrayList<>(
                Arrays.asList(
                        "привет",
                         "здравствуй" ,
                         "нет" ,
                        "тест",
                         "bune zima",
                         "прив ботяра" ,
                        "хай"
                )
        );

        return list.contains(message);
        //return message.contains(helloWord1) || message.contains(helloWord2) || message.contains(helloWord3) || message.contains(helloWord4) || message.contains(helloWord5) || message.contains(helloWord6);
    }
}
