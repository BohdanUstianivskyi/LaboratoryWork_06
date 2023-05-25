public class Phone {
        private String number;
        private String model;
        private double weight;

        public Phone() {
            // Default constructor
        }

        public Phone(String number, String model, double weight) {
            this.number = number;
            this.model = model;
            this.weight = weight;
        }

        public Phone(String number, String model) {
            this.number = number;
            this.model = model;
        }

        public void receiveCall(String callerName) {
            System.out.println("Incoming call from " + callerName);
        }

        public void receiveCall(String callerName, String callerNumber) {
            System.out.println("Incoming call from " + callerName + " (" + callerNumber + ")");
        }

        public void sendMessage(String... numbers) {
            System.out.println("Sending message to the following numbers:");
            for (String number : numbers) {
                System.out.println(number);
            }
        }

        public static void main(String[] args) {
            Phone phone1 = new Phone("+0964533370", "Poco M3 PRO", 0.2);
            Phone phone2 = new Phone("+0632345678", "Xiaomi Redmi 7", 0.23);
            Phone phone3 = new Phone("+0987654321", "Samsung Galaxy S20" ,0.25);

            System.out.println("Phone 1:");
            System.out.println("Number: " + phone1.number);
            System.out.println("Model: " + phone1.model);
            System.out.println("Weight: " + phone1.weight);

            System.out.println("Phone 2:");
            System.out.println("Number: " + phone2.number);
            System.out.println("Model: " + phone2.model);
            System.out.println("Weight: " + phone2.weight);

            System.out.println("Phone 3:");
            System.out.println("Number: " + phone3.number);
            System.out.println("Model: " + phone3.model);
            System.out.println("Weight: " + phone3.weight);

            phone1.receiveCall("Vasyl Venchenko", "+0987654321");
            phone2.receiveCall("Taras Ginda", "+0632345678");

            phone3.sendMessage("+0964533370", "+0632345678", "+0987654321");
        }
    }


