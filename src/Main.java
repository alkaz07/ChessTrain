//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> в поле.
static void main() {
    ChessFigure[] figures =  {
            new ChessFigure("pawn", "white"),
            new ChessFigure("pawn", "white"),
            new ChessFigure("pawn", "white"),
            new ChessFigure("pawn", "white"),
            new ChessFigure("pawn", "white"),
            new ChessFigure("pawn", "white"),
            new ChessFigure("pawn", "black"),
            new ChessFigure("pawn", "black"),
            new ChessFigure("king", "white"),
            new ChessFigure("king", "black")
    } ;

    int countBlack = countByColor(figures, "black");
    int countWhite = countByColor(figures, "white");

    System.out.println("countBlack = " + countBlack);
    System.out.println("countWhite = " + countWhite);
    
//    double percentBlack = (double) countBlack / figures.length * 100;
    double percentBlack = countPercentByColor(figures, "black");
    System.out.println("percentBlack = " + percentBlack);
    System.out.println("percentWhite = " + countPercentByColor(figures, "white"));

    System.out.println("count Pawns = " + countByName(figures, "pawn"));
    System.out.println("count Knights = " + countByName(figures, "knight"));
}

static int countByColor(ChessFigure[] figures, String color) {
    int result = 0;
    for (ChessFigure fig: figures){
        if (fig.color.equalsIgnoreCase(color))
            result++;
    }
    return result;
}

static double countPercentByColor(ChessFigure[] figures, String color){
    return (double) countByColor(figures, color) / figures.length * 100;
}

static int countByName(ChessFigure[] figures, String name) {
    long x = Arrays.stream(figures)
                    .filter(f -> f.name.equals(name))
                    .count();
    return Math.toIntExact(x);
}