public class Main {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();
        System.out.println("\n Basic Computer:");
        basicComputer.displayConfig();

        Computer gamingComputer = new Computer.Builder("AMD Ryzen 9", "32GB")
            .setGraphicsCard("NVIDIA RTX 4080")
            .setStorage("1TB SSD")
            .setKeyboard("Mechanical RGB Keyboard")
            .setMonitor("27-inch 4K Monitor")
            .build();
        System.out.println("\n Gaming Computer:");
        gamingComputer.displayConfig();

        Computer wfhComputer = new Computer.Builder("Intel i7", "16GB")
            .setStorage("512GB SSD")
            .setKeyboard("Wireless Keyboard")
            .build();
        System.out.println("\n Work From Home Computer:");
        wfhComputer.displayConfig();
    }
}
