package dev.ele;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        List<Card> deck = Card.getStandardDeck();
//        Card.printDeck(deck);

        Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART, 'A');
        Arrays.fill(cardArray,aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray), "Aces of Hearts",1);

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards,aceOfHearts);
        System.out.println(cards);
        System.out.println("cards.size() =  " + cards.size());


        List<Card> acesOfHearts  = Collections.nCopies(13, aceOfHearts);
        Card.printDeck(acesOfHearts,"Aces of Hearts", 1);

        Card kingsOfClub = Card.getFaceCard(Card.Suit.CLUB, 'K');
        List<Card> kingOfClubs = Collections.nCopies(13,kingsOfClub);
        Card.printDeck(kingOfClubs,"Kings of Clubs",1);

        List<String> strings = new ArrayList<>();
        Collections.nCopies(10,"*");
        System.out.println(strings);

        Collections.addAll(cards,cardArray);
        Card.printDeck(cards,"Card Collection with Aces added",1);
//        Collections.copy(cards, kingOfClubs);
//        Card.printDeck(cards, "Kings card collection",1);
        Collections.addAll(cards,cardArray);
        Card.printDeck(cards,"Card Collection with Aces added",2);

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Collections.shuffle(deck);
        Card.printDeck(deck,"Shuffled Deck",4);

        Collections.reverse(deck);
        Card.printDeck(deck,"Shuffled Deck",4);

        var sortingAlgorithem = Comparator.comparing(Card::rank).thenComparing(Card::suit);

    }

}
