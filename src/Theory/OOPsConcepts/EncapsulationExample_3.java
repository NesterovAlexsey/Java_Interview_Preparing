package Theory.OOPsConcepts;

public class EncapsulationExample_3 {
    /**
     * Q: Write a code snippet that demonstrates encapsulation.
     *
     * A:
     * Encapsulation meaning to keeping the data and the code that
     * operates on the data together as a single unit. Simply creating a
     * class with private fields and public getter/setter methods is an
     * example of encapsulation.
     */
    public class Laptop {
        private String memory;
        public String getMemory() {
            return memory;
        }
        public String setMemory(String newMemory) {
            return this.memory = newMemory;
        }
    }
}
