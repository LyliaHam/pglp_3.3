import java.util.List;

public class Terrain {

private int longueur;
private int largeur;

Terrain( int largeur, int longeur) {
this.longueur = longeur;
this.largeur = largeur;
}

private List<RobotS> listeRobotS;

public void avancerRobots() {
	for (RobotS robotS : listeRobotS) {
		robotS.avancer();
}
}
}
