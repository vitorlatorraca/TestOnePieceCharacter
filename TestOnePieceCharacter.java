public  class TestOnePieceCharacter {
    public static void main(String[] args) {
        //The First Character
        OnePieceCharacter luffy = new OnePieceCharacter("Monkey D. Luffy", 150000000, "Straw Hat Pirates");
        luffy.printCharacter();

        // The second character
        OnePieceCharacter zoro = new OnePieceCharacter("Roronoa Zoro", 320000000, "Straw Hat Pirates");
        zoro.printCharacter();

        // The third character
        OnePieceCharacter blackbeard = new OnePieceCharacter("Marshall D. Teach", 240000000, "Blackbeard Pirates");
        blackbeard.printCharacter();
    }
}
