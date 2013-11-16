package dev.xor.sftd.api.json.wrappers.player.crew;

/**
 * Created with IntelliJ IDEA.
 * User: Troy
 * Date: 16/11/13
 * Time: 10:59 AM
 * To change this template use File | Settings | File Templates.
 */
public class Patch {
    private int symbol;
    private int backgroundColor;
    private int patternColor;
    private int symbolColor;

    public Patch(int symbol, int backgroundColor, int patternColor, int symbolColor) {
        this.symbol = symbol;
        this.backgroundColor = backgroundColor;
        this.patternColor = patternColor;
        this.symbolColor = symbolColor;
    }

    public int getSymbol() {
        return symbol;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public int getPatternColor() {
        return patternColor;
    }

    public int getSymbolColor() {
        return symbolColor;
    }
}
