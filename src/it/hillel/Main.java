package it.hillel;

public class Main {

    public static void main(String[] args) {

	String dynasty1 = "Li";
	int warrior1 = 13;
	int bowman1 = 24;
	int rider1 = 46;
    int attack1 = (warrior1 + bowman1 + rider1) * 860;
        System.out.println("Li " + attack1);

	String dynasty2 = "Min";
	int warrior2 = 9;
	int bowman2 = 35;
	int rider2 = 12;
	double attack2 = (warrior2 + bowman2 + rider2) * 860 * 1.5;
		System.out.println("Min " + (int)attack2);

    }
}
