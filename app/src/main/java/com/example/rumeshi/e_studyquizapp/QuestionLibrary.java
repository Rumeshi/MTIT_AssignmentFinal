package com.example.rumeshi.e_studyquizapp;


public class QuestionLibrary {

    private String myQuestions[] = {
            "Which one is not belongs to Android Stack? ",
            "What is correct about Android UI?",
            "XML is converted into _______ and references UI objects via ________",
            "How many primitive types in java? ",
            "What is the latest version in Anroid?",
            "Which are the correct object types in java?",
            "_________ is a logical operator.",
            "The object that stores many values of the same type is ________.",
            "What is correct about Anroid?",
            "We can easily specify width and height with the exact measurement of:",





            "What are the elements in descriptive statistics?",
            "Which is belongs to measures of Dispersion?",
            "Mean is _______ value.Mode is _______ value.",
            "Highest data value take away the lowest is:",
            "Which is correct about Box Plot?",
            "Correlation Coefficient is showing by:",
            "Which are correct about types of graghs?",
            "IQR = Q3 - Q1 is ___________.",
            "What is correct about Lower tail?",
            "Risk management based on :"

            //hansini Questions
            "What is correct about human blood types?",
            "How many cell types in human blood?",
            "The Whale is belongs to:",
            "Some people can't identify ______ and______because of color blindness.",
            "Which part is the most important to identify an object in human body?",
            "Starfish is belongs to:",
            "Snail is belongs to:",
            "How many cells types in our eye?",
            "Fish can breathe from_______.",
            "Keratin is contains in:",


            "What is the longest and widest river in the world?",
            "Which country is famous for opera house?",
            "Which country is famous for Anacondas?",
            "Sir.Ananda Samarakoon is famous for __________ ",
            "Sinharaja is a ________ in __________.",
            "Germany is famous, because of __________.",
            "Italy is famouse for: ",
            "The flower Sakura is blooming in _________.",
            "Mount Himalaya is situated in: ",
            "Coconut tree is mostly growing in_________."


    };


    private String mChoices[][] = {
            {"Linux Kernel","Application Design","C/C++ Libs"},
            {"Process and Dynamic","Progress and Development","Procedural and Declarative"},
            {"R.java class , JAVA code","JAVA code , R.java class","ra.java class , R.java class"},
            {"19", "8", "18"},
            {"NutKat","Nougat","Nut-Jellybean"},
            {"vhar", "Strint", "char"},
            {"&||", "!", "!@!"},
            {"loop", "array", "statement"},
            {"It is not a mobile OS system","Can runs on tabs , radios , phones , TVs , DVDs","Based on Java(dev lan.) and Linux(kernel)"},
            {"wrap_content , match_content","wrap_content , match_parent","wrap_context , match_parent"},




            {"Mean , Modium , Mode","Meanian , Mode , Modium","Mean , Median , Mode"},
            {"Daviance","Radiant","Variance"},
            {"middle , average","average , meadiant","average , middle"},
            {"Variance","Range","Standard Deviation"},
            {"Upper hair","Upper tail","Uper head"},
            {"R","RC","CR"},
            {"Dar chart , Ar chart , Histrogram","Pie chart , Dar chart , Ur chart","Bar chart , Pie chart , Histrogram"},
            {"Inter Quartile Revange","Inter Qaurtile Range","Inter Quality Range"},
            {"Q1 - 1.5 * IQR","Q1 + 1.5 * IQR","Q1 -( 1.5 * IQR)"},
            {"analysis and gathering","analysis and process","analysis and probability"},

            //hansini's choices added

            {"O , ABB", "AB , A+", "O# , O-"},
            {"4", "2", "3"},
            {"Arthropoda", "Piscas", "Mammel"},
            {"Pink & Yellow", "Green & Red", "Red & Black"},
            {"Bones", "Brain", "Lever"},
            {"Echinodermata", "Cylopoda", "Diplopoda"},
            {"Mammalia", "Hungaria", "Mollusca"},
            {"Three", "One", "Two"},
            {"Lungs", "Skin", "Tail"},
            {"Lungs", "Nails", "Nose"},


            {"Amazon", "Nile", "Yangtze"},
            {"America", "Argentina", "Australia"},
            {"South America", "North America", "Africa"},
            {"Indian national anthem", "Sri lankan national anthem", "Mongolian national anthem"},
            {"River , Sri lanka", "Rain forest , Sri Lanka", "Mountain , Argentina"},
            {"Hectar", "Hepler", "Hitler"},
            {"Piscas", "Pissa", "Lissa"},
            {"China", "Korea", "Japan"},
            {"Taiwan", "Igypt", "India"},
            {"Dry sand", "Wet sand", "Soil sand"}



    };

    private String mCorrectAnswers[] = {"Application Design","Procedural and Declarative","JAVA code , R.java class","8", "Nougat","char", "!", "array","Based on Java(dev lan.) and Linux(kernel)","wrap_content , match_parent",
            "Mean , Median , Mode","Variance","average , middle","Range","Upper tail","R","Bar chart , Pie chart , Histrogram","Inter Qaurtile Range","Q1 - 1.5 * IQR","analysis and probability"};


    public String getQuestion(int r) {
        String question = myQuestions[r];
        return question;
    }

    public String getChoice1(int r) {
        String choice0 = mChoices[r][0];
        return choice0;
    }

    public String getChoice2(int r) {
        String choice1 = mChoices[r][1];
        return choice1;
    }

    public String getChoice3(int r) {
        String choice2 = mChoices[r][2];
        return choice2;

    }

    public String getCorrectAnswer(int r){
        String answer = mCorrectAnswers[r];
        return answer;
    }
}
