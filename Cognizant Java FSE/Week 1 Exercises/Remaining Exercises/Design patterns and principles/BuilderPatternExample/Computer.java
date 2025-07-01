public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String graphicsCard;
    private String keyboard;
    private String monitor;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.keyboard = builder.keyboard;
        this.monitor = builder.monitor;
    }

    public void displayConfig() {
        System.out.println("Computer Config:");
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + (storage != null ? storage : "None"));
        System.out.println("Graphics Card: " + (graphicsCard != null ? graphicsCard : "None"));
        System.out.println("Keyboard: " + (keyboard != null ? keyboard : "None"));
        System.out.println("Monitor: " + (monitor != null ? monitor : "None"));
    }

    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicsCard;
        private String keyboard;
        private String monitor;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder setMonitor(String monitor) {
            this.monitor = monitor;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
