package testing.kodilla;

class QuestNumberOne implements Questing {

    public String startQuest() {
        return "Welcome to quest number 1";
    }

    public String questContent() {
        return "Content of quest 1";
    }
}

class QuestNumberTwo implements Questing {

    public String startQuest() {
        return "U have selected quest numer 2";
    }

    public String questContent() {
        return "Quest 2";
    }

}

class QuestStarter {

    public String recognizeQuest(Questing questing) {
        return "U have selected: \n" + questing.startQuest() + "\n" + questing.questContent();
    }
}




class Application {

    public static void main(String args[]) {

        QuestStarter quest = new QuestStarter();
        String selectedQuest = quest.recognizeQuest(new QuestNumberOne());
        System.out.println(selectedQuest);

    }
}