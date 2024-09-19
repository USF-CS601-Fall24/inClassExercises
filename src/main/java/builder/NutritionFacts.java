package builder;

/** An exercise on the Builder pattern.
 * Based on the example from Effective Java by Joshua Bloch.
 */
public class NutritionFacts {
    // TODO: Make varibles final
    private int servingSize; //essential
    private int servings; // essential
    private int calories; // optional
    private int fat; // optional
    private int sodium; // optional

    public static class Builder {
        private int servingSize, servings; // essential parameters

        // optional parameters - assigning default values
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;

        /**
         * Constructor for class Builder
         * @param servingSize serving size
         * @param servings number of servings
         */
        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        // TODO: Add setters that return a Builder object

        // TODO: Add a build method
    }

    // TODO: add a constructor that takes Builder


    /**
     * Getter for calories
     * @return calories
     */
    public int getCalories() {
        return calories;
    }

    /**
     * Getter for fat
     * @return fat
     */
    public int getFat() {
        return fat;
    }

    /**
     * Getter for sodium
     * @return sodium
     */
    public int getSodium() {
        return sodium;
    }

    /**
     * Returns a string representation of this object.
     * @return a string representation of this object. The string currently contains only
     * essential variables - feel free to modify to print all instance variables.
     */
    @Override
    public String toString() {
        return "Nutrition Facts (Printing servings and serving size only):" + System.lineSeparator() +
                "servingSize: " + servingSize + " servings: " + servings;

    }
}
