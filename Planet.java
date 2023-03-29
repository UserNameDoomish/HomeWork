public class Planet {
    public static void main(String[] args) {
        // 10 boolean parameters to check for planet safety
        boolean hasOxygen = true;
        boolean hasWater = true;
        boolean hasMagneticField = true;
        boolean hasStableClimate = true;
        boolean hasLowLevelOfRadiation = true;
        boolean noActiveVolcanoes = true;
        boolean noTectonicActivity = true;
        boolean noAsteroidThreat = true;
        boolean noAlienInvasions = true;
        boolean noNuclearWar = true;

        // Using logical operators to determine if the planet is safe
        boolean isPlanetSafe = (hasOxygen && hasWater && hasMagneticField && hasStableClimate &&
                hasLowLevelOfRadiation && noActiveVolcanoes && noTectonicActivity &&
                noAsteroidThreat && noAlienInvasions && noNuclearWar);

        // Printing the result
        System.out.println("Is the planet safe? " + isPlanetSafe);
    }
}
