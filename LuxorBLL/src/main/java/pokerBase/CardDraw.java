package pokerBase;

import java.io.Serializable;

import pokerEnums.eCardCount;
import pokerEnums.eCardDestination;
import pokerEnums.eCardVisibility;


public class CardDraw implements Serializable {
	
	private eCardCount CardPosition;
	private eCardCount CardCount;
	private eCardDestination CardDestination;
	private eCardVisibility CardVisibility;
	private eCardCount CardCountDrawn;
	//,
	//eCardCount cardCountDrawn
	public CardDraw(eCardCount cardPosition, eCardDestination cardDestination, eCardVisibility cardVisibility) {
		super();
		this.CardPosition = cardPosition;
		this.CardDestination = cardDestination;
		this.CardVisibility = cardVisibility;
		//this.CardCountDrawn = cardCountDrawn;
	}
	public eCardCount getCardCount() {
		return CardCount;
	}
	public eCardDestination getCardDestination() {
		return CardDestination;
	}
	public eCardVisibility getCardVisibility() {
		return CardVisibility;
	}
	
	
}
