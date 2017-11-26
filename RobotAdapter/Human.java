public class Human implements Spieler
{
    int positionX = 0;
    int positionY = 0;
    
    public Human()
    {
    	
    	Robot r = new Robot();
    //
    	// die java datei aus dem git lässt sich bei mir nicht richtig testen, 
    	//es gibt den fehler This compilation unit is not on the build path of a Java Project :
    }

    public int geheNachLinks(int distanz) {
        this.positionX -= distanz;
        return this.positionX;
    }
    
    public int geheNachRechts(int distanz) {
        this.positionX += distanz;
        return this.positionX;
    }
    
    public int geheNachOben(int distanz) {
        this.positionY += distanz;
        return this.positionY;
    }
    
    public int geheNachUnten(int distanz) {
        this.positionY += distanz;
        return this.positionY;
    }
    
    public String getName() {
        return this.toString();
    }
}
