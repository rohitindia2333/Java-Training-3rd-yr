public class trafic_light {
        public static void main(String[] args) {
            String currentState = "Red";
    
            System.out.println("Traffic Light Simulation:");
            System.out.println("Current State: " + currentState);
    
            for (int i = 0; i < 10; i++) {
                switch (currentState) {
                    case "Red":
                        System.out.println("Changing to Yellow...");
                        currentState = "Yellow";
                        break;
                    case "Yellow":
                        System.out.println("Changing to Green...");
                        currentState = "Green";
                        break;
                    case "Green":
                        System.out.println("Changing to Red...");
                        currentState = "Red";
                        break;
                    default:
                        System.out.println("Invalid state.");
                }
    
                // Delay for 1 second to simulate time passing
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
    
                System.out.println("Current State: " + currentState);
            }
        }
    }
    
