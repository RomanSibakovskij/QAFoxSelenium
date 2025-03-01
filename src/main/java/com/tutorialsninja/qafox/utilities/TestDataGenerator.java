package com.tutorialsninja.qafox.utilities;

import org.openqa.selenium.*;
import java.security.SecureRandom;
import java.util.*;

public class TestDataGenerator extends BasePage{

    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()_+-=[]{}|;:,.<>?";

    private static final Random RANDOM = new SecureRandom();

    private static String storedFirstName;
    private static String storedLastName;
    private static String emailAddress;
    private static String password;

    public TestDataGenerator(WebDriver driver) {super(driver);}

    // first names array
    private static final String[] firstNames = {
            "Aiden", "Liam", "Noah", "Elijah", "Lucas", "Mason", "Ethan", "James", "Benjamin", "Jack",
            "Henry", "Alexander", "Jackson", "Sebastian", "Owen", "Matthew", "William", "Joseph", "Luke", "Daniel",
            "Logan", "David", "Samuel", "John", "Ryan", "Leo", "Nathan", "Isaac", "Joshua", "Caleb",
            "Olivia", "Emma", "Ava", "Sophia", "Isabella", "Mia", "Amelia", "Harper", "Evelyn", "Abigail",
            "Ella", "Avery", "Scarlett", "Grace", "Lily", "Chloe", "Zoey", "Penelope", "Hannah", "Aria",
            "Ellie", "Madison", "Nora", "Riley", "Lillian", "Paisley", "Aurora", "Addison", "Brooklyn", "Leah",
            "Savannah", "Sofia", "Lucy", "Victoria", "Willow", "Violet", "Zoe", "Stella", "Hazel", "Emilia",
            "Claire", "Bella", "Maya", "Elena", "Piper", "Ariana", "Ruby", "Madelyn", "Alice", "Skylar",
            "Hunter", "Andrew", "Connor", "Carter", "Eli", "Wyatt", "Dylan", "Grayson", "Landon", "Gabriel",
            "Jayden", "Anthony", "Christian", "Julian", "Aaron", "Dominic", "Adam", "Evan", "Nicholas", "Isaiah"
    };

    //last names array
    private static final String[] lastNames = {
            "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor",
            "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson",
            "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", "King", "Wright",
            "Scott", "Torres", "Nguyen", "Hill", "Flores", "Green", "Adams", "Nelson", "Baker", "Gonzalez",
            "Carter", "Mitchell", "Perez", "Roberts", "Turner", "Phillips", "Campbell", "Parker", "Evans", "Edwards",
            "Collins", "Stewart", "Sanchez", "Morris", "Rogers", "Reed", "Cook", "Morgan", "Bell", "Murphy",
            "Bailey", "Rivera", "Cooper", "Richardson", "Cox", "Howard", "Ward", "Torres", "Peterson", "Gray",
            "Ramirez", "James", "Watson", "Brooks", "Kelly", "Sanders", "Price", "Bennett", "Wood", "Barnes",
            "Ross", "Henderson", "Coleman", "Jenkins", "Perry", "Powell", "Long", "Patterson", "Hughes", "Flores",
            "Washington", "Butler", "Simmons", "Foster", "Gonzales", "Bryant", "Alexander", "Russell", "Griffin", "Diaz",
            "Hayes", "Myers", "Ford", "Hamilton", "Graham", "Sullivan", "Wallace", "Woods", "Cole", "West",
            "Jordan", "Owens", "Reynolds", "Fisher", "Ellis", "Harrison", "Gibson", "McDonald", "Cruz", "Marshall"
    };

    // array of Illinois state cities
    private static final String[] ILLINOIS_CITIES = {
            "Chicago", "Aurora", "Naperville", "Joliet", "Rockford", "Springfield",
            "Elgin", "Peoria", "Champaign", "Waukegan", "Cicero", "Bloomington",
            "Arlington Heights", "Evanston", "Decatur", "Schaumburg", "Bolingbrook",
            "Palatine", "Skokie", "Des Plaines", "Orland Park", "Tinley Park",
            "Oak Lawn", "Berwyn", "Mount Prospect", "Normal", "Wheaton", "Hoffman Estates",
            "Oak Park", "Downers Grove", "Elmhurst", "Glenview", "DeKalb", "Lombard",
            "Moline", "Buffalo Grove", "Bartlett", "Urbana", "Crystal Lake", "Quincy",
            "Streamwood", "Carol Stream", "Romeoville", "Plainfield", "Hanover Park",
            "Carpentersville", "Wheeling", "Park Ridge", "Addison", "Calumet City"
    };

