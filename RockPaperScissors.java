class RockPaperScissors{
    public static void main(String args[]){
        System.out.println(Config.printRules());
        Player pc = new Player();
        Player npc = new Player();
        pc.setPlayerChoice();
        npc.setNpcChoice();
        int playerCalc = pc.getPlayerChoice();
        int nonPlayerCalc = npc.getNpcChoice();
        System.out.println(Config.printPcChoice(playerCalc));
        System.out.println(Config.printNpcChoice(nonPlayerCalc));
        System.out.println(Config.printOutcome(Config.calculateWinner(playerCalc,nonPlayerCalc)));
    }
}