    //reviews text array
    private static final String[] REVIEWS_TEXTS = {
            "Amazing product, highly recommend it to everyone.", "Not worth the price, very disappointed in the quality.", "Exceeded my expectations in every possible way!", "Decent, but there are better options available right now.", "The quality is top-notch, would definitely buy again.", "Terrible customer service, avoid this brand at all costs.", "Fast shipping and excellent packaging, very satisfied!", "Item arrived damaged, very disappointed with this order.", "Great value for the money, definitely worth considering.", "A bit expensive but works well for my daily needs.", "Five stars! Absolutely love it, would purchase again.", "Poorly made, broke within a week, not worth the money.", "Solid performance, no issues so far, meets expectations.", "Customer support was very helpful and solved my issue.", "Took too long to arrive, but the product is decent overall.",
            "Looks great but doesn’t perform well, not worth it.", "Would definitely recommend to friends who need this.", "Mediocre at best, not impressed with the quality.", "Very easy to use and set up, good for beginners.", "Stopped working after a month, very disappointing.", "I’m extremely satisfied with my purchase, works great!", "Disappointed, didn’t meet my expectations in any way.", "Superb craftsmanship, worth every penny I spent.", "It’s okay, but not as good as advertised on the page.", "Fantastic! I use it every day and absolutely love it.",
            "Not as described, misleading product page, avoid it.", "Highly durable and well-built, should last for years.", "Arrived late but works great, happy with the purchase.", "The design is sleek and modern, fits my aesthetic.", "Does the job but nothing special, expected more.", "Would buy again in a heartbeat, highly recommend it!", "Save your money, not worth it compared to others.", "Performs better than expected, very satisfied!", "Not user-friendly, confusing setup, frustrating.", "Exactly what I was looking for, meets all my needs!", "Flimsy and cheap, very disappointed with the quality.", "Great gift idea, my friend loved it and uses it often.", "Better than the competitors, great value for the price.", "Looks good but has serious flaws, needs improvement.",
            "Outstanding product, I love it, highly recommended!", "Waste of money, returning it, not what I expected.", "Incredible features for the price, exceeded expectations.", "Just okay, wouldn’t buy again, lacks quality.", "Customer support was unhelpful, very frustrating.", "Perfect for my needs, very satisfied with the quality.", "The instructions were hard to follow, confusing setup.", "I can’t believe how good this is, worth every penny!", "The worst purchase I’ve ever made, not worth the cost.", "Much better than expected, happy with my decision!", "Would rate higher if it was cheaper, a bit overpriced.", "The battery life is terrible, barely lasts the day.", "Super convenient and easy to use, love the design.",
            "Received the wrong item, frustrating experience.", "Works like a charm, highly recommend to everyone!", "It’s just average, nothing special, lacks key features.", "So many features for the price, great value overall!", "Had high hopes, but it let me down in every way.", "Packaging was damaged on arrival, very disappointing.", "My go-to brand, never disappoints, always reliable.", "Not very durable, broke too soon after minimal use.", "Exactly as described, no complaints at all.", "Too complicated for my taste, needs a simpler setup.", "Perfect for beginners, easy setup, hassle-free use.", "Terrible quality, do not buy, absolute waste of money.", "I’m beyond happy with this purchase, love it!", "Sound quality is amazing, perfect for my needs!", "Difficult to assemble, frustrating experience overall.",
            "Lightweight and easy to carry, great portability.", "Pricey but worth it in the long run, great investment.", "Feels cheap, expected better quality for this price.", "Arrived earlier than expected, very happy with it.", "Extremely reliable, no issues so far, great product!", "Looks better in the pictures, not as good in person.", "Best purchase I’ve made this year, totally worth it!", "Broke after minimal use, not durable at all.", "Smooth and efficient performance, meets expectations.", "False advertising, doesn’t do what it claims to do.", "Absolutely love the design, looks fantastic!", "Lifesaver, I use it every day and love it!", "Glitches too often, not reliable, needs improvements.", "Decent but could be improved, lacks some features.",
            "My whole family enjoys using it, great for all.", "Too small for what I needed, not ideal for me.", "Amazing customer support, very helpful and friendly.", "Disappointing experience, will not repurchase this.", "Super durable, even after heavy use, built to last.", "Not what I expected, but still okay, works decently.", "Great product but overpriced, should be cheaper.", "Unbelievably good, I’m shocked by the quality!", "Regret buying this, poor quality, not recommended.", "Performs well under heavy use, reliable and sturdy.", "Didn’t work out of the box, had to return it.", "Very stylish, love the look and the feel of it.", "Exactly what I needed, perfect for my setup!", "Returning it, not what I wanted, disappointed.", "Fantastic experience from start to finish, loved it!", "Poor construction, already falling apart, not good.", "Skeptical at first, but it’s amazing, great buy.", "The best in its category, hands down, highly rated.", "Not functional for what I needed, lacks key features.", "I tell everyone about this, it’s that good, a must-have!"
    };

    //Illinois street types array
    private static final String[] STREET_TYPES = {"St.", "Ave.", "Blvd.", "Rd.", "Ln.", "Dr.", "Ct.", "Pl."};

    //random first name picker method
    public static String getRandomFirstName() {
        if (storedFirstName == null) {
            Random random = new Random();
            storedFirstName = firstNames[random.nextInt(firstNames.length)];
        }
        return storedFirstName;
    }
    //random last name picker method
    public static String getRandomLastName() {
        if (storedLastName == null) {
            Random random = new Random();
            storedLastName = lastNames[random.nextInt(lastNames.length)];
        }
        return storedLastName;
    }

    //generate random string methods
    private static String generateRandomString(String characters, int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    private static String shuffleString(String string) {
        List<String> letters = Arrays.asList(string.split(""));
        Collections.shuffle(letters);
        return String.join("", letters);
    }


    //string generator methods
    private static String generateRandomNumberString(int length) {return generateRandomString(DIGITS, length);}

    private static String generateRandomSpecialString(int length) {return generateRandomString(SPECIAL, length);}

    //random email generator
    public static String generateRandomEmailAddress(int length) {
        String emailAddress = generateRandomString(UPPER + LOWER, length);
        char randomChar;
        Random rand = new Random();
        //generate random character that asserts uniqueness
        if (rand.nextBoolean()) {
            randomChar = (char) ('A' + rand.nextInt(26)); //uppercase A-Z
        } else {
            randomChar = (char) ('a' + rand.nextInt(26)); //lowercase a-z
        }
        return emailAddress + randomChar + "@example.com";
    }

    //random too short email generator
    public static String generateRandomTooShortEmailAddress(int length) {
        String emailAddress = generateRandomString(UPPER + LOWER, length);
        return emailAddress + "@e.com";
    }
    //random too long email generator
    public static String generateRandomTooLongEmailAddress(int length) {
        String emailAddress = generateRandomString(UPPER + LOWER, length);
        return emailAddress + "@esddsadwsdfghfafrujkuykmjnsfdasffdgjmyuhuyujhrgfsfdsgfgjukyyhggfsfdjgkyuoitrtweqeqwetryiydsfgjfgfsag.com";
    }

    //random phone number generator
    public static String generatePhoneNumber(int length) {
        if (length < 1) {throw new IllegalArgumentException("Phone number length must be at least 1.");}

        Random random = new Random();
        String phoneNumber = "";
        //generate the specified number of random digits
        for (int i = 0; i < length; i++) {
            phoneNumber += random.nextInt(10); //generate a random digit (0-9)
        }
        return phoneNumber;
    }

    //random password generator
    public static String generateRandomPassword() {
        String numbers = "0123456789";
//        String special = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        //fixed password part
        String stokerPart = "Stoker";

        //random numeric sequence
        StringBuilder numericPart = new StringBuilder();
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append('_'); // Static underscore

        //shuffle the numeric part
        String shuffledNumericPart = shuffleString(numericPart.toString());

        //"Stoker" + shuffled numeric part
        StringBuilder password = new StringBuilder();
        password.append(stokerPart);
        password.append(shuffledNumericPart);

        return password.toString();
    }

    //generate a random address with a given length for the street name
    public static String generateRandomAddress(int length) {
        int streetNumber = RANDOM.nextInt(9999) + 1; // street number between 1 and 9999
        String streetName = generateRandomString("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", length);
        String streetType = STREET_TYPES[RANDOM.nextInt(STREET_TYPES.length)];
        return streetNumber + " " + streetName + " " + streetType;
    }

    // cities rnd instance
    private static final Random rndIllinoisCities = new Random();

    // method to get a random city from the array
    public static String getRandomCity() {
        int index = rndIllinoisCities.nextInt(ILLINOIS_CITIES.length);
        return ILLINOIS_CITIES[index];
    }

    // generate random postal code for Illinois
    public static int getRandomPostalCode() {
        return 60000 + RANDOM.nextInt(30000);
    }

    // method to get a random 'Review' text from the array
    public static String getRandomReviewText() {
        Random random = new Random();
        int index = random.nextInt(REVIEWS_TEXTS.length);
        return REVIEWS_TEXTS[index];
    }

}
